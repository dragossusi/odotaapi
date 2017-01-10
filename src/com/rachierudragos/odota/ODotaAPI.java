package com.rachierudragos.odota;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.rachierudragos.odota.account.AccountDetail;
import com.rachierudragos.odota.account.PlayerFriend;
import com.rachierudragos.odota.account.PlayerRecords;
import com.rachierudragos.odota.filter.MatchFilter;
import com.rachierudragos.odota.hero.HeroDetail;
import com.rachierudragos.odota.match.MatchDetail;
import com.rachierudragos.odota.match.MatchPreview;

public class ODotaAPI {
	private static final String API_HOST = "https://api.opendota.com/api/";
	Gson gson;
	public ODotaAPI() {
		gson = new Gson();
	}
	
	public AccountDetail getPlayer(long id) throws JsonSyntaxException, Exception {
		return gson.fromJson(readUrl(API_HOST + "players/" + id), AccountDetail.class);
	}
	
	public WinLose getWinLose(long id) throws JsonSyntaxException, Exception{return getWinLose(id, new MatchFilter());}
	public WinLose getWinLose(long id, MatchFilter filter) throws JsonSyntaxException, Exception {
		return gson.fromJson(readUrl(API_HOST + "players/" + id + "/wl/" + filter.getFilter()), WinLose.class);
	}

	public List<MatchPreview> getMatches(long id) throws JsonSyntaxException, Exception{return getMatches(id, new MatchFilter());}
	public List<MatchPreview> getMatches(long id, MatchFilter filter) throws JsonSyntaxException, Exception {
		Type listType = new TypeToken<List<MatchPreview>>(){}.getType();
		return gson.fromJson(readUrl(API_HOST + "players/" + id + "/matches/" + filter.getFilter()), listType);
	}

	public List<HeroDetail> getHeroes(long id) throws JsonSyntaxException, Exception{return getHeroes(id, new MatchFilter());}
	public List<HeroDetail> getHeroes(long id, MatchFilter filter) throws JsonSyntaxException, Exception {
		Type listType = new TypeToken<List<HeroDetail>>(){}.getType();
		return gson.fromJson(readUrl(API_HOST + "players/" + id + "/heroes/" + filter.getFilter()), listType);
	}
	
	public List<PlayerFriend> getPeers(long id) throws JsonSyntaxException, Exception {
		Type listType = new TypeToken<List<PlayerFriend>>(){}.getType();
		return gson.fromJson(readUrl(API_HOST + "players/" + id + "/peers/"),listType);
	}
	
	public PlayerRecords getRecords(long id) throws JsonSyntaxException, Exception {
		return gson.fromJson(readUrl(API_HOST + "players/" + id + "/records"),PlayerRecords.class);
	}
	
	public MatchDetail getMatch(long id) throws JsonSyntaxException, Exception {
		return gson.fromJson(readUrl(API_HOST + "matches/" + id), MatchDetail.class);
	}
	
	///util
	private String readUrl(String urlString) throws Exception {
		System.out.println("Requesting " + urlString);
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read); 

	        return buffer.toString();
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}
	public class WinLose{
		public int win;
		public int lose;
	}
}

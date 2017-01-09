package com.rachierudragos.odota.filter;

import java.awt.Checkbox;

public class MatchFilter {
	private String filter;
	public MatchFilter() {
		filter = "";
	}
	public void setLimitTo(int number) {
		check();
		filter += "?limit=" + number;
	}
	public void setOffset(int number){
		check();
		filter += "?offset=" + number;
	}
	public void isWon(boolean yes) {
		check();
		filter += "?win=" + (yes?1:0);
	}
	public void setPatch(int patch) {
		check();
		filter += "?patch=" + patch;
	}
	public void setGameMode(int gamemode) {
		check();
		filter += "?game_mode=" + gamemode;
	}
	public void setLobbyType(int type) {
		check();
		filter += "?lobby_type=" + type;
	}
	public void setRegion(int regionid) {
		check();
		filter += "?region=" + regionid;
	}
	public void setDate(int daysBefore) {
		check();
		filter += "?date=" + daysBefore;
	}
	public void setLaneRole(int role) {
		check();
		filter += "?lane_role=" + role;
	}
	public void setHeroId(int hid) {
		check();
		filter += "?hero_id=" + hid;
	}
	public void isRadiant(Boolean yes) {
		check();
		filter += "?is_radiant=" + (yes?1:0);
	}
	public void withHero(int heroid) {
		check();
		filter += "?with_hero_id=" + heroid;
	}
	
	public String getFilter() {
		// TODO Auto-generated method stub
		return filter;
	}
	private void check() {
		if(!filter.equals(""))
			filter += "&";
	}
}

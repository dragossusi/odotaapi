import java.util.List;

import com.rachierudragos.odota.ODotaAPI;
import com.rachierudragos.odota.filter.MatchFilter;
import com.rachierudragos.odota.hero.HeroDatabase;
import com.rachierudragos.odota.hero.HeroDetail;
import com.rachierudragos.odota.match.MatchDetail;
import com.rachierudragos.odota.match.MatchPreview;

public class Main {
	private static final long ID = 110276393; 
	private static final long MATCH = 2902782827L; 
	public static void main(String args[]) throws Exception {
		ODotaAPI api = new ODotaAPI();
		System.out.println(api.getPlayer(ID).profile.profileurl);
		MatchFilter filter = new MatchFilter();
		filter.isWon(true);
		filter.setLimitTo(3);
		List<MatchPreview> meciuri = api.getMatches(ID, filter);
		List<HeroDetail> heroes = api.getHeroes(ID, new MatchFilter());
		MatchDetail meci = api.getMatch(MATCH);
		System.out.println(HeroDatabase.getHeroName(heroes.get(0).hero_id));
	}
}

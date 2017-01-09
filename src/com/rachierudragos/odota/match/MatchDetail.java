package com.rachierudragos.odota.match;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class MatchDetail {
	public long match_id;
	public int barracks_status_dire;
	public int barracks_status_radiant;
	public List<Chat> chat;
	public int cluster;
	public int dire_score;
	public int duration;
	public int engine;
	public int first_blood_time;
	public int game_mode;
	public int human_players;
	public int leagueid;
	public int lobby_type;
	public int negative_votes;
	public int positive_votes;
	public List<Integer> radiant_gold_adv;
	public int radiant_score;
	public boolean radiant_win;
	public List<Integer> radiant_xp_adv;
	public long start_time;
	public int tower_status_dire;
	public int tower_status_radiant;
	public int version;
	public long replay_salt;
	public int series_id;
	public int series_type;
	public List<Player> players;
	public int patch;
	public int region;
	public Map<String, Integer>all_word_counts;
	public int comeback;
	
	public class Chat{
		public int time;
		public String type;
		public String unit;
		public String key;
		public int slot;
		public int player_slot;
		public int getTime() {
			return time;
		}
		public String getName() {
			return unit;
		}
		public String getMessage() {
			return key;
		}
	}
	
	public class Player{
		public long match_id;
		public int player_slot;
		//ability_upgrades_arr	[19]
		//ability_uses	Object
		public long account_id;
		public Unit additional_units;
		public int assists;
		public int backpack_0;
		public int backpack_1;
		public int backpack_2;
		public int camps_stacked;
		public int creeps_stacked;
		public int deaths;
		public int denies;
		public int gold;
		public int gold_per_min;
		public int gold_spent;
		public int hero_damage;
		public int hero_healing;
		public int hero_id;
		
		public int item_0;
		public int item_1;
		public int item_2;
		public int item_3;
		public int item_4;
		public int item_5;
		
		public List<Integer> getItems() {
			List<Integer> items = new ArrayList<>();
			items.add(item_0);
			items.add(item_1);
			items.add(item_2);
			items.add(item_3);
			items.add(item_4);
			items.add(item_5);
			items.add(backpack_0);
			items.add(backpack_1);
			items.add(backpack_2);
			return items;
		}
		
		public Map<String, Integer>item_uses;
		public Map<Integer, Integer>kill_streaks;
		public Map<String, Integer>killed_by;
		public int kills;
		//kills_log	[17]
		public int last_hits;
		public int leaver_status;
		public int level;
		//max_hero_hit	Object
		public Map<Integer, Integer>multi_kills;
		public int obs_placed;
		public int party_id;
		//permanent_buffs	[]
		public List<PurchaseLog> purchase_log;
		public int rune_pickups;
		public int sen_placed;
		public float stuns;
		public int tower_damage;
		public int xp_per_min;
		public String personaname;
		public Date last_login;
		public boolean radiant_win;
		public long start_time;
		public int duration;
		public int cluster;
		public int lobby_type;
		public int game_mode;
		public int patch;
		public int region;
		public boolean isRadiant;
		public int win;
		public int total_gold;
		public int total_xp;
		public float kills_per_min;
		public float kda;
		public int abandons;
		public int neutral_kills;
		public int tower_kills;
		public int courier_kills;
		public int hero_kills;
		public int roshan_kills;
		public int buyback_count;
		public int lane_efficiency_pct;
		public int lane;
		public int lane_role;
	}
	public class Unit{
		public String unitname;
		public int item_0;
		public int item_1;
		public int item_2;
		public int item_3;
		public int item_4;
		public int item_5;
	}
	public class PurchaseLog{
		public String key;
		public int time;
	}
}

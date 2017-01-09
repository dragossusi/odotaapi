package com.rachierudragos.odota.hero;

public class HeroDatabase {
	public static final String[] idnames={"antimage","axe","bane","bloodseeker","crystal_maiden","drow_ranger","earthshaker",
            "juggernaut","mirana","morphling","nevermore","phantom_lancer","puck","pudge","razor","sand_king","storm_spirit",
            "sven","tiny","vengefulspirit","windrunner","zuus","kunkka","","lina","lion","shadow_shaman","slardar","tidehunter",
            "witch_doctor","lich","riki","enigma","tinker","sniper","necrolyte","warlock","beastmaster","queenofpain","venomancer",
            "faceless_void","skeleton_king","death_prophet","phantom_assassin","pugna","templar_assassin","viper","luna","dragon_knight",
            "dazzle","rattletrap","leshrac","furion","life_stealer","dark_seer","clinkz","omniknight","enchantress","huskar","night_stalker",
            "broodmother","bounty_hunter","weaver","jakiro","batrider","chen","spectre","ancient_apparition","doom_bringer",
            "ursa","spirit_breaker","gyrocopter","alchemist","invoker","silencer","obsidian_destroyer","lycan","brewmaster",
            "shadow_demon","lone_druid","chaos_knight","meepo","treant","ogre_magi","undying","rubick","disruptor","nyx_assassin",
            "naga_siren","keeper_of_the_light","wisp","visage","slark","medusa","troll_warlord","centaur","magnataur","shredder",
            "bristleback","tusk","skywrath_mage","abaddon","elder_titan","legion_commander","techies","ember_spirit","earth_spirit",
            "abyssal_underlord","terrorblade","phoenix","oracle","winter_wyvern","arc_warden","monkey_king"
    };
	public static final String[] names={"Anti-Mage","Axe","Bane","Bloodseeker","Crystal Maiden","Drow Ranger","Earthshaker",
			"Juggernaut","Mirana","Morphling","Shadow Fiend","Phantom Lancer","Puck","Pudge","Razor","Sand King","Storm Spirit",
			"Sven","Tiny","Vengeful Spirit","Windranger","Zeus","Kunkka","","Lina","Lion","Shadow Shaman","Slardar","Tidehunter",
			"Witch Doctor","Lich","Riki","Enigma","Tinker","Sniper","Necrophos","Warlock","Beastmaster","Queen of Pain","Venomancer",
			"Faceless Void","Wraith King","Death Prophet","Phantom Assassin","Pugna","Templar Assassin","Viper","Luna","Dragon Knight",
			"Dazzle","Clockwerk","Leshrac","Nature's Prophet","Lifestealer","Dark Seer","Clinkz","Omniknight","Enchantress","Huskar",
			"Night Stalker","Broodmother","Bounty Hunter","Weaver","Jakiro","Batrider","Chen","Spectre","Ancient Apparition","Doom",
			"Ursa","Spirit Breaker","Gyrocopter","Alchemist","Invoker","Silencer","Outworld Devourer","Lycan","Brewmaster","Shadow Demon",
			"Lone Druid","Chaos Knight","Meepo","Treant Protector","Ogre Magi","Undying","Rubick","Disruptor","Nyx Assassin","Naga Siren",
			"Keeper of the Light","Io","Visage","Slark","Medusa","Troll Warlord","Centaur Warrunner","Magnus","Timbersaw","Bristleback",
			"Tusk","Skywrath Mage","Abaddon","Elder Titan","Legion Commander","Techies","Ember Spirit","Earth Spirit","Underlord","Terrorblade",
			"Phoenix","Oracle","Winter Wyvern","Arc Warden","Monkey King"
    };
    public static String getHeroIdName(int id){
        return idnames[id-1];
    }
    public static String getHeroName(int id) {
    	return names[id-1];
    }
}

# odotaapi
Java parser for Opendota API

Main class is where i test, you can get data from odota using

```java
	ODotaApi api = new ODotaApi;
```

Get matches and herodetails using a filter like this


```java
	MatchFilter filter = new MatchFilter();
	filter.setLimitTo(number);
	List<MatchPreview> meciuri = api.getMatches(accountId, filter);
```

And you can get data from the objects created. For full info about a game use 

```java
	//if you want you can use a filter too
	MatchDetail match = api.getMatch(2902782827L,filter);
```

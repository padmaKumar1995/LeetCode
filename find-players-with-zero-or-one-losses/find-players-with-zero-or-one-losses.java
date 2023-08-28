class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> winners = new HashMap<Integer, Integer>();
        Map<Integer, Integer> losers = new HashMap<Integer, Integer>();
        
        for(int[] match: matches) {
            int winner = match[0];
            int loser = match[1];
            
            winners.putIfAbsent(winner, 0);
            winners.put(winner, winners.get(winner) + 1);
            
            losers.putIfAbsent(loser, 0);
            losers.put(loser, losers.get(loser) + 1);
        }
        
        List<Integer> strictWinners = new ArrayList<>();
        
        for(int winner: winners.keySet()) {
            int lost = losers.getOrDefault(winner, 0);
            if(lost == 0) {
                strictWinners.add(winner);
            }
        }
        
        List<Integer> winnersWithOneLoss = new ArrayList<>();
        
        for(int loser: losers.keySet()) {
            int lost = losers.get(loser);
            if(lost == 1) {
                winnersWithOneLoss.add(loser);
            }
        }
        
        Collections.sort(strictWinners);
        Collections.sort(winnersWithOneLoss);
        
        ans.add(strictWinners);
        ans.add(winnersWithOneLoss);
        
        return ans;
    }
}
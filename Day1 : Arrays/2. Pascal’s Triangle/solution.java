
Apprach 1 :

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
        List<List<Integer>> ans = new ArrayList<>();
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(1);
        
        ans.add(new ArrayList<>(arr1));
        
        if(numRows > 1)
        ans.add(new ArrayList<>(arr2));
        
        ArrayList<Integer> prev = arr2;
        
        for(int i=2 ; i< numRows ; i++)
        {
            ArrayList<Integer> curr = new ArrayList<>();
            
            curr.add(1);
            for(int j=0 ;j<prev.size()-1 ; j++)
            {
                curr.add(prev.get(j)+prev.get(j+1));
            }
            curr.add(1);
            
            ans.add(new ArrayList<>(curr));
            
            prev = curr;
            
        }
        
        
        return ans;
    }
}



Apprach 2 :

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0 ; i<numRows ; i++)
            ans.add(new ArrayList<>());
        
        ans.get(0).add(1);
        
        for(int i=1 ; i<numRows ; i++)
        {
            ans.get(i).add(1);
            
            for(int j=0 ; j<ans.get(i-1).size()-1 ; j++)
            {
                ans.get(i).add(ans.get(i-1).get(j) + ans.get(i-1).get(j+1));
            }
            
            ans.get(i).add(1);
        }
        
        return ans;
        
        
    }
}

package javaSection.Arrays;

public class FrequencyCounter {
	public int[] counter(int limit, int temp[]){
		int count[] = new int[limit];
		for(int i = 0; i < limit; i++){
			int numb = temp[i];
			int countNumber = 1;
			for(int j = i+1; j < limit; j++){
				if(numb == temp[j]){
					countNumber++;
					for(int k = j;k < (limit-1); k++){
						temp[k] = temp[k+1];
					}
					j--;
					limit--;
				}
			}
			count[i] = countNumber;
			System.out.println("Number "+numb+ " has repeated:"+countNumber+" Times");
		}
		
		return count;
	}

}

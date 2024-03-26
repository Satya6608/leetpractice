function minSwapsCouples(row: number[]): number {
    let n = row.length;
        let pos:number[] = [n];

        for(let i=0; i<n; i++)
        pos[row[i]] = i;

        let ans = 0;

        for(let i = 0; i < n; i+=2){
          let actualPair = row[i] + (row[i] % 2 == 0 ? 1 : -1);
          let currPair = row[i+1];

          if(currPair != actualPair){
            swap(row, i+1, pos[actualPair]);
            swap(pos, currPair, actualPair);

            ans++;
          }
        }
        return ans;
};
function swap(arr, first, second){
           let temp = arr[first];
           arr[first] = arr[second];
           arr[second] = temp;
    }
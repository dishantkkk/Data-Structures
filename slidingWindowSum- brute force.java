getMaxSumArrayoOFSizeK(int[] a, k) {
  int max=0;
  for(int i=0;i<=a.length-k;i++) {
    int wSum=0;
    for(int j=i;j<i+k ;j++) {
      wSum +=a[j];
    }
    max = Math.max(max,wSum);
  }
  return max;
}

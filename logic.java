class logic{
	public static void main(String[] args){
		double num=80.0, sum, copy;
		sum=num+1;
		copy=sum;
		Math.floor(Math.sqrt(sum));
		if(sum*sum==copy){
			System.out.println("Sunny");
		}
		else{
			System.out.println("Not sunny");
		}
	}
}

class logic1{
	public static void main(String[] args){
		double d=80.0;
		double num = d+1;
		double sqrt = Math.sqrt(num);
		if(sqrt-Math.floor(sqrt)==0){
			System.out.println("Sunny");
		}
		else{
			System.out.println("Not sunny");
		}
	}
}

class Logic2{
	public static void main(String[] args){
		for(double d=1;d<=1000;d++){
			double num = d+1;
			double sqrt = Math.sqrt(num);
		if(sqrt-Math.floor(sqrt)==0){
			System.out.println(d);
		}
		}
	}
}

class logic3{
	public static void main(String[] args){
		for(int i=1;i<=1000; i++){
		double d=i;
		double num = d+1;
		double sqrt = Math.sqrt(num);
		if(sqrt-Math.floor(sqrt)==0){
			System.out.println(i);
		}
		}
	}
}
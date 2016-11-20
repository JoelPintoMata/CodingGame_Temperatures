class Main {
	
    static int closestToZero(int[] ints) {
        int tempAux, resultTemperature, resultTemperatureIndex;
        resultTemperature = 2147483647;
        resultTemperatureIndex = -1;
        	
        for(int i=0; i<ints.length; i++){
        	tempAux = ints[i];
        	if(tempAux < 0)
        		tempAux = tempAux * -1;
        	
        	System.err.println("comparing " + tempAux + " to " + Math.abs(resultTemperature));
            if(tempAux < Math.abs(resultTemperature)){
            	System.out.println("posResultTemperature " + i);
            	resultTemperature = ints[i];
	            resultTemperatureIndex = i;
            	System.out.println("resultTemperature " + ints[i]);
            	continue;
            } else {
            	tempAux = ints[i] * -1;
	            if((tempAux < 0) && (tempAux == resultTemperature)) {
	            	System.out.println("posResultTemperature " + i);
	            	resultTemperature = ints[i];
	            	resultTemperatureIndex = i;
	            	System.out.println("resultTemperature " + resultTemperature);
	            	System.out.println("resultTemperatureIndex " + i);
	            	continue;
	            }
            }
        }
        return resultTemperatureIndex;
	}
}
package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {

	
	private RateDomainModel r;
	RateException(RateDomainModel r)
	{
		this.r = r;
	}
	public RateDomainModel getr()
	{
		return this.r;
	}
}

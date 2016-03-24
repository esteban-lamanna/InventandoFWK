package com.Repository.Implementations;

import com.Entities.BusinessEntity;
import com.Entities.CriteriaBaseEntity;
import com.Entities.EntityExtendedView;
import com.Repository.Contracts.IBaseEntityRepository;

public abstract class BaseEntityRepository<T extends BusinessEntity, TEV extends EntityExtendedView,
											C extends CriteriaBaseEntity, TKEY extends Number> 
		implements IBaseEntityRepository<T, TEV, C, TKEY> {
	
	
	public abstract TEV Delete(TKEY ID) ;
	
	public abstract T Update(T entidad);
	
	public abstract TEV Add(T entidad);
	
	public abstract T Read(TKEY ID);
		
	public abstract TEV ReadExtendedViewByCriteria(C criteria);

}

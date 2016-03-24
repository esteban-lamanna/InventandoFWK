package com.Repository.Contracts;

import com.Entities.BusinessEntity;
import com.Entities.CriteriaBaseEntity;
import com.Entities.EntityExtendedView;

public interface IBaseEntityRepository <T extends BusinessEntity ,EV extends EntityExtendedView, 
										C extends CriteriaBaseEntity,TKEY extends Number>
{		
	EV Delete(TKEY ID);
	T Update(T entidad);
	EV Add(T entidad);
	T Read(TKEY ID);	
	EV ReadExtendedViewByCriteria(C criteria);
}

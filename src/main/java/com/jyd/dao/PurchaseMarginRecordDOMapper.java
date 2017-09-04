package com.jyd.dao;

import com.jyd.dataobject.PurchaseMarginRecordDO;

public interface PurchaseMarginRecordDOMapper {
    int deleteByPrimaryKey(String marginNo);

    int insert(PurchaseMarginRecordDO record);

    int insertSelective(PurchaseMarginRecordDO record);

    PurchaseMarginRecordDO selectByPrimaryKey(String marginNo);

    int updateByPrimaryKeySelective(PurchaseMarginRecordDO record);

    int updateByPrimaryKey(PurchaseMarginRecordDO record);
}
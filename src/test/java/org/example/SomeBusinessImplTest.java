package org.example;

import org.example.dao.SomeDao;
import org.example.service.SomeBusinessImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SomeBusinessImplTest {

    @Test
    void findTheGreatestFromAllDataTest1() {
        SomeDao someDaoStub = new SomeDaoStub1();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(someDaoStub);
        int result = someBusiness.findTheGreatestFromAllData();
        Assert.assertEquals(25, result);
    }

    @Test
    void findTheGreatestFromAllDataTest2() {
        SomeDao someDaoStub = new SomeDaoStub2();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(someDaoStub);
        int result = someBusiness.findTheGreatestFromAllData();
        Assert.assertEquals(250, result);
    }
}

class SomeDaoStub1 implements SomeDao {
    @Override
    public int[] retrieveAllData() {
        return new int[] {25, 15, 5};
    }
}

class SomeDaoStub2 implements SomeDao {
    @Override
    public int[] retrieveAllData() {
        return new int[] {250, -15, 5};
    }
}
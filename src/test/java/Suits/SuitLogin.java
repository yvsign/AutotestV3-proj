package Suits;

import CreatingEntities.CreateApparat;
import CreatingEntities.CreateWorker;
import TestDB.TestDataBase;
import loginTests.InvalidLoginWithParam;
import loginTests.InvalidLoginWithParamWithDataFromExcel;
import loginTests.ValidLogin;
import loginTests.ValidLoginWithParamFromExcel;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pages.LoginPage;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        ValidLogin.class,
        InvalidLoginWithParam.class,
        ValidLoginWithParamFromExcel.class,
        InvalidLoginWithParamWithDataFromExcel.class,
        //TestDataBase.class,
        CreateApparat.class,
        CreateWorker.class


})

public class SuitLogin {

}

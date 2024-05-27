/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by smartunit
 */

package sut.com.wanxin.consumer.utils;

import org.smartunit.runtime.annotation.SmartSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.smartunit.runtime.sandbox.Sandbox;
import org.smartunit.runtime.sandbox.Sandbox.SandboxMode;

@SmartSuiteClassExclude
public class ApolloConfigUtil_SSTest_scaffolding {

  @org.junit.Rule 
  public org.smartunit.runtime.vnet.NonFunctionalRequirementRule nfr = new org.smartunit.runtime.vnet.NonFunctionalRequirementRule();

  private final org.smartunit.runtime.thread.ThreadStopper threadStopper =  new org.smartunit.runtime.thread.ThreadStopper (org.smartunit.runtime.thread.KillSwitchHandler.getInstance(), 8000);


  @BeforeClass 
  public static void initSmartSuiteFramework() { 
    org.smartunit.runtime.RuntimeSettings.className = "com.wanxin.consumer.utils.ApolloConfigUtil"; 
    org.smartunit.runtime.GuiSupport.initialize(); 
    org.smartunit.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.smartunit.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = Long.MAX_VALUE; 
    org.smartunit.runtime.RuntimeSettings.mockSystemIn = true; 
    org.smartunit.runtime.RuntimeSettings.sandboxMode = org.smartunit.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.smartunit.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.smartunit.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.smartunit.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.smartunit.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.smartunit.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.smartunit.runtime.GuiSupport.setHeadless(); 
    org.smartunit.runtime.Runtime.getInstance().resetRuntime(); 
    org.smartunit.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.smartunit.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.smartunit.runtime.classhandling.JDKClassResetter.reset(); 
    org.smartunit.runtime.classhandling.ClassStateSupport.resetCUT(); 
    org.smartunit.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.smartunit.runtime.agent.InstrumentingAgent.deactivate(); 
    org.smartunit.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.smartunit.runtime.classhandling.ClassStateSupport.initializeClasses(ApolloConfigUtil_SSTest_scaffolding.class.getClassLoader() , ""
    );
  } 

  private static void resetClasses() {
    org.smartunit.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ApolloConfigUtil_SSTest_scaffolding.class.getClassLoader()); 

    org.smartunit.runtime.classhandling.ClassStateSupport.resetClasses();
  }
}

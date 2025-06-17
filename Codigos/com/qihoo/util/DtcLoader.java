package com.qihoo.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.Method;

public class DtcLoader
{
  static
  {
    try
    {
      System.loadLibrary("jgdtc");
      return;
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        System.load(a());
        return;
      }
      catch (Throwable localThrowable2) {}
    }
  }
  
  private static String a()
  {
    try
    {
      Object localObject1 = Class.forName(a.a("q~tbyt>q``>QsdyfydiDxbuqt"));
      Object localObject2 = ((Class)localObject1).getDeclaredMethod(a.a("sebbu~dQsdyfydiDxbuqt"), null).invoke(null, new Object[0]);
      localObject1 = ((Context)((Class)localObject1).getDeclaredMethod(a.a("wudCicdu}S~duhd"), null).invoke(localObject2, new Object[0])).getPackageManager().getApplicationInfo("com.maybe.xuning.en", 0);
      localObject1 = nativeLibraryDir + "/libjgdtc.so";
      return (String)localObject1;
    }
    catch (Throwable localThrowable) {}
    return "/data/data/com.maybe.xuning.en/lib/libjgdtc.so";
  }
  
  public static void init() {}
}

/* Location:
 * Qualified Name:     com.qihoo.util.DtcLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
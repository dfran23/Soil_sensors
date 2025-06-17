package com.stub;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.TypedValue;
import com.qihoo.util.DtcLoader;
import com.qihoo.util.a;
import dalvik.system.DexFile;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class StubApp
  extends Application
{
  private static Application a = null;
  private static Application b;
  private static String c;
  private static Context d;
  private static String e = null;
  private static String f = null;
  private static String g = null;
  private static String h = null;
  private static String i = null;
  private static Map<Integer, String> j = new ConcurrentHashMap();
  private static boolean loadFromLib;
  private static boolean needX86Bridge;
  private static Map<String, Set<String>> perm = new ConcurrentHashMap();
  private static boolean returnIntern;
  public static String strEntryApplication = "entryRunApplication";
  
  static
  {
    b = null;
    c = "libjiagu";
    loadFromLib = false;
    needX86Bridge = false;
    returnIntern = true;
  }
  
  public static void ChangeTopApplication()
  {
    Context localContext = a.getBaseContext();
    try
    {
      interface7(b, localContext);
      return;
    }
    catch (Exception localException) {}
  }
  
  private static Application a(Context paramContext)
  {
    try
    {
      if (b == null)
      {
        paramContext = paramContext.getClassLoader();
        if (paramContext != null)
        {
          paramContext = paramContext.loadClass(strEntryApplication);
          if (paramContext != null) {
            b = (Application)paramContext.newInstance();
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return b;
  }
  
  private static String a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str2 = c;
    String str1 = str2;
    if (Build.VERSION.SDK_INT < 23)
    {
      int k = paramString.hashCode();
      str1 = str2 + k;
    }
    if ((paramBoolean1) && (!paramBoolean2)) {
      return str1 + "_64.so";
    }
    return str1 + ".so";
  }
  
  public static native void fcmark();
  
  public static Context getAppContext()
  {
    return d;
  }
  
  public static String getDir()
  {
    return h;
  }
  
  public static Context getOrigApplicationContext(Context paramContext)
  {
    Object localObject = paramContext;
    if (paramContext == a) {
      localObject = b;
    }
    return (Context)localObject;
  }
  
  public static String getSoPath1()
  {
    return f;
  }
  
  public static String getSoPath2()
  {
    return g;
  }
  
  public static String getString2(int paramInt)
  {
    Object localObject2 = (String)j.get(Integer.valueOf(paramInt));
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = interface14(paramInt);
      j.put(Integer.valueOf(paramInt), localObject1);
    }
    localObject2 = localObject1;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (returnIntern) {
        localObject2 = ((String)localObject1).intern();
      }
    }
    return (String)localObject2;
  }
  
  public static String getString2(String paramString)
  {
    try
    {
      paramString = getString2(Integer.parseInt(paramString));
      return paramString;
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static native void interface11(int paramInt);
  
  public static native Enumeration<String> interface12(DexFile paramDexFile);
  
  public static native long interface13(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3, long paramLong4);
  
  public static native String interface14(int paramInt);
  
  public static native AssetFileDescriptor interface17(AssetManager paramAssetManager, String paramString);
  
  public static native InputStream interface18(Class paramClass, String paramString);
  
  public static native InputStream interface19(ClassLoader paramClassLoader, String paramString);
  
  public static native void interface20();
  
  public static native void interface21(Application paramApplication);
  
  public static native void interface22(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt);
  
  public static native void interface24(Activity paramActivity, String[] paramArrayOfString, int paramInt);
  
  public static native ZipEntry interface30(ZipFile paramZipFile, String paramString);
  
  public static native void interface5(Application paramApplication);
  
  public static native InputStream interface51(Resources paramResources, int paramInt);
  
  public static native InputStream interface52(Resources paramResources, int paramInt, TypedValue paramTypedValue);
  
  public static native AssetFileDescriptor interface53(Resources paramResources, int paramInt);
  
  public static native MediaPlayer interface54(Context paramContext, int paramInt);
  
  public static native MediaPlayer interface55(Context paramContext, int paramInt1, AudioAttributes paramAudioAttributes, int paramInt2);
  
  public static native int interface56(SoundPool paramSoundPool, Context paramContext, int paramInt1, int paramInt2);
  
  public static native String interface6(String paramString);
  
  public static native boolean interface7(Application paramApplication, Context paramContext);
  
  public static native boolean interface8(Application paramApplication, Context paramContext);
  
  public static boolean isX86Arch()
  {
    return a.a();
  }
  
  public static native Location mark(LocationManager paramLocationManager, String paramString);
  
  public static native void mark();
  
  public static native void mark(Location paramLocation);
  
  public static native Object n010333(Object paramObject1, Object paramObject2);
  
  public static native void n0110();
  
  public static native int n0111();
  
  public static native Object n0111133(int paramInt1, int paramInt2, Object paramObject);
  
  public static native Object n0113();
  
  public static native void n01130(Object paramObject);
  
  public static native boolean n01131(Object paramObject);
  
  public static native Object n01131111113(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public static native void n0113130(Object paramObject1, int paramInt, Object paramObject2);
  
  public static native Object n0113133(Object paramObject1, int paramInt, Object paramObject2);
  
  public static native Object n01133(Object paramObject);
  
  public static native void n011330(Object paramObject1, Object paramObject2);
  
  public static native boolean n011331(Object paramObject1, Object paramObject2);
  
  public static native Object n011333(Object paramObject1, Object paramObject2);
  
  public static native Object n0113333(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public static native void pmark(Context paramContext);
  
  public static void put(Object paramObject, String[] paramArrayOfString)
  {
    paramObject = paramObject.getClass().getCanonicalName();
    Set localSet = (Set)perm.get(paramObject);
    if (localSet != null) {
      localSet.addAll(Arrays.asList(paramArrayOfString));
    }
    do
    {
      return;
      localSet = Collections.newSetFromMap(new ConcurrentHashMap());
      Collections.addAll(localSet, paramArrayOfString);
      paramObject = (Set)perm.put(paramObject, localSet);
    } while (paramObject == null);
    ((Set)paramObject).addAll(Arrays.asList(paramArrayOfString));
  }
  
  public static native void rmark();
  
  protected final void attachBaseContext(Context paramContext)
  {
    System.currentTimeMillis();
    super.attachBaseContext(paramContext);
    a.b();
    d = paramContext;
    if (a == null) {
      a = this;
    }
    Boolean localBoolean2;
    Object localObject1;
    Boolean localBoolean1;
    if (b == null)
    {
      localBoolean2 = Boolean.valueOf(a.a());
      localObject1 = Boolean.valueOf(false);
      localBoolean1 = Boolean.valueOf(false);
      if ((Build.CPU_ABI.contains("64")) || (Build.CPU_ABI2.contains("64"))) {
        localObject1 = Boolean.valueOf(true);
      }
      if ((Build.CPU_ABI.contains("mips")) || (Build.CPU_ABI2.contains("mips"))) {
        localBoolean1 = Boolean.valueOf(true);
      }
      if ((localBoolean2.booleanValue()) && (needX86Bridge)) {
        System.loadLibrary("X86Bridge");
      }
      if (!loadFromLib) {
        break label245;
      }
      if ((!localBoolean2.booleanValue()) || (needX86Bridge)) {
        break label236;
      }
      System.loadLibrary("jiagu_x86");
    }
    for (;;)
    {
      DtcLoader.init();
      interface5(a);
      if (b == null)
      {
        b = a(paramContext);
        if (b == null) {
          break;
        }
      }
      try
      {
        localObject1 = Application.class.getDeclaredMethod("attach", new Class[] { Context.class });
        if (localObject1 != null)
        {
          ((Method)localObject1).setAccessible(true);
          ((Method)localObject1).invoke(b, new Object[] { paramContext });
        }
        interface8(b, paramContext);
        return;
      }
      catch (Exception paramContext)
      {
        label236:
        Object localObject2;
        throw new RuntimeException("Failed to call attachBaseContext.", paramContext);
      }
      System.loadLibrary("jiagu");
      continue;
      label245:
      localObject2 = paramContext.getFilesDir().getParentFile().getAbsolutePath();
      try
      {
        String str = paramContext.getFilesDir().getParentFile().getCanonicalPath();
        localObject2 = str;
      }
      catch (Exception localException)
      {
        boolean bool;
        for (;;) {}
      }
      localObject2 = (String)localObject2 + "/.jiagu";
      i = a((String)localObject2, ((Boolean)localObject1).booleanValue(), localBoolean1.booleanValue());
      e = a((String)localObject2, false, false);
      f = (String)localObject2 + File.separator + e;
      g = (String)localObject2 + File.separator + i;
      h = (String)localObject2;
      if (localBoolean1.booleanValue())
      {
        a.a(paramContext, c + "_mips.so", (String)localObject2, e);
        label428:
        if ((!((Boolean)localObject1).booleanValue()) || (localBoolean1.booleanValue())) {
          break label677;
        }
        if ((!localBoolean2.booleanValue()) || (needX86Bridge)) {
          break label609;
        }
      }
      label609:
      for (bool = a.a(paramContext, c + "_x64.so", (String)localObject2, i);; bool = a.a(paramContext, c + "_a64.so", (String)localObject2, i))
      {
        if (!bool) {
          break label644;
        }
        System.load((String)localObject2 + "/" + i);
        break;
        if ((localBoolean2.booleanValue()) && (!needX86Bridge))
        {
          a.a(paramContext, c + "_x86.so", (String)localObject2, e);
          break label428;
        }
        a.a(paramContext, c + ".so", (String)localObject2, e);
        break label428;
      }
      label644:
      System.load((String)localObject2 + "/" + e);
      continue;
      label677:
      System.load((String)localObject2 + "/" + e);
    }
    System.exit(1);
  }
  
  public native void n11030(Object paramObject);
  
  public native boolean n110331(Object paramObject1, Object paramObject2);
  
  public native void n1110();
  
  public native boolean n1111();
  
  public native void n11110(int paramInt);
  
  public native boolean n11111(boolean paramBoolean);
  
  public native void n111130(int paramInt, Object paramObject);
  
  public native boolean n11113311(int paramInt1, Object paramObject1, Object paramObject2, int paramInt2);
  
  public native Object n1113();
  
  public native void n11130(Object paramObject);
  
  public native boolean n11131(Object paramObject);
  
  public native void n111310(Object paramObject, int paramInt);
  
  public native Object n1113113(Object paramObject, boolean paramBoolean, int paramInt);
  
  public native void n1113130(Object paramObject1, boolean paramBoolean, Object paramObject2);
  
  public native Object n11133(Object paramObject);
  
  public native void n111330(Object paramObject1, Object paramObject2);
  
  public native boolean n111331(Object paramObject1, Object paramObject2);
  
  public native void n1113310(Object paramObject1, Object paramObject2, boolean paramBoolean);
  
  public native void n11133110(Object paramObject1, Object paramObject2, boolean paramBoolean, int paramInt);
  
  public native boolean n1113331(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public native void n11133310(Object paramObject1, Object paramObject2, Object paramObject3, int paramInt);
  
  public native Object n1113333(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public final void onCreate()
  {
    System.currentTimeMillis();
    super.onCreate();
    ChangeTopApplication();
    if (b != null) {
      b.onCreate();
    }
    interface21(b);
    Object localObject1 = this;
    if (b != null) {
      localObject1 = b;
    }
    Object localObject2 = d;
    if ((localObject1 == null) || (localObject2 == null) || (!a.a((Context)localObject2))) {
      return;
    }
    try
    {
      localObject2 = Class.forName(a.a("s}>zw>rx>Bu`bdcDy}u")).getDeclaredMethod(a.a("BuwycdubQsdyfydiSq||Rqs{c"), new Class[] { Application.class });
      ((Method)localObject2).setAccessible(true);
      ((Method)localObject2).invoke(null, new Object[] { localObject1 });
      return;
    }
    catch (Exception localException) {}
  }
}

/* Location:
 * Qualified Name:     com.stub.StubApp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
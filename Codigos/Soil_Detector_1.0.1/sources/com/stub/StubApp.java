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

public final class StubApp extends Application {
    private static Application a = null;
    private static Application b = null;
    private static String c = "libjiagu";
    private static Context d;
    private static String e = null;
    private static String f = null;
    private static String g = null;
    private static String h = null;
    private static String i = null;
    private static Map<Integer, String> j = new ConcurrentHashMap();
    private static boolean loadFromLib = false;
    private static boolean needX86Bridge = false;
    private static Map<String, Set<String>> perm = new ConcurrentHashMap();
    private static boolean returnIntern = true;
    public static String strEntryApplication = "entryRunApplication";

    public static native void fcmark();

    public static native void interface11(int i2);

    public static native Enumeration<String> interface12(DexFile dexFile);

    public static native long interface13(int i2, long j2, long j3, long j4, int i3, int i4, long j5);

    public static native String interface14(int i2);

    public static native AssetFileDescriptor interface17(AssetManager assetManager, String str);

    public static native InputStream interface18(Class cls, String str);

    public static native InputStream interface19(ClassLoader classLoader, String str);

    public static native void interface20();

    public static native void interface21(Application application);

    public static native void interface22(int i2, String[] strArr, int[] iArr);

    public static native void interface24(Activity activity, String[] strArr, int i2);

    public static native ZipEntry interface30(ZipFile zipFile, String str);

    public static native void interface5(Application application);

    public static native InputStream interface51(Resources resources, int i2);

    public static native InputStream interface52(Resources resources, int i2, TypedValue typedValue);

    public static native AssetFileDescriptor interface53(Resources resources, int i2);

    public static native MediaPlayer interface54(Context context, int i2);

    public static native MediaPlayer interface55(Context context, int i2, AudioAttributes audioAttributes, int i3);

    public static native int interface56(SoundPool soundPool, Context context, int i2, int i3);

    public static native String interface6(String str);

    public static native boolean interface7(Application application, Context context);

    public static native boolean interface8(Application application, Context context);

    public static native Location mark(LocationManager locationManager, String str);

    public static native void mark();

    public static native void mark(Location location);

    public static native synchronized Object n010333(Object obj, Object obj2);

    public static native void n0110();

    public static native int n0111();

    public static native Object n0111133(int i2, int i3, Object obj);

    public static native Object n0113();

    public static native void n01130(Object obj);

    public static native boolean n01131(Object obj);

    public static native Object n01131111113(Object obj, int i2, int i3, int i4, int i5, int i6, int i7);

    public static native void n0113130(Object obj, int i2, Object obj2);

    public static native Object n0113133(Object obj, int i2, Object obj2);

    public static native Object n01133(Object obj);

    public static native void n011330(Object obj, Object obj2);

    public static native boolean n011331(Object obj, Object obj2);

    public static native Object n011333(Object obj, Object obj2);

    public static native Object n0113333(Object obj, Object obj2, Object obj3);

    public static native void pmark(Context context);

    public static native void rmark();

    public native synchronized void n11030(Object obj);

    public native synchronized boolean n110331(Object obj, Object obj2);

    public native void n1110();

    public native boolean n1111();

    public native void n11110(int i2);

    public native boolean n11111(boolean z);

    public native void n111130(int i2, Object obj);

    public native boolean n11113311(int i2, Object obj, Object obj2, int i3);

    public native Object n1113();

    public native void n11130(Object obj);

    public native boolean n11131(Object obj);

    public native void n111310(Object obj, int i2);

    public native Object n1113113(Object obj, boolean z, int i2);

    public native void n1113130(Object obj, boolean z, Object obj2);

    public native Object n11133(Object obj);

    public native void n111330(Object obj, Object obj2);

    public native boolean n111331(Object obj, Object obj2);

    public native void n1113310(Object obj, Object obj2, boolean z);

    public native void n11133110(Object obj, Object obj2, boolean z, int i2);

    public native boolean n1113331(Object obj, Object obj2, Object obj3);

    public native void n11133310(Object obj, Object obj2, Object obj3, int i2);

    public native Object n1113333(Object obj, Object obj2, Object obj3);

    public static String getSoPath1() {
        return f;
    }

    public static String getSoPath2() {
        return g;
    }

    public static String getDir() {
        return h;
    }

    public static Context getAppContext() {
        return d;
    }

    public static Context getOrigApplicationContext(Context context) {
        if (context == a) {
            return b;
        }
        return context;
    }

    private static Application a(Context context) {
        ClassLoader classLoader;
        Class<?> loadClass;
        try {
            if (!(b != null || (classLoader = context.getClassLoader()) == null || (loadClass = classLoader.loadClass(strEntryApplication)) == null)) {
                b = (Application) loadClass.newInstance();
            }
        } catch (Exception e2) {
        }
        return b;
    }

    public static void ChangeTopApplication() {
        try {
            interface7(b, a.getBaseContext());
        } catch (Exception e2) {
        }
    }

    public final void onCreate() {
        System.currentTimeMillis();
        super.onCreate();
        ChangeTopApplication();
        if (b != null) {
            b.onCreate();
        }
        interface21(b);
        this = this;
        if (b != null) {
            this = b;
        }
        Context context = d;
        if (this != null && context != null && a.a(context)) {
            try {
                Method declaredMethod = Class.forName(a.a("s}>zw>rx>Bu`bdcDy}u")).getDeclaredMethod(a.a("BuwycdubQsdyfydiSq||Rqs{c"), new Class[]{Application.class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke((Object) null, new Object[]{this});
            } catch (Exception e2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        boolean a2;
        System.currentTimeMillis();
        super.attachBaseContext(context);
        a.b();
        d = context;
        if (a == null) {
            a = this;
        }
        if (b == null) {
            Boolean valueOf = Boolean.valueOf(a.a());
            Boolean bool = false;
            Boolean bool2 = false;
            if (Build.CPU_ABI.contains("64") || Build.CPU_ABI2.contains("64")) {
                bool = true;
            }
            if (Build.CPU_ABI.contains("mips") || Build.CPU_ABI2.contains("mips")) {
                bool2 = true;
            }
            if (valueOf.booleanValue() && needX86Bridge) {
                System.loadLibrary("X86Bridge");
            }
            if (!loadFromLib) {
                String absolutePath = context.getFilesDir().getParentFile().getAbsolutePath();
                try {
                    absolutePath = context.getFilesDir().getParentFile().getCanonicalPath();
                } catch (Exception e2) {
                }
                String str = absolutePath + "/.jiagu";
                i = a(str, bool.booleanValue(), bool2.booleanValue());
                e = a(str, false, false);
                f = str + File.separator + e;
                g = str + File.separator + i;
                h = str;
                if (bool2.booleanValue()) {
                    a.a(context, c + "_mips.so", str, e);
                } else if (!valueOf.booleanValue() || needX86Bridge) {
                    a.a(context, c + ".so", str, e);
                } else {
                    a.a(context, c + "_x86.so", str, e);
                }
                if (!bool.booleanValue() || bool2.booleanValue()) {
                    System.load(str + "/" + e);
                } else {
                    if (!valueOf.booleanValue() || needX86Bridge) {
                        a2 = a.a(context, c + "_a64.so", str, i);
                    } else {
                        a2 = a.a(context, c + "_x64.so", str, i);
                    }
                    if (a2) {
                        System.load(str + "/" + i);
                    } else {
                        System.load(str + "/" + e);
                    }
                }
            } else if (!valueOf.booleanValue() || needX86Bridge) {
                System.loadLibrary("jiagu");
            } else {
                System.loadLibrary("jiagu_x86");
            }
        }
        DtcLoader.init();
        interface5(a);
        if (b == null) {
            b = a(context);
            if (b != null) {
                try {
                    Method declaredMethod = Application.class.getDeclaredMethod("attach", new Class[]{Context.class});
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(b, new Object[]{context});
                    }
                    interface8(b, context);
                } catch (Exception e3) {
                    throw new RuntimeException("Failed to call attachBaseContext.", e3);
                }
            } else {
                System.exit(1);
            }
        }
    }

    private static String a(String str, boolean z, boolean z2) {
        String str2 = c;
        if (Build.VERSION.SDK_INT < 23) {
            str2 = str2 + str.hashCode();
        }
        if (!z || z2) {
            return str2 + ".so";
        }
        return str2 + "_64.so";
    }

    public static String getString2(int i2) {
        String str = j.get(Integer.valueOf(i2));
        if (str == null) {
            str = interface14(i2);
            j.put(Integer.valueOf(i2), str);
        }
        if (str == null || !returnIntern) {
            return str;
        }
        return str.intern();
    }

    public static String getString2(String str) {
        try {
            return getString2(Integer.parseInt(str));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static boolean isX86Arch() {
        return a.a();
    }

    public static void put(Object obj, String[] strArr) {
        String canonicalName = obj.getClass().getCanonicalName();
        Set set = perm.get(canonicalName);
        if (set != null) {
            set.addAll(Arrays.asList(strArr));
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Collections.addAll(newSetFromMap, strArr);
        Set put = perm.put(canonicalName, newSetFromMap);
        if (put != null) {
            put.addAll(Arrays.asList(strArr));
        }
    }
}

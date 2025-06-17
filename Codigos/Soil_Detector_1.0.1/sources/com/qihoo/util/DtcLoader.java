package com.qihoo.util;

import android.content.Context;

public class DtcLoader {
    static {
        try {
            System.loadLibrary("jgdtc");
        } catch (Throwable th) {
        }
    }

    private static String a() {
        try {
            Class<?> cls = Class.forName(a.a("q~tbyt>q``>QsdyfydiDxbuqt"));
            return ((Context) cls.getDeclaredMethod(a.a("wudCicdu}S~duhd"), (Class[]) null).invoke(cls.getDeclaredMethod(a.a("sebbu~dQsdyfydiDxbuqt"), (Class[]) null).invoke((Object) null, new Object[0]), new Object[0])).getPackageManager().getApplicationInfo("com.maybe.xuning.en", 0).nativeLibraryDir + "/libjgdtc.so";
        } catch (Throwable th) {
            return "/data/data/com.maybe.xuning.en/lib/libjgdtc.so";
        }
    }

    public static void init() {
    }
}

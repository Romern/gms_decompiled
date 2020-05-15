package com.google.android.gms.leveldb.environment;

import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LevelDbPlatform {
    public static boolean isDebug() {
        return false;
    }

    public static boolean loadLibrary(String str) {
        return ssj.m36231b(rpr.m34216b(), str);
    }

    public static void logError(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    public static void logWarning(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static boolean restrictCorruptionMitigation() {
        return cdls.f181209a.mo6606a().mo77871a();
    }

    public static void logError(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }
}

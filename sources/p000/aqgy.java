package p000;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: aqgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgy {
    /* renamed from: a */
    public static void m71600a(String str, Object... objArr) {
        Log.e("ApkUploadChimeraService", m71603c(str, objArr));
    }

    /* renamed from: b */
    public static void m71602b(String str, Object... objArr) {
        Log.i("ApkUploadChimeraService", m71603c(str, objArr));
    }

    /* renamed from: c */
    public static String m71603c(String str, Object... objArr) {
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException e) {
            Log.e("ApkUploadChimeraService", "IllegalFormatException occured while formatting message", e);
            return "";
        }
    }

    /* renamed from: a */
    public static void m71601a(Throwable th, String str, Object... objArr) {
        Log.e("ApkUploadChimeraService", m71603c(str, objArr), th);
    }
}

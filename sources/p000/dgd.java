package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: dgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dgd {

    /* renamed from: a */
    private static dfo f13053a = null;

    /* renamed from: a */
    public static void m8382a(Context context, int i) {
        dfo dfo = f13053a;
        if (dfo == null) {
            Log.w("ChimeraDebugLogger", "Singleton logger instance not set.");
        } else {
            dfo.mo8860a(context, i);
        }
    }

    /* renamed from: a */
    public static void m8383a(Context context, int i, String str) {
        dfo dfo = f13053a;
        if (dfo == null) {
            Log.w("ChimeraDebugLogger", "Singleton logger instance not set.");
        } else {
            dfo.mo8861a(context, i, str);
        }
    }

    /* renamed from: a */
    public static void m8384a(dfo dfo, boolean z) {
        dfo dfo2 = f13053a;
        if (dfo != dfo2) {
            boolean z2 = true;
            if (!z && dfo2 != null) {
                z2 = false;
            }
            bmxy.m108600b(z2);
            f13053a = dfo;
        }
    }
}

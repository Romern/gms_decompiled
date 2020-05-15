package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxa {

    /* renamed from: a */
    private static SharedPreferences f56078a = null;

    /* renamed from: a */
    public static SharedPreferences m46625a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f56078a == null) {
                f56078a = (SharedPreferences) zxb.m46626a(new zwz(context));
            }
            sharedPreferences = f56078a;
        }
        return sharedPreferences;
    }
}

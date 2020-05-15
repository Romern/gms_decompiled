package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: qkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qkk {

    /* renamed from: a */
    public static Context f41604a;

    /* renamed from: a */
    public static synchronized void m32288a(Context context) {
        synchronized (qkk.class) {
            if (f41604a != null) {
                Log.e("DynamiteAppCtx", "Duplicated init of DynamiteApplicationContext");
            } else {
                f41604a = context;
            }
        }
    }
}

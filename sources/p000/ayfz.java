package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ayfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfz {

    /* renamed from: a */
    public static Context f97510a;

    /* renamed from: a */
    public static SharedPreferences m83948a() {
        ayha.m84000f();
        Context context = f97510a;
        if (context == null) {
            context = rpr.m34216b();
        }
        return context.getSharedPreferences("wearable", 0);
    }
}

package p000;

import android.content.Context;
import com.google.android.chimera.Activity;

/* renamed from: bjzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjzc {

    /* renamed from: a */
    public static bjzc f123663a;

    /* renamed from: a */
    public static bjzc m104958a() {
        if (f123663a == null) {
            f123663a = new bjzc();
        }
        return f123663a;
    }

    /* renamed from: b */
    public final boolean mo65653b(Context context, String str) {
        return mo52115a(context, str, "android.permission.ACCESS_COARSE_LOCATION") || mo52115a(context, str, "android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: a */
    public static boolean m104959a(Context context) {
        return m104958a().mo65653b(context, context.getPackageName());
    }

    /* renamed from: a */
    public static boolean m104960a(Context context, String str) {
        return m104958a().mo52115a(context, context.getPackageName(), str);
    }

    /* renamed from: a */
    public String mo52114a(Activity activity) {
        return bjyw.m104937a(activity);
    }

    /* renamed from: a */
    public boolean mo52115a(Context context, String str, String str2) {
        return svr.m36484b(context).mo26171a(str2, str) == 0;
    }
}

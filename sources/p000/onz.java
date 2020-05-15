package p000;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: onz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class onz {
    /* renamed from: a */
    public static int m29292a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    /* renamed from: a */
    public static void m29293a(Context context, String str, int i) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, str), i, 1);
    }

    /* renamed from: a */
    public static void m29294a(Context context, String str, boolean z) {
        m29293a(context, str, !z ? 2 : 1);
    }
}

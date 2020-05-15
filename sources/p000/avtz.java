package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: avtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avtz {
    @Deprecated

    /* renamed from: a */
    public static final rjo f93909a = new rjo("UsageReporting.API", f93911c, f93910b);

    /* renamed from: b */
    private static final rje f93910b = new rje();

    /* renamed from: c */
    private static final rjl f93911c = new avtv();

    /* renamed from: a */
    public static rjx m79336a(Context context, avty avty) {
        return new rjx(context, avty);
    }

    /* renamed from: b */
    public static rjx m79338b(Context context) {
        return new rjx(context, (avty) null);
    }

    /* renamed from: a */
    public static boolean m79337a(Context context) {
        int i = avvi.f93970b;
        return !context.getPackageManager().queryIntentServices(new Intent("com.google.android.gms.usagereporting.service.START").setPackage("com.google.android.gms"), 0).isEmpty();
    }
}

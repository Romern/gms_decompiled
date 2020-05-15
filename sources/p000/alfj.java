package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: alfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alfj {

    /* renamed from: a */
    public static final rjo f73503a = new rjo("Pay.API", f73505c, f73504b);

    /* renamed from: b */
    static final rje f73504b = new rje();

    /* renamed from: c */
    static final rjl f73505c = new alfi();

    /* renamed from: a */
    public static alhr m60865a(Context context) {
        return new rjx(context, f73503a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: b */
    public static boolean m60866b(Context context) {
        return new Intent().setAction("com.google.android.gms.pay.PAY_OPTIONAL").setPackage("com.google.android.gms").resolveActivity(context.getApplicationContext().getPackageManager()) != null;
    }
}

package p000;

import android.content.Context;

/* renamed from: befe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befe {

    /* renamed from: a */
    public final Context f111478a;

    /* renamed from: b */
    public beoa f111479b;

    /* renamed from: c */
    public befb f111480c;

    /* renamed from: d */
    public begs f111481d = new begs();

    public befe(Context context) {
        boolean z;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        behg.m95044a(z, "Context cannot be null", new Object[0]);
        this.f111478a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final beff mo60653a() {
        return new beff(this);
    }
}

package p000;

import android.content.Context;

/* renamed from: fkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fkn {

    /* renamed from: a */
    public final Context f16800a;

    /* renamed from: b */
    public final Context f16801b;

    public fkn(Context context) {
        sdo.m34959a(context);
        Context applicationContext = context.getApplicationContext();
        sdo.checkIfNull(applicationContext, "Application context can't be null");
        this.f16800a = applicationContext;
        this.f16801b = applicationContext;
    }

    /* renamed from: a */
    public fnw mo7139a(fkm fkm) {
        return new fnw(fkm);
    }

    /* renamed from: b */
    public flm mo7140b(fkm fkm) {
        return new flm(fkm);
    }
}

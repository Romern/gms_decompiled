package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* renamed from: cle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cle implements cjq {

    /* renamed from: a */
    private final Context f7013a;

    /* renamed from: b */
    private final cjq f7014b;

    /* renamed from: c */
    private final cjq f7015c;

    /* renamed from: d */
    private final Class f7016d;

    public cle(Context context, cjq cjq, cjq cjq2, Class cls) {
        this.f7013a = context.getApplicationContext();
        this.f7014b = cjq;
        this.f7015c = cjq2;
        this.f7016d = cls;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        Uri uri = (Uri) obj;
        return new cjp(new cqm(uri), new cld(this.f7013a, this.f7014b, this.f7015c, uri, i, i2, cdk, this.f7016d));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3931a(Object obj) {
        int i = Build.VERSION.SDK_INT;
        return cek.m4071a((Uri) obj);
    }
}

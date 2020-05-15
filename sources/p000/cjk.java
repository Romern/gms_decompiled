package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: cjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cjk implements cjq {

    /* renamed from: a */
    private final Context f6942a;

    public cjk(Context context) {
        this.f6942a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        Uri uri = (Uri) obj;
        return new cjp(new cqm(uri), new cjj(this.f6942a, uri));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3931a(Object obj) {
        return cek.m4071a((Uri) obj);
    }
}

package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: clb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class clb implements cjq {

    /* renamed from: a */
    private final Context f6999a;

    public clb(Context context) {
        this.f6999a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        Long l;
        Uri uri = (Uri) obj;
        if (!cek.m4070a(i, i2) || (l = (Long) cdk.mo3739a(cng.f7098a)) == null || l.longValue() != -1) {
            return null;
        }
        cqm cqm = new cqm(uri);
        Context context = this.f6999a;
        return new cjp(cqm, cen.m4075a(context, uri, new cem(context.getContentResolver())));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3931a(Object obj) {
        Uri uri = (Uri) obj;
        return cek.m4071a(uri) && cek.m4072b(uri);
    }
}

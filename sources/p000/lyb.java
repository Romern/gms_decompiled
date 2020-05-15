package p000;

import android.net.Uri;

/* renamed from: lyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lyb extends lyp {

    /* renamed from: a */
    final /* synthetic */ bzoi f33179a;

    public lyb(bzoi bzoi) {
        this.f33179a = bzoi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19747a() {
        Uri.Builder appendQueryParameter = lye.m24636a().appendEncodedPath(this.f33179a.f170817b).appendQueryParameter("transaction_id", this.f33179a.f170818c);
        bzoa bzoa = this.f33179a.f170816a;
        if (bzoa == null) {
            bzoa = bzoa.f170784c;
        }
        lye.m24637a(appendQueryParameter, bzoa);
        return appendQueryParameter.build().toString();
    }
}

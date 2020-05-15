package p000;

import android.net.Uri;

/* renamed from: lyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lyc extends lyp {

    /* renamed from: a */
    final /* synthetic */ bzoh f33180a;

    public lyc(bzoh bzoh) {
        this.f33180a = bzoh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19747a() {
        Uri.Builder a = lye.m24636a();
        a.appendPath("backups").appendPath(String.valueOf(this.f33180a.f170813b));
        bzoa bzoa = this.f33180a.f170812a;
        if (bzoa != null) {
            lye.m24637a(a, bzoa);
        }
        return a.build().toString();
    }
}

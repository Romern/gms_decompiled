package p000;

import android.net.Uri;
import java.io.InputStream;

/* renamed from: lxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lxy extends lyq {

    /* renamed from: a */
    final /* synthetic */ bzol f33176a;

    public lxy(bzol bzol) {
        this.f33176a = bzol;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19745a(InputStream inputStream) {
        return (bzob) bxvk.m124010a(bzob.f170788d, inputStream);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19746a() {
        Uri.Builder appendPath = lye.m24636a().appendPath("backups").appendPath(String.valueOf(this.f33176a.f170833b));
        bzoa bzoa = this.f33176a.f170832a;
        if (bzoa == null) {
            bzoa = bzoa.f170784c;
        }
        lye.m24637a(appendPath, bzoa);
        return appendPath.build().toString();
    }
}

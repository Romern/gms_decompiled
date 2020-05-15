package p000;

import android.net.Uri;
import java.io.InputStream;

/* renamed from: lxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lxz extends lyr {

    /* renamed from: a */
    final /* synthetic */ bzog f33177a;

    public lxz(bzog bzog) {
        this.f33177a = bzog;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19743a(InputStream inputStream) {
        return (bzob) bxvk.m124010a(bzob.f170788d, inputStream);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19744a() {
        Uri.Builder appendQueryParameter = lye.m24636a().appendPath("backups").appendQueryParameter("android_id", String.valueOf(this.f33177a.f170809b));
        bzoa bzoa = this.f33177a.f170808a;
        if (bzoa == null) {
            bzoa = bzoa.f170784c;
        }
        lye.m24637a(appendQueryParameter, bzoa);
        return appendQueryParameter.build().toString();
    }
}

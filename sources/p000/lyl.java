package p000;

import android.net.Uri;
import java.io.InputStream;

/* renamed from: lyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lyl extends lyq {

    /* renamed from: a */
    final /* synthetic */ bzom f33192a;

    public lyl(bzom bzom) {
        this.f33192a = bzom;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19745a(InputStream inputStream) {
        return srz.m36175a(inputStream);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19746a() {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").encodedAuthority(ccls.m130530i()).appendPath("download").appendPath("v1").appendEncodedPath(this.f33192a.f170837b).appendQueryParameter("alt", "media").appendQueryParameter("transaction_id", this.f33192a.f170838c);
        bzoa bzoa = this.f33192a.f170836a;
        if (bzoa == null) {
            bzoa = bzoa.f170784c;
        }
        lym.m24666a(appendQueryParameter, bzoa);
        return appendQueryParameter.build().toString();
    }
}

package p000;

import android.net.Uri;
import java.io.InputStream;

/* renamed from: lxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lxx extends lyr {

    /* renamed from: a */
    final /* synthetic */ bzoe f33175a;

    public lxx(bzoe bzoe) {
        this.f33175a = bzoe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19743a(InputStream inputStream) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19744a() {
        Uri.Builder appendQueryParameter = lye.m24636a().appendEncodedPath(String.valueOf(this.f33175a.f170802b).concat(":commitTransaction")).appendQueryParameter("transaction_id", this.f33175a.f170803c);
        bzoa bzoa = this.f33175a.f170801a;
        if (bzoa == null) {
            bzoa = bzoa.f170784c;
        }
        lye.m24637a(appendQueryParameter, bzoa);
        return appendQueryParameter.build().toString();
    }
}

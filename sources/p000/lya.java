package p000;

import android.net.Uri;
import java.io.InputStream;

/* renamed from: lya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lya extends lyq {

    /* renamed from: a */
    final /* synthetic */ bzon f33178a;

    public lya(bzon bzon) {
        this.f33178a = bzon;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19745a(InputStream inputStream) {
        return (bzoo) bxvk.m124010a(bzoo.f170846c, inputStream);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19746a() {
        Uri.Builder appendQueryParameter = lye.m24636a().appendEncodedPath(this.f33178a.f170842b).appendPath("files").appendQueryParameter("transaction_id", this.f33178a.f170845e).appendQueryParameter("page_size", String.valueOf(this.f33178a.f170843c)).appendQueryParameter("page_token", this.f33178a.f170844d);
        bzoa bzoa = this.f33178a.f170841a;
        if (bzoa == null) {
            bzoa = bzoa.f170784c;
        }
        lye.m24637a(appendQueryParameter, bzoa);
        return appendQueryParameter.build().toString();
    }
}

package p000;

import android.net.Uri;
import java.io.InputStream;

/* renamed from: lxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lxw extends lyr {

    /* renamed from: a */
    final /* synthetic */ bzop f33174a;

    public lxw(bzop bzop) {
        this.f33174a = bzop;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19743a(InputStream inputStream) {
        return (bzoq) bxvk.m124010a(bzoq.f170857b, inputStream);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19744a() {
        Uri.Builder appendEncodedPath = lye.m24636a().appendEncodedPath(String.valueOf(this.f33174a.f170854b).concat(":startTransaction"));
        bzos bzos = this.f33174a.f170855c;
        if (bzos == null) {
            bzos = bzos.f170860b;
        }
        Uri.Builder appendQueryParameter = appendEncodedPath.appendQueryParameter("transaction_options.mode", String.valueOf(bzos.f170862a));
        bzos bzos2 = this.f33174a.f170855c;
        if (bzos2 == null) {
            bzos2 = bzos.f170860b;
        }
        int i = bzos2.f170862a;
        char c = 2;
        if (i != 0) {
            c = i != 1 ? i != 2 ? (char) 0 : 4 : 3;
        }
        if (c != 0 && c == 4) {
            appendQueryParameter.appendQueryParameter("max_transaction_size", String.valueOf(this.f33174a.f170856d));
        }
        bzoa bzoa = this.f33174a.f170853a;
        if (bzoa == null) {
            bzoa = bzoa.f170784c;
        }
        lye.m24637a(appendQueryParameter, bzoa);
        return appendQueryParameter.build().toString();
    }
}

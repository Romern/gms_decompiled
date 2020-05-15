package p000;

import android.net.Uri;

/* renamed from: bekw */
final /* synthetic */ class bekw implements bmxj {

    /* renamed from: a */
    private final bekx f111744a;

    /* renamed from: b */
    private final Uri f111745b;

    public bekw(bekx bekx, Uri uri) {
        this.f111744a = bekx;
        this.f111745b = uri;
    }

    public final Object apply(Object obj) {
        bekx bekx = this.f111744a;
        Uri uri = this.f111745b;
        String str = (String) obj;
        bnzc bnzc = bekx.f111746a;
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(str);
        return bnzc.mo68721a(sb.toString(), bmwy.f131158c).toString();
    }
}

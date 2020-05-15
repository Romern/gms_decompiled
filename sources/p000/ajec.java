package p000;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;

/* renamed from: ajec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ajec extends sgv {
    /* JADX WARNING: Illegal instructions before constructor call */
    public ajec(Context context, String str, int i) {
        super(r1, r2, r3, r4, r5, r6, (r10 == null ? byyh.f168933c : r10).f168936b, str);
        Context applicationContext = context.getApplicationContext();
        String m = cfop.m141883m();
        String l = cfop.m141882l();
        byyl byyl = ((ajat) ahgz.m55754a(context, ajat.class)).f70278f.f168921d;
        boolean z = (byyl == null ? byyl.f168949v : byyl).f168963n;
        byyl byyl2 = ((ajat) ahgz.m55754a(context, ajat.class)).f70278f.f168921d;
        boolean z2 = (byyl2 == null ? byyl.f168949v : byyl2).f168964o;
        String b = cfop.m141872b();
        byyh byyh = ((ajat) ahgz.m55754a(context, ajat.class)).f70278f.f168920c;
        mo25521a(i);
    }

    /* renamed from: a */
    public final String mo38542a(String str) {
        return mo25518a(this.f44444d, str);
    }

    /* renamed from: b */
    public RetryPolicy mo38543b(String str) {
        return new sgu(this, str, (int) cfop.f185115a.mo6606a().mo82232k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9812a(Request request, String str) {
        request.setRetryPolicy(mo38543b(str));
    }
}

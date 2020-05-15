package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: rit */
final /* synthetic */ class rit implements Runnable {

    /* renamed from: a */
    private final riu f43088a;

    /* renamed from: b */
    private final Context f43089b;

    /* renamed from: c */
    private final int f43090c;

    public rit(riu riu, Context context, int i) {
        this.f43088a = riu;
        this.f43089b = context;
        this.f43090c = i;
    }

    public final void run() {
        byte[] bArr;
        riu riu = this.f43088a;
        Context context = this.f43089b;
        int i = this.f43090c;
        bxvd da = bpvn.f139389h.mo74144da();
        int i2 = riu.f43092a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvn bpvn = (bpvn) da.f164949b;
        int i3 = bpvn.f139391a | 1;
        bpvn.f139391a = i3;
        bpvn.f139392b = i2;
        String str = riu.f43093b;
        str.getClass();
        bpvn.f139391a = i3 | 2;
        bpvn.f139393c = str;
        bpvn.f139397g = riu.f43094c.mo3214a();
        bpvn.f139391a |= 64;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvn bpvn2 = (bpvn) da.f164949b;
        int i4 = bpvn2.f139391a | 16;
        bpvn2.f139391a = i4;
        bpvn2.f139395e = i;
        bpvn2.f139391a = i4 | 32;
        bpvn2.f139396f = 1;
        byte[] bArr2 = riu.f43095d;
        if (bArr2 == null) {
            try {
                bArr = spo.m35904a(context, riu.f43093b, "SHA-256");
            } catch (PackageManager.NameNotFoundException e) {
                bArr = null;
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            riu.f43095d = bArr;
            bArr2 = riu.f43095d;
        }
        bxtx a = bxtx.m123261a(bArr2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvn bpvn3 = (bpvn) da.f164949b;
        a.getClass();
        bpvn3.f139391a |= 4;
        bpvn3.f139394d = a;
        bpvn bpvn4 = (bpvn) da.mo74062i();
        bxvd da2 = bpvf.f139321t.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpvf bpvf = (bpvf) da2.f164949b;
        bpvn4.getClass();
        if (!bpvf.f139326d.mo73666a()) {
            bpvf.f139326d = bxvk.m124021a(bpvf.f139326d);
        }
        bpvf.f139326d.add(bpvn4);
        qwo a2 = sfa.m35133a().mo25463b(context).mo24333a((bpvf) da2.mo74062i());
        a2.mo24329b("service_connections");
        a2.mo24328b(6);
        a2.f42322f = cagz.UNMETERED_OR_DAILY;
        a2.mo24327b();
    }
}

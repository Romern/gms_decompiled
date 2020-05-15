package p000;

import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

/* renamed from: arlv */
final /* synthetic */ class arlv implements aubg {

    /* renamed from: a */
    private final arly f87868a;

    /* renamed from: b */
    private final int f87869b;

    public arlv(arly arly, int i) {
        this.f87868a = arly;
        this.f87869b = i;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        String str;
        byte[] a;
        int length;
        arly arly = this.f87868a;
        int i = this.f87869b;
        Exception e = aucb.mo50387e();
        if (!(e instanceof rjp) || ((rjp) e).mo24655a() != 10501) {
            if (aucb.mo50384b()) {
                str = (String) aucb.mo50386d();
            } else {
                str = "";
            }
            String str2 = null;
            if (cgps.f187469a.mo6606a().mo84247d() && (a = spn.m35862a(Long.toString(spn.m35843a(arly.f87872c)), "SHA1")) != null && (length = a.length) >= 2) {
                byte[] bArr = new byte[2];
                bArr[1] = a[length - 1];
                bArr[0] = (byte) (a[length - 2] & 3);
                str2 = srv.m36160a(bArr);
            }
            return new WorkProfilePayload(str, i - 1, str2);
        }
        throw e;
    }
}

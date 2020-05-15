package p000;

/* renamed from: chx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chx {

    /* renamed from: a */
    private final cqy f6887a = new cqy(1000);

    /* renamed from: b */
    private final C1241og f6888b = crl.m7409a(10, new chv());

    /* renamed from: a */
    public final String mo3909a(cdg cdg) {
        String str;
        synchronized (this.f6887a) {
            str = (String) this.f6887a.mo8173b(cdg);
        }
        if (str == null) {
            chw chw = (chw) this.f6888b.mo8188a();
            crb.m7382a(chw);
            try {
                cdg.mo3732a(chw.f6885a);
                byte[] digest = chw.f6885a.digest();
                synchronized (crd.f11879b) {
                    char[] cArr = crd.f11879b;
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i] & 255;
                        int i2 = i + i;
                        cArr[i2] = crd.f11878a[b >>> 4];
                        cArr[i2 + 1] = crd.f11878a[b & 15];
                    }
                    str = new String(cArr);
                }
                this.f6888b.mo8189a(chw);
            } catch (Throwable th) {
                this.f6888b.mo8189a(chw);
                throw th;
            }
        }
        synchronized (this.f6887a) {
            this.f6887a.mo8174b(cdg, str);
        }
        return str;
    }
}

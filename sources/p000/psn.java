package p000;

import android.text.TextUtils;

/* renamed from: psn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class psn implements pud {

    /* renamed from: a */
    public prs f40151a;

    /* renamed from: b */
    final /* synthetic */ psx f40152b;

    /* renamed from: c */
    private long f40153c = 0;

    public psn(psx psx) {
        this.f40152b = psx;
    }

    /* renamed from: a */
    public final long mo23227a() {
        long j = this.f40153c + 1;
        this.f40153c = j;
        return j;
    }

    /* renamed from: a */
    public final void mo23229a(String str, byte[] bArr, long j, String str2) {
    }

    /* renamed from: a */
    public final void mo23230a(String str, byte[] bArr, String str2) {
    }

    /* renamed from: b */
    public final void mo23231b(String str, String str2, long j, String str3) {
    }

    /* renamed from: a */
    public final void mo23228a(String str, String str2, long j, String str3) {
        prw prw;
        prs prs = this.f40151a;
        if (prs != null) {
            pep pep = ((prt) prs).f40120a;
            if (pep != null) {
                ptk.m31232a(str);
                if (TextUtils.isEmpty(str2)) {
                    throw new IllegalArgumentException("The message payload cannot be null or empty");
                } else if (str2.length() <= 524288) {
                    roz b = rpa.m34196b();
                    b.f43472a = new pfi((pfv) pep, str, str2);
                    aucb b2 = ((rjx) pep).mo24732b(b.mo24977a());
                    prw = new prw();
                    b2.mo50373a(new pru(prw));
                    b2.mo50372a(new prv(prw));
                } else {
                    pfv.f39050a.mo23675c("Message send failed. Message exceeds maximum size", new Object[0]);
                    throw new IllegalArgumentException("Message exceeds maximum size524288");
                }
            } else {
                prw = null;
            }
            prw.mo9458a(new psm(this, j));
            return;
        }
        throw new IllegalStateException("No GoogleApiClient available");
    }
}

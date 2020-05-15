package p000;

import java.util.Arrays;

/* renamed from: ahqa */
final /* synthetic */ class ahqa implements Runnable {

    /* renamed from: a */
    private final ahqc f67771a;

    /* renamed from: b */
    private final aivw f67772b;

    /* renamed from: c */
    private final byte[] f67773c;

    public ahqa(ahqc ahqc, aivw aivw, byte[] bArr) {
        this.f67771a = ahqc;
        this.f67772b = aivw;
        this.f67773c = bArr;
    }

    public final void run() {
        ahqc ahqc = this.f67771a;
        aivw aivw = this.f67772b;
        byte[] bArr = this.f67773c;
        if (!ahqc.f67776a.mo36728k()) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Skipping discovery of %s because we are no longer discovering.", aivw);
            return;
        }
        ahrh a = ahrh.m56417a(bArr);
        if (a == null) {
            srn srn = ahkm.f67363a;
            ahkm.m55981a(bArr);
        } else if (a.f67870b != 3) {
            srn srn2 = ahkm.f67363a;
            ahkm.m55981a(bArr);
        } else if (!Arrays.equals(a.f67872d, ahqc.f67778c)) {
            srn srn3 = ahkm.f67363a;
            ahkm.m55981a(bArr);
            ahkm.m55981a(ahqc.f67778c);
            ahkm.m55981a(a.f67872d);
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Found WifiAwareServiceInfo %s (with EndpointId %s and EndpointInfo %s)", bArr, a.f67871c, ahkm.m55981a(a.f67873e));
            ahqf ahqf = new ahqf(aivw, a.f67871c, a.f67873e, ahqc.f67777b);
            ahqc.f67779d.put(aivw, ahqf);
            ahqc.f67780e.mo36851b(ahqc.f67776a, ahqf);
        }
    }
}

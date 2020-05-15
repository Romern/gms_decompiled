package p000;

import java.util.Arrays;

/* renamed from: ahre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahre implements ahon {

    /* renamed from: a */
    final /* synthetic */ butt f67861a;

    /* renamed from: b */
    final /* synthetic */ bqgy f67862b;

    public ahre(butt butt, bqgy bqgy) {
        this.f67861a = butt;
        this.f67862b = bqgy;
    }

    /* renamed from: a */
    public final void mo36907a(aivw aivw) {
        srn srn = ahkm.f67363a;
    }

    /* renamed from: a */
    public final void mo36908a(aivw aivw, byte[] bArr) {
        if (!Arrays.equals(this.f67861a.f154872c.mo73780k(), bArr)) {
            srn srn = ahkm.f67363a;
            ahkm.m55981a(bArr);
            return;
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("WifiAwareBandwidthUpgradeMedium discovered serviceInfo %s", ahkm.m55981a(bArr));
        this.f67862b.mo69138b(aivw);
    }
}

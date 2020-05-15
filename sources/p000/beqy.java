package p000;

import java.util.Map;
import java.util.Set;

/* renamed from: beqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqy extends beqw {

    /* renamed from: r */
    public final beth f112095r;

    public beqy(bglx bglx, bhck bhck, bgmk bgmk, bfor bfor, betm betm, beth beth) {
        super(bglx, bhck, bfor, betm);
        this.f112095r = beth;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bfft mo60958a(Map map, int i, long j, bgmj bgmj, boolean z) {
        bfgy bfgy = new bfgy(i, j / 1000000);
        Set a = bfgt.m96707a(bfgt.f113814d);
        if (z) {
            a.add(bfgt.f113821k);
        }
        return this.f112091o.mo62765a(true, a, map, 0, bfgy, new beqx(this), "SignalCollector", bgmj);
    }
}

package p000;

import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: bfte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfte {

    /* renamed from: a */
    public final bmzi f115196a = bmzn.m108681a(bftd.f115195a);

    /* renamed from: b */
    public final Deque f115197b = new LinkedBlockingDeque();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62231a() {
        long j;
        long j2;
        budf budf;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (bucu bucu : this.f115197b) {
            int a = buct.m119339a(bucu.f153411a);
            int i4 = a - 1;
            if (a != 0) {
                if (i4 == 0) {
                    if (bucu.f153411a == 2) {
                        budf = (budf) bucu.f153412b;
                    } else {
                        budf = budf.f153455c;
                    }
                    if (budd.m119349a(budf.f153457a) == 1) {
                        i3++;
                    }
                } else if (i4 == 1 || i4 == 2) {
                    i++;
                    j4 = bucu.f153413c;
                } else if (i4 == 3) {
                    i2++;
                }
                j3 = bucu.f153413c;
            } else {
                throw null;
            }
        }
        if (!this.f115197b.isEmpty()) {
            j = j3;
            j2 = ((bucu) this.f115197b.getLast()).f153413c - ((bucu) this.f115197b.getFirst()).f153413c;
        } else {
            j = j3;
            j2 = 0;
        }
        return j2 > cest.f183409a.mo6606a().flpBluePixelBatchMinDurationNs() && ((long) i) >= cest.m138199e() && ((long) i2) >= cest.f183409a.mo6606a().flpBluePixelBatchMinStepElements() && ((long) i3) >= cest.f183409a.mo6606a().flpBluePixelBatchMinBearingElements() && ((cest.m138199e() > 0 ? 1 : (cest.m138199e() == 0 ? 0 : -1)) <= 0 || ((j - j4) > cest.f183409a.mo6606a().flpBluePixelBatchMaxTimeDeltaForLocationElementNanos() ? 1 : ((j - j4) == cest.f183409a.mo6606a().flpBluePixelBatchMaxTimeDeltaForLocationElementNanos() ? 0 : -1)) < 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Iterator mo62232b() {
        return this.f115197b.iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo62233c() {
        this.f115197b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo62234d() {
        return this.f115197b.isEmpty();
    }
}

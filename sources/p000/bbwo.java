package p000;

import android.util.Pair;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: bbwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbwo implements bbqr {

    /* renamed from: a */
    final /* synthetic */ bbwq f103597a;

    public bbwo(bbwq bbwq) {
        this.f103597a = bbwq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r6.contains(r5.getKey()) == false) goto L_0x0060;
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56377a(Object obj) {
        Boolean bool = (Boolean) obj;
        synchronized (this.f103597a) {
            if (bool.booleanValue()) {
                bbqw.m88429a();
                if (bbqw.m88430a(this.f103597a.f103603a)) {
                    bbon.m88284a();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = Long.MAX_VALUE;
                    for (Map.Entry entry : this.f103597a.f103622t.entrySet()) {
                        if (((Long) ((Pair) entry.getValue()).second).longValue() <= currentTimeMillis) {
                            HashSet hashSet = this.f103597a.f103621s;
                            if (hashSet == null) {
                            }
                            this.f103597a.mo56475d((bcoh) entry.getKey()).mo56426d();
                            entry.setValue(new Pair((Integer) ((Pair) entry.getValue()).first, Long.valueOf(TimeUnit.SECONDS.toMillis((long) ((Integer) ((Pair) entry.getValue()).first).intValue()) + currentTimeMillis)));
                        }
                        j = Math.min(((Long) ((Pair) entry.getValue()).second).longValue(), j);
                    }
                    bbwq bbwq = this.f103597a;
                    bbwq.f103616n.postDelayed(bbwq.f103628z, j - currentTimeMillis);
                }
            }
            this.f103597a.f103622t.clear();
        }
    }
}

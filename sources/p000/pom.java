package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: pom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pom extends poq {

    /* renamed from: c */
    private final Set f39925c;

    public pom(pnl pnl, plx plx, Set set) {
        super(pnl, plx, true, false, "GuestModeWifiScanOperation");
        HashSet hashSet = new HashSet();
        this.f39925c = hashSet;
        hashSet.addAll(set);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnr e = pnl.mo23495e();
        HashSet hashSet = new HashSet();
        for (String str : this.f39925c) {
            hashSet.add(str.replace(":", ""));
        }
        for (pnm pnm : e.mo23505a()) {
            if (hashSet.remove(pnm.mo23497a().f39867c)) {
                pnm.mo23497a().f39869e = true;
            }
        }
        if (!hashSet.isEmpty()) {
            pnq a = e.f39873b.mo23497a();
            a.f39865a.addAll(hashSet);
            a.f39868d = false;
            a.f39869e = true;
        }
    }
}

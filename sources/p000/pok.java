package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: pok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pok extends poq {

    /* renamed from: c */
    private final Set f39920c = new HashSet();

    /* renamed from: d */
    private final Set f39921d = new HashSet();

    /* renamed from: e */
    private final long f39922e;

    public pok(pnl pnl, plx plx, Set set, Set set2, long j) {
        super(pnl, plx, true, false, "GuestModeAppInfoOperation");
        this.f39920c.addAll(set);
        this.f39921d.addAll(set2);
        this.f39922e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnr e = pnl.mo23495e();
        for (String str : this.f39920c) {
            e.mo23507a(new pnp(str, true, this.f39922e));
        }
        for (String str2 : this.f39921d) {
            e.mo23507a(new pnp(str2, false, this.f39922e));
        }
    }
}

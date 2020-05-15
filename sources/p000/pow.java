package p000;

import java.util.Collections;

/* renamed from: pow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pow extends poq {

    /* renamed from: c */
    private final String f39958c;

    /* renamed from: d */
    private final prc[] f39959d;

    public pow(pnl pnl, plx plx, String str, prc[] prcArr) {
        super(pnl, plx, true, false, "UpdateMultizoneMemberDevicesOperation");
        this.f39958c = str;
        this.f39959d = prcArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnm b = pnl.mo23487b(this.f39958c);
        if (b != null) {
            prc[] prcArr = this.f39959d;
            b.f39852i.clear();
            if (prcArr != null && prcArr.length > 0) {
                Collections.addAll(b.f39852i, prcArr);
            }
        }
    }
}

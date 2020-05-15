package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: por */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class por extends poq {

    /* renamed from: c */
    private final String f39938c;

    public por(pnl pnl, plx plx, String str) {
        super(pnl, plx, true, false, "RemoveGuestModePairedDeviceOperation");
        this.f39938c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnq a;
        pnr e = pnl.mo23495e();
        String str = this.f39938c;
        Iterator it = e.f39875d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            pnm pnm = (pnm) entry.getValue();
            if (ptk.m31236a(str, pnm.f39844a.mo17494a()) && (a = pnm.mo23497a()) != null && ptk.m31236a(a.f39867c.replace(":", ""), (String) entry.getKey())) {
                it.remove();
            }
        }
    }
}

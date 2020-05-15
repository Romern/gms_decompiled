package p000;

import android.content.Context;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import java.util.Iterator;
import java.util.Map;

/* renamed from: pon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pon extends poq {

    /* renamed from: c */
    private final Context f39926c;

    /* renamed from: d */
    private final long f39927d;

    public pon(pnl pnl, plx plx, Context context, Long l) {
        super(pnl, plx, true, false, "InitializeGuestModeEntryOperation");
        this.f39926c = context;
        this.f39927d = l.longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnq pnq;
        pnr e = pnl.mo23495e();
        for (pnm pnm : e.mo23505a()) {
            pnm.mo23497a().f39869e = false;
        }
        pnm pnm2 = e.f39873b;
        if (pnm2 != null) {
            pnq = pnm2.mo23497a();
        } else {
            pnm2 = pnl.mo23482a(qaf.m31746a(this.f39926c));
            pnq = new pnq();
        }
        pnq.f39868d = false;
        pnq.f39869e = false;
        pnq.f39865a.clear();
        Iterator it = pnq.f39866b.entrySet().iterator();
        while (it.hasNext()) {
            if (this.f39927d - ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue() > ccxg.m132000c()) {
                it.remove();
            }
        }
        pnm2.f39847d = pnq;
        pnm2.f39853j = this.f39926c.getString(C0126R.string.cast_nearby_route_description_unidentified);
        e.f39873b = pnm2;
    }
}

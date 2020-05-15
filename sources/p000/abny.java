package p000;

import android.os.SystemClock;
import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: abny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abny extends TelephonyManager.CellInfoCallback {

    /* renamed from: a */
    List f57757a;

    /* renamed from: b */
    long f57758b = 0;

    /* renamed from: a */
    public final synchronized void mo32226a(int i) {
        if (this.f57757a == null) {
            super.wait((long) i);
        }
    }

    public final synchronized void onCellInfo(List list) {
        this.f57757a = list;
        if (celh.m137166b()) {
            ((beoj) abnd.m47941a().f97911m.mo6606a()).mo60852a((double) (SystemClock.elapsedRealtime() - this.f57758b), new Object[0]);
        }
        notifyAll();
    }
}

package p000;

import android.telephony.CellLocation;

/* renamed from: bfeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfeh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfei f113563a;

    public bfeh(bfei bfei) {
        this.f113563a = bfei;
    }

    public final void run() {
        CellLocation cellLocation;
        this.f113563a.f113807j.mo61864a();
        this.f113563a.f113805h.removeCallbacks(this);
        try {
            cellLocation = this.f113563a.f113564a.getCellLocation();
        } catch (SecurityException e) {
            cellLocation = null;
        }
        if (cellLocation != null) {
            this.f113563a.mo61535a(cellLocation);
        }
        this.f113563a.f113805h.postDelayed(this, 500);
    }
}

package p000;

import com.google.android.gms.cast.CastDevice;

/* renamed from: poo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class poo extends poq {

    /* renamed from: c */
    private final CastDevice f39928c;

    public poo(pnl pnl, plx plx, CastDevice castDevice) {
        super(pnl, plx, true, false, "MdnsDeviceOffline");
        this.f39928c = castDevice;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnm b = pnl.mo23487b(this.f39928c.mo17494a());
        if (b != null) {
            pnn pnn = b.f39846c;
            if (pnn == null) {
                pnn = new pnn();
                b.f39846c = pnn;
            }
            pnn.f39856a = false;
        }
    }
}

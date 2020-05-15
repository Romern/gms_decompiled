package p000;

import android.location.LocationListener;
import android.os.Looper;

/* renamed from: bfvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvh extends bfvo {

    /* renamed from: a */
    private final LocationListener f115408a;

    /* renamed from: b */
    private final bhbr f115409b;

    /* renamed from: c */
    private final Looper f115410c;

    public bfvh(bhbr bhbr, LocationListener locationListener, Looper looper) {
        this.f115408a = locationListener;
        this.f115409b = bhbr;
        this.f115410c = looper;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62293a() {
        if (!this.f115428u || !this.f115429v) {
            this.f115409b.mo63529a(this.f115408a);
        } else if (this.f115409b.f118271a.isProviderEnabled("passive")) {
            this.f115409b.mo63535a("passive", this.f115408a, this.f115410c, this.f115430w);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Passive[");
        mo62307a(sb);
        sb.append(']');
        return sb.toString();
    }
}

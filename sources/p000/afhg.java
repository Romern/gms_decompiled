package p000;

import android.os.RemoteException;

/* renamed from: afhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhg {

    /* renamed from: a */
    private final afig f64244a;

    public afhg(afig afig) {
        sdo.m34959a(afig);
        this.f64244a = afig;
    }

    /* renamed from: b */
    public final String mo34854b() {
        try {
            return this.f64244a.mo34889c();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afhg)) {
            return false;
        }
        try {
            return this.f64244a.mo34888a(((afhg) obj).f64244a);
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f64244a.mo34890d();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: a */
    public final void mo34853a() {
        try {
            this.f64244a.mo34887a();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }
}

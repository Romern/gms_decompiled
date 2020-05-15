package p000;

import android.os.RemoteException;

/* renamed from: afhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhb {

    /* renamed from: a */
    public final afia f64243a;

    public afhb(afia afia) {
        sdo.m34959a(afia);
        this.f64243a = afia;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afhb)) {
            return false;
        }
        try {
            return this.f64243a.mo34885a(((afhb) obj).f64243a);
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f64243a.mo34886c();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: a */
    public final void mo34841a() {
        try {
            this.f64243a.mo34882a();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: a */
    public final void mo34842a(boolean z) {
        try {
            this.f64243a.mo34884a(z);
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }
}

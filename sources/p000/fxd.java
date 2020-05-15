package p000;

import android.os.RemoteException;

/* renamed from: fxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxd implements fwz {

    /* renamed from: a */
    final /* synthetic */ fwr f17495a;

    public fxd(fwr fwr) {
        this.f17495a = fwr;
    }

    /* renamed from: a */
    public final void mo7245a(int i, int i2) {
        try {
            this.f17495a.mo11447a(i, i2);
        } catch (RemoteException e) {
            bqye.m113758a(e);
        }
    }

    /* renamed from: b */
    public final void mo7252b(int i, int i2) {
        try {
            this.f17495a.mo11448b(i, i2);
        } catch (RemoteException e) {
            bqye.m113758a(e);
        }
    }

    /* renamed from: e */
    public final void mo7255e() {
        try {
            this.f17495a.mo11446a();
        } catch (RemoteException e) {
            bqye.m113758a(e);
        }
    }
}

package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aale */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aale extends dck implements aalf {

    /* renamed from: a */
    final /* synthetic */ aakx f28405a;

    public aale() {
        super("com.google.android.gms.gcm.IGcmServiceDiagnosticsCallback");
    }

    /* renamed from: a */
    public final void mo16967a(aalc aalc) {
        synchronized (this.f28405a) {
            this.f28405a.f28394b = aalc;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aale(aakx aakx) {
        super("com.google.android.gms.gcm.IGcmServiceDiagnosticsCallback");
        this.f28405a = aakx;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aalc aalc;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.gcm.IGcmServiceDiagnostics");
            aalc = queryLocalInterface instanceof aalc ? (aalc) queryLocalInterface : new aala(readStrongBinder);
        } else {
            aalc = null;
        }
        mo16967a(aalc);
        return true;
    }
}

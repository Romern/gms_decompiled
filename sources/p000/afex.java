package p000;

import android.os.Parcel;

/* renamed from: afex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afex extends dck implements afey {

    /* renamed from: a */
    final /* synthetic */ bimm f64226a;

    public afex() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        this.f64226a.f120909a.f120912a.f120938e.mo64767b(true);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afex(bimm bimm) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
        this.f64226a = bimm;
    }
}

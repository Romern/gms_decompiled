package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* renamed from: aejt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aejt extends dcj implements aejv {
    public aejt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* renamed from: a */
    public final void mo34142a() {
        mo8530c(2, mo8529bj());
    }

    /* renamed from: a */
    public final void mo34143a(FusedLocationProviderResult fusedLocationProviderResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, fusedLocationProviderResult);
        mo8530c(1, bj);
    }
}

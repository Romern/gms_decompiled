package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ptn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ptn extends dcj implements IInterface {
    public ptn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.IBundleCallback");
    }

    /* renamed from: a */
    public final void mo23644a(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        mo8530c(1, bj);
    }
}

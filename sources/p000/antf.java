package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: antf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class antf extends dcj implements antg {
    public antf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.dynamite.IAddToCirclesCallbacks");
    }

    /* renamed from: a */
    public final void mo42224a(Intent intent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, intent);
        mo8528b(2, bj);
    }
}

package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: alav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alav extends dcj implements IInterface {
    public alav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.panorama.internal.IPanoramaCallbacks");
    }

    /* renamed from: a */
    public final void mo40057a(int i, Intent intent) {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        dcl.m8165a(bj, (Parcelable) null);
        bj.writeInt(i);
        dcl.m8165a(bj, intent);
        mo8528b(1, bj);
    }
}

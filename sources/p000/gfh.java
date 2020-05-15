package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: gfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gfh extends dcj implements gfj {
    public gfh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
    }

    /* renamed from: a */
    public final void mo11765a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(1, bj);
    }
}

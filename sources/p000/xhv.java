package p000;

import android.nfc.Tag;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: xhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xhv extends dcj implements xhx {
    public xhv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.common.nfc.INfcReaderCallback");
    }

    /* renamed from: a */
    public final void mo29740a(Tag tag) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, tag);
        mo8528b(1, bj);
    }
}

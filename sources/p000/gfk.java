package p000;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: gfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gfk extends dcj implements gfm {
    public gfk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
    }

    /* renamed from: a */
    public final void mo11766a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo11767a(List list) {
        Parcel bj = mo8529bj();
        bj.writeTypedList(list);
        mo8528b(1, bj);
    }
}

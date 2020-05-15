package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwv extends dcj implements IInterface {
    public pwv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    /* renamed from: a */
    public final void mo23795a() {
        mo8528b(3, mo8529bj());
    }

    /* renamed from: a */
    public final void mo23796a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(2, bj);
    }
}

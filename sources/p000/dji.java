package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dji extends dcj implements djk {
    public dji(IBinder iBinder) {
        super(iBinder, "com.google.android.chimera.container.internal.IUpdateProgressListener");
    }

    /* renamed from: a */
    public final void mo8635a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(1, bj);
    }
}

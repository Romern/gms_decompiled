package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ajyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajyl extends dcj implements ajyn {
    public ajyl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IIntResultListener");
    }

    /* renamed from: a */
    public final void mo38891a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(1, bj);
    }
}

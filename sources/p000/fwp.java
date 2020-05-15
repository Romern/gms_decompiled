package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: fwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fwp extends dcj implements fwr {
    public fwp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appinvite.ui.context.ILoadingListener");
    }

    /* renamed from: a */
    public final void mo11446a() {
        mo8530c(3, mo8529bj());
    }

    /* renamed from: b */
    public final void mo11448b(int i, int i2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeInt(i2);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo11447a(int i, int i2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeInt(i2);
        mo8530c(1, bj);
    }
}

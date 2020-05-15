package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: fzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzz extends dcj implements IInterface {
    public fzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appstate.internal.IAppStateCallbacks");
    }

    /* renamed from: a */
    public final void mo11571a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(5005, bj);
    }

    /* renamed from: b */
    public final void mo11574b(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(6);
        bj.writeInt(i);
        mo8528b(5003, bj);
    }

    /* renamed from: a */
    public final void mo11572a(int i, DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, dataHolder);
        mo8528b(5001, bj);
    }

    /* renamed from: a */
    public final void mo11573a(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8528b(5002, bj);
    }
}

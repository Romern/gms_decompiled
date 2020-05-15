package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: aril */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aril extends dcj implements arin {
    public aril(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
    }

    /* renamed from: a */
    public final void mo48566a() {
        mo8528b(2, mo8529bj());
    }

    /* renamed from: a */
    public final void mo48567a(BootstrapProgressResult bootstrapProgressResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bootstrapProgressResult);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo48568a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(3, bj);
    }
}

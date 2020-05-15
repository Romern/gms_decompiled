package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: ario */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ario extends dcj implements ariq {
    public ario(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
    }

    /* renamed from: a */
    public final void mo48569a() {
        mo8528b(2, mo8529bj());
    }

    /* renamed from: a */
    public final void mo48570a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo48571a(BootstrapOptions bootstrapOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bootstrapOptions);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo48572a(VerificationInfo verificationInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, verificationInfo);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo48573a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(3, bj);
    }
}

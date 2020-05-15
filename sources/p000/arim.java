package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: arim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arim extends dck implements arin {

    /* renamed from: a */
    public final arao f87780a;

    /* renamed from: b */
    protected final Handler f87781b;

    public arim() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
    }

    /* renamed from: a */
    public final void mo48566a() {
        this.f87781b.sendEmptyMessage(1);
    }

    /* renamed from: a */
    public final void mo48567a(BootstrapProgressResult bootstrapProgressResult) {
        Handler handler = this.f87781b;
        handler.sendMessage(handler.obtainMessage(0, bootstrapProgressResult));
    }

    public arim(arao arao) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
        this.f87781b = new arjm(this, Looper.getMainLooper());
        sdo.checkIfNull(arao, "listener cannot be null.");
        this.f87780a = arao;
    }

    /* renamed from: a */
    public final void mo48568a(String str) {
        Handler handler = this.f87781b;
        handler.sendMessage(handler.obtainMessage(2, str));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo48567a((BootstrapProgressResult) dcl.m8163a(parcel, BootstrapProgressResult.CREATOR));
        } else if (i == 2) {
            mo48566a();
        } else if (i != 3) {
            return false;
        } else {
            mo48568a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}

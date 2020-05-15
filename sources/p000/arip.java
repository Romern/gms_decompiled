package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: arip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arip extends dck implements ariq {

    /* renamed from: a */
    public final arar f87782a;

    /* renamed from: b */
    protected final Handler f87783b;

    public arip() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
    }

    /* renamed from: a */
    public void mo48569a() {
        this.f87783b.sendEmptyMessage(1);
    }

    public arip(arar arar) {
        this();
        this.f87783b = new arjn(this, Looper.getMainLooper());
        sdo.m34966a(arar, "listener cannot be null.");
        this.f87782a = arar;
    }

    /* renamed from: a */
    public void mo48570a(int i) {
        Handler handler = this.f87783b;
        handler.sendMessage(handler.obtainMessage(3, Integer.valueOf(i)));
    }

    /* renamed from: a */
    public void mo48571a(BootstrapOptions bootstrapOptions) {
        Handler handler = this.f87783b;
        handler.sendMessage(handler.obtainMessage(0, bootstrapOptions));
    }

    /* renamed from: a */
    public void mo48572a(VerificationInfo verificationInfo) {
        Handler handler = this.f87783b;
        handler.sendMessage(handler.obtainMessage(4, verificationInfo));
    }

    /* renamed from: a */
    public void mo48573a(String str) {
        Handler handler = this.f87783b;
        handler.sendMessage(handler.obtainMessage(2, str));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo48571a((BootstrapOptions) dcl.m8163a(parcel, BootstrapOptions.CREATOR));
        } else if (i == 2) {
            mo48569a();
        } else if (i == 3) {
            mo48573a(parcel.readString());
        } else if (i == 4) {
            mo48570a(parcel.readInt());
        } else if (i != 5) {
            return false;
        } else {
            mo48572a((VerificationInfo) dcl.m8163a(parcel, VerificationInfo.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

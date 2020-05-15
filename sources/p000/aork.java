package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: aork */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aork extends dcj implements IInterface {
    public aork(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptcha.internal.IInitCallback");
    }

    /* renamed from: a */
    public final void mo43192a(Status status, RecaptchaHandle recaptchaHandle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, recaptchaHandle);
        mo8530c(1, bj);
    }
}

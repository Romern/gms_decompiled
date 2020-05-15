package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.authzen.legacy.internal.OtpSecret;
import com.google.android.gms.common.api.Status;

/* renamed from: iim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iim extends dcj implements IInterface {
    public iim(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.authzen.legacy.internal.IGetSecretCallback");
    }

    /* renamed from: a */
    public final void mo13043a(Status status, OtpSecret otpSecret) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, otpSecret);
        mo8530c(1, bj);
    }
}

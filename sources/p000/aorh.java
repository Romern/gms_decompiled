package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* renamed from: aorh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aorh extends dcj implements aorj {
    public aorh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptcha.internal.IExecuteCallback");
    }

    /* renamed from: a */
    public final void mo43191a(Status status, RecaptchaResultData recaptchaResultData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, recaptchaResultData);
        mo8530c(1, bj);
    }
}

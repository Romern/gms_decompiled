package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: aorl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aorl extends dcj implements aorn {
    public aorl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptcha.internal.IRecaptchaService");
    }

    /* renamed from: a */
    public final void mo43156a(aorg aorg) {
        throw null;
    }

    /* renamed from: a */
    public final void mo43157a(aorj aorj, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) {
        throw null;
    }

    /* renamed from: a */
    public final void mo43159a(aork aork, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo43158a(aorj aorj, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aorj);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(1, bj);
    }
}

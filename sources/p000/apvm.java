package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* renamed from: apvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apvm implements aubw {

    /* renamed from: a */
    final /* synthetic */ apvn f84991a;

    public apvm(apvn apvn) {
        this.f84991a = apvn;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        try {
            this.f84991a.mo47659a(new Status(0), ((RecaptchaResultData) obj).f83501a);
        } catch (RemoteException e) {
            this.f84991a.mo47660a(e);
        }
    }
}

package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* renamed from: aora */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aora implements bqfp {

    /* renamed from: a */
    final /* synthetic */ aorb f78722a;

    public aora(aorb aorb) {
        this.f78722a = aorb;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        String str = (String) obj;
        aorb aorb = this.f78722a;
        Status status = new Status(0);
        aorj aorj = aorb.f78724b;
        if (aorj != null) {
            try {
                aorj.mo43191a(status, new RecaptchaResultData(str));
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (th instanceof aopw) {
            this.f78722a.mo43187b(new Status(8, "Error during initialization step - read/write local cache failed"));
        } else if (th instanceof aopv) {
            Exception exc = (Exception) th.getCause();
            if (exc instanceof aoqt) {
                this.f78722a.mo43187b(new Status(7, "Error during initialization step - server connection failed"));
            } else if (exc instanceof aopo) {
                aorb aorb = this.f78722a;
                int i = ((aopo) exc).f78656a;
                StringBuilder sb = new StringBuilder(92);
                sb.append("Error during initialization step - failed to fetch initialization data - status: ");
                sb.append(i);
                aorb.mo43187b(new Status(13, sb.toString()));
            }
        } else if (th instanceof aopl) {
            this.f78722a.mo43187b(new Status(13, ((aopl) th).getMessage()));
        } else if (th instanceof aoqt) {
            this.f78722a.mo43187b(new Status(7, ((aoqt) th).getMessage()));
        } else if (th instanceof aopo) {
            this.f78722a.mo43187b(new Status(13, ((aopo) th).getMessage()));
        } else {
            this.f78722a.mo43187b(new Status(8, "Internal error during execution"));
        }
    }
}

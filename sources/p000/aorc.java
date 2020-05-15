package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import java.io.IOException;

/* renamed from: aorc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aorc implements bqfp {

    /* renamed from: a */
    final /* synthetic */ aord f78732a;

    public aorc(aord aord) {
        this.f78732a = aord;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        aord aord = this.f78732a;
        Status status = new Status(0);
        bxwc bxwc = ((aorx) obj).f78749c;
        aork aork = aord.f78736d;
        if (aork != null) {
            try {
                aork.mo43192a(status, new RecaptchaHandle(aord.f78734b, aord.f78735c, bxwc));
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (th instanceof aoqt) {
            this.f78732a.mo43188b(new Status(7, th.getMessage()));
        } else if (th instanceof aopo) {
            aord aord = this.f78732a;
            int i = ((aopo) th).f78656a;
            StringBuilder sb = new StringBuilder(58);
            sb.append("Failed to fetch data for local cache - status: ");
            sb.append(i);
            aord.mo43188b(new Status(13, sb.toString()));
        } else if (th instanceof IOException) {
            this.f78732a.mo43188b(new Status(8, "Failed to read/write local cache"));
        } else {
            this.f78732a.mo43188b(new Status(8, "Internal error during init"));
        }
    }
}

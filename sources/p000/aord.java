package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaApiChimeraService;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: aord */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aord extends aaab {

    /* renamed from: a */
    final RecaptchaApiChimeraService f78733a;

    /* renamed from: b */
    final String f78734b;

    /* renamed from: c */
    final String f78735c;

    /* renamed from: d */
    public final aork f78736d;

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f78733a.mo46801a();
        bqga.m112781a(aopu.m66278a(context).mo43151a(this.f78734b, this.f78735c), new aorc(this), snp.m35702a(9));
    }

    /* renamed from: b */
    public final void mo43188b(Status status) {
        try {
            mo6503a(status);
        } catch (RemoteException e) {
        }
    }

    public aord(RecaptchaApiChimeraService recaptchaApiChimeraService, aork aork, String str, String str2) {
        super(205, "RecaptchaV3Init");
        this.f78733a = recaptchaApiChimeraService;
        this.f78736d = aork;
        this.f78734b = str;
        this.f78735c = str2;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        aork aork = this.f78736d;
        if (aork != null) {
            aork.mo43192a(status, (RecaptchaHandle) null);
        }
    }
}

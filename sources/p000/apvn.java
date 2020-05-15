package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import com.google.android.gms.security.recaptcha.RecaptchaVerifyOperation$3;

/* renamed from: apvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apvn extends aaab {

    /* renamed from: a */
    private final apga f84992a;

    /* renamed from: b */
    private final String f84993b;

    /* renamed from: c */
    private final String f84994c;

    static {
        apvn.class.getSimpleName();
    }

    public apvn(apga apga, String str, String str2) {
        super(45, "recaptcha");
        this.f84992a = apga;
        this.f84993b = str;
        this.f84994c = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!cgkt.f187180a.mo6606a().mo84035j()) {
            RecaptchaVerifyOperation$3 recaptchaVerifyOperation$3 = new RecaptchaVerifyOperation$3(this);
            Intent a = apuh.m71021a(context, RecaptchaChimeraActivity.class);
            a.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
            a.addFlags(268435456);
            a.addFlags(8388608);
            StringBuilder sb = new StringBuilder();
            apum.m71046a(sb, "k", this.f84993b);
            apum.m71046a(sb, "di", String.valueOf(spn.getAndroidId(context)));
            apum.m71046a(sb, "pk", this.f84994c);
            apum.m71046a(sb, "sv", String.valueOf(Build.VERSION.SDK_INT));
            apum.m71046a(sb, "gv", "20.15.15 (120300-{{cl}})");
            try {
                apum.m71046a(sb, "gm", String.valueOf(ModuleManager.get(context).getCurrentModule().moduleVersion));
            } catch (IllegalStateException e) {
            }
            apuf a2 = new apug(context).mo47623a(this.f84994c);
            if (a2 != null) {
                byte[] bArr = a2.f84912a;
                if (bArr != null) {
                    apum.m71046a(sb, "as", sqd.m35972d(bArr));
                }
                byte[][] bArr2 = a2.f84913b;
                if (bArr2 != null) {
                    for (byte[] bArr3 : bArr2) {
                        apum.m71046a(sb, "ac", sqd.m35972d(bArr3));
                    }
                }
                apum.m71046a(sb, "ip", a2.f84914c);
                apum.m71046a(sb, "av", String.valueOf(apuh.m71029c(context, this.f84994c)));
                apum.m71046a(sb, "si", a2.f84915d);
            }
            a.putExtra("params", sb.toString());
            a.putExtra("result", recaptchaVerifyOperation$3);
            context.startActivity(a);
            return;
        }
        aoqq aoqq = new aoqq(context);
        String str = this.f84993b;
        String str2 = this.f84994c;
        roz b = rpa.m34196b();
        b.f43472a = new aoqo(str, str2);
        b.f43473b = new Feature[]{aopn.f78651a};
        aucb a3 = aoqq.mo24701a(b.mo24977a());
        a3.mo50373a(new apvm(this));
        a3.mo50372a(new apvl(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f84992a.mo47170a(status, (RecaptchaResultData) null);
    }

    /* renamed from: a */
    public final void mo47659a(Status status, String str) {
        apga apga = this.f84992a;
        if (apga != null) {
            apga.mo47170a(status, new RecaptchaResultData(str));
        }
    }

    /* renamed from: a */
    public final void mo47660a(Exception exc) {
        Status status;
        try {
            if (!(exc instanceof rjp)) {
                status = new Status(13, "");
            } else {
                int a = ((rjp) exc).mo24655a();
                switch (a) {
                    case 36000:
                        a = 12006;
                        break;
                    case 36001:
                        a = 12007;
                        break;
                    case 36002:
                        a = 12008;
                        break;
                    case 36003:
                        a = 12013;
                        break;
                    case 36004:
                        a = 36004;
                        break;
                }
                status = new Status(a, rjs.m33677c(a));
            }
            mo6503a(status);
        } catch (RemoteException e) {
        }
    }
}

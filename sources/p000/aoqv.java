package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import com.google.android.gms.recaptcha.RecaptchaV2VerifyOperation$1;

/* renamed from: aoqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoqv extends aaab {

    /* renamed from: a */
    public final aorj f78710a;

    /* renamed from: b */
    final String f78711b;

    /* renamed from: c */
    final String f78712c;

    public aoqv(aorj aorj, String str, String str2) {
        super(205, "RecaptchaV2Verify");
        this.f78710a = aorj;
        this.f78711b = str;
        this.f78712c = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        RecaptchaV2VerifyOperation$1 recaptchaV2VerifyOperation$1 = new RecaptchaV2VerifyOperation$1(this);
        Intent a = aptj.m70970a(context, RecaptchaChimeraActivity.class);
        a.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        a.addFlags(268435456);
        a.addFlags(8388608);
        StringBuilder sb = new StringBuilder();
        aore.m66306a(sb, "k", this.f78711b);
        aore.m66306a(sb, "di", String.valueOf(spn.getAndroidId(context)));
        aore.m66306a(sb, "pk", this.f78712c);
        aore.m66306a(sb, "sv", String.valueOf(Build.VERSION.SDK_INT));
        aore.m66306a(sb, "gv", "20.15.15 (120300-{{cl}})");
        try {
            aore.m66306a(sb, "gm", String.valueOf(ModuleManager.get(context).getCurrentModule().moduleVersion));
        } catch (IllegalStateException e) {
        }
        apth a2 = new apti(context).mo47592a(this.f78712c);
        if (a2 != null) {
            byte[] bArr = a2.f84846a;
            if (bArr != null) {
                aore.m66306a(sb, "as", sqd.m35972d(bArr));
            }
            byte[][] bArr2 = a2.f84847b;
            if (bArr2 != null) {
                for (byte[] bArr3 : bArr2) {
                    aore.m66306a(sb, "ac", sqd.m35972d(bArr3));
                }
            }
            aore.m66306a(sb, "ip", a2.f84848c);
            aore.m66306a(sb, "av", String.valueOf(aptj.m70972a(context, this.f78712c)));
            aore.m66306a(sb, "si", a2.f84849d);
        }
        a.putExtra("params", sb.toString());
        a.putExtra("result", recaptchaV2VerifyOperation$1);
        context.startActivity(a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f78710a.mo43191a(status, null);
    }
}

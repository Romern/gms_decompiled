package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaApiChimeraService;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: aoqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoqb extends aorm implements aaai {

    /* renamed from: a */
    private final RecaptchaApiChimeraService f78675a;

    /* renamed from: b */
    private final aaag f78676b;

    /* renamed from: c */
    private final String f78677c;

    public aoqb(RecaptchaApiChimeraService recaptchaApiChimeraService, aaag aaag, String str) {
        this.f78675a = recaptchaApiChimeraService;
        this.f78676b = aaag;
        this.f78677c = str;
    }

    /* renamed from: a */
    private final boolean m66282a() {
        sre.m36088h(this.f78675a);
        return cgia.f186982a.mo6606a().mo83827a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aorg.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      dcj.a(int, android.os.Parcel):android.os.Parcel
      aorg.a(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: a */
    public final void mo43156a(aorg aorg) {
        if (m66282a()) {
            this.f78676b.mo16658a(new aoqw(this.f78675a, aorg));
        } else {
            aorg.mo43190a(new Status(36004, "Feature off: close"), false);
        }
    }

    /* renamed from: a */
    public final void mo43157a(aorj aorj, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) {
        if (m66282a()) {
            this.f78676b.mo16658a(new aorb(this.f78675a, aorj, recaptchaHandle, recaptchaAction));
        } else {
            aorj.mo43191a(new Status(36004, "Feature off: execute"), null);
        }
    }

    /* renamed from: a */
    public final void mo43158a(aorj aorj, String str, String str2) {
        if (cgia.f186982a.mo6606a().mo83828b()) {
            this.f78676b.mo16658a(new aoqv(aorj, str, str2));
        } else {
            aorj.mo43191a(new Status(36004, "Feature off: verifyWithRecaptcha"), null);
        }
    }

    /* renamed from: a */
    public final void mo43159a(aork aork, String str) {
        if (m66282a()) {
            this.f78676b.mo16658a(new aord(this.f78675a, aork, str, this.f78677c));
        } else {
            aork.mo43192a(new Status(36004, "Feature off: init"), (RecaptchaHandle) null);
        }
    }
}

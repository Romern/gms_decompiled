package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaApiChimeraService;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: aorb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aorb extends aaab {

    /* renamed from: a */
    final RecaptchaApiChimeraService f78723a;

    /* renamed from: b */
    public final aorj f78724b;

    /* renamed from: c */
    final String f78725c;

    /* renamed from: d */
    final String f78726d;

    /* renamed from: e */
    final String f78727e;

    /* renamed from: f */
    public final String f78728f;

    /* renamed from: g */
    public final Bundle f78729g;

    /* renamed from: h */
    public final aorp f78730h;

    /* renamed from: i */
    public final bqgj f78731i = snp.m35702a(9);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aorb(RecaptchaApiChimeraService recaptchaApiChimeraService, aorj aorj, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) {
        super(205, "RecaptchaV3Execute");
        aorp a = aorq.m66329a();
        this.f78723a = recaptchaApiChimeraService;
        this.f78724b = aorj;
        this.f78725c = recaptchaHandle.f83499b;
        this.f78726d = recaptchaHandle.f83498a;
        this.f78727e = recaptchaAction.toString();
        this.f78728f = recaptchaAction.f83480d;
        this.f78729g = recaptchaAction.f83479c;
        this.f78730h = a;
    }

    /* renamed from: b */
    public final void mo43187b(Status status) {
        try {
            mo6503a(status);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqga.m112781a(bqdx.m112674a(bqdf.m112620a(aopu.m66278a(context).mo43151a(this.f78726d, this.f78725c), Exception.class, bljx.m107266a(aoqx.f78715a), bqfb.INSTANCE), bljx.m107266a(new aoqy(this)), this.f78731i), new aora(this), this.f78731i);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        aorj aorj = this.f78724b;
        if (aorj != null) {
            aorj.mo43191a(status, null);
        }
    }
}

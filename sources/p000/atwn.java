package p000;

import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.p068ui.EnableSecureKeyguardChimeraActivity;

/* renamed from: atwn */
public final /* synthetic */ class atwn implements aubw {

    /* renamed from: a */
    private final EnableSecureKeyguardChimeraActivity f91052a;

    public atwn(EnableSecureKeyguardChimeraActivity enableSecureKeyguardChimeraActivity) {
        this.f91052a = enableSecureKeyguardChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        EnableSecureKeyguardChimeraActivity enableSecureKeyguardChimeraActivity = this.f91052a;
        enableSecureKeyguardChimeraActivity.f108949c = true;
        enableSecureKeyguardChimeraActivity.f108948b = (AccountInfo) obj;
        enableSecureKeyguardChimeraActivity.mo59495e();
    }
}

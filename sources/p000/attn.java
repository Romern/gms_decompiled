package p000;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attn extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public attn(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        aszy.m75270b(this.f90898f);
        aszy.m75267a();
        mo50180a(16, atsy);
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        boolean z = atsy.f90852o;
        if (atsy.f90811C.mo59217a()) {
            mo50180a(16, atsy);
            return;
        }
        if (atsy.f90856s) {
            try {
                mo50182a(atut.m76412a(atsy.f90857t, atsy.f90861x));
            } catch (RemoteException e) {
            }
        }
        Intent intent = new Intent("com.google.android.gms.tapandpay.ACTION_ENABLE_SECURE_KEYGUARD");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.ui.EnableSecureKeyguardActivity");
        intent.putExtra("data_keyguard_setup_required", atsy.f90856s);
        intent.putExtra("extra_alt_brand_name", this.f90898f.getIntent().getStringExtra("extra_alt_brand_name"));
        intent.putExtra("EXTRA_MONET_ONBOARDING", atsy.f90822N);
        intent.putExtra("extra_card_info", atsy.f90811C);
        atsy.f90856s = false;
        mo50181a(intent, 1);
    }
}

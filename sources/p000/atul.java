package p000;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atul extends atue {

    /* renamed from: a */
    private static final srn f90903a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public atul(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    private final boolean m76386a(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        try {
            int a = bmul.m108394a(((bmum) bxvk.m124016a(bmum.f130943d, bArr, bxus.m123744c())).f130947c);
            if (a == 0 || a != 2) {
                return false;
            }
            return true;
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f90903a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atul", "a", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to parse warm welcome info");
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r1 != 2) goto L_0x006c;
     */
    /* renamed from: b */
    private final void m76387b(atsy atsy) {
        Intent intent = new Intent("com.google.commerce.tapandpay.android.warmwelcome.ACTION_WARM_WELCOME");
        if (atxn.m76506a(this.f90898f, intent) && !atsy.mo50163a() && !atsy.mo50167e() && !atsy.f90811C.mo59217a()) {
            byte[] bArr = atsy.f90820L;
            if (bArr != null) {
                try {
                    int a = bmul.m108394a(((bmum) bxvk.m124016a(bmum.f130943d, bArr, bxus.m123744c())).f130947c);
                    if (a != 0) {
                    }
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) f90903a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("atul", "a", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to parse warm welcome info");
                }
            }
            intent.putExtra("new_card_info", atsy.f90811C);
            m76388e(atsy);
            mo50181a(intent, 1);
            return;
        }
        m76388e(atsy);
        Intent putExtra = new Intent("com.google.android.gms.tapandpay.ACTION_WARM_WELCOME").setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.ui.WarmWelcomeActivity").putExtra("extra_account_info", atsy.f90857t).putExtra("extra_card_info", atsy.f90811C).putExtra("felica_current_default_status", atsy.f90826R).putExtra("extra_is_web_push_provisioning", atsy.mo50167e());
        byte[] bArr2 = atsy.f90820L;
        if (bArr2 != null) {
            putExtra.putExtra("extra_warm_welcome_info", bArr2);
        }
        mo50181a(putExtra, 1);
    }

    /* renamed from: e */
    private final void m76388e(atsy atsy) {
        try {
            mo50182a(atve.m76448a(atsy.f90857t, atsy.f90861x));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f90903a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atul", "e", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unexpected RemoteException");
        }
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i == 1) {
            mo50180a(28, atsy);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (p000.atxn.m76506a(r5.f90898f, r1) != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r0 != null) goto L_0x0056;
     */
    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        if (atsy.f90811C.mo59217a()) {
            int i = atsy.f90826R;
            if (i == 0 || i == 1 || i == 2) {
                mo50180a(28, atsy);
            } else {
                m76387b(atsy);
            }
        } else {
            boolean booleanExtra = this.f90898f.getIntent().getBooleanExtra("extra_hide_warm_welcome", false);
            int i2 = atsy.f90831W;
            if (!booleanExtra && i2 == 1) {
                byte[] bArr = atsy.f90820L;
                if (!atsy.mo50164b()) {
                    if (atsy.mo50167e()) {
                        Intent intent = new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY");
                        intent.setFlags(268435456);
                    }
                }
                boolean z = atsy.f90852o;
                m76387b(atsy);
                return;
            }
            mo50180a(28, atsy);
        }
    }
}

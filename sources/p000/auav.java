package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.cast.JGCastService;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: auav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auav {

    /* renamed from: a */
    static final bnic f91344a = bnic.m109494a("com.google.android.gms.tapandpay.widgets.logging.LoggingDelegateTest.TestActivityInWhiteList", "com.google.android.gms.tapandpay.tokenization.TokenizePanActivity", "com.google.android.gms.tapandpay.wear.dialog.WearSecureKeyguardDialogActivity", "com.google.android.gms.tapandpay.wear.WearProxyCompanionActivity", "com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeActivity", "com.google.android.gms.tapandpay.ui.WarmWelcomeActivity", "com.google.android.gms.tapandpay.account.SelectAccountActivity", "com.google.android.gms.tapandpay.issuer.RequestTokenizeActivity", "com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoActivity", "com.google.android.gms.tapandpay.tap.TapKeyguardActivity", "com.google.android.gms.tapandpay.tokenization.AddNewCardForTokenizationActivity", "com.google.android.gms.tapandpay.ui.PromptSetupActivity", "com.google.android.gms.tapandpay.tokenization.SummaryActivity", "com.google.android.gms.tapandpay.ui.TokenizationSuccessActivity", "com.google.android.gms.tapandpay.settings.NotificationSettingsActivity", "com.google.android.gms.tapandpay.tokenization.AcceptTosActivity", "com.google.android.gms.tapandpay.ui.SecureDeviceActivity", "com.google.android.gms.tapandpay.settings.SelectOtherPaymentMethodActivity", "com.google.android.gms.tapandpay.tokenization.NameResolutionActivity", "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity", "com.google.android.gms.tapandpay.issuer.RequestDeleteTokenActivity", "com.google.android.gms.tapandpay.tap.TapUiActivity", "com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsActivity", "com.google.android.gms.tapandpay.issuer.RequestSelectTokenActivity", "com.google.android.gms.tapandpay.wear.WearProxyActivity", "com.google.android.gms.tapandpay.tokenization.EnableNfcActivity", "com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodActivity", "com.google.android.gms.tapandpay.ui.EnableSecureKeyguardActivity", "com.google.android.gms.tapandpay.wear.dialog.WearTapAndPayDialogActivity", "com.google.android.gms.tapandpay.admin.DeviceAdminPromptActivity", "com.google.android.gms.tapandpay.settings.SelectUntokenizedCardActivity", "com.google.android.gms.tapandpay.tokenization.AddNewCardThroughBrowserActivity", "com.google.android.gms.tapandpay.ui.ShowSecurityPromptActivity", "com.google.android.gms.tapandpay.tokenization.UnsupportedCardActivity");

    /* renamed from: b */
    static final bnic f91345b = bnic.m109489a("com.google.android.gms.tapandpay.widgets.logging.LoggingDelegateTest.TestActivityInBlackList");

    /* renamed from: c */
    private static final srn f91346c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private static Activity m76662a(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof com.google.android.chimera.Activity) {
            return ((com.google.android.chimera.Activity) context).getContainerActivity();
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return m76662a(baseContext);
    }

    /* renamed from: b */
    private static ateu m76665b(Context context) {
        Context baseContext;
        if (context instanceof ateu) {
            return (ateu) context;
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return m76665b(baseContext);
    }

    /* renamed from: a */
    private static String m76663a(Activity activity) {
        return activity.getClass().getCanonicalName();
    }

    /* renamed from: b */
    private static String m76666b(View view) {
        if (view.getId() != -1) {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        }
        String simpleName = view.getClass().getSimpleName();
        ViewParent parent = view.getParent();
        if (parent == null) {
            bnsl bnsl = (bnsl) f91346c.mo68387b();
            bnsl.mo68432a("auav", "b", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("View has no parent");
            return simpleName;
        } else if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int indexOfChild = viewGroup.indexOfChild(view);
            String b = m76666b(viewGroup);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 12 + String.valueOf(simpleName).length());
            sb.append(b);
            sb.append("_");
            sb.append(simpleName);
            sb.append(indexOfChild);
            return sb.toString();
        } else if (parent instanceof View) {
            String b2 = m76666b((View) parent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 1 + String.valueOf(simpleName).length());
            sb2.append(b2);
            sb2.append("_");
            sb2.append(simpleName);
            return sb2.toString();
        } else {
            String simpleName2 = parent.getClass().getSimpleName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(simpleName2).length() + 1 + String.valueOf(simpleName).length());
            sb3.append(simpleName2);
            sb3.append("_");
            sb3.append(simpleName);
            return sb3.toString();
        }
    }

    /* renamed from: a */
    public static void m76664a(View view) {
        AccountInfo accountInfo;
        ateu b = m76665b(view.getContext());
        if (b != null) {
            accountInfo = b.mo49909d();
        } else {
            accountInfo = null;
        }
        Activity a = m76662a(view.getContext());
        if (!cgvo.f187824a.mo6606a().mo84548b() && a != null) {
            String a2 = m76663a(a);
            if (!f91345b.contains(a2) && f91344a.contains(a2)) {
                atam a3 = atam.m75294a(a, accountInfo);
                String a4 = m76663a(a);
                String b2 = m76666b(view);
                bxvd g = a3.mo49765g(118);
                bxvd da = boxt.f135287d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boxt boxt = (boxt) da.f164949b;
                a4.getClass();
                int i = boxt.f135289a | 1;
                boxt.f135289a = i;
                boxt.f135290b = a4;
                b2.getClass();
                boxt.f135289a = i | 2;
                boxt.f135291c = b2;
                if (g.f164950c) {
                    g.mo74035c();
                    g.f164950c = false;
                }
                bpbx bpbx = (bpbx) g.f164949b;
                boxt boxt2 = (boxt) da.mo74062i();
                bpbx bpbx2 = bpbx.f135635S;
                boxt2.getClass();
                bpbx.f135639C = boxt2;
                bpbx.f135655a |= JGCastService.FLAG_PRIVATE_DISPLAY;
                a3.mo49741a((bpbx) g.mo74062i());
            }
        }
    }
}

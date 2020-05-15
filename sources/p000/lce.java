package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.autofill.AutofillId;
import android.webkit.WebView;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.util.PaymentsUtils$CardNetwork;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/* renamed from: lce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lce implements lch {

    /* renamed from: a */
    public static final srn f25772a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public static final bnic f25773b = bnic.m109490a(kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_HOLDER_NAME);

    /* renamed from: c */
    public final Context f25774c;

    /* renamed from: d */
    public final awkh f25775d;

    /* renamed from: e */
    private final kbe f25776e;

    public lce(Context context, kbe kbe, awkh awkh) {
        this.f25774c = context;
        this.f25776e = kbe;
        this.f25775d = awkh;
    }

    /* renamed from: a */
    public static AutofillId m18916a(FillForm fillForm, kpb kpb, lcf lcf) {
        FillField a;
        if (fillForm.mo7949a(kpb)) {
            return ((FillField) fillForm.mo7950b(kpb).get(0)).f11631a;
        }
        bnre i = lcf.f25781e.listIterator();
        while (i.hasNext()) {
            FillField fillField = (FillField) i.next();
            if (fillField.mo7943a(kpb)) {
                return fillField.f11631a;
            }
        }
        if (!f25773b.contains(kpb) || (a = lcf.f25779c.mo15000a(kpb)) == null) {
            return null;
        }
        return a.f11631a;
    }

    /* renamed from: a */
    private static bngx m18917a(GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse) {
        int length;
        String[] strArr = getSaveInstrumentDetailsResponse.f110184a;
        int[] iArr = getSaveInstrumentDetailsResponse.f110185b;
        if (strArr == null || iArr == null || (length = strArr.length) != iArr.length) {
            bnsl bnsl = (bnsl) f25772a.mo68388c();
            bnsl.mo68432a("lce", "a", 488, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("GetSaveInstrumentDetailsResponse contains unexpected format.");
            return bngx.m109376e();
        }
        bngs b = bngx.m109371b(length);
        for (int i = 0; i < strArr.length; i++) {
            b.mo67668c(PaymentsUtils$CardNetwork.m7183a(iArr[i], strArr[i]));
        }
        return b.mo67664a();
    }

    /* renamed from: a */
    private static List m18918a(bqgg bqgg) {
        try {
            return (List) ((kek) bqga.m112780a((Future) bqgg)).f23936a.stream().map(lcb.f25769a).filter(lcc.f25770a).map(lcd.f25771a).collect(Collectors.toList());
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) f25772a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lce", "a", 422, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to fetch existing payment cards");
            return bngx.m109376e();
        }
    }

    /* renamed from: a */
    private static boolean m18919a(PackageInfo packageInfo) {
        if (packageInfo != null) {
            List c = bmyx.m108640a('.').mo66920b().mo66917a().mo66925c((CharSequence) packageInfo.versionName);
            if (!c.isEmpty()) {
                try {
                    if (Integer.parseInt((String) c.get(0)) >= 67) {
                        return true;
                    }
                    return false;
                } catch (NumberFormatException e) {
                    bnsl bnsl = (bnsl) f25772a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("lce", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to parse WebView major version number.");
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        if (java.lang.Integer.parseInt((java.lang.String) r0.get(0)) >= 67) goto L_0x00ad;
     */
    /* renamed from: a */
    public final bqgg mo14962a(lcf lcf) {
        PackageInfo currentWebViewPackage;
        if (!lcf.f25778b.mo7949a(kpb.PAYMENT_CARD_NUMBER) && lcf.f25779c.mo15000a(kpb.PAYMENT_CARD_NUMBER) == null) {
            return bqga.m112775a(bmvz.f131120a);
        }
        if (!lcf.f25777a.equals(lcf.f25778b.f11643c) && (currentWebViewPackage = WebView.getCurrentWebViewPackage()) != null && ("com.android.chrome".equals(currentWebViewPackage.packageName) || "com.google.android.webview".equals(currentWebViewPackage.packageName) || "com.chrome.beta".equals(currentWebViewPackage.packageName) || "com.chrome.dev".equals(currentWebViewPackage.packageName) || "com.chrome.canary".equals(currentWebViewPackage.packageName))) {
            List c = bmyx.m108640a('.').mo66920b().mo66917a().mo66925c((CharSequence) currentWebViewPackage.versionName);
            if (!c.isEmpty()) {
                try {
                } catch (NumberFormatException e) {
                    bnsl bnsl = (bnsl) f25772a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("lce", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to parse WebView major version number.");
                }
            }
            return bqga.m112775a(bmvz.f131120a);
        }
        bqgg b = this.f25776e.mo14345b();
        bqgg a = bqdx.m112674a(b, new lbv(this, lcf), bqfb.INSTANCE);
        return bqga.m112783b(a, lcf.f25780d).mo69216a(new lbw(this, lcf, b, a), bqfb.INSTANCE);
    }
}

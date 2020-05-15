package p000;

import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InAppCvmConfig;

/* renamed from: aszv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszv {

    /* renamed from: a */
    public static final /* synthetic */ int f89931a = 0;

    /* renamed from: b */
    private static final srn f89932b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static final boolean m75265a(Context context, String str, String str2) {
        int i;
        int i2;
        InAppCvmConfig inAppCvmConfig;
        CardInfo cardInfo = null;
        if (!(str == null || str2 == null)) {
            try {
                cardInfo = atds.m75666a(askg.m74279a(str, context)).mo49853b(str2);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) f89932b.mo68388c();
                bnsl.mo68432a("aszv", "b", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("getCardInfo: account not found");
            }
        }
        if (cardInfo == null || (inAppCvmConfig = cardInfo.f108359t) == null) {
            i = bqcn.m112585b(cgvx.f187835a.mo6606a().mo84555a());
            i2 = 600;
        } else {
            i = inAppCvmConfig.f108383b;
            i2 = inAppCvmConfig.f108382a;
        }
        return new atkm(context).mo50019e() < i && new atah(context).mo49730a(i2);
    }

    /* renamed from: b */
    private final CardInfo m75266b(Context context, String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        try {
            return atds.m75666a(askg.m74279a(str, context)).mo49853b(str2);
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f89932b.mo68388c();
            bnsl.mo68432a("aszv", "b", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getCardInfo: account not found");
            return null;
        }
    }
}

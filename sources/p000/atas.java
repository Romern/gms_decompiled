package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Build;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: atas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atas {

    /* renamed from: a */
    public static final srn f89971a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public atas() {
        int i = athh.f90367a;
    }

    /* renamed from: a */
    public static boolean m75335a(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    /* renamed from: a */
    public static boolean m75336a(askf askf) {
        AccountInfo a = askf.mo49209a();
        AccountInfo b = asix.m74201b(askf.f89126d, askf.f89125c);
        return b != null && b.f108325a.equals(a.f108325a);
    }

    /* renamed from: a */
    public static boolean m75337a(String str, String str2) {
        if (bmxx.m108577a(str) || bmxx.m108577a(str2)) {
            return false;
        }
        return Pattern.compile(str).matcher(str2).find();
    }

    /* renamed from: a */
    public final int mo49769a(askf askf, List list) {
        IssuerInfo issuerInfo;
        IssuerInfo issuerInfo2;
        TokenStatus tokenStatus;
        TokenReference tokenReference;
        askf askf2 = askf;
        if (list.isEmpty()) {
            return 0;
        }
        CardInfo b = atds.m75666a(askf).mo49852b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bmuc bmuc = (bmuc) it.next();
            int a = bmtx.m108380a(bmuc.f130923a);
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 0:
                    bnsl bnsl = (bnsl) f89971a.mo68390d();
                    bnsl.mo68432a("atas", "a", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Unknown filter type, ignoring notification");
                    return 5;
                case 1:
                    if (asjw.m74255a()) {
                        break;
                    } else {
                        return 7;
                    }
                case 2:
                    sre.m36089i(askf2.f89126d);
                    break;
                case 3:
                    long j = bmuc.f130924b;
                    if (j != 0) {
                        if (j <= 201515033) {
                            break;
                        } else {
                            return 9;
                        }
                    } else {
                        return 5;
                    }
                case 4:
                    long j2 = bmuc.f130924b;
                    if (j2 != 0) {
                        if (j2 >= 201515033) {
                            break;
                        } else {
                            return 10;
                        }
                    } else {
                        return 5;
                    }
                case 5:
                    if (askf2.f89126d.getPackageManager().resolveActivity(new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY"), 0) == null) {
                        break;
                    } else {
                        return 11;
                    }
                case 6:
                    try {
                        askf2.f89126d.getPackageManager().getPackageInfo(bmuc.f130925c, 0);
                        break;
                    } catch (PackageManager.NameNotFoundException e) {
                        return 12;
                    }
                case 9:
                    if (!asjw.m74255a()) {
                        break;
                    } else {
                        return 15;
                    }
                case 10:
                    if (atxx.m76528a(askf2.f89126d)) {
                        break;
                    } else {
                        return 16;
                    }
                case 11:
                    if (!atxx.m76528a(askf2.f89126d)) {
                        break;
                    } else {
                        return 17;
                    }
                case 12:
                    if (m75335a(askf2.f89126d)) {
                        break;
                    } else {
                        return 18;
                    }
                case 13:
                    if (!m75335a(askf2.f89126d)) {
                        break;
                    } else {
                        return 19;
                    }
                case 14:
                    if (m75336a(askf)) {
                        if (cgxf.m147444b()) {
                            break;
                        } else {
                            return 22;
                        }
                    } else {
                        return 6;
                    }
                case 15:
                    if (System.currentTimeMillis() >= bmuc.f130926d) {
                        break;
                    } else {
                        return 20;
                    }
                case 16:
                    if (System.currentTimeMillis() <= bmuc.f130926d) {
                        break;
                    } else {
                        return 21;
                    }
                case 17:
                    if (!m75336a(askf)) {
                        return 6;
                    }
                    if (!bmuc.f130929g.isEmpty()) {
                        if (b != null && (issuerInfo = b.f108350k) != null && m75337a(bmuc.f130929g, issuerInfo.f108388a)) {
                            break;
                        } else {
                            return 24;
                        }
                    } else {
                        return 5;
                    }
                    break;
                case 18:
                    if (!m75336a(askf)) {
                        return 6;
                    }
                    if (!bmuc.f130929g.isEmpty()) {
                        if (b != null && (issuerInfo2 = b.f108350k) != null && m75337a(bmuc.f130929g, issuerInfo2.f108396i)) {
                            break;
                        } else {
                            return 25;
                        }
                    } else {
                        return 5;
                    }
                    break;
                case 19:
                    if (!m75336a(askf)) {
                        return 6;
                    }
                    int a2 = bmtz.m108382a(bmuc.f130927e);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (b == null) {
                        return 23;
                    }
                    int i = b.f108344e;
                    if (!((a2 == 5 && i == 4) || ((a2 == 3 && i == 2) || ((a2 == 4 && i == 3) || ((a2 == 2 && i == 1) || ((a2 == 9 && i == 8) || ((a2 == 6 && i == 5) || ((a2 == 8 && i == 7) || ((a2 == 12 && i == 11) || ((a2 == 10 && i == 10) || ((a2 == 11 && i == 9) || ((a2 == 13 && i == 12) || (a2 == 7 && i == 6))))))))))))) {
                        return 23;
                    }
                case 20:
                    if (!m75336a(askf)) {
                        return 6;
                    }
                    int a3 = bmub.m108384a(bmuc.f130928f);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (b == null || (tokenStatus = b.f108345f) == null || (tokenReference = tokenStatus.f108458a) == null) {
                        return 26;
                    }
                    int i2 = tokenReference.f108457b;
                    if (!((a3 == 2 && i2 == 2) || ((a3 == 5 && i2 == 5) || ((a3 == 6 && i2 == 6) || ((a3 == 7 && i2 == 7) || ((a3 == 3 && i2 == 3) || ((a3 == 8 && i2 == 8) || ((a3 == 15 && i2 == 14) || ((a3 == 9 && i2 == 9) || ((a3 == 16 && i2 == 13) || ((a3 == 17 && i2 == 15) || (a3 == 4 && i2 == 4)))))))))))) {
                        return 26;
                    }
                    break;
                case 21:
                    if (!sre.m36081a(askf2.f89126d.getResources())) {
                        break;
                    } else {
                        return 27;
                    }
                case 22:
                    if (((long) Build.VERSION.SDK_INT) >= bmuc.f130924b) {
                        break;
                    } else {
                        return 28;
                    }
                case 23:
                    if (((long) Build.VERSION.SDK_INT) <= bmuc.f130924b) {
                        break;
                    } else {
                        return 29;
                    }
                case 24:
                    if (m75337a(bmuc.f130929g, Build.MODEL)) {
                        break;
                    } else {
                        return 30;
                    }
            }
        }
        return 0;
    }
}

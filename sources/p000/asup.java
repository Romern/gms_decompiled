package p000;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;

/* renamed from: asup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asup extends asum {

    /* renamed from: a */
    public static final srn f89763a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public static final ExecutorService f89764b = snp.m35704b(10);

    /* renamed from: a */
    public static boxe m74856a(String str, asqt asqt) {
        String str2;
        bxvd da = boxe.f135231k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxe boxe = (boxe) da.f164949b;
        str.getClass();
        boxe.f135233a |= 1;
        boxe.f135234b = str;
        byte[] bArr = asqt.f89400a;
        if (bArr[0] == 0 && bArr[1] == -92) {
            str2 = asti.m74760a(Arrays.copyOfRange(bArr, 5, bArr[4] + 5));
        } else {
            str2 = "";
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxe boxe2 = (boxe) da.f164949b;
        str2.getClass();
        int i = boxe2.f135233a | 2;
        boxe2.f135233a = i;
        boxe2.f135235c = str2;
        long j = asqt.f89402c;
        int i2 = i | 4;
        boxe2.f135233a = i2;
        boxe2.f135236d = j;
        long j2 = asqt.f89403d;
        boxe2.f135233a = i2 | 8;
        boxe2.f135237e = j2;
        String format = String.format("%02x%02x", Byte.valueOf(asqt.f89400a[0]), Byte.valueOf(asqt.f89400a[1]));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxe boxe3 = (boxe) da.f164949b;
        format.getClass();
        boxe3.f135233a |= 16;
        boxe3.f135238f = format;
        String format2 = String.format("%04x", Integer.valueOf(asqt.f89401b.f89655a));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxe boxe4 = (boxe) da.f164949b;
        format2.getClass();
        int i3 = boxe4.f135233a | 32;
        boxe4.f135233a = i3;
        boxe4.f135239g = format2;
        byte[] bArr2 = asqt.f89400a;
        byte b = bArr2[2];
        int i4 = i3 | 64;
        boxe4.f135233a = i4;
        boxe4.f135240h = b;
        byte b2 = bArr2[3];
        int i5 = i4 | 128;
        boxe4.f135233a = i5;
        boxe4.f135241i = b2;
        byte b3 = bArr2[4];
        boxe4.f135233a = i5 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        boxe4.f135242j = b3;
        return (boxe) da.mo74062i();
    }

    /* renamed from: b */
    static final atam m74862b(Context context, asqw asqw) {
        return atam.m75295a(context, asqw.f89441e);
    }

    /* renamed from: b */
    private static void m74863b(Context context, asqw asqw, btqp btqp) {
        bnsl a = f89763a.mo26019b(aske.m74275a());
        a.mo68432a("asup", "b", 597, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68405a("Reporting tap to server");
        context.startService(IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.tapreporting.TapLocationReportingIntentOperation", "com.google.android.gms.tapandpay.tapreporting.TAP_LOCATION_ACTION").putExtra("account_id_extra", asqw.f89440d).putExtra("account_name_extra", asqw.f89441e).putExtra("tap_info_extra", btqp.mo73642k()));
    }

    /* renamed from: b */
    public final void mo49515b(Context context, asqw asqw, asqt asqt) {
        try {
            boxe a = m74856a(asqw.f89437a, asqt);
            atam b = m74862b(context, asqw);
            bxvd b2 = b.mo49753b(3, asqw.f89457u);
            if (b2.f164950c) {
                b2.mo74035c();
                b2.f164950c = false;
            }
            bpbx bpbx = (bpbx) b2.f164949b;
            bpbx bpbx2 = bpbx.f135635S;
            a.getClass();
            bpbx.f135659e = a;
            bpbx.f135655a |= 4;
            b.mo49742a((bpbx) b2.mo74062i(), asqw.f89437a);
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f89763a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asup", "b", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Logging APDU failed");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static final btre m74857a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1688490866:
                if (str.equals("canonical_interac_bundle")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1426184971:
                if (str.equals("canonical_eftpos_bundle")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -905486322:
                if (str.equals("amex2_bundle")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -152778304:
                if (str.equals("canonical_mc_bundle")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 309674061:
                if (str.equals("canonical_discover_bundle")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 366259608:
                if (str.equals("discover_bundle")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 434689600:
                if (str.equals("visa_bundle")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 959178788:
                if (str.equals("canonical_elo_bundle")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 1640769725:
                if (str.equals("mcbp_bundle")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return btre.AMEX_EXPRESS_PAY2_APPLET;
            case 1:
                return btre.MASTERCARD_MCBP_APPLET;
            case 2:
                return btre.VISA_PAYWAVE_APPLET;
            case 3:
                return btre.DISCOVER_APPLET;
            case 4:
                return btre.CANONICAL_INTERAC_APPLET;
            case 5:
                return btre.CANONICAL_EFTPOS_APPLET;
            case 6:
                return btre.CANONICAL_DISCOVER_APPLET;
            case 7:
                return btre.CANONICAL_MASTERCARD_APPLET;
            case 8:
                return btre.CANONICAL_ELO_APPLET;
            default:
                return btre.UNKNOWN_APPLET;
        }
    }

    /* renamed from: a */
    private static void m74858a(asqw asqw, bxvd bxvd, bxvd bxvd2) {
        m74859a(asqw.f89429F, bxvd, bxvd2);
        m74859a(asqw.f89428E, bxvd, bxvd2);
        m74859a(asqw.f89430G, bxvd, bxvd2);
        List list = asqw.f89438b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            astf astf = ((asqt) list.get(i)).f89401b;
            if (astf.mo49461a().length != 0) {
                try {
                    m74860a(assu.m74713a(astf.mo49461a()), bxvd, bxvd2);
                } catch (assv e) {
                    bnsl bnsl = (bnsl) f89763a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("asup", "a", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Response not in TLV format");
                }
            }
        }
    }

    /* renamed from: a */
    public static void m74859a(asrb asrb, bxvd bxvd, bxvd bxvd2) {
        if (asrb != null) {
            btqq btqq = ((btqp) bxvd2.f164949b).f149997d;
            if (btqq == null) {
                btqq = btqq.f150008w;
            }
            bxvd bxvd3 = (bxvd) btqq.mo74142c(5);
            bxvd3.mo73625a((bxvk) btqq);
            for (Integer num : asrb.f89474a.f89482a.keySet()) {
                int intValue = num.intValue();
                byte[] a = asrb.mo49400a(intValue);
                switch (intValue) {
                    case 149:
                        String b = asti.m74763b(a);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bozw bozw = (bozw) bxvd.f164949b;
                        bozw bozw2 = bozw.f135422N;
                        b.getClass();
                        bozw.f135437a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bozw.f135446j = b;
                        String a2 = asti.m74760a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        a2.getClass();
                        ((btqq) bxvd3.f164949b).f150024o = a2;
                        break;
                    case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                        int a3 = (int) asuv.m74875a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        ((btqq) bxvd3.f164949b).f150025p = a3;
                        break;
                    case MfiClientException.TYPE_NO_ACCOUNT_INFO:
                        int a4 = (int) asuv.m74875a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        ((btqq) bxvd3.f164949b).f150017h = a4;
                        break;
                    case 24362:
                        int a5 = (int) asuv.m74875a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        ((btqq) bxvd3.f164949b).f150019j = a5;
                        break;
                    case 40705:
                        String b2 = asti.m74763b(a);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bozw bozw3 = (bozw) bxvd.f164949b;
                        bozw bozw4 = bozw.f135422N;
                        b2.getClass();
                        bozw3.f135437a |= 512;
                        bozw3.f135447k = b2;
                        long a6 = asuv.m74875a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        ((btqq) bxvd3.f164949b).f150015f = a6;
                        break;
                    case 40706:
                        long a7 = asuv.m74875a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        ((btqq) bxvd3.f164949b).f150018i = a7;
                        break;
                    case 40707:
                        long a8 = asuv.m74875a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        ((btqq) bxvd3.f164949b).f150022m = a8;
                        break;
                    case 40713:
                        String b3 = asti.m74763b(a);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bozw bozw5 = (bozw) bxvd.f164949b;
                        bozw bozw6 = bozw.f135422N;
                        b3.getClass();
                        bozw5.f135437a |= 1024;
                        bozw5.f135448l = b3;
                        String a9 = asti.m74760a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        a9.getClass();
                        ((btqq) bxvd3.f164949b).f150027r = a9;
                        break;
                    case 40725:
                        int a10 = (int) asuv.m74875a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        ((btqq) bxvd3.f164949b).f150012c = a10;
                        break;
                    case 40726:
                        String a11 = asti.m74760a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        a11.getClass();
                        ((btqq) bxvd3.f164949b).f150011b = a11;
                        break;
                    case 40730:
                        int a12 = (int) asuv.m74875a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        ((btqq) bxvd3.f164949b).f150023n = a12;
                        break;
                    case 40732:
                        String a13 = asti.m74760a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        a13.getClass();
                        ((btqq) bxvd3.f164949b).f150013d = a13;
                        break;
                    case 40734:
                        String a14 = asti.m74760a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        a14.getClass();
                        ((btqq) bxvd3.f164949b).f150014e = a14;
                        break;
                    case 40755:
                        String b4 = asti.m74763b(a);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bozw bozw7 = (bozw) bxvd.f164949b;
                        bozw bozw8 = bozw.f135422N;
                        b4.getClass();
                        bozw7.f135437a |= 2048;
                        bozw7.f135449m = b4;
                        String a15 = asti.m74760a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        a15.getClass();
                        ((btqq) bxvd3.f164949b).f150028s = a15;
                        break;
                    case 40757:
                        String b5 = asti.m74763b(a);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bozw bozw9 = (bozw) bxvd.f164949b;
                        bozw bozw10 = bozw.f135422N;
                        b5.getClass();
                        bozw9.f135437a |= 4096;
                        bozw9.f135450n = b5;
                        String a16 = asti.m74760a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        a16.getClass();
                        ((btqq) bxvd3.f164949b).f150029t = a16;
                        break;
                    case 40759:
                        String a17 = asti.m74760a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        a17.getClass();
                        ((btqq) bxvd3.f164949b).f150026q = a17;
                        break;
                    case 40761:
                        String b6 = asti.m74763b(a);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bozw bozw11 = (bozw) bxvd.f164949b;
                        bozw bozw12 = bozw.f135422N;
                        b6.getClass();
                        bozw11.f135437a |= 8192;
                        bozw11.f135451o = b6;
                        break;
                    case 40780:
                        btql btql = ((btqp) bxvd2.f164949b).f150000g;
                        if (btql == null) {
                            btql = btql.f149970i;
                        }
                        bxvd bxvd4 = (bxvd) btql.mo74142c(5);
                        bxvd4.mo73625a((bxvk) btql);
                        String a18 = asti.m74760a(a);
                        if (bxvd4.f164950c) {
                            bxvd4.mo74035c();
                            bxvd4.f164950c = false;
                        }
                        a18.getClass();
                        ((btql) bxvd4.f164949b).f149979h = a18;
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        btql btql2 = (btql) bxvd4.mo74062i();
                        btqp btqp = btqp.f149992o;
                        btql2.getClass();
                        ((btqp) bxvd2.f164949b).f150000g = btql2;
                        break;
                    case 40782:
                        String trim = new String(a, StandardCharsets.US_ASCII).trim();
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        trim.getClass();
                        ((btqq) bxvd3.f164949b).f150010a = trim;
                        break;
                    case 40806:
                        String b7 = asti.m74763b(a);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bozw bozw13 = (bozw) bxvd.f164949b;
                        bozw bozw14 = bozw.f135422N;
                        b7.getClass();
                        bozw13.f135437a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        bozw13.f135452p = b7;
                        String a19 = asti.m74760a(a);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        a19.getClass();
                        ((btqq) bxvd3.f164949b).f150021l = a19;
                        break;
                    case 40830:
                        try {
                            String a20 = asti.m74760a(a);
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            a20.getClass();
                            ((btqq) bxvd3.f164949b).f150031v = a20;
                            break;
                        } catch (RuntimeException e) {
                            bnsl bnsl = (bnsl) f89763a.mo68388c();
                            bnsl.mo68437a(e);
                            bnsl.mo68432a("asup", "a", 454, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68409a("Log data extraction failed for tag %x", intValue);
                            break;
                        }
                }
            }
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            btqq btqq2 = (btqq) bxvd3.mo74062i();
            btqp btqp2 = btqp.f149992o;
            btqq2.getClass();
            ((btqp) bxvd2.f164949b).f149997d = btqq2;
        }
    }

    /* renamed from: a */
    public static void m74860a(assu assu, bxvd bxvd, bxvd bxvd2) {
        if (assu instanceof assr) {
            for (assu assu2 : ((assr) assu).mo49440b()) {
                m74860a(assu2, bxvd, bxvd2);
            }
            return;
        }
        byte[] bArr = ((asss) assu).f89615a;
        switch (assu.f89619b) {
            case KeyInformation.AES128:
                String a = asti.m74760a(bArr);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                btqp btqp = (btqp) bxvd2.f164949b;
                btqp btqp2 = btqp.f149992o;
                a.getClass();
                if (!btqp.f150006m.mo73666a()) {
                    btqp.f150006m = bxvk.m124021a(btqp.f150006m);
                }
                btqp.f150006m.add(a);
                return;
            case 87:
                btql btql = ((btqp) bxvd2.f164949b).f150000g;
                if (btql == null) {
                    btql = btql.f149970i;
                }
                if (btql.f149973b.isEmpty() && bArr.length == 19) {
                    btql btql2 = ((btqp) bxvd2.f164949b).f150000g;
                    if (btql2 == null) {
                        btql2 = btql.f149970i;
                    }
                    bxvd bxvd3 = (bxvd) btql2.mo74142c(5);
                    bxvd3.mo73625a((bxvk) btql2);
                    bozu a2 = bozu.m111702a(((bozw) bxvd.f164949b).f135431H);
                    if (a2 == null) {
                        a2 = bozu.UNKNOWN_TAP_PATH;
                    }
                    if (a2 == bozu.DISCOVER_ZIP) {
                        byte b = bArr[17];
                        byte b2 = bArr[16];
                        int i = ((b & 255) >>> 4) + ((b2 & 15) * 10) + (((b2 & 255) >>> 4) * 100);
                        String num = Integer.toString(i);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        num.getClass();
                        ((btql) bxvd3.f164949b).f149973b = num;
                        m74861a(bxvd2, i);
                    } else {
                        bozu a3 = bozu.m111702a(((bozw) bxvd.f164949b).f135431H);
                        if (a3 == null) {
                            a3 = bozu.UNKNOWN_TAP_PATH;
                        }
                        if (a3 == bozu.VISA_MSD) {
                            byte b3 = bArr[16];
                            int i2 = (b3 & 15) + (((b3 & 255) >>> 4) * 10) + ((15 & bArr[15]) * 100);
                            String a4 = asti.m74760a(new byte[]{(byte) (i2 >> 8), (byte) (i2 & 255)});
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            a4.getClass();
                            ((btql) bxvd3.f164949b).f149973b = a4;
                        }
                    }
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    btql btql3 = (btql) bxvd3.mo74062i();
                    btqp btqp3 = btqp.f149992o;
                    btql3.getClass();
                    ((btqp) bxvd2.f164949b).f150000g = btql3;
                    return;
                }
                return;
            case 130:
                btql btql4 = ((btqp) bxvd2.f164949b).f150000g;
                if (btql4 == null) {
                    btql4 = btql.f149970i;
                }
                bxvd bxvd4 = (bxvd) btql4.mo74142c(5);
                bxvd4.mo73625a((bxvk) btql4);
                String a5 = asti.m74760a(bArr);
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                a5.getClass();
                ((btql) bxvd4.f164949b).f149974c = a5;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                btql btql5 = (btql) bxvd4.mo74062i();
                btqp btqp4 = btqp.f149992o;
                btql5.getClass();
                ((btqp) bxvd2.f164949b).f150000g = btql5;
                return;
            case 24360:
                btql btql6 = ((btqp) bxvd2.f164949b).f150000g;
                if (btql6 == null) {
                    btql6 = btql.f149970i;
                }
                bxvd bxvd5 = (bxvd) btql6.mo74142c(5);
                bxvd5.mo73625a((bxvk) btql6);
                int a6 = (int) asuv.m74875a(bArr);
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                ((btql) bxvd5.f164949b).f149978g = a6;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                btql btql7 = (btql) bxvd5.mo74062i();
                btqp btqp5 = btqp.f149992o;
                btql7.getClass();
                ((btqp) bxvd2.f164949b).f150000g = btql7;
                return;
            case 40743:
                btql btql8 = ((btqp) bxvd2.f164949b).f150000g;
                if (btql8 == null) {
                    btql8 = btql.f149970i;
                }
                bxvd bxvd6 = (bxvd) btql8.mo74142c(5);
                bxvd6.mo73625a((bxvk) btql8);
                String a7 = asti.m74760a(bArr);
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                a7.getClass();
                ((btql) bxvd6.f164949b).f149976e = a7;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                btql btql9 = (btql) bxvd6.mo74062i();
                btqp btqp6 = btqp.f149992o;
                btql9.getClass();
                ((btqp) bxvd2.f164949b).f150000g = btql9;
                return;
            case 40756:
                btql btql10 = ((btqp) bxvd2.f164949b).f150000g;
                if (btql10 == null) {
                    btql10 = btql.f149970i;
                }
                bxvd bxvd7 = (bxvd) btql10.mo74142c(5);
                bxvd7.mo73625a((bxvk) btql10);
                int a8 = (int) asuv.m74875a(bArr);
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                ((btql) bxvd7.f164949b).f149975d = a8;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                btql btql11 = (btql) bxvd7.mo74062i();
                btqp btqp7 = btqp.f149992o;
                btql11.getClass();
                ((btqp) bxvd2.f164949b).f150000g = btql11;
                return;
            case 40758:
                btql btql12 = ((btqp) bxvd2.f164949b).f150000g;
                if (btql12 == null) {
                    btql12 = btql.f149970i;
                }
                bxvd bxvd8 = (bxvd) btql12.mo74142c(5);
                bxvd8.mo73625a((bxvk) btql12);
                String a9 = asti.m74760a(bArr);
                if (bxvd8.f164950c) {
                    bxvd8.mo74035c();
                    bxvd8.f164950c = false;
                }
                a9.getClass();
                ((btql) bxvd8.f164949b).f149973b = a9;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                btql btql13 = (btql) bxvd8.mo74062i();
                btqp btqp8 = btqp.f149992o;
                btql13.getClass();
                ((btqp) bxvd2.f164949b).f150000g = btql13;
                btre a10 = btre.m117061a(((btqp) bxvd2.f164949b).f150004k);
                if (a10 == null) {
                    a10 = btre.UNRECOGNIZED;
                }
                if (a10 == btre.DISCOVER_APPLET && bArr.length == 2) {
                    m74861a(bxvd2, ((bArr[0] & 255) << 8) + bArr[1]);
                    return;
                }
                return;
            case 40812:
                btql btql14 = ((btqp) bxvd2.f164949b).f150000g;
                if (btql14 == null) {
                    btql14 = btql.f149970i;
                }
                bxvd bxvd9 = (bxvd) btql14.mo74142c(5);
                bxvd9.mo73625a((bxvk) btql14);
                String a11 = asti.m74760a(bArr);
                if (bxvd9.f164950c) {
                    bxvd9.mo74035c();
                    bxvd9.f164950c = false;
                }
                a11.getClass();
                ((btql) bxvd9.f164949b).f149972a = a11;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                btql btql15 = (btql) bxvd9.mo74062i();
                btqp btqp9 = btqp.f149992o;
                btql15.getClass();
                ((btqp) bxvd2.f164949b).f150000g = btql15;
                btql btql16 = ((btqp) bxvd2.f164949b).f150000g;
                if (btql16 == null) {
                    btql16 = btql.f149970i;
                }
                String str = btql16.f149972a;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bozw bozw = (bozw) bxvd.f164949b;
                bozw bozw2 = bozw.f135422N;
                str.getClass();
                bozw.f135437a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                bozw.f135453q = str;
                return;
            case 40814:
                btql btql17 = ((btqp) bxvd2.f164949b).f150000g;
                if (btql17 == null) {
                    btql17 = btql.f149970i;
                }
                bxvd bxvd10 = (bxvd) btql17.mo74142c(5);
                bxvd10.mo73625a((bxvk) btql17);
                String a12 = asti.m74760a(bArr);
                if (bxvd10.f164950c) {
                    bxvd10.mo74035c();
                    bxvd10.f164950c = false;
                }
                a12.getClass();
                ((btql) bxvd10.f164949b).f149977f = a12;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                btql btql18 = (btql) bxvd10.mo74062i();
                btqp btqp10 = btqp.f149992o;
                btql18.getClass();
                ((btqp) bxvd2.f164949b).f150000g = btql18;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private static void m74861a(bxvd bxvd, int i) {
        bxvd bxvd2;
        String bnzb = bnzi.m110902d().mo68721a(String.format(Locale.US, "%03d", Integer.valueOf(i)), StandardCharsets.UTF_8).toString();
        String substring = bnzb.substring(bnzb.length() - 8);
        btqq btqq = ((btqp) bxvd.f164949b).f149997d;
        if (btqq == null) {
            bxvd2 = btqq.f150008w.mo74144da();
        } else {
            bxvd bxvd3 = (bxvd) btqq.mo74142c(5);
            bxvd3.mo73625a((bxvk) btqq);
            bxvd2 = bxvd3;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        substring.getClass();
        ((btqq) bxvd2.f164949b).f150030u = substring;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btqq btqq2 = (btqq) bxvd2.mo74062i();
        btqp btqp = btqp.f149992o;
        btqq2.getClass();
        ((btqp) bxvd.f164949b).f149997d = btqq2;
    }

    /* renamed from: a */
    public final void mo49513a(Context context, asqw asqw) {
        String str;
        int i;
        char c;
        Intent startIntent;
        TokenReference tokenReference;
        btof btof;
        int i2;
        Context context2 = context;
        asqw asqw2 = asqw;
        try {
            if (asqw.mo49396a()) {
                bnsl a = f89763a.mo26019b(aske.m74275a());
                a.mo68432a("asup", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String str2 = asqw2.f89437a;
                switch (asqw2.f89454r) {
                    case -1:
                        str = "NO_FAILURE";
                        break;
                    case 0:
                    case 2:
                    case 3:
                    case 6:
                    case 8:
                    case 20:
                    case 35:
                    case 36:
                    default:
                        str = "UNKNOWN";
                        break;
                    case 1:
                        str = "NO_CREDENTIAL";
                        break;
                    case 4:
                        str = "DEVICE_LOCKED";
                        break;
                    case 5:
                        str = "DEVICE_SETUP_REQUIRED";
                        break;
                    case 7:
                        str = "NO_STORAGE_KEY";
                        break;
                    case 9:
                        str = "ATTESTATION_FAILURE";
                        break;
                    case 10:
                        str = "SCREEN_OFF";
                        break;
                    case 11:
                        str = "TEAR";
                        break;
                    case 12:
                        str = "PAYMENT_NOT_STARTED";
                        break;
                    case 13:
                        str = "PROTOCOL_FAILURE";
                        break;
                    case 14:
                        str = "CARD_NOT_SUPPORTED";
                        break;
                    case 15:
                        str = "INTERNAL";
                        break;
                    case 16:
                        str = "PAYMENTS_DISABLED";
                        break;
                    case 17:
                        str = "THROTTLED";
                        break;
                    case 18:
                        str = "PAY_ON_WEAR_DISABLED";
                        break;
                    case 19:
                        str = "CDCVM_REQUIRED_SDK";
                        break;
                    case 21:
                        str = "VELOCITY_CHECK";
                        break;
                    case 22:
                        str = "NO_WALLET";
                        break;
                    case 23:
                        str = "NO_CARD";
                        break;
                    case 24:
                        str = "READER_ERROR_WRONG_AID";
                        break;
                    case 25:
                        str = "READER_ERROR_WRONG_LENGTH";
                        break;
                    case 26:
                        str = "READER_ERROR_IN_SDK";
                        break;
                    case 27:
                        str = "CARD_NOT_SUPPORTED_AID_NOT_SUPPORTED";
                        break;
                    case 28:
                        str = "CARD_NOT_SUPPORTED_MSD_ON_EMV";
                        break;
                    case 29:
                        str = "CARD_NOT_SUPPORTED_SDK";
                        break;
                    case 30:
                        str = "PPSE_ONLY";
                        break;
                    case 31:
                        str = "TRANSIT_INSUFFICIENT_BALANCE";
                        break;
                    case 32:
                        str = "TRANSIT_INVALID_TICKET";
                        break;
                    case 33:
                        str = "TRANSIT_EXPIRED_TICKET";
                        break;
                    case 34:
                        str = "TRANSIT_SUSPENDED_TICKET";
                        break;
                    case FelicaException.TYPE_NOT_CLOSED:
                        str = "PAYMENT_CARDS_BLOCKED";
                        break;
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                        str = "BUNDLE_ON_DIFFERENT_ACCOUNT";
                        break;
                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                        str = "PAYMENT_NOT_STARTED_MULTIPLE_CARDS";
                        break;
                    case FelicaException.TYPE_PUSH_FAILED:
                        str = "ACCESS_SUSPENDED_CARD";
                        break;
                }
                a.mo68424a("Tap %s finished with failure: %s", str2, str);
                atam b = m74862b(context, asqw);
                ArrayList arrayList = new ArrayList(asqw.mo49399d());
                for (asqt asqt : asqw2.f89438b) {
                    arrayList.add(m74856a(asqw2.f89437a, asqt));
                }
                bxvd da = bozw.f135422N.mo74144da();
                String str3 = asqw2.f89437a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bozw bozw = (bozw) da.f164949b;
                str3.getClass();
                bozw.f135437a |= 1;
                bozw.f135439c = str3;
                long b2 = asqw.mo49397b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bozw bozw2 = (bozw) da.f164949b;
                int i3 = bozw2.f135437a | 2;
                bozw2.f135437a = i3;
                bozw2.f135440d = b2;
                long j = asqw2.f89452p;
                int i4 = i3 | 4;
                bozw2.f135437a = i4;
                bozw2.f135441e = j;
                long j2 = asqw2.f89453q;
                bozw2.f135437a = i4 | 8;
                bozw2.f135442f = j2;
                int i5 = asqw2.f89454r;
                if (i5 == -1) {
                    i = 6;
                } else if (i5 == 1) {
                    i = 2;
                } else if (i5 == 7) {
                    i = 10;
                } else if (i5 == 37) {
                    i = 32;
                } else if (i5 == 4) {
                    i = 8;
                } else if (i5 != 5) {
                    switch (i5) {
                        case 9:
                            i = 17;
                            break;
                        case 10:
                            i = 11;
                            break;
                        case 11:
                            i = 12;
                            break;
                        case 12:
                            i = 13;
                            break;
                        case 13:
                            i = 4;
                            break;
                        case 14:
                            i = 14;
                            break;
                        case 15:
                            i = 15;
                            break;
                        case 16:
                            i = 16;
                            break;
                        case 17:
                            i = 20;
                            break;
                        case 18:
                            i = 19;
                            break;
                        case 19:
                            i = 21;
                            break;
                        default:
                            switch (i5) {
                                case 21:
                                    i = 22;
                                    break;
                                case 22:
                                    i = 23;
                                    break;
                                case 23:
                                    i = 24;
                                    break;
                                case 24:
                                    i = 25;
                                    break;
                                case 25:
                                    i = 26;
                                    break;
                                case 26:
                                    i = 27;
                                    break;
                                case 27:
                                    i = 28;
                                    break;
                                case 28:
                                    i = 29;
                                    break;
                                case 29:
                                    i = 30;
                                    break;
                                case 30:
                                    i = 31;
                                    break;
                                default:
                                    i = 5;
                                    break;
                            }
                    }
                } else {
                    i = 9;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bozw bozw3 = (bozw) da.f164949b;
                bozw3.f135443g = i - 1;
                int i6 = bozw3.f135437a | 32;
                bozw3.f135437a = i6;
                int i7 = asqw2.f89433J;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    bozw3.f135444h = i8;
                    bozw3.f135437a = i6 | 64;
                    boolean a2 = ssk.m36235a(context);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bozw bozw4 = (bozw) da.f164949b;
                    int i9 = bozw4.f135437a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    bozw4.f135437a = i9;
                    bozw4.f135454r = a2;
                    long j3 = asqw2.f89450n;
                    int i10 = i9 | 1048576;
                    bozw4.f135437a = i10;
                    bozw4.f135456t = j3;
                    boolean z = asqw2.f89442f;
                    int i11 = 4194304 | i10;
                    bozw4.f135437a = i11;
                    bozw4.f135458v = z;
                    boolean z2 = asqw2.f89443g;
                    int i12 = i11 | 8388608;
                    bozw4.f135437a = i12;
                    bozw4.f135459w = z2;
                    int i13 = (int) asqw2.f89445i;
                    int i14 = bozw4.f135438b | 2;
                    bozw4.f135438b = i14;
                    bozw4.f135427D = i13;
                    int i15 = asqw2.f89447k;
                    int i16 = i14 | 8;
                    bozw4.f135438b = i16;
                    bozw4.f135429F = i15;
                    int i17 = asqw2.f89446j;
                    int i18 = i16 | 4;
                    bozw4.f135438b = i18;
                    bozw4.f135428E = i17;
                    boolean z3 = asqw2.f89444h;
                    bozw4.f135438b = i18 | 1;
                    bozw4.f135426C = z3;
                    int i19 = asqw2.f89432I;
                    int i20 = i19 - 1;
                    if (i19 != 0) {
                        bozw4.f135461y = i20;
                        int i21 = 268435456 | i12;
                        bozw4.f135437a = i21;
                        long j4 = asqw2.f89448l;
                        bozw4.f135437a = i21 | 536870912;
                        bozw4.f135462z = j4;
                        int a3 = bepw.m95430a(btre.class, m74857a(asqw2.f89459w));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bozw bozw5 = (bozw) da.f164949b;
                        int i22 = bozw5.f135438b | 64;
                        bozw5.f135438b = i22;
                        bozw5.f135432I = a3;
                        int i23 = asqw2.f89460x;
                        int i24 = i22 | 128;
                        bozw5.f135438b = i24;
                        bozw5.f135433J = i23;
                        boolean z4 = asqw2.f89461y;
                        int i25 = i24 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bozw5.f135438b = i25;
                        bozw5.f135434K = z4;
                        boolean z5 = asqw2.f89462z;
                        int i26 = i25 | 512;
                        bozw5.f135438b = i26;
                        bozw5.f135435L = z5;
                        boolean z6 = asqw2.f89424A;
                        bozw5.f135438b = i26 | 1024;
                        bozw5.f135436M = z6;
                        atkm atkm = new atkm(context2);
                        long f = atkm.mo50020f();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bozw bozw6 = (bozw) da.f164949b;
                        bozw6.f135437a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        bozw6.f135455s = f;
                        int d = atkm.mo50018d();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bozw bozw7 = (bozw) da.f164949b;
                        bozw7.f135437a |= 67108864;
                        bozw7.f135460x = d;
                        asqu asqu = asqw2.f89456t;
                        if (asqu != null) {
                            String a4 = stm.m36299a(asqu.f89405a);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bozw bozw8 = (bozw) da.f164949b;
                            a4.getClass();
                            int i27 = bozw8.f135437a | 128;
                            bozw8.f135437a = i27;
                            bozw8.f135445i = a4;
                            boolean z7 = asqu.f89411g;
                            int i28 = i27 | 2097152;
                            bozw8.f135437a = i28;
                            bozw8.f135457u = z7;
                            boolean z8 = asqu.f89413i;
                            int i29 = i28 | Integer.MIN_VALUE;
                            bozw8.f135437a = i29;
                            bozw8.f135425B = z8;
                            if (!asqu.f89409e) {
                                i2 = 3;
                            } else {
                                i2 = 2;
                            }
                            bozw8.f135424A = i2 - 1;
                            bozw8.f135437a = 1073741824 | i29;
                            int i30 = asqu.f89415k;
                            int i31 = bozw8.f135438b | 16;
                            bozw8.f135438b = i31;
                            bozw8.f135430G = i30;
                            bozw8.f135431H = asqu.f89416l.f135420k;
                            bozw8.f135438b = 32 | i31;
                        }
                        bozw bozw9 = (bozw) da.mo74062i();
                        bxvd da2 = btqp.f149992o.mo74144da();
                        btql btql = btql.f149970i;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        btqp btqp = (btqp) da2.f164949b;
                        btql.getClass();
                        btqp.f150000g = btql;
                        String str4 = asqw2.f89437a;
                        str4.getClass();
                        btqp.f149994a = str4;
                        if (!btqp.f149998e.mo73666a()) {
                            btqp.f149998e = bxvk.m124021a(btqp.f149998e);
                        }
                        bxsy.m123078a(arrayList, btqp.f149998e);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bozw9.getClass();
                        ((btqp) da2.f164949b).f149999f = bozw9;
                        long currentTimeMillis = System.currentTimeMillis();
                        bxvd da3 = bxyk.f165095c.mo74144da();
                        bxvd bxvd = da2;
                        long j5 = currentTimeMillis / 1000;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bxyk bxyk = (bxyk) da3.f164949b;
                        bxyk.f165097a = j5;
                        bxyk.f165098b = ((int) (currentTimeMillis % 1000)) * 1000000;
                        bxyk bxyk2 = (bxyk) da3.mo74062i();
                        bxvd bxvd2 = bxvd;
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bxyk2.getClass();
                        ((btqp) bxvd2.f164949b).f149996c = bxyk2;
                        String id = TimeZone.getDefault().getID();
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        id.getClass();
                        ((btqp) bxvd2.f164949b).f150003j = id;
                        btre a5 = m74857a(asqw2.f89459w);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        ((btqp) bxvd2.f164949b).f150004k = a5.mo3214a();
                        CardInfo cardInfo = asqw2.f89457u;
                        if (cardInfo != null) {
                            bxvd da4 = btiy.f149054c.mo74144da();
                            String a6 = stm.m36299a(cardInfo.f108340a);
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            a6.getClass();
                            ((btiy) da4.f164949b).f149056a = a6;
                            byte[] bArr = cardInfo.f108341b;
                            if (bArr != null) {
                                bxtx a7 = bxtx.m123261a(bArr);
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                a7.getClass();
                                ((btiy) da4.f164949b).f149057b = a7;
                            }
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            btiy btiy = (btiy) da4.mo74062i();
                            btiy.getClass();
                            ((btqp) bxvd2.f164949b).f149995b = btiy;
                            TokenStatus tokenStatus = cardInfo.f108345f;
                            if (!(tokenStatus == null || (tokenReference = tokenStatus.f108458a) == null)) {
                                int i32 = tokenReference.f108457b;
                                switch (i32) {
                                    case 1:
                                        btof = btof.APTEST_TSP;
                                        break;
                                    case 2:
                                        btof = btof.AMEX_TSP;
                                        break;
                                    case 3:
                                        btof = btof.MASTERCARD_TSP;
                                        break;
                                    case 4:
                                        btof = btof.VISA_TSP;
                                        break;
                                    case 5:
                                        btof = btof.DISCOVER_TSP;
                                        break;
                                    case 6:
                                        btof = btof.EFTPOS_TSP;
                                        break;
                                    case 7:
                                        btof = btof.INTERAC_TSP;
                                        break;
                                    case 8:
                                        btof = btof.OBERTHUR_TSP;
                                        break;
                                    case 9:
                                        btof = btof.PAYPAL_TSP;
                                        break;
                                    case 10:
                                    case 11:
                                    case 12:
                                    default:
                                        StringBuilder sb = new StringBuilder(34);
                                        sb.append("Unknown token provider ");
                                        sb.append(i32);
                                        throw new IllegalArgumentException(sb.toString());
                                    case 13:
                                        btof = btof.JCB_TSP;
                                        break;
                                    case 14:
                                        btof = btof.ELO_TSP;
                                        break;
                                    case 15:
                                        btof = btof.GEMALTO_TSP;
                                        break;
                                }
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                ((btqp) bxvd2.f164949b).f150007n = btof.mo3214a();
                            }
                        }
                        if (!asqw2.f89455s || asqw2.f89454r != -1) {
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            c = 4;
                            ((btqp) bxvd2.f164949b).f150005l = btqo.m117042a(4);
                        } else {
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            ((btqp) bxvd2.f164949b).f150005l = btqo.m117042a(3);
                            c = 4;
                        }
                        asqu asqu2 = asqw2.f89456t;
                        if (asqu2 != null) {
                            bxvd da5 = btqq.f150008w.mo74144da();
                            boolean z9 = asqu2.f89411g;
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            btqq btqq = (btqq) da5.f164949b;
                            btqq.f150016g = z9;
                            btqq.f150020k = asqu2.f89413i;
                            String a8 = stm.m36299a(asqu2.f89414j);
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            a8.getClass();
                            ((btqq) da5.f164949b).f150030u = a8;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            btqq btqq2 = (btqq) da5.mo74062i();
                            btqq2.getClass();
                            ((btqp) bxvd2.f164949b).f149997d = btqq2;
                        }
                        m74859a(asqw2.f89429F, da, bxvd2);
                        m74859a(asqw2.f89428E, da, bxvd2);
                        m74859a(asqw2.f89430G, da, bxvd2);
                        for (asqt asqt2 : asqw2.f89438b) {
                            astf astf = asqt2.f89401b;
                            if (astf.mo49461a().length != 0) {
                                try {
                                    m74860a(assu.m74713a(astf.mo49461a()), da, bxvd2);
                                } catch (assv e) {
                                    bnsl bnsl = (bnsl) f89763a.mo68388c();
                                    bnsl.mo68437a(e);
                                    bnsl.mo68432a("asup", "a", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68405a("Response not in TLV format");
                                }
                            }
                        }
                        bozw bozw10 = (bozw) da.mo74062i();
                        bxvd b3 = b.mo49753b(2, asqw2.f89457u);
                        if (b3.f164950c) {
                            b3.mo74035c();
                            b3.f164950c = false;
                        }
                        bpbx bpbx = (bpbx) b3.f164949b;
                        bpbx bpbx2 = bpbx.f135635S;
                        bozw10.getClass();
                        bpbx.f135658d = bozw10;
                        bpbx.f135655a |= 2;
                        b.mo49742a((bpbx) b3.mo74062i(), asqw2.f89437a);
                        bnsl a9 = f89763a.mo26019b(aske.m74275a());
                        a9.mo68432a("asup", "a", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a9.mo68420a("Session info: \n%s", bozw10);
                        if (asqw2.f89441e != null) {
                            if (asqw2.f89440d != null) {
                                bnsl a10 = f89763a.mo26019b(aske.m74275a());
                                a10.mo68432a("asup", "b", 597, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                a10.mo68405a("Reporting tap to server");
                                context2.startService(IntentOperation.getStartIntent(context2, "com.google.android.gms.tapandpay.tapreporting.TapLocationReportingIntentOperation", "com.google.android.gms.tapandpay.tapreporting.TAP_LOCATION_ACTION").putExtra("account_id_extra", asqw2.f89440d).putExtra("account_name_extra", asqw2.f89441e).putExtra("tap_info_extra", ((btqp) bxvd2.mo74062i()).mo73642k()));
                            }
                        }
                        int i33 = ((btqp) bxvd2.f164949b).f150005l;
                        if (i33 == 0) {
                            c = 2;
                        } else if (i33 == 1) {
                            c = 3;
                        } else if (i33 != 2) {
                            c = 0;
                        }
                        if (c != 0 && c == 3) {
                            btqp btqp2 = (btqp) bxvd2.mo74062i();
                            if (asqw2.f89457u == null || asqw2.f89440d == null) {
                                bnsl bnsl2 = (bnsl) f89763a.mo68388c();
                                bnsl2.mo68432a("asup", "a", 606, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("Null card info or account, not reporting tap");
                                return;
                            }
                            Intent putExtra = new Intent("com.google.android.gms.STORE_TAP").putExtra("account_id_extra", asqw2.f89440d).putExtra("card_info_extra", asqw2.f89457u).putExtra("tap_info_extra", btqp2.mo73642k());
                            atxn.m76508c(context2, putExtra);
                            atxn.m76509d(context2, putExtra);
                            if (cgwn.f187872a.mo6606a().mo84642w() && (startIntent = IntentOperation.getStartIntent(context2, "com.google.android.gms.pay.transactions.data.StoreTapIntentOperation", "com.google.android.gms.STORE_TAP")) != null) {
                                startIntent.putExtra("card_info_extra", asqw2.f89457u).putExtra("tap_info_extra", btqp2.mo73642k());
                                context2.startService(startIntent);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        } catch (RuntimeException e2) {
            bnsl bnsl3 = (bnsl) f89763a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("asup", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Error reporting tap");
        }
    }

    /* renamed from: a */
    public final void mo49486a(Context context, asqw asqw, int i) {
        f89764b.execute(new asuo(context, asqw));
    }

    /* renamed from: a */
    public final void mo49510a(Context context, asqw asqw, asqt asqt) {
        f89764b.execute(new asun(context, asqw, asqt));
    }

    /* renamed from: a */
    public final void mo49514a(Context context, asqw asqw, btqp btqp) {
        Intent startIntent;
        if (asqw.f89457u == null || asqw.f89440d == null) {
            bnsl bnsl = (bnsl) f89763a.mo68388c();
            bnsl.mo68432a("asup", "a", 606, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Null card info or account, not reporting tap");
            return;
        }
        Intent putExtra = new Intent("com.google.android.gms.STORE_TAP").putExtra("account_id_extra", asqw.f89440d).putExtra("card_info_extra", asqw.f89457u).putExtra("tap_info_extra", btqp.mo73642k());
        atxn.m76508c(context, putExtra);
        atxn.m76509d(context, putExtra);
        if (cgwn.f187872a.mo6606a().mo84642w() && (startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.pay.transactions.data.StoreTapIntentOperation", "com.google.android.gms.STORE_TAP")) != null) {
            startIntent.putExtra("card_info_extra", asqw.f89457u).putExtra("tap_info_extra", btqp.mo73642k());
            context.startService(startIntent);
        }
    }
}

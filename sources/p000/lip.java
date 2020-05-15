package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.autofill.p031ui.AutofillChimeraActivity;

/* renamed from: lip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lip implements liq {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final lim mo15177a(lir lir, String str, Bundle bundle) {
        char c;
        lir lir2 = lir;
        String str2 = str;
        Bundle bundle2 = bundle;
        int i = 7;
        switch (str.hashCode()) {
            case -2077709277:
                if (str2.equals("SETTINGS")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1614581289:
                if (str2.equals("FILL_PASSWORD")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1592329197:
                if (str2.equals("KEYBOARD_CREDENTIAL_FILL")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case -1449243964:
                if (str2.equals("DEBUG_INSTRUMENTATION_FILE_LIST")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1441801278:
                if (str2.equals("AUTH_AND_FILL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1362600187:
                if (str2.equals("SMS_OTP")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1325899974:
                if (str2.equals("DEBUG_INFO")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1016853429:
                if (str2.equals("SCAN_PAYMENT_CARD")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -917373731:
                if (str2.equals("NO_REFERRER")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -915574815:
                if (str2.equals("KEYBOARD_PAYMENT_CARD_FILL")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -830281043:
                if (str2.equals("SETUP_AND_FILL")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -829901145:
                if (str2.equals("SETUP_AND_SAVE")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -744738290:
                if (str2.equals("ALERT_DIALOG_DISPLAY")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -560833540:
                if (str2.equals("SETTINGS_POSTAL_ADDRESS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -509833964:
                if (str2.equals("FILL_PASSWORD_WARNING")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -494150189:
                if (str2.equals("FIX_PAYMENT_CARD")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -478664905:
                if (str2.equals("SETTINGS_PASSWORD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -450672966:
                if (str2.equals("SETUP_AND_FILL_REVISED")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case -35485521:
                if (str2.equals("DEBUG_SETTINGS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2402146:
                if (str2.equals("NOOP")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 78791261:
                if (str2.equals("SETUP")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 142628237:
                if (str2.equals("UPDATE_CREDENTIAL")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 216069893:
                if (str2.equals("FILL_PAYMENT_CARD")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 433141802:
                if (str2.equals("UNKNOWN")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 520255668:
                if (str2.equals("SETUP_AND_SAVE_REVISED")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case 573789423:
                if (str2.equals("UNRECOGNIZED")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 818920535:
                if (str2.equals("SETTINGS_BIOMETRICS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1145809949:
                if (str2.equals("DEBUG_PHENOTYPE_FLAG_MANAGER")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2052454190:
                if (str2.equals("FILL_PASSWORD_MANUAL")) {
                    c = 3;
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
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 12;
                break;
            case 10:
                i = 13;
                break;
            case 11:
                i = 14;
                break;
            case 12:
                i = 15;
                break;
            case 13:
                i = 16;
                break;
            case 14:
                i = 22;
                break;
            case 15:
                i = 23;
                break;
            case 16:
                i = 32;
                break;
            case 17:
                i = 102;
                break;
            case 18:
                i = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
                break;
            case 19:
                i = ErrorInfo.TYPE_SDU_FAILED;
                break;
            case 20:
                i = ErrorInfo.TYPE_SDU_MEMORY_FULL;
                break;
            case 21:
                i = 202;
                break;
            case 22:
                i = 203;
                break;
            case 23:
                i = 204;
                break;
            case 24:
                i = 205;
                break;
            case 25:
                i = 503;
                break;
            case 26:
                i = 1003;
                break;
            case 27:
                i = 10002;
                break;
            case 28:
                i = 1;
                break;
            default:
                try {
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException e) {
                    bnsl bnsl = (bnsl) AutofillChimeraActivity.f11682b.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("lip", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to find ID of activity with name %s", str2);
                    return null;
                }
        }
        kre a = krc.m18382a(lir);
        bngx a2 = bngx.m109356a(new kwz(lir, bundle, i, a.mo14824a(), a.mo14837l()));
        int i2 = i - 2;
        if (i2 == 20) {
            return new lmi(lir2, bundle2, a2);
        }
        if (i2 == 21) {
            return new llz(lir2, bundle2, a2);
        }
        if (i2 == 30) {
            return new lno(lir2, bundle2, a2);
        }
        if (i2 == 103) {
            return new ljh(lir2, bundle2, a2);
        }
        if (i2 == 501) {
            return new lja(lir2, bundle2, a2);
        }
        if (i2 == 10000) {
            return new lki(lir2, bundle2, a2);
        }
        if (i2 == 100) {
            return new lmu(lir2, bundle2, a2);
        }
        if (i2 == 101) {
            return new lkx(lir2, bundle2, a2);
        }
        switch (i2) {
            case 2:
                return new ljv(lir2, bundle2, a2);
            case 3:
                if (!ccip.m129876p()) {
                    return new lkx(lir2, bundle2, a2);
                }
                return new lju(lir2, bundle2, a2, bmxv.m108566b(new lkp(lir2, krc.m18382a(lir).mo14838m())));
            case 4:
                return new ljq(lir2, bundle2, a2);
            case 5:
                return new lju(lir2, bundle2, a2, bmvz.f131120a);
            case 6:
                return new ljd(lir2, bundle2, a2);
            case 7:
                return new lpy(lir2, bundle2, a2);
            case 8:
                return new lpk(lir2, bundle2, a2);
            default:
                switch (i2) {
                    case 10:
                        return new lnb(lir2, bundle2, a2);
                    case 11:
                        return new lni(lir2, bundle2, a2, new lnf());
                    case 12:
                        return new lni(lir2, bundle2, a2, new lnh());
                    case 13:
                        return new lkh(lir2, bundle2, a2);
                    case 14:
                        if (ccjf.f179148a.mo6606a().mo76117n()) {
                            return new lmf(lir2, bundle2, a2);
                        }
                        return new lmh(lir2, bundle2, a2);
                    default:
                        switch (i2) {
                            case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                                if (ccip.m129862b()) {
                                    return new lop(lir2, bundle2, a2);
                                }
                                break;
                            case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                                return new lnz(lir2, bundle2, a2);
                            case 202:
                                return new loc(lir2, bundle2, a2);
                            case 203:
                                try {
                                    return new lpc(lir2, bundle2, a2);
                                } catch (lik e2) {
                                    bnsl bnsl2 = (bnsl) AutofillChimeraActivity.f11682b.mo68387b();
                                    bnsl2.mo68437a(e2);
                                    bnsl2.mo68432a("lip", "a", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl2.mo68420a("Failed to initialize activity %s", kwt.m18677a(i));
                                    return null;
                                }
                        }
                        bnsl bnsl3 = (bnsl) AutofillChimeraActivity.f11682b.mo68388c();
                        bnsl3.mo68432a("lip", "a", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("Failed to find activity %s", kwt.m18677a(i));
                        return null;
                }
        }
    }
}

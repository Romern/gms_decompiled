package p000;

import java.util.Map;

/* renamed from: bhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhc {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public static String m3024a(byte b) {
        Map map = ((bet) bgs.f3191a.mo3119a("DATA_CONTEXT", false)).f3120b;
        bia a = bev.m2854a(map, bgt.m2993a("CARD_RISK_MANAGEMENT_MS_DGI"), bgt.m2993a("TOKEN_NUMBER"), true);
        if (a == null) {
            a = bev.m2854a(map, bgt.m2993a("CARD_RISK_MANAGEMENT_EMV_DGI"), bgt.m2993a("TOKEN_NUMBER"), true);
        }
        bia a2 = bev.m2854a(map, bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("DEVICE_ID_TAG"), true);
        if (a == null || a2 == null) {
            throw new bfq(bha.INVALID_CARD_PROFILE);
        }
        String str = a2.f3270h;
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("::getTransactionID::deviceID::");
        } else {
            "::getTransactionID::deviceID::".concat(valueOf);
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("%1$-48s");
        String replace = String.format(sb.toString(), str).replace(' ', '0');
        String valueOf2 = String.valueOf(replace);
        if (valueOf2.length() == 0) {
            new String("::getTransactionID::deviceID after padding::");
        } else {
            "::getTransactionID::deviceID after padding::".concat(valueOf2);
        }
        String str2 = a.f3270h;
        String valueOf3 = String.valueOf(str2);
        if (valueOf3.length() == 0) {
            new String("::getTransactionID::pan::");
        } else {
            "::getTransactionID::pan::".concat(valueOf3);
        }
        String substring = str2.substring(0, str2.length() - 1);
        String valueOf4 = String.valueOf(substring);
        if (valueOf4.length() == 0) {
            new String("::getTransactionID::pan::removing trailing F::");
        } else {
            "::getTransactionID::pan::removing trailing F::".concat(valueOf4);
        }
        String a3 = m3025a(substring, 16);
        String valueOf5 = String.valueOf(a3);
        if (valueOf5.length() == 0) {
            new String("::getTransactionID::pan::after appending 00::");
        } else {
            "::getTransactionID::pan::after appending 00::".concat(valueOf5);
        }
        String str3 = (String) bes.m2844a("UNPREDICTABLE_NUMBER");
        String valueOf6 = String.valueOf(str3);
        if (valueOf6.length() == 0) {
            new String("::getTransactionID::unpredictableNumber::");
        } else {
            "::getTransactionID::unpredictableNumber::".concat(valueOf6);
        }
        String str4 = (String) bes.m2844a("APPLICATION_CYPTOGRAM");
        String valueOf7 = String.valueOf(str4);
        if (valueOf7.length() == 0) {
            new String("::getTransactionID::applicationCryptogram::");
        } else {
            "::getTransactionID::applicationCryptogram::".concat(valueOf7);
        }
        if (b == 66) {
            String substring2 = str4.substring(10, 16);
            String valueOf8 = String.valueOf(substring2);
            if (valueOf8.length() == 0) {
                new String("::calculate5CSCFromCryptogram::cryptogram::");
            } else {
                "::calculate5CSCFromCryptogram::cryptogram::".concat(valueOf8);
            }
            String format = String.format("%05d", Integer.valueOf(bhp.m3053a(substring2)));
            String valueOf9 = String.valueOf(format);
            if (valueOf9.length() == 0) {
                new String("::calculate5CSCFromCryptogram::cryptogramDigit::");
            } else {
                "::calculate5CSCFromCryptogram::cryptogramDigit::".concat(valueOf9);
            }
            while (format.length() > 5) {
                format = format.substring(1);
            }
            String valueOf10 = String.valueOf(format);
            if (valueOf10.length() == 0) {
                new String("::calculate5CSCFromCryptogram::cryptogramDigit after intial digit truncation::");
            } else {
                "::calculate5CSCFromCryptogram::cryptogramDigit after intial digit truncation::".concat(valueOf10);
            }
            str4 = m3025a(format, 6);
            String valueOf11 = String.valueOf(str4);
            if (valueOf11.length() == 0) {
                new String("::calculate5CSCFromCryptogram::csc5::");
            } else {
                "::calculate5CSCFromCryptogram::csc5::".concat(valueOf11);
            }
            String valueOf12 = String.valueOf(str4);
            if (valueOf12.length() == 0) {
                new String("::getTransactionID::Converted applicationCryptogram::");
            } else {
                "::getTransactionID::Converted applicationCryptogram::".concat(valueOf12);
            }
            String valueOf13 = String.valueOf(str3.substring(4));
            str3 = valueOf13.length() == 0 ? new String("0000") : "0000".concat(valueOf13);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + String.valueOf(a3).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append(replace);
        sb2.append(a3);
        sb2.append(str3);
        sb2.append(str4);
        String a4 = bgw.m2998a(sb2.toString(), false);
        String valueOf14 = String.valueOf(a4);
        if (valueOf14.length() == 0) {
            new String("::getTransactionID::tid::");
        } else {
            "::getTransactionID::tid::".concat(valueOf14);
        }
        return a4;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    private static String m3025a(String str, int i) {
        StringBuilder sb = new StringBuilder(15);
        sb.append("%1$");
        sb.append(i);
        sb.append("s");
        return String.format(sb.toString(), str).replace(' ', '0');
    }
}

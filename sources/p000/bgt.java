package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgt {

    /* renamed from: a */
    private static final Map f3192a = new HashMap();

    /* renamed from: b */
    private static final Map f3193b = new HashMap();

    static {
        f3192a.put("NFC_LUPC_DGI", "9401");
        f3192a.put("NFC_LUPC_TAG", "A8");
        f3192a.put("NFC_LUPC_ATC", "80");
        f3192a.put("NFC_LUPC_LUPC", "81");
        f3192a.put("NFC_LUPC_KCV", "82");
        f3192a.put("NFC_LUPC_DKI", "83");
        f3192a.put("NFC_LUPC_START_DT", "87");
        f3192a.put("NFC_LUPC_END_DT", "88");
        f3192a.put("NFC_LUPC_COUNT", "89");
        f3192a.put("MST_LUPC_DGI", "9601");
        f3192a.put("MST_LUPC_TAG", "AC");
        f3192a.put("MST_LUPC_TRACK1", "82");
        f3192a.put("MST_LUPC_TRACK2", "83");
        f3192a.put("MST_LUPC_COUNT", "89");
        f3192a.put("MST_LUPC_ATC", "80");
        f3192a.put("MST_LUPC_DYNAMIC_DATA", "81");
        f3192a.put("MST_LUPC_START_DT", "87");
        f3192a.put("MST_LUPC_END_DT", "88");
        f3192a.put("MS_AIP_DGI", "9105");
        f3192a.put("MS_AIP_TAG", "82");
        f3192a.put("MS_AFL_TAG", "94");
        f3192a.put("EMV_AIP_DGI", "9104");
        f3192a.put("EMV_AIP_TAG", "82");
        f3192a.put("EMV_AFL_TAG", "94");
        f3192a.put("PAYMENT_PARAMETERS_DGI", "3002");
        f3192a.put("PPSE_TAG_V1", "AE");
        f3192a.put("PPSE_TAG_V2", "AF");
        f3192a.put("PAYMENT_PARAMETERS_AIP_TAG", "82");
        f3192a.put("PAYMENT_PARAMETERS_AFL_TAG", "94");
        f3192a.put("APPLICATION_INDICATOR", "4F");
        f3192a.put("PRIORITY_INDICATOR", "87");
        f3192a.put("APPLICATION_LABEL", "50");
        f3192a.put("KERNEL_IDENTIFIER", "9F2A");
        f3192a.put("SELECT_AID_DGI", "9102");
        f3192a.put("PDOL_TAG", "9F38");
        f3192a.put("APPLICATION_SELECTION_PPSE", "0301");
        f3192a.put("APPLICATION_SELECTION_TRANSIT", "0302");
        f3192a.put("APPLICATION_SELECTION_RETAIL", "0303");
        f3192a.put("APPLICATION_TRANSACTION_COUNTER_TAG", "");
        f3192a.put("CARD_VERIFICATION_RESULTS_TAG", "");
        f3192a.put("CRYPTOGRAM_VERSION_NUMBER_TAG", "");
        f3192a.put("CARD_RISK_MANAGEMENT_DGI", "0101");
        f3192a.put("MS_PAN_TAG", "5A");
        f3192a.put("TOKEN_METADATA_DGI", "9501");
        f3192a.put("TOKEN_DATA_VERSION_TAG", "80");
        f3192a.put("DEVICE_ID_TAG", "82");
        f3192a.put("ICC_KEY_LENGTH_TAG", "84");
        f3192a.put("LUPC_THRESHOLD_TAG", "85");
        f3192a.put("RISK_PARAMS_DGI", "3001");
        f3192a.put("STARTING_ATC_TAG", "9F36");
        f3192a.put("CRYPTOGRAM_INFORMATION_DATA_TAG", "9F27");
        f3192a.put("ICC_DYNAMIC_AUTHENTICATION_DGI", "0104");
        f3192a.put("ICC_PUBLIC_KEY_EXPONENT_TAG", "9F47");
        f3192a.put("ISSUER_APPLICATION_DATA_MS_DGI", "9300");
        f3192a.put("ISSUER_APPLICATION_DATA_EMV_DGI", "9301");
        f3192a.put("ISSUER_APPLICATION_DATA_TAG", "9F10");
        f3192a.put("SFI1_REC1_DGI_MS", "2102");
        f3192a.put("SFI1_REC1_DGI_EMV", "2101");
        f3192a.put("CARD_RISK_MANAGEMENT_MS_DGI", "0102");
        f3192a.put("CARD_RISK_MANAGEMENT_EMV_DGI", "0103");
        f3192a.put("TAG_XPM_CONFIG", "9F7A");
        f3192a.put("CDOL_TAG", "8C");
        f3192a.put("ISSUER_COUNTRY_CODE", "5F28");
        f3192a.put("TAG_APP_CURRENCY_CD", "9F42");
        f3192a.put("TAG_MOB_CVM_REQ_LIMIT", "9F75");
        f3192a.put("PAN_SEQUENCE_NUMBER", "5F34");
        f3192a.put("TOKEN_NUMBER", "5A");
        f3192a.put("TOKEN_EXPIRY", "5F24");
        f3192a.put("TOKEN_STATUS_TAG", "83");
        f3192a.put("TRACK2_EQUIVALENT_DATA_TAG", "57");
        f3193b.put("ICC_CRT_dP1", "8203");
        f3193b.put("ICC_CRT_dQ1", "8202");
        f3193b.put("ICC_CRT_P", "8205");
        f3193b.put("ICC_CRT_Q", "8204");
        f3193b.put("ICC_CRT_PQ", "8201");
        f3193b.put("ICC_CRT_MOD", "8206");
    }

    /* renamed from: a */
    public static String m2993a(String str) {
        return (String) f3192a.get(str);
    }

    /* renamed from: b */
    public static String m2995b(String str) {
        return (String) f3193b.get(str);
    }

    /* renamed from: a */
    public static List m2994a() {
        return new ArrayList(f3193b.values());
    }
}

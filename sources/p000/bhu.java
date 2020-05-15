package p000;

/* renamed from: bhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhu {
    /* renamed from: a */
    public static bht m3064a(String str, String str2) {
        if (bgt.m2993a("NFC_LUPC_DGI").equalsIgnoreCase(str) && bgt.m2993a("NFC_LUPC_TAG").equalsIgnoreCase(str2)) {
            return new bhr();
        }
        if (bgt.m2993a("MST_LUPC_DGI").equalsIgnoreCase(str) && bgt.m2993a("MST_LUPC_TAG").equalsIgnoreCase(str2)) {
            return new bhq();
        }
        if (!bgt.m2993a("PAYMENT_PARAMETERS_DGI").equalsIgnoreCase(str)) {
            return null;
        }
        if (bgt.m2993a("PPSE_TAG_V1").equalsIgnoreCase(str2) || bgt.m2993a("PPSE_TAG_V2").equalsIgnoreCase(str2)) {
            return new bhs();
        }
        return null;
    }
}

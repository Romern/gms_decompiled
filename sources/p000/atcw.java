package p000;

/* renamed from: atcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atcw {
    /* renamed from: a */
    public static String m75565a(btoa btoa) {
        btoa btoa2 = btoa.UNKNOWN_BUNDLE;
        switch (btoa.ordinal()) {
            case 1:
                return "visa_bundle";
            case 2:
                return "mcbp_bundle";
            case 3:
            case 4:
            case 7:
            case 8:
            case 12:
            case 15:
            default:
                String valueOf = String.valueOf(btoa);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unknown bundle type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            case 5:
                return "amex2_bundle";
            case 6:
                return "discover_bundle";
            case 9:
                return "canonical_interac_bundle";
            case 10:
                return "canonical_eftpos_bundle";
            case 11:
                return "canonical_mc_bundle";
            case 13:
                return "canonical_discover_bundle";
            case 14:
                return "felica_bundle";
            case 16:
                return "felica_id_bundle";
            case 17:
                return "felica_quicpay_bundle";
            case 18:
                return "felica_quicpay_aptest_bundle";
            case 19:
                return "felica_id_aptest_bundle";
            case 20:
                return "canonical_elo_bundle";
        }
    }
}

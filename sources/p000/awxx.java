package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: awxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxx {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int[] m81467a(String str) {
        char c;
        switch (str.hashCode()) {
            case -2128555920:
                if (str.equals("glif_v2_light")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1241052239:
                if (str.equals("glif_v3_light")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3175618:
                if (str.equals("glif")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 115650329:
                if (str.equals("glif_v2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new int[]{C0126R.style.Theme_Wallet_First_Party_SetupWizard_Google_Material_2_Light, 2132018266};
        }
        if (c == 1) {
            return new int[]{C0126R.style.Theme_Wallet_First_Party_SetupWizard_Glif_Dark, C0126R.style.SudThemeGlifV2};
        }
        if (c == 2) {
            return new int[]{C0126R.style.Theme_Wallet_First_Party_SetupWizard_Glif_Light, 2132018263};
        }
        if (c != 3) {
            return new int[]{C0126R.style.Theme_Wallet_First_Party_SetupWizard_Glif_Light, 2132018260};
        }
        return new int[]{C0126R.style.Theme_Wallet_First_Party_SetupWizard_Glif_Dark, C0126R.style.SudThemeGlif};
    }
}

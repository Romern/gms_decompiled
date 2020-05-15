package p000;

import com.felicanetworks.mfc.C0126R;

@Deprecated
/* renamed from: bnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnc {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0125 A[RETURN] */
    @Deprecated
    /* renamed from: a */
    public static int m3376a(String str) {
        int i;
        char c;
        char c2;
        String str2 = str;
        if (bnb.f5181d == null) {
            bna bna = new bna();
            bna.f5179a = 2132018317;
            bna.f5180b = true;
            bnb.f5181d = bna.mo3293a();
        }
        bna bna2 = new bna(bnb.f5181d);
        bna2.f5179a = 2132018318;
        bna2.f5180b = false;
        bnb a = bna2.mo3293a();
        if (!a.f5184c) {
            if (str2 != null) {
                switch (str.hashCode()) {
                    case -2128555920:
                        if (str2.equals("glif_v2_light")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1270463490:
                        if (str2.equals("material_light")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1241052239:
                        if (str2.equals("glif_v3_light")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3175618:
                        if (str2.equals("glif")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 115650329:
                        if (str2.equals("glif_v2")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 115650330:
                        if (str2.equals("glif_v3")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 299066663:
                        if (str2.equals("material")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 767685465:
                        if (str2.equals("glif_light")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        i = 2132018324;
                        break;
                    case 1:
                        i = C0126R.style.SuwThemeGlifV3;
                        break;
                    case 2:
                        i = 2132018321;
                        break;
                    case 3:
                        i = C0126R.style.SuwThemeGlifV2;
                        break;
                    case 4:
                        i = 2132018318;
                        break;
                    case 5:
                        i = C0126R.style.SuwThemeGlif;
                        break;
                    case 6:
                        i = 2132018327;
                        break;
                    case 7:
                        i = C0126R.style.SuwThemeMaterial;
                        break;
                }
                return i == 0 ? a.f5182a : i;
            }
        } else if (str2 != null) {
            switch (str.hashCode()) {
                case -2128555920:
                    if (str2.equals("glif_v2_light")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1270463490:
                    if (str2.equals("material_light")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1241052239:
                    if (str2.equals("glif_v3_light")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3175618:
                    if (str2.equals("glif")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 115650329:
                    if (str2.equals("glif_v2")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 115650330:
                    if (str2.equals("glif_v3")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 299066663:
                    if (str2.equals("material")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 767685465:
                    if (str2.equals("glif_light")) {
                        c = 4;
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
                case 1:
                    i = 2132018323;
                    break;
                case 2:
                case 3:
                    i = 2132018320;
                    break;
                case 4:
                case 5:
                    i = 2132018317;
                    break;
                case 6:
                case 7:
                    i = 2132018326;
                    break;
            }
            if (i == 0) {
            }
        }
        i = 0;
        if (i == 0) {
        }
    }
}

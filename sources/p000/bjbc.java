package p000;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbc {

    /* renamed from: d */
    private static bjbc f122459d;

    /* renamed from: a */
    public final int f122460a;

    /* renamed from: b */
    public final String f122461b = null;

    /* renamed from: c */
    public final boolean f122462c;

    public bjbc(int i, boolean z) {
        this.f122460a = i;
        this.f122462c = z;
    }

    /* renamed from: a */
    public static bjbc m103136a() {
        if (f122459d == null) {
            bjbb bjbb = new bjbb();
            bjbb.f122457a = 2132018259;
            bjbb.f122458b = true;
            f122459d = bjbb.mo64964a();
        }
        return f122459d;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final int mo64967a(String str, boolean z) {
        char c;
        char c2;
        String str2 = str;
        int i = 0;
        if (this.f122462c && !z) {
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
                    case 1:
                        i = 2132018265;
                        break;
                    case 2:
                    case 3:
                        i = 2132018262;
                        break;
                    case 4:
                    case 5:
                        i = 2132018259;
                        break;
                    case 6:
                    case 7:
                        i = 2132018268;
                        break;
                }
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
                    i = 2132018266;
                    break;
                case 1:
                    i = C0126R.style.SudThemeGlifV3;
                    break;
                case 2:
                    i = 2132018263;
                    break;
                case 3:
                    i = C0126R.style.SudThemeGlifV2;
                    break;
                case 4:
                    i = 2132018260;
                    break;
                case 5:
                    i = C0126R.style.SudThemeGlif;
                    break;
                case 6:
                    i = 2132018269;
                    break;
                case 7:
                    i = C0126R.style.SudThemeMaterial;
                    break;
            }
        }
        return i == 0 ? this.f122460a : i;
    }

    /* renamed from: a */
    public final int mo64965a(Intent intent) {
        return mo64967a(intent.getStringExtra("theme"), bizc.m103026b(intent));
    }

    @Deprecated
    /* renamed from: a */
    public final int mo64966a(String str) {
        return mo64967a(str, false);
    }
}

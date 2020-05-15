package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: eve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eve {
    /* renamed from: a */
    public static int m11166a(Context context, bswg bswg) {
        bswg bswg2 = bswg.ICON_UNSPECIFIED;
        switch (bswg.ordinal()) {
            case 6:
            case 7:
            case 8:
                return !evi.m11187a(context) ? C0126R.C0127drawable.quantum_ic_chevron_right_vd_theme_24 : C0126R.C0127drawable.quantum_ic_chevron_left_vd_theme_24;
            case 9:
                return C0126R.C0127drawable.quantum_ic_edit_vd_theme_24;
            case 10:
                return C0126R.C0127drawable.quantum_ic_open_in_new_vd_theme_24;
            case 11:
                return C0126R.C0127drawable.quantum_gm_ic_phone_android_vd_theme_24;
            case 12:
                return adyg.m51399a(context, (int) C0126R.attr.asPlaceholder, (int) C0126R.C0127drawable.as_placeholder_light);
            case 13:
                return adyg.m51399a(context, (int) C0126R.attr.asAccountCircleOutlineVdTheme24, (int) C0126R.C0127drawable.as_account_circle_outline_vd_theme_24_light);
            case 14:
            case 18:
                return C0126R.C0127drawable.quantum_ic_search_vd_theme_24;
            case 15:
                return C0126R.C0127drawable.quantum_ic_help_outline_vd_theme_24;
            case 16:
            case 20:
                return C0126R.C0127drawable.quantum_ic_menu_vd_theme_24;
            case 17:
                return C0126R.C0127drawable.quantum_ic_account_circle_vd_theme_24;
            case 19:
                return C0126R.C0127drawable.quantum_ic_help_vd_theme_24;
            case 21:
                return C0126R.C0127drawable.as_ic_personal_info;
            case 22:
                return C0126R.C0127drawable.quantum_gm_ic_toggle_on_vd_theme_24;
            case 23:
                return C0126R.C0127drawable.quantum_gm_ic_payment_vd_theme_24;
            case 24:
                return C0126R.C0127drawable.quantum_gm_ic_people_outline_vd_theme_24;
            case 25:
                return C0126R.C0127drawable.quantum_gm_ic_lock_vd_theme_24;
            case 26:
                return C0126R.C0127drawable.quantum_ic_cloud_off_vd_theme_24;
            case 27:
                return C0126R.C0127drawable.quantum_ic_error_outline_vd_theme_24;
            case 28:
                return C0126R.C0127drawable.product_logo_googleg_color_24;
            case 29:
                return C0126R.C0127drawable.quantum_gm_ic_perm_device_information_vd_theme_24;
            case 30:
                return C0126R.C0127drawable.quantum_gm_ic_local_hospital_vd_theme_24;
            case 31:
                return C0126R.C0127drawable.quantum_gm_ic_group_vd_theme_24;
            case 32:
                return C0126R.C0127drawable.quantum_ic_google_vd_theme_24;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static Drawable m11168b(Context context, bswg bswg) {
        Drawable a;
        int a2 = m11166a(context, bswg);
        if (a2 == 0 || (a = C1133kh.m17836a(context, a2)) == null) {
            return null;
        }
        C1173lt.m19605a(a, m11167a(bswg));
        return a;
    }

    /* renamed from: a */
    public static boolean m11167a(bswg bswg) {
        return bswg == bswg.OPEN_IN_NEW_ICON;
    }
}

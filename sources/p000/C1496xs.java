package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: xs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1496xs {

    /* renamed from: a */
    public final int[] f27610a = {C0126R.C0127drawable.abc_textfield_search_default_mtrl_alpha, C0126R.C0127drawable.abc_textfield_default_mtrl_alpha, C0126R.C0127drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b */
    public final int[] f27611b = {C0126R.C0127drawable.abc_ic_commit_search_api_mtrl_alpha, C0126R.C0127drawable.abc_seekbar_tick_mark_material, C0126R.C0127drawable.abc_ic_menu_share_mtrl_alpha, C0126R.C0127drawable.abc_ic_menu_copy_mtrl_am_alpha, C0126R.C0127drawable.abc_ic_menu_cut_mtrl_alpha, C0126R.C0127drawable.abc_ic_menu_selectall_mtrl_alpha, C0126R.C0127drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c */
    public final int[] f27612c = {C0126R.C0127drawable.abc_textfield_activated_mtrl_alpha, C0126R.C0127drawable.abc_textfield_search_activated_mtrl_alpha, C0126R.C0127drawable.abc_cab_background_top_mtrl_alpha, C0126R.C0127drawable.abc_text_cursor_material, C0126R.C0127drawable.abc_text_select_handle_left_mtrl_dark, C0126R.C0127drawable.abc_text_select_handle_middle_mtrl_dark, C0126R.C0127drawable.abc_text_select_handle_right_mtrl_dark, C0126R.C0127drawable.abc_text_select_handle_left_mtrl_light, C0126R.C0127drawable.abc_text_select_handle_middle_mtrl_light, C0126R.C0127drawable.abc_text_select_handle_right_mtrl_light};

    /* renamed from: d */
    public final int[] f27613d = {C0126R.C0127drawable.abc_popup_background_mtrl_mult, C0126R.C0127drawable.abc_cab_background_internal_bg, C0126R.C0127drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e */
    public final int[] f27614e = {C0126R.C0127drawable.abc_tab_indicator_material, C0126R.C0127drawable.abc_textfield_search_material};

    /* renamed from: f */
    public final int[] f27615f = {C0126R.C0127drawable.abc_btn_check_material, C0126R.C0127drawable.abc_btn_radio_material, C0126R.C0127drawable.abc_btn_check_material_anim, C0126R.C0127drawable.abc_btn_radio_material_anim};

    /* renamed from: a */
    public static final ColorStateList m20818a(Context context, int i) {
        int a = adm.m514a(context, (int) C0126R.attr.colorControlHighlight);
        int c = adm.m517c(context, C0126R.attr.colorButtonNormal);
        return new ColorStateList(new int[][]{adm.f278a, adm.f280c, adm.f279b, adm.f282e}, new int[]{c, C1165lm.m19351a(a, i), C1165lm.m19351a(a, i), i});
    }

    /* renamed from: a */
    public static final void m20819a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C1540zi.m20971b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C1497xt.f27616a;
        }
        drawable.setColorFilter(C1497xt.m20821a(i, mode));
    }

    /* renamed from: a */
    public static final boolean m20820a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}

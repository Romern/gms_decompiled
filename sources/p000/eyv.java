package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.chip.Chip;

/* renamed from: eyv */
final /* synthetic */ class eyv implements C0038ax {

    /* renamed from: a */
    private final ezm f16069a;

    public eyv(ezm ezm) {
        this.f16069a = ezm;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.material.appbar.AppBarLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo2511a(Object obj) {
        int i;
        bsys bsys;
        String str;
        String str2;
        CollapsingToolbarLayout collapsingToolbarLayout;
        bsys bsys2;
        bsys bsys3;
        bsys bsys4;
        ezm ezm = this.f16069a;
        bsxk bsxk = ((epq) obj).f15491a;
        fde fde = ezm.f16100a;
        int i2 = ((fcj) fde.f16308a).f16276g;
        if (i2 != 1) {
            if (fde.mo10731a() != null) {
                ezl ezl = ezm.f16104e;
                ezl.f16097d = ezm.f16100a.mo10731a();
                ezl.f16096c = null;
            }
        } else if (bsxk.f147581b != 4) {
            ezm.f16104e.f16094a = false;
            i2 = 3;
        } else {
            if (!evi.m11189b(ezm.getContext())) {
                if (bsxk.f147581b == 4) {
                    bsys3 = (bsys) bsxk.f147582c;
                } else {
                    bsys3 = bsys.f147709h;
                }
                if ((bsys3.f147711a & 16) == 0) {
                    ezl ezl2 = ezm.f16104e;
                    ezl2.f16094a = false;
                    if (bsxk.f147581b == 4) {
                        bsys4 = (bsys) bsxk.f147582c;
                    } else {
                        bsys4 = bsys.f147709h;
                    }
                    ezl2.mo10622a(bsys4);
                }
            }
            ezl ezl3 = ezm.f16104e;
            ezl3.f16094a = true;
            if (bsxk.f147581b == 4) {
                bsys2 = (bsys) bsxk.f147582c;
            } else {
                bsys2 = bsys.f147709h;
            }
            ezl3.mo10622a(bsys2);
            ezm.f16104e.f16098e = ezm.f16100a.mo10733b();
            ezm.f16104e.f16099f = new ezi(ezm);
        }
        eyu eyu = ezm.f16101b;
        ezl ezl4 = ezm.f16104e;
        if (ezl4.f16094a) {
            boolean z = !ezl4.f16095b;
            if (!eyu.mo10598b()) {
                eyu.f16059m = !z ? eyt.EXPANDABLE_MAXIMIZED : eyt.EXPANDABLE_MINIMIZED;
                bhdz bhdz = eyu.f16061o;
                if (bhdz != null) {
                    eyu.f16048b.mo70973b(bhdz);
                    eyu.f16061o = null;
                }
                if (cbro.m128199c()) {
                    collapsingToolbarLayout = (CollapsingToolbarLayout) LayoutInflater.from(eyu.f16047a).inflate((int) C0126R.C0128layout.as_collapsing_toolbar_custom_view_1, (ViewGroup) eyu.f16048b, false);
                } else {
                    collapsingToolbarLayout = (CollapsingToolbarLayout) LayoutInflater.from(eyu.f16047a).inflate((int) C0126R.C0128layout.as_collapsing_toolbar_custom_view, (ViewGroup) eyu.f16048b, false);
                }
                adyg.m51402a(collapsingToolbarLayout, 3, eot.f15436a);
                if (cbro.m128199c()) {
                    eyu.f16052f = collapsingToolbarLayout.findViewById(C0126R.C0129id.account_name_container);
                }
                eyu.f16050d = (ProductLockupView) collapsingToolbarLayout.findViewById(C0126R.C0129id.mg_lockup);
                eyu.mo10599c();
                eyu.f16051e = collapsingToolbarLayout.findViewById(C0126R.C0129id.account_spinner);
                eyu.f16054h = (TextView) collapsingToolbarLayout.findViewById(C0126R.C0129id.welcome);
                eyu.f16055i = (TextView) collapsingToolbarLayout.findViewById(C0126R.C0129id.action_bar_area_text);
                eyu.f16053g = (TextView) collapsingToolbarLayout.findViewById(C0126R.C0129id.account);
                eyu.f16064r = eyu.f16047a.getResources().getDimensionPixelSize(C0126R.dimen.as_appbar_welcome_message_top_margin) - eyu.f16047a.getResources().getDimensionPixelSize(C0126R.dimen.as_clp_display_name_top_margin);
                eyu.f16065s = (float) eyu.f16047a.getResources().getDimensionPixelSize(C0126R.dimen.as_clp_display_name_starting_text_size);
                eyu.f16066t = (float) eyu.f16047a.getResources().getDimensionPixelSize(C0126R.dimen.as_clp_display_name_ending_text_size);
                C1280ps.m19894a(cbro.m128199c() ? eyu.f16052f : eyu.f16051e, new eys(eyu));
                eyu.f16058l = collapsingToolbarLayout.findViewById(C0126R.C0129id.collapsing_content);
                eyu.f16056j = (Chip) eyu.f16058l.findViewById(C0126R.C0129id.action_chip);
                eyu.f16061o = new eyo(eyu);
                eyu.f16048b.mo70968a(eyu.f16061o);
                eyu.f16048b.mo70970a(!z, false);
                View view = eyu.f16052f;
                if (view != null) {
                    view.setOnClickListener(new eyp(eyu));
                } else {
                    eyu.f16051e.setOnClickListener(new eyq(eyu));
                    eyu.f16054h.setOnClickListener(new eyr(eyu));
                }
                eyu.f16057k = (Toolbar) collapsingToolbarLayout.findViewById(C0126R.C0129id.toolbar);
                eyu.f16057k.mo1679a("");
                eyu.mo10595a(collapsingToolbarLayout);
            }
        } else {
            eyt eyt = eyu.f16059m;
            if (eyt == null || eyt.f16046e) {
                bhdz bhdz2 = eyu.f16061o;
                if (bhdz2 != null) {
                    eyu.f16048b.mo70973b(bhdz2);
                    eyu.f16061o = null;
                }
                View inflate = LayoutInflater.from(eyu.f16047a).inflate((int) C0126R.C0128layout.as_compact_header_layout, (ViewGroup) eyu.f16048b, false);
                eyu.f16050d = (ProductLockupView) inflate.findViewById(C0126R.C0129id.mg_lockup);
                eyu.f16055i = (TextView) inflate.findViewById(C0126R.C0129id.action_bar_area_text);
                eyu.mo10599c();
                adyg.m51402a(inflate, 3, eot.f15436a);
                eyu.f16057k = (Toolbar) inflate.findViewById(C0126R.C0129id.toolbar);
                eyu.f16057k.mo1679a("");
                eyu.mo10595a(inflate);
                eyu.f16059m = eyt.COMPACT;
            }
        }
        bsys bsys5 = ezl4.f16096c;
        if (bsys5 != null) {
            sre.m36087g(eyu.f16047a);
            if ((bsys5.f147711a & 64) != 0) {
                str = bsys5.f147717g;
                eyu.f16068v = 3;
            } else if (!bsys5.f147716f) {
                str = bsys5.f147712b;
                eyu.f16068v = 2;
            } else {
                eyu.f16068v = 1;
                str = null;
            }
            eyu.mo10596a(str);
            if (eyu.mo10598b()) {
                if (ffr.m11620a(ezl4.f16098e) || (!stm.m36302d(bsys5.f147712b) && cbro.m128203g())) {
                    eyu.f16054h.setVisibility(0);
                    eyu.f16054h.setText(bsys5.f147712b);
                    eyu.m11304a(eyu.f16054h, -2);
                } else {
                    eyu.f16054h.setVisibility(4);
                    eyu.m11304a(eyu.f16054h, 0);
                }
                if (ffr.m11620a(ezl4.f16098e)) {
                    eyu.f16053g.setText(ezl4.f16098e.f16458a);
                    eyu.f16053g.setContentDescription(eyu.f16047a.getResources().getString(C0126R.string.as_account_spinner_a11y_description, ezl4.f16098e.f16458a));
                    eyu.f16051e.setVisibility(0);
                    eyu.f16053g.requestLayout();
                } else {
                    eyu.f16051e.setVisibility(8);
                }
                if ((bsys5.f147711a & 16) != 0) {
                    Chip chip = eyu.f16056j;
                    bsui bsui = bsys5.f147715e;
                    if (bsui == null) {
                        bsui = bsui.f147128e;
                    }
                    chip.setText(bsui.f147131b);
                    if (!cbro.m128200d()) {
                        Chip chip2 = eyu.f16056j;
                        Context context = eyu.f16047a;
                        bsui bsui2 = bsys5.f147715e;
                        if (bsui2 == null) {
                            bsui2 = bsui.f147128e;
                        }
                        bswh bswh = bsui2.f147132c;
                        if (bswh == null) {
                            bswh = bswh.f147430g;
                        }
                        int a = eve.m11166a(context, bswg.m116252a(bswh.f147433b));
                        bhgf bhgf = chip2.f151140b;
                        if (bhgf != null) {
                            bhgf.mo63705b(C1391tv.m20459b(bhgf.f118589n, a));
                        }
                    } else {
                        Chip chip3 = eyu.f16056j;
                        Context context2 = eyu.f16047a;
                        bsui bsui3 = bsys5.f147715e;
                        if (bsui3 == null) {
                            bsui3 = bsui.f147128e;
                        }
                        bswh bswh2 = bsui3.f147132c;
                        if (bswh2 == null) {
                            bswh2 = bswh.f147430g;
                        }
                        chip3.mo71076a(eve.m11168b(context2, bswg.m116252a(bswh2.f147433b)));
                    }
                    if (adyf.m51386a(eot.f15436a)) {
                        Chip chip4 = eyu.f16056j;
                        ColorStateList a2 = adyg.m51400a(C1165lm.m19351a(adyg.m51404b(3), adyg.m51405b(eyu.f16047a, 16842801, C0126R.color.google_white)));
                        bhgf bhgf2 = chip4.f151140b;
                        if (bhgf2 != null) {
                            bhgf2.mo63698a(a2);
                        }
                    }
                    eyu.f16056j.setVisibility(0);
                    if (ezl4.f16099f != null) {
                        Chip chip5 = eyu.f16056j;
                        bsui bsui4 = bsys5.f147715e;
                        if (bsui4 == null) {
                            bsui4 = bsui.f147128e;
                        }
                        bsxn bsxn = bsui4.f147133d;
                        if (bsxn == null) {
                            bsxn = bsxn.f147586d;
                        }
                        evi.m11174a(chip5, bsxn, ezl4.f16099f);
                    }
                    View view2 = eyu.f16058l;
                    if (view2 != null) {
                        view2.setPadding(0, 0, 0, eyu.f16047a.getResources().getDimensionPixelSize(C0126R.dimen.as_poc_appbar_clp_expanded_bottom_padding));
                    }
                }
            }
        } else if (ezl4.f16097d == null) {
            sre.m36087g(eyu.f16047a);
            eyu.f16068v = 1;
            eyu.mo10596a((String) null);
        } else {
            sre.m36087g(eyu.f16047a);
            bswk bswk = ezl4.f16097d;
            if ((bswk.f147447a & 1) != 0) {
                str2 = bswk.f147448b;
                eyu.f16068v = 3;
            } else {
                eyu.f16068v = 1;
                str2 = null;
            }
            eyu.mo10596a(str2);
        }
        if (ezm.f16104e.f16094a) {
            if (bsxk.f147581b == 4) {
                bsys = (bsys) bsxk.f147582c;
            } else {
                bsys = bsys.f147709h;
            }
            if ((bsys.f147711a & 4) != 0) {
                ezm.f16107h = new ezj(ezm, bsys);
                ezm.f16108i = bsys.f147714d;
            }
            ezm.f16104e.f16095b = true;
        }
        if (ezm.f16101b.f16057k != null) {
            ((deu) ezm.getActivity()).mo8626a(ezm.f16101b.f16057k);
        }
        if (i2 == 3) {
            sre.m36087g(ezm.getContext());
            ezm.f16101b.mo10600d();
            ezm.f16101b.mo10600d();
        } else {
            if (((fcj) ezm.f16100a.f16308a).f16274e) {
                ezm.f16101b.mo10600d();
                ezm.f16101b.mo10594a(new eyw(ezm), C0126R.C0127drawable.quantum_ic_close_vd_theme_24, C0126R.string.abc_action_mode_done);
            } else {
                ezm.f16101b.mo10600d();
                eyu eyu2 = ezm.f16101b;
                eyx eyx = new eyx(ezm);
                sre.m36087g(eyu2.f16047a);
                if (!evi.m11187a(eyu2.f16047a)) {
                    i = C0126R.C0127drawable.quantum_ic_arrow_back_vd_theme_24;
                } else {
                    i = C0126R.C0127drawable.quantum_ic_arrow_forward_vd_theme_24;
                }
                eyu2.mo10594a(eyx, i, C0126R.string.abc_action_bar_up_description);
            }
            if (i2 != 3) {
                sre.m36087g(ezm.getContext());
                if (ezm.f16104e.f16094a) {
                    ezm.getView().post(new eyy(ezm));
                } else {
                    ezm.f16105f.setVisibility(0);
                }
                ezm.f16103d = ezm.getView().findViewById(C0126R.C0129id.collapsed_avatar_touch_view);
                ezm.f16103d.setContentDescription(ezm.getString(C0126R.string.as_account_spinner_a11y_description, ezm.f16100a.mo10733b().f16458a));
                ezm.f16103d.setVisibility(0);
                if (ezm.f16104e.f16094a) {
                    ezm.mo10623a(ezm.f16103d, new eyz(ezm), ezm.getString(C0126R.string.as_account_spinner_a11y_tap_action));
                    ezm.mo10623a(ezm.f16105f, null, null);
                    return;
                }
                return;
            }
        }
        ezm.f16105f.setVisibility(4);
        ezm.f16103d = ezm.getView().findViewById(C0126R.C0129id.collapsed_avatar_touch_view);
        ezm.f16103d.setContentDescription(ezm.getString(C0126R.string.as_account_spinner_a11y_description, ezm.f16100a.mo10733b().f16458a));
        ezm.f16103d.setVisibility(0);
        if (ezm.f16104e.f16094a) {
        }
    }
}

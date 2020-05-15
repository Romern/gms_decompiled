package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;

/* renamed from: exy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class exy extends ete {

    /* renamed from: g */
    private final boolean f16009g;

    public exy(bsuz bsuz, LinearLayout linearLayout, boolean z, evl evl, fgt fgt) {
        super(bsuz, linearLayout, evl, fgt);
        this.f16009g = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10500a() {
        return C0126R.C0128layout.as_bottom_nav_menu_item_block;
    }

    /* renamed from: b */
    public final View mo10570b() {
        boolean z;
        FadeInImageView fadeInImageView = (FadeInImageView) this.f15670c.findViewById(C0126R.C0129id.menu_drawer_item_icon);
        TextView textView = (TextView) this.f15670c.findViewById(C0126R.C0129id.menu_drawer_item_label);
        fgt fgt = this.f15673f;
        bsuz bsuz = (bsuz) this.f15668a;
        if ((bsuz.f147215a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        bswh bswh = bsuz.f147218d;
        if (bswh == null) {
            bswh = bswh.f147430g;
        }
        evi.m11184a(fgt, fadeInImageView, z, bswh);
        evi.m11180a(textView, ((bsuz) this.f15668a).f147217c);
        C1280ps.m19885a(textView, fadeInImageView.getVisibility() == 8 ? this.f15669b.getResources().getDimensionPixelSize(C0126R.dimen.as_bottom_drawer_icon_space) : 0, 0, 0, 0);
        this.f15670c.setSelected(this.f16009g);
        if (this.f16009g) {
            this.f15670c.sendAccessibilityEvent(4);
            C1280ps.m19890a(this.f15670c, adyg.m51401a(this.f15672e, (int) C0126R.attr.asBottomNavMenuDrawerItemHighlight));
            evd.m11165a(fadeInImageView, adyg.m51405b(this.f15672e, C0126R.attr.colorPrimaryGoogle, C0126R.color.google_blue600));
            C1334rs.m20104a(textView, C0126R.style.AsBottomMenuDrawerItemSelectedAppearance);
        } else {
            C1280ps.m19890a(this.f15670c, adyg.m51401a(this.f15672e, (int) C0126R.attr.asRipple));
            evd.m11165a(fadeInImageView, adyg.m51405b(this.f15672e, C0126R.attr.colorOnSurfaceVariant, C0126R.color.google_grey700));
            C1334rs.m20104a(textView, C0126R.style.AsBottomMenuDrawerItemAppearance);
        }
        View view = this.f15670c;
        bsxn bsxn = ((bsuz) this.f15668a).f147216b;
        if (bsxn == null) {
            bsxn = bsxn.f147586d;
        }
        evi.m11174a(view, bsxn, this.f15671d);
        return this.f15670c;
    }
}

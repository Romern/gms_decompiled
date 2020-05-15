package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PagerTabLayout extends TabLayout {

    /* renamed from: a */
    public fam f7821a;

    /* renamed from: b */
    public fhl f7822b;

    public PagerTabLayout(Context context) {
        super(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.d(android.view.View, int):void
     arg types: [bhnx, int]
     candidates:
      ps.d(android.view.View, float):void
      ps.d(android.view.View, int):void */
    /* renamed from: a */
    public final void mo6364a(bhnu bhnu, int i, boolean z) {
        fam fam;
        if (cbro.m128208l() && (fam = this.f7821a) != null) {
            fas fas = fam.f16164a;
            bswg b = ((fes) fas.f16175f.get(i)).mo10710b();
            if (b != null) {
                if (evi.m11187a(fas.getContext())) {
                    C1280ps.m19912d((View) bhnu.f119169h, 1);
                } else {
                    C1280ps.m19912d((View) bhnu.f119169h, 0);
                }
                bhnu.mo64061a(eve.m11168b(fas.getContext(), b));
            } else {
                bhnu.mo64061a((Drawable) null);
            }
        }
        super.mo6364a(bhnu, i, z);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f7822b.f16609a.mo6361a(i);
    }

    public PagerTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PagerTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

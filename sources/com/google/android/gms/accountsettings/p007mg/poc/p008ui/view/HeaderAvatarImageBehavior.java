package com.google.android.gms.accountsettings.p007mg.poc.p008ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.gms.accountsettings.mg.poc.ui.view.HeaderAvatarImageBehavior */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HeaderAvatarImageBehavior extends aim {
    public HeaderAvatarImageBehavior(Context context, AttributeSet attributeSet) {
    }

    /* renamed from: a */
    private static final float m4982a(float f, float f2, float f3) {
        return (f * (1.0f - f3)) + (f2 * f3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo772a(View view, View view2) {
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) view;
        return view2 instanceof AppBarLayout;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo777a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) view;
        AppBarLayout appBarLayout = (AppBarLayout) view2;
        int c = appBarLayout.mo70975c();
        int c2 = ((AppBarLayout.Behavior) ((aip) appBarLayout.getLayoutParams()).f596a).mo63602c();
        View findViewById = coordinatorLayout.findViewById(C0126R.C0129id.collapsed_avatar_placeholder);
        View findViewById2 = coordinatorLayout.findViewById(C0126R.C0129id.expanded_avatar_placeholder);
        float f = 0.0f;
        if (!(c == 0 || findViewById2 == null)) {
            f = 1.0f - (((float) (-c2)) / ((float) c));
        }
        if (findViewById2 == null) {
            findViewById2 = findViewById;
        }
        if (findViewById == null) {
            return true;
        }
        Rect rect = new Rect();
        findViewById.getDrawingRect(rect);
        coordinatorLayout.offsetDescendantRectToMyCoords(findViewById, rect);
        Rect rect2 = new Rect();
        findViewById2.getDrawingRect(rect2);
        coordinatorLayout.offsetDescendantRectToMyCoords(findViewById2, rect2);
        Resources resources = accountParticleDisc.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0126R.dimen.as_collapsed_avatar_size);
        float dimensionPixelSize2 = (float) resources.getDimensionPixelSize(C0126R.dimen.as_expanded_avatar_size);
        float f2 = ((float) dimensionPixelSize) / dimensionPixelSize2;
        float f3 = 1.0f - f2;
        float f4 = f2 + (f3 * f);
        int i = rect.left;
        int i2 = rect2.left;
        int i3 = rect.top;
        int i4 = rect2.top;
        float f5 = (f3 / 2.0f) * dimensionPixelSize2 * (1.0f - f);
        accountParticleDisc.setX(m4982a((float) i, (float) i2, f) - f5);
        accountParticleDisc.setY(m4982a((float) i3, (float) i4, f) - f5);
        accountParticleDisc.setScaleX(f4);
        accountParticleDisc.setScaleY(f4);
        return true;
    }
}

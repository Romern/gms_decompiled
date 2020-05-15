package p000;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.util.Property;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.RingView;

/* renamed from: bddk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bddk {

    /* renamed from: f */
    public static final Property f105364f = new bddj(Integer.class, "ringThickness");

    /* renamed from: a */
    public final RingView f105365a;

    /* renamed from: b */
    public final int f105366b;

    /* renamed from: c */
    public final int f105367c;

    /* renamed from: d */
    public bmxv f105368d = bmvz.f131120a;

    /* renamed from: e */
    public AnimatorSet f105369e = null;

    public bddk(RingView ringView, int i) {
        int i2;
        this.f105365a = ringView;
        int dimensionPixelSize = ringView.getResources().getDimensionPixelSize(C0126R.dimen.og_apd_min_avatar_size_for_large_ring);
        Resources resources = ringView.getResources();
        if (i < dimensionPixelSize) {
            i2 = C0126R.dimen.og_apd_small_ring_width;
        } else {
            i2 = C0126R.dimen.og_apd_large_ring_width;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        this.f105367c = dimensionPixelSize2;
        int i3 = i + (dimensionPixelSize2 * 4) + 2;
        this.f105366b = i3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 17;
        ringView.setLayoutParams(layoutParams);
        ringView.f111393b = this.f105367c;
        ringView.f111394c = this.f105366b / 2;
        ringView.setVisibility(0);
    }
}

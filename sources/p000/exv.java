package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.view.BottomNavMenuScrollView;

/* renamed from: exv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class exv implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ boolean f15996a;

    /* renamed from: b */
    final /* synthetic */ AccessibilityManager f15997b;

    /* renamed from: c */
    final /* synthetic */ exx f15998c;

    public exv(exx exx, boolean z, AccessibilityManager accessibilityManager) {
        this.f15998c = exx;
        this.f15996a = z;
        this.f15997b = accessibilityManager;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AccessibilityManager accessibilityManager;
        this.f15998c.f16002d.removeOnLayoutChangeListener(this);
        if (!this.f15996a && ((accessibilityManager = this.f15997b) == null || !accessibilityManager.isEnabled())) {
            exx exx = this.f15998c;
            BottomNavMenuScrollView bottomNavMenuScrollView = exx.f16003e;
            int height = exx.f16001c.getHeight() / 2;
            Resources resources = exx.getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0126R.dimen.as_bottom_drawer_top_padding);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0126R.dimen.as_bottom_drawer_item_height);
            bxwc bxwc = exx.f16000b.f147206a;
            int size = bxwc.size();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                int i11 = ((bsux) bxwc.get(i9)).f147209a;
                int i12 = 1;
                if (i11 == 1) {
                    i12 = dimensionPixelSize2;
                    i10 = 0;
                } else if (i11 != 2) {
                    i12 = 0;
                }
                int i13 = dimensionPixelSize + i12;
                if (i13 > height) {
                    int i14 = dimensionPixelSize - i10;
                    Context context = exx.getContext();
                    int dimensionPixelSize3 = (context.getResources().getDimensionPixelSize(C0126R.dimen.as_bottom_drawer_item_height) / 2) + (context.getResources().getDimensionPixelSize(C0126R.dimen.as_bottom_drawer_item_text_size) / 4);
                    int i15 = i14 + dimensionPixelSize3;
                    if (i15 > height) {
                        dimensionPixelSize = i14 - (dimensionPixelSize2 - dimensionPixelSize3);
                    } else {
                        dimensionPixelSize = i15;
                    }
                } else {
                    i10 += i12;
                    i9++;
                    dimensionPixelSize = i13;
                }
            }
            bottomNavMenuScrollView.f7782a = Math.min(dimensionPixelSize, this.f15998c.f16002d.getHeight());
        } else {
            exx exx2 = this.f15998c;
            exx2.f16003e.f7782a = exx2.f16001c.getHeight();
        }
        exx exx3 = this.f15998c;
        exx3.f16003e.f7783b = exx3.f16001c.getHeight();
        new adzt(Looper.getMainLooper()).post(new C0975ext(this, this.f15997b));
    }
}

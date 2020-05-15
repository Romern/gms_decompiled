package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: bjae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjae implements biyr {

    /* renamed from: a */
    public final TemplateLayout f122406a;

    /* renamed from: b */
    private final int f122407b;

    /* renamed from: c */
    private final ImageView.ScaleType f122408c;

    public bjae(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        ImageView a;
        ImageView a2;
        int i2;
        this.f122406a = templateLayout;
        Context context = templateLayout.getContext();
        ImageView a3 = mo64938a();
        if (a3 != null) {
            this.f122407b = a3.getLayoutParams().height;
            this.f122408c = a3.getScaleType();
        } else {
            this.f122407b = 0;
            this.f122408c = null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bizg.f122375i, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (!(resourceId == 0 || (a2 = mo64938a()) == null)) {
            a2.setImageResource(resourceId);
            if (resourceId != 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a2.setVisibility(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        ImageView a4 = mo64938a();
        if (a4 != null) {
            ViewGroup.LayoutParams layoutParams = a4.getLayoutParams();
            int i3 = Build.VERSION.SDK_INT;
            layoutParams.height = !z ? this.f122407b : a4.getMaxHeight();
            a4.setLayoutParams(layoutParams);
            a4.setScaleType(!z ? this.f122408c : ImageView.ScaleType.FIT_CENTER);
        }
        int color = obtainStyledAttributes.getColor(1, 0);
        if (!(color == 0 || (a = mo64938a()) == null)) {
            a.setColorFilter(color);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final ImageView mo64938a() {
        return (ImageView) this.f122406a.mo71345b(C0126R.C0129id.sud_layout_icon);
    }

    /* renamed from: a */
    public final void mo64939a(CharSequence charSequence) {
        ImageView a = mo64938a();
        if (a != null) {
            a.setContentDescription(charSequence);
        }
    }
}

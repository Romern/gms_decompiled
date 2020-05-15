package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class MediaRouteVolumeSlider extends C1506yb {

    /* renamed from: a */
    private final float f1546a;

    /* renamed from: b */
    private Drawable f1547b;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        if (!isEnabled()) {
            i = (int) (this.f1546a * 255.0f);
        } else {
            i = 255;
        }
        this.f1547b.setColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.f1547b.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(0, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(0, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public final void setThumb(Drawable drawable) {
        this.f1547b = drawable;
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        this.f1546a = context.getTheme().resolveAttribute(16842803, typedValue, true) ? typedValue.getFloat() : 0.5f;
    }
}

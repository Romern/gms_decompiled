package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.setupwizardlib.TemplateLayout;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* renamed from: bms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bms implements bmt {

    /* renamed from: a */
    private final TemplateLayout f5168a;

    public bms(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        ImageView a;
        this.f5168a = templateLayout;
        int i2 = 0;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, blz.f5143j, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (!(resourceId == 0 || (a = mo3288a()) == null)) {
            a.setImageResource(resourceId);
            a.setVisibility(resourceId == 0 ? 8 : i2);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final ImageView mo3288a() {
        return (ImageView) this.f5168a.mo4081c(C0126R.C0129id.suw_layout_icon);
    }
}

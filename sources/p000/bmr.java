package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.setupwizardlib.TemplateLayout;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* renamed from: bmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmr implements bmt {

    /* renamed from: a */
    private final TemplateLayout f5167a;

    /* renamed from: a */
    public final TextView mo3286a() {
        return (TextView) this.f5167a.mo4081c(C0126R.C0129id.suw_layout_title);
    }

    public bmr(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView a;
        this.f5167a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, blz.f5141h, i, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null) {
            mo3287a(text);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = templateLayout.getContext().obtainStyledAttributes(attributeSet, blz.f5136c, i, 0);
        ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
        if (!(colorStateList == null || (a = mo3286a()) == null)) {
            a.setTextColor(colorStateList);
        }
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void mo3287a(CharSequence charSequence) {
        TextView a = mo3286a();
        if (a != null) {
            a.setText(charSequence);
        }
    }
}

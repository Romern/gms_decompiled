package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: bjad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjad implements biyr {

    /* renamed from: a */
    public final TemplateLayout f122405a;

    public bjad(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.f122405a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, bizg.f122367a, i, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null) {
            mo64937a(text);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            mo64936a(colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final TextView mo64934a() {
        return (TextView) this.f122405a.mo71345b(C0126R.C0129id.suc_layout_title);
    }

    /* renamed from: a */
    public final void mo64935a(int i) {
        TextView a = mo64934a();
        if (a != null) {
            a.setText(i);
        }
    }

    /* renamed from: a */
    public final void mo64936a(ColorStateList colorStateList) {
        TextView a = mo64934a();
        if (a != null) {
            a.setTextColor(colorStateList);
        }
    }

    /* renamed from: a */
    public final void mo64937a(CharSequence charSequence) {
        TextView a = mo64934a();
        if (a != null) {
            a.setText(charSequence);
        }
    }
}

package p000;

import android.content.Context;
import android.support.p002v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* renamed from: auax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auax extends AppCompatImageView {
    public auax(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean performClick() {
        auav.m76664a(this);
        return super.performClick();
    }

    public final void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }
}

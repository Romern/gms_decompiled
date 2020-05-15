package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.p002v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaRouteExpandCollapseButton extends AppCompatImageButton {

    /* renamed from: a */
    public final AnimationDrawable f1540a;

    /* renamed from: b */
    public final AnimationDrawable f1541b;

    /* renamed from: c */
    public final String f1542c;

    /* renamed from: d */
    public final String f1543d;

    /* renamed from: e */
    public boolean f1544e;

    /* renamed from: f */
    public View.OnClickListener f1545f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1545f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r3 == 0) goto L_0x0035;
     */
    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        this.f1540a = (AnimationDrawable) C1133kh.m17836a(context, (int) C0126R.C0127drawable.mr_group_expand);
        this.f1541b = (AnimationDrawable) C1133kh.m17836a(context, (int) C0126R.C0127drawable.mr_group_collapse);
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{C0126R.attr.colorPrimary});
            i2 = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0126R.attr.colorPrimary, typedValue, true);
        if (typedValue.resourceId != 0) {
            i2 = context.getResources().getColor(typedValue.resourceId);
        } else {
            i2 = typedValue.data;
        }
        if (C1165lm.m19354b(i2) < 3.0d) {
            i3 = -570425344;
        } else {
            i3 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        this.f1540a.setColorFilter(porterDuffColorFilter);
        this.f1541b.setColorFilter(porterDuffColorFilter);
        this.f1542c = context.getString(C0126R.string.mr_controller_expand_group);
        this.f1543d = context.getString(C0126R.string.mr_controller_collapse_group);
        setImageDrawable(this.f1540a.getFrame(0));
        setContentDescription(this.f1542c);
        super.setOnClickListener(new akj(this));
    }
}

package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupcompat.view.StatusBarBackgroundLayout;

/* renamed from: biys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biys implements biyr {

    /* renamed from: a */
    private final bixl f122340a;

    /* renamed from: b */
    private StatusBarBackgroundLayout f122341b;

    /* renamed from: c */
    private LinearLayout f122342c;

    /* renamed from: d */
    private final View f122343d;

    public biys(bixl bixl, Window window, AttributeSet attributeSet, int i) {
        boolean z;
        this.f122340a = bixl;
        View b = bixl.mo71345b(C0126R.C0129id.suc_layout_status);
        if (b != null) {
            if (b instanceof StatusBarBackgroundLayout) {
                this.f122341b = (StatusBarBackgroundLayout) b;
            } else {
                this.f122342c = (LinearLayout) b;
            }
            this.f122343d = window.getDecorView();
            int i2 = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            TypedArray obtainStyledAttributes = bixl.getContext().obtainStyledAttributes(attributeSet, bixm.f122207d, i, 0);
            int i3 = Build.VERSION.SDK_INT;
            if ((this.f122343d.getSystemUiVisibility() & 8192) == 8192) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = obtainStyledAttributes.getBoolean(0, z);
            int i4 = Build.VERSION.SDK_INT;
            if (this.f122340a.mo64840c()) {
                Context context = this.f122340a.getContext();
                z2 = biyk.m102977a(context).mo64872d(context, biyj.CONFIG_LIGHT_STATUS_BAR);
            }
            if (!z2) {
                View view = this.f122343d;
                view.setSystemUiVisibility(view.getSystemUiVisibility() & -8193);
            } else {
                View view2 = this.f122343d;
                view2.setSystemUiVisibility(8192 | view2.getSystemUiVisibility());
            }
            mo64891a(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
    }

    /* renamed from: a */
    public final void mo64891a(Drawable drawable) {
        boolean z;
        if (this.f122340a.mo64840c()) {
            Context context = this.f122340a.getContext();
            drawable = biyk.m102977a(context).mo64870b(context, biyj.CONFIG_STATUS_BAR_BACKGROUND);
        }
        StatusBarBackgroundLayout statusBarBackgroundLayout = this.f122341b;
        if (statusBarBackgroundLayout != null) {
            statusBarBackgroundLayout.f151477a = drawable;
            boolean z2 = true;
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            int i = Build.VERSION.SDK_INT;
            statusBarBackgroundLayout.setWillNotDraw(z);
            if (drawable == null) {
                z2 = false;
            }
            statusBarBackgroundLayout.setFitsSystemWindows(z2);
            statusBarBackgroundLayout.invalidate();
            return;
        }
        this.f122342c.setBackgroundDrawable(drawable);
    }
}

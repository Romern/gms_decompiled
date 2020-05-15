package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: bhei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhei extends aim {

    /* renamed from: a */
    private bhej f118381a;

    /* renamed from: b */
    private int f118382b = 0;

    public bhei() {
    }

    /* renamed from: a */
    public final boolean mo63601a(int i) {
        bhej bhej = this.f118381a;
        if (bhej != null) {
            return bhej.mo63604a(i);
        }
        this.f118382b = i;
        return false;
    }

    /* renamed from: c */
    public final int mo63602c() {
        bhej bhej = this.f118381a;
        if (bhej != null) {
            return bhej.f118384b;
        }
        return 0;
    }

    public bhei(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo773a(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo63597c(coordinatorLayout, view, i);
        if (this.f118381a == null) {
            this.f118381a = new bhej(view);
        }
        this.f118381a.mo63603a();
        this.f118381a.mo63605b();
        int i2 = this.f118382b;
        if (i2 == 0) {
            return true;
        }
        this.f118381a.mo63604a(i2);
        this.f118382b = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo63597c(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.mo1876b(view, i);
    }
}

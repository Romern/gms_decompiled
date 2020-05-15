package androidx.wear.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwipeDismissFrameLayout extends awk {

    /* renamed from: a */
    public final ArrayList f1807a;

    /* renamed from: b */
    public final int f1808b;

    /* renamed from: c */
    public final DecelerateInterpolator f1809c;

    /* renamed from: d */
    public final AccelerateInterpolator f1810d;

    /* renamed from: e */
    public final DecelerateInterpolator f1811e;

    /* renamed from: f */
    public boolean f1812f;

    /* renamed from: g */
    public final awh f1813g;

    /* renamed from: k */
    private final awg f1814k;

    /* renamed from: l */
    private final awj f1815l;

    public SwipeDismissFrameLayout(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    public final void mo2194a() {
        animate().cancel();
        setTranslationX(0.0f);
        setAlpha(1.0f);
        this.f1812f = false;
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1813g = new awh(this);
        this.f1814k = new awg(this);
        this.f1815l = new awj(this);
        this.f1807a = new ArrayList();
        this.f2430h = this.f1813g;
        this.f2431i = this.f1814k;
        this.f2432j = this.f1815l;
        this.f1808b = getContext().getResources().getInteger(17694720);
        this.f1809c = new DecelerateInterpolator(1.5f);
        this.f1810d = new AccelerateInterpolator(1.5f);
        this.f1811e = new DecelerateInterpolator(1.5f);
    }
}

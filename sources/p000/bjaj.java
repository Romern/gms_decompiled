package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.view.HeaderRecyclerView;

/* renamed from: bjaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjaj implements biyr {

    /* renamed from: a */
    public final RecyclerView f122420a;

    /* renamed from: b */
    public View f122421b;

    /* renamed from: c */
    public bize f122422c = new bize(this.f122423d.getContext());

    /* renamed from: d */
    private final TemplateLayout f122423d;

    /* renamed from: e */
    private Drawable f122424e;

    /* renamed from: f */
    private Drawable f122425f;

    /* renamed from: g */
    private int f122426g;

    /* renamed from: h */
    private int f122427h;

    public bjaj(TemplateLayout templateLayout, RecyclerView recyclerView) {
        this.f122423d = templateLayout;
        this.f122420a = recyclerView;
        this.f122423d.getContext();
        recyclerView.setLayoutManager(new aah());
        if (recyclerView instanceof HeaderRecyclerView) {
            this.f122421b = ((HeaderRecyclerView) recyclerView).f151521a;
        }
        this.f122420a.addItemDecoration(this.f122422c);
    }

    /* renamed from: a */
    public final void mo64952a() {
        if (this.f122425f == null) {
            mo64956b();
        }
    }

    /* renamed from: b */
    public final void mo64956b() {
        int i = Build.VERSION.SDK_INT;
        if (this.f122423d.isLayoutDirectionResolved()) {
            if (this.f122424e == null) {
                this.f122424e = this.f122422c.f122358a;
            }
            InsetDrawable a = bjau.m103127a(this.f122424e, this.f122426g, this.f122427h, this.f122423d);
            this.f122425f = a;
            this.f122422c.mo64898a(a);
        }
    }

    /* renamed from: a */
    public final void mo64953a(int i, int i2) {
        this.f122426g = i;
        this.f122427h = i2;
        mo64956b();
    }

    /* renamed from: a */
    public final void mo64954a(abh abh) {
        this.f122420a.setAdapter(abh);
    }

    /* renamed from: a */
    public final void mo64955a(AttributeSet attributeSet, int i) {
        boolean z;
        Context context = this.f122423d.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bizg.f122381o, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            bizp bizp = (bizp) new bizw(context).mo64929a(resourceId);
            TemplateLayout templateLayout = this.f122423d;
            if (templateLayout instanceof GlifLayout) {
                z = ((GlifLayout) templateLayout).f151482h;
            } else {
                z = false;
            }
            bizv bizv = new bizv(bizp, z);
            bizv.mo170a(obtainStyledAttributes.getBoolean(4, false));
            mo64954a(bizv);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize == -1) {
            mo64953a(obtainStyledAttributes.getDimensionPixelSize(3, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0));
        } else {
            mo64953a(dimensionPixelSize, 0);
        }
        obtainStyledAttributes.recycle();
    }
}

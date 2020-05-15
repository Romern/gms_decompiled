package com.google.android.setupdesign;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardRecyclerLayout extends SetupWizardLayout {

    /* renamed from: a */
    protected bjaj f151487a;

    public SetupWizardRecyclerLayout(Context context) {
        this(context, 0, 0);
    }

    /* renamed from: b */
    private final void m117844b(AttributeSet attributeSet, int i) {
        this.f151487a.mo64955a(attributeSet, i);
        mo71343a(bjaj.class, this.f151487a);
        bjas bjas = (bjas) mo71342a(bjas.class);
        bjas.f122440b = new bjal(bjas, this.f151487a.f122420a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo64837a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = C0126R.C0128layout.sud_recycler_template;
        }
        return super.mo64837a(layoutInflater, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo71346d() {
        View findViewById = findViewById(C0126R.C0129id.sud_recycler_view);
        if (findViewById instanceof RecyclerView) {
            this.f151487a = new bjaj(this, (RecyclerView) findViewById);
            return;
        }
        throw new IllegalStateException("SetupWizardRecyclerLayout should use a template with recycler view");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f151487a.mo64952a();
    }

    public SetupWizardRecyclerLayout(Context context, int i, int i2) {
        super(context, i, i2);
        m117844b(null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ViewGroup mo64838a(int i) {
        if (i == 0) {
            i = C0126R.C0129id.sud_recycler_view;
        }
        return super.mo64838a(i);
    }

    public SetupWizardRecyclerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m117844b(attributeSet, 0);
    }

    public SetupWizardRecyclerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m117844b(attributeSet, i);
    }

    /* renamed from: b */
    public final View mo71345b(int i) {
        View findViewById;
        View view = this.f151487a.f122421b;
        return (view == null || (findViewById = view.findViewById(i)) == null) ? super.findViewById(i) : findViewById;
    }
}

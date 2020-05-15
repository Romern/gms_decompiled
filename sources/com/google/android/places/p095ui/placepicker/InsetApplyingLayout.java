package com.google.android.places.p095ui.placepicker;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.places.ui.placepicker.InsetApplyingLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InsetApplyingLayout extends FrameLayout {

    /* renamed from: a */
    private final List f151431a = new ArrayList();

    /* renamed from: b */
    private Rect f151432b;

    public InsetApplyingLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        this.f151432b = new Rect(rect);
        List list = this.f151431a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bilu) list.get(i)).mo64748a(new Rect(this.f151432b));
        }
        return true;
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof bilu) {
            bilu bilu = (bilu) view;
            this.f151431a.add(bilu);
            Rect rect = this.f151432b;
            if (rect != null) {
                bilu.mo64748a(new Rect(rect));
            }
        }
    }

    public final void removeView(View view) {
        super.removeView(view);
        if (view instanceof bilu) {
            this.f151431a.remove(view);
        }
    }

    public InsetApplyingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InsetApplyingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

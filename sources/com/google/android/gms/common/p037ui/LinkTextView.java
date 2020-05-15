package com.google.android.gms.common.p037ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.google.android.gms.common.ui.LinkTextView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LinkTextView extends TextView {

    /* renamed from: a */
    private sol f30396a;

    public LinkTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f30396a.mo15814a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sol sol = new sol(this);
        this.f30396a = sol;
        C1280ps.m19894a(this, sol);
    }
}

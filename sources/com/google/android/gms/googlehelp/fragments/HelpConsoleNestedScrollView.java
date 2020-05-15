package com.google.android.gms.googlehelp.fragments;

import android.content.Context;
import android.graphics.Rect;
import android.support.p001v4.widget.NestedScrollView;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HelpConsoleNestedScrollView extends NestedScrollView {
    public HelpConsoleNestedScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return true;
    }

    public HelpConsoleNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HelpConsoleNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

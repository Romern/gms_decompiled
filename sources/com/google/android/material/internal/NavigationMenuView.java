package com.google.android.material.internal;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NavigationMenuView extends RecyclerView implements C1460wj {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo1220a(C1443vt vtVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new aah(1));
    }
}

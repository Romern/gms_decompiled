package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AbstractItemHierarchy implements bmd {

    /* renamed from: a */
    public int f7206a = 0;

    /* renamed from: b */
    private final ArrayList f7207b = new ArrayList();

    public AbstractItemHierarchy() {
    }

    /* renamed from: a */
    public final void mo4090a(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("notifyItemRangeInserted: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        ArrayList arrayList = this.f7207b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((bmc) arrayList.get(i3)).mo3267a(this, i, i2);
        }
    }

    /* renamed from: b */
    public final void mo4091b(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("notifyItemRangeChanged: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        ArrayList arrayList = this.f7207b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bmc) arrayList.get(i2)).mo3266a(this, i);
        }
    }

    /* renamed from: c */
    public final void mo4092c(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("notifyItemRangeInserted: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        ArrayList arrayList = this.f7207b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bmc) arrayList.get(i2)).mo3268b(this, i);
        }
    }

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, blz.f5134a);
        this.f7206a = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo3271a(bmc bmc) {
        this.f7207b.add(bmc);
    }
}

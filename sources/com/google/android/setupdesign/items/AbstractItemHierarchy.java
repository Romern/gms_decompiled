package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AbstractItemHierarchy implements bizp {

    /* renamed from: a */
    private final ArrayList f151488a = new ArrayList();

    /* renamed from: c */
    public int f151489c = 0;

    public AbstractItemHierarchy() {
    }

    /* renamed from: a */
    public final void mo71385a(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("notifyItemRangeInserted: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        ArrayList arrayList = this.f151488a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((bizo) arrayList.get(i3)).mo58968b(this, i, i2);
        }
    }

    /* renamed from: b */
    public final void mo71386b(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("notifyItemRangeInserted: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append("notifyItemRangeInserted: Invalid itemCount=");
            sb2.append(i2);
            Log.w("AbstractItemHierarchy", sb2.toString());
        } else {
            ArrayList arrayList = this.f151488a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((bizo) arrayList.get(i3)).mo58967a(this, i, i2);
            }
        }
    }

    /* renamed from: c */
    public final void mo71387c(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("notifyItemRangeChanged: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        ArrayList arrayList = this.f151488a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bizo) arrayList.get(i2)).mo64910a(this, i);
        }
    }

    /* renamed from: i */
    public final void mo71388i() {
        ArrayList arrayList = this.f151488a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bizo) arrayList.get(i)).mo64911cB();
        }
    }

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bizg.f122368b);
        this.f151489c = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo64920a(bizo bizo) {
        this.f151488a.add(bizo);
    }

    /* renamed from: b */
    public final void mo64922b(bizo bizo) {
        this.f151488a.remove(bizo);
    }
}

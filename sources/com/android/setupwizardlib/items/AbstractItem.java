package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AbstractItem extends AbstractItemHierarchy implements bmb {
    public AbstractItem() {
    }

    /* renamed from: a */
    public int mo3269a() {
        throw null;
    }

    /* renamed from: a */
    public final bmb mo3270a(int i) {
        return this;
    }

    /* renamed from: b */
    public final void mo4089b() {
        mo4091b(0);
    }

    /* renamed from: c */
    public bmd mo3272c() {
        if (this.f7206a != C0126R.C0129id.android_auto_item) {
            return null;
        }
        return this;
    }

    public AbstractItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

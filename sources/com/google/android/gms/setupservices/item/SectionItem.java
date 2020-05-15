package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.items.Item;
import com.google.android.setupdesign.items.ItemGroup;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SectionItem extends ItemGroup {

    /* renamed from: d */
    private final Item f107655d;

    public SectionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15402n);
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        Item item = new Item();
        this.f107655d = item;
        item.mo71396b(false);
        this.f107655d.mo71398d((int) C0126R.C0128layout.setupservices_items_google_services_section_header);
        this.f107655d.mo71395b(text);
        this.f107655d.mo71399d(false);
        mo58966a(this.f107655d);
    }

    /* renamed from: b */
    private final void m92485b() {
        if (this.f107655d.f151504f) {
            if (mo64923g() == 1) {
                this.f107655d.mo71399d(false);
            }
        } else if (mo64923g() > 0) {
            this.f107655d.mo71399d(true);
        }
    }

    /* renamed from: a */
    public final void mo58966a(bizp bizp) {
        super.mo58966a(bizp);
        m92485b();
    }

    /* renamed from: a */
    public final void mo58967a(bizp bizp, int i, int i2) {
        super.mo58967a(bizp, i, i2);
        m92485b();
    }

    /* renamed from: b */
    public final void mo58968b(bizp bizp, int i, int i2) {
        super.mo58968b(bizp, i, i2);
        m92485b();
    }
}

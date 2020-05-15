package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p002v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwitchItem extends Item implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private bizy f151512a;

    /* renamed from: h */
    public boolean f151513h = false;

    public SwitchItem() {
    }

    /* renamed from: a */
    public void mo48939a(View view) {
        super.mo48939a(view);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(C0126R.C0129id.sud_items_switch);
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(this.f151513h);
        switchCompat.setOnCheckedChangeListener(this);
        switchCompat.setEnabled(mo64908bJ());
    }

    /* renamed from: a */
    public final void mo71401a(bizy bizy) {
        this.f151512a = bizy;
    }

    /* renamed from: c */
    public final boolean mo71403c() {
        return this.f151513h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo71392j() {
        return C0126R.C0128layout.sud_items_switch;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f151513h = z;
        bizy bizy = this.f151512a;
        if (bizy != null) {
            bizy.mo47887a(z);
        }
    }

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bizg.f122384r);
        this.f151513h = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo71402a(boolean z) {
        if (this.f151513h != z) {
            this.f151513h = z;
            mo71384h();
            bizy bizy = this.f151512a;
            if (bizy != null) {
                bizy.mo47887a(z);
            }
        }
    }
}

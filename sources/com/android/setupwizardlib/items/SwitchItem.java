package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p002v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwitchItem extends Item implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e */
    public boolean f7227e = false;

    /* renamed from: f */
    public bml f7228f;

    public SwitchItem() {
    }

    /* renamed from: a */
    public void mo3263a(View view) {
        super.mo3263a(view);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(C0126R.C0129id.suw_items_switch);
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(this.f7227e);
        switchCompat.setOnCheckedChangeListener(this);
        switchCompat.setEnabled(((Item) this).f7217b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo4094f() {
        return C0126R.C0128layout.suw_items_switch;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f7227e = z;
        bml bml = this.f7228f;
        if (bml != null) {
            bml.mo3281a(z);
        }
    }

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, blz.f5151r);
        this.f7227e = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo4101a(boolean z) {
        if (this.f7227e != z) {
            this.f7227e = z;
            mo4089b();
            bml bml = this.f7228f;
            if (bml != null) {
                bml.mo3281a(z);
            }
        }
    }
}

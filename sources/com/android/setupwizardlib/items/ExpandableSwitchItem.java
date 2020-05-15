package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.android.setupwizardlib.view.CheckableLinearLayout;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExpandableSwitchItem extends SwitchItem implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* renamed from: g */
    private CharSequence f7214g;

    /* renamed from: h */
    private CharSequence f7215h;

    /* renamed from: i */
    private boolean f7216i = false;

    public ExpandableSwitchItem() {
    }

    /* renamed from: a */
    public final void mo3263a(View view) {
        super.mo3263a(view);
        View findViewById = view.findViewById(C0126R.C0129id.suw_items_expandable_switch_content);
        findViewById.setOnClickListener(this);
        if (findViewById instanceof CheckableLinearLayout) {
            ((CheckableLinearLayout) findViewById).setChecked(this.f7216i);
        }
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{16842806});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (colorStateList != null) {
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.suw_items_title);
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
                }
            }
            int i = Build.VERSION.SDK_INT;
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            for (Drawable drawable2 : compoundDrawablesRelative) {
                if (drawable2 != null) {
                    drawable2.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
                }
            }
        }
        view.setFocusable(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo4094f() {
        return C0126R.C0128layout.suw_items_expandable_switch;
    }

    /* renamed from: g */
    public final CharSequence mo4095g() {
        return !this.f7216i ? this.f7214g : this.f7215h;
    }

    public void onClick(View view) {
        boolean z = this.f7216i;
        boolean z2 = !z;
        if (z != z2) {
            this.f7216i = z2;
            mo4089b();
        }
    }

    public ExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, blz.f5138e);
        this.f7214g = obtainStyledAttributes.getText(0);
        this.f7215h = obtainStyledAttributes.getText(1);
        obtainStyledAttributes.recycle();
    }
}

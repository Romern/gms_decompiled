package com.google.android.setupdesign.items;

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
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.view.CheckableLinearLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExpandableSwitchItem extends SwitchItem implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* renamed from: a */
    private CharSequence f151496a;

    /* renamed from: b */
    public boolean f151497b = false;

    /* renamed from: i */
    private CharSequence f151498i;

    /* renamed from: j */
    private final C1251oq f151499j = new bizk(this);

    public ExpandableSwitchItem() {
        this.f151505g = 48;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, int):void
     arg types: [com.google.android.setupdesign.view.CheckableLinearLayout, int]
     candidates:
      ps.f(android.view.View, float):void
      ps.f(android.view.View, int):void */
    /* renamed from: a */
    public void mo48939a(View view) {
        super.mo48939a(view);
        View findViewById = view.findViewById(C0126R.C0129id.sud_items_expandable_switch_content);
        findViewById.setOnClickListener(this);
        if (findViewById instanceof CheckableLinearLayout) {
            CheckableLinearLayout checkableLinearLayout = (CheckableLinearLayout) findViewById;
            checkableLinearLayout.setChecked(this.f151497b);
            C1280ps.m19919f((View) checkableLinearLayout, this.f151497b ? 1 : 0);
            C1280ps.m19894a(checkableLinearLayout, this.f151499j);
        }
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{16842806});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (colorStateList != null) {
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.sud_items_title);
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

    /* renamed from: bI */
    public final CharSequence mo58964bI() {
        return this.f151497b ? this.f151498i : mo58963f();
    }

    /* renamed from: c */
    public final void mo71391c(boolean z) {
        if (this.f151497b != z) {
            this.f151497b = z;
            mo71384h();
        }
    }

    /* renamed from: f */
    public CharSequence mo58963f() {
        return this.f151496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo71392j() {
        return C0126R.C0128layout.sud_items_expandable_switch;
    }

    public void onClick(View view) {
        mo71391c(!this.f151497b);
    }

    public ExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bizg.f122371e);
        this.f151496a = obtainStyledAttributes.getText(0);
        this.f151498i = obtainStyledAttributes.getText(1);
        this.f151505g = obtainStyledAttributes.getInt(6, 48);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo71390a(CharSequence charSequence) {
        this.f151498i = charSequence;
        if (this.f151497b) {
            mo71388i();
        }
    }
}

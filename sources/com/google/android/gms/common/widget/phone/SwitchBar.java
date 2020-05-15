package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwitchBar extends LinearLayout implements Checkable, View.OnClickListener {

    /* renamed from: a */
    public sux f30418a;

    /* renamed from: b */
    public CharSequence f30419b;

    /* renamed from: c */
    private TextView f30420c;

    /* renamed from: d */
    private CompoundButton f30421d;

    /* renamed from: e */
    private int f30422e;

    /* renamed from: f */
    private int f30423f;

    /* renamed from: g */
    private CharSequence f30424g;

    /* renamed from: h */
    private CharSequence f30425h;

    /* renamed from: i */
    private int f30426i;

    /* renamed from: j */
    private int f30427j;

    /* renamed from: k */
    private int f30428k;

    public SwitchBar(Context context) {
        super(m22752b(context));
        m22751a(getContext(), (AttributeSet) null, (int) C0126R.attr.switchBarStyle, 2132019696);
    }

    /* renamed from: a */
    private static int m22749a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842806});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private static Context m22752b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{C0126R.attr.switchBarStyle});
        int resourceId = obtainStyledAttributes.getResourceId(0, 2132019696);
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    public final boolean isChecked() {
        return this.f30428k == 1;
    }

    public void onClick(View view) {
        toggle();
    }

    public final void setChecked(boolean z) {
        CharSequence charSequence;
        int i;
        CharSequence charSequence2;
        if (this.f30421d == null) {
            m22753b();
        }
        this.f30421d.setChecked(z);
        setSelected(z);
        TextView a = mo17942a();
        if (!z) {
            charSequence = this.f30425h;
        } else {
            charSequence = this.f30424g;
        }
        a.setText(charSequence);
        TextView a2 = mo17942a();
        if (!z) {
            i = this.f30423f;
        } else {
            i = this.f30422e;
        }
        a2.setTextColor(i);
        if (!z) {
            charSequence2 = this.f30425h;
        } else {
            charSequence2 = this.f30424g;
        }
        setContentDescription(charSequence2);
        sux sux = this.f30418a;
        if (sux != null) {
            sux.mo15271a(z);
        }
        this.f30428k = !z ? 2 : 1;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        CompoundButton compoundButton = this.f30421d;
        if (compoundButton != null) {
            compoundButton.setEnabled(!isEnabled());
            this.f30421d.setEnabled(z);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public SwitchBar(Context context, AttributeSet attributeSet) {
        super(m22752b(context), attributeSet);
        m22751a(getContext(), attributeSet, (int) C0126R.attr.switchBarStyle, 2132019696);
    }

    public SwitchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22751a(context, attributeSet, i, 2132019696);
    }

    /* renamed from: b */
    private final void m22753b() {
        CharSequence charSequence;
        Context context = getContext();
        boolean isChecked = isChecked();
        TextView textView = new TextView(context);
        this.f30420c = textView;
        if (!isChecked) {
            charSequence = this.f30425h;
        } else {
            charSequence = this.f30424g;
        }
        textView.setText(charSequence);
        CharSequence charSequence2 = this.f30419b;
        if (charSequence2 != null) {
            this.f30420c.setContentDescription(charSequence2);
        }
        addView(this.f30420c, m22750a(0, 1.0f, this.f30426i, 0));
        CompoundButton compoundButton = (CompoundButton) inflate(context, C0126R.C0128layout.common_switch_bar_toggle_widget, null);
        this.f30421d = compoundButton;
        compoundButton.setChecked(isChecked);
        this.f30421d.setClickable(false);
        setSelected(isChecked);
        setEnabled(isEnabled());
        addView(this.f30421d, m22750a(-2, 0.0f, 0, this.f30427j));
        setOnClickListener(this);
    }

    public SwitchBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m22751a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private static LinearLayout.LayoutParams m22750a(int i, float f, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, -2, f);
        layoutParams.gravity = 16;
        int i4 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(i3);
        return layoutParams;
    }

    /* renamed from: a */
    private final void m22751a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, suc.f45166b, i, i2);
        int i3 = 1;
        obtainStyledAttributes.getColor(1, -16777216);
        this.f30424g = obtainStyledAttributes.getText(7);
        this.f30425h = obtainStyledAttributes.getText(6);
        this.f30422e = obtainStyledAttributes.getColor(5, m22749a(context));
        this.f30423f = obtainStyledAttributes.getColor(4, m22749a(context));
        this.f30426i = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f30427j = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (!obtainStyledAttributes.getBoolean(0, false)) {
                i3 = 2;
            }
            this.f30428k = i3;
        } else {
            this.f30428k = 0;
        }
        obtainStyledAttributes.recycle();
        setOrientation(0);
        int i4 = Build.VERSION.SDK_INT;
        setBackgroundResource(C0126R.C0127drawable.common_switch_bar_background);
        if (this.f30428k != 0) {
            m22753b();
        }
    }

    /* renamed from: a */
    public final TextView mo17942a() {
        if (this.f30420c == null) {
            m22753b();
        }
        return this.f30420c;
    }

    /* renamed from: a */
    public final void mo17943a(boolean z) {
        sux sux = this.f30418a;
        this.f30418a = null;
        setChecked(z);
        this.f30418a = sux;
    }
}

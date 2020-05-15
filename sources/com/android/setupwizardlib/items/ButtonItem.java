package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonItem extends AbstractItem implements View.OnClickListener {

    /* renamed from: b */
    public boolean f7210b = true;

    /* renamed from: c */
    public CharSequence f7211c;

    /* renamed from: d */
    public int f7212d = C0126R.style.SuwButtonItem;

    /* renamed from: e */
    public Button f7213e;

    public ButtonItem() {
    }

    /* renamed from: a */
    public final int mo3269a() {
        return 0;
    }

    /* renamed from: d */
    public final boolean mo3264d() {
        return this.f7210b;
    }

    /* renamed from: e */
    public final int mo3265e() {
        return 0;
    }

    public void onClick(View view) {
    }

    public ButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, blz.f5135b);
        this.f7210b = obtainStyledAttributes.getBoolean(1, true);
        this.f7211c = obtainStyledAttributes.getText(3);
        this.f7212d = obtainStyledAttributes.getResourceId(0, C0126R.style.SuwButtonItem);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo3263a(View view) {
        throw new UnsupportedOperationException("Cannot bind to ButtonItem's view");
    }
}

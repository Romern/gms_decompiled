package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonItem extends AbstractItem implements View.OnClickListener {

    /* renamed from: a */
    public boolean f151492a = true;

    /* renamed from: b */
    public CharSequence f151493b;

    /* renamed from: d */
    public int f151494d = C0126R.style.SudButtonItem;

    /* renamed from: e */
    public Button f151495e;

    public ButtonItem() {
    }

    /* renamed from: a */
    public final void mo48939a(View view) {
        throw new UnsupportedOperationException("Cannot bind to ButtonItem's view");
    }

    /* renamed from: b */
    public final int mo64907b() {
        return 0;
    }

    /* renamed from: bJ */
    public final boolean mo64908bJ() {
        return this.f151492a;
    }

    /* renamed from: g */
    public final int mo64923g() {
        return 0;
    }

    public void onClick(View view) {
    }

    public ButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bizg.f122369c);
        this.f151492a = obtainStyledAttributes.getBoolean(1, true);
        this.f151493b = obtainStyledAttributes.getText(3);
        this.f151494d = obtainStyledAttributes.getResourceId(0, C0126R.style.SudButtonItem);
        obtainStyledAttributes.recycle();
    }
}

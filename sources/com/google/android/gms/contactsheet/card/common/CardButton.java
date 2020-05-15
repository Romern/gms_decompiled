package com.google.android.gms.contactsheet.card.common;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.button.MaterialButton;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardButton extends RelativeLayout {

    /* renamed from: a */
    public final MaterialButton f30615a;

    public CardButton(Context context) {
        super(context);
        if (cgne.m146262d()) {
            inflate(getContext(), C0126R.C0128layout.gm_card_button_tap_bugfix, this);
        } else {
            inflate(getContext(), C0126R.C0128layout.gm_card_button, this);
        }
        this.f30615a = (MaterialButton) findViewById(C0126R.C0129id.card_button_content);
    }

    /* renamed from: a */
    private static Drawable m22829a(Drawable drawable, int i) {
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    /* renamed from: b */
    public final void mo18001b() {
        mo17999a((int) C0126R.string.less);
        mo18003c(C0126R.C0127drawable.quantum_ic_expand_less_vd_theme_24);
    }

    /* renamed from: c */
    public final void mo18003c(int i) {
        int b = thh.m36966b(getContext());
        if (cgnz.m146325b() && cgnb.m146247b()) {
            b = thh.m36970f(getContext());
        }
        this.f30615a.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m22829a(C1391tv.m20459b(getContext(), i), b), (Drawable) null);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        findViewById(C0126R.C0129id.card_button_container).setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo17998a() {
        mo17999a((int) C0126R.string.common_more);
        mo18003c(C0126R.C0127drawable.quantum_ic_expand_more_vd_theme_24);
    }

    /* renamed from: b */
    public final void mo18002b(int i) {
        int b = thh.m36966b(getContext());
        if (cgnz.m146325b() && cgnb.m146247b()) {
            b = thh.m36970f(getContext());
        }
        this.f30615a.setCompoundDrawablesRelativeWithIntrinsicBounds(m22829a(C1391tv.m20459b(getContext(), i), b), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: a */
    public final void mo17999a(int i) {
        this.f30615a.setText(i);
    }

    /* renamed from: a */
    public final void mo18000a(String str) {
        this.f30615a.setText(str);
    }

    public CardButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (cgne.m146262d()) {
            inflate(getContext(), C0126R.C0128layout.gm_card_button_tap_bugfix, this);
        } else {
            inflate(getContext(), C0126R.C0128layout.gm_card_button, this);
        }
        this.f30615a = (MaterialButton) findViewById(C0126R.C0129id.card_button_content);
    }
}

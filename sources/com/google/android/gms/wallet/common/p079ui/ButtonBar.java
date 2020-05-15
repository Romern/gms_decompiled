package com.google.android.gms.wallet.common.p079ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.common.ui.ButtonBar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonBar extends LinearLayout {

    /* renamed from: a */
    public Button f110057a;

    /* renamed from: b */
    public View f110058b;

    /* renamed from: c */
    public Button f110059c;

    /* renamed from: d */
    private View f110060d;

    public ButtonBar(Context context) {
        super(context);
        m93886a(context, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.common.ui.ButtonBar, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m93886a(Context context, AttributeSet attributeSet) {
        setOrientation(0);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_button_bar_dialog, (ViewGroup) this, true);
        this.f110057a = (Button) findViewById(C0126R.C0129id.positive_btn);
        this.f110058b = findViewById(C0126R.C0129id.positive_btn_container);
        this.f110059c = (Button) findViewById(C0126R.C0129id.close_btn);
        this.f110060d = findViewById(C0126R.C0129id.button_progress_spinner);
        if (this.f110057a != null) {
            int i = Build.VERSION.SDK_INT;
            bkfr.m105560a(context, this.f110057a);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15407s);
        if (obtainStyledAttributes.hasValue(0)) {
            mo59846a(obtainStyledAttributes.getString(0));
        } else {
            mo59846a(this.f110057a.getText());
        }
        obtainStyledAttributes.recycle();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            if (bundle.containsKey("buttonsEnabled")) {
                mo59847a(bundle.getBoolean("buttonsEnabled"));
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putBoolean("buttonsEnabled", this.f110057a.isEnabled());
        return bundle;
    }

    public ButtonBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93886a(context, attributeSet);
    }

    public ButtonBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93886a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo59846a(CharSequence charSequence) {
        this.f110057a.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo59847a(boolean z) {
        this.f110057a.setEnabled(z);
        this.f110059c.setEnabled(z);
        if (!z) {
            this.f110060d.setVisibility(0);
        } else {
            this.f110060d.setVisibility(4);
        }
    }
}

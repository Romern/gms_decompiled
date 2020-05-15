package com.google.android.gms.wallet.p088ui.component.generic;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.ui.component.generic.SelectableUiFieldOptionView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectableUiFieldOptionView extends bkfd {

    /* renamed from: a */
    public TextView f110529a;

    public SelectableUiFieldOptionView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo52923a(String str) {
        super.mo52923a(str);
        this.f110529a.setTag(C0126R.C0129id.summary_expander_transition_name, str);
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        return this.f110529a.getText();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f124130k = (RadioButton) findViewById(C0126R.C0129id.radio_button);
        this.f110529a = (TextView) findViewById(C0126R.C0129id.field_label);
        this.f124131l = (ImageView) findViewById(C0126R.C0129id.expand_icon);
        this.f124132m = findViewById(C0126R.C0129id.option_divider_line);
        setBackgroundResource(C0126R.C0127drawable.wallet_uic_ripple_background);
        mo65947i();
    }

    public SelectableUiFieldOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SelectableUiFieldOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SelectableUiFieldOptionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

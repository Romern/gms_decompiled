package com.google.android.libraries.matchstick.p091ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.libraries.matchstick.ui.SettingsAccountItemView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsAccountItemView extends LinearLayout {

    /* renamed from: a */
    public TextView f111252a;

    /* renamed from: b */
    public View f111253b;

    /* renamed from: c */
    private TextView f111254c;

    /* renamed from: d */
    private View f111255d;

    public SettingsAccountItemView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo60428a() {
        this.f111255d.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo60431b(int i) {
        this.f111252a.setVisibility(0);
        this.f111252a.setText(i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.item_avatar);
        this.f111254c = (TextView) findViewById(C0126R.C0129id.item_text);
        this.f111252a = (TextView) findViewById(C0126R.C0129id.item_secondary_text);
        this.f111255d = findViewById(C0126R.C0129id.item_separator);
        this.f111253b = findViewById(C0126R.C0129id.item_secondary_separator);
    }

    public SettingsAccountItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo60429a(int i) {
        this.f111252a.setTextColor(i);
    }

    /* renamed from: b */
    public final void mo60432b(CharSequence charSequence) {
        this.f111254c.setVisibility(0);
        this.f111254c.setText(charSequence);
    }

    public SettingsAccountItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo60430a(CharSequence charSequence) {
        this.f111254c.setContentDescription(charSequence);
    }
}

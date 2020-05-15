package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.AccountChipView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AccountChipView extends LinearLayout {

    /* renamed from: a */
    private static ImageLoader f10145a;

    /* renamed from: b */
    private static hsn f10146b;

    public AccountChipView(Context context) {
        super(context);
        m6364a(context);
    }

    /* renamed from: a */
    private final void m6364a(Context context) {
        View.inflate(context, C0126R.C0128layout.account_chip_view, this);
    }

    /* renamed from: b */
    private final LinearLayout m6365b() {
        return (LinearLayout) findViewById(C0126R.C0129id.default_credential_avatar);
    }

    /* renamed from: c */
    private static ImageLoader m6366c() {
        if (f10145a == null) {
            f10146b = new hsn();
            f10145a = new ImageLoader(rpr.m34216b().getRequestQueue(), f10146b);
        }
        return f10145a;
    }

    public AccountChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6364a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final sup mo7425a() {
        return (sup) findViewById(C0126R.C0129id.credential_avatar);
    }

    public AccountChipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6364a(context);
    }

    /* renamed from: a */
    public final void mo7426a(hsm hsm) {
        String str = hsm.f20372d;
        TextView textView = (TextView) findViewById(C0126R.C0129id.credential_primary_label);
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        mo7427a(hsm.f20373e);
        if (!TextUtils.isEmpty(hsm.f20371c)) {
            String str2 = hsm.f20371c;
            m6365b().setVisibility(8);
            mo7425a().setVisibility(0);
            mo7425a().setImageUrl(str2, m6366c());
        } else if (hsm.f20370b) {
            int i = hsm.f20369a;
            m6365b().setVisibility(8);
            mo7425a().setVisibility(0);
            mo7425a().setDefaultImageResId(i);
            mo7425a().setImageUrl(null, m6366c());
        } else {
            int i2 = hsm.f20369a;
            mo7425a().setVisibility(8);
            m6365b().setVisibility(0);
            ((ImageView) findViewById(C0126R.C0129id.default_credential_avatar_icon)).setBackgroundResource(i2);
        }
        setContentDescription(hsm.f20372d);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo7427a(String str) {
        TextView textView = (TextView) findViewById(C0126R.C0129id.credential_secondary_label);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }
}

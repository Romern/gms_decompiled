package com.google.android.gms.tapandpay.wear.dialog;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearTapAndPayDialogChimeraActivity extends atex implements axou {

    /* renamed from: b */
    private String f109001b;

    /* renamed from: c */
    private String f109002c;

    /* renamed from: d */
    private String f109003d;

    /* renamed from: e */
    private rjx f109004e;

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        Bundle a = auai.m76640a(messageEventParcelable);
        if ("errorResponse".equals(a.getString("type"))) {
            int i = a.getInt("selectedButtonType");
            if (i == -1) {
                mo59507e();
            } else if (i == -2) {
                mo59508g();
            }
        }
    }

    /* renamed from: e */
    public void mo59507e() {
        setResult(-1);
        finish();
    }

    /* renamed from: g */
    public final void mo59508g() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f109004e = axoz.m82854b(this);
        setContentView((int) C0126R.C0128layout.tp_wear_error_dialog);
        if (getIntent().hasExtra("alert_icon")) {
            ((ImageView) findViewById(C0126R.C0129id.header_icon)).setImageDrawable(getDrawable(getIntent().getIntExtra("alert_icon", 0)));
        }
        TextView textView = (TextView) findViewById(C0126R.C0129id.title);
        String stringExtra = getIntent().getStringExtra("alert_title");
        this.f109001b = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.f109001b);
        }
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.message);
        String stringExtra2 = getIntent().getStringExtra("alert_msg");
        this.f109002c = stringExtra2;
        if (stringExtra2 != null) {
            textView2.setText(stringExtra2);
        }
        TextView textView3 = (TextView) findViewById(C0126R.C0129id.button_positive);
        textView3.setText(getIntent().getStringExtra("pos_text"));
        textView3.setOnClickListener(new auab(this));
        if (getIntent().hasExtra("pos_resid")) {
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(getDrawable(getIntent().getIntExtra("pos_resid", 0)), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        String stringExtra3 = getIntent().getStringExtra("neg_text");
        if (!TextUtils.isEmpty(stringExtra3)) {
            TextView textView4 = (TextView) findViewById(C0126R.C0129id.button_negative);
            textView4.setVisibility(0);
            textView4.setText(stringExtra3);
            textView4.setOnClickListener(new auac(this));
        }
        this.f109003d = getIntent().getStringExtra("proxy_node_id");
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f109004e.mo24722a(this, auaa.f91306a);
        if (this.f109003d != null) {
            auaa.m76633a(this, this.f109003d, auaa.m76632a(this.f109001b, this.f109002c, getIntent().getBooleanExtra("error_is_retryable", false)), getIntent().getBooleanExtra("shouldCompressRpcs", false));
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        auaa.m76633a(this, this.f109003d, auaa.m76634b(), getIntent().getBooleanExtra("shouldCompressRpcs", false));
        this.f109004e.mo24721a((axou) this);
        super.onStop();
    }
}

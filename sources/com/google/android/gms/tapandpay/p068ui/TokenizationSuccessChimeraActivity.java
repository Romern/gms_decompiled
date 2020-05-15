package com.google.android.gms.tapandpay.p068ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.google.android.gms.tapandpay.ui.TokenizationSuccessChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenizationSuccessChimeraActivity extends atex {

    /* renamed from: b */
    public ImageView f108963b;

    /* renamed from: c */
    public ScrollView f108964c;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.tp_tokenization_success_activity);
        int i = Build.VERSION.SDK_INT;
        setRequestedOrientation(1);
        TextView textView = (TextView) findViewById(C0126R.C0129id.tp_tokenization_success_header);
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.tp_tokenization_success_body);
        MaterialButton materialButton = (MaterialButton) findViewById(C0126R.C0129id.tp_tokenization_success_continue_button);
        MaterialButton materialButton2 = (MaterialButton) findViewById(C0126R.C0129id.tp_tokenization_success_cancel_button);
        materialButton.setOnClickListener(new atww(this));
        this.f108963b = (ImageView) findViewById(C0126R.C0129id.BottomShadow);
        ScrollView scrollView = (ScrollView) findViewById(C0126R.C0129id.InfoContainer);
        this.f108964c = scrollView;
        scrollView.addOnLayoutChangeListener(new atwx(this));
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.tp_tokenization_success_card_image);
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("accountInfo");
        CardInfo cardInfo = (CardInfo) getIntent().getParcelableExtra("paymentCardInfo");
        if (!(accountInfo == null || cardInfo == null || cardInfo.f108347h == null)) {
            asju.m74252a(new asjs(this, accountInfo.f108326b), cardInfo, imageView);
        }
        int i2 = 0;
        if (getIntent().getBooleanExtra("is_wear_tokenization_extra", false)) {
            textView.setText((int) C0126R.string.tp_tokenization_success_on_wear_header);
            if (cardInfo != null) {
                str = getString(C0126R.string.tp_tokenization_success_on_wear_body, new Object[]{cardInfo.f108343d});
            } else {
                str = null;
            }
            textView2.setText(str);
            if (cardInfo == null) {
                i2 = 8;
            }
            textView2.setVisibility(i2);
            findViewById(C0126R.C0129id.tp_tokenization_contactless_logo).setVisibility(8);
            findViewById(C0126R.C0129id.tp_tokenization_success_cancel_button).setVisibility(8);
            return;
        }
        Intent intent = new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY");
        intent.setFlags(268435456);
        if (atxn.m76506a(this, intent)) {
            materialButton.setText((int) C0126R.string.tp_tokenization_success_view_in_app_button);
            materialButton.setOnClickListener(new atwy(this, intent));
            materialButton2.setOnClickListener(new atwz(this));
            materialButton2.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Tokenization Success");
    }
}

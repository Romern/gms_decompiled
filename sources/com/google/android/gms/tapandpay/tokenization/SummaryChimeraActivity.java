package com.google.android.gms.tapandpay.tokenization;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SummaryChimeraActivity extends atex {

    /* renamed from: i */
    private static final srn f108888i = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public boolean f108889b;

    /* renamed from: c */
    Button f108890c;

    /* renamed from: d */
    Button f108891d;

    /* renamed from: e */
    TextView f108892e;

    /* renamed from: f */
    TextView f108893f;

    /* renamed from: g */
    TextView f108894g;

    /* renamed from: h */
    TextView f108895h;

    /* renamed from: j */
    private int f108896j;

    /* renamed from: k */
    private int f108897k;

    /* renamed from: l */
    private btof f108898l = btof.NONE;

    /* renamed from: m */
    private int f108899m = 0;

    /* renamed from: n */
    private boolean f108900n;

    /* renamed from: o */
    private boolean f108901o;

    /* renamed from: p */
    private boolean f108902p;

    /* renamed from: q */
    private btnf f108903q;

    /* renamed from: r */
    private boolean f108904r;

    /* renamed from: a */
    private final void m93273a(Button button) {
        button.setText((int) C0126R.string.common_got_it);
        button.setOnClickListener(new atre(this, null));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atyg.a(android.widget.TextView, java.lang.String, boolean, android.view.View$OnClickListener[]):void
     arg types: [android.widget.TextView, java.lang.String, int, android.view.View$OnClickListener[]]
     candidates:
      atyg.a(android.content.Context, android.widget.TextView, java.lang.String, android.content.Intent[]):void
      atyg.a(java.lang.String, java.lang.String, android.widget.TextView, android.content.Intent):void
      atyg.a(android.widget.TextView, java.lang.String, boolean, android.view.View$OnClickListener[]):void */
    /* renamed from: e */
    private final void m93274e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f108897k;
        int i6 = C0126R.string.tp_summary_red_path_headline_nonfc;
        int i7 = 2;
        if (i5 == 2) {
            TextView textView = this.f108895h;
            if (this.f108900n) {
                i6 = C0126R.string.tp_summary_red_path_headline;
            }
            textView.setText(i6);
            TextView textView2 = this.f108892e;
            if (this.f108896j == 3) {
                i = this.f108898l != btof.AMEX_TSP ? this.f108898l != btof.PAYPAL_TSP ? C0126R.string.tp_summary_red_path_label_existing_instrument : C0126R.string.tp_summary_red_path_paypal_label_existing_instrument : C0126R.string.tp_summary_red_path_amex_label_existing_instrument;
            } else {
                i = this.f108898l != btof.AMEX_TSP ? this.f108898l != btof.PAYPAL_TSP ? C0126R.string.tp_summary_red_path_label : C0126R.string.tp_summary_red_path_paypal_label : C0126R.string.tp_summary_red_path_amex_label;
            }
            textView2.setText(i);
            m93273a(this.f108890c);
            this.f108891d.setVisibility(8);
        } else if (i5 == 3) {
            Intent intent = new Intent();
            if (!this.f108904r) {
                i7 = 1;
            }
            Intent putExtra = intent.putExtra("next_step", i7);
            if (this.f108901o || ((!m93276h() && !m93277i()) || !cgwn.f187872a.mo6606a().mo84636q())) {
                if (this.f108900n) {
                    this.f108895h.setText((int) C0126R.string.tp_summary_cannot_be_tokenized_card_ineligible_headline);
                } else {
                    this.f108895h.setText((int) C0126R.string.tp_summary_red_path_headline_nonfc);
                }
                TextView textView3 = this.f108892e;
                if (!this.f108904r) {
                    i2 = C0126R.string.tp_summary_ineligible_label;
                } else {
                    i2 = C0126R.string.tp_summary_ineligible_label_paypal;
                }
                atyg.m76551a(textView3, getString(i2), false, new atre(this, putExtra));
            } else {
                this.f108895h.setText((int) C0126R.string.tp_summary_cannot_be_tokenized_jp_non_se_phone_headline);
                this.f108892e.setText((int) C0126R.string.tp_summary_cannot_be_tokenized_jp_non_se_phone_label);
            }
            m93273a(this.f108890c);
            this.f108891d.setVisibility(8);
        } else if (i5 == 4) {
            this.f108892e.setText(!this.f108900n ? this.f108896j != 3 ? C0126R.string.tp_summary_nonfc_attestation_label : C0126R.string.tp_summary_nonfc_attestation_label_existing_instrument : C0126R.string.tp_summary_attestation_label);
            if (this.f108900n) {
                TextView textView4 = this.f108895h;
                if (this.f108896j == 2) {
                    i3 = C0126R.string.tp_summary_attestation_headline;
                } else {
                    i3 = C0126R.string.tp_summary_cannot_be_tokenized_headline;
                }
                textView4.setText(i3);
            } else {
                this.f108895h.setText((int) C0126R.string.tp_summary_nonfc_attestation_headline);
            }
            this.f108891d.setVisibility(8);
            m93273a(this.f108890c);
        } else if (i5 == 7) {
            String string = m93276h() ? getResources().getString(C0126R.string.tp_transaction_quicpay) : m93277i() ? getResources().getString(C0126R.string.tp_transaction_id) : "";
            if (cgvo.m147167b() && this.f108902p && !TextUtils.isEmpty(string)) {
                this.f108895h.setText((int) C0126R.string.tp_summary_cannot_be_tokenized_tsp_card_limit_reached_headline);
                this.f108892e.setText(getResources().getString(C0126R.string.tp_summary_cannot_be_tokenized_tsp_card_limit_reached_label, string, string));
            } else if (this.f108903q != null) {
                this.f108892e.setAutoLinkMask(15);
                this.f108892e.setText(this.f108903q.f149604c);
                this.f108895h.setText(this.f108903q.f149603b);
            } else {
                TextView textView5 = this.f108892e;
                if (!this.f108900n) {
                    i4 = this.f108896j != 3 ? C0126R.string.tp_summary_nonfc_unknown_label : C0126R.string.tp_summary_nonfc_unknown_label_existing_instrument;
                } else {
                    i4 = C0126R.string.tp_summary_unknown_label;
                }
                textView5.setText(i4);
            }
            this.f108891d.setVisibility(8);
            m93273a(this.f108890c);
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Illegal tokenization status: ");
            sb.append(i5);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: g */
    private final void m93275g() {
        this.f108894g.setVisibility(8);
        this.f108893f.setVisibility(8);
        this.f108895h.setTextAlignment(4);
        this.f108892e.setTextAlignment(4);
        findViewById(C0126R.C0129id.success_icon).setVisibility(8);
        findViewById(C0126R.C0129id.failure_icon).setVisibility(8);
        findViewById(C0126R.C0129id.separator).setVisibility(8);
        aux a = aux.m2149a(getResources(), C0126R.C0127drawable.tp_exclamation_mark, getTheme());
        a.mutate();
        a.setTint(getResources().getColor(C0126R.color.google_grey500));
        ((ImageView) findViewById(C0126R.C0129id.image)).setImageDrawable(a);
    }

    /* renamed from: h */
    private final boolean m93276h() {
        return this.f108898l == btof.JCB_TSP || this.f108899m == 13;
    }

    /* renamed from: i */
    private final boolean m93277i() {
        return this.f108898l == btof.GEMALTO_TSP || this.f108899m == 15;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108896j = getIntent().getIntExtra("save_status", 0);
        this.f108902p = getIntent().getBooleanExtra("felica_card_limit_reached", false);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("api_error");
        if (byteArrayExtra != null) {
            try {
                this.f108903q = (btnf) GeneratedMessageLite.m124016a(btnf.f149600f, byteArrayExtra, bxus.m123744c());
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) f108888i.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SummaryChimeraActivity", "onCreate", (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to parse api error");
            }
        }
        this.f108897k = getIntent().getIntExtra("tokenization_status", 1);
        this.f108904r = getIntent().getBooleanExtra("pay_pal_available", false);
        btof a = btof.m116979a(getIntent().getIntExtra("tsp", 0));
        if (a == null) {
            a = btof.NONE;
        }
        this.f108898l = a;
        this.f108899m = getIntent().getIntExtra("tsp_info_from_platform", 0);
        this.f108889b = getIntent().getBooleanExtra("unsupported_card_compatibility", false);
        setTheme(2132018962);
        setContentView((int) C0126R.C0128layout.tp_activity_summary);
        this.f108894g = (TextView) findViewById(C0126R.C0129id.success_header);
        this.f108895h = (TextView) findViewById(C0126R.C0129id.failure_header);
        this.f108893f = (TextView) findViewById(C0126R.C0129id.success_text);
        this.f108892e = (TextView) findViewById(C0126R.C0129id.failure_text);
        this.f108890c = (Button) findViewById(C0126R.C0129id.primary_button);
        this.f108891d = (Button) findViewById(C0126R.C0129id.secondary_button);
        this.f108900n = getIntent().getBooleanExtra("nfc_device", true);
        this.f108901o = getIntent().getBooleanExtra("nfcf_device", true);
        int i = this.f108896j;
        if (i == -1) {
            this.f108895h.setText((int) C0126R.string.tp_summary_cannot_be_added_headline);
            m93275g();
            this.f108892e.setText((int) C0126R.string.tp_summary_cannot_be_added_label);
            this.f108891d.setVisibility(8);
            m93273a(this.f108890c);
            return;
        }
        int i2 = C0126R.string.tp_summary_cannot_be_tokenized_headline;
        if (i == 2) {
            this.f108893f.setText((int) C0126R.string.tp_summary_save_success_label);
            this.f108894g.setText((int) C0126R.string.tp_summary_save_success_headline);
            if (this.f108900n) {
                this.f108895h.setText((int) C0126R.string.tp_summary_cannot_be_tokenized_headline);
                m93274e();
                return;
            }
            this.f108895h.setText((int) C0126R.string.tp_nonfc_warning_headline);
            atyg.m76550a(this, this.f108892e, getString(C0126R.string.tp_nonfc_warning_label), new Intent("android.intent.action.VIEW").setData(Uri.parse("https://support.google.com/googlepay/?p=nfc_hce")));
            this.f108891d.setVisibility(8);
            m93273a(this.f108890c);
            return;
        }
        TextView textView = this.f108895h;
        if (!this.f108900n) {
            i2 = C0126R.string.tp_summary_red_path_headline_nonfc;
        }
        textView.setText(i2);
        m93275g();
        m93274e();
    }
}

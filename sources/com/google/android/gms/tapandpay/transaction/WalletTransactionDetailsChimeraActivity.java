package com.google.android.gms.tapandpay.transaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WalletTransactionDetailsChimeraActivity extends atex implements atvx, atvl, ateu {

    /* renamed from: b */
    public static final srn f108938b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    public String f108939c;

    /* renamed from: d */
    public String f108940d;

    /* renamed from: e */
    public CardInfo f108941e;

    /* renamed from: f */
    public String f108942f;

    /* renamed from: g */
    public String f108943g;

    /* renamed from: h */
    public bmxv f108944h = bmvz.f131120a;

    /* renamed from: i */
    private boolean f108945i = false;

    /* renamed from: j */
    private atvu f108946j;

    /* renamed from: k */
    private atwa f108947k;

    /* renamed from: a */
    public static Intent m93298a(btrg btrg, askf askf, CardInfo cardInfo, blci blci, String str, Transaction transaction) {
        Intent putExtra = new Intent().setClassName(askf.f89126d, "com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsActivity").setFlags(268468224).putExtra("account_id", askf.f89123a).putExtra("account_name", askf.f89124b).putExtra("extra_account_info", askf.mo49209a()).putExtra("payment_card", cardInfo).putExtra("coalesced_notification", blci.mo73642k()).putExtra("transaction", btrg.mo73642k());
        if (!TextUtils.isEmpty(str)) {
            putExtra.putExtra("device_transaction_id", str);
        }
        if (transaction != null) {
            sef.m35071a(transaction, putExtra, "core_transaction");
        }
        return putExtra;
    }

    /* renamed from: b */
    public final String mo50261b() {
        String str = this.f108946j.f91026b.f108942f;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public final void mo50262c() {
        atvu atvu = this.f108946j;
        if (!TextUtils.isEmpty(atvu.f91026b.f108943g)) {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(String.format("tel:%s", atvu.f91026b.f108943g)));
            if (ssk.m36237a(atvu.f91026b.getApplicationContext(), atvu.f91026b.f108943g)) {
                atvu.f91026b.startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo59494e() {
        Toast.makeText(this, (int) C0126R.string.tp_transaction_unavailable, 0).show();
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15862e();
        }
        bnsl bnsl = (bnsl) f108938b.mo68390d();
        bnsl.mo68432a("com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity", "onCreate", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Creating WalletTransactionDetailsActivity.");
        this.f108946j = new atvu(this, false);
        Intent intent = getIntent();
        if (intent.hasExtra("transaction")) {
            atvu atvu = this.f108946j;
            byte[] byteArrayExtra = atvu.f91026b.getIntent().getByteArrayExtra("transaction");
            if (byteArrayExtra != null) {
                try {
                    atvu.f91027c = new atvv((btrg) bxvk.m124016a(btrg.f150089i, byteArrayExtra, bxus.m123744c()));
                } catch (bxwf e) {
                }
            }
            mo59494e();
            return;
        } else if (!intent.hasExtra("gpfe_transaction") || intent.getByteArrayExtra("gpfe_transaction") == null) {
            mo59494e();
            return;
        } else {
            try {
                this.f108947k = new atwa((bzva) bxvk.m124016a(bzva.f171489j, intent.getByteArrayExtra("gpfe_transaction"), bxus.m123744c()));
            } catch (bxwf e2) {
                mo59494e();
                return;
            }
        }
        String stringExtra = intent.getStringExtra("account_name");
        this.f108940d = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            mo59494e();
            return;
        }
        String stringExtra2 = intent.getStringExtra("account_id");
        this.f108939c = stringExtra2;
        if (TextUtils.isEmpty(stringExtra2)) {
            mo59494e();
            return;
        }
        if (bundle != null) {
            this.f108945i = bundle.getBoolean("sent_read_state", false);
        }
        this.f108941e = (CardInfo) intent.getParcelableExtra("payment_card");
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("coalesced_notification");
        if (byteArrayExtra2 != null && !this.f108945i) {
            startService(atbe.m75364a(new askf(this.f108939c, this.f108940d, askc.m74272b(), this), byteArrayExtra2, 3, this.f108941e));
            this.f108945i = true;
        }
        CardInfo cardInfo = this.f108941e;
        if (cardInfo != null) {
            IssuerInfo issuerInfo = cardInfo.f108350k;
            if (issuerInfo != null) {
                this.f108942f = issuerInfo.f108388a;
                this.f108943g = issuerInfo.f108389b;
            }
            if (this.f108946j.mo50242a()) {
                atvu atvu2 = this.f108946j;
                if (bundle != null) {
                    int i = bundle.getInt("transaction feedback status", -2);
                    if (i != -2) {
                        atvu2.f91027c.mo50248a(btra.m117057b(i));
                    }
                    int i2 = bundle.getInt("feedback state", -2);
                    if (i2 != -2) {
                        atvu2.f91027c.mo50251b(btqz.m117055b(i2));
                    }
                }
                if (!atvu2.f91028d && ((cgwn.f187872a.mo6606a().mo84641v() && atvu2.mo50244b()) || atvu2.mo50243a("com.google.commerce.tapandpay.android.transaction.DISPLAY_TRANSACTION_RECEIPT", "com.google.commerce.tapandpay.android.transaction.DISPLAY_DECLINED_TRANSACTION_RECEIPT") || ((cgwn.f187872a.mo6606a().mo84639t() && atvu2.mo50243a("com.google.android.apps.nbu.paisa.user.cards.transaction.DISPLAY_TRANSACTION_RECEIPT", "com.google.android.apps.nbu.paisa.user.cards.transaction.DISPLAY_DECLINED_TRANSACTION_RECEIPT")) || atvu2.mo50244b()))) {
                    bnsl bnsl2 = (bnsl) f108938b.mo68390d();
                    bnsl2.mo68432a("com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity", "onCreate", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Handed off transaction to first party app, finishing.");
                    finish();
                    return;
                }
                atvu2.f91026b.setContentView((int) C0126R.C0128layout.tp_activity_transaction_legacy_details);
                atvu2.f91026b.findViewById(C0126R.C0129id.CloseButton).setOnClickListener(new atvn(atvu2));
            }
            setTheme(C0126R.style.TpActivityTheme);
            setTitle(getString(C0126R.string.tp_details_activity_title));
            if (!this.f108946j.mo50242a()) {
                setContentView((int) C0126R.C0128layout.tp_activity_transaction_details);
                m93301g();
                return;
            }
            return;
        }
        mo59494e();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (this.f108946j.mo50242a()) {
            this.f108946j.mo50245c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        atvu atvu = this.f108946j;
        atvv atvv = atvu.f91027c;
        if (atvv != null) {
            bundle.putInt("transaction feedback status", btra.m117056a(atvv.mo50258i()));
            bundle.putInt("feedback state", btqz.m117054a(atvu.f91027c.mo50259j()));
        }
        bundle.putBoolean("sent_read_state", this.f108945i);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Transaction Details");
    }

    /* renamed from: g */
    private final void m93301g() {
        bztj bztj;
        String str;
        int i;
        String str2;
        boolean z;
        int i2;
        bzuz bzuz;
        char c;
        bzvc bzvc;
        String str3;
        String str4;
        int i3;
        bzuu bzuu;
        int i4;
        Uri uri;
        bzuu bzuu2;
        bzuu bzuu3;
        findViewById(C0126R.C0129id.CloseButton).setOnClickListener(new atwc(this));
        NetworkImageView networkImageView = (NetworkImageView) findViewById(C0126R.C0129id.HeaderMerchantLogo);
        bzvb bzvb = this.f108947k.f91034a.f171496f;
        if (bzvb == null) {
            bzvb = bzvb.f171500f;
        }
        if (bzvb.f171502a == 6) {
            bztj = (bztj) bzvb.f171503b;
        } else {
            bztj = bztj.f171335b;
        }
        String str5 = bztj.f171337a;
        m93300a(networkImageView, str5);
        networkImageView.setImageUrl(null, atyg.m76548a());
        networkImageView.setImageDrawable(null);
        if (!TextUtils.isEmpty(str5)) {
            networkImageView.setImageUrl(m93299a((int) getResources().getDimension(C0126R.dimen.transaction_details_merchant_logo_size), (int) getResources().getDimension(C0126R.dimen.transaction_details_merchant_logo_size), str5), atyg.m76548a());
        }
        bzvb bzvb2 = this.f108947k.f91034a.f171496f;
        if (bzvb2 == null) {
            bzvb2 = bzvb.f171500f;
        }
        String str6 = bzvb2.f171506e;
        TextView textView = (TextView) findViewById(C0126R.C0129id.Title);
        textView.setText(str6);
        m93300a(textView, str6);
        atwa atwa = this.f108947k;
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.StatusNotice);
        TextView textView3 = (TextView) findViewById(C0126R.C0129id.Amount);
        bzvb bzvb3 = atwa.f91034a.f171496f;
        if (bzvb3 == null) {
            bzvb3 = bzvb.f171500f;
        }
        if (bzvb3.f171505d != null) {
            bzvb bzvb4 = atwa.f91034a.f171496f;
            if (bzvb4 == null) {
                bzvb4 = bzvb.f171500f;
            }
            bztr bztr = bzvb4.f171505d;
            if (bztr == null) {
                bztr = bztr.f171363c;
            }
            str = beps.m95416a(Math.abs(bztr.f171365a), bztr.f171366b);
        } else {
            str = null;
        }
        textView3.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
        textView3.setText(str);
        int i5 = atwa.mo50271i();
        int i6 = C0126R.color.google_grey900;
        char c2 = 3;
        int i7 = C0126R.color.google_grey500;
        if (i5 == 3) {
            i = C0126R.string.status_canceled;
            i6 = C0126R.color.google_grey500;
        } else if (i5 == 5) {
            i = C0126R.string.tp_status_declined;
            i6 = C0126R.color.google_grey500;
        } else if (i5 != 7) {
            i = 0;
        } else {
            i = C0126R.string.tp_status_refunded;
            i7 = C0126R.color.google_green500;
        }
        textView3.setTextColor(C1133kh.m17843b(textView3.getContext(), i6));
        textView2.setTextColor(C1133kh.m17843b(textView2.getContext(), i7));
        if (i != 0) {
            textView2.setText(i);
        }
        textView2.setVisibility(i != 0 ? 0 : 8);
        bzvb bzvb5 = this.f108947k.f91034a.f171496f;
        if (bzvb5 == null) {
            bzvb5 = bzvb.f171500f;
        }
        bxyk bxyk = bzvb5.f171504c;
        if (bxyk == null) {
            bxyk = bxyk.f165095c;
        }
        String formatDateTime = DateUtils.formatDateTime(this, bxzt.m124578a(bxyk), 65556);
        TextView textView4 = (TextView) findViewById(C0126R.C0129id.Date);
        textView4.setText(formatDateTime);
        m93300a(textView4, formatDateTime);
        m93300a(findViewById(C0126R.C0129id.DateHeader), formatDateTime);
        TextView textView5 = (TextView) findViewById(C0126R.C0129id.Time);
        TextView textView6 = (TextView) findViewById(C0126R.C0129id.TimeHeader);
        atwa atwa2 = this.f108947k;
        String str7 = "";
        if (!atwa2.mo50263a()) {
            bzvb bzvb6 = atwa2.f91034a.f171496f;
            if (bzvb6 == null) {
                bzvb6 = bzvb.f171500f;
            }
            bxyk bxyk2 = bzvb6.f171504c;
            if (bxyk2 == null) {
                bxyk2 = bxyk.f165095c;
            }
            str2 = DateUtils.formatDateTime(this, bxzt.m124578a(bxyk2), 1);
        } else {
            str2 = str7;
        }
        textView5.setText(str2);
        m93300a(textView5, str2);
        m93300a(textView6, str2);
        if (this.f108947k.mo50263a()) {
            textView5.setVisibility(8);
            textView6.setVisibility(8);
        }
        if (textView4.getVisibility() == 8 && textView5.getVisibility() == 8) {
            z = false;
        } else {
            z = true;
        }
        View findViewById = findViewById(C0126R.C0129id.DateTimeLayout);
        if (!z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        ((TextView) findViewById(C0126R.C0129id.PaymentMethodTitle)).setText(this.f108941e.f108343d);
        NetworkImageView networkImageView2 = (NetworkImageView) findViewById(C0126R.C0129id.TokenizedCardArt);
        Uri uri2 = this.f108941e.f108347h;
        if (uri2 == null) {
            networkImageView2.setVisibility(8);
        } else {
            networkImageView2.setImageUrl(null, atyg.m76548a());
            networkImageView2.setImageDrawable(null);
            networkImageView2.setImageUrl(m93299a((int) getResources().getDimension(C0126R.dimen.card_art_container_width), (int) getResources().getDimension(C0126R.dimen.card_art_container_height), uri2.toString()), atyg.m76548a());
        }
        NetworkImageView networkImageView3 = (NetworkImageView) findViewById(C0126R.C0129id.MapImage);
        networkImageView3.setVisibility(8);
        if (!this.f108947k.mo50266d()) {
            bzva bzva = this.f108947k.f91034a;
            if (bzva.f171491a == 7) {
                bzuu3 = (bzuu) bzva.f171492b;
            } else {
                bzuu3 = bzuu.f171466d;
            }
            String str8 = bzuu3.f171469b;
            if (!TextUtils.isEmpty(str8)) {
                String e = this.f108947k.mo50267e();
                networkImageView3.setContentDescription(TextUtils.isEmpty(e) ? getResources().getString(C0126R.string.tp_map_button_name_no_merchant) : getResources().getString(C0126R.string.tp_map_button_name, e));
                networkImageView3.setImageUrl(null, atyg.m76548a());
                networkImageView3.setImageDrawable(null);
                networkImageView3.setImageUrl(str8, atyg.m76548a());
                networkImageView3.setVisibility(0);
                Uri b = this.f108947k.mo50264b();
                if (b != null) {
                    networkImageView3.setOnClickListener(new atwd(this, b));
                }
            }
        }
        View findViewById2 = findViewById(C0126R.C0129id.InferredDetailsLayout);
        View findViewById3 = findViewById(C0126R.C0129id.FeedbackAcknowledgementLayout);
        findViewById2.setVisibility(8);
        findViewById3.setVisibility(8);
        if (this.f108947k.mo50265c()) {
            if (this.f108947k.mo50266d()) {
                findViewById3.setVisibility(0);
            } else {
                findViewById2.setVisibility(0);
                String e2 = this.f108947k.mo50267e();
                TextView textView7 = (TextView) findViewById(C0126R.C0129id.InferredMerchantName);
                textView7.setText(e2);
                m93300a(textView7, e2);
                boolean isEmpty = TextUtils.isEmpty(e2);
                findViewById(C0126R.C0129id.InferredMerchantNameLayout).setVisibility(!isEmpty ? 0 : 8);
                Uri b2 = this.f108947k.mo50264b();
                if (!isEmpty && b2 != null) {
                    findViewById(C0126R.C0129id.InferredMerchantNameLayout).setOnClickListener(new atwe(this, b2));
                }
                bzva bzva2 = this.f108947k.f91034a;
                if (bzva2.f171491a == 7) {
                    bzuu = (bzuu) bzva2.f171492b;
                } else {
                    bzuu = bzuu.f171466d;
                }
                bzuv bzuv = bzuu.f171468a;
                if (bzuv == null) {
                    bzuv = bzuv.f171471h;
                }
                bzth bzth = bzuv.f171474b;
                if (bzth == null) {
                    bzth = bzth.f171326b;
                }
                String str9 = bzth.f171328a;
                TextView textView8 = (TextView) findViewById(C0126R.C0129id.InferredAddress);
                textView8.setText(str9);
                m93300a(textView8, str9);
                boolean isEmpty2 = TextUtils.isEmpty(str9);
                View findViewById4 = findViewById(C0126R.C0129id.InferredAddressLayout);
                if (!isEmpty2) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                findViewById4.setVisibility(i4);
                Uri b3 = this.f108947k.mo50264b();
                if (!isEmpty2 && b3 != null) {
                    findViewById(C0126R.C0129id.InferredAddressLayout).setOnClickListener(new atwf(this, b3));
                }
                String f = this.f108947k.mo50268f();
                ((TextView) findViewById(C0126R.C0129id.InferredPhoneNumber)).setText(f);
                m93300a(findViewById(C0126R.C0129id.InferredPhoneNumberLayout), f);
                String f2 = this.f108947k.mo50268f();
                if (!TextUtils.isEmpty(f2)) {
                    uri = Uri.parse(String.format("tel:%s", f2));
                } else {
                    uri = null;
                }
                if (uri != null && ssk.m36237a(this, f)) {
                    findViewById(C0126R.C0129id.InferredPhoneNumberLayout).setOnClickListener(new atwg(this, uri));
                }
                String g = this.f108947k.mo50269g();
                atwa atwa3 = this.f108947k;
                bzva bzva3 = atwa3.f91034a;
                if (bzva3.f171491a == 7) {
                    bzuu2 = (bzuu) bzva3.f171492b;
                } else {
                    bzuu2 = bzuu.f171466d;
                }
                bzuv bzuv2 = bzuu2.f171468a;
                if (bzuv2 == null) {
                    bzuv2 = bzuv.f171471h;
                }
                String str10 = bzuv2.f171477e;
                if (TextUtils.isEmpty(str10)) {
                    str10 = atwa3.mo50269g();
                }
                ((TextView) findViewById(C0126R.C0129id.InferredUrl)).setText(str10);
                m93300a(findViewById(C0126R.C0129id.InferredUrlLayout), g);
                if (!TextUtils.isEmpty(g)) {
                    findViewById(C0126R.C0129id.InferredUrlLayout).setOnClickListener(new atwh(this, g));
                }
            }
        }
        View findViewById5 = findViewById(C0126R.C0129id.AppInfoCard);
        findViewById5.setVisibility(8);
        if (!this.f108947k.mo50266d()) {
            String str11 = this.f108947k.mo50270h().f171331a;
            String str12 = this.f108947k.mo50270h().f171334d;
            String str13 = this.f108947k.mo50270h().f171332b;
            if (!TextUtils.isEmpty(str11) && !TextUtils.isEmpty(str12)) {
                findViewById5.setVisibility(0);
                ((TextView) findViewById(C0126R.C0129id.AppName)).setText(str11);
                ((TextView) findViewById(C0126R.C0129id.AppDeveloperName)).setText(str13);
                m93300a(findViewById(C0126R.C0129id.AppDeveloperName), str13);
                NetworkImageView networkImageView4 = (NetworkImageView) findViewById(C0126R.C0129id.AppIcon);
                bztj bztj2 = this.f108947k.mo50270h().f171333c;
                if (bztj2 == null) {
                    bztj2 = bztj.f171335b;
                }
                String str14 = bztj2.f171337a;
                if (!TextUtils.isEmpty(str14)) {
                    networkImageView4.setImageUrl(null, atyg.m76548a());
                    networkImageView4.setImageDrawable(null);
                    networkImageView4.setImageUrl(m93299a((int) getResources().getDimension(C0126R.dimen.row_item_icon_size), (int) getResources().getDimension(C0126R.dimen.row_item_icon_size), str14), atyg.m76548a());
                }
                if (!atxl.m76501a(findViewById(C0126R.C0129id.AppInfoLayout), str12)) {
                    i3 = C0126R.string.common_install;
                } else {
                    i3 = C0126R.string.common_open;
                }
                ((TextView) findViewById(C0126R.C0129id.OpenAppLink)).setText(i3);
            }
        }
        View findViewById6 = findViewById(C0126R.C0129id.FeedbackButtonRow);
        findViewById6.setVisibility(8);
        if (this.f108947k.mo50265c()) {
            findViewById6.setVisibility(0);
            TextView textView9 = (TextView) findViewById(C0126R.C0129id.FeedbackButton);
            if (!this.f108947k.mo50266d()) {
                textView9.setText((int) C0126R.string.tp_wrong_place_label);
                textView9.setOnClickListener(new atwi(this));
            } else {
                textView9.setText((int) C0126R.string.tp_undo_feedback);
                textView9.setOnClickListener(new atwj(this));
            }
        }
        TextView textView10 = (TextView) findViewById(C0126R.C0129id.PaidWithExplanation);
        textView10.setVisibility(8);
        int i8 = this.f108947k.mo50271i();
        boolean a = atyj.m76564a(this.f108941e);
        if (this.f108947k.mo50271i() != 5) {
            textView10.setVisibility(0);
            bzva bzva4 = this.f108947k.f91034a;
            if (bzva4.f171493c == 15) {
                bzuz = (bzuz) bzva4.f171494d;
            } else {
                bzuz = bzuz.f171486b;
            }
            int i9 = bzuz.f171488a;
            if (i9 != 0) {
                c = i9 != 1 ? i9 != 2 ? i9 != 3 ? (char) 0 : 5 : 4 : 3;
            } else {
                c = 2;
            }
            if (c == 0 || c != 5) {
                atwa atwa4 = this.f108947k;
                bzva bzva5 = atwa4.f91034a;
                switch (bzva5.f171499i) {
                    case 0:
                        c2 = 2;
                        break;
                    case 1:
                        break;
                    case 2:
                        c2 = 4;
                        break;
                    case 3:
                        c2 = 5;
                        break;
                    case 4:
                        c2 = 6;
                        break;
                    case 5:
                        c2 = 7;
                        break;
                    case 6:
                        c2 = 8;
                        break;
                    default:
                        c2 = 0;
                        break;
                }
                if (c2 == 0 || c2 != 6) {
                    if (bzva5.f171497g.size() == 1) {
                        bzvc = (bzvc) atwa4.f91034a.f171497g.get(0);
                    } else {
                        bzvc = bzvc.f171507c;
                    }
                    String str15 = bzvc.f171510b;
                    switch (this.f108941e.f108344e) {
                        case 1:
                            str7 = getString(C0126R.string.tp_transaction_amex);
                            break;
                        case 2:
                            str7 = getString(C0126R.string.tp_transaction_discover);
                            break;
                        case 3:
                            str7 = getString(C0126R.string.tp_transaction_mastercard);
                            break;
                        case 4:
                            str7 = getString(C0126R.string.tp_transaction_visa);
                            break;
                        case 5:
                            str7 = getString(C0126R.string.tp_transaction_interac);
                            break;
                        case 6:
                            str7 = getString(C0126R.string.tp_transaction_eftpos);
                            break;
                        case 8:
                            str7 = getString(C0126R.string.tp_transaction_maestro);
                            break;
                        case 9:
                            str7 = getString(C0126R.string.tp_transaction_id);
                            break;
                        case 10:
                            str7 = getString(C0126R.string.tp_transaction_quicpay);
                            break;
                        case 11:
                            str7 = getString(C0126R.string.tp_transaction_jcb);
                            break;
                        case 12:
                            str7 = getString(C0126R.string.tp_transaction_elo);
                            break;
                    }
                    if (!TextUtils.isEmpty(str15)) {
                        if (i8 != 7) {
                            str4 = !a ? getString(C0126R.string.tp_account_number_explanation) : getString(C0126R.string.tp_account_number_explanation_paypal);
                        } else {
                            str4 = !a ? getString(C0126R.string.tp_account_number_refund_explanation) : getString(C0126R.string.tp_account_number_refund_explanation_paypal);
                        }
                        String join = TextUtils.join(" ", bqcg.m112564a(str15.toCharArray()));
                        textView10.setText(String.format(str4, str7, str15));
                        textView10.setContentDescription(String.format(str4, str7, join));
                    } else {
                        if (i8 != 7) {
                            str3 = !a ? getString(C0126R.string.tp_account_number_explanation_no_last_digits) : getString(C0126R.string.tp_account_number_explanation_no_last_digits_paypal);
                        } else {
                            str3 = !a ? getString(C0126R.string.tp_account_number_refund_explanation_no_last_digits) : getString(C0126R.string.tp_account_number_refund_explanation_no_last_digits_paypal);
                        }
                        textView10.setText(String.format(str3, str7));
                    }
                }
            }
            textView10.setText(!a ? getString(C0126R.string.tp_account_number_explanation_non_android_pay) : getString(C0126R.string.tp_account_number_explanation_non_android_pay_paypal));
        }
        if (TextUtils.isEmpty(this.f108942f) || TextUtils.isEmpty(this.f108943g) || !ssk.m36237a(this, this.f108943g)) {
            findViewById(C0126R.C0129id.TokenizedTxnQuestionsButton).setVisibility(8);
        } else {
            findViewById(C0126R.C0129id.TokenizedTxnQuestionsButton).setVisibility(0);
            TextView textView11 = (TextView) findViewById(C0126R.C0129id.TokenizedTxnQuestionsButton);
            textView11.setText(getString(C0126R.string.tp_call_issuer, new Object[]{this.f108942f}));
            textView11.setOnClickListener(new atwk(this));
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/androidpay/?p=transaction_details"));
        TextView textView12 = (TextView) findViewById(C0126R.C0129id.PendingTransactionsDisclaimer);
        if (this.f108947k.mo50271i() == 6) {
            textView12.setVisibility(0);
            atyg.m76550a(this, textView12, atyj.m76564a(this.f108941e) ? getString(C0126R.string.tp_pending_transactions_paypal_disclaimer) : getString(C0126R.string.tp_pending_transactions_disclaimer), intent);
            textView12.setLinkTextColor(C1133kh.m17843b(this, C0126R.color.tp_action_color));
        } else {
            textView12.setVisibility(8);
        }
        ((TextView) findViewById(C0126R.C0129id.LegalDisclaimer)).setText(this.f108947k.f91034a.f171491a == 8 ? C0126R.string.tp_transaction_legal_disclaimer_in_app : C0126R.string.tp_transaction_legal_disclaimer_nfc);
    }

    /* renamed from: a */
    private static String m93299a(int i, int i2, String str) {
        if (bmyx.m108640a('=').mo66925c((CharSequence) str).size() == 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
            sb.append(str);
            sb.append("=w");
            sb.append(i);
            sb.append("-h");
            sb.append(i2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
        sb2.append(str);
        sb2.append("-w");
        sb2.append(i);
        sb2.append("-h");
        sb2.append(i2);
        return sb2.toString();
    }

    /* renamed from: a */
    private static void m93300a(View view, String str) {
        view.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
    }

    /* renamed from: a */
    public final String mo50231a() {
        return this.f108946j.f91027c.mo50249b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo59492a(View view) {
        Intent intent = new Intent("com.google.commerce.tapandpay.android.cardlist.START_GOOGLE_PAY");
        if (atxn.m76506a(this, intent)) {
            startActivity(intent);
        }
        bnsl bnsl = (bnsl) f108938b.mo68390d();
        bnsl.mo68432a("com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity", "a", 343, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("User closing WalletTransactionDetailsActivity.");
        finish();
    }

    /* renamed from: a */
    public final void mo59493a(boolean z) {
        int i;
        bzuu bzuu;
        bzuu bzuu2;
        String str = this.f108947k.f91034a.f171495e;
        if (str != null) {
            bxvd da = btrj.f150104g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btrj btrj = (btrj) da.f164949b;
            str.getClass();
            btrj.f150107b = str;
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            btrj.f150111f = btri.m117066a(i);
            atff.m75765a(new askf(this.f108939c, this.f108940d, askc.m74272b(), this), "t/transaction/editgeomerchant", da.mo74062i(), btrk.f150112a, new atwl(), null);
            bzva bzva = this.f108947k.f91034a;
            bxvd bxvd = (bxvd) bzva.mo74142c(5);
            bxvd.mo73625a((bxvk) bzva);
            if (bzva.f171491a == 7) {
                bzuu = (bzuu) bzva.f171492b;
            } else {
                bzuu = bzuu.f171466d;
            }
            bxvd bxvd2 = (bxvd) bzuu.mo74142c(5);
            bxvd2.mo73625a((bxvk) bzuu);
            if (bzva.f171491a == 7) {
                bzuu2 = (bzuu) bzva.f171492b;
            } else {
                bzuu2 = bzuu.f171466d;
            }
            bzuv bzuv = bzuu2.f171468a;
            if (bzuv == null) {
                bzuv = bzuv.f171471h;
            }
            bxvd bxvd3 = (bxvd) bzuv.mo74142c(5);
            bxvd3.mo73625a((bxvk) bzuv);
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            ((bzuv) bxvd3.f164949b).f171479g = z;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bzuv bzuv2 = (bzuv) bxvd3.mo74062i();
            bzuu bzuu3 = bzuu.f171466d;
            bzuv2.getClass();
            ((bzuu) bxvd2.f164949b).f171468a = bzuv2;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bzva bzva2 = (bzva) bxvd.f164949b;
            bzuu bzuu4 = (bzuu) bxvd2.mo74062i();
            bzva bzva3 = bzva.f171489j;
            bzuu4.getClass();
            bzva2.f171492b = bzuu4;
            bzva2.f171491a = 7;
            this.f108947k = new atwa((bzva) bxvd.mo74062i());
            m93301g();
        }
    }

    /* renamed from: a */
    public final void mo50232a(boolean z, boolean z2) {
        btrc btrc;
        atvu atvu = this.f108946j;
        bxvd da = btrj.f150104g.mo74144da();
        String a = atvu.f91027c.mo50246a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((btrj) da.f164949b).f150106a = a;
        btrb btrb = ((btrg) atvu.f91027c.f91029a.f164949b).f150095e;
        if (btrb == null || (btrc = btrb.f150062e) == null) {
            btrc = btrc.f150068a;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btrj btrj = (btrj) da.f164949b;
        btrc.getClass();
        btrj.f150108c = btrc;
        btrj.f150109d = z;
        btrj.f150110e = z2;
        btrj.f150111f = btri.m117066a(2);
        atvu.mo50241a((btrj) da.mo74062i());
        atvu.f91027c.mo50248a(3);
        atvu.f91027c.mo50251b(5);
        atvu.mo50245c();
    }
}

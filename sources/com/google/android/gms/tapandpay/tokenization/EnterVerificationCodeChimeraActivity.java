package com.google.android.gms.tapandpay.tokenization;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EnterVerificationCodeChimeraActivity extends atex implements asin, rkl, auat {

    /* renamed from: A */
    private static final bnhe f108783A = bnhe.m109409a(1, Integer.valueOf((int) C0126R.string.tp_sms_resend), 2, Integer.valueOf((int) C0126R.string.tp_email_resend));

    /* renamed from: B */
    private static final bnhe f108784B = bnhe.m109410a(1, Integer.valueOf((int) C0126R.string.tp_sms_interstitial_title), 2, Integer.valueOf((int) C0126R.string.tp_email_interstitial_title), 7, Integer.valueOf((int) C0126R.string.tp_issuer_statement_interstitial_title));

    /* renamed from: C */
    private static final bnhe f108785C = bnhe.m109408a(4, Integer.valueOf((int) C0126R.string.tp_receive_call_sub_label));

    /* renamed from: D */
    private static final bnhe f108786D = bnhe.m109408a(4, Integer.valueOf((int) C0126R.string.tp_receive_call_sub_label_paypal));

    /* renamed from: E */
    private static final bnhe f108787E;

    /* renamed from: F */
    private static final bnhe f108788F;

    /* renamed from: b */
    public static final srn f108789b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    public static final bnhe f108790c = bnhe.m109409a(1, Integer.valueOf((int) C0126R.string.tp_sms_resending_label), 2, Integer.valueOf((int) C0126R.string.tp_email_resending_label));

    /* renamed from: d */
    public static final bnhe f108791d = bnhe.m109409a(1, Integer.valueOf((int) C0126R.string.tp_sms_resending_label_paypal), 2, Integer.valueOf((int) C0126R.string.tp_email_resending_label_paypal));

    /* renamed from: G */
    private BroadcastReceiver f108792G;

    /* renamed from: H */
    private TextView f108793H;

    /* renamed from: I */
    private Drawable f108794I;

    /* renamed from: J */
    private View f108795J;

    /* renamed from: K */
    private View f108796K;

    /* renamed from: L */
    private View f108797L;

    /* renamed from: M */
    private boolean f108798M = true;

    /* renamed from: e */
    atzj f108799e;

    /* renamed from: f */
    public atqe f108800f;

    /* renamed from: g */
    public EditText f108801g;

    /* renamed from: h */
    public TextView f108802h;

    /* renamed from: i */
    public AccountInfo f108803i;

    /* renamed from: j */
    public String f108804j;

    /* renamed from: k */
    public byte[] f108805k;

    /* renamed from: l */
    public CardInfo f108806l;

    /* renamed from: m */
    public String f108807m;

    /* renamed from: n */
    public btjx f108808n;

    /* renamed from: o */
    public boolean f108809o;

    /* renamed from: p */
    public Pattern f108810p;

    /* renamed from: q */
    public String[] f108811q;

    /* renamed from: r */
    atam f108812r;

    /* renamed from: s */
    public ars f108813s = new ars("EnterVerificationCodeA");

    /* renamed from: t */
    public atxz f108814t = new atxz();

    /* renamed from: u */
    public boolean f108815u;

    /* renamed from: v */
    atzf f108816v;

    /* renamed from: w */
    ayxa f108817w;

    /* renamed from: x */
    rjx f108818x;

    /* renamed from: y */
    rjx f108819y;

    /* renamed from: z */
    rjx f108820z;

    static {
        Integer valueOf = Integer.valueOf((int) C0126R.string.tp_sms_sub_label);
        Integer valueOf2 = Integer.valueOf((int) C0126R.string.tp_email_sub_label);
        Integer valueOf3 = Integer.valueOf((int) C0126R.string.tp_issuer_statement_sub_label);
        f108787E = bnhe.m109410a(1, valueOf, 2, valueOf2, 7, valueOf3);
        f108788F = bnhe.m109410a(1, Integer.valueOf((int) C0126R.string.tp_sms_sub_label_paypal), 2, Integer.valueOf((int) C0126R.string.tp_email_sub_label_paypal), 7, valueOf3);
    }

    /* renamed from: i */
    private final boolean m93215i() {
        btjx btjx = this.f108808n;
        if (btjx == null) {
            return false;
        }
        bnhe bnhe = f108784B;
        btnv a = btnv.m116964a(btjx.f149197d);
        if (a == null) {
            a = btnv.UNRECOGNIZED;
        }
        return bnhe.containsKey(Integer.valueOf(a.mo3214a()));
    }

    /* renamed from: a */
    public final void mo49193a() {
        mo59449e();
    }

    /* renamed from: b */
    public final void mo59447b(int i) {
        int i2;
        int i3;
        int i4;
        View view = this.f108797L;
        int i5 = 8;
        if (i == 4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        TextView textView = this.f108793H;
        if (i == 3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        if (i == 3) {
            Drawable mutate = this.f108801g.getBackground().getConstantState().newDrawable().mutate();
            mutate.setColorFilter(azxe.m86324a(this, C0126R.attr.colorError), PorterDuff.Mode.SRC_ATOP);
            this.f108801g.setBackground(mutate);
        } else {
            this.f108801g.setBackground(this.f108794I);
        }
        View view2 = this.f108795J;
        boolean z = true;
        if (i == 1) {
            i4 = 0;
        } else {
            i4 = i != 2 ? 8 : 0;
        }
        view2.setVisibility(i4);
        View view3 = this.f108795J;
        if (i != 2) {
            z = false;
        }
        view3.setEnabled(z);
        View view4 = this.f108796K;
        if (i == 5) {
            i5 = 0;
        }
        view4.setVisibility(i5);
    }

    /* renamed from: e */
    public final void mo59449e() {
        rjx rjx = this.f108818x;
        if (rjx != null) {
            rjx.mo24769w().mo9459a(this, 30, TimeUnit.SECONDS);
            return;
        }
        atzj atzj = this.f108799e;
        if (atzj != null) {
            atzj.mo50329a().mo9459a(this, 30, TimeUnit.SECONDS);
            return;
        }
        throw new IllegalStateException("No client available");
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: g */
    public final void mo59450g() {
        mo59447b(5);
        ars ars = this.f108813s;
        if (ars.f2096a.getAndIncrement() == 0) {
            ars.f2098c = SystemClock.uptimeMillis();
        }
        new adzt().postDelayed(new atpw(this), 500);
    }

    /* renamed from: h */
    public final void mo59451h() {
        try {
            this.f108814t.mo50311a(atuy.m76426a(this.f108806l.f108340a, this.f108803i, this.f108804j, this.f108805k, this.f108808n.mo73642k(), this.f108807m, this.f108800f));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f108789b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity", "h", 862, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error calling SelectActivationMethod");
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1003) {
            mo59446a(false);
        }
    }

    public final void onBackPressed() {
        if (findViewById(C0126R.C0129id.InterstitialLayout).getVisibility() == 0 || !m93215i()) {
            super.onBackPressed();
            return;
        }
        mo59446a(true);
        btnv a = btnv.m116964a(this.f108808n.f149197d);
        if (a == null) {
            a = btnv.UNRECOGNIZED;
        }
        if (a == btnv.ISSUER_STATEMENT) {
            findViewById(C0126R.C0129id.ChooseOtherMethodButton).setVisibility(0);
        }
    }

    public final void onCreate(Bundle bundle) {
        bnhe bnhe;
        bnhe bnhe2;
        String str;
        btln btln;
        int i;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.tp_activity_enter_verification_code);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = true;
        setRequestedOrientation(1);
        setTitle("");
        C1341rz aW = mo8628aW();
        aW.mo15858c(false);
        aW.mo15839a(0.0f);
        aW.mo15853b(true);
        aW.mo15859d();
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        this.f108803i = accountInfo;
        if (accountInfo == null || TextUtils.isEmpty(accountInfo.f108326b)) {
            setResult(0);
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra("extra_calling_package");
        this.f108804j = stringExtra;
        if (stringExtra != null) {
            atpi atpi = new atpi();
            alir a = aliq.m60909a();
            cazf.m127594a(a);
            atpi.f90631a = a;
            cazf.m127595a(atpi.f90631a, alir.class);
            ayxa a2 = new atpj(atpi.f90631a).f90632a.mo40366a();
            cazf.m127593a(a2, "Cannot return null from a non-@Nullable component method");
            this.f108817w = a2;
            if (getIntent().hasExtra("activation_receipt")) {
                this.f108805k = getIntent().getByteArrayExtra("activation_receipt");
            }
            this.f108806l = (CardInfo) getIntent().getParcelableExtra("card_info");
            this.f108807m = getIntent().getStringExtra("session_id");
            try {
                btjx btjx = (btjx) GeneratedMessageLite.m124016a(btjx.f149192h, getIntent().getByteArrayExtra("activation_method"), bxus.m123744c());
                this.f108808n = btjx;
                btnv a3 = btnv.m116964a(btjx.f149197d);
                if (a3 == null) {
                    a3 = btnv.UNRECOGNIZED;
                }
                if (!atvi.m76456a(a3)) {
                    int i3 = this.f108808n.f149197d;
                    setResult(12);
                    finish();
                }
                this.f108800f = new atqe(this);
                this.f108801g = (EditText) findViewById(C0126R.C0129id.VerificationCodeEditText);
                this.f108793H = (TextView) findViewById(C0126R.C0129id.IncorrectCodeText);
                this.f108794I = this.f108801g.getBackground();
                View findViewById = findViewById(C0126R.C0129id.VerificationCodeSubmitButton);
                this.f108795J = findViewById;
                findViewById.setOnClickListener(new atps(this));
                this.f108796K = findViewById(C0126R.C0129id.VerificationCodeCheckMark);
                this.f108802h = (TextView) findViewById(C0126R.C0129id.ResendButton);
                this.f108797L = findViewById(C0126R.C0129id.VerificationCodeProgressBar);
                try {
                    this.f108810p = Pattern.compile(cgya.f188015a.mo6606a().mo84717b());
                } catch (PatternSyntaxException e) {
                    bnsl bnsl = (bnsl) f108789b.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity", "onCreate", 350, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Error compiling OTP autofill regex flag.");
                    this.f108810p = Pattern.compile("");
                }
                this.f108811q = cgya.f188015a.mo6606a().mo84718c().split(",");
                if (bundle != null) {
                    this.f108809o = bundle.getBoolean("is_code_autofilled");
                }
                TextView textView = (TextView) findViewById(C0126R.C0129id.ChooseOtherMethodButton);
                textView.setOnClickListener(new atpx(this));
                btnv a4 = btnv.m116964a(this.f108808n.f149197d);
                if (a4 == null) {
                    a4 = btnv.UNRECOGNIZED;
                }
                View findViewById2 = findViewById(C0126R.C0129id.ResendCode);
                if (!f108790c.containsKey(Integer.valueOf(a4.mo3214a())) || !f108783A.containsKey(Integer.valueOf(a4.mo3214a()))) {
                    findViewById2.setVisibility(8);
                } else {
                    findViewById2.setVisibility(0);
                    this.f108802h.setOnClickListener(new atqb(this));
                    this.f108802h.setText(((Integer) f108783A.get(Integer.valueOf(a4.mo3214a()))).intValue());
                }
                if (f108784B.containsKey(Integer.valueOf(a4.mo3214a()))) {
                    ((TextView) findViewById(C0126R.C0129id.InterstitialTitle)).setText(getString(((Integer) f108784B.get(Integer.valueOf(a4.mo3214a()))).intValue(), new Object[]{this.f108808n.f149198e}));
                }
                if (!atyj.m76564a(this.f108806l)) {
                    bnhe = f108785C;
                } else {
                    bnhe = f108786D;
                }
                TextView textView2 = (TextView) findViewById(C0126R.C0129id.MiscText);
                if (bnhe.containsKey(Integer.valueOf(a4.mo3214a()))) {
                    textView2.setVisibility(0);
                    textView2.setText(getString(((Integer) bnhe.get(Integer.valueOf(a4.mo3214a()))).intValue(), new Object[]{this.f108808n.f149198e}));
                } else {
                    textView2.setVisibility(8);
                }
                TextView textView3 = (TextView) findViewById(C0126R.C0129id.InterstitialBody);
                View findViewById3 = findViewById(C0126R.C0129id.EnterCodeButton);
                if (!atyj.m76564a(this.f108806l)) {
                    bnhe2 = f108787E;
                } else {
                    bnhe2 = f108788F;
                }
                if (bnhe2.containsKey(Integer.valueOf(a4.mo3214a()))) {
                    textView3.setVisibility(0);
                    textView3.setText(getString(((Integer) bnhe2.get(Integer.valueOf(a4.mo3214a()))).intValue(), new Object[]{this.f108808n.f149198e}));
                    findViewById3.setVisibility(0);
                } else {
                    textView3.setVisibility(8);
                    findViewById3.setVisibility(8);
                }
                mo59447b(1);
                TextView textView4 = (TextView) findViewById(C0126R.C0129id.InterstitialIssuerLinkButton);
                IssuerInfo issuerInfo = this.f108806l.f108350k;
                if (issuerInfo == null || TextUtils.isEmpty(issuerInfo.f108388a)) {
                    str = getString(C0126R.string.tp_issuer_statement_issuer_link_default_text);
                } else {
                    str = this.f108806l.f108350k.f108388a;
                }
                textView4.setText(String.format(getString(C0126R.string.tp_issuer_statement_issuer_link), str));
                if (a4 == btnv.ISSUER_STATEMENT) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    btjx btjx2 = this.f108808n;
                    if (btjx2.f149194a == 7) {
                        btln = (btln) btjx2.f149195b;
                    } else {
                        btln = btln.f149395c;
                    }
                    intent.setData(Uri.parse(btln.f149398b));
                    textView4.setOnClickListener(new atpy(this, intent));
                    findViewById3.setVisibility(8);
                    if (getIntent().getBooleanExtra("is_redirect", false)) {
                        i = 0;
                    } else {
                        i = (bundle == null || !bundle.getBoolean("should_show_change_method_button")) ? 8 : 0;
                    }
                    textView.setVisibility(i);
                    textView4.setVisibility(0);
                    findViewById(C0126R.C0129id.InterstitialAlreadyHaveCode).setVisibility(0);
                    findViewById(C0126R.C0129id.MoreInfo).setVisibility(0);
                    atyg.m76549a(this, (TextView) findViewById(C0126R.C0129id.MoreInfo), getString(C0126R.string.tp_issuer_statement_enter_code_more_info), false, intent);
                } else {
                    textView4.setVisibility(8);
                    textView.setVisibility(0);
                    findViewById(C0126R.C0129id.InterstitialAlreadyHaveCode).setVisibility(8);
                    findViewById(C0126R.C0129id.MoreInfo).setVisibility(8);
                }
                this.f108801g.setOnClickListener(new atpz(this));
                this.f108801g.setOnEditorActionListener(new atqa(this));
                this.f108801g.addTextChangedListener(new atqd(this));
                if (getIntent().getBooleanExtra("is_autofill_consent_granted", false) && cgya.m147550b() && !TextUtils.isEmpty(this.f108810p.pattern())) {
                    btnv a5 = btnv.m116964a(this.f108808n.f149197d);
                    if (a5 == null) {
                        a5 = btnv.UNRECOGNIZED;
                    }
                    if (a5 == btnv.SMS && C1133kh.m17835a(this, "android.permission.RECEIVE_SMS") == 0) {
                        C16652 r1 = new aacn("tapandpay") {
                            /* class com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity.C16652 */

                            /* renamed from: a */
                            public final void mo6253a(Context context, Intent intent) {
                                if (!EnterVerificationCodeChimeraActivity.this.isFinishing()) {
                                    SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
                                    for (SmsMessage smsMessage : messagesFromIntent) {
                                        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = EnterVerificationCodeChimeraActivity.this;
                                        String messageBody = smsMessage.getMessageBody();
                                        Matcher matcher = enterVerificationCodeChimeraActivity.f108810p.matcher(messageBody);
                                        if (matcher.find()) {
                                            String group = matcher.group();
                                            String[] strArr = enterVerificationCodeChimeraActivity.f108811q;
                                            int length = strArr.length;
                                            int i = 0;
                                            while (i < length) {
                                                String str = strArr[i];
                                                if (TextUtils.isEmpty(str) || !messageBody.contains(str)) {
                                                    i++;
                                                } else if (TextUtils.isEmpty(enterVerificationCodeChimeraActivity.f108801g.getText().toString())) {
                                                    enterVerificationCodeChimeraActivity.f108801g.setText(group);
                                                    enterVerificationCodeChimeraActivity.f108809o = true;
                                                    enterVerificationCodeChimeraActivity.f108812r.mo49757b(enterVerificationCodeChimeraActivity.f108806l, enterVerificationCodeChimeraActivity.f108807m, true);
                                                    return;
                                                } else {
                                                    enterVerificationCodeChimeraActivity.f108812r.mo49757b(enterVerificationCodeChimeraActivity.f108806l, enterVerificationCodeChimeraActivity.f108807m, false);
                                                    return;
                                                }
                                            }
                                            continue;
                                        }
                                    }
                                }
                            }
                        };
                        this.f108792G = r1;
                        registerReceiver(r1, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
                    }
                }
                if (this.f108812r == null) {
                    this.f108812r = new atam(this, this.f108803i);
                }
                String stringExtra2 = getIntent().getStringExtra("nodeId");
                if (TextUtils.isEmpty(stringExtra2)) {
                    this.f108818x = rjx.m33697b((Activity) this);
                    this.f108819y = rjx.m33693a((Activity) this);
                } else {
                    if (this.f108820z == null) {
                        this.f108820z = axoz.m82854b(this);
                    }
                    boolean booleanExtra = getIntent().getBooleanExtra("shouldCompressRpcs", false);
                    atzh atzh = new atzh(this.f108820z, stringExtra2, this.f108800f, booleanExtra);
                    this.f108814t = atzh;
                    this.f108799e = new atzj(this.f108820z, stringExtra2, booleanExtra);
                    this.f108816v = new atzf(this.f108820z, this.f108799e, atzh);
                }
                findViewById(C0126R.C0129id.InterstitialAlreadyHaveCode).findViewById(C0126R.C0129id.EnterCodeButton).setOnClickListener(new atpu(this));
                findViewById(C0126R.C0129id.EnterCodeButton).setOnClickListener(new atpv(this));
                if (!m93215i()) {
                    z = false;
                } else if (bundle == null) {
                    if (!getIntent().getBooleanExtra("should_start_on_interstitial", false)) {
                        z = false;
                    }
                } else if (!bundle.getBoolean("is_showing_interstitial")) {
                    z = false;
                }
                mo59446a(z);
                asju.m74252a(new asjs(this, this.f108803i.f108326b), this.f108806l, (ImageView) findViewById(C0126R.C0129id.CardArtImageView));
                if (cgwn.m147275y()) {
                    aywx a6 = this.f108817w.f98673b.mo54504a(92633);
                    a6.mo54481a(ayxb.m85017a(this.f108803i.f108326b));
                    a6.mo54503a(getContainerActivity());
                }
                boolean booleanExtra2 = getIntent().getBooleanExtra("EXTRA_USE_SUW_UI", false);
                if (cgwn.m147270t() && booleanExtra2) {
                    findViewById(C0126R.C0129id.SuwAppLogo).setVisibility(0);
                    findViewById(C0126R.C0129id.SuwEnterCodeTitle).setVisibility(0);
                    findViewById(C0126R.C0129id.EnterCodeTitle).setVisibility(8);
                    View findViewById4 = findViewById(C0126R.C0129id.VerificationCodeSubmitButton);
                    this.f108795J = findViewById4;
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById4.getLayoutParams();
                    layoutParams.removeRule(14);
                    layoutParams.addRule(21);
                    layoutParams.addRule(15);
                    this.f108795J.setLayoutParams(layoutParams);
                }
            } catch (bxwf e2) {
                bnsl bnsl2 = (bnsl) f108789b.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity", "onCreate", 333, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to parse ActivationMethod");
                setResult(13);
                finish();
            }
        } else {
            setResult(0);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f108792G;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        this.f108800f.mo50317a();
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (!m93215i()) {
            onBackPressed();
            return true;
        } else if (findViewById(C0126R.C0129id.InterstitialLayout).getVisibility() == 0) {
            setResult(2);
            finish();
            return true;
        } else {
            mo59446a(true);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f108814t.mo50310a(this);
        atzf atzf = this.f108816v;
        if (atzf != null) {
            atzf.mo50328b();
        }
        rjx rjx = this.f108819y;
        if (rjx == null) {
            atzj atzj = this.f108799e;
            if (atzj != null) {
                atzj.mo50332b(this);
            } else {
                throw new IllegalStateException("No client available");
            }
        } else {
            rjx.mo24733b((asin) this);
        }
        this.f108798M = false;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f108814t.mo50137a(this, "com.google.android.gms.tapandpay.tokenization.TokenizePanService");
        atzf atzf = this.f108816v;
        if (atzf != null) {
            atzf.mo50327a();
        }
        rjx rjx = this.f108819y;
        if (rjx == null) {
            atzj atzj = this.f108799e;
            if (atzj != null) {
                atzj.mo50331a(this);
                return;
            }
            throw new IllegalStateException("No client available");
        }
        rjx.mo24720a((asin) this);
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        this.f108798M = true;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_code_autofilled", this.f108809o);
        boolean z2 = true;
        if (findViewById(C0126R.C0129id.InterstitialLayout).getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("is_showing_interstitial", z);
        if (findViewById(C0126R.C0129id.ChooseOtherMethodButton).getVisibility() != 0) {
            z2 = false;
        }
        bundle.putBoolean("should_show_change_method_button", z2);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Enter Verification Code");
    }

    /* renamed from: a */
    public final void mo59441a(int i) {
        this.f108793H.setText(i);
        if (spn.m35896h(this)) {
            TextView textView = this.f108793H;
            textView.announceForAccessibility(textView.getText());
        }
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        if (i2 == 1002) {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo59442a(btnf btnf) {
        mo59448b((btnf != null && !stm.m36302d(btnf.f149603b)) ? btnf.f149603b : getString(C0126R.string.common_something_went_wrong), (btnf != null && !stm.m36302d(btnf.f149604c)) ? btnf.f149604c : getString(C0126R.string.tp_generic_error_content), getString(C0126R.string.common_dismiss), 1001);
    }

    /* renamed from: a */
    public final void mo59443a(btnf btnf, int i) {
        mo59445a((btnf != null && !btnf.f149603b.isEmpty()) ? btnf.f149603b : getString(C0126R.string.common_something_went_wrong), (btnf != null && !btnf.f149604c.isEmpty()) ? btnf.f149604c : getString(C0126R.string.tp_generic_error_content), getString(C0126R.string.common_dismiss), i);
    }

    /* renamed from: b */
    public final void mo59448b(String str, String str2, String str3, int i) {
        if (this.f108798M) {
            auar auar = new auar();
            auar.f91333a = i;
            auar.f91335c = str2;
            auar.f91340h = bpan.VERIFICATION_PROMPT_ERROR;
            auar.f91336d = str3;
            if (!stm.m36302d(str)) {
                auar.f91334b = str;
            }
            auar.mo50344a().show(getSupportFragmentManager(), "EnterVerificationCodeA.errorDialog");
        }
    }

    /* renamed from: a */
    public final void mo59444a(String str) {
        if (!stm.m36302d(str) && !this.f108815u) {
            this.f108815u = true;
            mo59447b(4);
            this.f108802h.setClickable(false);
            try {
                this.f108814t.mo50311a(atva.m76433a(this.f108806l, this.f108803i, this.f108804j, this.f108805k, this.f108807m, str, this.f108809o, false, this.f108808n.mo73642k(), this.f108800f));
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) f108789b.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity", "a", 845, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error calling SubmitActivationCode");
            }
        }
    }

    /* renamed from: a */
    public final void mo59445a(String str, String str2, String str3, int i) {
        setResult(i);
        mo59448b(str, str2, str3, 1002);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        asmj asmj = (asmj) rkk;
        if (asmj != null && asmj.mo7183bo().mo17710c()) {
            CardInfo[] cardInfoArr = asmj.mo49241b().f108369a;
            for (CardInfo cardInfo : cardInfoArr) {
                if (cardInfo.f108340a.equals(this.f108806l.f108340a)) {
                    int i = cardInfo.f108345f.f108459b;
                    if (i == 5 || i == 6) {
                        if (this.f108797L.getVisibility() == 0) {
                            mo59450g();
                        } else {
                            setResult(-1);
                            finish();
                        }
                    } else if (i == 4 || i == 1) {
                        setResult(3);
                        finish();
                    }
                    this.f108806l = cardInfo;
                    return;
                }
            }
            setResult(3);
            finish();
        }
    }

    /* renamed from: a */
    public final void mo59446a(boolean z) {
        int i;
        View view;
        View findViewById = findViewById(C0126R.C0129id.EnterCodeLayout);
        int i2 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        View findViewById2 = findViewById(C0126R.C0129id.InterstitialLayout);
        if (!z) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
        if (!z) {
            this.f108801g.requestFocus();
            view = findViewById(C0126R.C0129id.EnterCodeTitle);
        } else {
            view = findViewById(C0126R.C0129id.InterstitialTitle);
        }
        setTitle(((TextView) view).getText());
        getWindow().getDecorView().sendAccessibilityEvent(32);
        new adzt().postDelayed(new atqc(this), 100);
    }
}

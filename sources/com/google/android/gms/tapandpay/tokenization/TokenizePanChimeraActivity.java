package com.google.android.gms.tapandpay.tokenization;

import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.setupdesign.GlifLayout;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenizePanChimeraActivity extends atex implements auat, auas, axou, ateu {

    /* renamed from: b */
    public static final srn f108905b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    public atsy f108906c;

    /* renamed from: d */
    public boolean f108907d;

    /* renamed from: e */
    public boolean f108908e;

    /* renamed from: f */
    public boolean f108909f;

    /* renamed from: g */
    public boolean f108910g;

    /* renamed from: h */
    public atrk f108911h;

    /* renamed from: i */
    public Messenger f108912i = null;

    /* renamed from: j */
    public awkh f108913j;

    /* renamed from: k */
    public final Handler f108914k = new adzt();

    /* renamed from: l */
    ConnectivityManager f108915l;

    /* renamed from: m */
    public final Runnable f108916m;

    /* renamed from: n */
    public final Runnable f108917n;

    /* renamed from: o */
    public ImageView f108918o;

    /* renamed from: p */
    public rjx f108919p;

    /* renamed from: q */
    public rjx f108920q;

    /* renamed from: r */
    private final ServiceConnection f108921r = new atri(this, "tapandpay");

    public TokenizePanChimeraActivity() {
        new atrj(this);
        this.f108916m = new atrf(this);
        this.f108917n = new atrg(this);
    }

    /* renamed from: c */
    private static void m93278c(btnf btnf) {
        if (btnf != null) {
            bnsl a = f108905b.mo26019b(aske.m74275a());
            a.mo68432a("com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity", "c", 773, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68420a("Internal Error: %s", btnf.f149606e);
        }
    }

    /* renamed from: h */
    private final void m93279h() {
        int i;
        atsy atsy = this.f108906c;
        if (atsy.f90831W == 0) {
            atsy.f90831W = 7;
        }
        if (atsy.f90828T == 0) {
            i = 27;
        } else {
            i = 28;
        }
        atsy.f90839b = i;
        this.f108910g = false;
        mo59484e();
    }

    /* renamed from: a */
    public final void mo50172a(int i) {
        this.f108906c.mo50162a(this).mo50172a(i);
    }

    /* renamed from: b */
    public final void mo59481b(int i) {
        atsy atsy = this.f108906c;
        boolean z = atsy.f90852o;
        atsy.f90839b = i;
        mo59484e();
    }

    /* renamed from: e */
    public final void mo59484e() {
        if (this.f108907d && this.f108908e && !this.f108910g && !isFinishing() && this.f108906c.f90840c == Integer.MIN_VALUE) {
            bnsl a = f108905b.mo26019b(aske.m74275a());
            a.mo68432a("com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity", "e", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68409a("resumed at step %d", this.f108906c.f90839b);
            this.f108906c.mo50162a(this).mo50169a(this.f108906c);
        }
    }

    public final void finish() {
        super.finish();
        atam atam = new atam(this, mo49917k().f90210a);
        atsy atsy = this.f108906c;
        atam.f89955a = atsy.f90838ad;
        boolean z = atsy.f90852o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo59485g() {
        bnsl bnsl = (bnsl) f108905b.mo68388c();
        bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity", "g", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Timed out on tokenization. Finishing activity");
        setResult(404);
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f108906c.f90840c == Integer.MIN_VALUE) {
            setResult(666);
            finish();
        }
        if (!isFinishing()) {
            this.f108906c.f90840c = Integer.MIN_VALUE;
        }
        atsy atsy = this.f108906c;
        boolean z = atsy.f90852o;
        atsy.mo50162a(this).mo50168a(i, i2, intent, this.f108906c);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        mo49917k().mo49914b();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f108906c = new atsy(bundle);
        } else {
            this.f108906c = new atsy(null);
            if (getIntent().hasExtra("session_id")) {
                this.f108906c.f90849l = getIntent().getStringExtra("session_id");
            }
            this.f108906c.f90857t = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
            this.f108906c.f90811C = (CardInfo) getIntent().getParcelableExtra("extra_card_info");
            this.f108906c.f90812D = getIntent().getByteArrayExtra("extra_untokenized_card");
            this.f108906c.f90859v = getIntent().getByteArrayExtra("extra_push_tokenize_request");
            this.f108906c.f90860w = getIntent().getByteArrayExtra("extra_push_tokenize_session_request");
            this.f108906c.f90861x = getIntent().getStringExtra("extra_calling_package");
            int b = btna.m116943b(getIntent().getIntExtra("client_type", 1));
            atsy atsy = this.f108906c;
            if (b == 0) {
                b = 2;
            }
            atsy.f90837ac = b;
            atsy.f90820L = getIntent().getByteArrayExtra("extra_warm_welcome_info");
            this.f108906c.f90821M = getIntent().getBooleanExtra("skip_card_chooser", false);
            this.f108906c.f90813E = getIntent().getByteArrayExtra("extra_instrument_manager_edit_token");
            this.f108906c.f90862y = getIntent().getBooleanExtra("is_account_tokenization", false);
            this.f108906c.f90829U = getIntent().getByteArrayExtra("opaque_card_data");
            this.f108906c.f90830V = getIntent().getByteArrayExtra("push_tokenize_params");
            this.f108906c.f90816H = getIntent().getByteArrayExtra("integrator_callback_data");
            this.f108906c.f90828T = getIntent().getIntExtra("save_to_platform_state", 0);
            if (getIntent().hasExtra("token_provisioning_data")) {
                try {
                    this.f108906c.f90835aa = (bmuw) GeneratedMessageLite.m124016a(bmuw.f130975l, getIntent().getByteArrayExtra("token_provisioning_data"), bxus.m123744c());
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) f108905b.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity", "onCreate", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Error parsing TokenProvisioningData proto");
                }
                atsy atsy2 = this.f108906c;
                bmur bmur = atsy2.f90835aa.f130980d;
                if (bmur == null) {
                    bmur = bmur.f130971a;
                }
                atsy2.f90841d = bmur.mo73642k();
                atsy atsy3 = this.f108906c;
                btoa a = btoa.m116971a(atsy3.f90835aa.f130985i);
                if (a == null) {
                    a = btoa.UNKNOWN_BUNDLE;
                }
                atsy3.f90858u = atcw.m75565a(a);
                atsy atsy4 = this.f108906c;
                bmuw bmuw = atsy4.f90835aa;
                atsy4.f90845h = bmuw.f130982f;
                atsy4.f90847j = bmuw.f130984h;
                int a2 = bmut.m108402a(bmuw.f130987k);
                if (a2 == 0) {
                    a2 = 1;
                }
                atsy4.f90828T = atrp.m76256a(a2);
                atsy atsy5 = this.f108906c;
                btof a3 = btof.m116979a(atsy5.f90835aa.f130979c);
                if (a3 == null) {
                    a3 = btof.NONE;
                }
                atsy5.f90843f = a3.mo3214a();
            }
            this.f108906c.f90822N = getIntent().getBooleanExtra("EXTRA_MONET_ONBOARDING", false);
            this.f108906c.f90823O = getIntent().getBooleanExtra("EXTRA_USE_DEFERRED_YP", false);
            this.f108906c.f90836ab = getIntent().getStringExtra("server_provisioning_session_id");
            this.f108906c.f90824P = getIntent().getBooleanExtra("EXTRA_USE_SUW_UI", false);
            this.f108906c.f90825Q = getIntent().getStringExtra("EXTRA_SUW_THEME");
        }
        int i = Build.VERSION.SDK_INT;
        setRequestedOrientation(1);
        setTitle("");
        atsy atsy6 = this.f108906c;
        boolean z = atsy6.f90852o;
        if (!atsy6.f90824P || !cgwn.m147270t()) {
            setTheme(2132018962);
            setContentView((int) C0126R.C0128layout.tp_tokenize);
            ((Animatable) ((ImageView) findViewById(C0126R.C0129id.tp_progress)).getDrawable()).start();
        } else {
            String str = this.f108906c.f90825Q;
            bjbb bjbb = new bjbb();
            bjbb.f122457a = 2132018265;
            bjbb.f122458b = true;
            setTheme(bjbb.mo64964a().mo64967a(str, false));
            setContentView((int) C0126R.C0128layout.tp_tokenize_suw);
            ((GlifLayout) findViewById(C0126R.C0129id.GlifLayout)).mo71362a(C1133kh.m17836a(this, (int) C0126R.C0127drawable.tp_gpay_logo_setting));
        }
        this.f108918o = (ImageView) findViewById(C0126R.C0129id.tp_progress_icon);
        atsy atsy7 = this.f108906c;
        if (atsy7.f90857t != null) {
            this.f108911h = new atrk(this);
            if (this.f108919p == null) {
                this.f108919p = axoz.m82855c(this);
            }
            if (this.f108913j == null) {
                awbt awbt = new awbt();
                awbt.mo51835a(1);
                this.f108913j = awbv.m79579a(this, awbt.mo51834a());
            }
            if (this.f108920q == null) {
                this.f108920q = axoz.m82854b(this);
            }
            if (this.f108915l == null) {
                this.f108915l = (ConnectivityManager) getSystemService("connectivity");
            }
            byte[] bArr = this.f108906c.f90820L;
            if (bArr != null) {
                try {
                    bmum bmum = (bmum) GeneratedMessageLite.m124016a(bmum.f130943d, bArr, bxus.m123744c());
                    if ((1 & bmum.f130945a) != 0) {
                        bmuj bmuj = bmum.f130946b;
                        if (bmuj == null) {
                            bmuj = bmuj.f130934f;
                        }
                        if (!bmuj.f130940e.isEmpty()) {
                            bmuj bmuj2 = bmum.f130946b;
                            if (bmuj2 == null) {
                                bmuj2 = bmuj.f130934f;
                            }
                            atyg.m76552a(bmuj2.f130940e);
                        }
                    }
                } catch (bxwf e2) {
                }
            }
        } else {
            boolean z2 = atsy7.f90852o;
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        atrk atrk = this.f108911h;
        if (atrk != null) {
            atrk.mo50317a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        atff.m75768a(this);
        super.onPause();
        this.f108914k.removeCallbacks(this.f108917n);
        this.f108908e = false;
        boolean z = this.f108906c.f90852o;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        if (this.f108909f) {
            this.f108909f = false;
            mo59482b((btnf) null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(boolean, int):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(int, int):void
      com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(java.lang.String, java.lang.String):void
      auat.a(int, int):void
      com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(boolean, int):void */
    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f108908e = true;
        boolean z = this.f108906c.f90852o;
        mo59480a(false, 0);
        mo59484e();
        this.f108914k.postDelayed(this.f108917n, TimeUnit.SECONDS.toMillis((long) bqcn.m112585b(cgxx.m147543b())));
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        atsy atsy = this.f108906c;
        bundle.putParcelable("state_account_info", atsy.f90857t);
        bundle.putBoolean("state_is_newly_added_card", atsy.f90848k);
        bundle.putString("state_cvc", atsy.f90842e);
        bundle.putInt("state_tokenize_flow_step", atsy.f90839b);
        bundle.putInt("state_launched_activity", atsy.f90840c);
        bundle.putInt("state_token_service_provider", atsy.f90843f);
        bundle.putByteArray("state_eligibility_receipt", atsy.f90844g);
        bundle.putString("state_terms_and_conditions_title", atsy.f90845h);
        btmo btmo = atsy.f90846i;
        if (btmo != null) {
            bundle.putByteArray("state_terms_and_conditions", btmo.mo73642k());
        }
        bundle.putString("state_terms_and_conditions_url", atsy.f90847j);
        bundle.putString("state_session_id", atsy.f90849l);
        bundle.putBoolean("state_warm_welcome_required", atsy.f90855r);
        bundle.putBoolean("state_keyguard_setup_required", atsy.f90856s);
        bundle.putParcelable("state_card_info", atsy.f90811C);
        bundle.putByteArray("state_orchestration_add_token", atsy.f90813E);
        bundle.putByteArray("state_orchestration_verify_token", atsy.f90814F);
        bundle.putString("state_cardholder_name", atsy.f90850m);
        bundle.putBoolean("state_had_attestation_error", atsy.f90851n);
        bundle.putString("state_bundle_type", atsy.f90858u);
        bundle.putString("nodeId", atsy.f90853p);
        bundle.putByteArray("state_card_id", atsy.f90841d);
        bundle.putByteArray("push_tokenize_request", atsy.f90859v);
        bundle.putByteArray("push_tokenize_session_request", atsy.f90860w);
        int i2 = atsy.f90837ac;
        if (i2 != 0) {
            i = btna.m116942a(i2);
        } else {
            i = 0;
        }
        bundle.putInt("state_client_type", i);
        bundle.putByteArray("state_activation_receipt", atsy.f90817I);
        bundle.putByteArray("state_orchestration_callback_data", atsy.f90816H);
        bundle.putString("state_instrument_id", atsy.f90815G);
        bundle.putString("state_calling_package", atsy.f90861x);
        bundle.putByteArray("state_untokenized_card", atsy.f90812D);
        bundle.putByteArray("state_client_token", atsy.f90809A);
        bundle.putInt("state_phone_wear_proxy_version", atsy.f90810B);
        bundle.putBoolean("state_is_account_tokenization", atsy.f90862y);
        bundle.putBoolean("state_is_about_to_show_mfi_sign_in", atsy.f90863z);
        bundle.putByteArray("state_opaque_card_data", atsy.f90829U);
        bundle.putByteArray("state_push_tokenize_params", atsy.f90830V);
        bundle.putBoolean("state_should_compress_wear_rpcs", atsy.f90819K);
        bnhe bnhe = atsy.f90818J;
        if (bnhe != null) {
            bundle.putSerializable("state_untokenized_edit_tokens", bnhe);
        }
        bundle.putByteArray("state_warm_welcome_info", atsy.f90820L);
        bundle.putBoolean("state_skip_card_chooser", atsy.f90821M);
        bundle.putInt("state_saved_to_platform", atsy.f90828T);
        bundle.putInt("state_tokenization_status", atsy.f90831W);
        bundle.putInt("state_felica_current_default", atsy.f90826R);
        btnf btnf = atsy.f90832X;
        if (btnf != null) {
            bundle.putByteArray("state_api_error", btnf.mo73642k());
        }
        bundle.putLong("state_step_started_time_ms", atsy.f90833Y);
        bundle.putParcelableArrayList("state_tokenization_step_summaries", atsy.f90834Z);
        bundle.putByteArray("token_provisioning_data", atsy.f90835aa.mo73642k());
        bundle.putString("state_server_provisioning_session_id", atsy.f90836ab);
        bundle.putBoolean("state_use_suw_ui", atsy.f90824P);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        skh.m35531a().mo25690a(this, new Intent().setClassName(this, "com.google.android.gms.tapandpay.tokenization.TokenizePanService"), this.f108921r, 1);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (this.f108907d) {
            skh.m35531a().mo25689a(this, this.f108921r);
            this.f108907d = false;
        }
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        this.f108906c.mo50162a(this).mo50173a(i, i2);
        if (i2 != 9) {
            if (i2 == 10) {
                if (this.f108906c.f90851n) {
                    setResult(15005);
                    finish();
                    return;
                }
                m93279h();
            }
        } else if (i == -2) {
            m93279h();
        } else if (i == -1) {
            mo59484e();
        }
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (!isFinishing()) {
            atsy atsy = this.f108906c;
            int i2 = atsy.f90840c;
            if (i2 == Integer.MIN_VALUE) {
                atsy.f90840c = i;
                boolean z = atsy.f90852o;
                mo49917k().mo49913a(intent);
                super.startActivityForResult(intent, i);
            } else if (i2 != i) {
                setResult(666);
                finish();
            }
        }
    }

    /* renamed from: b */
    public final void mo59482b(btnf btnf) {
        m93278c(btnf);
        if (athh.m75885a(btnf)) {
            atsy atsy = this.f108906c;
            atsy.f90851n = true;
            atsy.f90831W = 4;
            mo59481b(27);
            return;
        }
        mo59479a((btnf != null && !btnf.f149603b.isEmpty()) ? btnf.f149603b : getString(C0126R.string.common_something_went_wrong), (btnf != null && !btnf.f149604c.isEmpty()) ? btnf.f149604c : getString(C0126R.string.tp_generic_error_content));
    }

    /* renamed from: a */
    public final void mo59476a(Drawable drawable) {
        ImageView imageView = this.f108918o;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public final void mo59477a(btnf btnf) {
        mo59483b(btnf, getString(C0126R.string.common_try_again), getString(C0126R.string.common_cancel));
    }

    /* renamed from: a */
    public final void mo59478a(btnf btnf, String str, String str2) {
        String string = (btnf != null && !btnf.f149604c.isEmpty()) ? btnf.f149604c : getString(C0126R.string.tp_network_connection_needed_content);
        String string2 = (btnf != null && !btnf.f149603b.isEmpty()) ? btnf.f149603b : getString(C0126R.string.tp_network_connection_needed_title);
        bnsl a = f108905b.mo26019b(aske.m74275a());
        a.mo68432a("com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity", "a", 792, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68424a("Received error:  title[%s], content[%s]", string2, string);
        boolean z = this.f108906c.f90852o;
        auar auar = new auar();
        auar.f91333a = 9;
        auar.f91334b = string2;
        auar.f91335c = string;
        auar.f91336d = str;
        auar.f91337e = str2;
        auar.f91340h = bpan.TOKENIZE_RETRY;
        auar.f91341i = this.f108906c.f90857t;
        auar.mo50344a().show(getSupportFragmentManager(), "TokenizePanActivity.errorDialog");
    }

    /* renamed from: b */
    public final void mo59483b(btnf btnf, String str, String str2) {
        m93278c(btnf);
        if (!this.f108908e) {
            setResult(0);
            finish();
            return;
        }
        mo59478a(btnf, str, str2);
    }

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        this.f108906c.mo50162a(this).mo50177a(messageEventParcelable);
    }

    /* renamed from: a */
    public final void mo59479a(String str, String str2) {
        this.f108910g = true;
        if (!this.f108908e) {
            setResult(0);
            finish();
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getString(C0126R.string.tp_generic_error_content);
        }
        if (TextUtils.isEmpty(str)) {
            str = getString(C0126R.string.common_something_went_wrong);
        }
        boolean z = this.f108906c.f90852o;
        auar auar = new auar();
        auar.f91333a = 10;
        auar.f91335c = str2;
        auar.f91334b = str;
        auar.f91340h = bpan.TOKENIZE_NON_RETRYABLE;
        auar.f91336d = getString(C0126R.string.common_dismiss);
        auar.mo50344a().show(getSupportFragmentManager(), "TokenizePanActivity.errorDialog");
    }

    /* renamed from: a */
    public final void mo59480a(boolean z, int i) {
        if (!this.f108906c.f90824P || !cgwn.m147270t()) {
            TextView textView = (TextView) findViewById(C0126R.C0129id.tp_tokenization_message);
            if (z) {
                textView.setVisibility(0);
                textView.setText(i);
                return;
            }
            textView.setVisibility(8);
            return;
        }
        bjad bjad = (bjad) ((GlifLayout) findViewById(C0126R.C0129id.GlifLayout)).mo71342a(bjad.class);
        if (z) {
            bjad.mo64935a(i);
        } else {
            bjad.mo64937a("");
        }
    }
}

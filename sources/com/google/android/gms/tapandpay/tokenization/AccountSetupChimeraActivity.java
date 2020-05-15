package com.google.android.gms.tapandpay.tokenization;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountSetupChimeraActivity extends atex implements auat {

    /* renamed from: b */
    public static final srn f108750b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    public static final btml[] f108751c = {btml.COMPLETE_RETURN_SETUP_STEP_TYPE, btml.BENDER_SETUP_STEP_TYPE, btml.WEB_VIEW_SETUP_STEP_TYPE, btml.COMPLETE_START_TOKENIZATION_SETUP_STEP_TYPE};

    /* renamed from: d */
    String f108752d;

    /* renamed from: e */
    public byte[] f108753e;

    /* renamed from: f */
    public byte[] f108754f;

    /* renamed from: g */
    public btkt f108755g;

    /* renamed from: h */
    int f108756h = 2;

    /* renamed from: i */
    private askf f108757i;

    /* renamed from: j */
    private long f108758j;

    /* renamed from: k */
    private boolean f108759k = false;

    /* renamed from: l */
    private boolean f108760l = true;

    /* renamed from: a */
    public static Intent m93191a(askf askf, int i, long j, byte[] bArr, String str) {
        return m93192a(askf, i, j, bArr, str, null, null, false);
    }

    /* renamed from: b */
    private final void m93194b(btkt btkt) {
        this.f108755g = btkt;
        atff.m75765a(this.f108757i, "t/cardtokenization/getnextsetupstep", btkt, btla.f149333d, new atpd(this), "SetupAccountActivity");
    }

    /* renamed from: e */
    public final bxvd mo59435e() {
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("tp");
        bxvd da = btkt.f149301l.mo74144da();
        int i = this.f108756h;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btkt) da.f164949b).f149305c = btmp.m116928a(i);
        long j = this.f108758j;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btkt) da.f164949b).f149306d = j;
        bxtx a = byteArrayExtra != null ? bxtx.m123261a(byteArrayExtra) : bxtx.f164797b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((btkt) da.f164949b).f149313k = a;
        String str = (String) askd.f89109a.mo58455c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btkt btkt = (btkt) da.f164949b;
        str.getClass();
        btkt.f149311i = str;
        String str2 = this.f108752d;
        str2.getClass();
        btkt.f149312j = str2;
        bxtx a2 = bxtx.m123261a(this.f108753e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((btkt) da.f164949b).f149307e = a2;
        List<btml> asList = Arrays.asList(f108751c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btkt btkt2 = (btkt) da.f164949b;
        if (!btkt2.f149308f.mo73666a()) {
            btkt2.f149308f = bxvk.m124019a(btkt2.f149308f);
        }
        for (btml btml : asList) {
            btkt2.f149308f.mo74153d(btml.mo3214a());
        }
        bxvd da2 = btkp.f149287b.mo74144da();
        bxtx a3 = bxtx.m123261a(this.f108754f);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a3.getClass();
        ((btkp) da2.f164949b).f149289a = a3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btkp btkp = (btkp) da2.mo74062i();
        btkp.getClass();
        ((btkt) da.f164949b).f149310h = btkp;
        bxvd da3 = btkr.f149293c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        btkr btkr = (btkr) da3.f164949b;
        "comgooglewallet://wallet.google.com/pay/continue_tokenization/success".getClass();
        btkr.f149295a = "comgooglewallet://wallet.google.com/pay/continue_tokenization/success";
        "comgooglewallet://wallet.google.com/pay/continue_tokenization/failure".getClass();
        btkr.f149296b = "comgooglewallet://wallet.google.com/pay/continue_tokenization/failure";
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btkr btkr2 = (btkr) da3.mo74062i();
        btkr2.getClass();
        ((btkt) da.f164949b).f149309g = btkr2;
        return da;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 100:
                mo59432a(btml.BENDER_SETUP_STEP_TYPE, true, i2);
                bxvd da = btkq.f149290b.mo74144da();
                if (i2 == -1 && intent.hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN")) {
                    bxtx a = bxtx.m123261a(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN"));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a.getClass();
                    ((btkq) da.f164949b).f149292a = a;
                }
                bxvd e = mo59435e();
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                btkt btkt = (btkt) e.f164949b;
                btkq btkq = (btkq) da.mo74062i();
                btkt btkt2 = btkt.f149301l;
                btkq.getClass();
                btkt.f149304b = btkq;
                btkt.f149303a = 5;
                mo59427a((btkt) e.mo74062i());
                return;
            case 101:
                mo59432a(btml.WEB_VIEW_SETUP_STEP_TYPE, true, i2);
                if (i2 == 0) {
                    bnsl bnsl = (bnsl) f108750b.mo68387b();
                    bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity", "a", 443, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Browser redirect failed through some unexepcted, unrecoverable error. Finishing");
                    finish();
                    return;
                }
                bxvd da2 = btks.f149297c.mo74144da();
                if (intent != null) {
                    str = intent.getDataString();
                } else {
                    str = null;
                }
                if (i2 != -1) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            bnsl bnsl2 = (bnsl) f108750b.mo68388c();
                            bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity", "a", 474, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68409a("Unexpected activity result code %d for browser linking flow", i2);
                            finish();
                            return;
                        }
                    } else if (str != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        btks btks = (btks) da2.f164949b;
                        str.getClass();
                        btks.f149299a = 2;
                        btks.f149300b = str;
                    } else {
                        finish();
                        return;
                    }
                } else if (str != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    btks btks2 = (btks) da2.f164949b;
                    str.getClass();
                    btks2.f149299a = 1;
                    btks2.f149300b = str;
                } else {
                    finish();
                    return;
                }
                bxvd e2 = mo59435e();
                if (e2.f164950c) {
                    e2.mo74035c();
                    e2.f164950c = false;
                }
                btkt btkt3 = (btkt) e2.f164949b;
                btks btks3 = (btks) da2.mo74062i();
                btkt btkt4 = btkt.f149301l;
                btks3.getClass();
                btkt3.f149304b = btks3;
                btkt3.f149303a = 4;
                mo59427a((btkt) e2.mo74062i());
                return;
            case 102:
                mo59432a(btml.COMPLETE_START_TOKENIZATION_SETUP_STEP_TYPE, true, i2);
                if (i2 == -1) {
                    setResult(-1, intent);
                    finish();
                    return;
                }
                setResult(0);
                finish();
                return;
            default:
                bnsl bnsl3 = (bnsl) f108750b.mo68388c();
                bnsl3.mo68432a("com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity", "onActivityResult", 276, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("Activity result with unrecognized request code: %d", i);
                return;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        mo49917k().mo49914b();
        super.onCreate(bundle);
        setTheme(2132018962);
        setContentView((int) C0126R.C0128layout.tp_tokenize);
        ((Animatable) ((ImageView) findViewById(C0126R.C0129id.tp_progress)).getDrawable()).start();
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        String stringExtra = getIntent().getStringExtra("extra_calling_package");
        if (accountInfo == null || TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        this.f108757i = new askf(accountInfo, askc.m74272b(), this, stringExtra);
        int b = btmp.m116929b(getIntent().getIntExtra("tokenizable_type", 0));
        if (b == 0) {
            b = 2;
        }
        this.f108756h = b;
        this.f108758j = getIntent().getLongExtra("eid", 0);
        if (bundle == null) {
            this.f108752d = atxw.m76526a();
            this.f108753e = new byte[0];
        } else {
            this.f108752d = bundle.getString("key_session_id");
            this.f108753e = bundle.getByteArray("key_session_state");
            this.f108754f = bundle.getByteArray("key_im_client_token");
            byte[] byteArray = bundle.getByteArray("key_in_flight_request");
            if (byteArray != null) {
                try {
                    this.f108755g = (btkt) bxvk.m124016a(btkt.f149301l, byteArray, bxus.m123744c());
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) f108750b.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity", "onCreate", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to parse in-flight request, finishing");
                    finish();
                    return;
                }
            }
        }
        if (this.f108754f == null) {
            awbt awbt = new awbt();
            awbt.mo51835a(askc.m74269a());
            aucb a = new awkh(this, awbt.mo51834a()).mo52198a(new GetClientTokenRequest(new WalletCustomTheme()));
            a.mo50372a(new atpb(this));
            a.mo50373a(new atpc(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f108760l = false;
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        this.f108760l = true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("key_session_id", this.f108752d);
        bundle.putByteArray("key_session_state", this.f108753e);
        bundle.putByteArray("key_im_client_token", this.f108754f);
        btkt btkt = this.f108755g;
        if (btkt != null) {
            bundle.putByteArray("key_in_flight_request", btkt.mo73642k());
        }
    }

    public final void onStart() {
        super.onStart();
        this.f108759k = true;
        btkt btkt = this.f108755g;
        if (btkt != null) {
            m93194b(btkt);
        }
    }

    public final void onStop() {
        super.onStop();
        atff.m75768a("SetupAccountActivity");
        this.f108759k = false;
    }

    /* renamed from: a */
    public static Intent m93192a(askf askf, int i, long j, byte[] bArr, String str, byte[] bArr2, String str2, boolean z) {
        return new Intent().setClassName(askf.f89126d, "com.google.android.gms.tapandpay.tokenization.UnsupportedCardActivity").putExtra("tokenizable_type", i).putExtra("eid", j).putExtra("tp", bArr).putExtra("extra_account_info", askf.mo49209a()).putExtra("extra_calling_package", str).putExtra("extra_warm_welcome_info", bArr2).putExtra("extra_alt_brand_name", str2).putExtra("extra_hide_warm_welcome", z);
    }

    /* renamed from: a */
    private final void m93193a(int i, Intent intent) {
        String str;
        if (i == 0) {
            bnsl bnsl = (bnsl) f108750b.mo68387b();
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity", "a", 443, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Browser redirect failed through some unexepcted, unrecoverable error. Finishing");
            finish();
            return;
        }
        bxvd da = btks.f149297c.mo74144da();
        if (intent != null) {
            str = intent.getDataString();
        } else {
            str = null;
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    bnsl bnsl2 = (bnsl) f108750b.mo68388c();
                    bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity", "a", 474, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68409a("Unexpected activity result code %d for browser linking flow", i);
                    finish();
                    return;
                }
            } else if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btks btks = (btks) da.f164949b;
                str.getClass();
                btks.f149299a = 2;
                btks.f149300b = str;
            } else {
                finish();
                return;
            }
        } else if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btks btks2 = (btks) da.f164949b;
            str.getClass();
            btks2.f149299a = 1;
            btks2.f149300b = str;
        } else {
            finish();
            return;
        }
        bxvd e = mo59435e();
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        btkt btkt = (btkt) e.f164949b;
        btks btks3 = (btks) da.mo74062i();
        btkt btkt2 = btkt.f149301l;
        btks3.getClass();
        btkt.f149304b = btks3;
        btkt.f149303a = 4;
        mo59427a((btkt) e.mo74062i());
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        finish();
    }

    /* renamed from: a */
    public final void mo59427a(btkt btkt) {
        if (this.f108759k) {
            m93194b(btkt);
        } else {
            this.f108755g = btkt;
        }
    }

    /* renamed from: a */
    public final void mo59428a(btku btku) {
        if (btku.f149316a.mo73744a() == 0) {
            finish();
            return;
        }
        awlc awlc = new awlc(this);
        awlc.mo52187a(askc.m74269a());
        awlc.mo52188a(new Account(this.f108757i.f89124b, "com.google"));
        awlc.mo52233a(btku.f149316a.mo73780k());
        awlc.mo52192b(3);
        awlc.mo52190a(atvh.m76455a(this));
        startActivityForResult(awlc.mo52186a(), 100);
    }

    /* renamed from: a */
    public final void mo59429a(btkv btkv) {
        if (!TextUtils.isEmpty(btkv.f149319a)) {
            setResult(-1, new Intent().putExtra("platform_linked_external_account_name", btkv.f149319a));
        } else {
            setResult(0);
        }
        finish();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final void mo59430a(btkx btkx) {
        String str;
        btkx btkx2 = btkx;
        askf askf = this.f108757i;
        String str2 = askf.f89127e;
        AccountInfo a = askf.mo49209a();
        byte[] k = btkx2.f149325a.mo73780k();
        byte[] k2 = btkx2.f149326b.mo73780k();
        btlv btlv = btkx2.f149327c;
        if (btlv == null) {
            btlv = null;
        }
        btkw btkw = btkx2.f149329e;
        if (btkw != null) {
            str = btkw.f149322a;
        } else {
            str = null;
        }
        int b = btmf.m116918b(btkx2.f149328d);
        if (b == 0) {
            b = 1;
        }
        int a2 = btmf.m116917a(b);
        String str3 = this.f108752d;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("extra_warm_welcome_info");
        String stringExtra = getIntent().getStringExtra("extra_alt_brand_name");
        boolean booleanExtra = getIntent().getBooleanExtra("extra_hide_warm_welcome", false);
        Intent putExtra = atrq.m76259a(str2, a, null).putExtra("is_account_tokenization", true).putExtra("session_id", str3).putExtra("client_type", 3).putExtra("save_to_platform_state", a2).putExtra("integrator_callback_data", k).putExtra("opaque_card_data", k2);
        if (btlv != null) {
            putExtra.putExtra("push_tokenize_params", btlv.mo73642k());
        }
        if (str != null) {
            putExtra.putExtra("server_provisioning_session_id", str);
        }
        if (byteArrayExtra != null) {
            putExtra.putExtra("extra_warm_welcome_info", byteArrayExtra);
        }
        if (stringExtra != null) {
            putExtra.putExtra("extra_alt_brand_name", stringExtra);
        }
        putExtra.putExtra("extra_hide_warm_welcome", booleanExtra);
        startActivityForResult(putExtra, 102);
    }

    /* renamed from: a */
    public final void mo59431a(btkz btkz) {
        if (TextUtils.isEmpty(btkz.f149332a)) {
            finish();
        } else {
            startActivityForResult(new Intent().setClassName(getApplicationContext(), "com.google.android.gms.tapandpay.tokenization.AddNewCardThroughBrowserActivity").putExtra("extra_url", btkz.f149332a).putExtra("tokenizable_type", btmp.m116928a(this.f108756h)).putExtra("extra_account_info", this.f108757i.mo49209a()), 101);
        }
    }

    /* renamed from: a */
    public final void mo59432a(btml btml, boolean z, int i) {
        atam a = atam.m75294a(getBaseContext(), mo49909d());
        String str = this.f108752d;
        int i2 = this.f108756h;
        bxvd g = a.mo49765g(125);
        bxvd da = boxa.f135212g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxa boxa = (boxa) da.f164949b;
        str.getClass();
        int i3 = 1;
        boxa.f135214a |= 1;
        boxa.f135215b = str;
        int f = atam.m75297f(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxa boxa2 = (boxa) da.f164949b;
        boxa2.f135216c = f - 1;
        boxa2.f135214a |= 2;
        btml btml2 = btml.UNKNOWN_SETUP_STEP_TYPE;
        btnv btnv = btnv.UNKNOWN_ACTIVATION_METHOD_TYPE;
        int ordinal = btml.ordinal();
        if (ordinal == 1) {
            i3 = 2;
        } else if (ordinal == 2) {
            i3 = 3;
        } else if (ordinal == 3) {
            i3 = 4;
        } else if (ordinal == 4) {
            i3 = 5;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxa boxa3 = (boxa) da.f164949b;
        boxa3.f135217d = i3 - 1;
        int i4 = boxa3.f135214a | 4;
        boxa3.f135214a = i4;
        int i5 = i4 | 8;
        boxa3.f135214a = i5;
        boxa3.f135218e = z;
        boxa3.f135214a = i5 | 16;
        boxa3.f135219f = i;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        boxa boxa4 = (boxa) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        boxa4.getClass();
        bpbx.f135640D = boxa4;
        bpbx.f135655a |= Integer.MIN_VALUE;
        a.mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: a */
    public final void mo59433a(btnf btnf) {
        String str;
        String str2;
        if (this.f108760l) {
            if (btnf != null) {
                str2 = btnf.f149603b;
                str = btnf.f149604c;
            } else if (!ssk.m36235a(this)) {
                str2 = getString(C0126R.string.tp_network_connection_needed_title);
                str = getString(C0126R.string.tp_network_connection_needed_content);
            } else {
                str2 = getString(C0126R.string.common_something_went_wrong);
                str = getString(C0126R.string.tp_generic_error_content);
            }
            auar auar = new auar();
            auar.f91333a = 1001;
            auar.f91335c = str;
            auar.f91340h = bpan.ACCOUNT_SETUP_ERROR;
            auar.f91336d = getString(C0126R.string.common_ok);
            if (!stm.m36302d(str2)) {
                auar.f91334b = str2;
            }
            auar.mo50344a().show(getSupportFragmentManager(), "SetupAccountActivity.error");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo59434a(Exception exc) {
        bnsl bnsl = (bnsl) f108750b.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity", "a", 290, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to get bender token to add account, finishing");
        mo59433a((btnf) null);
    }
}

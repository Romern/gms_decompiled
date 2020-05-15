package com.google.android.gms.tapandpay.wear;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearProxyCompanionChimeraActivity extends atex implements auat, atze {

    /* renamed from: e */
    private static final srn f108989e = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public atzf f108990b;

    /* renamed from: c */
    TextView f108991c;

    /* renamed from: d */
    public rjx f108992d;

    /* renamed from: f */
    private Runnable f108993f;

    /* renamed from: g */
    private final Handler f108994g = new adzt();

    /* renamed from: h */
    private boolean f108995h = false;

    /* renamed from: i */
    private String f108996i;

    /* renamed from: j */
    private boolean f108997j;

    /* renamed from: k */
    private AccountInfo f108998k;

    /* renamed from: l */
    private atzp f108999l;

    /* renamed from: m */
    private final Runnable f109000m = new atyz(this);

    /* renamed from: a */
    public static Intent m93326a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.tapandpay.wear.WearProxyCompanionActivity").setFlags(805404672).putExtra("type", "stopProxyRequest");
    }

    /* renamed from: e */
    private final void m93330e() {
        this.f108997j = true;
        mo59505a(getString(C0126R.string.tp_wear_session_ended_by_watch));
        this.f108994g.removeCallbacksAndMessages(null);
        this.f108994g.postDelayed(new atzc(this), 3000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo59506b(Intent intent) {
        Bundle extras = intent.getExtras();
        int i = extras.getInt("version", 3);
        if (i < 7) {
            if (!this.f108999l.mo50334a(extras, i, 7)) {
                m93329a(null, null, 2, "WearProxyCompanionAct");
                return;
            }
        } else if (i > 7) {
            m93329a(null, null, 2, "WearProxyCompanionAct");
            return;
        }
        auai.m76648a(extras);
        if (!"proxyRequest".equals(extras.getString("type"))) {
            ((bnsl) f108989e.mo68387b()).mo68420a("Cannot handle request: %s", extras);
            finish();
            return;
        }
        AccountInfo accountInfo = (AccountInfo) extras.getParcelable("accountInfo");
        String string = extras.getString("nodeId");
        if (accountInfo == null || TextUtils.isEmpty(accountInfo.f108326b) || string == null) {
            ((bnsl) f108989e.mo68387b()).mo68420a("accountInfo and nodeId required! Request: %s", extras);
            finish();
            return;
        }
        String str = accountInfo.f108326b;
        if (soz.m35791a(this, new Account(str, "com.google"))) {
            Intent intent2 = new Intent();
            intent2.putExtra("nodeId", string);
            intent2.putExtra("version", 0);
            Bundle bundle = extras.getBundle("data");
            if (bundle != null) {
                intent2.putExtras(bundle);
            }
            String string2 = extras.getString("activity");
            if (!TextUtils.isEmpty(string2)) {
                intent2.setClassName(this, string2);
            }
            String string3 = extras.getString("package");
            if (!TextUtils.isEmpty(string3)) {
                intent2.setPackage(string3);
            }
            String string4 = extras.getString("action");
            if (!TextUtils.isEmpty(string4)) {
                intent2.setAction(string4);
            }
            intent2.addFlags(536870912);
            try {
                startActivityForResult(intent2, 0);
                String string5 = extras.getString("cardArt");
                if (string5 != null) {
                    startService(asju.m74251a(new askf(accountInfo, askc.m74272b(), this), string5));
                }
            } catch (Exception e) {
                m93328a(0, null, true);
            }
        } else {
            auar auar = new auar();
            auar.f91333a = 1;
            auar.f91334b = getString(C0126R.string.tp_wear_account_required_title);
            auar.f91335c = getString(C0126R.string.tp_wear_account_required_body, new Object[]{str});
            auar.f91336d = getString(C0126R.string.tp_wear_add_account);
            auar.f91337e = getString(C0126R.string.common_cancel);
            auar.f91340h = bpan.WEAR_PROXY_ADD_ACCOUNT;
            auar.f91341i = this.f108998k;
            auar.mo50344a().show(getSupportFragmentManager(), "WearProxyCompanionAct");
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f108997j) {
            m93328a(i2, intent != null ? intent.getExtras() : null, i2 == 0);
        }
    }

    public final void onBackPressed() {
        m93328a(0, null, true);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108999l = new atzp(this);
        setContentView((int) C0126R.C0128layout.tp_tokenize);
        ((Animatable) ((ImageView) findViewById(C0126R.C0129id.tp_progress)).getDrawable()).start();
        this.f108991c = (TextView) findViewById(C0126R.C0129id.tp_tokenization_message);
        Intent intent = getIntent();
        this.f108997j = false;
        if ("stopProxyRequest".equals(intent.getStringExtra("type"))) {
            m93330e();
            return;
        }
        if (bundle == null) {
            this.f108995h = intent.getBooleanExtra("shouldCompressRpcs", false);
            this.f108996i = intent.getStringExtra("nodeId");
        } else {
            this.f108995h = bundle.getBoolean("shouldCompressRpcs");
            this.f108996i = bundle.getString("nodeId");
        }
        if (!TextUtils.isEmpty(this.f108996i)) {
            if (this.f108992d == null) {
                this.f108992d = axoz.m82854b(this);
            }
            this.f108990b = new atzf(this.f108992d, this);
            this.f108998k = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
            if (bundle == null) {
                mo59506b(intent);
                return;
            }
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        intent.getExtras();
        if ("stopProxyRequest".equals(intent.getStringExtra("type"))) {
            m93330e();
        }
        mo59505a("");
        mo59506b(intent);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (!this.f108997j) {
            this.f108994g.removeCallbacks(this.f109000m);
            this.f108990b.mo50328b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!this.f108997j) {
            this.f108994g.postDelayed(this.f109000m, TimeUnit.SECONDS.toMillis(60));
            this.f108990b.mo50327a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("shouldCompressRpcs", this.f108995h);
        bundle.putString("nodeId", this.f108996i);
        super.onSaveInstanceState(bundle);
    }

    public final void startActivityForResult(Intent intent, int i) {
        intent.putExtra("shouldCompressRpcs", this.f108995h);
        super.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public static Intent m93327a(Context context, Bundle bundle) {
        return new Intent().setClassName(context, "com.google.android.gms.tapandpay.wear.WearProxyCompanionActivity").setFlags(805371904).putExtras(bundle);
    }

    /* renamed from: a */
    private final void m93328a(int i, Bundle bundle, boolean z) {
        this.f108992d.mo24694a(this.f108996i, "/tapandpay/proxy", auai.m76649a(auaa.m76625a(i, bundle), this.f108995h)).mo50374a(this, new atzb(this, z));
    }

    /* renamed from: a */
    private final void m93329a(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = getString(C0126R.string.common_something_went_wrong);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getString(C0126R.string.tp_generic_error_content);
        }
        auar auar = new auar();
        auar.f91334b = str;
        auar.f91335c = str2;
        auar.f91336d = getString(C0126R.string.common_dismiss);
        auar.f91338f = C0126R.C0127drawable.quantum_ic_cloud_off_white_24;
        auar.f91333a = i;
        auar.f91340h = bpan.WEAR_NON_RETRYABLE_ERROR;
        auar.mo50344a().show(getSupportFragmentManager(), str3);
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        if (i2 == 4 || i2 == 3) {
            this.f108992d.mo24694a(this.f108996i, "/tapandpay/proxy", auai.m76649a(auaa.m76624a(i), this.f108995h));
            return;
        }
        m93328a(0, null, true);
        if (i2 != 1) {
            if (i2 == 2) {
                finish();
            }
        } else if (i == -1) {
            startActivity(asjg.m74217c(this));
        }
    }

    /* renamed from: a */
    public final void mo59505a(String str) {
        if (bmxx.m108577a(str)) {
            this.f108991c.setVisibility(8);
        } else {
            this.f108991c.setVisibility(0);
            this.f108991c.setText(str);
        }
        Runnable runnable = this.f108993f;
        if (runnable != null) {
            this.f108994g.removeCallbacks(runnable);
            this.f108993f = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* renamed from: a */
    public final void mo50326a(String str, Bundle bundle) {
        char c;
        String string;
        auau auau;
        auai.m76648a(bundle);
        int hashCode = str.hashCode();
        if (hashCode != 1344003943) {
            if (hashCode != 1919983458) {
                if (hashCode == 1952760968 && str.equals("messageRequest")) {
                    c = 0;
                    if (c != 0) {
                        mo59505a(bundle.getString("immediateMessage"));
                        if (bundle.containsKey("delayedMessage") && (string = bundle.getString("delayedMessage")) != null) {
                            Runnable runnable = this.f108993f;
                            if (runnable != null) {
                                this.f108994g.removeCallbacks(runnable);
                            }
                            atza atza = new atza(this, string);
                            this.f108993f = atza;
                            this.f108994g.postDelayed(atza, 3000);
                            return;
                        }
                        return;
                    } else if (c == 1) {
                        String string2 = bundle.getString("errorTitle");
                        String string3 = bundle.getString("errorText");
                        if (bundle.getBoolean("errorIsRetryable", false)) {
                            if (TextUtils.isEmpty(string2)) {
                                string2 = getString(C0126R.string.tp_network_connection_needed_title);
                            }
                            if (TextUtils.isEmpty(string3)) {
                                string3 = getString(C0126R.string.tp_network_connection_needed_content);
                            }
                            auar auar = new auar();
                            auar.f91333a = 4;
                            auar.f91334b = string2;
                            auar.f91335c = string3;
                            auar.f91336d = getString(C0126R.string.common_try_again);
                            auar.f91337e = getString(C0126R.string.common_cancel);
                            auar.f91340h = bpan.WEAR_PROXY_RETRY;
                            auar.f91341i = this.f108998k;
                            auar.mo50344a().show(getSupportFragmentManager(), "ErrorProxyDialog");
                            return;
                        }
                        m93329a(string2, string3, 3, "ErrorProxyDialog");
                        return;
                    } else if (c == 2 && (auau = (auau) getSupportFragmentManager().findFragmentByTag("ErrorProxyDialog")) != null) {
                        auau.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
            } else if (str.equals("errorDismiss")) {
                c = 2;
                if (c != 0) {
                }
            }
        } else if (str.equals("errorRequest")) {
            c = 1;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}

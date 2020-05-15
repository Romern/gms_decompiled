package com.google.android.gms.auth.login;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.EventLog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.p037ui.URLSpanNoUnderline;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShowErrorChimeraActivity extends jem implements View.OnClickListener, blv {

    /* renamed from: a */
    int f11024a = -1;

    /* renamed from: m */
    private String f11025m;

    /* renamed from: n */
    private String f11026n;

    /* renamed from: o */
    private boolean f11027o;

    /* renamed from: p */
    private boolean f11028p;

    /* renamed from: q */
    private boolean f11029q;

    /* renamed from: r */
    private izj f11030r;

    /* renamed from: s */
    private TextView f11031s;

    /* renamed from: t */
    private Button f11032t;

    /* renamed from: u */
    private TextView f11033u;

    /* renamed from: v */
    private SetupWizardNavBar f11034v;

    /* renamed from: a */
    public static Intent m6683a(String str, String str2, izj izj, boolean z, boolean z2, boolean z3) {
        return new Intent().setClassName(rpr.m34216b(), "com.google.android.gms.auth.login.ShowErrorActivity").putExtra("isCreatingAccount", z).putExtra("detail", str2).putExtra("accountName", str).putExtra("status", izj.f22000ac).putExtra("isAddingAccount", z2).putExtra("allowSkip", z3);
    }

    /* renamed from: i */
    private final void m6684i() {
        Intent intent;
        if (!this.f22281d) {
            try {
                svr.m36484b(this).mo26176b("com.google.android.apps.enterprise.dmagent", AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
                PackageManager packageManager = getPackageManager();
                if (packageManager.getApplicationEnabledSetting("com.google.android.apps.enterprise.dmagent") == 4) {
                    packageManager.setApplicationEnabledSetting("com.google.android.apps.enterprise.dmagent", 0, 1);
                }
                intent = Intent.makeMainActivity(new ComponentName("com.google.android.apps.enterprise.dmagent", "com.google.android.apps.enterprise.dmagent.DMAgentActivity"));
                if (packageManager.queryIntentActivities(intent, 0).isEmpty()) {
                    Log.w("GLSActivity", String.format("Couldn't find activity %s attempting to enable %s", "com.google.android.apps.enterprise.dmagent.DMAgentActivity", "com.google.android.apps.enterprise.dmagent"));
                    intent = sbv.m34879b("com.google.android.apps.enterprise.dmagent");
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GLSActivity", "Couldn't find package com.google.android.apps.enterprise.dmagent");
                intent = sbv.m34879b("com.google.android.apps.enterprise.dmagent");
            }
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e2) {
                Log.e("GLSActivity", "Market not found for dmagent");
            }
        }
        setResult(1);
        finish();
    }

    /* renamed from: a */
    public final void mo3251a() {
    }

    /* renamed from: b */
    public final void mo3253b() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1021) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        setResult(-1);
        finish();
    }

    public void onClick(View view) {
        izj izj = this.f11030r;
        this.f11030r = izj.SUCCESS;
        int ordinal = izj.ordinal();
        if (ordinal != 1) {
            if (ordinal != 5) {
                if (ordinal != 8) {
                    switch (ordinal) {
                    }
                } else if (this.f11028p && view == this.f11033u) {
                    setResult(1);
                    finish();
                    return;
                }
                if (view != this.f11033u) {
                    setResult(this.f11024a);
                } else {
                    setResult(0);
                }
                finish();
                return;
            }
            setResult(0);
            finish();
            return;
        }
        m6684i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02f7, code lost:
        if (r0 == 1) goto L_0x0328;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015b  */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (bundle == null) {
            mo7744a(getIntent().getExtras());
        } else {
            mo7744a(bundle);
        }
        setResult(0);
        int i2 = Build.VERSION.SDK_INT;
        bjbx bjbx = new bjbx(this);
        setContentView(bjbx);
        bjbx.mo64986a((int) C0126R.string.common_login_error_title, (int) C0126R.C0128layout.auth_submission_error_view_content);
        Button button = this.f11034v.f7192a;
        this.f11032t = button;
        button.setOnClickListener(this);
        if (!this.f11029q) {
            this.f11032t.setVisibility(4);
        }
        Button button2 = this.f11034v.f7193b;
        this.f11033u = button2;
        button2.setOnClickListener(this);
        this.f11033u.setVisibility(4);
        this.f11031s = (TextView) findViewById(C0126R.C0129id.explanation);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("title");
        if (stringExtra != null) {
            setTitle(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("label");
        if (stringExtra2 != null) {
            this.f11032t.setText(stringExtra2);
        }
        ilu a = ilu.m15675a(this.f11030r);
        izj izj = izj.CLIENT_LOGIN_DISABLED;
        int ordinal = this.f11030r.ordinal();
        if (ordinal != 1) {
            if (ordinal != 5) {
                if (ordinal == 8) {
                    setTitle(getString(C0126R.string.common_login_error_title));
                    this.f11033u.setVisibility(0);
                    this.f11032t.setText((int) C0126R.string.common_try_again);
                    if (this.f11028p) {
                        this.f11031s.setText(getString(C0126R.string.auth_error_login_failed));
                        this.f11033u.setText((int) C0126R.string.common_skip);
                    } else {
                        TextView textView = this.f11031s;
                        CharSequence text = getResources().getText(C0126R.string.auth_login_activity_loginfail_text_pwonly);
                        String format = String.format("https://www.google.com/accounts/recovery/?hl=%s", Locale.getDefault().getLanguage());
                        SpannableString spannableString = new SpannableString(text);
                        Annotation annotation = ((Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class))[0];
                        int spanStart = spannableString.getSpanStart(annotation);
                        int spanEnd = spannableString.getSpanEnd(annotation);
                        spannableString.removeSpan(annotation);
                        spannableString.setSpan(new URLSpanNoUnderline(format), spanStart, spanEnd, 0);
                        textView.setText(spannableString);
                        this.f11031s.setMovementMethod(LinkMovementMethod.getInstance());
                        this.f11033u.setText((int) C0126R.string.common_cancel);
                    }
                    this.f11024a = 5;
                    return;
                } else if (ordinal == 10) {
                    this.f11033u.setVisibility(0);
                    this.f11033u.setText((int) C0126R.string.common_back);
                    this.f11031s.setText((int) C0126R.string.auth_error_needs_browser);
                    this.f11024a = 6;
                    return;
                } else if (ordinal != 12) {
                    if (ordinal != 18) {
                        if (ordinal == 41) {
                            this.f11031s.setText(TextUtils.expandTemplate(getText(C0126R.string.auth_existing_account_error_text), this.f11025m).toString());
                            mo7745a((CharSequence) getText(C0126R.string.auth_existing_account_error_title).toString());
                            this.f11024a = 5;
                            return;
                        } else if (ordinal == 52) {
                            mo7745a((CharSequence) getString(C0126R.string.auth_server_error));
                            this.f11031s.setText((int) C0126R.string.auth_server_error_help);
                            return;
                        } else if (ordinal == 37) {
                            this.f11031s.setText(TextUtils.expandTemplate(getText(C0126R.string.auth_error_bad_password), this.f11025m).toString());
                            this.f11024a = 5;
                            return;
                        } else if (!(ordinal == 38 || ordinal == 45 || ordinal == 46)) {
                            switch (ordinal) {
                                case 14:
                                case 15:
                                case 16:
                                    break;
                                default:
                                    switch (ordinal) {
                                        case 27:
                                            this.f11032t.setText(getText(C0126R.string.common_ok).toString());
                                            this.f11031s.setText(TextUtils.expandTemplate(getText(C0126R.string.auth_gls_third_party_activity_download_message), this.f11025m).toString());
                                            return;
                                    }
                            }
                            i = a.f21317d;
                            if (i == 0) {
                                this.f11031s.setText(getText(i).toString());
                                return;
                            }
                            String str = this.f11026n;
                            if (str == null) {
                                this.f11031s.setText((int) C0126R.string.auth_server_error_help);
                                mo7745a((CharSequence) getString(C0126R.string.auth_server_error));
                                String valueOf = String.valueOf(this.f11030r.f22000ac);
                                Log.w("GLSActivity", valueOf.length() == 0 ? new String("GAIA ERROR WITH NO RESOURCE STRING ") : "GAIA ERROR WITH NO RESOURCE STRING ".concat(valueOf));
                                return;
                            }
                            this.f11031s.setText(str);
                            return;
                        }
                    }
                    this.f11024a = 1;
                    i = a.f21317d;
                    if (i == 0) {
                    }
                } else {
                    this.f11033u.setVisibility(0);
                    this.f11033u.setText((int) C0126R.string.common_back);
                    this.f11024a = 6;
                    String str2 = this.f11026n;
                    if (str2 != null) {
                        this.f11031s.setText(str2);
                        this.f11033u.setVisibility(0);
                        this.f11033u.setText((int) C0126R.string.common_back);
                        return;
                    }
                    finish();
                    return;
                }
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
            int i3 = C0126R.string.auth_no_network_help_wifi_only;
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                EventLog.writeEvent(205006, (String) null);
                TextView textView2 = this.f11031s;
                if (!ilp.m15664a()) {
                    i3 = C0126R.string.auth_no_network_help;
                }
                textView2.setText(getString(i3));
                mo7745a((CharSequence) getString(C0126R.string.auth_no_network));
            } else if (this.f11030r == izj.NETWORK_ERROR) {
                EventLog.writeEvent(205004, (String) null);
                TextView textView3 = this.f11031s;
                if (!ilp.m15664a()) {
                    i3 = C0126R.string.auth_network_unreliable_help;
                }
                textView3.setText(getString(i3));
                mo7745a((CharSequence) getString(C0126R.string.plus_network_unreliable));
            } else {
                this.f11031s.setText((int) C0126R.string.auth_server_error_help);
                mo7745a((CharSequence) getString(C0126R.string.auth_server_error));
            }
            if (!this.f22281d || this.f11034v == null) {
                this.f11024a = 0;
                return;
            }
            this.f11033u.setVisibility(0);
            this.f11024a = 1;
            return;
        }
        if (!this.f22281d) {
            try {
                getPackageManager().getPackageInfo("com.google.android.apps.enterprise.dmagent", 1);
                try {
                    int applicationEnabledSetting = getPackageManager().getApplicationEnabledSetting("com.google.android.apps.enterprise.dmagent");
                    if (applicationEnabledSetting != 0) {
                    }
                } catch (IllegalArgumentException e) {
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        m6684i();
        return;
        this.f11032t.setText(getText(C0126R.string.common_download).toString());
        this.f11031s.setText(TextUtils.expandTemplate(getText(C0126R.string.auth_gls_dmagent_activity_download_message), this.f11025m).toString());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("accountName", this.f11025m);
        bundle.putBoolean("isCreatingAccount", this.f11027o);
        bundle.putBoolean("isAddingAccount", this.f11028p);
        bundle.putBoolean("allowSkip", this.f11029q);
        bundle.putString("detail", this.f11026n);
        bundle.putString("status", this.f11030r.f22000ac);
    }

    public final void setTitle(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        ((TextView) findViewById(C0126R.C0129id.title)).setText(charSequence);
    }

    /* renamed from: a */
    public final void mo7744a(Bundle bundle) {
        this.f11025m = bundle.getString("accountName");
        this.f11027o = bundle.getBoolean("isCreatingAccount");
        this.f11028p = bundle.getBoolean("isAddingAccount");
        this.f11029q = bundle.getBoolean("allowSkip");
        this.f11026n = bundle.getString("detail");
        this.f11030r = ilu.m15677a(bundle.getString("status"));
    }

    /* renamed from: a */
    public final void mo3252a(SetupWizardNavBar setupWizardNavBar) {
        this.f11034v = setupWizardNavBar;
        boolean z = this.f22282e;
        setupWizardNavBar.mo4069a(z, z);
    }

    /* renamed from: a */
    public final void mo7745a(CharSequence charSequence) {
        if (charSequence != null) {
            TextView textView = (TextView) findViewById(C0126R.C0129id.submission_title);
            if (charSequence.equals(getString(C0126R.string.auth_submission_title))) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }
}

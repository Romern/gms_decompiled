package com.google.android.gms.auth.login;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoginChimeraActivity extends jem {

    /* renamed from: a */
    private jes f11017a;

    /* renamed from: m */
    private String f11018m;

    /* renamed from: n */
    private String f11019n;

    /* renamed from: o */
    private String f11020o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public jet f11021p;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7741b() {
        String d = this.f11017a.mo13680d();
        String a = this.f11017a.mo13672a();
        String str = this.f11020o;
        boolean z = this.f11017a.mo13686j() == 0;
        this.f11017a.mo13687k();
        startActivityForResult(BrowserChimeraActivity.m6653a(d, a, str, z, this.f11017a.f22302a.getStringArrayList("allowed_domains"), this.f11017a.f22302a.getString("purchaser_email"), this.f11017a.f22302a.getString("purchaser_name")), 1004);
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
    public final void onActivityResult(int i, int i2, Intent intent) {
        CaptchaSolution captchaSolution;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i4 == 1) {
            setResult(1);
            finish();
            return;
        }
        boolean z2 = false;
        if (i4 != 0) {
            Account account = null;
            if (i3 != 1001) {
                if (i3 != 1002) {
                    if (i3 != 1004) {
                        if (i3 != 1009) {
                            if (i3 == 1033) {
                                mo7738a();
                                return;
                            } else if (i3 != 1026) {
                                if (i3 != 1027) {
                                    super.onActivityResult(i, i2, intent);
                                    return;
                                } else {
                                    mo7742b(intent2);
                                    return;
                                }
                            } else if (i4 != 6) {
                                jfm jfm = new jfm(intent2.getStringExtra("account_name"), intent2.getStringExtra("password"));
                                this.f11017a.mo13676a(jfm.f22378a);
                                this.f11019n = jfm.f22379b;
                            } else {
                                mo7741b();
                                return;
                            }
                        } else if (i4 == 6) {
                            mo7741b();
                            return;
                        } else if (i4 == 5) {
                            mo7738a();
                            return;
                        } else if (i4 != -1) {
                            setResult(i4);
                            finish();
                            return;
                        } else {
                            mo7741b();
                            return;
                        }
                    }
                    if (i4 == 11) {
                        setResult(11);
                        finish();
                    }
                    if (i4 == -1) {
                        jen a = jen.m16608a(intent);
                        this.f11020o = a.mo13663b();
                        if (a.mo13662a() != null) {
                            this.f11017a.mo13676a(a.mo13662a());
                        }
                        this.f11017a.f22302a.putBoolean("is_terms_of_services_newly_accepted", a.f22297a.getBoolean("is_terms_of_services_newly_accepted"));
                        this.f11017a.f22302a.putBoolean("is_new_account", a.f22297a.getBoolean("is_new_account", false));
                    }
                } else {
                    TokenResponse a2 = jfh.m16644a(intent);
                    boolean z3 = a2.mo7647b() == izj.DEVICE_MANAGEMENT_REQUIRED || a2.mo7647b() == izj.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED;
                    if (izj.SUCCESS != a2.mo7647b() && (!z3 || this.f11017a.mo13686j() != 0)) {
                        String str = a2.f10728e;
                        if (str != null) {
                            this.f11017a.mo13678b(str);
                        }
                        if (a2.mo7647b() == izj.BAD_AUTHENTICATION) {
                            mo7740a(a2.f10729f, a2.mo7647b());
                            return;
                        }
                        izj b = a2.mo7647b();
                        String str2 = this.f22279b;
                        String str3 = b.f22000ac;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
                        sb.append(str2);
                        sb.append(" #handleTokenResponse - status: ");
                        sb.append(str3);
                        sb.toString();
                        int ordinal = b.ordinal();
                        if (ordinal == 3 || ordinal == 8) {
                            mo7738a();
                            return;
                        }
                        if (ordinal == 17) {
                            CaptchaChallenge captchaChallenge = a2.f10737n;
                            if (captchaChallenge != null) {
                                this.f11018m = captchaChallenge.f10850c;
                                startActivityForResult(new Intent().setClassName(rpr.m34216b(), "com.google.android.gms.auth.login.CaptchaActivity").putExtra("bitmap", captchaChallenge.f10851d), 1001);
                                return;
                            }
                        } else if (ordinal == 20) {
                            startActivityForResult(GrantCredentialsWithAclChimeraActivity.m7052a(this.f11017a.mo13677b().f10841e, this.f11017a.mo13677b().f10838b, this.f11017a.mo13682f(), this.f11017a.mo13680d(), ilt.m15674a(a2.mo7648c()), a2.f10741r, a2.f10742s, a2.f10748y, false, null), 1027);
                            return;
                        }
                        mo7740a(a2.f10729f, b);
                        return;
                    }
                    Account account2 = a2.f10744u;
                    jes jes = this.f11017a;
                    String d = jes.mo13680d();
                    String e = jes.mo13681e();
                    if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(e)) {
                        account = new Account(d, e);
                    }
                    if (account2 == null) {
                        account2 = account;
                    } else {
                        this.f11017a.mo13673a(account2);
                    }
                    if (this.f11017a.f22302a.getBoolean("is_terms_of_services_newly_accepted")) {
                        Intent intent3 = new Intent("com.android.vending.TOS_ACKED");
                        intent3.setPackage("com.android.vending");
                        intent3.putExtra("TosAckedReceiver.account", account2.name);
                        intent3.putExtra("TosAckedReceiver.account_type", account2.type);
                        intent3.addFlags(268435456);
                        sendBroadcast(intent3, "com.android.vending.TOS_ACKED");
                        Intent intent4 = new Intent("com.android.chrome.TOS_ACKED");
                        intent4.setPackage("com.android.chrome");
                        intent4.putExtra("TosAckedReceiver.account", account2.name);
                        intent4.putExtra("TosAckedReceiver.account_type", account2.type);
                        sendBroadcast(intent4, "com.android.chrome.TOS_ACKED");
                    }
                    izj izj = izj.SUCCESS;
                    String str4 = a2.f10727d;
                    boolean i5 = this.f11017a.mo13685i();
                    boolean z4 = this.f11017a.f22302a.getBoolean("is_new_account", false);
                    Intent intent5 = new Intent();
                    if (str4 != null || izj == izj.SUCCESS) {
                        z2 = true;
                    }
                    sdo.m34974b(z2);
                    ilu.m15675a(izj).mo13126b(intent5);
                    if (str4 != null) {
                        intent5.putExtra("authtoken", str4);
                    }
                    if (i5) {
                        intent5.putExtra("booleanResult", true);
                    }
                    intent5.putExtra("authAccount", account2.name);
                    intent5.putExtra("accountType", account2.type);
                    intent5.putExtra("is_new_account", z4);
                    jfn.m16647a(intent.getExtras(), intent5);
                    setResult(-1, intent5);
                    finish();
                    return;
                }
            }
            if (i4 == -1) {
                String stringExtra = intent2.getStringExtra("answer");
                String str5 = this.f11018m;
                if (str5 == null) {
                    captchaSolution = null;
                } else {
                    captchaSolution = stringExtra != null ? new CaptchaSolution(str5, stringExtra) : null;
                }
                if (i3 != 1004) {
                    z = false;
                }
                mo7739a(captchaSolution, null, z);
                return;
            }
            setResult(1);
            finish();
        } else if (this.f11017a.mo13686j() != 0) {
            setResult(0, mo7737a(intent2));
            finish();
        } else if ((i3 == 1001 || i3 == 1002 || i3 == 1004) && !this.f11017a.f22302a.getBoolean("is_browser_only") && !this.f11017a.mo13687k()) {
            mo7738a();
        } else {
            setResult(0, mo7737a(intent2));
            finish();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(android.content.ContentResolver, java.lang.String, long):long
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
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
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0174  */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super.onCreate(bundle);
        getWindow().clearFlags(2);
        if (isFinishing()) {
            String.valueOf(this.f22279b).concat(" #onCreate - isFinishing");
        } else if (bundle != null) {
            jes jes = new jes(bundle);
            this.f11017a = jes;
            if (jes.mo13684h() != null && this.f11017a.mo13679c()) {
                mo7742b(this.f11017a.mo13684h());
            }
        } else {
            Intent intent = getIntent();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                jes jes2 = new jes(extras);
                this.f11017a = jes2;
                boolean z5 = false;
                if (jes2.mo13686j() != 1) {
                    izj a = ilu.m15676a(intent);
                    if (a == null) {
                        a = izj.SUCCESS;
                    }
                    int ordinal = a.ordinal();
                    if (ordinal == 3) {
                        int i = Build.VERSION.SDK_INT;
                        if (!cbyb.f178547a.mo6606a().mo75603a()) {
                            try {
                                PackageManager packageManager = getPackageManager();
                                ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.google.android.backuptransport", 0);
                                ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.backup.BackupEnabler"), 0);
                                if (applicationInfo != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (resolveService != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                StringBuilder sb = new StringBuilder(44);
                                sb.append("backupPackageExists() info: ");
                                sb.append(z3);
                                sb.append(", bi: ");
                                sb.append(z4);
                                Log.i("GLSActivity", sb.toString());
                                if (applicationInfo == null) {
                                    z = false;
                                } else if (resolveService == null) {
                                    z = false;
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                Log.w("GLSActivity", "Could not find Backup package: com.google.android.backuptransport");
                                z = false;
                            }
                            z2 = this.f11017a.f22302a.getBoolean("is_setup_wizard", false) ? false : z;
                            Intent className = new Intent().setClassName("com.google.android.setupwizard", "com.google.android.setupwizard.GoogleServicesActivity");
                            String[] stringArray = getResources().getStringArray(C0126R.array.auth_google_play_email_opt_in);
                            String a2 = ryv.m34681a(this, "device_country", null);
                            if (aymn.m84264a(getContentResolver(), "google_setup:play_email_opt_in") == null) {
                                z5 = aymn.m84269a(getContentResolver(), "google_setup:play_email_opt_in", true);
                            } else if (a2 == null || a2.equals("") || stringArray == null) {
                                String arrays = Arrays.toString(stringArray);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 74 + String.valueOf(arrays).length());
                                sb2.append("Problem looking up Google Play email default; countryCode=");
                                sb2.append(a2);
                                sb2.append(" optInCountries=");
                                sb2.append(arrays);
                                Log.e("GLSActivity", sb2.toString());
                            } else if (!Arrays.asList(stringArray).contains(a2)) {
                                z5 = true;
                            }
                            className.putExtra("agreePlayEmail", z5);
                            if (z2) {
                                className.putExtra("agreeBackup", true);
                            }
                            if (z) {
                                className.putExtra("agreeRestore", true);
                            }
                            startActivityForResult(className, 1041);
                        }
                        z = true;
                        if (this.f11017a.f22302a.getBoolean("is_setup_wizard", false)) {
                        }
                        Intent className2 = new Intent().setClassName("com.google.android.setupwizard", "com.google.android.setupwizard.GoogleServicesActivity");
                        String[] stringArray2 = getResources().getStringArray(C0126R.array.auth_google_play_email_opt_in);
                        String a22 = ryv.m34681a(this, "device_country", null);
                        if (aymn.m84264a(getContentResolver(), "google_setup:play_email_opt_in") == null) {
                        }
                        className2.putExtra("agreePlayEmail", z5);
                        if (z2) {
                        }
                        if (z) {
                        }
                        startActivityForResult(className2, 1041);
                    } else if (ordinal != 8) {
                        mo7740a((String) null, a);
                    } else {
                        mo7738a();
                    }
                } else {
                    mo7739a(null, null, false);
                }
            } else {
                throw new IllegalArgumentException("LoginActivity requires extra data");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        jet jet = this.f11021p;
        if (jet != null) {
            jet.cancel(true);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putAll(new Bundle(this.f11017a.f22302a));
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
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Intent mo7737a(Intent intent) {
        Intent intent2 = new Intent();
        if (intent != null) {
            izj a = ilu.m15676a(intent);
            ilu.m15675a(a).mo13126b(intent2);
            String stringExtra = intent.getStringExtra("authtoken");
            if (stringExtra != null) {
                intent2.putExtra("authtoken", stringExtra);
            }
            if (a != izj.SUCCESS && this.f11017a.mo13685i()) {
                intent2.putExtra("booleanResult", false);
            }
        }
        return intent2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7738a() {
        boolean z = true;
        if (this.f11017a.mo13672a() != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.f11017a.mo13686j() != 1) {
                mo7741b();
                return;
            }
        }
        jfl jfl = new jfl(this);
        jfl.f22377a.putExtra("account_name", this.f11017a.mo13680d());
        jfl.f22377a.putExtra("is_confirming_credentials", this.f11017a.mo13685i());
        if (this.f11017a.mo13686j() != 0) {
            z = false;
        }
        jfl.f22377a.putExtra("is_adding_account", z);
        startActivityForResult(new Intent(jfl.f22377a), 1026);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7742b(Intent intent) {
        PACLConfig pACLConfig;
        String str;
        this.f11017a.f22302a.putParcelable("grant_credential_response_status", intent);
        ConsentResult consentResult = (ConsentResult) intent.getParcelableExtra(ConsentResult.f10615a);
        izj a = consentResult.mo7619a();
        if (a == izj.SUCCESS) {
            this.f11017a.mo13674a(consentResult.f10619e);
            PACLConfig g = this.f11017a.mo13683g();
            String str2 = consentResult.f10618d;
            if (str2 == null) {
                pACLConfig = null;
            } else {
                if (g != null) {
                    str = g.f10878b;
                } else {
                    str = null;
                }
                pACLConfig = new PACLConfig(str, str2);
            }
            this.f11017a.mo13675a(pACLConfig);
            mo7739a(null, consentResult, false);
            return;
        }
        Intent putExtra = new Intent().putExtra("errorCode", 4).putExtra("errorMessage", a.f22000ac);
        ilu.m15675a(a).mo13126b(putExtra);
        setResult(0, mo7737a(putExtra));
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7739a(CaptchaSolution captchaSolution, ConsentResult consentResult, boolean z) {
        boolean z2;
        sdo.m34966a(this.f11017a.mo13677b(), "Calling app cannot be null!");
        TokenRequest tokenRequest = new TokenRequest(this.f11017a.mo13680d(), this.f11017a.mo13681e(), this.f11017a.mo13682f());
        tokenRequest.f10709e = (FACLConfig) this.f11017a.f22302a.getParcelable("facl");
        tokenRequest.f10710f = this.f11017a.mo13683g();
        tokenRequest.mo7638a(this.f11017a.f22302a.getBundle("options"));
        tokenRequest.f10712h = false;
        if (this.f11017a.mo13686j() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tokenRequest.f10711g = z2;
        tokenRequest.f10714j = this.f11017a.mo13677b();
        tokenRequest.f10715k = captchaSolution;
        if (consentResult != null) {
            if (consentResult.mo7620b() != null) {
                tokenRequest.mo7639a(consentResult.mo7620b());
            }
            tokenRequest.f10721q = consentResult.f10621g;
        }
        if (this.f11017a.mo13679c()) {
            jet jet = this.f11021p;
            if (jet != null) {
                jet.cancel(true);
            }
            jet jet2 = new jet(this, tokenRequest, this.f11019n, this.f11020o, z, this.f11017a.mo13685i());
            this.f11021p = jet2;
            jet2.execute(new Object[0]);
            return;
        }
        new Object[1][0] = tokenRequest.f10707c;
        startActivityForResult(LoginActivityChimeraTask.m6667a(this, tokenRequest, this.f11019n, this.f11020o, z, this.f11017a.mo13685i(), this.f11017a.f22302a.getString("title"), this.f11017a.f22302a.getBoolean("allow_credit_card")), 1002);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7740a(String str, izj izj) {
        boolean z;
        String d = this.f11017a.mo13680d();
        if (this.f11017a.mo13686j() == 0) {
            z = true;
        } else {
            z = false;
        }
        startActivityForResult(ShowErrorChimeraActivity.m6683a(d, str, izj, false, z, true), 1009);
    }
}

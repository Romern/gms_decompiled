package p000;

import android.app.UiModeManager;
import android.app.admin.DevicePolicyManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.net.http.SslError;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.UserManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.auth.login.CustomWebView;
import com.google.android.gms.auth.login.MinuteMaidAuthSmsReceiver;
import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kaa extends jwx implements LoaderManager.LoaderCallbacks, kab, imh {

    /* renamed from: d */
    public static final sek f23599d = ght.m13171a("MinuteMaid", "MinuteMaidFragment");

    /* renamed from: e */
    public static final imr f23600e = imr.m15727a("account_name");

    /* renamed from: f */
    public static final imr f23601f = imr.m15727a("account_type");

    /* renamed from: g */
    public static final imr f23602g = imr.m15727a("is_reauth");

    /* renamed from: h */
    public static final imr f23603h = imr.m15727a("is_setup_wizard");

    /* renamed from: i */
    public static final imr f23604i = imr.m15727a("theme");

    /* renamed from: j */
    public static final imr f23605j = imr.m15727a("use_clamshell_endpoint");

    /* renamed from: k */
    public static final imr f23606k = imr.m15727a("use_immersive_mode");

    /* renamed from: l */
    public static final imr f23607l = imr.m15727a("allowed_domains");

    /* renamed from: m */
    public static final imr f23608m = imr.m15727a("purchaser_gaia_email");

    /* renamed from: n */
    public static final imr f23609n = imr.m15727a("purchaser_name");

    /* renamed from: o */
    public static final imr f23610o = imr.m15727a("package_name");

    /* renamed from: p */
    public static final imr f23611p = imr.m15727a("login_template");

    /* renamed from: q */
    public static final imr f23612q = imr.m15727a("is_add_account_flow");

    /* renamed from: r */
    public static final imr f23613r = imr.m15727a("google_signin_url");

    /* renamed from: A */
    public volatile boolean f23614A;

    /* renamed from: B */
    public volatile boolean f23615B;

    /* renamed from: C */
    public volatile yai f23616C;

    /* renamed from: D */
    public jzz f23617D;

    /* renamed from: E */
    public xnw f23618E;

    /* renamed from: F */
    public BrowserSignRequestParams f23619F;

    /* renamed from: G */
    public xxk f23620G;

    /* renamed from: H */
    public boolean f23621H;

    /* renamed from: I */
    public xwz f23622I;

    /* renamed from: J */
    public GlifMinuteMaidLayout f23623J;

    /* renamed from: K */
    private imy f23624K;

    /* renamed from: L */
    private boolean f23625L;

    /* renamed from: M */
    private MinuteMaidAuthSmsReceiver f23626M;

    /* renamed from: N */
    private kac f23627N;

    /* renamed from: O */
    private volatile boolean f23628O;

    /* renamed from: P */
    private final gkf f23629P = gkf.f18388a;

    /* renamed from: Q */
    private boolean f23630Q;

    /* renamed from: s */
    public Handler f23631s;

    /* renamed from: t */
    public jzx f23632t;

    /* renamed from: u */
    public InputMethodManager f23633u;

    /* renamed from: v */
    public CustomWebView f23634v;

    /* renamed from: w */
    public String f23635w;

    /* renamed from: x */
    public jyp f23636x;

    /* renamed from: y */
    public volatile String f23637y;

    /* renamed from: z */
    public volatile String f23638z;

    /* renamed from: e */
    private final void m17551e() {
        xwz xwz = this.f23622I;
        if (xwz != null) {
            xwz.mo30206a(StateUpdate.f31874d).mo50372a(jzb.f23560a);
        }
    }

    /* renamed from: g */
    private final void m17552g(String str) {
        Uri parse;
        this.f23635w = str;
        boolean b = this.f23624K.mo13153b(str);
        if (b != this.f23628O) {
            if (b) {
                this.f23634v.addJavascriptInterface(this.f23627N, "mm");
            } else {
                this.f23634v.removeJavascriptInterface("mm");
            }
            this.f23628O = b;
        }
        if (!b || (parse = Uri.parse(str)) == null || parse.getPath() == null || !parse.getPath().startsWith("/embedded")) {
            this.f23632t.mo7908a(false);
        } else {
            this.f23632t.mo7908a(true);
        }
    }

    /* renamed from: a */
    public final void mo13138a() {
        f23599d.mo25412b("onNativePrimaryActionHit", new Object[0]);
        mo14280f("window.nativePrimaryActionHit()");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo14200c(String str) {
        this.f23632t.mo7906a(null, str);
    }

    /* renamed from: d */
    public final void mo14278d() {
        xnw xnw = this.f23618E;
        if (xnw != null) {
            xnw.mo29958a(com.google.android.gms.fido.fido2.api.StateUpdate.f31693d);
            this.f23618E = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo14280f(String str) {
        CustomWebView customWebView = this.f23425c;
        if (customWebView != null) {
            this.f23631s.post(new jzl(str, customWebView));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f23632t = (jzx) activity;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super.onCreate(bundle);
        boolean z5 = true;
        if (!rrp.m34306a((String) mo14207b().mo13146a(f23604i)) || getActivity().getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            sre.m36087g(getActivity());
            z = true;
        } else {
            z = false;
        }
        this.f23630Q = z;
        if (!cbzw.f178611a.mo6606a().mo75650a() || this.f23630Q) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f23621H = z2;
        sek sek = f23599d;
        boolean z6 = this.f23630Q;
        StringBuilder sb = new StringBuilder(65);
        sb.append("shouldDrawStatusBarInWebview: ");
        sb.append(z6);
        sb.append(" useNativeNavigationBar: ");
        sb.append(z2);
        sek.mo25412b(sb.toString(), new Object[0]);
        this.f23631s = new adzt();
        this.f23633u = (InputMethodManager) getActivity().getSystemService("input_method");
        this.f23624K = imy.m15745a(gnv.m13526aH());
        UiModeManager uiModeManager = (UiModeManager) getActivity().getSystemService("uimode");
        if (svr.m36484b(getActivity()).mo26169a("android.permission.READ_PHONE_STATE") == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (svr.m36484b(getActivity()).mo26169a("android.permission.RECEIVE_SMS") == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z3 || !z4) {
            f23599d.mo25414c("READ_PHONE_STATE: %s RECEIVE_SMS: %s", Boolean.valueOf(z3), Boolean.valueOf(z4));
            z5 = false;
        } else if (((UserManager) getActivity().getSystemService("user")).hasUserRestriction("no_sms")) {
            f23599d.mo25414c("SMS disallowed for this user", new Object[0]);
            z5 = false;
        }
        this.f23625L = z5;
        Activity activity = getActivity();
        this.f23627N = new kac(this, activity, adyd.m51363a(activity), (TelephonyManager) activity.getSystemService("phone"), (String) mo14207b().mo13146a(f23601f), this.f23625L, soz.m35811h(activity));
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new jzn(this, getActivity());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f23630Q) {
            return onCreateView;
        }
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate((int) C0126R.C0128layout.auth_minutemaid_container_with_status_bar, viewGroup, false);
        viewGroup2.addView(onCreateView);
        this.f23623J = (GlifMinuteMaidLayout) viewGroup2;
        return viewGroup2;
    }

    public final void onDestroy() {
        jzz jzz = this.f23617D;
        if (jzz != null) {
            jzz.cancel(true);
        }
        if (this.f23626M != null) {
            getActivity().unregisterReceiver(this.f23626M);
            this.f23626M = null;
        }
        m17551e();
        super.onDestroy();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x026f  */
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        String str;
        String str2;
        boolean z;
        String str3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean valueOf;
        boolean booleanValue;
        boolean z6;
        String str4;
        String str5;
        String str6;
        boolean z7;
        boolean z8;
        int a;
        Uri.Builder buildUpon;
        String languageTag;
        kaa kaa;
        ComponentName profileOwner;
        Pair pair = (Pair) obj;
        TelephonyManager telephonyManager = (TelephonyManager) getActivity().getSystemService("phone");
        if (telephonyManager == null) {
            str2 = null;
            str = null;
        } else if (this.f23625L) {
            str = telephonyManager.getLine1Number();
            str2 = telephonyManager.getSubscriberId();
        } else {
            str2 = null;
            str = null;
        }
        Activity activity = getActivity();
        String a2 = ryv.m34681a(activity, "device_country", null);
        Configuration configuration = new Configuration();
        Settings.System.getConfiguration(activity.getContentResolver(), configuration);
        int i = configuration.mcc;
        boolean booleanValue2 = ((Boolean) pair.first).booleanValue();
        boolean booleanValue3 = ((Boolean) pair.second).booleanValue();
        if (cbxs.f178526a.mo6606a().mo75585a()) {
            z = BluetoothAdapter.getDefaultAdapter() != null ? true : NfcAdapter.getDefaultAdapter(getActivity().getApplicationContext()) != null || getActivity().getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.usb.host");
        } else {
            z = (BluetoothAdapter.getDefaultAdapter() == null && NfcAdapter.getDefaultAdapter(getActivity().getApplicationContext()) == null) ? false : true;
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) activity.getSystemService("device_policy");
        int i2 = Build.VERSION.SDK_INT;
        if (devicePolicyManager == null || (profileOwner = devicePolicyManager.getProfileOwner()) == null || !rfz.m33557a(activity).mo24610b(profileOwner.getPackageName())) {
            str3 = null;
        } else {
            str3 = profileOwner.flattenToString();
        }
        String str7 = (String) mo14207b().mo13147a(f23613r, null);
        if (!TextUtils.isEmpty(str7)) {
            String str8 = (String) mo14207b().mo13146a(f23600e);
            String[] strArr = (String[]) mo14207b().mo13146a(f23607l);
            String S = gnv.m13509S();
            String U = gnv.m13511U();
            String str9 = str3;
            int i3 = i;
            String str10 = (String) mo14207b().mo13147a(f23608m, null);
            String str11 = a2;
            String str12 = (String) mo14207b().mo13147a(f23609n, null);
            try {
                PackageManager packageManager = getActivity().getPackageManager();
                z3 = z;
                try {
                    if (!packageManager.getApplicationInfo("com.google.android.androidforwork", 0).enabled) {
                        z2 = booleanValue2;
                        try {
                            f23599d.mo25416d("com.google.android.androidforwork is DISABLED on the system.", new Object[0]);
                            z5 = false;
                            z4 = false;
                        } catch (PackageManager.NameNotFoundException e) {
                            z4 = false;
                            f23599d.mo25416d("com.google.android.androidforwork is not installed on system.", new Object[0]);
                            z5 = false;
                            ims b = mo14207b();
                            imr imr = f23603h;
                            boolean z9 = z5;
                            valueOf = Boolean.valueOf(z4);
                            boolean booleanValue4 = ((Boolean) b.mo13147a(imr, valueOf)).booleanValue();
                            booleanValue = ((Boolean) mo14207b().mo13147a(f23606k, valueOf)).booleanValue();
                            z6 = booleanValue4;
                            str4 = (String) mo14207b().mo13147a(f23610o, null);
                            str5 = U;
                            str6 = (String) mo14207b().mo13147a(f23611p, null);
                            if (((Boolean) mo14207b().mo13147a(f23612q, valueOf)).booleanValue()) {
                            }
                            z7 = false;
                            z8 = this.f23630Q;
                            if (!this.f23621H) {
                            }
                            a = bjax.m103131a(activity);
                            buildUpon = Uri.parse(str7).buildUpon();
                            if (str4 != null) {
                            }
                            if (str6 != null) {
                            }
                            buildUpon.appendQueryParameter("xoauth_display_name", "Android Phone");
                            if (str8 != null) {
                            }
                            buildUpon.appendQueryParameter("domains", TextUtils.join(",", strArr));
                            if (!TextUtils.isEmpty(str10)) {
                            }
                            if (!TextUtils.isEmpty(str12)) {
                            }
                            if (!TextUtils.isEmpty(str)) {
                            }
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            if (!TextUtils.isEmpty(S)) {
                            }
                            if (!TextUtils.isEmpty(str5)) {
                            }
                            if (z2) {
                            }
                            if (booleanValue3) {
                            }
                            if (z3) {
                            }
                            if (z6) {
                            }
                            if (booleanValue) {
                            }
                            Locale locale = Locale.getDefault();
                            languageTag = locale.toLanguageTag();
                            buildUpon.appendQueryParameter("lang", locale.getLanguage());
                            String language = locale.getLanguage();
                            String lowerCase = locale.getCountry().toLowerCase(Locale.US);
                            StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(lowerCase).length());
                            sb.append(language);
                            sb.append("_");
                            sb.append(lowerCase);
                            buildUpon.appendQueryParameter("langCountry", sb.toString());
                            if (!languageTag.isEmpty()) {
                            }
                            buildUpon.appendQueryParameter("cc", str11);
                            if (i3 != 0) {
                            }
                            if (z7) {
                            }
                            if (!z8) {
                            }
                            if (!TextUtils.isEmpty(str9)) {
                            }
                            buildUpon.appendQueryParameter("use_native_navigation", r7);
                            if (a == 8388611) {
                            }
                            String uri = buildUpon.build().toString();
                            if (gnv.m13512V()) {
                            }
                            kaa.mo14197a(uri);
                            return;
                        }
                    } else {
                        z2 = booleanValue2;
                        if (!packageManager.hasSystemFeature("android.software.device_admin")) {
                            f23599d.mo25416d("Device does not support Admin Feature needed by com.google.android.androidforwork", new Object[0]);
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        z4 = false;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    z2 = booleanValue2;
                    z4 = false;
                    f23599d.mo25416d("com.google.android.androidforwork is not installed on system.", new Object[0]);
                    z5 = false;
                    ims b2 = mo14207b();
                    imr imr2 = f23603h;
                    boolean z92 = z5;
                    valueOf = Boolean.valueOf(z4);
                    boolean booleanValue42 = ((Boolean) b2.mo13147a(imr2, valueOf)).booleanValue();
                    booleanValue = ((Boolean) mo14207b().mo13147a(f23606k, valueOf)).booleanValue();
                    z6 = booleanValue42;
                    str4 = (String) mo14207b().mo13147a(f23610o, null);
                    str5 = U;
                    str6 = (String) mo14207b().mo13147a(f23611p, null);
                    if (((Boolean) mo14207b().mo13147a(f23612q, valueOf)).booleanValue()) {
                    }
                    z7 = false;
                    z8 = this.f23630Q;
                    if (!this.f23621H) {
                    }
                    a = bjax.m103131a(activity);
                    buildUpon = Uri.parse(str7).buildUpon();
                    if (str4 != null) {
                    }
                    if (str6 != null) {
                    }
                    buildUpon.appendQueryParameter("xoauth_display_name", "Android Phone");
                    if (str8 != null) {
                    }
                    buildUpon.appendQueryParameter("domains", TextUtils.join(",", strArr));
                    if (!TextUtils.isEmpty(str10)) {
                    }
                    if (!TextUtils.isEmpty(str12)) {
                    }
                    if (!TextUtils.isEmpty(str)) {
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    if (!TextUtils.isEmpty(S)) {
                    }
                    if (!TextUtils.isEmpty(str5)) {
                    }
                    if (z2) {
                    }
                    if (booleanValue3) {
                    }
                    if (z3) {
                    }
                    if (z6) {
                    }
                    if (booleanValue) {
                    }
                    Locale locale2 = Locale.getDefault();
                    languageTag = locale2.toLanguageTag();
                    buildUpon.appendQueryParameter("lang", locale2.getLanguage());
                    String language2 = locale2.getLanguage();
                    String lowerCase2 = locale2.getCountry().toLowerCase(Locale.US);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(language2).length() + 1 + String.valueOf(lowerCase2).length());
                    sb2.append(language2);
                    sb2.append("_");
                    sb2.append(lowerCase2);
                    buildUpon.appendQueryParameter("langCountry", sb2.toString());
                    if (!languageTag.isEmpty()) {
                    }
                    buildUpon.appendQueryParameter("cc", str11);
                    if (i3 != 0) {
                    }
                    if (z7) {
                    }
                    if (!z8) {
                    }
                    if (!TextUtils.isEmpty(str9)) {
                    }
                    buildUpon.appendQueryParameter("use_native_navigation", r7);
                    if (a == 8388611) {
                    }
                    String uri2 = buildUpon.build().toString();
                    if (gnv.m13512V()) {
                    }
                    kaa.mo14197a(uri2);
                    return;
                }
            } catch (PackageManager.NameNotFoundException e3) {
                z2 = booleanValue2;
                z3 = z;
                z4 = false;
                f23599d.mo25416d("com.google.android.androidforwork is not installed on system.", new Object[0]);
                z5 = false;
                ims b22 = mo14207b();
                imr imr22 = f23603h;
                boolean z922 = z5;
                valueOf = Boolean.valueOf(z4);
                boolean booleanValue422 = ((Boolean) b22.mo13147a(imr22, valueOf)).booleanValue();
                booleanValue = ((Boolean) mo14207b().mo13147a(f23606k, valueOf)).booleanValue();
                z6 = booleanValue422;
                str4 = (String) mo14207b().mo13147a(f23610o, null);
                str5 = U;
                str6 = (String) mo14207b().mo13147a(f23611p, null);
                if (((Boolean) mo14207b().mo13147a(f23612q, valueOf)).booleanValue()) {
                }
                z7 = false;
                z8 = this.f23630Q;
                if (!this.f23621H) {
                }
                a = bjax.m103131a(activity);
                buildUpon = Uri.parse(str7).buildUpon();
                if (str4 != null) {
                }
                if (str6 != null) {
                }
                buildUpon.appendQueryParameter("xoauth_display_name", "Android Phone");
                if (str8 != null) {
                }
                buildUpon.appendQueryParameter("domains", TextUtils.join(",", strArr));
                if (!TextUtils.isEmpty(str10)) {
                }
                if (!TextUtils.isEmpty(str12)) {
                }
                if (!TextUtils.isEmpty(str)) {
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                if (!TextUtils.isEmpty(S)) {
                }
                if (!TextUtils.isEmpty(str5)) {
                }
                if (z2) {
                }
                if (booleanValue3) {
                }
                if (z3) {
                }
                if (z6) {
                }
                if (booleanValue) {
                }
                Locale locale22 = Locale.getDefault();
                languageTag = locale22.toLanguageTag();
                buildUpon.appendQueryParameter("lang", locale22.getLanguage());
                String language22 = locale22.getLanguage();
                String lowerCase22 = locale22.getCountry().toLowerCase(Locale.US);
                StringBuilder sb22 = new StringBuilder(String.valueOf(language22).length() + 1 + String.valueOf(lowerCase22).length());
                sb22.append(language22);
                sb22.append("_");
                sb22.append(lowerCase22);
                buildUpon.appendQueryParameter("langCountry", sb22.toString());
                if (!languageTag.isEmpty()) {
                }
                buildUpon.appendQueryParameter("cc", str11);
                if (i3 != 0) {
                }
                if (z7) {
                }
                if (!z8) {
                }
                if (!TextUtils.isEmpty(str9)) {
                }
                buildUpon.appendQueryParameter("use_native_navigation", r7);
                if (a == 8388611) {
                }
                String uri22 = buildUpon.build().toString();
                if (gnv.m13512V()) {
                }
                kaa.mo14197a(uri22);
                return;
            }
            ims b222 = mo14207b();
            imr imr222 = f23603h;
            boolean z9222 = z5;
            valueOf = Boolean.valueOf(z4);
            boolean booleanValue4222 = ((Boolean) b222.mo13147a(imr222, valueOf)).booleanValue();
            booleanValue = ((Boolean) mo14207b().mo13147a(f23606k, valueOf)).booleanValue();
            z6 = booleanValue4222;
            str4 = (String) mo14207b().mo13147a(f23610o, null);
            str5 = U;
            str6 = (String) mo14207b().mo13147a(f23611p, null);
            if (((Boolean) mo14207b().mo13147a(f23612q, valueOf)).booleanValue()) {
                if (!gnv.m13542ao()) {
                    z7 = false;
                } else if (!booleanValue3) {
                    z7 = true;
                }
                z8 = this.f23630Q;
                String str13 = !this.f23621H ? "0" : "1";
                a = bjax.m103131a(activity);
                buildUpon = Uri.parse(str7).buildUpon();
                if (str4 != null) {
                    buildUpon.appendQueryParameter("source", str4);
                } else {
                    buildUpon.appendQueryParameter("source", "android");
                }
                if (str6 != null) {
                    buildUpon.appendQueryParameter("ltmpl", str6);
                }
                buildUpon.appendQueryParameter("xoauth_display_name", "Android Phone");
                if (str8 != null) {
                    buildUpon.appendQueryParameter("Email", str8);
                }
                if (strArr != null && strArr.length > 0) {
                    buildUpon.appendQueryParameter("domains", TextUtils.join(",", strArr));
                }
                if (!TextUtils.isEmpty(str10)) {
                    buildUpon.appendQueryParameter("pEmail", str10);
                }
                if (!TextUtils.isEmpty(str12)) {
                    buildUpon.appendQueryParameter("pName", str12);
                }
                if (!TextUtils.isEmpty(str)) {
                    buildUpon.appendQueryParameter("ph", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    buildUpon.appendQueryParameter("imsi", str2);
                }
                if (!TextUtils.isEmpty(S)) {
                    buildUpon.appendQueryParameter("d", S);
                }
                if (!TextUtils.isEmpty(str5)) {
                    buildUpon.appendQueryParameter("gae", str5);
                }
                if (z2) {
                    buildUpon.appendQueryParameter("canFrp", "1");
                }
                if (booleanValue3) {
                    buildUpon.appendQueryParameter("is_frp", "1");
                    buildUpon.appendQueryParameter("return_user_id", "true");
                }
                if (z3) {
                    buildUpon.appendQueryParameter("canSk", "1");
                }
                if (z6) {
                    buildUpon.appendQueryParameter("is_setup_wizard", "1");
                    if (z9222 && !gnv.m13493C()) {
                        buildUpon.appendQueryParameter("afw", "1");
                    }
                }
                if (booleanValue) {
                    buildUpon.appendQueryParameter("use_immersive_mode", "1");
                }
                Locale locale222 = Locale.getDefault();
                languageTag = locale222.toLanguageTag();
                buildUpon.appendQueryParameter("lang", locale222.getLanguage());
                String language222 = locale222.getLanguage();
                String lowerCase222 = locale222.getCountry().toLowerCase(Locale.US);
                StringBuilder sb222 = new StringBuilder(String.valueOf(language222).length() + 1 + String.valueOf(lowerCase222).length());
                sb222.append(language222);
                sb222.append("_");
                sb222.append(lowerCase222);
                buildUpon.appendQueryParameter("langCountry", sb222.toString());
                if (!languageTag.isEmpty()) {
                    buildUpon.appendQueryParameter("hl", languageTag);
                }
                buildUpon.appendQueryParameter("cc", str11);
                if (i3 != 0) {
                    buildUpon.appendQueryParameter("mcc", Integer.toString(i3));
                }
                if (z7) {
                    buildUpon.appendQueryParameter("multilogin", "1");
                }
                if (!z8) {
                    buildUpon.appendQueryParameter("hide_status_bar", "1");
                }
                if (!TextUtils.isEmpty(str9)) {
                    buildUpon.appendQueryParameter("profile_owner", str9);
                }
                buildUpon.appendQueryParameter("use_native_navigation", str13);
                if (a == 8388611) {
                    buildUpon.appendQueryParameter("alignment", "start");
                } else if (a == 17) {
                    buildUpon.appendQueryParameter("alignment", "center");
                }
                String uri222 = buildUpon.build().toString();
                if (gnv.m13512V()) {
                    kaa = this;
                    kaa.m17552g(uri222);
                } else {
                    kaa = this;
                }
                kaa.mo14197a(uri222);
                return;
            }
            z7 = false;
            z8 = this.f23630Q;
            if (!this.f23621H) {
            }
            a = bjax.m103131a(activity);
            buildUpon = Uri.parse(str7).buildUpon();
            if (str4 != null) {
            }
            if (str6 != null) {
            }
            buildUpon.appendQueryParameter("xoauth_display_name", "Android Phone");
            if (str8 != null) {
            }
            buildUpon.appendQueryParameter("domains", TextUtils.join(",", strArr));
            if (!TextUtils.isEmpty(str10)) {
            }
            if (!TextUtils.isEmpty(str12)) {
            }
            if (!TextUtils.isEmpty(str)) {
            }
            if (!TextUtils.isEmpty(str2)) {
            }
            if (!TextUtils.isEmpty(S)) {
            }
            if (!TextUtils.isEmpty(str5)) {
            }
            if (z2) {
            }
            if (booleanValue3) {
            }
            if (z3) {
            }
            if (z6) {
            }
            if (booleanValue) {
            }
            Locale locale2222 = Locale.getDefault();
            languageTag = locale2222.toLanguageTag();
            buildUpon.appendQueryParameter("lang", locale2222.getLanguage());
            String language2222 = locale2222.getLanguage();
            String lowerCase2222 = locale2222.getCountry().toLowerCase(Locale.US);
            StringBuilder sb2222 = new StringBuilder(String.valueOf(language2222).length() + 1 + String.valueOf(lowerCase2222).length());
            sb2222.append(language2222);
            sb2222.append("_");
            sb2222.append(lowerCase2222);
            buildUpon.appendQueryParameter("langCountry", sb2222.toString());
            if (!languageTag.isEmpty()) {
            }
            buildUpon.appendQueryParameter("cc", str11);
            if (i3 != 0) {
            }
            if (z7) {
            }
            if (!z8) {
            }
            if (!TextUtils.isEmpty(str9)) {
            }
            buildUpon.appendQueryParameter("use_native_navigation", str13);
            if (a == 8388611) {
            }
            String uri2222 = buildUpon.build().toString();
            if (gnv.m13512V()) {
            }
            kaa.mo14197a(uri2222);
            return;
        }
        throw new IllegalStateException("Google sign-in endpoint URL is empty or null!");
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onPause() {
        xnw xnw;
        xwz xwz = this.f23622I;
        if (xwz == null) {
            f23599d.mo25409a("No FIDO API call to pause because the api client is null.", new Object[0]);
        } else {
            xwz.mo30206a(StateUpdate.f31872b).mo50372a(jzc.f23561a);
        }
        if (ccba.m129181b() && (xnw = this.f23618E) != null) {
            xnw.mo29958a(com.google.android.gms.fido.fido2.api.StateUpdate.f31691b);
        }
        super.onPause();
    }

    public final void onResume() {
        xnw xnw;
        super.onResume();
        this.f23636x = (jyp) getLoaderManager().initLoader(1, null, new jzm(this));
        xwz xwz = this.f23622I;
        if (xwz != null) {
            xwz.mo30206a(StateUpdate.f31873c).mo50372a(jza.f23559a);
        } else {
            f23599d.mo25409a("No FIDO API call to resume because the api client is null.", new Object[0]);
        }
        if (ccba.m129181b() && (xnw = this.f23618E) != null) {
            xnw.mo29958a(com.google.android.gms.fido.fido2.api.StateUpdate.f31692c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14194a(SslError sslError) {
        String host = Uri.parse(sslError.getUrl()).getHost();
        f23599d.mo25416d("SSL error while trying to connect to %s", host);
        this.f23632t.mo7906a(getString(C0126R.string.auth_minutemaid_ssl_error, host), "SSL error");
    }

    /* renamed from: c */
    public final boolean mo14277c() {
        if (!this.f23634v.canGoBack()) {
            return false;
        }
        this.f23634v.goBack();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo14279e(String str) {
        this.f23616C = null;
        sek sek = f23599d;
        String valueOf = String.valueOf(str);
        sek.mo25409a(valueOf.length() == 0 ? new String("Sending result ") : "Sending result ".concat(valueOf), new Object[0]);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("window.setSkResult(");
        sb.append(str);
        sb.append(");");
        mo14280f(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14195a(CustomWebView customWebView) {
        this.f23634v = customWebView;
        WebSettings settings = customWebView.getSettings();
        settings.setUserAgentString(String.valueOf(settings.getUserAgentString()).concat(" MinuteMaid"));
        if ("cn.google".equals(mo14207b().mo13146a(f23601f))) {
            String userAgentString = settings.getUserAgentString();
            String a = stn.m36304a("gms.auth.useragent", "");
            StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(a).length());
            sb.append(userAgentString);
            sb.append(" ");
            sb.append(a);
            settings.setUserAgentString(sb.toString());
        }
        if (this.f23625L) {
            f23599d.mo25409a("Registering sms receiver...", new Object[0]);
            this.f23626M = new MinuteMaidAuthSmsReceiver(this.f23634v);
            getActivity().registerReceiver(this.f23626M, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        }
        if (rrp.m34306a((String) mo14207b().mo13146a(f23604i))) {
            sre.m36087g(getActivity());
            this.f23634v.setSystemUiVisibility(1024);
            if (this.f23629P.mo11981b(getActivity())) {
                this.f23634v.setBackgroundColor(0);
                if (gnv.m13513W()) {
                    this.f23634v.f10996b = true;
                }
            }
            ((View) customWebView.getParent()).setOnApplyWindowInsetsListener(new jzw());
        }
        getLoaderManager().initLoader(0, null, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14196a(CustomWebView customWebView, String str) {
        if (!gnv.m13512V()) {
            m17552g(str);
        }
    }

    /* renamed from: a */
    public final void mo14273a(ErrorCode errorCode) {
        mo14278d();
        xpf xpf = new xpf();
        xpf.mo30001a(errorCode);
        mo14276a(xpf.mo30000a().mo18664a());
    }

    /* renamed from: a */
    public final void mo14274a(com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode) {
        JSONObject jSONObject;
        if (this.f23616C != null) {
            m17551e();
            jSONObject = this.f23616C.mo30310a(new ErrorResponseData(errorCode)).mo18664a();
        } else {
            yae a = yae.m43716a();
            a.mo30300a(new ErrorResponseData(errorCode));
            jSONObject = a.mo30301b().mo18664a();
        }
        mo14279e(jSONObject.toString());
    }

    /* renamed from: a */
    public final void mo14275a(jyk jyk) {
        String a = kac.m17567a(jyk);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 22);
        sb.append("window.onAccountAdd(");
        sb.append(a);
        sb.append(");");
        mo14280f(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14198a(jyl jyl) {
        String str = jyl.f23530a;
        if (str != null) {
            this.f23632t.mo7907a(new jyz(str, jyl.f23531b), this.f23637y, this.f23638z, this.f23614A, this.f23615B, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14276a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        sek sek = f23599d;
        String valueOf = String.valueOf(jSONObject2);
        sek.mo25409a(valueOf.length() == 0 ? new String("Sending fido2 result ") : "Sending fido2 result ".concat(valueOf), new Object[0]);
        StringBuilder sb = new StringBuilder(String.valueOf(jSONObject2).length() + 26);
        sb.append("window.setFido2SkResult(");
        sb.append(jSONObject2);
        sb.append(");");
        mo14280f(sb.toString());
    }
}

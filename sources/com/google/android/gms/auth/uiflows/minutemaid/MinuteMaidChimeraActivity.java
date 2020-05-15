package com.google.android.gms.auth.uiflows.minutemaid;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.auth.uiflows.addaccount.AccountDetail;
import com.google.android.setupcompat.internal.TemplateLayout;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MinuteMaidChimeraActivity extends jxx implements jzx, jvd, imf {

    /* renamed from: A */
    private static final imr f11534A = imr.m15727a("immersive_mode_requested");

    /* renamed from: B */
    private static final imr f11535B = imr.m15727a("allowed_domains");

    /* renamed from: C */
    private static final imr f11536C = imr.m15727a("purchaser_gaia_email");

    /* renamed from: D */
    private static final imr f11537D = imr.m15727a("purchaser_name");

    /* renamed from: E */
    private static final imr f11538E = imr.m15727a("package_name");

    /* renamed from: F */
    private static final imr f11539F = imr.m15727a("login_template");

    /* renamed from: G */
    private static final imr f11540G = imr.m15727a("is_frp_required");

    /* renamed from: H */
    private static final imr f11541H = imr.m15727a("is_add_account_flow");

    /* renamed from: I */
    private static final imr f11542I = imr.m15727a("resolve_frp_only");

    /* renamed from: J */
    private static final imr f11543J = imr.m15727a("check_offers");

    /* renamed from: K */
    private static final imr f11544K = imr.m15727a("add_account_frag");

    /* renamed from: a */
    public static final sek f11545a = ght.m13171a("MinuteMaid", "MinuteMaidActivity");

    /* renamed from: b */
    public static final imr f11546b = imr.m15727a("auth_code");

    /* renamed from: c */
    public static final imr f11547c = imr.m15727a("obfuscated_gaia_id");

    /* renamed from: d */
    public static final imr f11548d = imr.m15727a("account_name");

    /* renamed from: e */
    public static final imr f11549e = imr.m15727a("account_password");

    /* renamed from: f */
    public static final imr f11550f = imr.m15727a("new_account_created");

    /* renamed from: g */
    public static final imr f11551g = imr.m15727a("terms_of_service_accepted");

    /* renamed from: h */
    public static final imr f11552h = imr.m15727a("error_message");

    /* renamed from: p */
    public static final imr f11553p = imr.m15727a("accounts");

    /* renamed from: q */
    public static final imr f11554q = imr.m15727a("google_signin_url");

    /* renamed from: v */
    private static final imr f11555v = imr.m15727a("account_name_in");

    /* renamed from: w */
    private static final imr f11556w = imr.m15727a("account_type");

    /* renamed from: x */
    private static final imr f11557x = imr.m15727a("is_reauth");

    /* renamed from: y */
    private static final imr f11558y = imr.m15727a("is_setup_wizard");

    /* renamed from: z */
    private static final imr f11559z = imr.m15727a("suppress_d2d");

    /* renamed from: L */
    private Handler f11560L;

    /* renamed from: M */
    private kaa f11561M;

    /* renamed from: r */
    public ViewGroup f11562r;

    /* renamed from: s */
    img f11563s;

    /* renamed from: t */
    public boolean f11564t = false;

    /* renamed from: u */
    public String f11565u;

    /* renamed from: a */
    public static Intent m7072a(Context context, Account account, boolean z, rrq rrq, String str) {
        Bundle bundle;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidActivity");
        ims ims = new ims();
        ims.mo13148b(f11555v, account.name);
        ims.mo13148b(f11556w, account.type);
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(z));
        imr imr = jwz.f23428i;
        if (rrq != null) {
            bundle = rrq.mo25045a();
        } else {
            bundle = null;
        }
        ims.mo13148b(imr, bundle);
        ims.mo13148b(f11554q, str);
        return className.putExtras(ims.f21367a);
    }

    /* renamed from: b */
    public static Intent m7074b(Context context, Account account, boolean z, rrq rrq, String str) {
        Intent a = m7072a(context, account, z, rrq, str);
        ims ims = new ims();
        ims.mo13148b(f11557x, true);
        return a.putExtras(ims.f21367a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: q */
    private final void m7075q() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (gkf.f18388a.mo11981b(this)) {
            if (this.f11562r.getChildCount() > 0) {
                ViewGroup viewGroup = this.f11562r;
                viewGroup.removeView(viewGroup.getChildAt(0));
            }
            ViewGroup viewGroup2 = this.f11562r;
            viewGroup2.addView(LayoutInflater.from(this).inflate((int) C0126R.C0128layout.auth_tv_suw_glif_activity, viewGroup2, false));
            mo7905a(4, (String) null);
            return;
        }
        img img = this.f11563s;
        if (img != null) {
            this.f11562r.removeView((View) img);
        }
        boolean a = rrp.m34306a(mo14203f().f43552a);
        LayoutInflater from = LayoutInflater.from(this);
        if (!a) {
            i = C0126R.C0128layout.auth_generic_suw_activity;
        } else {
            i = C0126R.C0128layout.auth_generic_suw_glif_activity;
        }
        img img2 = (img) from.inflate(i, (ViewGroup) null, false);
        this.f11563s = img2;
        img2.mo13137a(getText(C0126R.string.auth_gls_name_checking_info_title));
        this.f11563s.mo7885b();
        if (!((Boolean) mo14202g().mo13147a(jwz.f23429j, false)).booleanValue()) {
            this.f11563s.mo7884a(srk.m36121a(cbxe.m128828b()));
        }
        this.f11563s.mo7880a();
        this.f11563s.mo7883a(this);
        if (cbzk.m128961c()) {
            this.f23435m = (imj) this.f11563s;
        } else if (((Boolean) mo14202g().mo13147a(jwz.f23429j, false)).booleanValue()) {
            this.f11563s.mo7881a(getWindow());
        } else {
            this.f11563s.mo7882a(getWindow(), this);
        }
        this.f11562r.addView((View) this.f11563s);
        mo7905a(4, (String) null);
    }

    /* renamed from: r */
    private final void m7076r() {
        if (!((Boolean) mo14202g().mo13147a(jwz.f23429j, false)).booleanValue() || !((Boolean) mo14202g().mo13147a(f11534A, true)).booleanValue()) {
            Window window = getWindow();
            if (cbzk.m128961c()) {
                imj imj = this.f23435m;
                if (imj != null) {
                    imj.mo7887b(window, this);
                }
            } else if (!cbzk.m128960b()) {
                img img = this.f11563s;
                if (img instanceof TemplateLayout) {
                    ((biyt) ((TemplateLayout) img).mo71342a(biyt.class)).mo64892a(window, this);
                }
            } else {
                img img2 = this.f11563s;
                if (img2 != null) {
                    img2.mo7882a(window, this);
                }
            }
        } else {
            Window window2 = getWindow();
            if (cbzk.m128961c()) {
                imj imj2 = this.f23435m;
                if (imj2 != null) {
                    imj2.mo7886b(window2);
                }
            } else if (!cbzk.m128960b()) {
                img img3 = this.f11563s;
                if (img3 instanceof TemplateLayout) {
                    biyt biyt = (biyt) ((TemplateLayout) img3).mo71342a(biyt.class);
                    biyt.m103011a(window2);
                }
            } else {
                img img4 = this.f11563s;
                if (img4 != null) {
                    img4.mo7881a(window2);
                }
            }
        }
    }

    /* renamed from: s */
    private final void m7077s() {
        mo7874a(1, (Intent) null);
    }

    /* renamed from: t */
    private final void m7078t() {
        mo7874a(0, (Intent) null);
    }

    /* renamed from: u */
    private final void m7079u() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("AddAccountFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        mo14202g().mo13148b(f11544K, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "MinuteMaidActivity";
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r0.equals("material") != false) goto L_0x0098;
     */
    /* renamed from: ba */
    public final void mo7716ba() {
        if (gkf.f18388a.mo11981b(this)) {
            gkf.f18388a.mo11979a(this, null);
            return;
        }
        if (mo14203f().f43554c) {
            super.mo7716ba();
        } else {
            String str = mo14203f().f43552a;
            int i = 0;
            boolean booleanValue = ((Boolean) mo14202g().mo13147a(jwz.f23429j, false)).booleanValue();
            if (!TextUtils.isEmpty(str)) {
                switch (str.hashCode()) {
                    case -2128555920:
                        if (str.equals("glif_v2_light")) {
                            i = 5;
                            break;
                        }
                        i = -1;
                        break;
                    case -1270463490:
                        if (str.equals("material_light")) {
                            i = 1;
                            break;
                        }
                        i = -1;
                        break;
                    case -1241052239:
                        if (str.equals("glif_v3_light")) {
                            i = 7;
                            break;
                        }
                        i = -1;
                        break;
                    case 3175618:
                        if (str.equals("glif")) {
                            i = 2;
                            break;
                        }
                        i = -1;
                        break;
                    case 115650329:
                        if (str.equals("glif_v2")) {
                            i = 4;
                            break;
                        }
                        i = -1;
                        break;
                    case 115650330:
                        if (str.equals("glif_v3")) {
                            i = 6;
                            break;
                        }
                        i = -1;
                        break;
                    case 299066663:
                        break;
                    case 767685465:
                        if (str.equals("glif_light")) {
                            i = 3;
                            break;
                        }
                        i = -1;
                        break;
                    default:
                        i = -1;
                        break;
                }
                switch (i) {
                    case 0:
                    case 1:
                        i = 2132018269;
                        break;
                    case 2:
                    case 3:
                        i = 2132018260;
                        break;
                    case 4:
                    case 5:
                        i = 2132018263;
                        break;
                    case 6:
                    case 7:
                        i = 2132018266;
                        break;
                    default:
                        i = rrp.m34307b(str);
                        break;
                }
            }
            if (i != 0) {
                setTheme(i);
            } else {
                setTheme(2132018269);
            }
            if (booleanValue) {
                bizb.m103017a(getWindow());
            }
        }
        if (!cbzk.m128961c()) {
            m7076r();
        }
    }

    /* renamed from: c */
    public final void mo7860c() {
        throw new UnsupportedOperationException("To be implemented");
    }

    /* renamed from: e */
    public final void mo7861e() {
        this.f11561M.mo14275a(new jyk("", 2));
        m7079u();
    }

    /* renamed from: l */
    public final void mo7910l() {
        if (!this.f11564t) {
            runOnUiThread(new jyw(this));
        }
    }

    /* renamed from: n */
    public final void mo7912n() {
        m7078t();
    }

    /* renamed from: o */
    public final void mo7913o() {
        m7077s();
    }

    public final void onBackPressed() {
        if (!this.f11561M.mo14277c()) {
            m7078t();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.f11564t) {
            m7075q();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        View view;
        int i;
        MinuteMaidChimeraActivity minuteMaidChimeraActivity = this;
        super.onCreate(bundle);
        jyc jyc = minuteMaidChimeraActivity.f23434l;
        if (jyc.f23511c == null) {
            jyc.f23511c = bofn.f132923f.mo74144da();
            bxvd j = mo14206j();
            if (j.f164950c) {
                j.mo74035c();
                j.f164950c = false;
            }
            boct boct = (boct) j.f164949b;
            boct boct2 = boct.f132600I;
            boct.f132612c = 15;
            boct.f132610a |= 1;
            String str = (String) mo14202g().mo13146a(f11556w);
            if ("com.google".equals(str)) {
                i = 2;
            } else if ("com.google.work".equals(str)) {
                i = 3;
            } else if (!"cn.google".equals(str)) {
                sek sek = f11545a;
                String valueOf = String.valueOf(str);
                sek.mo25416d(valueOf.length() == 0 ? new String("Unknown account type: ") : "Unknown account type: ".concat(valueOf), new Object[0]);
                i = 1;
            } else {
                i = 4;
            }
            bxvd bxvd = minuteMaidChimeraActivity.f23434l.f23511c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bofn bofn = (bofn) bxvd.f164949b;
            bofn.f132926b = i - 1;
            bofn.f132925a |= 1;
            if (((Boolean) mo14202g().mo13147a(f11558y, false)).booleanValue()) {
                bxvd bxvd2 = minuteMaidChimeraActivity.f23434l.f23511c;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bofn bofn2 = (bofn) bxvd2.f164949b;
                bofn2.f132929e = 1;
                bofn2.f132925a |= 8;
            }
        }
        minuteMaidChimeraActivity.f11565u = getTitle().toString();
        minuteMaidChimeraActivity.f11560L = new adzt();
        minuteMaidChimeraActivity.setContentView((int) C0126R.C0128layout.auth_minute_maid_activity);
        minuteMaidChimeraActivity.f11562r = (ViewGroup) minuteMaidChimeraActivity.findViewById(C0126R.C0129id.interstitial_layout);
        View findViewById = minuteMaidChimeraActivity.findViewById(C0126R.C0129id.minute_maid);
        m7075q();
        kaa kaa = (kaa) getSupportFragmentManager().findFragmentByTag("mm");
        minuteMaidChimeraActivity.f11561M = kaa;
        if (kaa == null) {
            boolean z = mo14203f().f43554c;
            boolean booleanValue = ((Boolean) mo14202g().mo13147a(f11557x, false)).booleanValue();
            boolean booleanValue2 = ((Boolean) mo14202g().mo13147a(f11558y, false)).booleanValue();
            boolean booleanValue3 = ((Boolean) mo14202g().mo13147a(jwz.f23429j, false)).booleanValue();
            String str2 = mo14203f().f43552a;
            view = findViewById;
            boolean booleanValue4 = ((Boolean) mo14202g().mo13147a(f11541H, false)).booleanValue();
            bool = false;
            kaa kaa2 = new kaa();
            ims ims = new ims();
            ims.mo13148b(kaa.f23600e, (String) mo14202g().mo13146a(f11555v));
            ims.mo13148b(kaa.f23601f, (String) mo14202g().mo13146a(f11556w));
            ims.mo13148b(kaa.f23605j, Boolean.valueOf(z));
            ims.mo13148b(kaa.f23602g, Boolean.valueOf(booleanValue));
            ims.mo13148b(kaa.f23603h, Boolean.valueOf(booleanValue2));
            ims.mo13148b(kaa.f23606k, Boolean.valueOf(booleanValue3));
            ims.mo13148b(kaa.f23607l, (String[]) mo14202g().mo13146a(f11535B));
            ims.mo13148b(kaa.f23608m, (String) mo14202g().mo13147a(f11536C, null));
            ims.mo13148b(kaa.f23609n, (String) mo14202g().mo13147a(f11537D, null));
            ims.mo13148b(kaa.f23604i, str2);
            ims.mo13148b(kaa.f23610o, (String) mo14202g().mo13147a(f11538E, null));
            ims.mo13148b(kaa.f23611p, (String) mo14202g().mo13147a(f11539F, null));
            ims.mo13148b(kaa.f23612q, Boolean.valueOf(booleanValue4));
            ims.mo13148b(kaa.f23613r, (String) mo14202g().mo13147a(f11554q, null));
            kaa2.setArguments(ims.f21367a);
            minuteMaidChimeraActivity = this;
            minuteMaidChimeraActivity.f11561M = kaa2;
            getSupportFragmentManager().beginTransaction().add(C0126R.C0129id.minute_maid, minuteMaidChimeraActivity.f11561M, "mm").commit();
        } else {
            view = findViewById;
            bool = false;
        }
        minuteMaidChimeraActivity.findViewById(C0126R.C0129id.container).setOnApplyWindowInsetsListener(new jyt(minuteMaidChimeraActivity, view));
        if (((Boolean) mo14202g().mo13147a(jwz.f23429j, bool)).booleanValue()) {
            new kae(minuteMaidChimeraActivity).f23650b.add(new jyy(minuteMaidChimeraActivity));
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f11560L.removeCallbacksAndMessages(null);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!this.f11564t) {
            this.f11560L.postDelayed(new jyu(this), gnv.m13510T());
        }
    }

    /* renamed from: p */
    public final void mo7914p() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage("com.google.android.androidforwork");
        if (launchIntentForPackage != null) {
            f11545a.mo25414c("Starting Android for Work", new Object[0]);
            launchIntentForPackage.putExtra("com.google.android.androidforwork.PROVISIONING_TYPE", "device_owner");
            launchIntentForPackage.setFlags(33554432);
            startActivity(launchIntentForPackage);
            finish();
            return;
        }
        f11545a.mo25418e("Could not find intent for Android for Work!", new Object[0]);
        bxvd bxvd = this.f23434l.f23511c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bofn bofn = (bofn) bxvd.f164949b;
        bofn bofn2 = bofn.f132923f;
        bofn.f132928d = 3;
        bofn.f132925a |= 4;
        mo7874a(2, (Intent) null);
    }

    /* renamed from: m */
    public final void mo7911m() {
        AccountDetail[] accountDetailArr = (AccountDetail[]) mo14202g().mo13146a(f11553p);
        if (accountDetailArr == null || accountDetailArr.length == 0) {
            f11545a.mo25416d("No accounts on finish", new Object[0]);
            mo7874a(1, (Intent) null);
            return;
        }
        Intent intent = new Intent();
        ims ims = new ims();
        ims.mo13148b(f11553p, accountDetailArr);
        mo7874a(3, intent.putExtras(ims.f21367a));
    }

    /* renamed from: b */
    public final void mo7909b(boolean z) {
        runOnUiThread(new jyx(this, z));
    }

    /* renamed from: a */
    public static Intent m7073a(Context context, String str, boolean z, boolean z2, boolean z3, rrq rrq, String[] strArr, String str2, String str3, String str4, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, String str7) {
        Bundle bundle;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidActivity");
        ims ims = new ims();
        ims.mo13148b(f11556w, str);
        ims.mo13148b(f11558y, Boolean.valueOf(z));
        ims.mo13148b(f11559z, Boolean.valueOf(z2));
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(z3));
        imr imr = jwz.f23428i;
        if (rrq != null) {
            bundle = rrq.mo25045a();
        } else {
            bundle = null;
        }
        ims.mo13148b(imr, bundle);
        ims.mo13148b(f11535B, strArr);
        ims.mo13148b(f11555v, str2);
        ims.mo13148b(f11536C, str3);
        ims.mo13148b(f11537D, str4);
        ims.mo13148b(f11538E, str5);
        ims.mo13148b(f11539F, str6);
        ims.mo13148b(f11540G, Boolean.valueOf(z4));
        ims.mo13148b(f11542I, Boolean.valueOf(z5));
        ims.mo13148b(f11543J, Boolean.valueOf(z6));
        ims.mo13148b(f11541H, Boolean.valueOf(z7));
        ims.mo13148b(f11554q, str7);
        return className.putExtras(ims.f21367a);
    }

    /* renamed from: a */
    public final void mo7869a() {
        m7077s();
    }

    /* renamed from: a */
    public final void mo7858a(int i) {
        throw new UnsupportedOperationException("To be implemented");
    }

    /* renamed from: a */
    public final void mo7905a(int i, String str) {
        findViewById(C0126R.C0129id.minute_maid).setImportantForAccessibility(i);
        setTitle(str);
    }

    /* renamed from: a */
    public final void mo7859a(Account account, String str, boolean z, Intent intent, boolean z2, String str2) {
        AccountDetail[] accountDetailArr;
        Account account2 = account;
        sek sek = f11545a;
        String valueOf = String.valueOf(account);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Account added:");
        sb.append(valueOf);
        sek.mo25409a(sb.toString(), new Object[0]);
        AccountDetail accountDetail = new AccountDetail(account2.name, account2.type, ((Boolean) mo14202g().mo13147a(f11550f, false)).booleanValue(), str, z, intent, str2, z2);
        AccountDetail[] accountDetailArr2 = (AccountDetail[]) mo14202g().mo13146a(f11553p);
        int i = 1;
        if (accountDetailArr2 != null) {
            int length = accountDetailArr2.length;
            accountDetailArr = (AccountDetail[]) Arrays.copyOf(accountDetailArr2, length + 1);
            accountDetailArr[length] = accountDetail;
        } else {
            accountDetailArr = new AccountDetail[]{accountDetail};
        }
        mo14202g().mo13148b(f11553p, accountDetailArr);
        if (str != null) {
            i = 3;
        }
        this.f11561M.mo14275a(new jyk(account2.name, i));
        m7079u();
    }

    /* renamed from: a */
    public final void mo7906a(String str, String str2) {
        sek sek = f11545a;
        String valueOf = String.valueOf(str2);
        sek.mo25418e(valueOf.length() == 0 ? new String("Error from MinuteMaidFragment: ") : "Error from MinuteMaidFragment: ".concat(valueOf), new Object[0]);
        bxvd bxvd = this.f23434l.f23511c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bofn bofn = (bofn) bxvd.f164949b;
        bofn bofn2 = bofn.f132923f;
        bofn.f132928d = 1;
        bofn.f132925a |= 4;
        Intent intent = new Intent();
        ims ims = new ims();
        ims.mo13148b(f11552h, str);
        mo7874a(2, intent.putExtras(ims.f21367a));
    }

    /* renamed from: a */
    public final void mo7907a(jyz jyz, String str, String str2, boolean z, boolean z2, boolean z3) {
        jyz jyz2 = jyz;
        bxvd bxvd = this.f23434l.f23511c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bofn bofn = (bofn) bxvd.f164949b;
        bofn bofn2 = bofn.f132923f;
        bofn.f132925a |= 2;
        bofn.f132927c = z;
        if (isFinishing()) {
            f11545a.mo25409a("finishing early - onCredentialsAvailable called twice", new Object[0]);
        } else if (z3) {
            mo14202g().mo13148b(f11546b, jyz2.f23555a);
            mo14202g().mo13148b(f11547c, jyz2.f23556b);
            mo14202g().mo13148b(f11550f, Boolean.valueOf(z));
            mo14202g().mo13148b(f11551g, Boolean.valueOf(z2));
            mo14202g().mo13148b(f11548d, str);
            mo14202g().mo13148b(f11544K, true);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("AddAccountFragment");
            if (findFragmentByTag != null) {
                f11545a.mo25409a("AddAccountFragment already exists before adding account", new Object[0]);
                supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
            jve.m17392a(this, true, ((Boolean) mo14202g().mo13147a(f11542I, false)).booleanValue(), (String) mo14202g().mo13146a(f11556w), jyz2.f23555a, jyz2.f23556b, (String) mo14202g().mo13146a(f11548d), z2, ((Boolean) mo14202g().mo13147a(f11543J, false)).booleanValue(), mo14203f().f43554c);
        } else {
            Intent intent = new Intent();
            ims ims = new ims();
            ims.mo13148b(f11546b, jyz2.f23555a);
            ims.mo13148b(f11547c, jyz2.f23556b);
            ims.mo13148b(f11548d, str);
            ims.mo13148b(f11549e, str2);
            ims.mo13148b(f11550f, Boolean.valueOf(z));
            ims.mo13148b(f11551g, Boolean.valueOf(z2));
            mo7874a(-1, intent.putExtras(ims.f21367a));
        }
    }

    /* renamed from: a */
    public final void mo7908a(boolean z) {
        mo14202g().mo13148b(f11534A, Boolean.valueOf(z));
        m7076r();
    }
}

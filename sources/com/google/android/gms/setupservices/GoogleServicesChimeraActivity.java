package com.google.android.gms.setupservices;

import android.accounts.Account;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableItem;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleServicesChimeraActivity extends aqgz implements bjbh, bizz {

    /* renamed from: c */
    public static final sek f107625c = new sek("SetupServices", "GoogleServicesActivity");

    /* renamed from: d */
    public aqjx f107626d;

    /* renamed from: e */
    public aqkf f107627e;

    /* renamed from: f */
    public boolean f107628f;

    /* renamed from: g */
    public boolean f107629g;

    /* renamed from: h */
    public final List f107630h;

    /* renamed from: i */
    public rrr f107631i;

    /* renamed from: j */
    public bizp f107632j;

    /* renamed from: k */
    public byte[] f107633k;

    /* renamed from: l */
    public GoogleServicesExpandableItem f107634l;

    /* renamed from: m */
    public final aqiv f107635m = new aqhu(this);

    /* renamed from: n */
    private Bundle f107636n;

    /* renamed from: o */
    private Bundle f107637o;

    /* renamed from: p */
    private final aqiv f107638p = new aqhk(this);

    /* renamed from: q */
    private final aqiv f107639q = new aqhp(this);

    /* renamed from: r */
    private final aqiv f107640r = new aqhz(this);

    /* renamed from: s */
    private final aqiv f107641s = new aqid(this);

    /* renamed from: t */
    private final aqiv f107642t = new aqii(this);

    /* renamed from: u */
    private final aqiv f107643u = new aqim(this);

    /* renamed from: v */
    private final aqiv f107644v;

    public GoogleServicesChimeraActivity() {
        aqir aqir = new aqir(this);
        this.f107644v = aqir;
        this.f107630h = Arrays.asList(this.f107638p, this.f107639q, this.f107635m, this.f107640r, this.f107641s, this.f107642t, this.f107643u, aqir);
    }

    /* renamed from: a */
    public final void mo7768a() {
        mo58954a(-1);
    }

    /* renamed from: bd */
    public final void mo7769bd() {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo47882c() {
        return "GoogleServicesActivity";
    }

    /* renamed from: d */
    public final boolean mo47883d() {
        for (aqiv aqiv : this.f107630h) {
            aqiz aqiz = aqiv.f86182g;
            if (aqiz != null && aqiz.mo47907bK()) {
                bxvd e = mo47884e();
                boolean c = aqiz.mo47908c();
                int a = aqiv.mo47896a(e);
                bofd bofd = ((boct) e.f164949b).f132626q;
                if (bofd == null) {
                    bofd = bofd.f132880b;
                }
                bofc bofc = (bofc) bofd.f132882a.get(a);
                bxvd bxvd = (bxvd) bofc.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bofc);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bofc bofc2 = (bofc) bxvd.f164949b;
                bofc bofc3 = bofc.f132873f;
                bofc2.f132875a |= 4;
                bofc2.f132878d = c;
                bofd bofd2 = ((boct) e.f164949b).f132626q;
                if (bofd2 == null) {
                    bofd2 = bofd.f132880b;
                }
                bxvd bxvd2 = (bxvd) bofd2.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) bofd2);
                boez boez = (boez) bxvd2;
                boez.mo68904a(a, (bofc) bxvd.mo74062i());
                bofd bofd3 = (bofd) boez.mo74062i();
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                boct boct = (boct) e.f164949b;
                boct boct2 = boct.f132600I;
                bofd3.getClass();
                boct.f132626q = bofd3;
                boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Bundle mo47933f() {
        if (this.f107636n == null) {
            this.f107636n = new Bundle();
        }
        return this.f107636n;
    }

    /* renamed from: g */
    public final Bundle mo58957g() {
        if (this.f107637o == null) {
            Bundle extras = getIntent().getExtras();
            this.f107637o = extras != null ? new Bundle(extras) : new Bundle();
        }
        return this.f107637o;
    }

    /* renamed from: h */
    public final aqiw mo58958h() {
        if (mo58957g().getBoolean("is_setup_wizard", false) || mo58957g().getBoolean("deferredSetup", false)) {
            return new aqix(getSharedPreferences("com.google.android.gms.setupservices.SetupWizardPreferences", 0));
        }
        return new aqiy(mo47933f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final rrq mo25038i() {
        Bundle bundle = mo58957g().getBundle("ui_parameters");
        if (bundle != null) {
            return rrq.m34308a(bundle);
        }
        rrq a = rrq.m34308a(null);
        a.f43552a = mo58957g().getString("theme");
        return a;
    }

    /* renamed from: k */
    public final Account mo58959k() {
        Account account = (Account) mo58957g().getParcelable("account");
        if (!cglf.f187245a.mo6606a().mo84059a() || account == null || !"Android Enterprise".equals(account.name)) {
            return account;
        }
        return null;
    }

    public final void onBackPressed() {
        mo58954a(0);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        bjai bjai;
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        this.f107626d = new aqjx((TelephonyManager) getSystemService("phone"), SubscriptionManager.from(this));
        if (this.f107633k == null) {
            this.f107633k = ggj.m13107a();
        }
        Account k = mo58959k();
        this.f107628f = mo58957g().getBoolean("is_setup_wizard", false);
        this.f107629g = mo58957g().getBoolean("deferredSetup", false);
        String string = mo58957g().getString("variant", "");
        if (k == null) {
            z = sre.m36080a(this);
        } else {
            z = "cn.google".equals(k.type);
        }
        if (z) {
            this.f107627e = aqkf.SIDEWINDER;
        } else if (string != null && !string.isEmpty()) {
            this.f107627e = "kids".equals(string) ? aqkf.KIDS : null;
        } else {
            this.f107627e = aqkf.DEFAULT;
        }
        if (bundle != null) {
            this.f107636n = new Bundle(bundle);
        }
        setContentView(!rrn.m34301a(this.f43541a.f43552a) ? C0126R.C0128layout.setupservices_google_services_loading_activity : C0126R.C0128layout.setupservices_google_services_loading_glif_activity);
        TemplateLayout templateLayout = (TemplateLayout) findViewById(C0126R.C0129id.setup_wizard_layout);
        ((bjad) templateLayout.mo71342a(bjad.class)).mo64937a(getTitle());
        if (((ProgressBar) templateLayout.findViewById(C0126R.C0129id.circular_progress_bar)) == null && (bjai = (bjai) templateLayout.mo71342a(bjai.class)) != null) {
            bjai.mo64949a(true);
        }
        aucb a = aqjd.m71716a(cgll.f187253a.mo6606a().mo84091o());
        aucb a2 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84070F());
        aucb a3 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84082f());
        aucb a4 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84081e());
        aucb a5 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84080d());
        int size = this.f107630h.size();
        ArrayList arrayList = new ArrayList(size + size);
        arrayList.add(a);
        arrayList.add(a2);
        arrayList.add(a3);
        arrayList.add(a4);
        arrayList.add(a5);
        for (aqiv aqiv : this.f107630h) {
            arrayList.add(aqiv.mo47888a());
        }
        aucu.m76779a((Collection) arrayList).mo50363a(new aqha(this, a, a2, a3, a4, a5)).mo50372a(aqhb.f86102a);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putAll(this.f107636n);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        aqiw h = mo58958h();
        for (aqiv aqiv : this.f107630h) {
            aqiz aqiz = aqiv.f86182g;
            if (aqiz != null && aqiz.mo47907bK()) {
                h.mo47899a(aqiv.mo47897e(), aqiz.mo47908c());
            }
        }
        byte[] bArr = this.f107633k;
        if (bArr != null) {
            h.mo47900a(bArr);
        }
        h.mo47898a();
        super.onPause();
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
    public final void mo58954a(int i) {
        Intent intent;
        aymx.m84287a(this);
        Account k = mo58959k();
        for (aqiv aqiv : this.f107630h) {
            aqiz aqiz = aqiv.f86182g;
            if (aqiz != null && aqiz.mo47907bK()) {
                boolean c = aqiz.mo47908c();
                sek sek = f107625c;
                String valueOf = String.valueOf(aqiv);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                sb.append(valueOf);
                sb.append(": ");
                sb.append(c);
                sek.mo25412b(sb.toString(), new Object[0]);
                aqiv.mo47890a(c);
            }
        }
        if (cgll.f187253a.mo6606a().mo84083g()) {
            ggp ggp = new ggp();
            ggp.f18142a = 2;
            ggp.f18143b = aqjv.PHONE.f86243c.f145463bW;
            if (k != null) {
                ggp.f18144c = k.name;
            }
            aqjw.m71743a(this, k).mo50382b(new aqhf(this, mo58957g().getBoolean("is_setup_wizard", false), ggp)).mo50371a(aqhe.f86105a);
        }
        bxvd bxvd = ((aqgz) this).f86095b.f86286h;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boco boco = (boco) bxvd.f164949b;
        boco boco2 = boco.f132581g;
        boco.f132583a |= 2;
        boco.f132585c = i;
        if (i == 0) {
            intent = new Intent();
            intent.putExtra("intentionally_canceled", true);
        } else {
            intent = null;
        }
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo58955a(bjab bjab) {
        mo58956a(bjab.f122404a, 0);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo58956a(String str, int i) {
        char c;
        aqka aqka;
        if (isFinishing()) {
            return;
        }
        if (!"safety_net_details".equals(str) && i != C0126R.C0129id.agree_safety_net) {
            aqkf aqkf = this.f107627e;
            aqjx aqjx = this.f107626d;
            switch (str.hashCode()) {
                case -1864179838:
                    if (str.equals("google_privacy")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -57954866:
                    if (str.equals("location_tos")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 115032:
                    if (str.equals("tos")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 145140592:
                    if (str.equals("additional_privacy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 196924336:
                    if (str.equals("maps_tos")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1425908582:
                    if (str.equals("app_permissions")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                aqkf aqkf2 = aqkf.DEFAULT;
                int ordinal = aqkf.ordinal();
                if (ordinal == 1) {
                    aqka = aqka.PRIVACY_POLICY_KIDS;
                } else if (ordinal != 3) {
                    aqka = aqjx.mo47929a("DE") ? aqka.PRIVACY_POLICY_GERMANY : aqka.PRIVACY_POLICY;
                } else {
                    aqka = aqka.PRIVACY_POLICY_AUTO;
                }
            } else if (c == 1) {
                aqkf aqkf3 = aqkf.DEFAULT;
                aqka = aqkf.ordinal() != 3 ? aqjx.mo47929a("DE") ? aqka.TERMS_OF_SERVICE_GERMANY : aqka.TERMS_OF_SERVICE : aqka.TERMS_OF_SERVICE_AUTO;
            } else if (c == 2) {
                aqka = aqka.APP_PERMISSIONS_KOREA;
            } else if (c == 3) {
                aqka = aqka.ADDITIONAL_PRIVACY_KOREA;
            } else if (c == 4) {
                aqka = aqka.LOCATION_TOS_KOREA;
            } else if (c == 5) {
                aqka = aqka.AUTOMOTIVE_MAPS_TOS;
            } else {
                throw new IllegalStateException("Invalid policy annotation provided!");
            }
            Bundle bundle = new Bundle();
            bundle.putString("policy", aqka.name());
            aqkd aqkd = new aqkd();
            aqkd.setArguments(bundle);
            aqkd.show(getSupportFragmentManager(), "dialog");
            return;
        }
        aqjn aqjn = new aqjn(this, this.f107627e, this.f107628f);
        CharSequence charSequence = aqkg.m71752a(aqjn.f86226g, C0126R.array.setupservices_google_services_safety_net_dialog_text, aqjn.f86221a).f86194a;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("message", charSequence);
        aqiu aqiu = new aqiu();
        aqiu.setArguments(bundle2);
        aqiu.show(getSupportFragmentManager(), "dialog");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25037a(String str, boolean z) {
        rrn.m34300a(this, str, z);
    }
}

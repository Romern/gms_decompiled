package p000;

import android.app.AlertDialog;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClient;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: aswe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aswe extends alic implements auaj, atmb, asvg {

    /* renamed from: b */
    public static final srn f89837b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: A */
    private boolean f89838A;

    /* renamed from: B */
    private aswd f89839B;

    /* renamed from: c */
    asvh f89840c;

    /* renamed from: d */
    atml f89841d;

    /* renamed from: e */
    auak f89842e;

    /* renamed from: f */
    String f89843f;

    /* renamed from: g */
    String f89844g;

    /* renamed from: h */
    atme f89845h;

    /* renamed from: i */
    public atmo f89846i;

    /* renamed from: j */
    asvc f89847j;

    /* renamed from: k */
    bepv f89848k;

    /* renamed from: l */
    atam f89849l;

    /* renamed from: m */
    public alih f89850m;

    /* renamed from: n */
    public bngx f89851n;

    /* renamed from: o */
    public GetAllCardsResponse f89852o;

    /* renamed from: p */
    public boolean f89853p;

    /* renamed from: q */
    rjx f89854q;

    /* renamed from: r */
    rjx f89855r;

    /* renamed from: s */
    private RecyclerView f89856s;

    /* renamed from: t */
    private ViewPager f89857t;

    /* renamed from: u */
    private boolean f89858u;

    /* renamed from: v */
    private boolean f89859v;

    /* renamed from: w */
    private DrawerLayout f89860w;

    /* renamed from: x */
    private AccountParticleDisc f89861x;

    /* renamed from: y */
    private View f89862y;

    /* renamed from: z */
    private boolean f89863z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.support.v7.widget.RecyclerView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final abh m74914a(Activity activity, String str, int i) {
        TextView textView = (TextView) LayoutInflater.from(activity).inflate((int) C0126R.C0128layout.tp_settings_activity_text_reskin, (ViewGroup) this.f89856s, false);
        textView.setText(str);
        return new asvj(textView, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.support.v7.widget.RecyclerView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: b */
    private final abh m74917b(Activity activity, String str, int i) {
        TextView textView = (TextView) LayoutInflater.from(activity).inflate((int) C0126R.C0128layout.tp_settings_activity_header_reskin, (ViewGroup) this.f89856s, false);
        textView.setText(str);
        return new asvj(textView, i);
    }

    /* renamed from: d */
    public static aswe m74918d() {
        return new aswe();
    }

    /* renamed from: c */
    public final void mo49542c() {
        this.f89855r.mo24769w().mo9459a(new asvq(this), 15, TimeUnit.SECONDS);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Activity activity = getActivity();
        asvi asvi = new asvi(activity);
        if (i != 1100) {
            if (i != 1200) {
                if (i == 1300) {
                    if (i2 == 444 && intent != null && intent.getBooleanExtra("token_deleted_extra", false)) {
                        bhnh.m101202a(m74915a((int) C0126R.C0129id.ContentView), getString(C0126R.string.tp_card_deleted_notification, getString(C0126R.string.common_card)), 0).mo64020c();
                    }
                    if (i2 == -1) {
                        this.f89851n = null;
                        mo49540a(activity);
                        String stringExtra = intent.getStringExtra("new_card_display_name");
                        bhnh.m101202a(m74915a((int) C0126R.C0129id.ContentView), getString(C0126R.string.tp_card_added_snackbar_confirmation, stringExtra), 0).mo64020c();
                    }
                } else if (i == 1400) {
                    if (i2 == -1) {
                        this.f89858u = true;
                    } else {
                        activity.finish();
                    }
                }
            } else if (asvi.mo49529a()) {
                bhnh.m101202a(m74915a((int) C0126R.C0129id.ContentView), getString(C0126R.string.tp_android_pay_enabled_snackbar_confirmation), 0).mo64020c();
            }
        } else if (atxx.m76529b(activity)) {
            bhnh.m101202a(m74915a((int) C0126R.C0129id.ContentView), getString(C0126R.string.tp_nfc_enabled_snackbar_confirmation), 0).mo64020c();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.f89850m == null) {
            asux asux = new asux();
            alif alif = this.f73529a;
            cazf.m127594a(alif);
            asux.f89779c = alif;
            alim alim = new alim(this);
            cazf.m127594a(alim);
            asux.f89777a = alim;
            asvd asvd = new asvd(this);
            cazf.m127594a(asvd);
            asux.f89778b = asvd;
            cazf.m127595a(asux.f89777a, alim.class);
            cazf.m127595a(asux.f89778b, asvd.class);
            cazf.m127595a(asux.f89779c, alif.class);
            this.f89850m = new asuy(asux.f89777a, asux.f89778b, asux.f89779c);
        }
        asuy asuy = (asuy) this.f89850m;
        this.f89840c = asuy.mo49517a();
        rjx a = rjx.m33693a(alin.m60903a(asuy.f89780a));
        cazf.m127593a(a, "Cannot return null from a non-@Nullable @Provides method");
        this.f89854q = a;
        this.f89841d = new atml(alii.m60897b());
        asuy.mo49518b();
        this.f89855r = asuy.mo49521e();
        this.f89842e = asuy.mo49519c();
        String b = asuy.f89781b.mo40364b();
        cazf.m127593a(b, "Cannot return null from a non-@Nullable component method");
        this.f89843f = b;
        String a2 = asuy.f89781b.mo40363a();
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable component method");
        this.f89844g = a2;
        this.f89845h = new atme(alio.m60905a(asuy.f89780a), alip.m60907a(asuy.f89780a), asuy.mo49521e(), asuy.mo49518b(), asuy.mo49520d());
        this.f89846i = new atmo(alii.m60897b());
        this.f89847j = new asvc(asuy.mo49517a(), asuy.mo49519c(), asjw.m74255a());
        this.f89848k = new bepv();
        this.f89849l = asuy.mo49520d();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        setHasOptionsMenu(true);
        if (bundle == null || !bundle.getBoolean("has_bypassed_splash", false)) {
            z = false;
        }
        this.f89859v = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.support.v7.widget.RecyclerView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Intent intent;
        deu deu = (deu) getActivity();
        this.f89838A = asjw.m74255a();
        this.f89863z = atgf.m75807a(deu).mo49940a();
        this.f89862y = layoutInflater.inflate((int) C0126R.C0128layout.tp_home_fragment, viewGroup, false);
        this.f89856s = (RecyclerView) m74915a((int) C0126R.C0129id.TokenSelectorUi);
        asuz asuz = new asuz(this.f89856s);
        bepv bepv = this.f89848k;
        boolean z = this.f89863z;
        boolean z2 = this.f89838A;
        asuz.f89783d = bepv;
        asuz.f89784e = z;
        asuz.f89785f = z2;
        this.f89856s.setAccessibilityDelegateCompat(asuz);
        bddo bddo = null;
        this.f89856s.setItemAnimator(null);
        this.f89856s.setAdapter(this.f89848k);
        this.f89856s.setLayoutManager(new aah());
        RecyclerView recyclerView = this.f89856s;
        ViewPager viewPager = (ViewPager) LayoutInflater.from(deu).inflate((int) C0126R.C0128layout.tp_settings_token_selector, (ViewGroup) recyclerView, false);
        int min = Math.min(recyclerView.getResources().getDisplayMetrics().widthPixels, recyclerView.getResources().getDisplayMetrics().heightPixels);
        float a = atme.m76164a(120.0f, recyclerView);
        ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
        double d = (double) min;
        Double.isNaN(d);
        double d2 = (double) a;
        Double.isNaN(d2);
        layoutParams.height = (int) ((d * 0.35200000000000004d) + d2);
        viewPager.setPadding((int) atme.m76164a(64.0f, recyclerView), 0, (int) atme.m76164a(64.0f, recyclerView), 0);
        viewPager.setClipToPadding(false);
        int a2 = (int) atme.m76164a(-8.0f, recyclerView);
        int i = viewPager.f1755d;
        viewPager.f1755d = a2;
        int width = viewPager.getWidth();
        viewPager.mo2132a(width, width, a2, i);
        viewPager.requestLayout();
        this.f89857t = viewPager;
        this.f89845h.f90472e = new asvk(this);
        atme atme = this.f89845h;
        ViewPager viewPager2 = this.f89857t;
        atme.f90473f = viewPager2;
        viewPager2.mo2135a(new atmd(atme));
        C1280ps.m19894a(viewPager2, new atmc(atme));
        this.f89857t.mo2136a((avh) this.f89845h);
        this.f89857t.mo2137a((avq) this.f89845h);
        asvj asvj = new asvj(this.f89857t, 11111);
        this.f89860w = (DrawerLayout) m74915a((int) C0126R.C0129id.drawer_layout);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) m74915a((int) C0126R.C0129id.account_particle_disc);
        this.f89861x = accountParticleDisc;
        if (!accountParticleDisc.mo60579b()) {
            bqgj a3 = snp.m35702a(9);
            bdej bdej = new bdej(a3);
            this.f89861x.mo60576a(bdej, bddo.class);
            Context context = getContext();
            bddp bddp = new bddp();
            Context context2 = getContext();
            allp a4 = allq.m61232a();
            a4.f73626a = 80;
            AccountParticleDisc.m94876a(context, bdej, a3, bddp, new bddr(context2, a3, a4.mo40491a()), bddo.class);
        }
        this.f89861x.setOnClickListener(new asvu(this));
        m74915a((int) C0126R.C0129id.Fab).setOnClickListener(new asvv(this, deu));
        deu.setTitle((int) C0126R.string.tp_google_pay);
        deu.mo8626a((Toolbar) m74915a((int) C0126R.C0129id.toolbar));
        C1341rz aW = deu.mo8628aW();
        aW.mo15863e((int) C0126R.C0127drawable.quantum_ic_menu_grey600_24);
        aW.mo15853b(true);
        aW.mo15858c(false);
        aW.mo15865f((int) C0126R.string.tp_hamburger_menu_description);
        String b = askc.m74272b();
        if (b.equals("SANDBOX") || b.equals("DEVELOPMENT")) {
            Toast.makeText(deu, b, 0).show();
        }
        this.f89846i = new atmo(getContext());
        this.f89841d.mo2445a(deu, new asvw(this));
        this.f89848k.mo60923a(Arrays.asList(this.f89846i, asvj, this.f89847j));
        this.f89862y.findViewById(C0126R.C0129id.SettingsItem).setOnClickListener(new asvx(this));
        this.f89862y.findViewById(C0126R.C0129id.PrivacyTermsItem).setOnClickListener(new asvy(this));
        Activity activity = getActivity();
        if (activity != null) {
            boolean z3 = !TextUtils.isEmpty(atxn.m76507b(activity, new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY")));
            atxm atxm = new atxm();
            atxm.f91082a = "GmscoreTapandpaySettings";
            if (!z3) {
                str = "no_app";
            } else {
                str = "app";
            }
            atxm.mo50305a(MfiClient.ACCOUNT_ISSUER_GOOGLE, str, "tp2_google_settings");
            if (!z3) {
                intent = atxm.mo50304a();
            } else {
                intent = atxm.m76502c().setData(atxm.mo50306b());
            }
            this.f89862y.findViewById(C0126R.C0129id.GetGooglePayApp).setOnClickListener(new aswb(activity, intent));
        }
        aucb j = this.f89855r.mo24753j(this.f89843f);
        j.mo50373a(new asvz(this));
        j.mo50372a(aswa.f89832a);
        AccountParticleDisc accountParticleDisc2 = this.f89861x;
        if (this.f89843f != null) {
            bddn g = bddo.m90606g();
            g.mo57907a(this.f89843f);
            g.mo57908b();
            bddo = g.mo57906a();
        }
        accountParticleDisc2.mo60577a(bddo);
        return this.f89862y;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f89845h.mo50039f();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        DrawerLayout drawerLayout = this.f89860w;
        View a = drawerLayout.mo1910a(8388611);
        if (a != null) {
            drawerLayout.mo1931i(a);
            return true;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.m1484b(8388611));
    }

    public final void onPause() {
        super.onPause();
        this.f89854q.mo24733b(this.f89839B);
        atme atme = this.f89845h;
        if (!atme.mo50038e()) {
            atlz atlz = atme.f90470c;
            sdo.m34967a("hintAllowOverrideTimeout");
            atlz.mo50036b().removeCallbacksAndMessages(null);
            String str = atlz.f90463a;
            if (str != null) {
                atlz.f90464b.mo24734b(str, cgxl.f187974a.mo6606a().mo84681b());
                atlz.f90463a = null;
            }
        }
    }

    public final void onResume() {
        super.onResume();
        deu deu = (deu) getActivity();
        aswd aswd = new aswd(this);
        this.f89839B = aswd;
        this.f89854q.mo24720a((asin) aswd);
        mo49542c();
        if (!this.f89858u) {
            this.f89858u = true;
            asvi asvi = new asvi(deu);
            if (!atxx.m76529b(asvi.f89811a)) {
                FragmentManager supportFragmentManager = asvi.f89811a.getSupportFragmentManager();
                if (((DialogFragment) supportFragmentManager.findFragmentByTag("ENABLE_NFC_DIALOG_TAG")) == null) {
                    new atlp().show(supportFragmentManager, "ENABLE_NFC_DIALOG_TAG");
                }
            } else if (asvi.mo49529a()) {
                sre.m36089i(asvi.f89811a);
                if (!atxx.m76532e(asvi.f89811a).getBoolean("prompted_for_adm", false) && !((DevicePolicyManager) asvi.f89811a.getSystemService("device_policy")).isAdminActive(new ComponentName(asvi.f89811a, "com.google.android.gms.mdm.receivers.MdmDeviceAdminReceiver"))) {
                    atxx.m76532e(asvi.f89811a).edit().putBoolean("prompted_for_adm", true).apply();
                    FragmentManager supportFragmentManager2 = asvi.f89811a.getSupportFragmentManager();
                    if (((DialogFragment) supportFragmentManager2.findFragmentByTag("TAG_ENABLE_ADM_DIALOG")) == null) {
                        new atlo().show(supportFragmentManager2, "TAG_ENABLE_ADM_DIALOG");
                    }
                }
            } else {
                asvi.m74896a(asvi.f89811a, 1200);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_bypassed_splash", this.f89859v);
    }

    public final void onStart() {
        super.onStart();
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (!cgwn.f187872a.mo6606a().mo84610Y() || !alfj.m60866b(activity)) {
            asjl.m74236a(activity, "Android Pay Settings");
            atam atam = this.f89849l;
            bxvd da = bpbx.f135635S.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbx bpbx = (bpbx) da.f164949b;
            bpbx.f135657c = 134;
            bpbx.f135655a |= 1;
            atam.mo49741a((bpbx) da.mo74062i());
            this.f89841d.mo2443a();
            return;
        }
        activity.startActivity(new alhu().mo40351a().setFlags(335544320));
        activity.finish();
    }

    /* renamed from: a */
    private final View m74915a(int i) {
        return this.f89862y.findViewById(i);
    }

    /* renamed from: b */
    public final void mo49541b(CardInfo cardInfo) {
        View a;
        if (getActivity() != null && (a = m74915a((int) C0126R.C0129id.TokenSelectorUi)) != null) {
            bhnh.m101202a(a, getString(C0126R.string.tp_card_deleted_notification, cardInfo.f108343d), 0).mo64020c();
        }
    }

    /* renamed from: a */
    private static List m74916a(List list, ssx ssx) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CardInfo cardInfo = (CardInfo) it.next();
                if (ssx.mo6692a(cardInfo)) {
                    arrayList.add(cardInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final aucb mo49538a(CardInfo cardInfo) {
        atam atam = this.f89849l;
        bxvd da = bpbx.f135635S.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx = (bpbx) da.f164949b;
        bpbx.f135657c = 136;
        bpbx.f135655a |= 1;
        atam.mo49741a((bpbx) da.mo74062i());
        cardInfo.mo59217a();
        return this.f89855r.mo24749h(cardInfo.f108340a);
    }

    /* renamed from: a */
    public final void mo40361a() {
        this.f89845h.mo50039f();
    }

    /* renamed from: a */
    public final void mo49539a(View view) {
        Activity activity = getActivity();
        if (activity != null) {
            int id = view.getId();
            if (id == C0126R.C0129id.SettingsItem) {
                String str = this.f89843f;
                startActivity(new Intent().setClassName(activity, "com.google.android.gms.tapandpay.settings.NotificationSettingsActivity").putExtra("extra_account_info", new AccountInfo(this.f89844g, str)));
            } else if (id == C0126R.C0129id.PrivacyTermsItem) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Uri.parse(cgxl.f187974a.mo6606a().mo84683d()).buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).build().toString())));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.support.v7.widget.RecyclerView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo49540a(Activity activity) {
        CardInfo[] cardInfoArr;
        boolean z;
        String str;
        Uri uri;
        String str2;
        activity.invalidateOptionsMenu();
        if (this.f89857t != null) {
            if (this.f89851n != null) {
                m74915a((int) C0126R.C0129id.TokenSelectorUi).setVisibility(0);
                atme atme = this.f89845h;
                String str3 = this.f89843f;
                GetAllCardsResponse getAllCardsResponse = this.f89852o;
                boolean z2 = this.f89853p;
                if (!(str3 == null || getAllCardsResponse == null)) {
                    if (atme.f90475h != null && (str = atme.f90474g) != null && str3.equals(str)) {
                        CardInfo[] cardInfoArr2 = atme.f90475h.f108369a;
                        CardInfo[] cardInfoArr3 = getAllCardsResponse.f108369a;
                        List a = atme.m76165a(cardInfoArr2);
                        List a2 = atme.m76165a(cardInfoArr3);
                        if (a.size() == a2.size()) {
                            int i = 0;
                            while (true) {
                                if (i >= a.size()) {
                                    z = false;
                                    break;
                                }
                                CardInfo cardInfo = (CardInfo) a.get(i);
                                CardInfo cardInfo2 = (CardInfo) a2.get(i);
                                String str4 = cardInfo.f108340a;
                                if (str4 != null && str4.equals(cardInfo2.f108340a) && (uri = cardInfo.f108347h) != null && uri.equals(cardInfo2.f108347h) && (str2 = cardInfo.f108360u) != null) {
                                    if (!str2.equals(cardInfo2.f108360u)) {
                                        z = true;
                                        break;
                                    }
                                    i++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                    atme.f90474g = str3;
                    atme.f90477j = z2;
                    atme.f90475h = getAllCardsResponse;
                    ArrayList arrayList = new ArrayList();
                    CardInfo[] cardInfoArr4 = getAllCardsResponse.f108369a;
                    for (CardInfo cardInfo3 : cardInfoArr4) {
                        if (cardInfo3.f108345f.f108459b == 5) {
                            arrayList.add(cardInfo3);
                        }
                    }
                    atme.f90476i = arrayList;
                    if (z) {
                        atme.f90478k = new HashMap();
                        atme.mo2720c();
                    }
                }
            } else {
                m74915a((int) C0126R.C0129id.TokenSelectorUi).setVisibility(8);
            }
        }
        if (this.f89851n != null) {
            this.f89856s.setVisibility(0);
            if ((this.f89838A && !this.f89863z) || this.f89851n.isEmpty()) {
                atmo atmo = this.f89846i;
                atmo.f90498e = this.f89852o;
                if (atmo.f90497d != null) {
                    atmo.mo171aJ();
                }
                this.f89847j.mo49526a(m74916a(this.f89851n, aswc.f89835a), this.f89843f);
                View a3 = m74915a((int) C0126R.C0129id.WelcomeSection);
                if (getResources().getConfiguration().orientation == 2 || ((cardInfoArr = this.f89852o.f108369a) != null && cardInfoArr.length > 0)) {
                    a3.setVisibility(8);
                } else {
                    a3.setVisibility(0);
                    NetworkImageView networkImageView = (NetworkImageView) a3.findViewById(C0126R.C0129id.WelcomeImage);
                    networkImageView.setImageUrl(null, atyg.m76548a());
                    networkImageView.setImageDrawable(null);
                    networkImageView.setImageUrl("https://www.gstatic.com/commerce/wallet/20110109/jhfae70rio980yhbnsox6vkc9sjkdcuy223hnso08udmnnds8776vp6n5744ghopeewdx/tp2_setting/tp_tap_illustration_color_400x132dp_1.webp", atyg.m76548a());
                }
                m74915a((int) C0126R.C0129id.Fab).setVisibility(8);
                this.f89848k.mo171aJ();
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!this.f89863z) {
                View inflate = LayoutInflater.from(activity).inflate((int) C0126R.C0128layout.tp_settings_no_contactless_warning, (ViewGroup) this.f89856s, false);
                atyg.m76549a(activity, (TextView) inflate.findViewById(C0126R.C0129id.WarningText), getString(C0126R.string.tp_nonfc_warning_label), true, new Intent("android.intent.action.VIEW").setData(Uri.parse("https://support.google.com/googlepay/?p=nfc_hce")));
                arrayList2.add(new asvj(inflate, 11111));
            }
            List a4 = m74916a(this.f89851n, asvl.f89815a);
            List a5 = m74916a(this.f89851n, asvm.f89816a);
            List a6 = m74916a(this.f89851n, asvn.f89817a);
            if (!a4.isEmpty()) {
                arrayList2.add(m74917b(activity, getString(C0126R.string.tp_settings_felica_payment_methods, getString(C0126R.string.tp_transaction_id)), C0126R.string.tp_transaction_id));
                if (this.f89852o.mo59225a(2) == null && !m74916a(a4, asvo.f89818a).isEmpty()) {
                    arrayList2.add(m74914a(activity, getResources().getString(C0126R.string.tp_settings_no_felica_default, atgs.ID.mo49970a(activity)), 22222));
                }
                asvc asvc = new asvc(this.f89840c, this.f89842e, this.f89838A);
                asvc.mo49526a(a4, this.f89843f);
                arrayList2.add(asvc);
            }
            if (!a5.isEmpty()) {
                arrayList2.add(m74917b(activity, getString(C0126R.string.tp_settings_felica_payment_methods, getString(C0126R.string.tp_transaction_quicpay)), C0126R.string.tp_transaction_quicpay));
                if (this.f89852o.mo59225a(1) == null && !m74916a(a5, asvp.f89819a).isEmpty()) {
                    arrayList2.add(m74914a(activity, getResources().getString(C0126R.string.tp_settings_no_felica_default, atgs.QUICPAY.mo49970a(activity)), 33333));
                }
                asvc asvc2 = new asvc(this.f89840c, this.f89842e, this.f89838A);
                asvc2.mo49526a(a5, this.f89843f);
                arrayList2.add(asvc2);
            }
            if (!a6.isEmpty()) {
                if (this.f89863z) {
                    int i2 = a4.size() + a5.size() > 0 ? C0126R.string.tp_other_payment_methods_title : C0126R.string.tp_settings_payment_methods;
                    arrayList2.add(m74917b(activity, getString(i2), i2));
                }
                asvc asvc3 = new asvc(this.f89840c, this.f89842e, this.f89838A);
                asvc3.mo49526a(a6, this.f89843f);
                arrayList2.add(asvc3);
            }
            this.f89848k.mo60923a(arrayList2);
            m74915a((int) C0126R.C0129id.Fab).setVisibility(0);
            return;
        }
        this.f89856s.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo49527a(CardInfo cardInfo, aucb aucb) {
        Activity activity = getActivity();
        if (activity != null && cardInfo.mo59217a() && !aucb.mo50384b()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            Exception e = aucb.mo50387e();
            if (e instanceof rjp) {
                int a = ((rjp) e).mo24655a();
                if (a == 15012) {
                    String a2 = atgs.m75865a(cardInfo.f108344e).mo49970a(activity);
                    builder.setMessage(getResources().getString(C0126R.string.tp_felica_unchangeable_card_error_message, a2, a2)).setPositiveButton((int) C0126R.string.common_got_it, asvr.f89821a);
                } else if (a == 15013) {
                    builder.setMessage(getResources().getString(C0126R.string.tp_felica_update_mfi_message)).setPositiveButton((int) C0126R.string.tp_go_to_play_store_button, new asvs(this, builder));
                    builder.create().show();
                }
                builder.setMessage((int) C0126R.string.tp_felica_standard_error_message).setPositiveButton((int) C0126R.string.common_ok, asvt.f89824a);
                builder.create().show();
            }
        }
    }
}

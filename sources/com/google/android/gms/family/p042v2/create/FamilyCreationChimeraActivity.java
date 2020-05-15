package com.google.android.gms.family.p042v2.create;

import android.accounts.Account;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseIntArray;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.family.p042v2.model.BillingSignupData;
import com.google.android.gms.family.p042v2.model.BirthdayData;
import com.google.android.gms.family.p042v2.model.CanCreateFamilyData;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.PageDataMap;
import com.google.android.gms.family.p042v2.model.ProfileData;
import com.google.android.gms.family.p042v2.model.SetupParams;
import com.google.android.gms.family.p042v2.model.UpgradeParams;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FamilyCreationChimeraActivity extends deu implements wij, wlw, wme, wrc, wko, wiq, wkw, wkl, wrf, wgr, rka, wmh {

    /* renamed from: A */
    private rkb f31364A;

    /* renamed from: b */
    public String f31365b;

    /* renamed from: c */
    public wgj f31366c;

    /* renamed from: d */
    public byte[] f31367d;

    /* renamed from: e */
    public String f31368e;

    /* renamed from: f */
    public brcm f31369f = brcm.UNKNOWN_FAMILY_ROLE;

    /* renamed from: g */
    public brcm f31370g = brcm.UNKNOWN_FAMILY_ROLE;

    /* renamed from: h */
    public boolean f31371h;

    /* renamed from: i */
    public boolean f31372i;

    /* renamed from: j */
    public boolean f31373j;

    /* renamed from: k */
    public boolean f31374k;

    /* renamed from: l */
    public boolean f31375l;

    /* renamed from: m */
    public PageDataMap f31376m;

    /* renamed from: n */
    public UpgradeParams f31377n;

    /* renamed from: o */
    public SetupParams f31378o;

    /* renamed from: p */
    public ProfileData f31379p;

    /* renamed from: q */
    public CanCreateFamilyData f31380q;

    /* renamed from: r */
    public Calendar f31381r;

    /* renamed from: s */
    public wia f31382s;

    /* renamed from: t */
    public wgh f31383t;

    /* renamed from: u */
    public int f31384u = 1;

    /* renamed from: v */
    private SparseIntArray f31385v;

    /* renamed from: w */
    private boolean f31386w;

    /* renamed from: x */
    private boolean f31387x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f31388y;

    /* renamed from: z */
    private boolean f31389z;

    /* renamed from: A */
    private final void m23191A() {
        m23193C();
        getSupportLoaderManager().restartLoader(3, null, new wkc(this));
    }

    /* renamed from: B */
    private final void m23192B() {
        m23193C();
        getSupportLoaderManager().restartLoader(0, null, new wjh(this));
    }

    /* renamed from: C */
    private final void m23193C() {
        findViewById(C0126R.C0129id.fm_family_creation_loading_screen).setVisibility(0);
    }

    /* renamed from: D */
    private final boolean m23194D() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    /* renamed from: E */
    private final Intent m23195E() {
        Intent putExtra = new Intent().putExtra("accountName", this.f31365b);
        putExtra.putExtra("familyChanged", this.f31388y);
        if (this.f31366c.mo29096a() != null && !this.f31366c.mo29096a().isEmpty()) {
            putExtra.putExtra("consistencyToken", this.f31366c.mo29096a()).putExtra("tokenExpirationTimeSecs", this.f31366c.mo29098b());
        }
        return putExtra;
    }

    /* renamed from: F */
    private final FragmentTransaction m23196F() {
        if (this.f31376m.mo18560b(4)) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            String str = this.f31365b;
            PageData a = this.f31376m.mo18558a(4);
            wkp wkp = new wkp();
            Bundle bundle = new Bundle(2);
            bundle.putString("accountName", str);
            bundle.putParcelable("pageData", a);
            wkp.setArguments(bundle);
            return beginTransaction.replace(C0126R.C0129id.fm_family_creation_fragment_container, wkp).addToBackStack(null);
        } else if (this.f31376m.mo18560b(22)) {
            return getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_creation_fragment_container, wkm.m41983a(this.f31365b, this.f31376m.mo18558a(22), this.f31376m.mo18558a(18), this.f31376m.mo18558a(19))).addToBackStack(null);
        } else {
            if (this.f31376m.mo18560b(16)) {
                return getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_creation_fragment_container, wkx.m41992a(this.f31365b, this.f31376m.mo18558a(16), this.f31376m.mo18558a(18), this.f31376m.mo18558a(19))).addToBackStack(null);
            }
            return null;
        }
    }

    /* renamed from: G */
    private final void m23197G() {
        if (mo18458o()) {
            mo18453j();
        }
        brej[] brejArr = this.f31380q.f31431b;
        if (brejArr != null && brejArr.length > 0 && brejArr[0] == brej.LACKS_BIRTHDAY) {
            mo18452i();
        } else {
            wgm.m41917a(this, this.f31380q.f31432c, this.f31365b, new wiw(this), null, false).show();
        }
    }

    /* renamed from: H */
    private final BillingSignupData m23198H() {
        if (this.f31386w) {
            return this.f31377n.f31466a;
        }
        return this.f31378o.f31464a;
    }

    /* renamed from: I */
    private final WalletCustomTheme m23199I() {
        String stringExtra = getIntent().getStringExtra("predefinedTheme");
        int i = 0;
        if (!TextUtils.isEmpty(stringExtra)) {
            if (stringExtra.equals("play")) {
                i = 2132018702;
            } else if (stringExtra.equals("music")) {
                i = 2132018706;
            } else if (stringExtra.equals("youtube")) {
                i = -1;
            }
        }
        if (i == 0) {
            i = 2132018600;
        }
        if (i == -1) {
            return null;
        }
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.f110168a = qkj.m32287a(this, i);
        return walletCustomTheme;
    }

    /* renamed from: J */
    private final void m23200J() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().findFragmentByTag("upgrade-preconditions");
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(8192);
    }

    /* renamed from: K */
    private final void m23201K() {
        wgm.m41916a(this, new wiy(this), new wiv(this)).show();
    }

    /* renamed from: a */
    public final void mo18442a(boolean z) {
        this.f31389z = z;
    }

    /* renamed from: b */
    public final wia mo18443b() {
        return this.f31382s;
    }

    /* renamed from: c */
    public final void mo18446c(int i) {
        sbw sbw = wgn.f50624a;
        setResult(4, new Intent().putExtra("accountName", this.f31365b).putExtra("errorCode", i));
        finish();
    }

    /* renamed from: d */
    public final void mo18448d(boolean z) {
        m23200J();
        m23193C();
        getSupportLoaderManager().initLoader(1, null, new wju(this, z));
    }

    /* renamed from: e */
    public final void mo18449e() {
        if (cdtc.m134914b() && this.f31389z) {
            this.f31382s.mo29116b(32);
            setResult(1);
            finish();
        } else if (this.f31386w || this.f31380q.f31430a) {
            mo18445b(false);
        } else {
            m23197G();
        }
    }

    /* renamed from: g */
    public final void mo18450g() {
        this.f31375l = false;
        mo18455l();
    }

    public final Activity getActivity() {
        return this;
    }

    /* renamed from: h */
    public final void mo18451h() {
        if (this.f31386w || this.f31380q.f31430a) {
            mo18445b(false);
        } else {
            m23197G();
        }
    }

    /* renamed from: i */
    public final void mo18452i() {
        wir wir;
        if (this.f31379p.f31463f != null) {
            String str = this.f31365b;
            PageData a = this.f31376m.mo18558a(3);
            PageData a2 = this.f31376m.mo18558a(14);
            BirthdayData birthdayData = this.f31379p.f31463f;
            wir = new wir();
            Bundle bundle = new Bundle(4);
            bundle.putString("accountName", str);
            bundle.putParcelable("birthdayPageData", a);
            bundle.putParcelable("confirmPageData", a2);
            bundle.putParcelable("birthday", birthdayData);
            wir.setArguments(bundle);
        } else {
            String str2 = this.f31365b;
            PageData a3 = this.f31376m.mo18558a(3);
            PageData a4 = this.f31376m.mo18558a(14);
            wir = new wir();
            Bundle bundle2 = new Bundle(3);
            bundle2.putString("accountName", str2);
            bundle2.putParcelable("birthdayPageData", a3);
            bundle2.putParcelable("confirmPageData", a4);
            wir.setArguments(bundle2);
        }
        getSupportFragmentManager().beginTransaction().add(wir, "birthdayDialog").commitAllowingStateLoss();
    }

    /* renamed from: j */
    public final void mo18453j() {
        findViewById(C0126R.C0129id.fm_family_creation_loading_screen).setVisibility(8);
    }

    /* renamed from: k */
    public final void mo18454k() {
        this.f31387x = true;
        if (!this.f31372i && !this.f31371h) {
            m23192B();
            return;
        }
        mo18453j();
        mo18455l();
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
    /* renamed from: l */
    public final void mo18455l() {
        wmi wmi;
        if (this.f31389z && this.f31376m.mo18560b(35)) {
            mo18453j();
            this.f31389z = false;
            if (!cdst.m134852c() || !m23194D() || !this.f31383t.f50617a.equals("agsa")) {
                wmi = wmi.m42033a(this.f31365b, this.f31376m.mo18558a(35), null);
            } else {
                wmi = wmi.m42033a(this.f31365b, this.f31376m.mo18558a(35), new ArrayList());
            }
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_creation_fragment_container, wmi).addToBackStack(null).commitAllowingStateLoss();
        } else if (this.f31375l) {
            Intent addFlags = new Intent().setClassName(this, "com.google.android.gms.family.v2.invites.SendInvitationsActivity").putExtra("accountName", this.f31365b).putExtra("consistencyToken", this.f31366c.mo29096a()).putExtra("tokenExpirationTimeSecs", this.f31366c.mo29098b()).putExtra("appId", this.f31383t.f50617a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", stm.m36299a(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", spn.m35852a((Activity) this)).putExtra("fromCreate", true).putExtra("familyChanged", this.f31388y).putExtra("profileData", this.f31379p).putExtra("inviteeRole", this.f31369f.f142395g).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            if (cdst.m134852c() && this.f31383t.f50617a.equals("agsa")) {
                addFlags.putExtra("isDirectAddInvitations", m23194D());
            }
            startActivityForResult(addFlags, 2);
        } else {
            setResult(1, m23195E());
            this.f31382s.mo29116b(7);
            finish();
        }
    }

    /* renamed from: m */
    public final void mo18456m() {
        this.f31382s.mo29116b(32);
        setResult(3, m23195E());
        finish();
    }

    /* renamed from: n */
    public final void mo18457n() {
        if (!this.f31373j || m23196F() == null) {
            m23192B();
        } else {
            m23196F().commit();
        }
    }

    /* renamed from: o */
    public final boolean mo18458o() {
        return getSupportFragmentManager().findFragmentById(C0126R.C0129id.fm_family_creation_fragment_container) != null;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i == 2) {
                if (i2 == 1) {
                    if (intent.getStringExtra("consistencyToken") != null) {
                        this.f31366c.mo29097a(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0));
                    }
                    this.f31388y = intent.getBooleanExtra("familyChanged", this.f31388y);
                    if (cdst.m134851b() && this.f31388y) {
                        setResult(1, m23195E());
                        this.f31382s.mo29116b(31);
                        finish();
                        return;
                    }
                    this.f31375l = false;
                    mo18455l();
                } else if (this.f31376m.mo18560b(35)) {
                    this.f31382s.mo29116b(30);
                    this.f31375l = false;
                    this.f31389z = true;
                    getSupportLoaderManager().destroyLoader(0);
                    getSupportLoaderManager().destroyLoader(1);
                    getSupportLoaderManager().destroyLoader(2);
                    getSupportLoaderManager().destroyLoader(3);
                    getSupportLoaderManager().destroyLoader(4);
                    getSupportLoaderManager().destroyLoader(5);
                    getSupportLoaderManager().destroyLoader(6);
                    getSupportLoaderManager().destroyLoader(7);
                    mo18455l();
                } else {
                    mo18453j();
                    if (this.f31374k) {
                        m23193C();
                        getSupportLoaderManager().restartLoader(6, null, new wjo(this));
                    }
                }
            }
        } else if (i2 == -1) {
            this.f31382s.mo29116b(15);
            this.f31374k = true;
            this.f31388y = true;
            mo18454k();
        } else {
            mo18453j();
        }
    }

    public final void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C0126R.C0129id.fm_family_creation_fragment_container);
        if (findFragmentById == null) {
            mo18456m();
        } else if (findFragmentById instanceof wmi) {
            setResult(1, m23195E());
            this.f31382s.mo29116b(31);
            finish();
        } else {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        PageDataMap pageDataMap;
        Calendar calendar;
        super.onCreate(bundle);
        this.f31382s = new wia(this);
        setRequestedOrientation(1);
        String a = spn.m35852a((Activity) this);
        if (!rfz.m33557a(this).mo24610b(a)) {
            this.f31382s.mo29110a(3, 8);
            mo18446c(-3);
            return;
        }
        String stringExtra = getIntent().getStringExtra("accountName");
        this.f31365b = stringExtra;
        if (stringExtra == null) {
            this.f31382s.mo29110a(3, 13);
            mo18446c(-2);
            return;
        }
        Account[] a2 = adyd.m51363a(this).mo33916a("com.google");
        boolean z9 = false;
        Account account = null;
        for (Account account2 : a2) {
            if (account2.name.equals(this.f31365b)) {
                account = account2;
            }
        }
        if (account == null) {
            this.f31382s.mo29110a(3, 14);
            String str = this.f31365b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("Selected account: ");
            sb.append(str);
            sb.append(" doesn't exist on device");
            sb.toString();
            mo18446c(-2);
            return;
        }
        wgp.m41932a(this, getIntent(), a);
        this.f31383t = new wgh(getIntent().getStringExtra("appId"), Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        this.f31368e = getIntent().getStringExtra("referencePcid");
        this.f31366c = new wgj();
        if (bundle != null && bundle.getString("consistencyToken") != null) {
            this.f31366c.mo29097a(bundle.getString("consistencyToken"), bundle.getLong("tokenExpirationTimeSecs", 0));
        } else if (getIntent().getStringExtra("consistencyToken") != null) {
            this.f31366c.mo29097a(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0));
        }
        if (bundle != null && bundle.getByteArray("auditToken") != null) {
            this.f31367d = bundle.getByteArray("auditToken");
        } else if (getIntent().getByteArrayExtra("auditToken") != null) {
            this.f31367d = getIntent().getByteArrayExtra("auditToken");
        } else {
            bxvd da = bsqx.f146703c.mo74144da();
            bxtx a3 = bxtx.m123261a(ggj.m13107a());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsqx bsqx = (bsqx) da.f164949b;
            a3.getClass();
            bsqx.f146705a |= 1;
            bsqx.f146706b = a3;
            this.f31367d = ((bsqx) da.mo74062i()).mo73642k();
        }
        this.f31379p = bundle != null ? (ProfileData) bundle.getParcelable("profileData") : null;
        this.f31380q = bundle != null ? (CanCreateFamilyData) bundle.getParcelable("canCreateData") : null;
        this.f31378o = bundle != null ? (SetupParams) bundle.getParcelable("setupParams") : null;
        this.f31377n = bundle != null ? (UpgradeParams) bundle.getParcelable("upgradeParams") : null;
        int a4 = bundle != null ? brck.m113873a(bundle.getInt("pcidType")) : 0;
        if (a4 == 0) {
            a4 = 1;
        }
        this.f31384u = a4;
        if (bundle == null || !bundle.getBoolean("hasFamily", false)) {
            z = false;
        } else {
            z = true;
        }
        this.f31371h = z;
        if (bundle == null || !bundle.getBoolean("familyCreated", false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f31372i = z2;
        if (bundle == null || !bundle.getBoolean("isUpgradeFlow", false)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f31386w = z3;
        if (bundle == null || !bundle.getBoolean("inviteOnFinish", false)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f31375l = z4;
        if (bundle == null || !bundle.getBoolean("walletComplete", false)) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.f31387x = z5;
        if (bundle == null || !bundle.getBoolean("fopChanged", false)) {
            z6 = false;
        } else {
            z6 = true;
        }
        this.f31374k = z6;
        if (bundle == null || !bundle.getBoolean("fopRequested", false)) {
            z7 = false;
        } else {
            z7 = true;
        }
        this.f31373j = z7;
        if (bundle == null || !bundle.getBoolean("skipClicked", false)) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f31389z = z8;
        if (bundle != null) {
            pageDataMap = (PageDataMap) bundle.getParcelable("pageDataMap");
        } else {
            pageDataMap = null;
        }
        this.f31376m = pageDataMap;
        if (bundle != null) {
            calendar = (Calendar) bundle.getSerializable("pendingBirthday");
        } else {
            calendar = null;
        }
        this.f31381r = calendar;
        brcm a5 = bundle != null ? brcm.m113875a(bundle.getInt("inviteeRole")) : brcm.UNKNOWN_FAMILY_ROLE;
        this.f31369f = a5;
        if (a5 == null) {
            a5 = brcm.UNKNOWN_FAMILY_ROLE;
        }
        this.f31369f = a5;
        if (bundle != null && bundle.getBoolean("familyChanged")) {
            z9 = true;
        }
        this.f31388y = z9;
        if (this.f31364A == null) {
            boolean c = cdsw.m134870c();
            rjy rjy = new rjy(this);
            rjy.mo24778a(this.f31365b);
            rjo rjo = awbv.f94154a;
            awbt awbt = new awbt();
            awbt.f94148a = c ^ true ? 1 : 0;
            rjy.mo24780a(rjo, awbt.mo51834a());
            rjo rjo2 = allr.f73629a;
            allp allp = new allp();
            allp.f73626a = 80;
            rjy.mo24780a(rjo2, allp.mo40491a());
            rjy.mo24776a(this, this);
            this.f31364A = rjy.mo24784b();
        }
        wia wia = this.f31382s;
        String str2 = this.f31365b;
        wgh wgh = this.f31383t;
        wia.mo29114a(str2, wgh.f50618b, wgh.f50617a);
        this.f31382s.mo29116b(2);
        setContentView((int) C0126R.C0128layout.fm_activity_family_creation_v2);
        mo18453j();
        if (this.f31381r != null) {
            m23191A();
        } else if (!mo18458o()) {
            m23193C();
            this.f31385v = new SparseIntArray();
            getSupportLoaderManager().initLoader(5, null, new wjx(this));
            mo18444b(5);
            getSupportLoaderManager().initLoader(7, null, new wjk(this));
            mo18444b(7);
            getSupportLoaderManager().initLoader(6, null, new wjo(this));
            mo18444b(6);
            getSupportLoaderManager().initLoader(4, null, new wjb(this));
            mo18444b(4);
        }
    }

    public final void onPause() {
        super.onPause();
        getSupportLoaderManager().destroyLoader(2);
        getSupportLoaderManager().destroyLoader(5);
        getSupportLoaderManager().destroyLoader(7);
        getSupportLoaderManager().destroyLoader(6);
        getSupportLoaderManager().destroyLoader(4);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("profileData", this.f31379p);
        bundle.putParcelable("canCreateData", this.f31380q);
        bundle.putParcelable("upgradeParams", this.f31377n);
        bundle.putParcelable("setupParams", this.f31378o);
        bundle.putBoolean("hasFamily", this.f31371h);
        bundle.putBoolean("familyCreated", this.f31372i);
        bundle.putBoolean("isUpgradeFlow", this.f31386w);
        bundle.putBoolean("inviteOnFinish", this.f31375l);
        bundle.putBoolean("walletComplete", this.f31387x);
        bundle.putBoolean("fopChanged", this.f31374k);
        bundle.putBoolean("fopRequested", this.f31373j);
        bundle.putBoolean("skipClicked", this.f31389z);
        bundle.putParcelable("pageDataMap", this.f31376m);
        bundle.putInt("inviteeRole", this.f31369f.f142395g);
        int i = this.f31384u;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("pcidType", i2);
            Calendar calendar = this.f31381r;
            if (calendar != null) {
                bundle.putSerializable("pendingBirthday", calendar);
            }
            if (this.f31366c.mo29096a() != null && !this.f31366c.mo29096a().isEmpty()) {
                bundle.putString("consistencyToken", this.f31366c.mo29096a());
                bundle.putLong("tokenExpirationTimeSecs", this.f31366c.mo29098b());
            }
            bundle.putBoolean("familyChanged", this.f31388y);
            bundle.putByteArray("auditToken", this.f31367d);
            return;
        }
        throw null;
    }

    /* renamed from: p */
    public final wgh mo18459p() {
        return this.f31383t;
    }

    /* renamed from: q */
    public final boolean mo18460q() {
        mo18453j();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (this.f31376m.mo18560b(1)) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            String str = this.f31365b;
            PageData a = this.f31376m.mo18558a(1);
            wik wik = new wik();
            Bundle bundle = new Bundle(2);
            bundle.putString("accountName", str);
            bundle.putParcelable("pageData", a);
            wik.setArguments(bundle);
            beginTransaction.add((int) C0126R.C0129id.fm_family_creation_fragment_container, wik).commitAllowingStateLoss();
        } else if (cdtc.m134914b() && this.f31376m.mo18560b(37)) {
            FragmentTransaction beginTransaction2 = supportFragmentManager.beginTransaction();
            byte[] bArr = this.f31367d;
            String str2 = this.f31365b;
            PageData a2 = this.f31376m.mo18558a(37);
            wlx wlx = new wlx();
            Bundle bundle2 = new Bundle(4);
            bundle2.putByteArray("auditToken", bArr);
            bundle2.putString("accountName", str2);
            bundle2.putParcelable("pageData", a2);
            wlx.setArguments(bundle2);
            beginTransaction2.add((int) C0126R.C0129id.fm_family_creation_fragment_container, wlx).commitAllowingStateLoss();
        } else if (this.f31376m.mo18560b(2)) {
            supportFragmentManager.beginTransaction().add((int) C0126R.C0129id.fm_family_creation_fragment_container, wmf.m42026a(this.f31367d, this.f31365b, this.f31376m.mo18558a(2), this.f31379p)).commitAllowingStateLoss();
        } else if (this.f31376m.mo18560b(22)) {
            supportFragmentManager.beginTransaction().add((int) C0126R.C0129id.fm_family_creation_fragment_container, wkm.m41983a(this.f31365b, this.f31376m.mo18558a(22), this.f31376m.mo18558a(18), this.f31376m.mo18558a(19))).commitAllowingStateLoss();
        } else if (!this.f31376m.mo18560b(16)) {
            return false;
        } else {
            supportFragmentManager.beginTransaction().add((int) C0126R.C0129id.fm_family_creation_fragment_container, wkx.m41992a(this.f31365b, this.f31376m.mo18558a(16), this.f31376m.mo18558a(18), this.f31376m.mo18558a(19))).commitAllowingStateLoss();
        }
        return true;
    }

    /* renamed from: r */
    public final void mo18461r() {
        WalletCustomTheme I = m23199I();
        boolean c = cdsw.m134870c();
        awkx awkx = new awkx(this);
        awkx.mo52226a(Base64.decode(m23198H().f31425a, 0));
        awkx.mo52188a(new Account(this.f31365b, "com.google"));
        awkx.mo52187a(c ^ true ? 1 : 0);
        awkx.mo52190a(I);
        this.f31382s.mo29116b(6);
        startActivityForResult(awkx.mo52186a(), 1);
    }

    /* renamed from: s */
    public final void mo18462s() {
        m23193C();
        getSupportLoaderManager().initLoader(8, null, new wje(this));
    }

    /* renamed from: t */
    public final void mo18463t() {
        mo18456m();
    }

    /* renamed from: u */
    public final boolean mo18464u() {
        return this.f31387x;
    }

    /* renamed from: v */
    public final rkb mo18465v() {
        return this.f31364A;
    }

    /* renamed from: w */
    public final wgj mo18466w() {
        return this.f31366c;
    }

    /* renamed from: x */
    public final void mo18467x() {
        wgm.m41914a((Activity) this).show();
        m23200J();
    }

    /* renamed from: y */
    public final void mo18468y() {
        m23200J();
    }

    /* renamed from: z */
    public final void mo18469z() {
        brej[] brejArr;
        if (this.f31385v.size() == 0) {
            boolean z = this.f31370g == brcm.HEAD_OF_HOUSEHOLD && this.f31371h && this.f31373j;
            this.f31386w = z;
            if (!z) {
                CanCreateFamilyData canCreateFamilyData = this.f31380q;
                if (!canCreateFamilyData.f31430a && (brejArr = canCreateFamilyData.f31431b) != null && brejArr.length > 0 && brejArr[0] != brej.LACKS_BIRTHDAY && this.f31380q.f31432c == null) {
                    m23201K();
                    return;
                } else if (this.f31381r != null) {
                    if (!this.f31380q.f31430a) {
                        m23197G();
                        this.f31381r = null;
                        return;
                    } else if (this.f31373j) {
                        getSupportLoaderManager().initLoader(2, null, new wjr(this));
                        return;
                    } else {
                        mo18445b(true);
                        getSupportFragmentManager().executePendingTransactions();
                        this.f31381r = null;
                        return;
                    }
                } else if (this.f31380q.f31430a) {
                    getSupportLoaderManager().initLoader(2, null, new wjr(this));
                    return;
                } else if (!this.f31376m.mo18560b(2)) {
                    m23197G();
                    return;
                }
            }
            if (this.f31376m.mo18560b(1) || this.f31376m.mo18560b(2) || this.f31376m.mo18560b(22) || this.f31376m.mo18560b(16)) {
                mo18460q();
            } else {
                m23201K();
            }
        }
    }

    /* renamed from: a */
    public final void mo18436a() {
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_creation_fragment_container, wmf.m42026a(this.f31367d, this.f31365b, this.f31376m.mo18558a(2), this.f31379p)).addToBackStack(null).commit();
    }

    /* renamed from: b */
    public final void mo18444b(int i) {
        this.f31385v.put(i, 1);
    }

    /* renamed from: b */
    public final void mo18445b(boolean z) {
        FragmentTransaction fragmentTransaction = null;
        if (getIntent().hasExtra("tosContent")) {
            fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_creation_fragment_container, wrd.m42166a(this.f31367d, this.f31365b, getIntent().getStringExtra("tosContent"), getIntent().getStringExtra("tosContinueButton"), getIntent().getStringExtra("tosMoreButton"))).addToBackStack(null);
        } else if (this.f31373j) {
            fragmentTransaction = m23196F();
        }
        if (fragmentTransaction == null) {
            m23192B();
        } else if (z) {
            mo18453j();
            fragmentTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransaction.commit();
        }
    }

    /* renamed from: c */
    public final void mo18447c(boolean z) {
        if (this.f31387x) {
            mo18454k();
        } else if (cdsk.m134836b() && z) {
            mo18462s();
        } else if (this.f31386w) {
            getWindow().addFlags(8192);
            String str = this.f31365b;
            String str2 = this.f31368e;
            int i = this.f31384u;
            int i2 = i - 1;
            if (i != 0) {
                wrg wrg = new wrg();
                Bundle bundle = new Bundle(4);
                bundle.putString("accountName", str);
                bundle.putString("referencePcid", str2);
                bundle.putInt("pcidType", i2);
                bundle.putBoolean("headless", z);
                wrg.setArguments(bundle);
                wrg.show(getSupportFragmentManager(), "upgrade-preconditions");
                return;
            }
            throw null;
        } else if (!cdsk.m134836b() && z) {
            awbt awbt = new awbt();
            awbt.mo51835a(1);
            mo18438a(awbv.m79579a(this, awbt.mo51834a()));
        } else {
            mo18461r();
        }
    }

    /* renamed from: a */
    public final void mo18437a(int i) {
        this.f31385v.delete(i);
    }

    /* renamed from: a */
    public final void mo18438a(awkh awkh) {
        m23193C();
        ExecuteBuyFlowRequest executeBuyFlowRequest = new ExecuteBuyFlowRequest(Base64.decode(m23198H().f31426b, 0), null, m23199I());
        roz b = rpa.m34196b();
        b.f43472a = new awka(awkh, executeBuyFlowRequest);
        awkh.mo24732b(b.mo24977a()).mo50373a(new wiu(this));
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        wgm.m41915a(this, new wit(this)).show();
    }

    /* renamed from: a */
    public final void mo18439a(PageData pageData) {
        wgm.m41917a(this, pageData, this.f31365b, new wix(this), null, false).show();
        m23200J();
    }

    /* renamed from: a */
    public final void mo18440a(Calendar calendar) {
        this.f31381r = calendar;
        m23191A();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo18441a(rkj rkj) {
        if (rkj.mo24825s().equals(Status.f30107a)) {
            mo18453j();
            this.f31388y = true;
            mo18454k();
        } else if (rkj.mo24825s().mo17709b()) {
            try {
                startIntentSenderForResult(rkj.mo24825s().f30117k.getIntentSender(), 1, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                mo18453j();
                this.f31382s.mo29110a(3, 5);
                wgn.m41926f("FamilyCreationChimeraActivity", "Error starting pending intent: ", e);
            }
        }
    }
}

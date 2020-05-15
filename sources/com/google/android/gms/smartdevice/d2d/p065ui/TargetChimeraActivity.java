package com.google.android.gms.smartdevice.d2d.p065ui;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TargetChimeraActivity extends deu implements arwr, arok {

    /* renamed from: b */
    public static final sek f108028b = ascp.m73787a("D2D", "UI", "TargetChimeraActivity");

    /* renamed from: c */
    public String f108029c;

    /* renamed from: d */
    ExecutorService f108030d = snp.m35704b(9);

    /* renamed from: e */
    public final Queue f108031e = new ArrayDeque();

    /* renamed from: f */
    int f108032f = 1;

    /* renamed from: g */
    public boolean f108033g;

    /* renamed from: h */
    public volatile Future f108034h = null;

    /* renamed from: i */
    public arlt f108035i;

    /* renamed from: j */
    public boolean f108036j = false;

    /* renamed from: k */
    public BootstrapCompletionResult f108037k;

    /* renamed from: l */
    private Bundle f108038l;

    /* renamed from: m */
    private arps f108039m;

    /* renamed from: n */
    private armc f108040n;

    /* renamed from: o */
    private boolean f108041o = false;

    /* renamed from: p */
    private arop f108042p;

    /* renamed from: q */
    private arop f108043q;

    /* renamed from: r */
    private D2dOptions f108044r;

    /* renamed from: s */
    private String f108045s;

    /* renamed from: a */
    public static Intent m92752a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.smartdevice.d2d.ui.TargetActivity");
    }

    /* renamed from: b */
    private final arop m92755b(Bundle bundle) {
        if (!cgqv.m146718c() || "SETTINGS".equals(cgqv.m146717b())) {
            return new aroo(this, this, getSupportFragmentManager(), this.f108045s);
        }
        return new aros(this, getSupportFragmentManager(), bundle, this.f108040n, this.f108045s);
    }

    /* renamed from: i */
    private final void m92756i() {
        int i;
        this.f108040n.mo48629a();
        BootstrapCompletionResult bootstrapCompletionResult = this.f108037k;
        if (bootstrapCompletionResult != null) {
            i = bootstrapCompletionResult.f107801a;
        } else {
            i = 0;
        }
        int i2 = 1;
        if (i == 1) {
            i2 = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
        } else if (i == 2) {
            i2 = 102;
        }
        mo59126a(i2, new Intent());
    }

    /* renamed from: j */
    private final void m92757j() {
        boeb a;
        arps arps = this.f108039m;
        if (arps != null && (a = arps.f88098i.mo48628a(getApplicationContext(), arps.f88102m)) != null) {
            arps.f88090a.mo25409a("Sent D2DEvent\n%s", a);
        }
    }

    /* renamed from: e */
    public final void mo59130e() {
        this.f108039m.mo48739a(getApplicationContext());
        if (this.f108032f != 1) {
            arop arop = this.f108042p;
            if (cgpa.f187426a.mo6606a().mo84208b() && !arop.f88021a.popBackStackImmediate("instruction", 0)) {
                arop.f88021a.popBackStack((String) null, 1);
            } else {
                arop.f88021a.popBackStack("instruction", 0);
            }
            this.f108032f = 1;
        }
    }

    /* renamed from: g */
    public final void mo59131g() {
        this.f108039m.f88098i.mo48630a(15);
        mo59126a(1, new Intent());
    }

    /* renamed from: h */
    public final boolean mo59132h() {
        D2dOptions d2dOptions = this.f108044r;
        return d2dOptions != null && d2dOptions.f10855a;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            sek sek = f108028b;
            StringBuilder sb = new StringBuilder(46);
            sb.append("DM_START_REQUEST_CODE result code: ");
            sb.append(i2);
            sek.mo25409a(sb.toString(), new Object[0]);
            if (!mo59129a(true)) {
                mo59127a(this.f108038l);
            }
        }
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
    public final void onBackPressed() {
        if (this.f108032f != 1) {
            C1349sg sgVar = new C1349sg(this);
            sgVar.mo15905b((int) C0126R.string.smartdevice_alert_exit_setup_title);
            sgVar.mo15906b((int) C0126R.string.smartdevice_alert_quit_button, new arpb(this));
            sgVar.mo15892a((int) C0126R.string.common_cancel, (DialogInterface.OnClickListener) null);
            sgVar.mo15910c();
            return;
        }
        arop arop = this.f108043q;
        if (arop == null) {
            if (this.f108042p.mo48716c()) {
                this.f108042p.mo48715b();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("intentionally_canceled", true);
            mo59126a(0, intent);
        } else if (arop.mo48716c()) {
            this.f108043q.mo48715b();
        } else {
            this.f108043q.mo48715b();
            this.f108043q = null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0194  */
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        arop arop;
        int a;
        bxvd bxvd;
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        Intent intent = getIntent();
        this.f108029c = intent.getStringExtra("smartdevice.theme");
        this.f108044r = D2dOptions.m6591a(intent.getExtras());
        this.f108035i = arqd.m73298c(this);
        bjbb bjbb = new bjbb(bjbc.m103136a());
        bjbb.f122457a = 2132018260;
        bjbb.f122458b = false;
        setTheme(bjbb.mo64964a().mo64966a(this.f108029c));
        setContentView((int) C0126R.C0128layout.smartdevice_fragment_container);
        if (bundle == null) {
            bundle2 = Bundle.EMPTY;
        } else {
            bundle2 = bundle;
        }
        Bundle bundle3 = (Bundle) bundle2.getParcelable("smartdevice.results");
        if (bundle3 == null) {
            bundle3 = new Bundle();
        }
        this.f108038l = bundle3;
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("smartdevice.managed_intents");
        if (parcelableArrayList != null) {
            this.f108031e.addAll(parcelableArrayList);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        arps arps = (arps) supportFragmentManager.findFragmentByTag("resources_fragment");
        if (arps == null) {
            arps = new arps();
            supportFragmentManager.beginTransaction().add(arps, "resources_fragment").commit();
        }
        this.f108039m = arps;
        armc armc = arps.f88098i;
        this.f108040n = armc;
        String stringExtra = intent.getStringExtra("callerIdentity");
        if ("suw".equals(stringExtra)) {
            bxvd bxvd2 = armc.f87880c;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            boeb boeb = (boeb) bxvd2.f164949b;
            boeb boeb2 = boeb.f132758u;
            boeb.f132779t = 1;
            boeb.f132760a |= 1048576;
        } else if ("auth".equals(stringExtra)) {
            bxvd bxvd3 = armc.f87880c;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            boeb boeb3 = (boeb) bxvd3.f164949b;
            boeb boeb4 = boeb.f132758u;
            boeb3.f132779t = 3;
            boeb3.f132760a |= 1048576;
        }
        armc armc2 = this.f108040n;
        if (!cgqs.f187523a.mo6606a().mo84313Z()) {
            if (TextUtils.isEmpty(getString(C0126R.string.smartdevice_setup_google_app_trigger))) {
                C1189mi a2 = C1188mh.m19636a(getResources().getConfiguration());
                if (a2.mo15463a() > 0) {
                    f108028b.mo25414c("Using legacy instructions for %s", a2.mo15465c());
                }
            } else {
                if (cgqv.m146718c()) {
                    arop = new arou(this, getSupportFragmentManager(), bundle, armc2);
                } else {
                    arop = new aros(this, getSupportFragmentManager(), bundle, armc2, this.f108045s);
                }
                this.f108042p = arop;
                armc armc3 = this.f108040n;
                a = boea.m111109a(arop.mo48711a());
                bxvd = armc3.f87880c;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boeb boeb5 = (boeb) bxvd.f164949b;
                int i2 = a - 1;
                boeb boeb6 = boeb.f132758u;
                if (a == 0) {
                    boeb5.f132764e = i2;
                    boeb5.f132760a |= 32;
                    if (bundle != null) {
                        this.f108032f = bundle.getInt("smartdevice.savedState", 1);
                        this.f108045s = bundle.getString("deviceName", this.f108045s);
                        Bundle bundle4 = bundle.getBundle("secondaryInstrState");
                        if (bundle4 != null) {
                            this.f108043q = m92755b(bundle4);
                            return;
                        }
                        return;
                    }
                    this.f108042p.mo48713a(true);
                    return;
                }
                throw null;
            }
        }
        arop = new aroo(this, this, getSupportFragmentManager(), bundle);
        this.f108042p = arop;
        armc armc32 = this.f108040n;
        a = boea.m111109a(arop.mo48711a());
        bxvd = armc32.f87880c;
        if (bxvd.f164950c) {
        }
        boeb boeb52 = (boeb) bxvd.f164949b;
        int i22 = a - 1;
        boeb boeb62 = boeb.f132758u;
        if (a == 0) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            m92757j();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (this.f108034h != null && !this.f108034h.isCancelled()) {
            this.f108034h.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (this.f108041o && this.f108034h != null) {
            this.f108041o = false;
            this.f108034h = null;
            this.f108031e.clear();
            m92753a(this.f108038l, (List) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("smartdevice.savedState", this.f108032f);
        bundle.putParcelable("smartdevice.results", this.f108038l);
        bundle.putString("deviceName", this.f108045s);
        this.f108042p.mo48712a(bundle);
        if (this.f108043q != null) {
            Bundle bundle2 = new Bundle();
            this.f108043q.mo48712a(bundle2);
            bundle.putBundle("secondaryInstrState", bundle2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f108031e);
        bundle.putParcelableArrayList("smartdevice.managed_intents", arrayList);
    }

    /* renamed from: a */
    private final void m92753a(Bundle bundle, List list) {
        this.f108041o = true;
        if (!cgqs.m146606l()) {
            mo59127a(bundle);
        } else if (list != null) {
            this.f108034h = this.f108030d.submit(new aroz(this, list, bundle));
        } else {
            mo59127a(bundle);
        }
    }

    /* renamed from: b */
    public final void mo48707b(int i, Bundle bundle) {
        int i2;
        String string;
        f108028b.mo25412b("onAction %d", Integer.valueOf(i));
        if (i == 116 && (string = bundle.getString("deviceName")) != null) {
            this.f108045s = string;
        }
        arop arop = this.f108043q;
        if (arop != null && arop.mo48714a(i)) {
            this.f108043q.mo48707b(i, bundle);
            if (i == 116) {
                f108028b.mo25414c("Updating primary with device name", new Object[0]);
                this.f108042p.mo48707b(116, bundle);
            }
        } else if (this.f108042p.mo48714a(i)) {
            this.f108042p.mo48707b(i, bundle);
        } else {
            sek sek = f108028b;
            Integer valueOf = Integer.valueOf(i);
            sek.mo25409a("Handling action %d", valueOf);
            switch (i) {
                case 108:
                case 118:
                    mo59131g();
                    return;
                case 109:
                case 110:
                case 114:
                case 116:
                default:
                    f108028b.mo25416d("Unknown action %d", valueOf);
                    return;
                case 111:
                    if (this.f108032f == 8) {
                        f108028b.mo25416d("Already connected", new Object[0]);
                        return;
                    }
                    arop arop2 = this.f108043q;
                    if (arop2 == null) {
                        i2 = boea.m111109a(this.f108042p.mo48711a());
                    } else {
                        i2 = boea.m111109a(arop2.mo48711a());
                    }
                    bxvd bxvd = this.f108040n.f87880c;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    boeb boeb = (boeb) bxvd.f164949b;
                    int i3 = i2 - 1;
                    boeb boeb2 = boeb.f132758u;
                    if (i2 != 0) {
                        boeb.f132778s = i3;
                        boeb.f132760a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                        arpg arpg = new arpg();
                        arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
                        arpg.f88058b = getString(C0126R.string.smartdevice_d2d_target_continue_description);
                        m92754a(arpg.mo48731a());
                        this.f108032f = 8;
                        return;
                    }
                    throw null;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                    if (!this.f108036j) {
                        arpc arpc = new arpc(this);
                        C1349sg sgVar = new C1349sg(this);
                        sgVar.mo15905b((int) C0126R.string.common_something_went_wrong);
                        sgVar.mo15906b((int) C0126R.string.common_try_again, arpc);
                        sgVar.mo15892a((int) C0126R.string.common_skip, arpc);
                        sgVar.mo15902a(false);
                        sgVar.mo15910c();
                        this.f108036j = true;
                        return;
                    }
                    return;
                case 113:
                    String string2 = bundle.getString("pin.code");
                    if (this.f108032f != 7) {
                        m92754a(asan.m73740a(!cgqs.m146608n() ? bowh.DEFAULT : arns.m73194a(this), string2, false, false, aqzm.UNKNOWN));
                        this.f108032f = 7;
                        return;
                    }
                    return;
                case 115:
                    mo59130e();
                    return;
                case 117:
                    arop b = m92755b(null);
                    this.f108043q = b;
                    b.mo48713a(false);
                    return;
            }
        }
    }

    /* renamed from: a */
    private final void m92754a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.setCustomAnimations(C0126R.anim.slide_next_in, C0126R.anim.slide_next_out, C0126R.anim.slide_back_in, C0126R.anim.slide_back_out);
        beginTransaction.replace(C0126R.C0129id.fragment_container, fragment).addToBackStack(null).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59126a(int i, Intent intent) {
        m92757j();
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo59127a(Bundle bundle) {
        int i;
        int i2;
        this.f108040n.mo48629a();
        int i3 = 0;
        if (bundle.containsKey("restoreToken")) {
            bxvd bxvd = this.f108040n.f87880c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boeb boeb = (boeb) bxvd.f164949b;
            boeb boeb2 = boeb.f132758u;
            boeb.f132760a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            boeb.f132773n = true;
        }
        Intent intent = new Intent();
        BootstrapCompletionResult bootstrapCompletionResult = this.f108037k;
        if (bootstrapCompletionResult != null) {
            i3 = bootstrapCompletionResult.f107801a;
        }
        if (i3 == 1) {
            i2 = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
        } else if (i3 != 2) {
            i2 = -1;
        } else {
            i = 102;
            mo59126a(i, intent);
        }
        intent.putExtras(bundle);
        i = i2;
        mo59126a(i, intent);
    }

    /* renamed from: a */
    public final void mo59128a(Bundle bundle, boolean z, BootstrapCompletionResult bootstrapCompletionResult) {
        boolean z2;
        this.f108038l = bundle;
        this.f108037k = bootstrapCompletionResult;
        if (bootstrapCompletionResult.f107806f == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f108033g = z2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("accounts");
        if (z && parcelableArrayList != null) {
            m92754a(arws.m73628a(parcelableArrayList, bundle.getString("restoreAccount")));
            this.f108032f = 9;
        } else if (mo59132h() && parcelableArrayList == null) {
            m92756i();
        } else {
            mo48885a(parcelableArrayList);
        }
    }

    /* renamed from: a */
    public final void mo48885a(ArrayList arrayList) {
        String string = this.f108038l.getString("restoreAccount");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        Account account = null;
        for (int i = 0; i < size; i++) {
            Account account2 = new Account(((Bundle) arrayList.get(i)).getString("name"), "com.google");
            if (account2.name != null && account2.name.equals(string)) {
                account = account2;
            }
            arrayList2.add(account2);
        }
        if (account == null && arrayList2.size() > 0) {
            account = (Account) arrayList2.get(0);
        }
        C1240of a = C1240of.m19758a(account, arrayList2);
        Account account3 = (Account) a.f26798a;
        List list = (List) a.f26799b;
        if (account3 != null && list != null) {
            this.f108039m.f88098i.mo48631a(10, list.size());
            this.f108038l.putString("authAccount", account3.name);
            this.f108038l.putString("accountType", account3.type);
            m92753a(this.f108038l, list);
        } else if (mo59132h()) {
            m92756i();
        } else {
            mo59131g();
        }
    }

    /* renamed from: a */
    public final boolean mo59129a(boolean z) {
        if (z) {
            this.f108031e.poll();
        }
        Intent intent = (Intent) this.f108031e.peek();
        if (intent == null) {
            return false;
        }
        startActivityForResult(intent, 2);
        return true;
    }
}

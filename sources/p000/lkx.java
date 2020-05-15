package p000;

import android.accounts.Account;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.assist.AssistStructure;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.SearchView;
import android.support.p002v7.widget.Toolbar;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: lkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lkx extends lim implements bqfp, lky {

    /* renamed from: i */
    private static final srn f26271i = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: j */
    private static final long f26272j = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: k */
    private static final Comparator f26273k = lla.f26289a;

    /* renamed from: d */
    public final lkw f26274d;

    /* renamed from: e */
    public final lkz f26275e;

    /* renamed from: f */
    public final lrc f26276f;

    /* renamed from: g */
    public final List f26277g = new ArrayList();

    /* renamed from: h */
    public liv f26278h;

    /* renamed from: l */
    private final KeyguardManager f26279l;

    /* renamed from: m */
    private final Account f26280m;

    /* renamed from: n */
    private final PackageManager f26281n;

    /* renamed from: o */
    private final AssistStructure f26282o;

    /* renamed from: p */
    private final kpk f26283p;

    /* renamed from: q */
    private lis f26284q;

    /* renamed from: r */
    private RecyclerView f26285r;

    /* renamed from: s */
    private View f26286s;

    /* renamed from: t */
    private final lkd f26287t;

    /* renamed from: u */
    private final lkb f26288u;

    static {
        if (lla.f26289a == null) {
            lla.f26289a = new lla();
        }
    }

    public lkx(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        this.f26282o = (AssistStructure) bundle.getParcelable("android.view.autofill.extra.ASSIST_STRUCTURE");
        this.f26281n = lir.getPackageManager();
        kre a = krc.m18382a(lir);
        kdi a2 = a.mo14831f().mo15081a();
        if (a2 != null) {
            Account account = a2.f23888d;
            if (account != null) {
                this.f26280m = account;
                this.f26274d = new lkw(this);
                lkd lkd = new lkd(lir, this.f26280m.name);
                this.f26287t = lkd;
                this.f26284q = new lkc(lkd.f26245a, lkd.f26246b);
                this.f26288u = new lkb(lir, this.f26280m.name);
                this.f26279l = (KeyguardManager) lir.getSystemService(KeyguardManager.class);
                this.f26283p = a.mo14833h();
                this.f26276f = lrc.m19570a(lir);
                FillForm fillForm = (FillForm) lqx.m19548a(bundle.getBundle("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL"));
                if (this.f26282o == null || fillForm == null) {
                    this.f26275e = new llg(lir, bundle, this, this.f26288u, this.f26283p);
                } else {
                    this.f26275e = new llm(lir, bundle, this, fillForm);
                }
            } else {
                throw new lik("Profile has no account");
            }
        } else {
            throw new lik("Profile is not set");
        }
    }

    /* renamed from: b */
    private final void m19284b(Throwable th) {
        this.f26286s.setVisibility(8);
        bnsl bnsl = (bnsl) f26271i.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        mo15228a(this.f26159a);
        mo15165a(0);
    }

    /* renamed from: h */
    private final void m19285h() {
        mo15229a(true);
        if (this.f26160b.getBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllersetUpLockDialogShowing")) {
            m19286i();
        }
        this.f26275e.mo15236d();
    }

    /* renamed from: i */
    private final void m19286i() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f26159a);
        this.f26160b.putBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllersetUpLockDialogShowing", true);
        builder.setMessage((int) C0126R.string.autofill_reset_saved_password_description).setPositiveButton((int) C0126R.string.common_settings, new lkv(this)).setNegativeButton((int) C0126R.string.common_cancel, new lku(this)).setOnDismissListener(new lkt(this)).show();
    }

    /* renamed from: a */
    public final bmxv mo15227a(String str) {
        lkw lkw = this.f26274d;
        if (str != null) {
            List list = lkw.f26605d;
            int size = list.size();
            int i = 0;
            while (i < size) {
                kct kct = (kct) list.get(i);
                kcs b = kct.mo14369b();
                String valueOf = String.valueOf(b.mo14375b());
                String valueOf2 = String.valueOf(b.mo14374a());
                i++;
                if ((valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)).equals(str)) {
                    return bmxv.m108566b(kct);
                }
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: b */
    public final void mo15231b(int i, Intent intent) {
        if (intent != null) {
            mo15167a(i, intent);
        } else {
            mo15165a(i);
        }
    }

    /* renamed from: a */
    public final void mo15164a() {
        int i;
        this.f26278h = liw.m19221a(this.f26159a);
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019642;
        } else {
            i = 2132019639;
        }
        lir.setTheme(i);
        this.f26159a.setContentView((int) C0126R.C0128layout.autofill_recyclerview_activity);
        Toolbar toolbar = (Toolbar) this.f26159a.findViewById(C0126R.C0129id.toolbar);
        this.f26159a.mo8626a(toolbar);
        C1341rz aW = this.f26159a.mo8628aW();
        if (aW != null) {
            aW.mo15845a(this.f26275e.mo15232a());
            aW.mo15853b(true);
            toolbar.mo1678a(new lkq(this));
        }
        this.f26286s = this.f26159a.findViewById(16908301);
        this.f26285r = (RecyclerView) this.f26159a.findViewById(16908298);
        this.f26285r.setLayoutManager(new aah());
        this.f26285r.setAdapter(this.f26274d);
        mo15229a(false);
        if (this.f26160b.getBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllersetUpLockDialogShowing")) {
            m19286i();
        }
        this.f26275e.mo15236d();
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        if (this.f26160b.getBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerapi_resolution_started")) {
            this.f26160b.putBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerapi_resolution_started", false);
            m19285h();
        }
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            this.f26160b.putLong("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerauthTimeStamp", SystemClock.elapsedRealtime());
            this.f26275e.mo15234b();
            return;
        }
        this.f26275e.mo15235c();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        String str;
        int i;
        int i2;
        int i3;
        bnic bnic = (bnic) obj;
        this.f26160b.putInt("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllernumTimesConsecutiveFetchFail", 0);
        this.f26286s.setVisibility(8);
        this.f26285r.setVisibility(0);
        ArrayList arrayList = new ArrayList(bnic.size());
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            kct kct = (kct) a.next();
            if (kct.mo14368a() instanceof Credential) {
                kcv kcv = ((Credential) kct.mo14368a()).f11610c;
                if (kcv instanceof kck) {
                    try {
                        this.f26281n.getPackageInfo(((kck) kcv).f23817a, 0);
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
                arrayList.add(kct);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            kct kct2 = (kct) arrayList.get(i4);
            kcv kcv2 = ((Credential) kct2.mo14368a()).f11610c;
            String str2 = kcv2.f23841b;
            String substring = str2.substring(str2.indexOf(64) + 1);
            if (kcv2 instanceof kck) {
                str = substring.substring(substring.indexOf(46) + 1).replace(".", "");
            } else {
                int indexOf = substring.indexOf("www.");
                if (indexOf != -1) {
                    i = indexOf + 4;
                } else {
                    i = -1;
                }
                int indexOf2 = substring.indexOf("http://");
                if (indexOf2 != -1) {
                    i2 = indexOf2 + 7;
                } else {
                    i2 = -1;
                }
                int indexOf3 = substring.indexOf("https://");
                if (indexOf3 != -1) {
                    i3 = indexOf3 + 8;
                } else {
                    i3 = -1;
                }
                StringBuilder sb = new StringBuilder(substring.substring(Math.max(0, Math.max(i, Math.max(i2, i3)))));
                StringBuilder sb2 = new StringBuilder();
                int indexOf4 = sb.indexOf(".");
                int i5 = 0;
                while (indexOf4 != -1) {
                    sb2.insert(0, sb.substring(i5, indexOf4));
                    i5 = indexOf4 + 1;
                    indexOf4 = sb.indexOf(".", i5);
                }
                str = sb2.toString();
            }
            arrayList2.add(Pair.create(kct2, str));
        }
        Collections.sort(arrayList2, f26273k);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            arrayList3.add((kct) ((Pair) arrayList2.get(i6)).first);
        }
        this.f26277g.clear();
        this.f26277g.addAll(arrayList3);
        this.f26274d.mo15225a(this.f26160b.getString("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerfilterQuery"));
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        Throwable cause = th.getCause();
        int i = this.f26160b.getInt("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllernumTimesConsecutiveFetchFail");
        if (cause instanceof rki) {
            rki rki = (rki) cause;
            try {
                this.f26160b.putBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerapi_resolution_started", true);
                this.f26159a.startIntentSenderForResult(rki.mo24809c().getIntentSender(), 1, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                this.f26160b.putBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerapi_resolution_started", false);
                m19284b(th);
            }
        } else if (!(cause instanceof rjp) || i >= 5) {
            m19284b(th);
        } else {
            int a = ((rjp) cause).mo24655a();
            if (a == 7 || a == 8) {
                this.f26160b.putInt("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllernumTimesConsecutiveFetchFail", i + 1);
                m19285h();
                return;
            }
            m19284b(th);
        }
    }

    /* renamed from: a */
    public final void mo15228a(lir lir) {
        Toast.makeText(lir, (int) C0126R.string.common_something_went_wrong, 1).show();
    }

    /* renamed from: a */
    public final void mo15229a(boolean z) {
        if (z) {
            this.f26278h.mo15191b(this.f26284q);
        }
        this.f26286s.setVisibility(0);
        this.f26285r.setVisibility(8);
        bqga.m112781a(this.f26278h.mo15186a(this.f26284q), this, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo15230a(boolean z, CharSequence charSequence) {
        if (!z) {
            if (SystemClock.elapsedRealtime() - f26272j <= this.f26160b.getLong("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerauthTimeStamp")) {
                this.f26275e.mo15234b();
                return;
            }
        }
        Intent createConfirmDeviceCredentialIntent = this.f26279l.createConfirmDeviceCredentialIntent(charSequence, null);
        if (createConfirmDeviceCredentialIntent != null) {
            this.f26159a.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
        } else {
            m19286i();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.SearchView.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      android.support.v7.widget.LinearLayoutCompat.a(android.graphics.Canvas, int):void
      android.support.v7.widget.SearchView.a(java.lang.CharSequence, boolean):void */
    /* renamed from: a */
    public final boolean mo15169a(Menu menu) {
        this.f26159a.getMenuInflater().inflate(C0126R.C0130menu.settings_passwords_search, menu);
        CharSequence b = this.f26276f.mo15386b(C0126R.string.autofill_search_passwords);
        MenuItem findItem = menu.findItem(C0126R.C0129id.search_bar);
        boolean f = ccip.m129866f();
        int i = C0126R.C0127drawable.quantum_ic_search_black_24;
        if (f && (this.f26159a.getResources().getConfiguration().uiMode & 48) == 32) {
            i = C0126R.C0127drawable.quantum_ic_search_white_24;
        }
        findItem.setIcon(i);
        findItem.setTooltipText(b);
        SearchView searchView = (SearchView) C1264pc.m19826a(findItem);
        searchView.mo1615a(b);
        String string = this.f26160b.getString("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerfilterQuery");
        if (string != null) {
            findItem.expandActionView();
            searchView.mo1616a((CharSequence) string, false);
        }
        searchView.f1260m = new lkr(this);
        findItem.setOnActionExpandListener(new lks(this));
        return true;
    }

    /* renamed from: a */
    public final boolean mo15170a(MenuItem menuItem) {
        return menuItem.getItemId() == C0126R.C0129id.action_bar;
    }
}

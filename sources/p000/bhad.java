package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.BoundService;
import com.google.android.location.reporting.state.update.AccountConfig;

/* renamed from: bhad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bhad extends suy implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    protected bfke f118184b;

    /* renamed from: c */
    protected bgxe f118185c;

    /* renamed from: d */
    public Account f118186d;

    /* renamed from: e */
    final bhac f118187e = mo63478e();

    /* renamed from: f */
    private suo f118188f;

    /* renamed from: g */
    private Spinner f118189g;

    /* renamed from: a */
    private final void m100511a(Account account) {
        this.f118186d = account;
        if (account != null) {
            this.f118186d = this.f118184b.mo61824a(account.name);
        }
        if (!chcs.m148240l()) {
            Account account2 = this.f118186d;
            if (account2 == null) {
                this.f118188f.mo26118b();
                this.f118186d = this.f118184b.mo61824a(this.f118188f.mo26114a());
            } else {
                this.f118188f.mo26120c(account2.name);
            }
            mo63480g();
        }
    }

    /* renamed from: b */
    private final void m100512b(Intent intent) {
        if (!chcs.m148240l()) {
            m100511a((Account) intent.getParcelableExtra("account"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo63476a(AccountConfig accountConfig);

    /* renamed from: e */
    public bhac mo63478e() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo63479f(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo63480g() {
        Account account;
        if (!chcs.m148240l() && this.f118185c != null && !isFinishing() && (account = this.f118186d) != null) {
            try {
                AccountConfig a = this.f118185c.mo63304a(account);
                mo26140c(aepw.m52375a(mo63476a(a)));
                boolean z = false;
                if (a.mo70911f() && a.f150908s != 2) {
                    z = true;
                }
                mo26141d(z);
            } catch (RemoteException e) {
                Log.e("GCoreLocationSettings", "", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo63481h();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!chcs.m148240l()) {
            C1341rz aW = mo8628aW();
            sun sun = new sun(aW);
            sun.mo26112a(C0126R.string.location_settings_location_history_activity_title);
            sun.f45175a = this;
            this.f118188f = sun.mo26111a();
            View a = aW.mo15837a();
            if (a != null) {
                this.f118189g = (Spinner) a.findViewById(C0126R.C0129id.action_bar_spinner);
            } else {
                this.f118189g = new Spinner(this);
                Log.e("GCoreLocationSettings", "Yikes! ActionBar has no custom view");
            }
            this.f118184b = bfkd.m97106a(this);
            if (bundle == null || !bundle.containsKey("selected_account")) {
                m100512b(getIntent());
            } else {
                m100511a((Account) bundle.getParcelable("selected_account"));
            }
        } else if (!chde.m148508b()) {
            this.f118184b = bfkd.m97106a(this);
            Intent intent = getIntent();
            if (intent != null) {
                m100511a((Account) intent.getParcelableExtra("account"));
            }
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (!chcs.m148240l()) {
            String b = this.f118188f.getItem(i);
            Account account = this.f118186d;
            if (account == null || !b.equals(account.name)) {
                Account a = this.f118184b.mo61824a(b);
                if (a == null) {
                    String valueOf = String.valueOf(b);
                    Log.wtf("GCoreLocationSettings", valueOf.length() == 0 ? new String("account name lookup failure: ") : "account name lookup failure: ".concat(valueOf), new Exception());
                    return;
                }
                this.f118186d = a;
                mo63481h();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m100512b(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m100511a(this.f118186d);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("selected_account", this.f118186d);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (!chcs.m148240l()) {
            bhac bhac = this.f118187e;
            if (!skh.m35531a().mo25690a(this, BoundService.getStartIntent(this, "com.google.android.location.reporting.service.InternalPreferenceServiceDoNotUse"), bhac, 129)) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("PreferenceService.bindTo() bound: false");
                bgur.m100024c("GCoreUlr", 34, sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (!chcs.m148240l() && this.f118185c != null) {
            skh.m35531a().mo25689a(this, this.f118187e);
            this.f118185c = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo26142e(boolean z) {
        if (chcs.m148240l()) {
            return;
        }
        if (this.f118185c == null) {
            Log.wtf("GCoreLocationSettings", new IllegalStateException("No service, setting change ignored"));
            return;
        }
        try {
            mo63479f(z);
        } catch (RemoteException e) {
            Log.e("GCoreLocationSettings", "", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63477a(int i) {
        Spinner spinner = this.f118189g;
        if (spinner != null) {
            spinner.setVisibility(i);
        }
    }
}

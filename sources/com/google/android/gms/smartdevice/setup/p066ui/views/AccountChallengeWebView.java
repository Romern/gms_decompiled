package com.google.android.gms.smartdevice.setup.p066ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChallengeWebView extends LinearLayout {

    /* renamed from: a */
    public static final sek f108239a = ascp.m73787a("Setup", "UI", "View", "AccountChallengeWebView");

    /* renamed from: b */
    public static final String f108240b = cgqs.f187523a.mo6606a().mo84295H();

    /* renamed from: c */
    public static final String f108241c = cgqs.f187523a.mo6606a().mo84296I();

    /* renamed from: p */
    private static final int f108242p = C0126R.C0129id.glif_notice;

    /* renamed from: q */
    private static final String f108243q = cgqs.f187523a.mo6606a().mo84301N();

    /* renamed from: d */
    public ArrayList f108244d;

    /* renamed from: e */
    public boolean f108245e;

    /* renamed from: f */
    public ArrayList f108246f = new ArrayList();

    /* renamed from: g */
    public int f108247g;

    /* renamed from: h */
    public Semaphore f108248h;

    /* renamed from: i */
    public int f108249i;

    /* renamed from: j */
    public String f108250j;

    /* renamed from: k */
    public Bundle f108251k;

    /* renamed from: l */
    public WebView f108252l;

    /* renamed from: m */
    public GlifLayout f108253m;

    /* renamed from: n */
    public boolean f108254n;

    /* renamed from: o */
    public arwo f108255o;

    /* renamed from: r */
    private CookieManager f108256r;

    /* renamed from: s */
    private View f108257s;

    /* renamed from: t */
    private WebViewClient f108258t;

    /* renamed from: u */
    private final Runnable f108259u = new asbi(this);

    public AccountChallengeWebView(Context context) {
        super(context);
        m92966h();
    }

    /* renamed from: a */
    public static void m92965a(sdp sdp) {
        boolean z = true;
        int i = 0;
        while (i <= 2 && z) {
            int i2 = i + 1;
            boolean a = sdp.mo17022a(Integer.valueOf(i));
            i = i2;
            z = a;
        }
    }

    /* renamed from: h */
    private final void m92966h() {
        int i;
        this.f108257s = inflate(getContext(), C0126R.C0128layout.smartdevice_account_challenge_webview, this);
        this.f108256r = CookieManager.getInstance();
        this.f108252l = (WebView) this.f108257s.findViewById(C0126R.C0129id.webview);
        asbc asbc = new asbc(this);
        this.f108258t = asbc;
        this.f108252l.setWebViewClient(asbc);
        this.f108253m = (GlifLayout) this.f108257s.findViewById(f108242p);
        if (cgrq.m146758c()) {
            GlifLayout glifLayout = this.f108253m;
            Resources resources = getResources();
            ArrayList arrayList = this.f108244d;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            glifLayout.mo71363a(resources.getQuantityString(C0126R.plurals.smartdevice_d2d_copying_accounts, i));
        } else {
            this.f108253m.mo71365c(C0126R.string.smartdevice_d2d_target_copying_accounts);
        }
        this.f108253m.mo71362a(getContext().getResources().getDrawable(C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_36));
        mo59175b();
    }

    /* renamed from: i */
    private final void m92967i() {
        this.f108249i++;
        mo59181f();
    }

    /* renamed from: b */
    public final void mo59175b() {
        String str;
        int i;
        arwo arwo = this.f108255o;
        if (arwo != null && arwo.f88372a.isAdded()) {
            arws arws = arwo.f88372a;
            if (cgrq.m146758c()) {
                Resources resources = arwo.f88372a.getResources();
                ArrayList arrayList = arwo.f88372a.f88375a;
                if (arrayList != null) {
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                str = resources.getQuantityString(C0126R.plurals.smartdevice_d2d_copying_accounts, i);
            } else {
                str = arwo.f88372a.getString(C0126R.string.smartdevice_d2d_target_copying_accounts);
            }
            arws.mo48886a(str);
        }
        this.f108252l.setVisibility(8);
        this.f108253m.mo71366e().setVisibility(0);
    }

    /* renamed from: c */
    public final void mo59176c() {
        this.f108248h.release();
        m92967i();
    }

    /* renamed from: d */
    public final void mo59177d() {
        if (mo59180e()) {
            m92967i();
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* renamed from: e */
    public final boolean mo59180e() {
        return this.f108249i < this.f108244d.size();
    }

    /* renamed from: f */
    public final void mo59181f() {
        mo59175b();
        if (mo59180e()) {
            Bundle bundle = (Bundle) this.f108244d.get(this.f108249i);
            this.f108251k = bundle;
            String string = bundle.getString("name");
            String string2 = this.f108251k.getString("credential");
            String string3 = this.f108251k.getString("url");
            this.f108250j = string;
            if (!TextUtils.isEmpty(string3)) {
                Uri.Builder buildUpon = Uri.parse(string3).buildUpon();
                if (this.f108245e) {
                    buildUpon.appendQueryParameter(f108241c, "1");
                }
                if (this.f108254n) {
                    buildUpon.appendQueryParameter(f108243q, "1");
                }
                String builder = buildUpon.toString();
                int i = Build.VERSION.SDK_INT;
                this.f108256r.removeAllCookies(new asbe(this, builder));
                return;
            }
            this.f108246f.add(this.f108251k);
            new asbj(this, string, string2, this.f108251k.getString("firstName"), this.f108251k.getString("lastName")).execute(new Void[0]);
            return;
        }
        new asbf(this).execute(new Void[0]);
    }

    /* renamed from: g */
    public final void mo59182g() {
        f108239a.mo25409a("Acquiring semaphore.", new Object[0]);
        if (!this.f108248h.tryAcquire()) {
            f108239a.mo25420f("This should not happen.", new Object[0]);
            return;
        }
        f108239a.mo25409a("Semaphore acquired successfully.", new Object[0]);
        post(this.f108259u);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (cgrb.m146732b() && mo59174a()) {
            int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f108252l.getLayoutParams());
            layoutParams.topMargin = systemWindowInsetTop;
            this.f108252l.setLayoutParams(layoutParams);
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("internalState"));
            this.f108249i = bundle.getInt("index");
            this.f108246f = bundle.getParcelableArrayList("processedAccounts");
            if (this.f108244d == null) {
                throw new IllegalStateException("Accounts cannot be null.");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        f108239a.mo25409a("onSaveInstanceState()", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("index", this.f108249i);
        bundle.putParcelableArrayList("processedAccounts", this.f108246f);
        bundle.putParcelable("internalState", super.onSaveInstanceState());
        return bundle;
    }

    /* renamed from: a */
    public final boolean mo59174a() {
        return this.f108253m.mo64840c();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m92966h();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m92966h();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m92966h();
    }
}

package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationClosedEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationLaunchedEvent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.Session;
import com.google.android.wallet.p097ui.common.CallbackListenerScrollView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: awce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class awce extends deu implements awzi, awib, awic, awcl, bjte, bkcs, bkbl, awym, bjyc, awfk {

    /* renamed from: b */
    public String f94163b;

    /* renamed from: c */
    public LogContext f94164c;

    /* renamed from: d */
    protected byte[] f94165d;

    /* renamed from: e */
    public awib f94166e;

    /* renamed from: f */
    public byte[] f94167f;

    /* renamed from: g */
    public byte[] f94168g;

    /* renamed from: h */
    public awzk f94169h;

    /* renamed from: i */
    private awfj f94170i;

    /* renamed from: j */
    private bjtd f94171j;

    /* renamed from: k */
    private BuyFlowConfig f94172k;

    /* renamed from: l */
    private Account f94173l;

    /* renamed from: d */
    protected static final Intent m79602d(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_REFRESH", z);
        return intent;
    }

    /* renamed from: t */
    private final boolean mo52134t() {
        return mo8628aW() != null && awia.m79992a(mo51881h().f110418b.f110411f);
    }

    /* renamed from: a */
    public void mo51858a(int i) {
        new Object[1][0] = Integer.valueOf(i);
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
        intent.putExtra("exitAction", 8);
        mo51859a(1, intent);
    }

    /* renamed from: a */
    public final void mo51869a(byte[] bArr) {
        this.f94165d = bArr;
    }

    /* renamed from: b */
    public void mo51870b(int i) {
        awzk e = mo51879e();
        if (e != null) {
            e.mo52065d(i);
        } else {
            mo51874c(i);
        }
    }

    /* renamed from: b */
    public final void mo51873b(byte[] bArr) {
        this.f94167f = bArr;
    }

    /* renamed from: c */
    public void mo51874c(int i) {
        Intent intent = new Intent();
        int i2 = i - 1;
        if (i != 0) {
            intent.putExtra("exitAction", i2);
            mo51859a(0, intent);
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public final void mo51876c(byte[] bArr) {
        this.f94168g = bArr;
    }

    /* renamed from: cm */
    public final bwgw mo51877cm() {
        int j = mo51883j();
        bxvd da = bwgw.f159292f.mo74144da();
        String concat = String.valueOf(awyd.m81490b(j)).concat("/payments/apis");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgw bwgw = (bwgw) da.f164949b;
        concat.getClass();
        bwgw.f159294a |= 1;
        bwgw.f159295b = concat;
        String concat2 = String.valueOf(awyd.m81490b(j)).concat("/payments/apis-secure");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgw bwgw2 = (bwgw) da.f164949b;
        concat2.getClass();
        bwgw2.f159294a |= 2;
        bwgw2.f159296c = concat2;
        String a = awyd.m81488a(j);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgw bwgw3 = (bwgw) da.f164949b;
        a.getClass();
        bwgw3.f159294a |= 4;
        bwgw3.f159297d = a;
        return (bwgw) da.mo74062i();
    }

    /* renamed from: cn */
    public Account mo51878cn() {
        if (this.f94173l == null) {
            this.f94173l = (Account) getIntent().getParcelableExtra("com.google.android.gms.wallet.account");
            BuyFlowConfig h = mo51881h();
            if (this.f94173l == null && h != null) {
                this.f94173l = h.f110418b.f110407b;
            }
        }
        return this.f94173l;
    }

    /* renamed from: e */
    public final awzk mo51879e() {
        if (this.f94169h == null) {
            this.f94169h = (awzk) getSupportFragmentManager().findFragmentByTag("childPageFragmentTag");
        }
        return this.f94169h;
    }

    public void finish() {
        super.finish();
        bkfr.m105559a(this, getCurrentFocus());
    }

    /* renamed from: g */
    public boolean mo51880g() {
        awib awib = this.f94166e;
        return awib != null && awib.mo51880g();
    }

    /* renamed from: h */
    public BuyFlowConfig mo51881h() {
        if (this.f94172k == null) {
            this.f94172k = (BuyFlowConfig) getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        }
        return this.f94172k;
    }

    /* renamed from: i */
    public final void mo51882i(int i, int i2) {
        Intent intent = new Intent();
        intent.putExtra("exitAction", i2);
        mo51859a(i, intent);
    }

    /* renamed from: j */
    public final int mo51883j() {
        BuyFlowConfig h = mo51881h();
        if (h != null) {
            return h.f110418b.f110406a;
        }
        return 0;
    }

    /* renamed from: l */
    public final bjtd mo51884l() {
        if (this.f94171j == null) {
            this.f94171j = new bjtd();
        }
        return this.f94171j;
    }

    /* renamed from: m */
    public final byte[] mo51885m() {
        return this.f94167f;
    }

    /* renamed from: n */
    public final byte[] mo51886n() {
        return this.f94168g;
    }

    /* renamed from: o */
    public final awfj mo51887o() {
        if (this.f94170i == null) {
            this.f94170i = new awfj(this, awia.m79985a(this));
        }
        return this.f94170i;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 6001) {
            if (i == 6002) {
                setResult(i2, intent);
                finish();
            }
        } else if (i2 == 2) {
            sdo.m34959a(intent);
            Intent intent2 = getIntent();
            intent2.removeExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
            intent2.removeExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
            if (intent.hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                intent2.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"));
            } else {
                intent2.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"));
            }
            startActivityForResult(intent2, 6002);
        } else {
            mo51859a(i2, intent);
        }
    }

    public final void onBackPressed() {
        mo51870b(3);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (mo51890q()) {
            setTheme(16973840);
            super.onCreate(bundle);
            setTitle("");
            if (bundle == null) {
                Intent r = mo51891r();
                if (r != null) {
                    startActivityForResult(r, 6001);
                    return;
                }
                setResult(1);
                finish();
                return;
            }
            return;
        }
        super.onCreate(bundle);
        awcf.m79640a((deu) this);
        if (bundle != null) {
            if (bundle.containsKey("keyFeatureManagerState")) {
                bjtd l = mo51884l();
                Bundle bundle2 = bundle.getBundle("keyFeatureManagerState");
                for (int i = 0; i < 2; i++) {
                    StringBuilder sb = new StringBuilder(47);
                    sb.append("clientFeaturesManagerActiveFeatures_");
                    sb.append(i);
                    String sb2 = sb.toString();
                    if (bundle2 == null || !bundle2.containsKey(sb2)) {
                        l.f123268a[i].clear();
                    } else {
                        l.f123268a[i] = bundle2.getIntegerArrayList(sb2);
                    }
                }
            }
            this.f94173l = (Account) bundle.getParcelable("account");
            this.f94172k = (BuyFlowConfig) bundle.getParcelable("buyFlowConfig");
            this.f94167f = bundle.getByteArray("ephemeralPrivateKey");
            this.f94168g = bundle.getByteArray("cReqSessionKey");
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!mo51889p()) {
            bjst.m104517a(this.f94164c);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        mo51870b(5);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        awzk e;
        CallbackListenerScrollView ae;
        super.onPostCreate(bundle);
        if (!mo51890q()) {
            if (mo51879e() != null && mo52134t()) {
                mo51879e().f95362F = this;
            }
            if (mo51879e() == null) {
                return;
            }
            if ((chhs.f188628a.mo6606a().mo85242a() || mo52134t()) && (ae = (e = mo51879e()).mo52872ae()) != null) {
                ae.f151920p = e;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (!mo51890q()) {
            mo51871b(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.f94173l);
        bundle.putParcelable("buyFlowConfig", this.f94172k);
        bundle.putByteArray("ephemeralPrivateKey", this.f94167f);
        bundle.putByteArray("cReqSessionKey", this.f94168g);
        bundle.putString("analyticsSessionId", this.f94163b);
        bundle.putParcelable("logContext", this.f94164c);
        awfj awfj = this.f94170i;
        if (awfj != null) {
            bjvp.m104737a(bundle, "clientLogEvents", awfj.f94271b);
            bundle.putByteArray("integratorLogToken", this.f94170i.f94272c);
        }
        mo51861a(bundle);
        if (this.f94171j != null) {
            Bundle bundle2 = new Bundle();
            bjtd bjtd = this.f94171j;
            for (int i = 0; i < 2; i++) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("clientFeaturesManagerActiveFeatures_");
                sb.append(i);
                bundle2.putIntegerArrayList(sb.toString(), bjtd.f123268a[i]);
            }
            bundle.putBundle("keyFeatureManagerState", bundle2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo51889p() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo51890q() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Intent mo51891r() {
        return null;
    }

    /* renamed from: s */
    public final void mo51892s() {
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15876o();
        }
    }

    /* renamed from: a */
    public void mo51859a(int i, Intent intent) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int a = awia.m79964a(i);
        if (i == -1) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        if (intent != null) {
            int intExtra = intent.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", 0);
            int a2 = bphx.m111944a(intent.getIntExtra("exitAction", i2 - 1));
            intent.removeExtra("exitAction");
            i4 = a2;
            i3 = intExtra;
        } else {
            i4 = i2;
            i3 = 0;
        }
        awqc.m80662a(getApplicationContext(), new OrchestrationClosedEvent(a, i3, i4, mo51878cn().name, this.f94163b));
        byte[] bArr = this.f94165d;
        if (bArr != null && bArr.length > 0) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN", this.f94165d);
        }
        bjst.m104518a(this.f94164c, awga.m79886a(a), i3);
        if (awia.m79985a(this) && !this.f94170i.f94271b.isEmpty() && (arrayList = this.f94170i.f94271b) != null) {
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_MEGALOGS_EVENTS_PROTO", bjvp.m104728a(arrayList));
        }
        setResult(i, intent);
        finish();
    }

    /* renamed from: c */
    public final void mo51875c(boolean z) {
        float f;
        if (mo8628aW() != null) {
            int i = Build.VERSION.SDK_INT;
            if (z) {
                f = (float) getResources().getDimensionPixelSize(C0126R.dimen.wallet_toolbar_shadow_elevation);
            } else {
                f = 0.0f;
            }
            mo8628aW().mo15839a(f);
        }
    }

    /* renamed from: o */
    public final void mo51888o(boolean z) {
        C1341rz aW = mo8628aW();
        if (aW == null) {
            return;
        }
        if (!z) {
            aW.mo15862e();
        } else {
            aW.mo15859d();
        }
    }

    /* renamed from: b */
    public void mo51871b(Bundle bundle) {
        awib awib = this.f94166e;
        if (awib != null && bundle != null) {
            awib.mo51871b(bundle);
        }
    }

    /* renamed from: b */
    public void mo51872b(boolean z) {
        awib awib = this.f94166e;
        if (awib != null) {
            awib.mo51872b(z);
        }
    }

    /* renamed from: a */
    public void mo51860a(Account account) {
        throw new UnsupportedOperationException("Changing account not supported");
    }

    /* renamed from: a */
    public void mo51861a(Bundle bundle) {
        awib awib = this.f94166e;
        if (awib != null) {
            awib.mo51861a(bundle);
        }
    }

    /* renamed from: a */
    public final void mo51862a(Bundle bundle, bdyx bdyx, int i, bpis bpis) {
        mo51863a(bundle, bdyx, i, bpis, new byte[0]);
    }

    /* renamed from: a */
    public final void mo51863a(Bundle bundle, bdyx bdyx, int i, bpis bpis, byte[] bArr) {
        int i2;
        NetworkInfo activeNetworkInfo;
        String str;
        awfj o = mo51887o();
        this.f94170i = o;
        if (bundle == null) {
            o.f94272c = bArr;
            Session a = bjst.m104514a(o, ((Boolean) bdyx.mo58455c()).booleanValue());
            long longExtra = awia.m79985a(this) ? getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0) : 0;
            long j = (long) i;
            if (mo51881h() != null) {
                str = mo51881h().f110417a;
            } else {
                str = null;
            }
            this.f94164c = bjst.m104512a(j, str, a, longExtra);
            Context applicationContext = getApplicationContext();
            OrchestrationLaunchedEvent orchestrationLaunchedEvent = new OrchestrationLaunchedEvent(mo51881h(), mo51878cn().name, bpis);
            awqc.m80662a(applicationContext, orchestrationLaunchedEvent);
            this.f94163b = orchestrationLaunchedEvent.f110015m;
        } else {
            if (bundle.containsKey("integratorLogToken")) {
                this.f94170i.f94272c = bundle.getByteArray("integratorLogToken");
            }
            LogContext logContext = (LogContext) bundle.getParcelable("logContext");
            this.f94164c = logContext;
            bjst.m104516a(this.f94170i, logContext.mo71783b());
            if (bundle.containsKey("clientLogEvents")) {
                this.f94170i.f94271b = (ArrayList) bjvp.m104742b(bundle, "clientLogEvents", (bxxk) bxbd.f161778h.mo74142c(7));
            }
            this.f94163b = bundle.getString("analyticsSessionId");
        }
        LogContext logContext2 = this.f94164c;
        Context applicationContext2 = getApplicationContext();
        if (!bjst.m104536d(logContext2)) {
            Log.e("ClientLog", "Tried to log configuration() in an invalid session.");
            return;
        }
        DisplayMetrics a2 = bjzh.m104970a(applicationContext2);
        bxvd da = bwfq.f159103i.mo74144da();
        int i3 = a2.widthPixels;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfq bwfq = (bwfq) da.f164949b;
        bwfq.f159105a |= 1;
        bwfq.f159106b = i3;
        int i4 = a2.heightPixels;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfq bwfq2 = (bwfq) da.f164949b;
        bwfq2.f159105a |= 2;
        bwfq2.f159107c = i4;
        int i5 = (int) a2.xdpi;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfq bwfq3 = (bwfq) da.f164949b;
        bwfq3.f159105a |= 4;
        bwfq3.f159108d = i5;
        int i6 = (int) a2.ydpi;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfq bwfq4 = (bwfq) da.f164949b;
        bwfq4.f159105a |= 8;
        bwfq4.f159109e = i6;
        int i7 = a2.densityDpi;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfq bwfq5 = (bwfq) da.f164949b;
        bwfq5.f159105a |= 16;
        bwfq5.f159110f = i7;
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext2.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            i2 = 2;
        } else {
            int type = activeNetworkInfo.getType();
            i2 = type != 0 ? type != 1 ? type != 9 ? 1 : 5 : 3 : 4;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfq bwfq6 = (bwfq) da.f164949b;
        bwfq6.f159112h = i2 - 1;
        bwfq6.f159105a |= 64;
        int i8 = applicationContext2.getResources().getConfiguration().orientation;
        if (i8 == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfq bwfq7 = (bwfq) da.f164949b;
            bwfq7.f159111g = 1;
            bwfq7.f159105a |= 32;
        } else if (i8 != 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfq bwfq8 = (bwfq) da.f164949b;
            bwfq8.f159111g = 0;
            bwfq8.f159105a |= 32;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfq bwfq9 = (bwfq) da.f164949b;
            bwfq9.f159111g = 2;
            bwfq9.f159105a |= 32;
        }
        bxvd e = bjst.m104537e(logContext2);
        bwfe bwfe = bwfe.EVENT_NAME_CONFIGURATION;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        bwfr.f159115a |= 4;
        bwfq bwfq10 = (bwfq) da.mo74062i();
        bwfq10.getClass();
        bwfr.f159117c = bwfq10;
        bwfr.f159116b = 10;
        bjst.m104528a(logContext2.mo71783b(), (bwfr) e.mo74062i());
    }

    /* renamed from: a */
    public void mo51864a(Parcelable parcelable, boolean z) {
        mo51859a(-1, m79602d(z));
    }

    /* renamed from: a */
    public final void mo8626a(Toolbar toolbar) {
        if (toolbar != null) {
            int[] iArr = {C0126R.attr.colorWalletActionBarForeground, C0126R.attr.toolbarSideMargin};
            Arrays.sort(iArr);
            TypedArray obtainStyledAttributes = obtainStyledAttributes(iArr);
            int color = obtainStyledAttributes.getColor(Arrays.binarySearch(iArr, (int) C0126R.attr.colorWalletActionBarForeground), 0);
            int dimension = (int) obtainStyledAttributes.getDimension(Arrays.binarySearch(iArr, (int) C0126R.attr.toolbarSideMargin), 0.0f);
            obtainStyledAttributes.recycle();
            if (!(color == 0 || toolbar.mo1699i() == null)) {
                C1173lt.m19599a(toolbar.mo1699i(), color);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
            C1260oz.m19821a(marginLayoutParams, dimension);
            C1260oz.m19823b(marginLayoutParams, dimension);
        }
        super.mo8626a(toolbar);
    }

    /* renamed from: a */
    public final void mo51865a(View view, C1339rx rxVar) {
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15844a(view, rxVar);
        }
    }

    /* renamed from: a */
    public final void mo51866a(awzk awzk, int i) {
        awzk awzk2 = this.f94169h;
        if (!(awzk2 == null || awzk2.f95362F == null)) {
            awzk2.f95362F = null;
        }
        this.f94169h = awzk;
        getSupportFragmentManager().beginTransaction().replace(i, awzk, "childPageFragmentTag").commit();
    }

    /* renamed from: a */
    public void mo51867a(bmoc bmoc, boolean z) {
        awib awib = this.f94166e;
        if (awib != null) {
            awib.mo51867a(bmoc, z);
        }
    }

    /* renamed from: a */
    public void mo51868a(String str) {
        awib awib = this.f94166e;
        if (awib != null) {
            awib.mo51868a(str);
        }
    }
}

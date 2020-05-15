package com.google.android.gms.walletp2p.feature.completion;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;
import com.google.android.gms.walletp2p.feature.widgets.alertpage.AlertPage;
import com.google.android.gms.walletp2p.feature.widgets.checkmarkprogressbar.CheckmarkProgressBar;
import com.google.android.gms.walletp2p.feature.widgets.pagerlayout.PagerLayout;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenResponse;
import com.google.android.libraries.walletp2p.moneyentry.MoneyEntryLayout;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CompleteMoneyTransferChimeraActivity extends deu implements axlz {

    /* renamed from: h */
    static long f110655h = 0;

    /* renamed from: i */
    static long f110656i = 0;

    /* renamed from: A */
    private byte[] f110657A = null;

    /* renamed from: B */
    private boolean f110658B = false;

    /* renamed from: b */
    public AlertPage f110659b;

    /* renamed from: c */
    public MoneyEntryLayout f110660c;

    /* renamed from: d */
    public PagerLayout f110661d;

    /* renamed from: e */
    public TextView f110662e;

    /* renamed from: f */
    public CheckmarkProgressBar f110663f;

    /* renamed from: g */
    public ValidateDraftTokenResponse f110664g = null;

    /* renamed from: j */
    public Handler f110665j;

    /* renamed from: k */
    public KeyguardManager f110666k;

    /* renamed from: l */
    axif f110667l;

    /* renamed from: m */
    public Instrument f110668m = null;

    /* renamed from: n */
    public byte[] f110669n = null;

    /* renamed from: o */
    public ArrayList f110670o = new ArrayList();

    /* renamed from: p */
    public Account f110671p;

    /* renamed from: q */
    public TransferParams f110672q = TransferParams.f110642a;

    /* renamed from: r */
    public axfi f110673r;

    /* renamed from: s */
    public boolean f110674s = false;

    /* renamed from: t */
    public Intent f110675t;

    /* renamed from: u */
    public String f110676u;

    /* renamed from: v */
    public rjx f110677v;

    /* renamed from: w */
    private FrameLayout f110678w;

    /* renamed from: x */
    private TextView f110679x;

    /* renamed from: y */
    private Button f110680y;

    /* renamed from: z */
    private boolean f110681z;

    /* renamed from: a */
    private final void m94323a(Runnable runnable, long j) {
        this.f110665j.postDelayed(new axgs(runnable), j);
    }

    /* renamed from: n */
    private final boolean m94324n() {
        return this.f110673r.mo53084d() && !stm.m36302d(axog.m82807c(getIntent()));
    }

    /* renamed from: P */
    public final void mo53238P(int i) {
        mo60177m().mo53240a(this.f110672q, getIntent(), i);
    }

    /* renamed from: b */
    public final void mo60168b(axfi axfi) {
        if (!isDestroyed()) {
            this.f110681z = true;
            setFinishOnTouchOutside(false);
            mo53238P(70);
            this.f110663f.announceForAccessibility(axfi.mo53079b(this));
            axfi.mo53078a(this, this.f110667l, this.f110671p, this.f110677v, f110655h, f110656i, this.f110657A, this.f110670o, new axhg(this, axfi), getIntent().getStringExtra("account_name"));
        }
    }

    /* renamed from: c */
    public final void mo60169c(axfi axfi) {
        if (!isDestroyed()) {
            mo53238P(74);
            mo60168b(axfi);
        }
    }

    /* renamed from: e */
    public final void mo60170e() {
        int i;
        if (!chlw.f188764a.mo6606a().mo85340a() || !((i = this.f110672q.f110646e) == 3 || i == 5)) {
            mo53238P(MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA);
            mo60171g();
        } else if (this.f110673r.mo53105q()) {
            mo53238P(MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA);
            mo60171g();
        } else {
            axif axif = this.f110667l;
            axif.f95983b.execute(new axid(axif.f95982a, axif.f95984c, this.f110671p, new axfn(this), new axfy(this)));
        }
    }

    /* renamed from: g */
    public final void mo60171g() {
        if (m94324n()) {
            mo60172h();
        } else if (mo60173i()) {
            mo60167a(getString(C0126R.string.walletp2p_instrument_fix_required_title), getString(C0126R.string.walletp2p_instrument_fix_required_content));
        } else {
            mo60163a(this.f110673r);
        }
    }

    /* renamed from: h */
    public final void mo60172h() {
        mo53238P(140);
        aucb a = this.f110677v.mo24676a(this.f110672q.mo60157d(), axog.m82807c(getIntent()), getIntent().getStringExtra("account_name"));
        a.mo50376a(this, new axgx(this));
        a.mo50375a(this, new axgy(this));
    }

    /* renamed from: i */
    public final boolean mo60173i() {
        Instrument instrument;
        return this.f110673r.mo53098m() && (instrument = this.f110668m) != null && instrument.f110823d == 2;
    }

    /* renamed from: j */
    public final void mo60174j() {
        mo53238P(85);
        this.f110659b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_error_outline_vd_theme_24, getTheme()), getString(C0126R.string.common_something_went_wrong), getString(C0126R.string.walletp2p_try_again_soon), getString(C0126R.string.close_button_label), new axgc(this), null, null);
        this.f110661d.mo60211b(1);
    }

    /* renamed from: k */
    public final void mo60175k() {
        rjx rjx = this.f110677v;
        byte[] bArr = this.f110669n;
        String stringExtra = getIntent().getStringExtra("account_name");
        roz b = rpa.m34196b();
        b.f43472a = new axeh(bArr, stringExtra);
        rjx.mo24732b(b.mo24977a());
    }

    /* renamed from: l */
    public final void mo60176l() {
        this.f110681z = false;
        setFinishOnTouchOutside(true);
    }

    /* renamed from: m */
    public final axma mo60177m() {
        axma a = axma.m82708a(this, getIntent().getStringExtra("account_name"));
        a.mo53241a(getIntent().getStringExtra("calling_package"));
        a.f96173b = getIntent().getStringExtra("transfer_idempotency_key");
        return a;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f110658B = false;
        mo53238P(96);
        if (i == 1) {
            this.f110661d.mo60211b(1);
            if (i2 == -1) {
                mo53238P(97);
                this.f110661d.mo60212c(0);
                mo60169c(this.f110673r);
                return;
            }
            mo53238P(98);
        } else if (i == 2) {
            this.f110661d.mo60211b(1);
            if (i2 == -1) {
                mo53238P(99);
                f110656i = System.currentTimeMillis();
                this.f110661d.mo60212c(0);
                mo60169c(this.f110673r);
                return;
            }
            mo53238P(100);
        } else if (i != 3) {
            if (i == 4) {
                this.f110661d.mo60211b(1);
                if (i2 == -1) {
                    mo53238P(ErrorInfo.TYPE_SDU_MEMORY_FULL);
                    this.f110661d.mo60212c(0);
                    f110655h = System.currentTimeMillis();
                    mo60169c(this.f110673r);
                    return;
                }
                mo53238P(106);
            } else if (i == 5) {
                this.f110661d.mo60211b(1);
                if (i2 == -1) {
                    mo53238P(145);
                    this.f110661d.mo60212c(0);
                    if (intent != null && intent.hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN")) {
                        this.f110657A = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
                    }
                    mo60169c(this.f110673r);
                    return;
                }
                mo53238P(146);
                mo60175k();
                setResult(0);
                finish();
            }
        } else if (i2 == -1) {
            mo53238P(101);
            this.f110661d.mo60212c(0);
            axif axif = this.f110667l;
            int a = this.f110673r.mo53073a();
            btsb btsb = this.f110672q.f110643b;
            axif.mo53160a(a, btsb.f150177b, btsb.f150178c, false, this.f110671p, new axgk(this), new axgl(this));
        } else {
            mo53238P(ErrorInfo.TYPE_SDU_FAILED);
        }
    }

    public final void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if ("verify_pin_frag".equals(fragment.getTag())) {
            axic axic = (axic) fragment;
            axic.f95976g = this.f110667l;
            axic.f95975f = new axgj(this);
            axic.f95974e = new axgu(this);
        }
    }

    public final void onBackPressed() {
        if (!this.f110681z) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (chlk.m148926b()) {
            setResult(0);
            finish();
            return;
        }
        mo53238P(60);
        try {
            spn.m35870c((Activity) this);
            setTheme(C0126R.style.Theme_WalletP2P_M2);
            setContentView((int) C0126R.C0128layout.walletp2p_complete_money_transfer_activity);
            int i = Build.VERSION.SDK_INT;
            setRequestedOrientation(14);
            TransferParams transferParams = (TransferParams) getIntent().getParcelableExtra("transfer_params");
            bmxy.m108581a(transferParams);
            this.f110672q = transferParams;
            if (bundle != null) {
                onRestoreInstanceState(bundle);
            }
            if (this.f110664g != null) {
                this.f110673r = axfj.m82570a(this.f110672q, mo60160a(getIntent(), this.f110664g));
            } else {
                this.f110673r = axfj.m82570a(this.f110672q, getIntent());
            }
            this.f110668m = (Instrument) getIntent().getParcelableExtra("transfer_instrument");
            this.f110678w = (FrameLayout) findViewById(C0126R.C0129id.complete_frame_layout);
            if (chlq.m148935b()) {
                getWindow().setBackgroundDrawable(C1391tv.m20459b(this, C0126R.C0127drawable.walletp2p_rounded_corner_rectangle));
            } else {
                this.f110678w.setBackgroundColor(getResources().getColor(C0126R.color.walletp2p_dialog_background));
            }
            this.f110659b = (AlertPage) findViewById(C0126R.C0129id.alert_page);
            this.f110679x = (TextView) findViewById(C0126R.C0129id.transfer_default_instrument_label);
            this.f110680y = (Button) findViewById(C0126R.C0129id.done_button);
            this.f110660c = (MoneyEntryLayout) findViewById(C0126R.C0129id.fancy_money_layout);
            PagerLayout pagerLayout = (PagerLayout) findViewById(C0126R.C0129id.completion_pager_layout);
            this.f110661d = pagerLayout;
            pagerLayout.mo60210a(2, 0);
            if (!chlq.m148935b()) {
                this.f110661d.mo60210a(1, 0);
            }
            TextView textView = (TextView) findViewById(C0126R.C0129id.transfer_progress_label);
            this.f110662e = textView;
            textView.setVisibility(0);
            this.f110662e.setText(this.f110673r.mo53079b(this));
            this.f110663f = (CheckmarkProgressBar) findViewById(C0126R.C0129id.transfer_progress_bar);
            this.f110660c.mo70855a(Locale.getDefault(), axmh.m82721a(this));
            if (m94324n() && this.f110664g == null) {
                this.f110660c.setVisibility(4);
                this.f110662e.setVisibility(4);
            } else if (m94324n()) {
                MoneyEntryLayout moneyEntryLayout = this.f110660c;
                ValidateDraftTokenResponse validateDraftTokenResponse = this.f110664g;
                moneyEntryLayout.mo70853a(validateDraftTokenResponse.f110849a, validateDraftTokenResponse.f110850b);
            } else {
                MoneyEntryLayout moneyEntryLayout2 = this.f110660c;
                btsb btsb = this.f110672q.f110643b;
                moneyEntryLayout2.mo70853a(btsb.f150177b, btsb.f150178c);
            }
            mo60176l();
            this.f110665j = new adzt();
            this.f110666k = (KeyguardManager) getSystemService("keyguard");
            this.f110667l = new axif(this, this.f110672q.f110653l);
            this.f110677v = axdx.m82408a(this, this.f110672q.f110653l - 1);
            this.f110671p = new Account(getIntent().getStringExtra("account_name"), "com.google");
            mo53238P(61);
        } catch (SecurityException e) {
            mo53238P(62);
            setResult(0);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        mo53238P(65);
        axif axif = this.f110667l;
        if (axif != null) {
            axif.mo53159a();
        }
        Handler handler = this.f110665j;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.getBundle("a") != null) {
            Bundle bundle2 = bundle.getBundle("a");
            bundle2.setClassLoader(CompleteMoneyTransferChimeraActivity.class.getClassLoader());
            this.f110672q = (TransferParams) bundle2.getParcelable("b");
            this.f110675t = (Intent) bundle2.getParcelable("c");
            this.f110676u = bundle2.getString("d");
            this.f110674s = bundle2.getBoolean("f");
            this.f110658B = bundle2.getBoolean("e");
            if (bundle2.containsKey("g")) {
                this.f110669n = bundle2.getByteArray("g");
            }
            if (bundle2.containsKey("i")) {
                this.f110668m = (Instrument) bundle2.getParcelable("i");
            }
            if (bundle2.containsKey("j")) {
                this.f110664g = (ValidateDraftTokenResponse) bundle2.getParcelable("j");
            }
            if (bundle2.containsKey("h")) {
                this.f110657A = bundle2.getByteArray("h");
            }
            if (bundle2.containsKey("i")) {
                this.f110670o = bundle2.getStringArrayList("i");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("b", this.f110672q);
        Intent intent = this.f110675t;
        if (intent != null) {
            bundle2.putParcelable("c", intent);
        }
        String str = this.f110676u;
        if (str != null) {
            bundle2.putString("d", str);
        }
        bundle2.putBoolean("f", this.f110674s);
        Instrument instrument = this.f110668m;
        if (instrument != null) {
            bundle2.putParcelable("i", instrument);
        }
        ValidateDraftTokenResponse validateDraftTokenResponse = this.f110664g;
        if (validateDraftTokenResponse != null) {
            bundle2.putParcelable("j", validateDraftTokenResponse);
        }
        byte[] bArr = this.f110669n;
        if (bArr != null) {
            bundle2.putByteArray("g", bArr);
        }
        byte[] bArr2 = this.f110657A;
        if (bArr2 != null) {
            bundle2.putByteArray("h", bArr2);
        }
        if (!this.f110670o.isEmpty()) {
            bundle2.putStringArrayList("i", this.f110670o);
        }
        bundle2.putBoolean("e", this.f110658B);
        bundle.putBundle("a", bundle2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity.a(android.content.Intent, java.lang.String, boolean):void
     arg types: [android.content.Intent, java.lang.String, int]
     candidates:
      com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity.a(long, java.lang.String, java.lang.String):void
      com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity.a(android.content.Intent, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        mo53238P(63);
        if (this.f110658B) {
            mo53238P(64);
        } else if (this.f110674s) {
            mo60162a(this.f110675t, this.f110676u, false);
        } else {
            PagerLayout pagerLayout = this.f110661d;
            if (pagerLayout != null && pagerLayout.f110753a == 0) {
                mo60170e();
            }
        }
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (i != -1) {
            this.f110658B = true;
        }
        super.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public final Intent mo60160a(Intent intent, ValidateDraftTokenResponse validateDraftTokenResponse) {
        this.f110672q.f110643b = TransferParams.m94306a(validateDraftTokenResponse.f110849a, validateDraftTokenResponse.f110850b);
        this.f110672q.f110645d = validateDraftTokenResponse.f110854f;
        Intent intent2 = new Intent(intent);
        intent2.putExtra("transfer_idempotency_key", validateDraftTokenResponse.f110852d);
        intent2.putExtra("transfer_instrument_id", validateDraftTokenResponse.f110851c);
        intent2.putExtra("funds_transfer_token", validateDraftTokenResponse.f110856h);
        return intent2;
    }

    /* renamed from: a */
    public final void mo60161a(long j, String str, String str2) {
        mo53238P(139);
        this.f110667l.mo53160a(this.f110673r.mo53073a(), j, str, false, this.f110671p, new axgz(this, str2), new axha(this, j, str, str2));
    }

    /* renamed from: a */
    public final void mo60162a(Intent intent, String str, boolean z) {
        setResult(-1, intent);
        setRequestedOrientation(-1);
        if (this.f110673r.mo53091i()) {
            CheckmarkProgressBar checkmarkProgressBar = this.f110663f;
            checkmarkProgressBar.f110744a.setVisibility(8);
            checkmarkProgressBar.f110745b.setVisibility(8);
            checkmarkProgressBar.f110746c.setVisibility(8);
            int i = Build.VERSION.SDK_INT;
            checkmarkProgressBar.f110747d.setVisibility(0);
            checkmarkProgressBar.f110747d.mo4042a();
            if (!this.f110673r.mo53092j()) {
                m94323a(new axgp(this), 390);
                m94323a(new axgq(this), 1170);
            } else if (z) {
                m94323a(new axgo(this, str), 390);
            } else {
                mo60166a(str);
            }
        } else {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo60163a(axfi axfi) {
        if (isDestroyed()) {
            return;
        }
        if (chkv.m148903b()) {
            mo53238P(172);
            axfi.mo53076a(this, this.f110667l, this.f110671p, new axhb(this), new axhc(this));
            return;
        }
        mo53238P(66);
        axfi.mo53077a(this.f110667l, this.f110671p, new axhe(this, axfi));
    }

    /* renamed from: a */
    public final void mo60164a(ErrorDetails errorDetails) {
        mo53238P(85);
        this.f110659b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_error_outline_vd_theme_24, getTheme()), errorDetails.f110804a, errorDetails.f110805b, getString(C0126R.string.walletp2p_go_back), new axgb(this, errorDetails), errorDetails.f110806c, errorDetails.f110807d != null ? new axga(this, errorDetails) : null);
        this.f110661d.mo60211b(1);
    }

    /* renamed from: a */
    public final void mo60165a(Runnable runnable) {
        mo53238P(93);
        this.f110659b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.f7377x1c30a19, getTheme()), getString(C0126R.string.common_no_network), getString(C0126R.string.walletp2p_check_your_network_connection), getString(C0126R.string.walletp2p_go_back), new axgh(this), getString(C0126R.string.common_try_again), new axgi(this, runnable));
        this.f110661d.mo60211b(1);
    }

    /* renamed from: a */
    public final void mo60166a(String str) {
        mo53238P(110);
        this.f110680y.setVisibility(0);
        this.f110662e.setText(String.format(this.f110673r.mo53081c(this), this.f110668m.f110821b));
        if (str != null) {
            this.f110679x.setVisibility(0);
            mo53238P(111);
        }
        this.f110680y.setText(getString(C0126R.string.common_done));
        this.f110680y.setOnClickListener(new axgr(this));
    }

    /* renamed from: a */
    public final void mo60167a(String str, String str2) {
        mo53238P(87);
        this.f110659b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_info_outline_vd_theme_24, getTheme()), str, str2, getString(C0126R.string.walletp2p_go_back), new axgd(this), getString(C0126R.string.common_update), new axge(this, this.f110668m));
        this.f110661d.mo60211b(1);
    }
}

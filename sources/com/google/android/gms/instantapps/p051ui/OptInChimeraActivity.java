package com.google.android.gms.instantapps.p051ui;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ScrollView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;

/* renamed from: com.google.android.gms.instantapps.ui.OptInChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OptInChimeraActivity extends deu implements admp, admq, admr {

    /* renamed from: b */
    public static final adfs f79239b = new adfs("OptInChimeraActivity");

    /* renamed from: c */
    public adml f79240c;

    /* renamed from: d */
    public FragmentManager f79241d;

    /* renamed from: e */
    adfd f79242e;

    /* renamed from: f */
    public adfb f79243f;

    /* renamed from: g */
    long f79244g;

    /* renamed from: h */
    private View f79245h;

    /* renamed from: i */
    private View f79246i;

    /* renamed from: j */
    private ScrollView f79247j;

    /* renamed from: k */
    private View f79248k;

    /* renamed from: l */
    private Button f79249l;

    /* renamed from: m */
    private Button f79250m;

    /* renamed from: n */
    private int f79251n;

    /* renamed from: a */
    private final void m66777a(boolean z) {
        aucb j = adee.m50254a(getContainerActivity()).mo24752j();
        j.mo50372a(new adls(this));
        j.mo50373a(new adlr(this, z));
    }

    /* renamed from: q */
    private final Intent m66778q() {
        return (Intent) getIntent().getParcelableExtra("downloadSupervisorRedirectIntent");
    }

    /* renamed from: b */
    public final void mo33665b(int i, View.OnClickListener onClickListener) {
        this.f79250m.setVisibility(0);
        this.f79250m.setText(i);
        this.f79250m.setOnClickListener(onClickListener);
    }

    /* renamed from: e */
    public final void mo33660e() {
        mo43460a(new adlp());
    }

    /* renamed from: g */
    public final void mo33657g() {
        mo43462o();
    }

    /* renamed from: h */
    public final void mo33661h() {
        setResult(1);
        mo33662m();
    }

    /* renamed from: i */
    public final void mo33658i() {
        setResult(0);
        mo33662m();
    }

    /* renamed from: j */
    public final void mo43461j() {
        setResult(2);
        mo33662m();
    }

    /* renamed from: k */
    public final void mo33666k() {
        this.f79249l.setVisibility(8);
        this.f79250m.setVisibility(8);
    }

    /* renamed from: l */
    public final boolean mo33667l() {
        boolean z;
        int paddingBottom = this.f79248k.getPaddingBottom();
        int measuredHeight = this.f79247j.getMeasuredHeight();
        if (this.f79247j.getScrollY() < (this.f79248k.getMeasuredHeight() - measuredHeight) - paddingBottom) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f79247j.smoothScrollBy(0, measuredHeight);
        }
        return z;
    }

    /* renamed from: m */
    public final void mo33662m() {
        adml adml = this.f79240c;
        if (adml.f62164f < 3) {
            adml.f62164f = 3;
            float translationY = adml.f62163e.getTranslationY();
            float alpha = adml.f62162d.getAlpha();
            View view = adml.f62163e;
            adml.mo33651a(ObjectAnimator.ofFloat(view, "translationY", translationY, (float) view.getHeight()), ObjectAnimator.ofFloat(adml.f62162d, "alpha", alpha, 0.0f), new admj(adml));
        }
    }

    /* renamed from: n */
    public final void mo33663n() {
        m66777a(true);
    }

    /* renamed from: o */
    public final void mo43462o() {
        if (this.f79251n == 1) {
            mo33662m();
        } else if (getIntent().getBooleanExtra("downloadSupervisorShowConfirmation", false)) {
            mo43460a(new admg());
        } else {
            Intent q = m66778q();
            if (q != null) {
                startActivity(q);
            }
            mo33662m();
        }
    }

    public final void onBackPressed() {
        this.f79243f.mo33409a("OptInActivity.onBackPressed");
        mo43461j();
    }

    public final void onCreate(Bundle bundle) {
        setTheme(2132018700);
        super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("stateExising", false)) {
            this.f79251n = adfk.m50305a();
            adfd adfd = new adfd(getApplicationContext());
            this.f79242e = adfd;
            adfd.mo33415b("OptInActivity.onCreate").mo33410a();
            setContentView((int) C0126R.C0128layout.setup_activity);
            View findViewById = findViewById(C0126R.C0129id.empty_space);
            this.f79245h = findViewById;
            findViewById.setOnClickListener(new adlq(this));
            View findViewById2 = findViewById(C0126R.C0129id.bottom_sheet);
            this.f79246i = findViewById2;
            findViewById2.setClickable(true);
            this.f79247j = (ScrollView) findViewById(C0126R.C0129id.scroll_view);
            this.f79248k = findViewById(C0126R.C0129id.content_wrapper);
            this.f79249l = (Button) findViewById(C0126R.C0129id.confirm_button);
            this.f79250m = (Button) findViewById(C0126R.C0129id.cancel_button);
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.opt_in_button_height);
            this.f79249l.setHeight(this.f79249l.getPaddingTop() + this.f79249l.getPaddingBottom() + dimensionPixelSize);
            this.f79250m.setHeight(dimensionPixelSize + this.f79250m.getPaddingTop() + this.f79250m.getPaddingBottom());
            this.f79240c = new adml(this, this.f79245h, this.f79246i);
            if (this.f79241d == null) {
                this.f79241d = getSupportFragmentManager();
            }
            m66777a(false);
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        adfb adfb = this.f79243f;
        if (adfb != null) {
            this.f79244g = adfb.mo33408a();
            if (isFinishing()) {
                this.f79243f.mo33409a("OptInActivity.foregroundTime");
                qxq qxq = this.f79242e.f61544a;
                if (qxq != null) {
                    qxq.mo24388e();
                }
            }
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        long j;
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            j = bundle.getLong("stateOptInTotalVisibleMillis", 0);
        } else {
            j = 0;
        }
        this.f79244g = j;
        if (j != 0) {
            this.f79243f = this.f79242e.mo33412a(j);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        adfd adfd = this.f79242e;
        if (adfd != null) {
            this.f79243f = adfd.mo33412a(this.f79244g);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("stateOptInTotalVisibleMillis", this.f79244g);
        bundle.putBoolean("stateExising", adml.f62159a.contains(Integer.valueOf(this.f79240c.f62164f)));
        super.onSaveInstanceState(bundle);
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
    /* renamed from: p */
    public final Intent mo43463p() {
        Intent q;
        String dataString;
        if (this.f79251n == 1 || (q = m66778q()) == null || (dataString = q.getDataString()) == null || !URLUtil.isValidUrl(dataString)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(dataString));
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.putExtra("com.google.android.gms.instantapps.DO_NOT_LAUNCH_INSTANT_APP", true);
        return intent;
    }

    /* renamed from: b */
    public final void mo33656b(String str) {
        setResult(-1, new Intent().putExtra("authAccount", str));
        if (adfr.m50319b(this)) {
            mo33660e();
        } else {
            mo43462o();
        }
    }

    /* renamed from: a */
    public final void mo33654a(int i) {
        Intent p = mo43463p();
        admo admo = new admo();
        Bundle bundle = new Bundle();
        bundle.putInt("failureReason", i);
        admo.f62170a.mo33429c("Instant Apps setup failure: %d", Integer.valueOf(i));
        bundle.putParcelable("browserIntent", p);
        admo.setArguments(bundle);
        mo43460a(admo);
    }

    /* renamed from: a */
    public final void mo33664a(int i, View.OnClickListener onClickListener) {
        this.f79249l.setVisibility(0);
        this.f79249l.setText(i);
        this.f79249l.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo43460a(adms adms) {
        this.f79241d.beginTransaction().replace(C0126R.C0129id.content_wrapper, adms).commitAllowingStateLoss();
        this.f79241d.executePendingTransactions();
        adml adml = this.f79240c;
        if (adml.f62164f == 0) {
            adml.f62163e.getViewTreeObserver().addOnGlobalLayoutListener(new admi(adml));
        }
    }

    /* renamed from: a */
    public final void mo33659a(String str) {
        adfb adfb = this.f79243f;
        if (adfb != null) {
            adfb.mo33409a(str);
        }
    }

    /* renamed from: a */
    public final void mo33655a(Throwable th) {
        f79239b.mo33424a(th);
        mo33654a(2);
    }
}

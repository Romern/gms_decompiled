package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.WebViewFullScreenActivity;
import java.util.Locale;

/* renamed from: bkge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkge extends bkbr implements bkfm, bjwh, bjxu, bkdb, bjer, bkfk {

    /* renamed from: Ds */
    private int f124192Ds;

    /* renamed from: Dt */
    private bkgd f124193Dt;

    /* renamed from: Du */
    private LogContext f124194Du;

    /* renamed from: aJ */
    public boolean f124195aJ = true;

    /* renamed from: aK */
    public bjwk f124196aK;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo52843a(Bundle bundle, View view) {
        bkgf au = mo65981au();
        if (au != null) {
            au.f123958c = this;
        }
        bkfj bkfj = (bkfj) getFragmentManager().findFragmentByTag("tagTooltipDialog");
        if (bkfj != null) {
            bkfj.f123958c = this;
        }
        return view;
    }

    /* renamed from: a */
    public void mo51905a(int i, Bundle bundle) {
        throw null;
    }

    /* renamed from: a */
    public final void mo65979a(bjwk bjwk) {
        this.f124196aK = bjwk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: al */
    public bkgd mo52879al() {
        if (this.f124193Dt == null) {
            this.f124193Dt = new bkgd(this);
        }
        return this.f124193Dt;
    }

    /* renamed from: at */
    public final LogContext mo65980at() {
        LogContext logContext = this.f124194Du;
        return logContext == null ? this.f123964aI : logContext;
    }

    /* renamed from: au */
    public final bkgf mo65981au() {
        return (bkgf) getFragmentManager().findFragmentByTag("tagWebViewDialog");
    }

    /* renamed from: av */
    public final bjxu mo65982av() {
        if (!bkfr.m105615f(this.f124192Ds)) {
            return null;
        }
        return this;
    }

    /* renamed from: aw */
    public final int mo65983aw() {
        if (getActivity() instanceof bkcs) {
            return ((bkcs) getActivity()).mo51883j();
        }
        for (Fragment fragment = this; fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof bkcs) {
                return ((bkcs) fragment).mo51883j();
            }
        }
        return 0;
    }

    /* renamed from: ax */
    public final String mo65984ax() {
        Account cn = mo51878cn();
        if (cn != null) {
            return cn.name;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bX */
    public long mo52966bX() {
        return mo52837W();
    }

    /* renamed from: bY */
    public void mo52947bY() {
    }

    /* renamed from: bZ */
    public void mo52779bZ() {
    }

    /* renamed from: cn */
    public Account mo51878cn() {
        if (getActivity() instanceof bjel) {
            return ((bjel) getActivity()).mo51878cn();
        }
        for (Fragment fragment = this; fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof bjel) {
                return ((bjel) fragment).mo51878cn();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo51922f();

    /* renamed from: n */
    public void mo52808n(boolean z) {
        if (this.f124195aJ != z) {
            this.f124195aJ = z;
            mo51922f();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f124192Ds = bkfr.m105625k(this.f123962aG);
        if (bundle != null) {
            this.f124195aJ = bundle.getBoolean("uiEnabled", true);
            LogContext logContext = (LogContext) bundle.getParcelable("logContext");
            this.f124194Du = logContext;
            if (logContext != null) {
                bjst.m104535c(logContext);
                return;
            }
            return;
        }
        long W = mo52837W();
        if (W != 0) {
            this.f124194Du = bjst.m104513a(this.f123964aI, W);
        }
    }

    public void onPause() {
        super.onPause();
        LogContext logContext = this.f124194Du;
        if (logContext != null) {
            bjst.m104530b(logContext);
        }
    }

    public void onResume() {
        super.onResume();
        mo51905a(4, Bundle.EMPTY);
        LogContext logContext = this.f124194Du;
        if (logContext != null && logContext.f151798f) {
            bjst.m104535c(logContext);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("uiEnabled", this.f124195aJ);
        bundle.putParcelable("logContext", this.f124194Du);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final long mo65985l(int i) {
        long bX = mo52966bX();
        if (bX != 0) {
            return bjtc.m104549a(bX, i, 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo52355a(View view, String str) {
        int i = this.f124192Ds;
        if (i != 1) {
            if (i == 3) {
                ContextThemeWrapper contextThemeWrapper = this.f123962aG;
                int i2 = this.f123961aF;
                Intent intent = new Intent();
                intent.setClassName(contextThemeWrapper.getPackageName(), WebViewFullScreenActivity.class.getName());
                intent.putExtra("url", str);
                intent.putExtra("themeResId", i2);
                startActivity(intent);
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Unsupported url link display type: %d", Integer.valueOf(i)));
        } else if (mo65981au() == null) {
            bkgf a = bkgf.m105678a(str, this.f123961aF);
            a.f123958c = this;
            a.show(getFragmentManager(), "tagWebViewDialog");
        }
    }

    /* renamed from: a */
    public final void mo65959a(bmoq bmoq) {
        if (getFragmentManager().findFragmentByTag("tagTooltipDialog") == null) {
            int i = this.f123961aF;
            bkfj bkfj = new bkfj();
            Bundle a = bkbq.m105268a(i);
            bkfj.setArguments(a);
            bjvp.m104736a(a, "tooltipProto", bmoq);
            bkfj.setTargetFragment(this, -1);
            bkfj.f123958c = this;
            bkfj.show(getFragmentManager(), "tagTooltipDialog");
        }
    }
}

package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bkjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkjk extends deu implements bkcy {

    /* renamed from: b */
    private int f124421b = 2;

    /* renamed from: c */
    private boolean f124422c = false;

    /* renamed from: d */
    private rjx f124423d;

    public bkjk() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    private final void m105999a(int i) {
        setResult(i);
        finish();
    }

    /* renamed from: g */
    private final void m106000g() {
        if (this.f124422c) {
            int i = this.f124421b;
            if (i == 1) {
                bkcz bkcz = (bkcz) getSupportFragmentManager().findFragmentByTag("ShowLockScreenActivity.InfoDialog");
                if (bkcz == null) {
                    bkcz = bkcz.m105338a(3, getResources().getString(C0126R.string.wallet_uic_android_pay_lockscreen_info_dialog_title), getResources().getString(C0126R.string.wallet_uic_google_pay_lockscreen_info_dialog_body), 0);
                    bkcz.show(getSupportFragmentManager(), "ShowLockScreenActivity.InfoDialog");
                }
                bkcz.f124032a = this;
            } else if (i == 2) {
                this.f124421b = 3;
                rjx rjx = this.f124423d;
                Activity e = mo59958e();
                rkb rkb = rjx.f43165D;
                rkb.mo24787a((rle) new aswz(rkb, e));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Activity mo59958e();

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 501) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 || i2 == 0 || i2 == 445) {
            if (i2 == 445) {
                i2 = 0;
            }
            m105999a(i2);
        } else {
            m105999a(1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("forceLockscreenToShow", false)) {
            int i = Build.VERSION.SDK_INT;
            this.f124421b = 2;
        }
        if (bundle != null) {
            this.f124421b = bundle.getInt("state");
        }
        this.f124423d = rjx.m33697b((com.google.android.chimera.Activity) this);
    }

    public final void onPause() {
        super.onPause();
        this.f124422c = false;
    }

    public final void onResume() {
        super.onResume();
        this.f124422c = true;
        m106000g();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.f124421b);
    }

    /* renamed from: a */
    public final void mo52044a(int i, int i2) {
        if (i == 0) {
            this.f124421b = 2;
            m106000g();
            return;
        }
        m105999a(0);
    }
}

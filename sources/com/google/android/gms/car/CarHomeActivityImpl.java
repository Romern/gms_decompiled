package com.google.android.gms.car;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarHomeActivityImpl extends FragmentActivity {

    /* renamed from: a */
    private nlx f29330a;

    /* renamed from: b */
    private boolean f29331b;

    static {
        odk.m28481a("CAR.HOME");
    }

    /* renamed from: a */
    private final void m22066a() {
        getWindow().setFlags(1024, 1024);
        obr obr = new obr(getWindow().getDecorView().findViewById(16908290));
        View view = (View) obr.mo21726f();
        if (view != null) {
            obr.mo21950a();
            view.setOnSystemUiVisibilityChangeListener(new obq(obr));
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 24 || keyCode == 25) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        m22066a();
        setRequestedOrientation(1);
        this.f29330a = new nlx();
        setContentView((int) C0126R.C0128layout.car_home_activity_gms);
        if (this.f29331b && !this.f29330a.isVisible()) {
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.container, this.f29330a).commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f29331b = false;
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        this.f29331b = true;
        m22066a();
    }
}

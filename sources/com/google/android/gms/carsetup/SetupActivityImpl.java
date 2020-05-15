package com.google.android.gms.carsetup;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.carsetup.frx.SetupFsm$EntryState;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupActivityImpl extends deu implements oxt {

    /* renamed from: c */
    private static final bnsn f29646c = odk.m28481a("CAR.SETUP");

    /* renamed from: d */
    private static final C1245ok f29647d;

    /* renamed from: b */
    public boolean f29648b;

    /* renamed from: e */
    private oxr f29649e;

    /* renamed from: f */
    private Fragment f29650f;

    /* renamed from: g */
    private volatile Fragment f29651g;

    /* renamed from: h */
    private ActivityResult f29652h;

    /* renamed from: i */
    private boolean f29653i;

    static {
        C1245ok okVar = new C1245ok();
        f29647d = okVar;
        okVar.put(owx.class, bpeb.FRX_INSTALL_APPS);
        f29647d.put(owc.class, bpeb.FRX_AUTHORIZE_CAR);
        f29647d.put(owe.class, bpeb.FRX_CAR_MOVING);
        f29647d.put(owk.class, bpeb.FRX_ERROR_FRAGMENT);
        f29647d.put(owh.class, bpeb.FRX_DOWNLOAD_RETRY);
        f29647d.put(oxb.class, bpeb.FRX_INTRO_FRAGMENT);
        f29647d.put(owo.class, bpeb.FRX_INCOMPATIBLE);
        f29647d.put(owq.class, bpeb.FRX_INCOMPATIBLE_NO_VANAGON);
        f29647d.put(oxc.class, bpeb.FRX_LOCK_SCREEN);
    }

    /* renamed from: a */
    public final void mo17447a(bpeb bpeb, bpea bpea) {
        oxr oxr = this.f29649e;
        bxvd da = bped.f137237x.mo74144da();
        int i = bpeb.f137221cE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bped bped = (bped) da.f164949b;
        int i2 = bped.f137239a | 1;
        bped.f137239a = i2;
        bped.f137240b = i;
        int i3 = bpea.f137033jW;
        bped.f137239a = i2 | 2;
        bped.f137241c = i3;
        oxr.mo22750a((bped) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo17451a(oxr oxr) {
        this.f29649e = oxr;
    }

    /* renamed from: b */
    public final void mo17452b(Intent intent) {
        startActivityForResult(intent, 1);
    }

    /* renamed from: e */
    public final Class mo17453e() {
        return SetupFsm$EntryState.class;
    }

    /* renamed from: g */
    public final List mo17454g() {
        return Collections.singletonList(new ove(this));
    }

    /* renamed from: h */
    public final oxr mo17455h() {
        return this.f29649e;
    }

    /* renamed from: i */
    public final Fragment mo17456i() {
        return this.f29650f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, android.content.Intent]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.String, android.os.Parcelable):void
     arg types: [java.lang.String, com.google.android.gms.carsetup.fsm.impl.ActivityResult]
     candidates:
      oxr.a(java.lang.String, java.lang.Object):void
      oxr.a(java.lang.String, android.os.Parcelable):void */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (this.f29652h != null) {
                bnsi d = f29646c.mo68390d();
                d.mo68432a("com.google.android.gms.carsetup.SetupActivityImpl", "onActivityResult", 332, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                ActivityResult activityResult = this.f29652h;
                d.mo68413a("Got an activity result when mPendingFsmActivityResult is not null. losing result with resultCode=%d data=%s", activityResult.f29663a, (Object) activityResult.f29664b);
            }
            if (!this.f29653i) {
                this.f29649e.mo22755a("EVENT_ACTIVITY_RESULT", (Parcelable) new ActivityResult(i2, intent));
            } else {
                this.f29652h = new ActivityResult(i2, intent);
            }
        }
    }

    public final void onBackPressed() {
        this.f29649e.mo22754a("EVENT_BACKBUTTON_PRESSED");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132017630);
        getWindow().addFlags(2621568);
        setRequestedOrientation(1);
        setContentView((int) C0126R.C0128layout.car_frx_activity);
        this.f29650f = getSupportFragmentManager().findFragmentByTag("fragment_main");
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().add(new ovj(), "fragment_fsm_controller").commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f29653i = true;
        super.onPause();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.String, android.os.Parcelable):void
     arg types: [java.lang.String, com.google.android.gms.carsetup.fsm.impl.ActivityResult]
     candidates:
      oxr.a(java.lang.String, java.lang.Object):void
      oxr.a(java.lang.String, android.os.Parcelable):void */
    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        this.f29653i = false;
        if (this.f29651g != null) {
            this.f29650f = this.f29651g;
            this.f29651g = null;
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, this.f29650f, "fragment_main").commit();
        }
        ActivityResult activityResult = this.f29652h;
        if (activityResult != null) {
            this.f29649e.mo22755a("EVENT_ACTIVITY_RESULT", (Parcelable) activityResult);
            this.f29652h = null;
        }
    }

    /* renamed from: a */
    public final void mo17448a(Class cls) {
        bpeb bpeb = (bpeb) f29647d.get(cls);
        if (bpeb == null) {
            bnsi c = f29646c.mo68388c();
            c.mo68432a("com.google.android.gms.carsetup.SetupActivityImpl", "a", 290, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("Attempting to log unknown FRX screen for class: %s", cls.getName());
            return;
        }
        mo17447a(bpeb, bpea.SCREEN_VIEW);
    }

    /* renamed from: a */
    public final void mo17449a(Class cls, Bundle bundle, boolean z) {
        boolean z2;
        Fragment fragment;
        if (z || (fragment = this.f29650f) == null || !cls.equals(fragment.getClass())) {
            if (!cls.equals(oxb.class) && !cls.equals(oxc.class)) {
                getWindow().clearFlags(2621568);
            }
            try {
                Fragment fragment2 = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                fragment2.setArguments(bundle);
                if (this.f29653i && !(fragment2 instanceof oxb)) {
                    this.f29651g = fragment2;
                    return;
                }
                Fragment fragment3 = this.f29650f;
                if (fragment3 == null || cls.equals(fragment3.getClass())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                    z2 = false;
                }
                this.f29650f = fragment2;
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                if (z2) {
                    if (this.f29648b) {
                        beginTransaction.setCustomAnimations(C0126R.anim.car_frx_slide_in_left, C0126R.anim.car_frx_slide_out_right);
                    } else {
                        beginTransaction.setCustomAnimations(C0126R.anim.car_frx_slide_in_right, C0126R.anim.car_frx_slide_out_left);
                    }
                }
                beginTransaction.replace(C0126R.C0129id.fragment_container, this.f29650f, "fragment_main").commitAllowingStateLoss();
                this.f29648b = false;
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo17450a(Class cls, bpea bpea) {
        bpeb bpeb = (bpeb) f29647d.get(cls);
        if (bpeb != null) {
            mo17447a(bpeb, bpea);
            return;
        }
        bnsi c = f29646c.mo68388c();
        c.mo68432a("com.google.android.gms.carsetup.SetupActivityImpl", "a", 306, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("Attempting to log unknown FRX screen for class: %s", cls.getName());
    }
}

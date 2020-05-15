package p000;

import android.animation.Animator;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.BaseCardActivity$1;

/* renamed from: ajhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ajhe extends deu {

    /* renamed from: b */
    public final Handler f70614b = new adzt();

    /* renamed from: c */
    public ajty f70615c;

    /* renamed from: d */
    View f70616d;

    /* renamed from: e */
    public ViewGroup f70617e;

    /* renamed from: f */
    public boolean f70618f;

    /* renamed from: g */
    public boolean f70619g = true;

    /* renamed from: h */
    public Runnable f70620h;

    /* renamed from: i */
    private final BroadcastReceiver f70621i = new BaseCardActivity$1(this, "nearby");

    /* renamed from: a */
    public static void m58699a(ViewGroup viewGroup, View view, Transition transition) {
        TransitionValues a = ajvo.m59110a(view);
        TransitionValues a2 = ajvo.m59110a(view);
        transition.captureStartValues(a);
        transition.captureEndValues(a2);
        Animator createAnimator = transition.createAnimator(viewGroup, a, a2);
        if (createAnimator != null) {
            createAnimator.start();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                m58699a(viewGroup, viewGroup2.getChildAt(i), transition);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo38633e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final ajty mo38634g() {
        if (this.f70615c == null) {
            this.f70615c = ahcb.m55442c(this);
        }
        return this.f70615c;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f70615c = mo38634g();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.f70614b.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        Runnable runnable = this.f70620h;
        if (runnable != null) {
            this.f70614b.removeCallbacks(runnable);
            this.f70620h = null;
        }
        this.f70618f = true;
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        int i = 1;
        if (akim.m59832d(this) && getResources().getConfiguration().orientation != 1) {
            i = 6;
        }
        int i2 = Build.VERSION.SDK_INT;
        setRequestedOrientation(i);
        if (getCallingActivity() != null && (getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.ShareSheetActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.InternalShareSheetActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.SetupActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.ConsentsActivity"))) {
            getWindow().clearFlags(2);
        }
        postponeEnterTransition();
        this.f70617e.getViewTreeObserver().addOnPreDrawListener(new ajhb(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f70616d.setVisibility(0);
        this.f70619g = true;
        ajgz ajgz = new ajgz(this);
        this.f70620h = ajgz;
        Handler handler = this.f70614b;
        int integer = getResources().getInteger(C0126R.integer.sharing_window_transition_duration);
        handler.postDelayed(ajgz, (long) (integer + integer + 50));
        this.f70618f = false;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        registerReceiver(this.f70621i, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        ahhd.m55766a(this, this.f70621i);
        this.f70616d.setVisibility(4);
        super.onStop();
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        View findViewById = findViewById(C0126R.C0129id.root);
        this.f70616d = findViewById;
        findViewById.setOnTouchListener(new ajgx(this));
        ViewGroup viewGroup = (ViewGroup) findViewById(C0126R.C0129id.card);
        this.f70617e = viewGroup;
        viewGroup.setOnTouchListener(ajgy.f70607a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38631a(ajhd ajhd) {
        this.f70615c.mo38894a().mo50373a(new ajha(this, ajhd));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38632a(boolean z) {
        if (this.f70617e != null) {
            for (int i = 0; i < this.f70617e.getChildCount(); i++) {
                this.f70617e.getChildAt(i).setAlpha(!z ? 1.0f : 0.0f);
            }
        }
    }
}

package p000;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: dcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcf implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static final /* synthetic */ int f12785a = 0;

    /* renamed from: b */
    private static final Handler f12786b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Context f12787c;

    /* renamed from: d */
    private Application f12788d;

    /* renamed from: e */
    private final PowerManager f12789e;

    /* renamed from: f */
    private final KeyguardManager f12790f;

    /* renamed from: g */
    private BroadcastReceiver f12791g;

    /* renamed from: h */
    private final dbt f12792h;

    /* renamed from: i */
    private WeakReference f12793i;

    /* renamed from: j */
    private final WeakReference f12794j;

    /* renamed from: k */
    private dbr f12795k;

    /* renamed from: l */
    private byte f12796l = -1;

    /* renamed from: m */
    private int f12797m = -1;

    public dcf(Context context, dbt dbt) {
        Context applicationContext = context.getApplicationContext();
        this.f12787c = applicationContext;
        this.f12792h = dbt;
        this.f12789e = (PowerManager) applicationContext.getSystemService("power");
        this.f12790f = (KeyguardManager) this.f12787c.getSystemService("keyguard");
        Context context2 = this.f12787c;
        if (context2 instanceof Application) {
            Application application = (Application) context2;
            this.f12788d = application;
            this.f12795k = new dbr(application, this);
        }
        View a = mo8512a();
        if (a != null) {
            a.removeOnAttachStateChangeListener(this);
            m8149a(a);
        }
        this.f12794j = new WeakReference(null);
    }

    /* renamed from: a */
    private final void m8148a(Activity activity, int i) {
        Window window;
        if (this.f12794j != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View a = mo8512a();
            if (a != null && peekDecorView != null && a.getRootView() == peekDecorView.getRootView()) {
                this.f12797m = i;
            }
        }
    }

    /* renamed from: c */
    private final void m8150c() {
        f12786b.post(new dcd(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        if ((r3.flags & com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) goto L_0x0059;
     */
    /* renamed from: b */
    public final void mo8513b() {
        byte b;
        Activity a;
        WindowManager.LayoutParams layoutParams;
        if (this.f12794j != null) {
            View a2 = mo8512a();
            if (a2 != null) {
                if (a2.getVisibility() != 0) {
                    b = 1;
                } else {
                    b = 0;
                }
                if (!a2.isShown()) {
                    b |= 2;
                }
                PowerManager powerManager = this.f12789e;
                if (powerManager != null && !powerManager.isScreenOn()) {
                    b |= 4;
                }
                if (!this.f12792h.f12748a) {
                    KeyguardManager keyguardManager = this.f12790f;
                    if (!(keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || (a = dcc.m8143a(a2)) == null)) {
                        Window window = a.getWindow();
                        if (window != null) {
                            layoutParams = window.getAttributes();
                        } else {
                            layoutParams = null;
                        }
                        if (layoutParams != null) {
                        }
                    }
                    b |= 8;
                }
                if (!a2.getGlobalVisibleRect(new Rect())) {
                    b |= 16;
                }
                if (!a2.getLocalVisibleRect(new Rect())) {
                    b |= 32;
                }
                int windowVisibility = a2.getWindowVisibility();
                int i = this.f12797m;
                if (i != -1) {
                    windowVisibility = i;
                }
                if (windowVisibility != 0) {
                    b |= 64;
                }
                if (this.f12796l != b) {
                    this.f12796l = (byte) b;
                    if (b == 0) {
                        SystemClock.elapsedRealtime();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f12796l = -1;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m8148a(activity, 0);
        mo8513b();
    }

    public final void onActivityDestroyed(Activity activity) {
        mo8513b();
    }

    public final void onActivityPaused(Activity activity) {
        m8148a(activity, 4);
        mo8513b();
    }

    public final void onActivityResumed(Activity activity) {
        m8148a(activity, 0);
        mo8513b();
        m8150c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo8513b();
    }

    public final void onActivityStarted(Activity activity) {
        m8148a(activity, 0);
        mo8513b();
    }

    public final void onActivityStopped(Activity activity) {
        mo8513b();
    }

    public final void onGlobalLayout() {
        mo8513b();
    }

    public final void onScrollChanged() {
        mo8513b();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f12797m = -1;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f12793i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f12791g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            dce dce = new dce(this);
            this.f12791g = dce;
            this.f12787c.registerReceiver(dce, intentFilter);
        }
        Application application = this.f12788d;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f12795k);
            } catch (Exception e) {
            }
        }
        mo8513b();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f12797m = -1;
        mo8513b();
        m8150c();
        m8149a(view);
    }

    /* renamed from: a */
    private final void m8149a(View view) {
        try {
            WeakReference weakReference = this.f12793i;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f12793i = null;
            }
        } catch (Exception e) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
        }
        BroadcastReceiver broadcastReceiver = this.f12791g;
        if (broadcastReceiver != null) {
            try {
                this.f12787c.unregisterReceiver(broadcastReceiver);
            } catch (Exception e3) {
            }
            this.f12791g = null;
        }
        Application application = this.f12788d;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f12795k);
            } catch (Exception e4) {
            }
        }
    }

    /* renamed from: a */
    public final View mo8512a() {
        WeakReference weakReference = this.f12794j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}

package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.WindowManager;
import com.google.android.gms.common.widget.phone.SnackbarLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: suu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class suu implements suv, suw {

    /* renamed from: f */
    private static final Handler f45195f = new adzt(Looper.getMainLooper());

    /* renamed from: g */
    private static final Object f45196g = new Object();

    /* renamed from: h */
    private static suu f45197h;

    /* renamed from: a */
    public final AtomicBoolean f45198a;

    /* renamed from: b */
    public Context f45199b;

    /* renamed from: c */
    public SnackbarLayout f45200c;

    /* renamed from: d */
    public WindowManager.LayoutParams f45201d;

    /* renamed from: e */
    public WindowManager.LayoutParams f45202e;

    /* renamed from: i */
    private suu f45203i;

    /* renamed from: j */
    private final long f45204j;

    /* renamed from: k */
    private Runnable f45205k;

    public suu(Context context, SnackbarLayout snackbarLayout, long j) {
        this(context, snackbarLayout, j, null);
    }

    /* renamed from: a */
    public final void mo26135a() {
        synchronized (f45196g) {
            if (f45197h == null) {
                m36385e();
                f45197h = this;
            } else {
                suu suu = f45197h;
                while (true) {
                    suu suu2 = suu.f45203i;
                    if (suu2 == null) {
                        break;
                    }
                    suu = suu2;
                }
                suu.f45203i = this;
            }
        }
    }

    /* renamed from: b */
    public final void mo26136b() {
        sut sut = new sut(this);
        this.f45205k = sut;
        f45195f.postDelayed(sut, this.f45204j);
    }

    /* renamed from: c */
    public final void mo26137c() {
        Runnable runnable = this.f45205k;
        if (runnable != null) {
            f45195f.removeCallbacks(runnable);
            this.f45205k = null;
        }
    }

    /* renamed from: d */
    public final void mo26138d() {
        if (!this.f45198a.getAndSet(true)) {
            if (this.f45200c != null) {
                try {
                    ((WindowManager) this.f45199b.getSystemService("window")).removeView(this.f45200c);
                    this.f45200c = null;
                } catch (Exception e) {
                    Log.w("Snackbar", "Snackbar window could not be removed");
                }
            }
            this.f45199b = null;
            synchronized (f45196g) {
                if (f45197h == this) {
                    f45197h = null;
                }
                suu suu = this.f45203i;
                if (suu != null) {
                    suu.m36385e();
                    this.f45203i = null;
                }
            }
        }
    }

    public suu(Context context, SnackbarLayout snackbarLayout, long j, byte[] bArr) {
        this.f45198a = new AtomicBoolean(false);
        this.f45199b = context;
        this.f45200c = snackbarLayout;
        this.f45204j = j;
        snackbarLayout.f30416f = this;
        snackbarLayout.f30417g = this;
    }

    /* renamed from: e */
    private final void m36385e() {
        int i = Build.VERSION.SDK_INT;
        if (Settings.canDrawOverlays(this.f45199b)) {
            WindowManager windowManager = (WindowManager) this.f45199b.getSystemService("window");
            this.f45200c.setOnTouchListener(new sus(this));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f45201d = layoutParams;
            WindowManager.LayoutParams layoutParams2 = this.f45202e;
            if (layoutParams2 != null) {
                layoutParams.copyFrom(layoutParams2);
            }
            this.f45201d.format = -3;
            this.f45201d.verticalWeight = 0.0f;
            this.f45201d.windowAnimations = 16973828;
            WindowManager.LayoutParams layoutParams3 = this.f45201d;
            int i2 = Build.VERSION.SDK_INT;
            layoutParams3.type = 2038;
            SnackbarLayout snackbarLayout = this.f45200c;
            WindowManager.LayoutParams layoutParams4 = this.f45201d;
            int i3 = snackbarLayout.f30411a;
            if (i3 != 0) {
                layoutParams4.gravity = i3;
            }
            int i4 = snackbarLayout.f30412b;
            if (i4 != 0) {
                layoutParams4.width = i4;
            }
            int i5 = snackbarLayout.f30413c;
            if (i5 != 0) {
                layoutParams4.height = i5;
            }
            int i6 = snackbarLayout.f30414d;
            if (i6 != 0) {
                layoutParams4.x = i6;
            }
            int i7 = snackbarLayout.f30415e;
            if (i7 != 0) {
                layoutParams4.y = i7;
            }
            layoutParams4.flags |= 160;
            this.f45200c.setLayoutParams(this.f45201d);
            windowManager.addView(this.f45200c, this.f45201d);
            if (this.f45204j > 0) {
                mo26136b();
                return;
            }
            return;
        }
        this.f45200c = null;
        mo26138d();
    }
}

package p000;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nqe {

    /* renamed from: b */
    public static final /* synthetic */ int f36392b = 0;

    /* renamed from: c */
    private static final bnsn f36393c = odk.m28481a("EglHelper");

    /* renamed from: g */
    private static SurfaceView f36394g;

    /* renamed from: a */
    public Context f36395a;

    /* renamed from: d */
    private EGLDisplay f36396d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e */
    private EGLContext f36397e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f */
    private EGLSurface f36398f = EGL14.EGL_NO_SURFACE;

    /* renamed from: h */
    private Surface f36399h;

    /* renamed from: i */
    private SurfaceView f36400i;

    /* renamed from: j */
    private HandlerThread f36401j;

    public nqe(Context context, Surface surface) {
        this.f36399h = surface;
        this.f36395a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static nqe m27300a(Context context, Surface surface, int i) {
        nqe nqe = new nqe(context, surface);
        try {
            nqe.m27301a(0);
        } catch (RuntimeException e) {
            if (i != 0) {
                bnsi d = f36393c.mo68390d();
                d.mo68432a("nqe", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Creating fallback egl");
                nqe.m27301a(i);
            } else {
                throw e;
            }
        }
        return nqe;
    }

    /* renamed from: d */
    private final SurfaceView m27303d() {
        AtomicReference atomicReference = new AtomicReference();
        WindowManager windowManager = (WindowManager) this.f36395a.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        int i = Build.VERSION.SDK_INT;
        layoutParams.type = 2038;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.flags = 408;
        Semaphore semaphore = new Semaphore(0);
        HandlerThread handlerThread = new HandlerThread("EglHelperHolder");
        this.f36401j = handlerThread;
        handlerThread.start();
        nuu.m27791a(this.f36401j.getLooper(), new nqc(this, atomicReference, semaphore, windowManager, layoutParams));
        try {
            if (semaphore.tryAcquire(10000, TimeUnit.MILLISECONDS)) {
                return (SurfaceView) atomicReference.get();
            }
        } catch (InterruptedException e) {
        }
        throw new RuntimeException("Could not create backup holder");
    }

    /* renamed from: b */
    public final void mo21452b() {
        EGLDisplay eGLDisplay = this.f36396d;
        EGLSurface eGLSurface = this.f36398f;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f36397e)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: c */
    public final void mo21453c() {
        EGL14.eglSwapBuffers(this.f36396d, this.f36398f);
    }

    /* renamed from: a */
    private final void m27301a(int i) {
        int i2;
        int i3 = i;
        try {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f36396d = eglGetDisplay;
            if (!bmxi.m108538a(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(this.f36396d, iArr, 0, iArr, 1)) {
                    int[] iArr2 = new int[11];
                    iArr2[0] = 12324;
                    iArr2[1] = 8;
                    iArr2[2] = 12323;
                    iArr2[3] = 8;
                    iArr2[4] = 12322;
                    iArr2[5] = 8;
                    iArr2[6] = 12352;
                    iArr2[7] = 4;
                    if (i3 == 0) {
                        i2 = 12610;
                    } else {
                        i2 = 12344;
                    }
                    iArr2[8] = i2;
                    iArr2[9] = 1;
                    iArr2[10] = 12344;
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (EGL14.eglChooseConfig(this.f36396d, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        this.f36397e = EGL14.eglCreateContext(this.f36396d, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344, 0, 0, 0}, 0);
                        m27302a("eglCreateContext");
                        if (!bmxi.m108538a(this.f36397e, EGL14.EGL_NO_CONTEXT)) {
                            int[] iArr3 = {12344};
                            if (i3 == 0) {
                                this.f36398f = EGL14.eglCreateWindowSurface(this.f36396d, eGLConfigArr[0], this.f36399h, iArr3, 0);
                            } else {
                                if (i3 == 2) {
                                    this.f36400i = m27303d();
                                } else if (i3 == 1 && f36394g == null) {
                                    f36394g = m27303d();
                                }
                                this.f36398f = EGL14.eglCreateWindowSurface(this.f36396d, eGLConfigArr[0], ((SurfaceView) ooe.m29303a(this.f36400i).mo22383a(f36394g)).getHolder(), iArr3, 0);
                            }
                            m27302a("eglCreateWindowSurface");
                            if (bmxi.m108538a(this.f36398f, EGL14.EGL_NO_SURFACE)) {
                                throw new RuntimeException("surface was null");
                            }
                            return;
                        }
                        throw new RuntimeException("null context");
                    }
                    throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                }
                this.f36396d = EGL14.EGL_NO_DISPLAY;
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        } catch (RuntimeException e) {
            if (!bmxi.m108538a(this.f36397e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f36396d, this.f36397e);
            }
            if (!bmxi.m108538a(this.f36398f, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglTerminate(this.f36396d);
            }
            EGL14.eglReleaseThread();
            throw e;
        }
    }

    /* renamed from: a */
    private static final void m27302a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            String hexString = Integer.toHexString(eglGetError);
            StringBuilder sb = new StringBuilder(str.length() + 15 + String.valueOf(hexString).length());
            sb.append(str);
            sb.append(": EGL error: 0x");
            sb.append(hexString);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo21451a() {
        if (!bmxi.m108538a(this.f36396d, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglDestroySurface(this.f36396d, this.f36398f);
            EGL14.eglDestroyContext(this.f36396d, this.f36397e);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f36396d);
        }
        Surface surface = this.f36399h;
        if (surface != null) {
            surface.release();
        }
        SurfaceView surfaceView = this.f36400i;
        if (surfaceView != null) {
            this.f36400i = null;
            nuu.m27797c(this.f36401j.getLooper(), new nqd(this, surfaceView));
            this.f36401j.quit();
        }
        this.f36396d = EGL14.EGL_NO_DISPLAY;
        this.f36397e = EGL14.EGL_NO_CONTEXT;
        this.f36398f = EGL14.EGL_NO_SURFACE;
        this.f36399h = null;
        this.f36395a = null;
    }
}

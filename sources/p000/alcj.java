package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.opengl.Matrix;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: alcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alcj implements GLSurfaceView.Renderer {

    /* renamed from: s */
    private static final double f73421s = Math.sqrt(2.0d);

    /* renamed from: A */
    private float f73422A = 0.0f;

    /* renamed from: B */
    private albi f73423B;

    /* renamed from: C */
    private albn f73424C;

    /* renamed from: D */
    private final float[] f73425D = new float[16];

    /* renamed from: E */
    private final float[] f73426E = new float[16];

    /* renamed from: F */
    private final float[] f73427F = new float[16];

    /* renamed from: G */
    private final float[] f73428G = new float[16];

    /* renamed from: H */
    private final float[] f73429H = new float[16];

    /* renamed from: I */
    private final float[] f73430I = new float[4];

    /* renamed from: J */
    private final float[] f73431J = new float[4];

    /* renamed from: K */
    private final alaz f73432K = new alaz();

    /* renamed from: L */
    private final alaz f73433L = new alaz();

    /* renamed from: M */
    private final int[] f73434M = new int[4];

    /* renamed from: N */
    private boolean f73435N = false;

    /* renamed from: O */
    private float f73436O = 20.0f;

    /* renamed from: P */
    private final RectF f73437P = new RectF();

    /* renamed from: Q */
    private final Context f73438Q;

    /* renamed from: R */
    private albj f73439R;

    /* renamed from: a */
    public albp f73440a;

    /* renamed from: b */
    public boolean f73441b = false;

    /* renamed from: c */
    public boolean f73442c = false;

    /* renamed from: d */
    public int f73443d;

    /* renamed from: e */
    public int f73444e;

    /* renamed from: f */
    public float f73445f = 75.0f;

    /* renamed from: g */
    public float f73446g = 75.0f;

    /* renamed from: h */
    public float f73447h = 0.0f;

    /* renamed from: i */
    public float f73448i = 0.0f;

    /* renamed from: j */
    public float f73449j = 1.0f;

    /* renamed from: k */
    public float f73450k = 0.0f;

    /* renamed from: l */
    public final albl f73451l;

    /* renamed from: m */
    public final alay f73452m = new alay();

    /* renamed from: n */
    public albs f73453n = null;

    /* renamed from: o */
    public boolean f73454o = false;

    /* renamed from: p */
    public albu f73455p = null;

    /* renamed from: q */
    public alch f73456q = null;

    /* renamed from: r */
    public albu f73457r = null;

    /* renamed from: t */
    private final alce f73458t;

    /* renamed from: u */
    private final int f73459u;

    /* renamed from: v */
    private float f73460v = 0.0f;

    /* renamed from: w */
    private float f73461w = 0.0f;

    /* renamed from: x */
    private float f73462x = 75.0f;

    /* renamed from: y */
    private float f73463y = 0.35f;

    /* renamed from: z */
    private float f73464z = 0.0f;

    public alcj(alch alch, alce alce, Context context) {
        this.f73438Q = context;
        this.f73459u = C0126R.C0127drawable.panorama_cubemap;
        this.f73456q = alch;
        this.f73458t = alce;
        albl albl = this.f73451l;
        if (albl != null) {
            albl.mo40094a();
        }
        double degrees = Math.toDegrees((double) this.f73458t.f73393a);
        RectF rectF = this.f73437P;
        double d = (double) this.f73458t.f73397e;
        Double.isNaN(d);
        rectF.left = (float) Math.toDegrees(d - 1.4292036732051034d);
        RectF rectF2 = this.f73437P;
        rectF2.right = rectF2.left + ((float) degrees);
        double degrees2 = Math.toDegrees((double) this.f73458t.f73394b);
        this.f73437P.top = 90.0f - ((float) Math.toDegrees((double) this.f73458t.f73396d));
        RectF rectF3 = this.f73437P;
        rectF3.bottom = rectF3.top - ((float) degrees2);
        mo40122c();
        albl albl2 = new albl(this.f73458t.f73401i);
        this.f73451l = albl2;
        albl2.f73296e = new alci(this);
        this.f73435N = true;
        if (this.f73443d > 0 && this.f73444e > 0) {
            this.f73456q.requestRender();
        }
        Matrix.setIdentityM(this.f73429H, 0);
    }

    /* renamed from: a */
    private static float m60846a(float f, float f2, float f3) {
        double tan = Math.tan(Math.toRadians((double) f) / 2.0d);
        double d = (double) f2;
        Double.isNaN(d);
        double d2 = d / (tan + tan);
        double d3 = (double) f3;
        Double.isNaN(d3);
        double atan = Math.atan(d3 / (d2 + d2));
        return (float) Math.toDegrees(atan + atan);
    }

    /* renamed from: d */
    private final void m60847d() {
        this.f73435N = false;
        this.f73439R = new albj(null);
        alcn alcn = this.f73458t.f73401i;
        m60848e();
        albi albi = new albi(this.f73451l);
        this.f73423B = albi;
        albi.mo40088a(this.f73458t);
        this.f73423B.f73278k = this.f73439R;
        GLES20.glClearColor(alan.f73225a[0], alan.f73225a[1], alan.f73225a[2], alan.f73225a[3]);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        this.f73424C = new albn(BitmapFactory.decodeResource(this.f73438Q.getResources(), this.f73459u, options));
        this.f73441b = true;
        albu albu = this.f73457r;
        if (albu != null) {
            albu.mo40055a();
        }
    }

    /* renamed from: e */
    private static final void m60848e() {
        GLES20.glGetIntegerv(3379, new int[1], 0);
    }

    /* renamed from: b */
    public final void mo40121b() {
        albu albu = this.f73455p;
        if (albu != null) {
            if (Boolean.valueOf(this.f73442c).booleanValue()) {
                alar alar = (alar) albu;
                if (!alar.f73231a.f81437d.mo49124e()) {
                    alar.f73231a.f81437d.mo49117b();
                }
            } else {
                alar alar2 = (alar) albu;
                if (alar2.f73231a.f81437d.mo49124e()) {
                    alar2.f73231a.f81437d.mo49120c();
                }
            }
        }
        this.f73456q.requestRender();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: c */
    public final void mo40122c() {
        alce alce = this.f73458t;
        if (alce != null && this.f73423B != null) {
            float b = alce.mo40112b();
            float a = this.f73458t.mo40111a();
            this.f73436O = (this.f73446g / 90.0f) * 20.0f;
            this.f73448i = Math.max(Math.min(this.f73448i, 90.0f), -90.0f);
            if (((double) this.f73458t.f73393a) < 6.283185307179586d) {
                float f = this.f73460v / 2.0f;
                float f2 = this.f73461w / 2.0f;
                this.f73447h = Math.min(this.f73447h, (this.f73437P.right - this.f73436O) + f + a);
                this.f73447h = Math.max(this.f73447h, ((this.f73437P.left + this.f73436O) - f) + a);
                this.f73448i = -Math.min(-this.f73448i, (this.f73437P.top - this.f73436O) + f2 + b);
                this.f73448i = -Math.max(-this.f73448i, ((this.f73437P.bottom + this.f73436O) - f2) + b);
                mo40116a();
            }
        }
    }

    public final void onDrawFrame(GL10 gl10) {
        if (this.f73435N) {
            try {
                m60847d();
            } catch (albh e) {
                bqye.m113758a(e);
            }
            alcn alcn = this.f73458t.f73401i;
            m60848e();
            this.f73423B.mo40088a(this.f73458t);
        }
        if (this.f73441b) {
            alch alch = this.f73456q;
            if (alch != null && alch.f73406c.mo40127a(alch.f73407d)) {
                alch.f73405b.mo40119a(alch.f73407d.x, alch.f73407d.y, alch.f73410g);
                alay alay = alch.f73409f;
                float f = alay.f73237a;
                alay alay2 = alch.f73410g;
                float f2 = alay2.f73237a;
                float f3 = alay.f73238b;
                float f4 = alay2.f73238b;
                alcj alcj = alch.f73405b;
                alcj.mo40118a(alcj.f73448i - (f - f2), alcj.f73447h - (f3 - f4));
                alch.requestRender();
            }
            if (this.f73442c) {
                float f5 = this.f73447h;
                float f6 = this.f73463y;
                this.f73447h = f5 + f6;
                this.f73464z = 1.0f;
                float f7 = this.f73450k;
                if (f7 > 0.0f) {
                    float f8 = f7 - f6;
                    this.f73450k = f8;
                    if (f8 <= 0.0f) {
                        this.f73442c = false;
                        mo40121b();
                    }
                }
                mo40116a();
                mo40122c();
                this.f73456q.requestRender();
            } else {
                float f9 = this.f73464z;
                if (f9 > 2.0E-4f) {
                    this.f73447h += this.f73463y * f9;
                    this.f73464z = f9 * 0.92f;
                    mo40116a();
                    mo40122c();
                    this.f73456q.requestRender();
                }
            }
            float f10 = this.f73449j;
            this.f73449j = f10 + ((1.0f - f10) * 0.05f);
            if (this.f73441b) {
                if (this.f73454o) {
                    mo40116a();
                }
                GLES20.glViewport(0, 0, this.f73443d, this.f73444e);
                GLES20.glClear(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                GLES20.glClear(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                GLES20.glEnable(2929);
                try {
                    this.f73424C.mo40085b(this.f73427F);
                    GLES20.glLineWidth(1.0f);
                    GLES20.glEnable(3042);
                    GLES20.glBlendFunc(770, 771);
                    this.f73439R.mo40089a();
                    this.f73439R.mo40090a(this.f73449j);
                    alaz alaz = this.f73432K;
                    mo40120a((float) (this.f73443d / 2), (float) (this.f73444e / 2), this.f73430I);
                    float[] fArr = this.f73430I;
                    alaz.mo40068a(fArr[0], fArr[1], fArr[2]);
                    alaz.mo40067a();
                    albi albi = this.f73423B;
                    float[] fArr2 = this.f73427F;
                    alaz alaz2 = this.f73432K;
                    float f11 = this.f73422A;
                    alaz alaz3 = albi.f73277j;
                    float[] fArr3 = albi.f73275h;
                    fArr3[0] = alaz2.f73239a;
                    fArr3[1] = alaz2.f73240b;
                    fArr3[2] = alaz2.f73241c;
                    fArr3[3] = 1.0f;
                    Matrix.multiplyMV(albi.f73276i, 0, albi.f73273f, 0, fArr3, 0);
                    float[] fArr4 = albi.f73276i;
                    alaz3.f73239a = fArr4[0];
                    alaz3.f73240b = fArr4[1];
                    alaz3.f73241c = fArr4[2];
                    alaz alaz4 = albi.f73277j;
                    int i = albi.f73281m + 1;
                    albi.f73281m = i;
                    if (i % 4 == 0) {
                        albi.f73281m = 0;
                        int i2 = 0;
                        while (true) {
                            albc[][] albcArr = albi.f73280l;
                            if (i2 >= albcArr.length) {
                                break;
                            }
                            albc[] albcArr2 = albcArr[i2];
                            for (albc albc : albcArr2) {
                                albc.f73254i = false;
                                int i3 = 0;
                                while (true) {
                                    alaz[] alazArr = albc.f73253h;
                                    if (i3 >= alazArr.length) {
                                        break;
                                    }
                                    alaz alaz5 = alazArr[i3];
                                    if ((alaz5.f73239a * alaz4.f73239a) + (alaz5.f73240b * alaz4.f73240b) + (alaz5.f73241c * alaz4.f73241c) >= f11) {
                                        albc.f73254i = true;
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            i2++;
                        }
                    }
                    albi.mo40085b(fArr2);
                } catch (albh e2) {
                    bqye.m113758a(e2);
                }
            }
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f73443d = i;
        this.f73444e = i2;
        if (this.f73458t != null) {
            if (!this.f73441b) {
                try {
                    m60847d();
                } catch (albh e) {
                    bqye.m113758a(e);
                }
            }
            mo40117a(this.f73462x);
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014a, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo40116a() {
        int i;
        synchronized (this) {
            int i2 = this.f73443d;
            if (i2 > 0 && (i = this.f73444e) > 0) {
                float f = this.f73461w;
                if (f > 0.0f) {
                    double d = (double) f;
                    Double.isNaN(d);
                    float tan = ((float) Math.tan((d / 360.0d) * 3.141592653589793d)) * 0.5f;
                    float f2 = tan * (((float) i2) / ((float) i));
                    Matrix.frustumM(this.f73425D, 0, -f2, f2, -tan, tan, 0.5f, 200.0f);
                    Matrix.setIdentityM(this.f73426E, 0);
                    if (this.f73454o) {
                        albp albp = this.f73440a;
                        if (albp != null) {
                            Matrix.rotateM(this.f73426E, 0, ((float) albp.f73304a) - this.f73453n.f73359m, 0.0f, 0.0f, 1.0f);
                        }
                        albs albs = this.f73453n;
                        albq albq = albs.f73357k;
                        if (albq.f73322c != 0) {
                            for (int i3 = 0; i3 < 3; i3++) {
                                for (int i4 = 0; i4 < 3; i4++) {
                                    albq.f73320a[(i4 * 4) + i3] = albq.f73321b.mo40058a(i3, i4);
                                }
                            }
                            double[] dArr = albq.f73320a;
                            dArr[11] = 0.0d;
                            dArr[7] = 0.0d;
                            dArr[3] = 0.0d;
                            dArr[14] = 0.0d;
                            dArr[13] = 0.0d;
                            dArr[12] = 0.0d;
                            dArr[15] = 1.0d;
                            albs.f73361o = dArr;
                        }
                        float[] fArr = new float[16];
                        for (int i5 = 0; i5 < 16; i5++) {
                            fArr[i5] = (float) albs.f73361o[i5];
                        }
                        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                        float[] fArr2 = new float[16];
                        Matrix.setIdentityM(fArr2, 0);
                        Matrix.rotateM(fArr2, 0, albs.f73359m, 0.0f, 0.0f, 1.0f);
                        Matrix.multiplyMM(albs.f73358l, 0, fArr2, 0, fArr, 0);
                        float[] fArr3 = albs.f73358l;
                        Matrix.multiplyMM(fArr3, 0, this.f73429H, 0, fArr3, 0);
                        Matrix.multiplyMM(this.f73428G, 0, this.f73426E, 0, fArr3, 0);
                        Matrix.rotateM(this.f73428G, 0, this.f73447h, 0.0f, 1.0f, 0.0f);
                        float[] fArr4 = this.f73428G;
                        System.arraycopy(fArr4, 0, this.f73426E, 0, fArr4.length);
                        Matrix.multiplyMM(this.f73427F, 0, this.f73425D, 0, this.f73428G, 0);
                        return;
                    }
                    Matrix.rotateM(this.f73426E, 0, -0.0f, 0.0f, 0.0f, 1.0f);
                    Matrix.rotateM(this.f73426E, 0, this.f73448i, 1.0f, 0.0f, 0.0f);
                    Matrix.rotateM(this.f73426E, 0, this.f73447h, 0.0f, 1.0f, 0.0f);
                    Matrix.multiplyMM(this.f73427F, 0, this.f73425D, 0, this.f73426E, 0);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final void mo40117a(float f) {
        float f2;
        float max = Math.max(Math.min(f, 90.0f), 20.0f);
        this.f73462x = max;
        int i = this.f73443d;
        int i2 = this.f73444e;
        if (i > i2) {
            this.f73460v = max;
            this.f73461w = m60846a(max, (float) i, (float) i2);
            f2 = this.f73460v;
            this.f73446g = f2;
        } else {
            this.f73461w = max;
            f2 = m60846a(max, (float) i2, (float) i);
            this.f73460v = f2;
            this.f73446g = this.f73461w;
        }
        this.f73463y = (f2 / 90.0f) * 0.35f;
        this.f73422A = (float) Math.cos(Math.toRadians((double) this.f73462x) * 0.5d * f73421s);
        mo40122c();
        mo40116a();
    }

    /* renamed from: a */
    public final void mo40118a(float f, float f2) {
        if (!this.f73454o) {
            this.f73448i = f;
            this.f73447h = f2;
            mo40122c();
            this.f73442c = false;
            mo40116a();
            mo40121b();
        }
    }

    /* renamed from: a */
    public final void mo40119a(float f, float f2, alay alay) {
        mo40120a(f, f2, this.f73431J);
        float[] fArr = this.f73431J;
        this.f73433L.mo40068a(fArr[0], fArr[1], fArr[2]);
        this.f73433L.mo40067a();
        float asin = (float) Math.asin((double) this.f73433L.f73240b);
        alaz alaz = this.f73433L;
        float atan2 = (float) Math.atan2((double) alaz.f73239a, (double) alaz.f73241c);
        if (atan2 < 0.0f) {
            double d = (double) atan2;
            Double.isNaN(d);
            atan2 = (float) (d + 6.283185307179586d);
        }
        alay.f73237a = (float) Math.toDegrees((double) asin);
        alay.f73238b = (float) Math.toDegrees((double) atan2);
    }

    /* renamed from: a */
    public final void mo40120a(float f, float f2, float[] fArr) {
        int i = this.f73444e;
        int[] iArr = this.f73434M;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = this.f73443d;
        iArr[3] = i;
        GLU.gluUnProject(f, ((float) i) - f2, -1.0f, this.f73426E, 0, this.f73425D, 0, iArr, 0, fArr, 0);
    }
}

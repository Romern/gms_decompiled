package p000;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;

/* renamed from: albe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albe implements albm {

    /* renamed from: a */
    public static BlockingDeque f73255a = new LinkedBlockingDeque();

    /* renamed from: h */
    private static final albd[] f73256h = new albd[2];

    /* renamed from: b */
    public final Semaphore f73257b;

    /* renamed from: c */
    public final albu f73258c;

    /* renamed from: d */
    public Bitmap f73259d;

    /* renamed from: e */
    final /* synthetic */ int f73260e;

    /* renamed from: f */
    final /* synthetic */ int f73261f;

    /* renamed from: g */
    final /* synthetic */ albl f73262g;

    /* renamed from: i */
    private final albb f73263i;

    /* renamed from: j */
    private albg f73264j;

    /* renamed from: k */
    private boolean f73265k = false;

    /* renamed from: l */
    private float f73266l = 0.0f;

    /* renamed from: m */
    private long f73267m = -1;

    static {
        int i = 0;
        while (true) {
            albd[] albdArr = f73256h;
            int length = albdArr.length;
            if (i < 2) {
                albdArr[i] = new albd();
                f73256h[i].start();
                i++;
            } else {
                return;
            }
        }
    }

    public albe(albl albl, Semaphore semaphore, albu albu, albb albb, int i, int i2) {
        this.f73262g = albl;
        this.f73260e = i;
        this.f73261f = i2;
        this.f73257b = semaphore;
        this.f73258c = albu;
        this.f73263i = albb;
    }

    /* renamed from: a */
    public final albg mo40079a() {
        albg albg = this.f73264j;
        if (albg != null) {
            return albg;
        }
        if (!this.f73265k) {
            try {
                f73255a.putLast(this);
                this.f73265k = true;
            } catch (InterruptedException e) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo40080b() {
        albg albg = this.f73264j;
        if (albg != null) {
            GLES20.glDeleteTextures(1, new int[]{albg.f73279a}, 0);
            albg.f73279a = -1;
            this.f73264j = null;
            this.f73266l = 0.0f;
            this.f73267m = -1;
        }
    }

    /* renamed from: c */
    public final boolean mo40081c() {
        Bitmap bitmap;
        if (this.f73259d == null) {
            return false;
        }
        albg albg = new albg(null);
        this.f73264j = albg;
        try {
            albg.mo40087a(this.f73259d);
            this.f73257b.release();
            if (this.f73263i == null) {
                bitmap = this.f73259d;
                bitmap.recycle();
                this.f73259d = null;
                this.f73265k = false;
                return true;
            }
        } catch (albh e) {
            Log.e("DelayedTextureLoader", "Could not load texture");
            this.f73257b.release();
            if (this.f73263i == null) {
                bitmap = this.f73259d;
            }
        } catch (Throwable th) {
            this.f73257b.release();
            if (this.f73263i != null) {
                int i = Build.VERSION.SDK_INT;
                this.f73263i.mo40077a(this.f73259d);
            } else {
                this.f73259d.recycle();
            }
            this.f73259d = null;
            this.f73265k = false;
            throw th;
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f73263i.mo40077a(this.f73259d);
        this.f73259d = null;
        this.f73265k = false;
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: d */
    public final float mo40082d() {
        if (this.f73264j == null) {
            return 0.0f;
        }
        if (this.f73266l == 1.0f) {
            return 1.0f;
        }
        if (this.f73267m < 0) {
            this.f73267m = System.currentTimeMillis();
        }
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f73267m)) / 200.0f;
        this.f73266l = currentTimeMillis;
        this.f73266l = Math.min(currentTimeMillis, 1.0f);
        this.f73258c.mo40055a();
        return this.f73266l;
    }
}

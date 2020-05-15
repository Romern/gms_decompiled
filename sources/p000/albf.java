package p000;

import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Vector;

/* renamed from: albf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class albf {

    /* renamed from: a */
    protected FloatBuffer f73268a = null;

    /* renamed from: b */
    protected FloatBuffer f73269b = null;

    /* renamed from: c */
    protected ShortBuffer f73270c = null;

    /* renamed from: d */
    protected final Vector f73271d = new Vector();

    /* renamed from: e */
    protected final float[] f73272e = new float[16];

    /* renamed from: f */
    public final float[] f73273f = new float[16];

    /* renamed from: g */
    protected final float[] f73274g = new float[16];

    /* renamed from: h */
    public final float[] f73275h = new float[4];

    /* renamed from: i */
    public final float[] f73276i = new float[4];

    /* renamed from: j */
    public final alaz f73277j = new alaz();

    /* renamed from: k */
    public albj f73278k = null;

    public albf() {
        Matrix.setIdentityM(this.f73272e, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40083a(int i, int i2) {
        this.f73268a = ByteBuffer.allocateDirect(i * 12).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f73270c = ByteBuffer.allocateDirect(i2 + i2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f73269b = ByteBuffer.allocateDirect((i + i) * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: a */
    public abstract void mo40084a(float[] fArr);

    /* renamed from: b */
    public final void mo40085b(float[] fArr) {
        Matrix.multiplyMM(this.f73274g, 0, fArr, 0, this.f73272e, 0);
        mo40084a(this.f73274g);
    }
}

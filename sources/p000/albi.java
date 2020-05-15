package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Vector;

/* renamed from: albi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albi extends albf {

    /* renamed from: l */
    public albc[][] f73280l;

    /* renamed from: m */
    public int f73281m;

    /* renamed from: n */
    private alce f73282n;

    /* renamed from: o */
    private final albl f73283o;

    /* renamed from: p */
    private alcn f73284p;

    public albi(albl albl) {
        this.f73283o = albl;
    }

    /* renamed from: a */
    public final void mo40088a(alce alce) {
        float f;
        albi albi = this;
        alce alce2 = alce;
        albi.f73283o.mo40094a();
        albi.f73281m = -1;
        albi.f73282n = alce2;
        albi.f73284p = alce2.f73401i;
        float a = alce.mo40111a();
        float b = alce.mo40112b();
        float f2 = alce2.f73400h.f73383j;
        int i = 0;
        Matrix.setIdentityM(albi.f73272e, 0);
        Matrix.rotateM(albi.f73272e, 0, -a, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(albi.f73272e, 0, b, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(albi.f73272e, 0, -f2, 0.0f, 0.0f, 1.0f);
        Matrix.transposeM(albi.f73273f, 0, albi.f73272e, 0);
        if (albi.f73284p != null) {
            Vector vector = albi.f73271d;
            int size = vector.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((albm) vector.get(i2)).mo40080b();
            }
            albi.f73271d.clear();
            for (int i3 = 0; i3 < albi.f73284p.f73473a; i3++) {
                for (int i4 = 0; i4 < albi.f73284p.f73474b; i4++) {
                    Vector vector2 = albi.f73271d;
                    albl albl = albi.f73283o;
                    albe albe = new albe(albl, albl.f73292a, albl.f73295d, albl.f73293b, i3, i4);
                    albl.f73294c.add(albe);
                    vector2.add(albe);
                }
            }
        } else {
            Log.e("PartialSphere", "tile provider is null. Cannot load textures");
        }
        albz albz = alce2.f73400h;
        float f3 = ((float) albz.f73374a) / ((float) albz.f73375b);
        float f4 = (float) albz.f73377d;
        double d = (double) (512.0f / f4);
        Double.isNaN(d);
        double d2 = d * 3.141592653589793d;
        alce2.f73395c = ((float) (d2 + d2)) / f3;
        alcn alcn = alce2.f73401i;
        double d3 = (double) (((float) alcn.f73475c) / f4);
        Double.isNaN(d3);
        double d4 = d3 * 3.141592653589793d;
        alce2.f73398f = ((float) (d4 + d4)) / f3;
        double d5 = (double) (((float) alcn.f73476d) / ((float) albz.f73378e));
        Double.isNaN(d5);
        alce2.f73399g = ((float) (d5 * 3.141592653589793d)) / f3;
        int ceil = (int) Math.ceil((double) (albi.f73282n.f73395c / 0.12f));
        StringBuilder sb = new StringBuilder(31);
        sb.append("tesselation factor: ");
        sb.append(ceil);
        sb.toString();
        alcn alcn2 = albi.f73284p;
        char c = 1;
        int i5 = (alcn2.f73474b * ceil) + 1;
        int i6 = (alcn2.f73473a * ceil) + 1;
        albi.mo40083a(i5 * i6, (i5 - 1) * (i6 - 1) * 6);
        alce alce3 = albi.f73282n;
        float f5 = alce3.f73395c;
        float f6 = f5 / ((float) ceil);
        float f7 = (alce3.f73399g / f5) * f6;
        float f8 = (alce3.f73398f / f5) * f6;
        float f9 = (alce3.f73396d + alce3.f73394b) - 2.8584073f;
        float f10 = (-alce3.f73397e) - 1.4292036f;
        int i7 = (i6 - ceil) - 1;
        int i8 = 2;
        int[] iArr = new int[2];
        iArr[1] = i5;
        iArr[0] = i6;
        albo[][] alboArr = (albo[][]) Array.newInstance(albo.class, iArr);
        int i9 = 0;
        while (i9 < i5) {
            if (i9 >= ceil) {
                alce alce4 = albi.f73282n;
                f = ((((float) i9) * f6) - f9) - (alce4.f73395c - alce4.f73399g);
            } else {
                f = (((float) i9) * f7) - f9;
            }
            int i10 = 0;
            while (i10 < i6) {
                float f11 = ((float) i10) * f6;
                if (i10 > i7) {
                    f11 = (((float) i7) * f6) + (((float) (i10 - i7)) * f8);
                }
                double d6 = (double) f;
                double sin = Math.sin(d6);
                double d7 = (double) ((f11 - 2.8584073f) - f10);
                double sin2 = Math.sin(d7);
                float cos = (float) Math.cos(d6);
                alboArr[i10][i9] = new albo(((float) Math.cos(d7)) * cos * 4.9f, ((float) sin) * 4.9f, cos * ((float) sin2) * 4.9f);
                i10++;
                f6 = f6;
                ceil = ceil;
                i6 = i6;
                f = f;
                f9 = f9;
                f10 = f10;
                f7 = f7;
                i5 = i5;
            }
            i9++;
            albi = this;
            i8 = 2;
            c = 1;
            i = 0;
        }
        alcn alcn3 = albi.f73284p;
        int i11 = alcn3.f73473a;
        int i12 = alcn3.f73474b;
        int[] iArr2 = new int[i8];
        iArr2[c] = i12;
        iArr2[i] = i11;
        albi.f73280l = (albc[][]) Array.newInstance(albc.class, iArr2);
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = 0;
            int i16 = 0;
            while (i15 < i11) {
                albi.f73280l[i15][i13] = new albc((i15 * i12) + i13, ceil);
                ArrayList arrayList = new ArrayList();
                int i17 = 0;
                while (true) {
                    int i18 = ceil + 1;
                    if (i17 >= i18) {
                        break;
                    }
                    int i19 = i12;
                    for (int i20 = 0; i20 < i18; i20++) {
                        arrayList.add(alboArr[i16 + i20][i14 + i17]);
                    }
                    i17++;
                    i12 = i19;
                    i = 0;
                }
                albc albc = albi.f73280l[i15][i13];
                albo[] alboArr2 = (albo[]) arrayList.toArray(new albo[i]);
                albc.f73250e = ByteBuffer.allocateDirect(albc.f73247b * 12).order(ByteOrder.nativeOrder()).asFloatBuffer();
                albc.f73249d = i;
                albc.f73253h = new alaz[alboArr2.length];
                int i21 = 0;
                while (i21 < alboArr2.length) {
                    albo albo = alboArr2[i21];
                    FloatBuffer floatBuffer = albc.f73250e;
                    int i22 = albc.f73249d;
                    floatBuffer.put(i22, albo.f73301a);
                    floatBuffer.put(i22 + 1, albo.f73302b);
                    floatBuffer.put(i22 + 2, albo.f73303c);
                    albc.f73249d += 3;
                    alaz alaz = new alaz(albo.f73301a, albo.f73302b, albo.f73303c);
                    alaz.mo40067a();
                    albc.f73253h[i21] = alaz;
                    i21++;
                    i12 = i12;
                }
                i16 += ceil;
                i15++;
                i = 0;
            }
            i14 += ceil;
            i13++;
            i = 0;
        }
    }

    /* renamed from: a */
    public final void mo40084a(float[] fArr) {
        albg a;
        this.f73278k.mo40089a();
        boolean z = true;
        int i = 0;
        while (true) {
            albc[][] albcArr = this.f73280l;
            if (i < albcArr.length) {
                albc[] albcArr2 = albcArr[i];
                for (albc albc : albcArr2) {
                    albm albm = (albm) this.f73271d.get(albc.f73246a);
                    if (z && albm.mo40081c()) {
                        z = false;
                    }
                    if (albc.f73254i && (a = albm.mo40079a()) != null) {
                        a.mo40086a();
                        this.f73278k.mo40092a(fArr);
                        this.f73278k.mo40090a(albm.mo40082d());
                        albj albj = this.f73278k;
                        albc.f73250e.position(0);
                        albj.mo40091a(albc.f73250e);
                        albc.f73251f.position(0);
                        albj.mo40093b(albc.f73251f);
                        albc.f73252g.position(0);
                        GLES20.glDrawElements(4, albc.f73248c, 5123, albc.f73252g);
                    }
                }
                i++;
            } else {
                this.f73278k.mo40090a(1.0f);
                return;
            }
        }
    }
}

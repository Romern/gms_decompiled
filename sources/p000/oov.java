package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: oov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oov extends oou {

    /* renamed from: r */
    private static final float[] f38133r;

    /* renamed from: n */
    private int f38134n;

    /* renamed from: o */
    private int f38135o;

    /* renamed from: p */
    private final boolean f38136p;

    /* renamed from: q */
    private FloatBuffer f38137q;

    static {
        odk.m28481a("CAR.WM.WINSHADOW");
        float[] fArr = new float[16];
        f38133r = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public oov(oqa oqa, int i, oor oor, boolean z) {
        this(oqa, i, oor, z, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo22466K() {
        float f;
        super.mo22466K();
        float f2 = (float) this.f38109b.f38138a;
        if (this.f38136p) {
            f = (float) this.f38109b.f38143f;
        } else {
            f = (float) (this.f38109b.f38139b - this.f38134n);
        }
        int i = this.f38109b.f38140c;
        int i2 = this.f38134n;
        float f3 = (float) this.f38109b.f38145h;
        float f4 = ((float) i) + f2;
        float f5 = ((float) i2) + f;
        float[] fArr = {f2, f, f3, 1.0f, 1.0f, f4, f, f3, 0.0f, 1.0f, f2, f5, f3, 1.0f, 0.0f, f4, f5, f3, 0.0f, 0.0f};
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f38137q = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer):void}
     arg types: [int, int, int, int, int, java.nio.FloatBuffer]
     candidates:
      ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, int):void}
      ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer):void} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22467a(float f, float[] fArr) {
        super.mo22467a(f, fArr);
        this.f38108a.mo21680d(2);
        opw c = this.f38108a.mo21676c(2);
        int i = c.f38214b;
        if (this.f38119l) {
            fArr = this.f38120m;
        }
        GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f38135o);
        GLES20.glEnable(3042);
        GLES20.glBlendColor(1.0f, 1.0f, 1.0f, f);
        GLES20.glBlendFunc(770, 771);
        this.f38137q.position(0);
        GLES20.glVertexAttribPointer(c.f38216d, 3, 5126, false, 20, (Buffer) this.f38137q);
        GLES20.glEnableVertexAttribArray(c.f38216d);
        this.f38137q.position(3);
        GLES20.glVertexAttribPointer(c.f38217e, 2, 5126, false, 20, (Buffer) this.f38137q);
        GLES20.glEnableVertexAttribArray(c.f38217e);
        GLES20.glUniformMatrix4fv(c.f38215c, 1, false, f38133r, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public oov(oqa oqa, int i, oor oor, boolean z, int i2) {
        super(oqa, i, oor, null);
        int i3;
        this.f38134n = 0;
        this.f38135o = 0;
        if (ccpp.m131164b() && i2 >= 0) {
            this.f38134n = oqa.mo21670b(i2);
        } else {
            if (!z) {
                i3 = 78;
            } else {
                i3 = 8;
            }
            this.f38134n = oqa.mo21670b(i3);
        }
        this.f38135o = !z ? oqa.mo21713z() : oqa.mo21712y();
        this.f38136p = z;
    }
}

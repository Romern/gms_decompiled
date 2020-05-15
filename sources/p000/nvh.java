package p000;

import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Looper;
import android.os.Process;
import android.view.Surface;
import com.felicanetworks.mfc.C0126R;

/* renamed from: nvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nvh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nvk f36597a;

    public nvh(nvk nvk) {
        this.f36597a = nvk;
    }

    public final void run() {
        nvk nvk;
        String str;
        try {
            Process.setThreadPriority(-8);
            nvk nvk2 = this.f36597a;
            bnsn bnsn = nvk.f36599a;
            nvk2.f36666l = nqe.m27300a(nvk2.f36657c, nvk2.f36662h, nvk2.f36659e.mo21351u() == 0 ? 1 : 0);
            nvk2.f36666l.mo21452b();
            nvk2.f36601B = -1;
            nvk2.f36602C[0] = nvk2.mo21652a("precision highp float;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
            opw[] opwArr = nvk2.f36602C;
            if (!cctl.m131525c()) {
                str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;void main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor.rgb = color.rgb;\n  gl_FragColor.a = color.a * uAlphaMask;\n}\n";
            } else {
                str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;void main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = color * uAlphaMask;\n}\n";
            }
            opwArr[1] = nvk2.mo21652a("precision highp float;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", str);
            nvk2.f36602C[2] = nvk2.mo21652a("precision highp float;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = color;}\n");
            int i = nvk2.f36668n.f38091a.f37024b;
            int i2 = nvk2.f36668n.f38091a.f37025c;
            int i3 = nvk2.f36668n.f38096f;
            int i4 = nvk2.f36668n.f38097g;
            GLES20.glViewport(0, 0, nvk2.f36668n.f38091a.f37024b, nvk2.f36668n.f38091a.f37025c);
            float[] fArr = new float[16];
            float[] fArr2 = new float[16];
            float[] fArr3 = new float[16];
            float[] fArr4 = new float[16];
            float f = ((float) nvk2.f36668n.f38091a.f37024b) / 2.0f;
            float f2 = ((float) nvk2.f36668n.f38091a.f37025c) / 2.0f;
            float f3 = ((float) (-nvk2.f36668n.f38092b)) + f;
            float f4 = ((float) (-nvk2.f36668n.f38093c)) + f2;
            Matrix.setIdentityM(fArr3, 0);
            if (((double) nvk2.f36668n.f38094d) > 1.0d) {
                Matrix.scaleM(fArr3, 0, nvk2.f36668n.f38095e, 1.0f, 1.0f);
            } else if (((double) nvk2.f36668n.f38094d) < 1.0d) {
                Matrix.scaleM(fArr3, 0, 1.0f, nvk2.f36668n.f38094d, 1.0f);
            }
            if (nvk2.f36668n.f38098h > 0) {
                Matrix.translateM(fArr3, 0, (float) nvk2.f36668n.f38098h, 0.0f, 0.0f);
            }
            Matrix.setLookAtM(fArr, 0, f3, f4, 20.0f, f3, f4, 0.0f, 0.0f, 1.0f, 0.0f);
            Matrix.orthoM(fArr2, 0, -f, f, -f2, f2, -50.0f, 50.0f);
            Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr3, 0);
            Matrix.multiplyMM(nvk2.f36603D, 0, fArr2, 0, fArr4, 0);
            int[] iArr = new int[2];
            GLES20.glGenTextures(2, iArr, 0);
            int i5 = iArr[0];
            nvk2.f36680z = i5;
            nvk2.f36600A = iArr[1];
            nvk2.mo21654a(i5, (int) C0126R.C0127drawable.shadow_panel_top);
            nvk2.mo21654a(nvk2.f36600A, (int) C0126R.C0127drawable.shadow_notification);
            GLES20.glEnable(2929);
            GLES20.glEnable(2884);
            GLES20.glCullFace(1029);
            GLES20.glFrontFace(2305);
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            int i6 = iArr2[0];
            nvk2.f36622W = i6;
            nvk2.f36623X = new SurfaceTexture(i6);
            nvk2.f36624Y = new nwv((DisplayManager) nvk2.f36657c.getSystemService("display"), "Dummy", 1, 1, 130, new Surface(nvk2.f36623X), null);
            Looper.prepare();
            this.f36597a.f36664j = Looper.myLooper();
            nvk nvk3 = this.f36597a;
            nvk3.f36665k = new nvg(nvk3, nvk3.f36664j);
            this.f36597a.f36679y = true;
            this.f36597a.f36663i.release();
            Looper.loop();
            nvk = this.f36597a;
        } catch (Exception e) {
            bnsi b = nvk.f36599a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("nvh", "run", 3970, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Error starting composition");
            this.f36597a.mo21709v();
            this.f36597a.f36679y = false;
            this.f36597a.f36663i.release();
            nvk = this.f36597a;
        } catch (Throwable th) {
            this.f36597a.f36679y = false;
            this.f36597a.f36663i.release();
            throw th;
        }
        nvk.mo21709v();
    }
}

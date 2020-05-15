package p000;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* renamed from: albg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albg {

    /* renamed from: a */
    public int f73279a = -1;

    public albg() {
    }

    /* renamed from: a */
    public final void mo40086a() {
        int i = this.f73279a;
        if (i >= 0) {
            GLES20.glBindTexture(3553, i);
            albh.m60795a("glBindTexture");
            return;
        }
        throw new albh("Trying to bind without a loaded texture");
    }

    public albg(byte[] bArr) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        this.f73279a = iArr[0];
    }

    /* renamed from: a */
    public final void mo40087a(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f73279a = i;
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        albh.m60795a("Texture : loadBitmap");
    }
}

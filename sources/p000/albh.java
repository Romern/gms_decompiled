package p000;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Log;

/* renamed from: albh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albh extends Exception {
    public albh(String str) {
        super(str);
        Log.e("LightCycle", str, this);
    }

    /* renamed from: a */
    public static void m60795a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String gluErrorString = GLU.gluErrorString(glGetError);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(gluErrorString).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(gluErrorString);
            sb.append(" ");
            sb.append(glGetError);
            throw new albh(sb.toString());
        }
    }

    public albh(String str, String str2) {
        super(str);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        Log.e("LightCycle", sb.toString(), this);
    }
}

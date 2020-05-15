package p000;

import android.graphics.Shader;

/* renamed from: le */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1157le {
    /* renamed from: a */
    public static Shader.TileMode m18966a(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }
}

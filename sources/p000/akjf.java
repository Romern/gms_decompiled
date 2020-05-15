package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: akjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjf {

    /* renamed from: a */
    public static akjf f72084a;

    /* renamed from: b */
    public final Context f72085b;

    public akjf(Context context) {
        this.f72085b = context.getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r5.mo39496b() == false) goto L_0x0032;
     */
    /* renamed from: a */
    public static Matrix m59871a(Context context, Uri uri) {
        Matrix matrix = new Matrix();
        try {
            InputStream a = becp.m91786a(context, uri);
            if (a == null) {
                ((bnsl) ajvp.f71371a.mo68388c()).mo68420a("Failed to openInputStream with uri %s", uri);
                return matrix;
            }
            akiz akiz = new akiz(new aka(a));
            int a2 = akiz.mo39495a();
            if (a2 != 180) {
            }
            matrix.postRotate((float) a2);
            if (akiz.mo39497c()) {
                matrix.postScale(-1.0f, 1.0f);
            }
            if (akiz.mo39496b()) {
                matrix.postScale(1.0f, -1.0f);
            }
            a.close();
            return matrix;
        } catch (IOException | AssertionError e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to get Exif from inputStream.");
        }
    }
}

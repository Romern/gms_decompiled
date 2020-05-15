package p000;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: bcvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcvf {
    /* renamed from: a */
    public static final byte[] m90108a(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}

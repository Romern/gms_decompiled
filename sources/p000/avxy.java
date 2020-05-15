package p000;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

/* renamed from: avxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxy {

    /* renamed from: a */
    public final avxx f94095a = new avxx();

    /* renamed from: b */
    public ByteBuffer f94096b = null;

    /* renamed from: c */
    public Bitmap f94097c = null;

    /* renamed from: a */
    public final ByteBuffer mo51715a() {
        Bitmap bitmap = this.f94097c;
        if (bitmap == null) {
            return this.f94096b;
        }
        int width = bitmap.getWidth();
        int height = this.f94097c.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.f94097c.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((((float) Color.red(iArr[i2])) * 0.299f) + (((float) Color.green(iArr[i2])) * 0.587f) + (((float) Color.blue(iArr[i2])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }
}

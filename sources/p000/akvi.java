package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: akvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akvi {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public static final Bitmap m60556a(byte[] bArr) {
        boolean z;
        boolean z2;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int i = wrap.getInt();
        int i2 = wrap.getInt();
        int i3 = wrap.getInt();
        int i4 = i / i3;
        int i5 = i4 * i2;
        int i6 = (i5 * 3) + 12;
        if (i3 == 3) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Expected exactly three channels in image conversion");
        int length = bArr.length;
        if (length == i6) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34972a(z2, "Expected image to be of size %s, but image data was of size %s", Integer.valueOf(i6), Integer.valueOf(length));
        int[] iArr = new int[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            iArr[i7] = (wrap.get() & 255) | -16777216 | ((wrap.get() & 255) << 8) | ((wrap.get() & 255) << 16);
        }
        return Bitmap.createBitmap(iArr, i4, i2, Bitmap.Config.RGB_565);
    }
}

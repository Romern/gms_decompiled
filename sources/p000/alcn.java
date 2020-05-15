package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: alcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alcn {

    /* renamed from: a */
    public final int f73473a;

    /* renamed from: b */
    public final int f73474b;

    /* renamed from: c */
    public final int f73475c;

    /* renamed from: d */
    public final int f73476d;

    /* renamed from: e */
    public final albb f73477e;

    /* renamed from: f */
    private final BitmapRegionDecoder f73478f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.BitmapRegionDecoder.newInstance(java.io.InputStream, boolean):android.graphics.BitmapRegionDecoder throws java.io.IOException}
     arg types: [java.io.InputStream, int]
     candidates:
      ClspMth{android.graphics.BitmapRegionDecoder.newInstance(java.io.FileDescriptor, boolean):android.graphics.BitmapRegionDecoder throws java.io.IOException}
      ClspMth{android.graphics.BitmapRegionDecoder.newInstance(java.lang.String, boolean):android.graphics.BitmapRegionDecoder throws java.io.IOException}
      ClspMth{android.graphics.BitmapRegionDecoder.newInstance(java.io.InputStream, boolean):android.graphics.BitmapRegionDecoder throws java.io.IOException} */
    public alcn(InputStream inputStream, albb albb) {
        this.f73477e = albb;
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(inputStream, false);
            this.f73478f = newInstance;
            double width = (double) newInstance.getWidth();
            Double.isNaN(width);
            this.f73473a = (int) Math.ceil(width / 512.0d);
            int i = 512;
            int width2 = this.f73478f.getWidth() % 512;
            this.f73475c = width2 <= 0 ? 512 : width2;
            double height = (double) this.f73478f.getHeight();
            Double.isNaN(height);
            this.f73474b = (int) Math.ceil(height / 512.0d);
            int height2 = this.f73478f.getHeight() % 512;
            this.f73476d = height2 > 0 ? height2 : i;
        } catch (IOException e) {
            throw new RuntimeException("Could not create decoder", e);
        }
    }

    /* renamed from: b */
    private final Rect m60859b(int i, int i2) {
        int i3 = i * 512;
        int i4 = i2 * 512;
        int i5 = i3 + 512;
        int i6 = i4 + 512;
        if (i == this.f73473a - 1) {
            i5 -= 512 - this.f73475c;
        }
        if (i2 == this.f73474b - 1) {
            i6 -= 512 - this.f73476d;
        }
        return new Rect(i3, i4, i5, i6);
    }

    /* renamed from: a */
    public final synchronized alcm mo40129a(int i, int i2) {
        Rect b = m60859b(i, i2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap a = this.f73477e.mo40076a(b.width(), b.height());
        if (a != null) {
            options.inBitmap = a;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPreferQualityOverSpeed = true;
        Bitmap decodeRegion = this.f73478f.decodeRegion(m60859b(i, i2), options);
        if (decodeRegion == null) {
            return null;
        }
        return new alcm(decodeRegion);
    }
}

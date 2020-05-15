package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: avzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzv extends avxv {

    /* renamed from: c */
    private final awac f94129c;

    private avzv() {
        throw new IllegalStateException("Default constructor called");
    }

    /* renamed from: a */
    public final SparseArray mo51710a(avxy avxy) {
        return mo51764a(avxy, new RecognitionOptions(new Rect()));
    }

    /* renamed from: b */
    public final boolean mo51712b() {
        return this.f94129c.mo51757b();
    }

    public avzv(awac awac) {
        this.f94129c = awac;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    /* renamed from: a */
    public final SparseArray mo51764a(avxy avxy, RecognitionOptions recognitionOptions) {
        Bitmap bitmap;
        LineBoxParcel[] lineBoxParcelArr;
        int i;
        byte[] bArr;
        avxy avxy2 = avxy;
        RecognitionOptions recognitionOptions2 = recognitionOptions;
        if (avxy2 != null) {
            FrameMetadataParcel a = FrameMetadataParcel.m93781a(avxy);
            Bitmap bitmap2 = avxy2.f94097c;
            if (bitmap2 == null) {
                avxx avxx = avxy2.f94095a;
                ByteBuffer a2 = avxy.mo51715a();
                int i2 = avxx.f94094f;
                int i3 = a.f109715a;
                int i4 = a.f109716b;
                if (!a2.hasArray() || a2.arrayOffset() != 0) {
                    byte[] bArr2 = new byte[a2.capacity()];
                    a2.get(bArr2);
                    bArr = bArr2;
                } else {
                    bArr = a2.array();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new YuvImage(bArr, i2, i3, i4, null).compressToJpeg(new Rect(0, 0, i3, i4), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            } else {
                bitmap = bitmap2;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (a.f109719e != 0) {
                Matrix matrix = new Matrix();
                int i5 = a.f109719e;
                if (i5 == 0) {
                    i = 0;
                } else if (i5 == 1) {
                    i = 90;
                } else if (i5 == 2) {
                    i = 180;
                } else if (i5 == 3) {
                    i = 270;
                } else {
                    throw new IllegalArgumentException("Unsupported rotation degree.");
                }
                matrix.postRotate((float) i);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
            }
            int i6 = a.f109719e;
            if (i6 == 1 || i6 == 3) {
                a.f109715a = height;
                a.f109716b = width;
            }
            if (!recognitionOptions2.f109748a.isEmpty()) {
                Rect rect = recognitionOptions2.f109748a;
                avxx avxx2 = avxy2.f94095a;
                int i7 = avxx2.f94089a;
                int i8 = avxx2.f94090b;
                int i9 = a.f109719e;
                if (i9 == 1) {
                    rect = new Rect(i8 - rect.bottom, rect.left, i8 - rect.top, rect.right);
                } else if (i9 == 2) {
                    rect = new Rect(i7 - rect.right, i8 - rect.bottom, i7 - rect.left, i8 - rect.top);
                } else if (i9 == 3) {
                    rect = new Rect(rect.top, i7 - rect.right, rect.bottom, i7 - rect.left);
                }
                recognitionOptions2.f109748a.set(rect);
            }
            a.f109719e = 0;
            awac awac = this.f94129c;
            if (awac.mo51757b()) {
                try {
                    vzr a3 = vzs.m41642a(bitmap);
                    avzx avzx = (avzx) awac.mo51759d();
                    Parcel bj = avzx.mo8529bj();
                    dcl.m8164a(bj, a3);
                    dcl.m8165a(bj, a);
                    dcl.m8165a(bj, recognitionOptions2);
                    Parcel a4 = avzx.mo8526a(3, bj);
                    lineBoxParcelArr = (LineBoxParcel[]) a4.createTypedArray(LineBoxParcel.CREATOR);
                    a4.recycle();
                } catch (RemoteException e) {
                    Log.e("TextNativeHandle", "Error calling native text recognizer", e);
                    lineBoxParcelArr = new LineBoxParcel[0];
                }
            } else {
                lineBoxParcelArr = new LineBoxParcel[0];
            }
            SparseArray sparseArray = new SparseArray();
            for (LineBoxParcel lineBoxParcel : lineBoxParcelArr) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(lineBoxParcel.f109746j);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(lineBoxParcel.f109746j, sparseArray2);
                }
                sparseArray2.append(lineBoxParcel.f109747k, lineBoxParcel);
            }
            SparseArray sparseArray3 = new SparseArray(sparseArray.size());
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray3.append(sparseArray.keyAt(i10), new avzt((SparseArray) sparseArray.valueAt(i10)));
            }
            return sparseArray3;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    /* renamed from: a */
    public final void mo51711a() {
        super.mo51711a();
        this.f94129c.mo51758c();
    }
}

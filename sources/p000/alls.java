package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.FileInputStream;

/* renamed from: alls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alls {
    /* renamed from: a */
    public static Bitmap m61238a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            return BitmapFactory.decodeStream(fileInputStream);
        } finally {
            srz.m36171a((Closeable) fileInputStream);
        }
    }
}

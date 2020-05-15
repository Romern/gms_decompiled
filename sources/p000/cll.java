package p000;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: cll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cll implements cdn {

    /* renamed from: a */
    public static final cdj f7024a = cdj.m3994a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: b */
    public static final cdj f7025b = new cdj("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, cdj.f6571a);

    /* renamed from: c */
    private final cgr f7026c;

    @Deprecated
    public cll() {
        this.f7026c = null;
    }

    /* renamed from: a */
    public final int mo3745a() {
        return 2;
    }

    public cll(cgr cgr) {
        this.f7026c = cgr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[SYNTHETIC, Splitter:B:30:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067 A[SYNTHETIC, Splitter:B:37:0x0067] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3725a(Object obj, File file, cdk cdk) {
        Bitmap bitmap = (Bitmap) ((cgj) obj).mo3842b();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) cdk.mo3739a(f7025b);
        if (compressFormat == null) {
            if (bitmap.hasAlpha()) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
        }
        bitmap.getWidth();
        bitmap.getHeight();
        cqw.m7370a();
        int intValue = ((Integer) cdk.mo3739a(f7024a)).intValue();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                cgr cgr = this.f7026c;
                if (cgr != null) {
                    fileOutputStream = new cdr(fileOutputStream2, cgr);
                } else {
                    fileOutputStream = fileOutputStream2;
                }
                try {
                    bitmap.compress(compressFormat, intValue, fileOutputStream);
                    fileOutputStream.close();
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e) {
                        return true;
                    }
                } catch (IOException e2) {
                    if (fileOutputStream != null) {
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
            } catch (IOException e3) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                }
                throw th;
            }
        } catch (IOException e4) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                    return false;
                } catch (IOException e5) {
                    return false;
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e6) {
                }
            }
            throw th;
        }
    }
}

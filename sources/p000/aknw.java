package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: aknw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aknw {

    /* renamed from: a */
    private static final srn f72327a = srn.m36127a(sgj.GUNS);

    /* renamed from: b */
    private static aknw f72328b;

    /* renamed from: c */
    private final Context f72329c;

    /* renamed from: d */
    private final shj f72330d;

    /* renamed from: e */
    private final BitmapFactory.Options f72331e;

    /* renamed from: f */
    private final File f72332f = new File(this.f72329c.getCacheDir(), "notifications");

    private aknw(Context context, shj shj) {
        this.f72329c = context;
        this.f72330d = shj;
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.f72331e = options;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
    }

    /* renamed from: a */
    public static synchronized aknw m60102a(Context context) {
        aknw aknw;
        synchronized (aknw.class) {
            if (f72328b == null) {
                f72328b = new aknw(context, new shj(context, null, null, true, false, null, null, 6403));
            }
            aknw = f72328b;
        }
        return aknw;
    }

    /* renamed from: b */
    private final boolean m60104b(String str) {
        return new File(m60105c(str)).exists();
    }

    /* renamed from: c */
    private final String m60105c(String str) {
        String path = this.f72332f.getPath();
        char c = File.separatorChar;
        int hashCode = str.hashCode();
        StringBuilder sb = new StringBuilder(17);
        sb.append("Image_");
        sb.append(hashCode);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(path).length() + 1 + String.valueOf(sb2).length());
        sb3.append(path);
        sb3.append(c);
        sb3.append(sb2);
        return sb3.toString();
    }

    /* renamed from: d */
    private final Bitmap m60106d(String str) {
        try {
            if (m60104b(str)) {
                return BitmapFactory.decodeFile(m60105c(str), this.f72331e);
            }
            ((bnsl) f72327a.mo68387b()).mo68420a("Expected image to be present in cache, but not found: %s", str);
            return null;
        } catch (IllegalArgumentException | OutOfMemoryError e) {
            bnsl bnsl = (bnsl) f72327a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to load image from file.");
            return null;
        }
    }

    /* renamed from: a */
    private final Bitmap m60103a(byte[] bArr) {
        if (bArr != null) {
            try {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, this.f72331e);
                if (decodeByteArray != null) {
                    try {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, (int) this.f72329c.getResources().getDimension(17104901), (int) this.f72329c.getResources().getDimension(17104902), true);
                        if (!createScaledBitmap.sameAs(decodeByteArray)) {
                            decodeByteArray.recycle();
                        }
                        return createScaledBitmap;
                    } catch (IllegalArgumentException e) {
                        bnsl bnsl = (bnsl) f72327a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68405a("Failed to scale the image.");
                        return decodeByteArray;
                    }
                }
            } catch (OutOfMemoryError e2) {
                bnsl bnsl2 = (bnsl) f72327a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("Failed to create bitmap from network bytes.");
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8 A[SYNTHETIC, Splitter:B:38:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3 A[SYNTHETIC, Splitter:B:46:0x00b3] */
    /* renamed from: a */
    public final synchronized Bitmap mo39594a(String str) {
        Bitmap bitmap;
        FileOutputStream fileOutputStream;
        IOException e;
        FileOutputStream fileOutputStream2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!m60104b(str)) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f72329c.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                bitmap = null;
            } else {
                try {
                    bitmap = m60103a(this.f72330d.mo25543a(this.f72329c, str));
                } catch (VolleyError e2) {
                    bnsl bnsl = (bnsl) f72327a.mo68387b();
                    bnsl.mo68437a(e2);
                    bnsl.mo68405a("Failed to fetch the image.");
                    bitmap = null;
                }
            }
            if (bitmap == null) {
                return null;
            }
            if (!this.f72332f.exists()) {
                try {
                    this.f72332f.mkdirs();
                } catch (Exception e3) {
                    bnsl bnsl2 = (bnsl) f72327a.mo68387b();
                    bnsl2.mo68437a(e3);
                    bnsl2.mo68420a("Cannot create image cache directory: %s", this.f72332f);
                    return bitmap;
                }
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                File file = new File(m60105c(str));
                file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
                try {
                    byteArrayOutputStream.writeTo(fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                    }
                } catch (IOException e5) {
                    e = e5;
                    try {
                        bnsl bnsl3 = (bnsl) f72327a.mo68388c();
                        bnsl3.mo68437a(e);
                        bnsl3.mo68405a("Failed to create file.");
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return bitmap;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (IOException e6) {
                e = e6;
                fileOutputStream = null;
                bnsl bnsl32 = (bnsl) f72327a.mo68388c();
                bnsl32.mo68437a(e);
                bnsl32.mo68405a("Failed to create file.");
                if (fileOutputStream != null) {
                }
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e7) {
                    }
                }
                throw th;
            }
        } else {
            return m60106d(str);
        }
    }
}

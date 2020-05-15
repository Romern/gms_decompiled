package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.format.Time;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: oar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oar {

    /* renamed from: a */
    private static final bnsn f37085a = odk.m28481a("CAR.VIDEO");

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b A[SYNTHETIC, Splitter:B:19:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085 A[SYNTHETIC, Splitter:B:26:0x0085] */
    /* renamed from: a */
    public static File m28301a(Context context, Bitmap bitmap, String str) {
        BufferedOutputStream bufferedOutputStream;
        Time time = new Time();
        time.setToNow();
        File a = npe.m27153a(context);
        BufferedOutputStream bufferedOutputStream2 = null;
        if (a == null) {
            return null;
        }
        String format = time.format("%Y-%m-%d-%H:%M:%S");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(format).length());
        sb.append(str);
        sb.append("-");
        sb.append(format);
        sb.append(".png");
        File file = new File(a, sb.toString());
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, bufferedOutputStream);
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                }
                return file;
            } catch (IOException e2) {
                try {
                    bnsi d = f37085a.mo68390d();
                    d.mo68432a("oar", "a", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68420a("cannot save file for screenshot dump:%s", file);
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 != null) {
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e5) {
            bufferedOutputStream = null;
            bnsi d2 = f37085a.mo68390d();
            d2.mo68432a("oar", "a", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("cannot save file for screenshot dump:%s", file);
            if (bufferedOutputStream != null) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedOutputStream2 != null) {
            }
            throw th;
        }
    }
}

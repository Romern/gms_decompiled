package p000;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: bcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcr {

    /* renamed from: a */
    public final Context f3010a;

    /* renamed from: b */
    public final String f3011b;

    public bcr(Context context, String str) {
        this.f3010a = context.getApplicationContext();
        this.f3011b = str;
    }

    /* renamed from: a */
    public static String m2702a(String str, bcq bcq, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (!z) {
            str2 = bcq.f3009c;
        } else {
            str2 = ".temp" + bcq.f3009c;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final File mo2998a(InputStream inputStream, bcq bcq) {
        FileOutputStream fileOutputStream;
        File file = new File(this.f3010a.getCacheDir(), m2702a(this.f3011b, bcq, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}

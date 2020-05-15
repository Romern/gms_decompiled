package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.net.URL;

/* renamed from: jgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jgx extends rrj {

    /* renamed from: a */
    private static final sek f22456a = ght.m13171a("AuthManaged", "PackageIconLoader");

    /* renamed from: b */
    private final String f22457b;

    public jgx(Context context, String str) {
        super(context);
        this.f22457b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        f22456a.mo25414c("loadInBackground", new Object[0]);
        Bitmap bitmap = null;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            StringBuilder sb = new StringBuilder(13);
            sb.append("=s");
            sb.append((int) (getContext().getResources().getDisplayMetrics().density * 44.0f));
            String sb2 = sb.toString();
            String valueOf = String.valueOf(this.f22457b);
            String valueOf2 = String.valueOf(sb2);
            bufferedInputStream = new BufferedInputStream(new URL(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)).openStream());
            try {
                byte[] a = stk.m36297a(bufferedInputStream);
                bitmap = BitmapFactory.decodeByteArray(a, 0, a.length);
                srz.m36171a((Closeable) bufferedInputStream);
            } catch (IOException e) {
                e = e;
                try {
                    f22456a.mo25415d("Couldn't load app icon.", e, new Object[0]);
                    if (bufferedInputStream != null) {
                        srz.m36171a((Closeable) bufferedInputStream);
                        return null;
                    }
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 != null) {
                    }
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            bufferedInputStream = null;
            f22456a.mo25415d("Couldn't load app icon.", e, new Object[0]);
            if (bufferedInputStream != null) {
            }
            return bitmap;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedInputStream2 != null) {
                srz.m36171a((Closeable) bufferedInputStream2);
            }
            throw th;
        }
        return bitmap;
    }
}

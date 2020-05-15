package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;

/* renamed from: bbqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbqd implements Callable {

    /* renamed from: a */
    private final String f103058a;

    /* renamed from: b */
    private final bbqt f103059b;

    /* renamed from: c */
    private final File f103060c;

    public bbqd(Context context, String str) {
        this.f103059b = bbqt.m88417a(context);
        this.f103058a = str;
        this.f103060c = context.getCacheDir();
    }

    /* renamed from: a */
    public final Bitmap call() {
        try {
            bbon.m88284a();
            String l = Long.toString(System.currentTimeMillis(), 16);
            String l2 = Long.toString(System.nanoTime(), 16);
            StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 4 + String.valueOf(l2).length());
            sb.append(l);
            sb.append(l2);
            sb.append(".jpg");
            String sb2 = sb.toString();
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f103058a).openConnection();
            httpURLConnection.setConnectTimeout(((Long) this.f103059b.f103147ap.mo58455c()).intValue());
            httpURLConnection.setReadTimeout(((Long) this.f103059b.f103148aq.mo58455c()).intValue());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            File createTempFile = File.createTempFile(sb2, ".jpg", this.f103060c);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(createTempFile));
            byte[] bArr = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read < 0) {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    float intValue = (float) ((Integer) this.f103059b.f103149ar.mo58455c()).intValue();
                    fileInputStream.close();
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = (int) Math.max(((float) i) / intValue, ((float) i2) / intValue);
                    options2.inJustDecodeBounds = false;
                    FileInputStream fileInputStream2 = new FileInputStream(createTempFile);
                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                    fileInputStream2.close();
                    createTempFile.delete();
                    return decodeStream;
                }
                bufferedOutputStream.write(bArr, 0, read);
            }
        } catch (FileNotFoundException e) {
            String valueOf = String.valueOf(this.f103058a);
            bbos.m88292b("DownloadUtils", valueOf.length() == 0 ? new String("ImageUrl path is no longer valid: ") : "ImageUrl path is no longer valid: ".concat(valueOf), e);
            throw new RuntimeException(e);
        } catch (MalformedURLException e2) {
            String valueOf2 = String.valueOf(this.f103058a);
            bbos.m88292b("DownloadUtils", valueOf2.length() == 0 ? new String("ImageUrl path is not valid: ") : "ImageUrl path is not valid: ".concat(valueOf2), e2);
            throw new RuntimeException(e2);
        } catch (Exception e3) {
            bbos.m88292b("DownloadUtils", "Exception encountered trying to fetch image.", e3);
            return null;
        }
    }
}

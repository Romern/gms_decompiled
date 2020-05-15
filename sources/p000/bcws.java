package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bcws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcws {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    /* renamed from: a */
    public static final Bitmap m90192a(Context context, Uri uri, int i, int i2) {
        InputStream openInputStream;
        Bitmap bitmap;
        InputStream openInputStream2;
        int i3;
        InputStream openInputStream3;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmap2 = null;
        try {
            openInputStream2 = context.getContentResolver().openInputStream(uri);
            BitmapFactory.decodeStream(openInputStream2, null, options);
            if (openInputStream2 != null) {
                openInputStream2.close();
            }
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            if (i4 <= i2 && i5 <= i) {
                i3 = 1;
            } else {
                int i6 = i4 / 2;
                int i7 = i5 / 2;
                i3 = 1;
                while (i6 / i3 >= i2 && i7 / i3 >= i) {
                    i3 += i3;
                }
            }
            options.inSampleSize = i3;
            options.inJustDecodeBounds = false;
            try {
                openInputStream3 = context.getContentResolver().openInputStream(uri);
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream3, null, options);
                if (openInputStream3 != null) {
                    openInputStream3.close();
                }
                bitmap2 = decodeStream;
            } catch (IOException e) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb.append("can not create bitmap from invalid uri");
                sb.append(valueOf);
                bbos.m88292b("LighterUriLoader", sb.toString(), e);
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
            sb2.append("can not create bitmap from invalid uri");
            sb2.append(valueOf2);
            bbos.m88292b("LighterUriLoader", sb2.toString(), e2);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
            int a = new aka(openInputStream).mo866a("Orientation", 1);
            Matrix matrix = new Matrix();
            switch (a) {
                case 2:
                    matrix.setScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.setRotate(180.0f);
                    break;
                case 4:
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 5:
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix.setRotate(90.0f);
                    break;
                case 7:
                    matrix.setRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.setRotate(-90.0f);
                    break;
            }
            if (!matrix.isIdentity()) {
                bitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            } else {
                bitmap = bitmap2;
            }
            if (openInputStream != null) {
                openInputStream.close();
            }
            return bitmap;
        } catch (IOException | UnsupportedOperationException e3) {
            return bitmap2;
        } catch (Throwable th3) {
            bqye.m113761a(th, th3);
        }
        throw th;
        throw th;
        throw th;
    }
}

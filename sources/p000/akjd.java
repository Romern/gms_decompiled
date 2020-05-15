package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Message;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: akjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjd extends soa {

    /* renamed from: a */
    private final Context f72076a;

    /* renamed from: b */
    private final akjc f72077b;

    /* renamed from: c */
    private final Uri f72078c;

    /* renamed from: d */
    private final int f72079d;

    /* renamed from: h */
    private final int f72080h;

    public akjd(Context context, akjc akjc, Uri uri, int i, int i2) {
        super(9);
        this.f72077b = akjc;
        this.f72076a = context;
        this.f72078c = uri;
        this.f72079d = i;
        this.f72080h = i2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a A[Catch:{ IOException | SecurityException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    public final void run() {
        int i;
        InputStream a;
        Context context = this.f72076a;
        Uri uri = this.f72078c;
        int i2 = this.f72079d;
        int i3 = this.f72080h;
        Bitmap bitmap = null;
        try {
            InputStream a2 = becp.m91786a(context, uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Rect rect = new Rect();
            if (a2 != null) {
                BitmapFactory.decodeStream(a2, rect, options);
                a2.close();
            }
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            if (i4 <= i3) {
                if (i5 <= i2) {
                    i = 1;
                    options.inSampleSize = i;
                    options.inJustDecodeBounds = false;
                    a = becp.m91786a(context, uri);
                    if (a != null) {
                        Matrix a3 = akjf.m59871a(context, uri);
                        Bitmap decodeStream = BitmapFactory.decodeStream(a, rect, options);
                        if (decodeStream != null) {
                            bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), a3, true);
                            try {
                                a.close();
                            } catch (IOException | SecurityException e) {
                                e = e;
                            }
                        }
                    }
                    if (bitmap != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = bitmap;
                        this.f72077b.sendMessage(obtain);
                        return;
                    }
                    ((bnsl) ajvp.f71371a.mo68388c()).mo68420a("Failed load bitmap from uri %s ", this.f72078c);
                    return;
                }
            }
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            i = 1;
            while (i6 / i >= i3 && i7 / i >= i2) {
                i += i;
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            a = becp.m91786a(context, uri);
            if (a != null) {
            }
        } catch (IOException | SecurityException e2) {
            e = e2;
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to decode uri %s ", uri);
            if (bitmap != null) {
            }
        }
        if (bitmap != null) {
        }
    }
}

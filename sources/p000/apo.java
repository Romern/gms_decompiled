package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p001v4.graphics.drawable.IconCompat;
import android.util.Log;
import androidx.slice.SliceItemHolder;
import java.io.ByteArrayOutputStream;

/* renamed from: apo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apo implements apj {

    /* renamed from: a */
    final /* synthetic */ Context f1938a;

    /* renamed from: b */
    final /* synthetic */ C0030app f1939b;

    public apo(Context context, C0030app app) {
        this.f1938a = context;
        this.f1939b = app;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0064  */
    /* renamed from: a */
    public final void mo2270a(SliceItemHolder sliceItemHolder, String str) {
        char c;
        Context context = this.f1938a;
        C0030app app = this.f1939b;
        int hashCode = str.hashCode();
        if (hashCode != -1422950858) {
            if (hashCode != 100313435) {
                if (hashCode == 100358090 && str.equals("input")) {
                    c = 1;
                    if (c != 0) {
                        int i = app.f1941b;
                        if (i == 0) {
                            throw new IllegalArgumentException("Cannot serialize icon");
                        } else if (i != 1) {
                            IconCompat iconCompat = (IconCompat) sliceItemHolder.f1664c;
                            if (iconCompat.mo1107a() != 2) {
                                if (iconCompat.f1030a == 2) {
                                    String str2 = (String) iconCompat.f1031b;
                                    if (str2.contains(":")) {
                                        String str3 = str2.split(":", -1)[1];
                                        String str4 = str3.split("/", -1)[0];
                                        String str5 = str3.split("/", -1)[1];
                                        String str6 = str2.split(":", -1)[0];
                                        int identifier = IconCompat.m1173a(context, str6).getIdentifier(str5, str4, str6);
                                        if (iconCompat.f1034e != identifier) {
                                            Log.i("IconCompat", "Id has changed for " + str6 + "/" + str5);
                                            iconCompat.f1034e = identifier;
                                        }
                                    }
                                }
                                int i2 = Build.VERSION.SDK_INT;
                                Drawable loadDrawable = iconCompat.mo1108a(context).loadDrawable(context);
                                int intrinsicWidth = loadDrawable.getIntrinsicWidth();
                                int intrinsicHeight = loadDrawable.getIntrinsicHeight();
                                int i3 = 1000;
                                if (intrinsicWidth > 1000) {
                                    double d = (double) (intrinsicHeight * 1000);
                                    double d2 = (double) intrinsicWidth;
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    intrinsicHeight = (int) (d / d2);
                                    intrinsicWidth = 1000;
                                }
                                if (intrinsicHeight > 1000) {
                                    double d3 = (double) (intrinsicWidth * 1000);
                                    double d4 = (double) intrinsicHeight;
                                    Double.isNaN(d3);
                                    Double.isNaN(d4);
                                    intrinsicWidth = (int) (d3 / d4);
                                } else {
                                    i3 = intrinsicHeight;
                                }
                                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                loadDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                                loadDrawable.draw(canvas);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                createBitmap.compress(app.f1942c, 100, byteArrayOutputStream);
                                createBitmap.recycle();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                iconCompat = IconCompat.m1177a(byteArray, byteArray.length);
                            }
                            sliceItemHolder.f1664c = iconCompat;
                            return;
                        } else {
                            sliceItemHolder.f1664c = null;
                            return;
                        }
                    } else if (c != 1) {
                        if (c == 2) {
                            int i4 = app.f1940a;
                            if (i4 == 0) {
                                throw new IllegalArgumentException("Cannot serialize action");
                            } else if (i4 != 1) {
                                sliceItemHolder.f1665d = null;
                                return;
                            } else {
                                sliceItemHolder.f1664c = null;
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (app.f1940a != 0) {
                        sliceItemHolder.f1665d = null;
                        return;
                    } else {
                        throw new IllegalArgumentException("Cannot serialize action");
                    }
                }
            } else if (str.equals("image")) {
                c = 0;
                if (c != 0) {
                }
            }
        } else if (str.equals("action")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}

package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: bcvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcvg {
    /* renamed from: a */
    private static byte[] m90109a(Context context, Bitmap bitmap, byte[] bArr, long j, int i) {
        int intValue = ((Integer) bbqt.m88417a(context).f103155ax.mo58455c()).intValue();
        double doubleValue = ((Double) bbqt.m88417a(context).f103157az.mo58455c()).doubleValue();
        int i2 = intValue + 1;
        while (i2 - i > 1) {
            int i3 = (i + i2) >> 1;
            try {
                byte[] a = bcvf.m90108a(bitmap, i3);
                if (a != null) {
                    int length = a.length;
                    if (((long) length) <= j) {
                        double d = (double) j;
                        Double.isNaN(d);
                        if (((double) length) < d * doubleValue) {
                            i = i3;
                            bArr = a;
                        } else {
                            bbos.m88291b("StaticImageComp", "Fast exit from the compression step.");
                            return a;
                        }
                    }
                }
                i2 = i3;
            } catch (OutOfMemoryError e) {
                bbos.m88293c("StaticImageComp", "Got OutOfMemoryError while compressing the image. Return the current best result.");
                return bArr;
            }
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087 A[LOOP:0: B:4:0x0046->B:27:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[EDGE_INSN: B:36:0x008a->B:28:0x008a ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    public static byte[] m90110a(Context context, Uri uri, int i, int i2, long j, int i3) {
        Bitmap bitmap;
        byte[] bArr;
        int i4;
        int i5;
        int max = Math.max(i, i2);
        int intValue = ((Integer) bbqt.m88417a(context).f103106aA.mo58455c()).intValue();
        double doubleValue = ((Double) bbqt.m88417a(context).f103156ay.mo58455c()).doubleValue();
        if (max > intValue) {
            long j2 = (long) intValue;
            long j3 = (long) max;
            int i6 = (int) ((((long) i) * j2) / j3);
            i4 = (int) ((j2 * ((long) i2)) / j3);
            bArr = null;
            bitmap = null;
            i5 = i6;
        } else {
            i4 = i2;
            bArr = null;
            bitmap = null;
            i5 = i;
        }
        do {
            try {
                bitmap = bcws.m90192a(context, uri, i5, i4);
                if (bitmap != null) {
                    try {
                        bArr = bcvf.m90108a(bitmap, i3);
                    } catch (OutOfMemoryError e) {
                        bbos.m88293c("StaticImageComp", "Got OutOfMemoryError while adjusting image width and height.");
                        if (bArr == null) {
                            break;
                            if (bArr == null) {
                            }
                            bbos.m88293c("StaticImageComp", "Failed to compress image");
                            return null;
                        }
                        double d = (double) i5;
                        Double.isNaN(d);
                        i5 = (int) (d * doubleValue);
                        double d2 = (double) i4;
                        Double.isNaN(d2);
                        i4 = (int) (d2 * doubleValue);
                        if (i5 < 32) {
                        }
                        if (bArr == null) {
                        }
                        bbos.m88293c("StaticImageComp", "Failed to compress image");
                        return null;
                    }
                    if (bArr == null || ((long) bArr.length) > j) {
                        double d3 = (double) i5;
                        Double.isNaN(d3);
                        i5 = (int) (d3 * doubleValue);
                        double d22 = (double) i4;
                        Double.isNaN(d22);
                        i4 = (int) (d22 * doubleValue);
                        if (i5 < 32) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    try {
                        bbos.m88293c("StaticImageComp", "failed to scaled bitmap");
                        return null;
                    } catch (OutOfMemoryError e2) {
                    }
                }
            } catch (OutOfMemoryError e3) {
                bbos.m88293c("StaticImageComp", "Got OutOfMemoryError while adjusting image width and height.");
                if (bArr == null) {
                }
                double d32 = (double) i5;
                Double.isNaN(d32);
                i5 = (int) (d32 * doubleValue);
                double d222 = (double) i4;
                Double.isNaN(d222);
                i4 = (int) (d222 * doubleValue);
                if (i5 < 32) {
                }
                if (bArr == null) {
                }
                bbos.m88293c("StaticImageComp", "Failed to compress image");
                return null;
            }
        } while (i4 >= 32);
        if (bArr == null && ((long) bArr.length) <= j) {
            return m90109a(context, bitmap, bArr, j, i3);
        }
        bbos.m88293c("StaticImageComp", "Failed to compress image");
        return null;
    }
}

package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

/* renamed from: cme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cme {

    /* renamed from: a */
    public static final cdj f7047a = cdj.m3994a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", ccu.f6558c);

    /* renamed from: b */
    public static final cdj f7048b = cdj.m3994a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", cdl.SRGB);

    /* renamed from: c */
    public static final cdj f7049c = cdj.m3994a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);

    /* renamed from: d */
    public static final cdj f7050d = cdj.m3994a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);

    /* renamed from: e */
    public static final cmd f7051e = new cmc();

    /* renamed from: h */
    private static final Queue f7052h = crd.m7392a(0);

    /* renamed from: f */
    public final cgr f7053f;

    /* renamed from: g */
    public final List f7054g;

    /* renamed from: i */
    private final cgt f7055i;

    /* renamed from: j */
    private final DisplayMetrics f7056j;

    /* renamed from: k */
    private final cmk f7057k;

    static {
        cmb cmb = cmb.f7040a;
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
    }

    public cme(List list, DisplayMetrics displayMetrics, cgt cgt, cgr cgr) {
        if (cmk.f7062a == null) {
            synchronized (cmk.class) {
                if (cmk.f7062a == null) {
                    cmk.f7062a = new cmk();
                }
            }
        }
        this.f7057k = cmk.f7062a;
        this.f7054g = list;
        crb.m7382a(displayMetrics);
        this.f7056j = displayMetrics;
        crb.m7382a(cgt);
        this.f7055i = cgt;
        crb.m7382a(cgr);
        this.f7053f = cgr;
    }

    /* renamed from: a */
    private static int m4509a(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: a */
    private static boolean m4511a(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: b */
    private static int m4514b(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: c */
    private static void m4517c(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        int i = Build.VERSION.SDK_INT;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    private static synchronized BitmapFactory.Options m4510a() {
        BitmapFactory.Options options;
        synchronized (cme.class) {
            synchronized (f7052h) {
                options = (BitmapFactory.Options) f7052h.poll();
            }
            if (options != null) {
                return options;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            m4517c(options2);
            return options2;
        }
    }

    /* renamed from: b */
    private static Bitmap m4515b(cmn cmn, BitmapFactory.Options options, cmd cmd, cgt cgt) {
        IOException iOException;
        String str;
        Bitmap b;
        Lock lock;
        BitmapFactory.Options options2 = options;
        if (!options2.inJustDecodeBounds) {
            cmd.mo3970a();
            cmn.mo3978c();
        }
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        String str2 = options2.outMimeType;
        cmw.f7089a.lock();
        try {
            b = cmn.mo3975a(options);
            lock = cmw.f7089a;
        } catch (IOException e) {
            throw iOException;
        } catch (IllegalArgumentException e2) {
            IllegalArgumentException illegalArgumentException = e2;
            Bitmap bitmap = options2.inBitmap;
            if (bitmap != null) {
                int i3 = Build.VERSION.SDK_INT;
                int allocationByteCount = bitmap.getAllocationByteCount();
                StringBuilder sb = new StringBuilder(14);
                sb.append(" (");
                sb.append(allocationByteCount);
                sb.append(")");
                String sb2 = sb.toString();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                String valueOf = String.valueOf(bitmap.getConfig());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(sb2).length());
                sb3.append("[");
                sb3.append(width);
                sb3.append("x");
                sb3.append(height);
                sb3.append("] ");
                sb3.append(valueOf);
                sb3.append(sb2);
                str = sb3.toString();
            } else {
                str = null;
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 99 + String.valueOf(str).length());
            sb4.append("Exception decoding bitmap, outWidth: ");
            sb4.append(i);
            sb4.append(", outHeight: ");
            sb4.append(i2);
            sb4.append(", outMimeType: ");
            sb4.append(str2);
            sb4.append(", inBitmap: ");
            sb4.append(str);
            iOException = new IOException(sb4.toString(), illegalArgumentException);
            if (options2.inBitmap != null) {
                cgt.mo3881a(options2.inBitmap);
                options2.inBitmap = null;
                b = m4515b(cmn, options, cmd, cgt);
                lock = cmw.f7089a;
            } else {
                throw iOException;
            }
        } catch (Throwable th) {
            cmw.f7089a.unlock();
            throw th;
        }
        lock.unlock();
        return b;
    }

    /* renamed from: a */
    private static boolean m4512a(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    /* renamed from: a */
    private static int[] m4513a(cmn cmn, BitmapFactory.Options options, cmd cmd, cgt cgt) {
        options.inJustDecodeBounds = true;
        m4515b(cmn, options, cmd, cgt);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0278 A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0283 A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0284 A[ADDED_TO_REGION, Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0290 A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0298 A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02bd A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02be A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02eb A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02ec A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0304 A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03a4 A[Catch:{ IOException -> 0x026d, all -> 0x03b6 }] */
    /* renamed from: a */
    public final cgj mo3972a(cmn cmn, int i, int i2, cdk cdk, cmd cmd) {
        boolean z;
        cme cme;
        boolean z2;
        ccu ccu;
        boolean z3;
        int i3;
        int i4;
        int i5;
        ColorSpace.Named named;
        Bitmap b;
        Bitmap bitmap;
        float f;
        Bitmap.Config config;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        cmn cmn2 = cmn;
        cdk cdk2 = cdk;
        cmd cmd2 = cmd;
        byte[] bArr = (byte[]) this.f7053f.mo3870a(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, byte[].class);
        BitmapFactory.Options a = m4510a();
        a.inTempStorage = bArr;
        ccu ccu2 = (ccu) cdk2.mo3739a(f7047a);
        cdl cdl = (cdl) cdk2.mo3739a(f7048b);
        cmb cmb = (cmb) cdk2.mo3739a(cmb.f7045f);
        boolean booleanValue = ((Boolean) cdk2.mo3739a(f7049c)).booleanValue();
        if (cdk2.mo3739a(f7050d) == null || !((Boolean) cdk2.mo3739a(f7050d)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            cqw.m7370a();
            int[] a2 = m4513a(cmn2, a, cmd2, this.f7055i);
            int i11 = a2[0];
            int i12 = a2[1];
            String str = a.outMimeType;
            if (i11 == -1) {
                z = false;
            } else if (i12 == -1) {
                z = false;
            }
            int b2 = cmn.mo3977b();
            int a3 = cmw.m4560a(b2);
            boolean b3 = cmw.m4566b(b2);
            int i13 = i;
            if (i13 == Integer.MIN_VALUE) {
                if (m4511a(a3)) {
                    i13 = i12;
                } else {
                    i13 = i11;
                }
            }
            byte[] bArr2 = bArr;
            int i14 = i2;
            if (i14 == Integer.MIN_VALUE) {
                try {
                    i14 = m4511a(a3) ? i11 : i12;
                } catch (Throwable th) {
                    th = th;
                    cme = this;
                    bArr = bArr2;
                    m4516b(a);
                    cme.f7053f.mo3874a(bArr);
                    throw th;
                }
            }
            ImageHeaderParser$ImageType a4 = cmn.mo3976a();
            int i15 = b2;
            cgt cgt = this.f7055i;
            cdl cdl2 = cdl;
            if (i11 <= 0) {
                z2 = z;
                ccu = ccu2;
                z3 = booleanValue;
                i4 = i12;
                i3 = i13;
            } else if (i12 > 0) {
                try {
                    boolean a5 = m4511a(a3);
                    if (!a5) {
                        i6 = i12;
                    } else {
                        i6 = i11;
                    }
                    if (!a5) {
                        z3 = booleanValue;
                        i7 = i11;
                    } else {
                        z3 = booleanValue;
                        i7 = i12;
                    }
                    ccu = ccu2;
                    float a6 = cmb.mo3966a(i7, i6, i13, i14);
                    if (a6 > 0.0f) {
                        int b4 = cmb.mo3967b(i7, i6, i13, i14);
                        if (b4 != 0) {
                            z2 = z;
                            float f2 = (float) i7;
                            int i16 = i12;
                            int i17 = i13;
                            float f3 = (float) i6;
                            float f4 = f3;
                            int b5 = i7 / m4514b((double) (a6 * f2));
                            int b6 = i6 / m4514b((double) (a6 * f3));
                            if (b4 == 1) {
                                i8 = Math.max(b5, b6);
                            } else {
                                i8 = Math.min(b5, b6);
                            }
                            int i18 = Build.VERSION.SDK_INT;
                            int max = Math.max(1, Integer.highestOneBit(i8));
                            if (b4 == 1 && ((float) max) < 1.0f / a6) {
                                max += max;
                            }
                            a.inSampleSize = max;
                            if (a4 == ImageHeaderParser$ImageType.JPEG) {
                                float min = (float) Math.min(max, 8);
                                i9 = (int) Math.ceil((double) (f2 / min));
                                i10 = (int) Math.ceil((double) (f4 / min));
                                int i19 = max / 8;
                                if (i19 > 0) {
                                    i9 /= i19;
                                    i10 /= i19;
                                }
                            } else if (a4 == ImageHeaderParser$ImageType.PNG || a4 == ImageHeaderParser$ImageType.PNG_A) {
                                float f5 = (float) max;
                                i9 = (int) Math.floor((double) (f2 / f5));
                                i10 = (int) Math.floor((double) (f4 / f5));
                            } else if (a4 == ImageHeaderParser$ImageType.WEBP || a4 == ImageHeaderParser$ImageType.WEBP_A) {
                                int i20 = Build.VERSION.SDK_INT;
                                float f6 = (float) max;
                                i9 = Math.round(f2 / f6);
                                i10 = Math.round(f4 / f6);
                            } else if (i7 % max == 0 && i6 % max == 0) {
                                i9 = i7 / max;
                                i10 = i6 / max;
                            } else {
                                int[] a7 = m4513a(cmn2, a, cmd2, cgt);
                                i9 = a7[0];
                                i10 = a7[1];
                            }
                            i3 = i17;
                            double a8 = (double) cmb.mo3966a(i9, i10, i3, i14);
                            int i21 = Build.VERSION.SDK_INT;
                            int a9 = m4509a(a8);
                            double d = (double) a9;
                            Double.isNaN(d);
                            Double.isNaN(a8);
                            int b7 = m4514b(d * a8);
                            double d2 = (double) (((float) b7) / ((float) a9));
                            Double.isNaN(a8);
                            Double.isNaN(d2);
                            double d3 = (double) b7;
                            Double.isNaN(d3);
                            a.inTargetDensity = m4514b((a8 / d2) * d3);
                            a.inDensity = m4509a(a8);
                            if (!m4512a(a)) {
                                a.inTargetDensity = 0;
                                a.inDensity = 0;
                            } else {
                                a.inScaled = true;
                            }
                            i4 = i16;
                        } else {
                            throw new IllegalArgumentException("Cannot round with null rounding");
                        }
                    } else {
                        String valueOf = String.valueOf(cmb);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118);
                        sb.append("Cannot scale with factor: ");
                        sb.append(a6);
                        sb.append(" from: ");
                        sb.append(valueOf);
                        sb.append(", source: [");
                        sb.append(i11);
                        sb.append("x");
                        sb.append(i12);
                        sb.append("], target: [");
                        sb.append(i13);
                        sb.append("x");
                        sb.append(i14);
                        sb.append("]");
                        throw new IllegalArgumentException(sb.toString());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cme = this;
                    bArr = bArr2;
                    m4516b(a);
                    cme.f7053f.mo3874a(bArr);
                    throw th;
                }
            } else {
                z2 = z;
                ccu = ccu2;
                z3 = booleanValue;
                i4 = i12;
                i3 = i13;
            }
            cme = this;
            try {
                cmk cmk = cme.f7057k;
                if (z2) {
                    boolean z4 = cmk.f7064b;
                    int i22 = Build.VERSION.SDK_INT;
                    if (!b3) {
                        int i23 = cmk.f7065c;
                        if (i3 >= 0) {
                            if (i14 >= 0 && cmk.mo3974a()) {
                                a.inPreferredConfig = Bitmap.Config.HARDWARE;
                                a.inMutable = false;
                                int i24 = Build.VERSION.SDK_INT;
                                int i25 = a.inSampleSize;
                                int i26 = Build.VERSION.SDK_INT;
                                if (i11 < 0) {
                                    if (i4 >= 0 && z3) {
                                        i5 = i3;
                                        if (i5 > 0) {
                                            if (i14 > 0) {
                                                cgt cgt2 = cme.f7055i;
                                                int i27 = Build.VERSION.SDK_INT;
                                                if (a.inPreferredConfig != Bitmap.Config.HARDWARE) {
                                                    Bitmap.Config config2 = a.outConfig;
                                                    if (config2 == null) {
                                                        config2 = a.inPreferredConfig;
                                                    }
                                                    a.inBitmap = cgt2.mo3882b(i5, i14, config2);
                                                }
                                            }
                                        }
                                        int i28 = Build.VERSION.SDK_INT;
                                        if (cdl2 == cdl.DISPLAY_P3 && a.outColorSpace != null) {
                                            if (a.outColorSpace.isWideGamut()) {
                                                named = ColorSpace.Named.DISPLAY_P3;
                                                a.inPreferredColorSpace = ColorSpace.get(named);
                                                b = m4515b(cmn2, a, cmd2, cme.f7055i);
                                                cmd2.mo3971a(cme.f7055i, b);
                                                if (b == null) {
                                                    b.setDensity(cme.f7056j.densityDpi);
                                                    cgt cgt3 = cme.f7055i;
                                                    if (cmw.m4566b(i15)) {
                                                        Matrix matrix = new Matrix();
                                                        switch (i15) {
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
                                                        RectF rectF = new RectF(0.0f, 0.0f, (float) b.getWidth(), (float) b.getHeight());
                                                        matrix.mapRect(rectF);
                                                        bitmap = cgt3.mo3878a(Math.round(rectF.width()), Math.round(rectF.height()), cmw.m4561a(b));
                                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                                        bitmap.setHasAlpha(b.hasAlpha());
                                                        cmw.m4564a(b, bitmap, matrix);
                                                    } else {
                                                        bitmap = b;
                                                    }
                                                    if (!b.equals(bitmap)) {
                                                        cme.f7055i.mo3881a(b);
                                                    }
                                                } else {
                                                    bitmap = null;
                                                }
                                                clm a10 = clm.m4457a(bitmap, cme.f7055i);
                                                m4516b(a);
                                                cme.f7053f.mo3874a(bArr2);
                                                return a10;
                                            }
                                        }
                                        named = ColorSpace.Named.SRGB;
                                        a.inPreferredColorSpace = ColorSpace.get(named);
                                        b = m4515b(cmn2, a, cmd2, cme.f7055i);
                                        cmd2.mo3971a(cme.f7055i, b);
                                        if (b == null) {
                                        }
                                        clm a102 = clm.m4457a(bitmap, cme.f7055i);
                                        m4516b(a);
                                        cme.f7053f.mo3874a(bArr2);
                                        return a102;
                                    }
                                }
                                if (!m4512a(a)) {
                                    f = ((float) a.inTargetDensity) / ((float) a.inDensity);
                                } else {
                                    f = 1.0f;
                                }
                                float f7 = (float) a.inSampleSize;
                                double ceil = Math.ceil((double) (((float) i11) / f7));
                                double ceil2 = Math.ceil((double) (((float) i4) / f7));
                                i5 = Math.round(((float) ((int) ceil)) * f);
                                i14 = Math.round(((float) ((int) ceil2)) * f);
                                if (i5 > 0) {
                                }
                                int i282 = Build.VERSION.SDK_INT;
                                if (a.outColorSpace.isWideGamut()) {
                                }
                            }
                        }
                    }
                }
                if (ccu == ccu.f6556a) {
                    a.inPreferredConfig = Bitmap.Config.ARGB_8888;
                } else {
                    int i29 = Build.VERSION.SDK_INT;
                    if (cmn.mo3976a().hasAlpha()) {
                        config = Bitmap.Config.ARGB_8888;
                        a.inPreferredConfig = config;
                        if (a.inPreferredConfig == Bitmap.Config.RGB_565) {
                            a.inDither = true;
                        }
                    }
                    config = Bitmap.Config.RGB_565;
                    a.inPreferredConfig = config;
                    if (a.inPreferredConfig == Bitmap.Config.RGB_565) {
                    }
                }
            } catch (IOException e) {
            } catch (Throwable th3) {
                th = th3;
                bArr = bArr2;
                m4516b(a);
                cme.f7053f.mo3874a(bArr);
                throw th;
            }
            int i242 = Build.VERSION.SDK_INT;
            int i252 = a.inSampleSize;
            int i262 = Build.VERSION.SDK_INT;
            if (i11 < 0) {
            }
            if (!m4512a(a)) {
            }
            float f72 = (float) a.inSampleSize;
            double ceil3 = Math.ceil((double) (((float) i11) / f72));
            double ceil22 = Math.ceil((double) (((float) i4) / f72));
            i5 = Math.round(((float) ((int) ceil3)) * f);
            i14 = Math.round(((float) ((int) ceil22)) * f);
            if (i5 > 0) {
            }
            int i2822 = Build.VERSION.SDK_INT;
            if (a.outColorSpace.isWideGamut()) {
            }
        } catch (Throwable th4) {
            th = th4;
            cme = this;
            m4516b(a);
            cme.f7053f.mo3874a(bArr);
            throw th;
        }
    }

    /* renamed from: b */
    private static void m4516b(BitmapFactory.Options options) {
        m4517c(options);
        synchronized (f7052h) {
            f7052h.offer(options);
        }
    }

    /* renamed from: a */
    public final cgj mo3973a(InputStream inputStream, int i, int i2, cdk cdk, cmd cmd) {
        return mo3972a(new cml(inputStream, this.f7054g, this.f7053f), i, i2, cdk, cmd);
    }
}

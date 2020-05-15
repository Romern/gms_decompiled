package p000;

import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

/* renamed from: albz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albz {

    /* renamed from: a */
    public final int f73374a;

    /* renamed from: b */
    public final int f73375b;

    /* renamed from: c */
    public final int f73376c;

    /* renamed from: d */
    public final int f73377d;

    /* renamed from: e */
    public final int f73378e;

    /* renamed from: f */
    public final int f73379f;

    /* renamed from: g */
    public final int f73380g;

    /* renamed from: h */
    public final float f73381h;

    /* renamed from: i */
    public final float f73382i;

    /* renamed from: j */
    public final float f73383j;

    /* renamed from: k */
    public final boolean f73384k;

    public albz(int i, int i2) {
        this.f73374a = i;
        Calendar.getInstance();
        Calendar.getInstance();
        this.f73375b = i;
        this.f73376c = i2;
        this.f73379f = 0;
        this.f73380g = 0;
        this.f73377d = i;
        this.f73378e = i2;
        this.f73381h = 0.0f;
        this.f73382i = 0.0f;
        this.f73383j = 0.0f;
        this.f73384k = true;
    }

    /* renamed from: a */
    private static double m60831a(awo awo, String str) {
        if (awo.mo2763a("http://ns.google.com/photos/1.0/panorama/", str)) {
            return awo.mo2766d("http://ns.google.com/photos/1.0/panorama/", str).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: b */
    private static int m60834b(awo awo, String str) {
        if (awo.mo2763a("http://ns.google.com/photos/1.0/panorama/", str)) {
            return awo.mo2765c("http://ns.google.com/photos/1.0/panorama/", str).intValue();
        }
        return 0;
    }

    /* renamed from: c */
    private static void m60835c(awo awo, String str) {
        if (awo.mo2763a("http://ns.google.com/photos/1.0/panorama/", str)) {
            awo.mo2768f("http://ns.google.com/photos/1.0/panorama/", str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf A[SYNTHETIC, Splitter:B:68:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0154  */
    /* renamed from: a */
    public static albz m60832a(albx albx) {
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        InputStream a;
        boolean z2;
        float f4;
        float f5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        InputStream a2 = albx.mo40054a();
        if (a2 == null) {
            return null;
        }
        awo a3 = alcp.m60861a(a2);
        boolean z3 = true;
        if (a3 == null) {
            z = false;
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
            f3 = 0.0f;
            f2 = 0.0f;
            f = 0.0f;
        } else {
            try {
                m60835c(a3, "FirstPhotoDate");
                m60835c(a3, "LastPhotoDate");
                m60834b(a3, "SourcePhotosCount");
                if (a3.mo2763a("http://ns.google.com/photos/1.0/panorama/", "ProjectionType")) {
                    a3.mo2767e("http://ns.google.com/photos/1.0/panorama/", "ProjectionType");
                }
                if (a3.mo2763a("http://ns.google.com/photos/1.0/panorama/", "UsePanoramaViewer")) {
                    a3.mo2764b("http://ns.google.com/photos/1.0/panorama/", "UsePanoramaViewer").booleanValue();
                }
                i12 = m60834b(a3, "CroppedAreaImageWidthPixels");
                try {
                    i11 = m60834b(a3, "CroppedAreaImageHeightPixels");
                    try {
                        i10 = m60834b(a3, "FullPanoWidthPixels");
                        try {
                            i9 = m60834b(a3, "FullPanoHeightPixels");
                        } catch (awn e) {
                            i9 = 0;
                            i8 = 0;
                            i7 = 0;
                            f5 = 0.0f;
                            f4 = 0.0f;
                            f3 = f5;
                            f2 = f4;
                            z = false;
                            f = 0.0f;
                            i2 = i8;
                            i = i7;
                            i4 = i10;
                            i3 = i9;
                            i6 = i12;
                            i5 = i11;
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            a = albx.mo40054a();
                            BitmapFactory.decodeStream(a, null, options);
                            if (a != null) {
                            }
                            int i13 = options.outWidth;
                            int i14 = options.outHeight;
                            int i15 = i14 + i14;
                            if (!z) {
                            }
                            double d = (double) i13;
                            z2 = z3;
                            double d2 = (double) i14;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            double d3 = d / d2;
                            double d4 = (double) i6;
                            int i16 = i14;
                            double d5 = (double) i5;
                            Double.isNaN(d4);
                            Double.isNaN(d5);
                            double d6 = d4 / d5;
                            if (!z2) {
                            }
                            if (!z2) {
                            }
                            if (z2) {
                            }
                        }
                    } catch (awn e2) {
                        i10 = 0;
                        i9 = 0;
                        i8 = 0;
                        i7 = 0;
                        f5 = 0.0f;
                        f4 = 0.0f;
                        f3 = f5;
                        f2 = f4;
                        z = false;
                        f = 0.0f;
                        i2 = i8;
                        i = i7;
                        i4 = i10;
                        i3 = i9;
                        i6 = i12;
                        i5 = i11;
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        a = albx.mo40054a();
                        BitmapFactory.decodeStream(a, null, options2);
                        if (a != null) {
                        }
                        int i132 = options2.outWidth;
                        int i142 = options2.outHeight;
                        int i152 = i142 + i142;
                        if (!z) {
                        }
                        double d7 = (double) i132;
                        z2 = z3;
                        double d22 = (double) i142;
                        Double.isNaN(d7);
                        Double.isNaN(d22);
                        double d32 = d7 / d22;
                        double d42 = (double) i6;
                        int i162 = i142;
                        double d52 = (double) i5;
                        Double.isNaN(d42);
                        Double.isNaN(d52);
                        double d62 = d42 / d52;
                        if (!z2) {
                        }
                        if (!z2) {
                        }
                        if (z2) {
                        }
                    }
                    try {
                        i8 = m60834b(a3, "CroppedAreaLeftPixels");
                        try {
                            i7 = m60834b(a3, "CroppedAreaTopPixels");
                            try {
                                f5 = (float) m60831a(a3, "PoseHeadingDegrees");
                            } catch (awn e3) {
                                f5 = 0.0f;
                                f4 = 0.0f;
                                f3 = f5;
                                f2 = f4;
                                z = false;
                                f = 0.0f;
                                i2 = i8;
                                i = i7;
                                i4 = i10;
                                i3 = i9;
                                i6 = i12;
                                i5 = i11;
                                BitmapFactory.Options options22 = new BitmapFactory.Options();
                                options22.inJustDecodeBounds = true;
                                a = albx.mo40054a();
                                BitmapFactory.decodeStream(a, null, options22);
                                if (a != null) {
                                }
                                int i1322 = options22.outWidth;
                                int i1422 = options22.outHeight;
                                int i1522 = i1422 + i1422;
                                if (!z) {
                                }
                                double d72 = (double) i1322;
                                z2 = z3;
                                double d222 = (double) i1422;
                                Double.isNaN(d72);
                                Double.isNaN(d222);
                                double d322 = d72 / d222;
                                double d422 = (double) i6;
                                int i1622 = i1422;
                                double d522 = (double) i5;
                                Double.isNaN(d422);
                                Double.isNaN(d522);
                                double d622 = d422 / d522;
                                if (!z2) {
                                }
                                if (!z2) {
                                }
                                if (z2) {
                                }
                            }
                        } catch (awn e4) {
                            i7 = 0;
                            f5 = 0.0f;
                            f4 = 0.0f;
                            f3 = f5;
                            f2 = f4;
                            z = false;
                            f = 0.0f;
                            i2 = i8;
                            i = i7;
                            i4 = i10;
                            i3 = i9;
                            i6 = i12;
                            i5 = i11;
                            BitmapFactory.Options options222 = new BitmapFactory.Options();
                            options222.inJustDecodeBounds = true;
                            a = albx.mo40054a();
                            BitmapFactory.decodeStream(a, null, options222);
                            if (a != null) {
                            }
                            int i13222 = options222.outWidth;
                            int i14222 = options222.outHeight;
                            int i15222 = i14222 + i14222;
                            if (!z) {
                            }
                            double d722 = (double) i13222;
                            z2 = z3;
                            double d2222 = (double) i14222;
                            Double.isNaN(d722);
                            Double.isNaN(d2222);
                            double d3222 = d722 / d2222;
                            double d4222 = (double) i6;
                            int i16222 = i14222;
                            double d5222 = (double) i5;
                            Double.isNaN(d4222);
                            Double.isNaN(d5222);
                            double d6222 = d4222 / d5222;
                            if (!z2) {
                            }
                            if (!z2) {
                            }
                            if (z2) {
                            }
                        }
                        try {
                            f4 = (float) m60831a(a3, "PosePitchDegrees");
                            try {
                                float a4 = (float) m60831a(a3, "PoseRollDegrees");
                                z = i12 > 0 && i11 > 0 && i10 > 0 && i9 > 0;
                                f = a4;
                                f3 = f5;
                                f2 = f4;
                                i2 = i8;
                                i = i7;
                                i4 = i10;
                                i3 = i9;
                                i6 = i12;
                                i5 = i11;
                            } catch (awn e5) {
                                f3 = f5;
                                f2 = f4;
                                z = false;
                                f = 0.0f;
                                i2 = i8;
                                i = i7;
                                i4 = i10;
                                i3 = i9;
                                i6 = i12;
                                i5 = i11;
                                BitmapFactory.Options options2222 = new BitmapFactory.Options();
                                options2222.inJustDecodeBounds = true;
                                a = albx.mo40054a();
                                BitmapFactory.decodeStream(a, null, options2222);
                                if (a != null) {
                                }
                                int i132222 = options2222.outWidth;
                                int i142222 = options2222.outHeight;
                                int i152222 = i142222 + i142222;
                                if (!z) {
                                }
                                double d7222 = (double) i132222;
                                z2 = z3;
                                double d22222 = (double) i142222;
                                Double.isNaN(d7222);
                                Double.isNaN(d22222);
                                double d32222 = d7222 / d22222;
                                double d42222 = (double) i6;
                                int i162222 = i142222;
                                double d52222 = (double) i5;
                                Double.isNaN(d42222);
                                Double.isNaN(d52222);
                                double d62222 = d42222 / d52222;
                                if (!z2) {
                                }
                                if (!z2) {
                                }
                                if (z2) {
                                }
                            }
                        } catch (awn e6) {
                            f4 = 0.0f;
                            f3 = f5;
                            f2 = f4;
                            z = false;
                            f = 0.0f;
                            i2 = i8;
                            i = i7;
                            i4 = i10;
                            i3 = i9;
                            i6 = i12;
                            i5 = i11;
                            BitmapFactory.Options options22222 = new BitmapFactory.Options();
                            options22222.inJustDecodeBounds = true;
                            a = albx.mo40054a();
                            BitmapFactory.decodeStream(a, null, options22222);
                            if (a != null) {
                            }
                            int i1322222 = options22222.outWidth;
                            int i1422222 = options22222.outHeight;
                            int i1522222 = i1422222 + i1422222;
                            if (!z) {
                            }
                            double d72222 = (double) i1322222;
                            z2 = z3;
                            double d222222 = (double) i1422222;
                            Double.isNaN(d72222);
                            Double.isNaN(d222222);
                            double d322222 = d72222 / d222222;
                            double d422222 = (double) i6;
                            int i1622222 = i1422222;
                            double d522222 = (double) i5;
                            Double.isNaN(d422222);
                            Double.isNaN(d522222);
                            double d622222 = d422222 / d522222;
                            if (!z2) {
                            }
                            if (!z2) {
                            }
                            if (z2) {
                            }
                        }
                    } catch (awn e7) {
                        i8 = 0;
                        i7 = 0;
                        f5 = 0.0f;
                        f4 = 0.0f;
                        f3 = f5;
                        f2 = f4;
                        z = false;
                        f = 0.0f;
                        i2 = i8;
                        i = i7;
                        i4 = i10;
                        i3 = i9;
                        i6 = i12;
                        i5 = i11;
                        BitmapFactory.Options options222222 = new BitmapFactory.Options();
                        options222222.inJustDecodeBounds = true;
                        a = albx.mo40054a();
                        BitmapFactory.decodeStream(a, null, options222222);
                        if (a != null) {
                        }
                        int i13222222 = options222222.outWidth;
                        int i14222222 = options222222.outHeight;
                        int i15222222 = i14222222 + i14222222;
                        if (!z) {
                        }
                        double d722222 = (double) i13222222;
                        z2 = z3;
                        double d2222222 = (double) i14222222;
                        Double.isNaN(d722222);
                        Double.isNaN(d2222222);
                        double d3222222 = d722222 / d2222222;
                        double d4222222 = (double) i6;
                        int i16222222 = i14222222;
                        double d5222222 = (double) i5;
                        Double.isNaN(d4222222);
                        Double.isNaN(d5222222);
                        double d6222222 = d4222222 / d5222222;
                        if (!z2) {
                        }
                        if (!z2) {
                        }
                        if (z2) {
                        }
                    }
                } catch (awn e8) {
                    i11 = 0;
                    i10 = 0;
                    i9 = 0;
                    i8 = 0;
                    i7 = 0;
                    f5 = 0.0f;
                    f4 = 0.0f;
                    f3 = f5;
                    f2 = f4;
                    z = false;
                    f = 0.0f;
                    i2 = i8;
                    i = i7;
                    i4 = i10;
                    i3 = i9;
                    i6 = i12;
                    i5 = i11;
                    BitmapFactory.Options options2222222 = new BitmapFactory.Options();
                    options2222222.inJustDecodeBounds = true;
                    a = albx.mo40054a();
                    BitmapFactory.decodeStream(a, null, options2222222);
                    if (a != null) {
                    }
                    int i132222222 = options2222222.outWidth;
                    int i142222222 = options2222222.outHeight;
                    int i152222222 = i142222222 + i142222222;
                    if (!z) {
                    }
                    double d7222222 = (double) i132222222;
                    z2 = z3;
                    double d22222222 = (double) i142222222;
                    Double.isNaN(d7222222);
                    Double.isNaN(d22222222);
                    double d32222222 = d7222222 / d22222222;
                    double d42222222 = (double) i6;
                    int i162222222 = i142222222;
                    double d52222222 = (double) i5;
                    Double.isNaN(d42222222);
                    Double.isNaN(d52222222);
                    double d62222222 = d42222222 / d52222222;
                    if (!z2) {
                    }
                    if (!z2) {
                    }
                    if (z2) {
                    }
                }
            } catch (awn e9) {
                i12 = 0;
                i11 = 0;
                i10 = 0;
                i9 = 0;
                i8 = 0;
                i7 = 0;
                f5 = 0.0f;
                f4 = 0.0f;
                f3 = f5;
                f2 = f4;
                z = false;
                f = 0.0f;
                i2 = i8;
                i = i7;
                i4 = i10;
                i3 = i9;
                i6 = i12;
                i5 = i11;
                BitmapFactory.Options options22222222 = new BitmapFactory.Options();
                options22222222.inJustDecodeBounds = true;
                a = albx.mo40054a();
                BitmapFactory.decodeStream(a, null, options22222222);
                if (a != null) {
                }
                int i1322222222 = options22222222.outWidth;
                int i1422222222 = options22222222.outHeight;
                int i1522222222 = i1422222222 + i1422222222;
                if (!z) {
                }
                double d72222222 = (double) i1322222222;
                z2 = z3;
                double d222222222 = (double) i1422222222;
                Double.isNaN(d72222222);
                Double.isNaN(d222222222);
                double d322222222 = d72222222 / d222222222;
                double d422222222 = (double) i6;
                int i1622222222 = i1422222222;
                double d522222222 = (double) i5;
                Double.isNaN(d422222222);
                Double.isNaN(d522222222);
                double d622222222 = d422222222 / d522222222;
                if (!z2) {
                }
                if (!z2) {
                }
                if (z2) {
                }
            }
        }
        BitmapFactory.Options options222222222 = new BitmapFactory.Options();
        options222222222.inJustDecodeBounds = true;
        a = albx.mo40054a();
        try {
            BitmapFactory.decodeStream(a, null, options222222222);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e10) {
                }
            }
            int i13222222222 = options222222222.outWidth;
            int i14222222222 = options222222222.outHeight;
            int i15222222222 = i14222222222 + i14222222222;
            if (!z) {
                z3 = false;
            } else if (i15222222222 != i13222222222) {
                return null;
            }
            double d722222222 = (double) i13222222222;
            z2 = z3;
            double d2222222222 = (double) i14222222222;
            Double.isNaN(d722222222);
            Double.isNaN(d2222222222);
            double d3222222222 = d722222222 / d2222222222;
            double d4222222222 = (double) i6;
            int i16222222222 = i14222222222;
            double d5222222222 = (double) i5;
            Double.isNaN(d4222222222);
            Double.isNaN(d5222222222);
            double d6222222222 = d4222222222 / d5222222222;
            if (!z2 || m60833a(d3222222222, d6222222222, 0.05d)) {
                if (!z2) {
                    double d8 = (double) i4;
                    double d9 = (double) i3;
                    Double.isNaN(d8);
                    Double.isNaN(d9);
                    if (!m60833a(d8 / d9, 2.0d, 0.1d)) {
                        Log.w("PanoMetadata", "Pano metadata invalid: Full pano dimension not 2:1.");
                        return null;
                    }
                }
                if (z2) {
                    return new albz(i13222222222, i6, i5, i4, i3, i2, i, f3, f2, f);
                }
                return new albz(i13222222222, i16222222222);
            }
            StringBuilder sb = new StringBuilder(139);
            sb.append("Pano metadata does not match file dimensions. Image aspect ratio: ");
            sb.append(d3222222222);
            sb.append(". Metadata aspect ratio: ");
            sb.append(d6222222222);
            Log.w("PanoMetadata", sb.toString());
            return null;
        } catch (Throwable th) {
            Throwable th2 = th;
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e11) {
                }
            }
            throw th2;
        }
    }

    private albz(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, float f2, float f3) {
        this.f73374a = i;
        this.f73375b = i2;
        this.f73376c = i3;
        this.f73377d = i4;
        this.f73378e = i5;
        this.f73379f = i6;
        this.f73380g = i7;
        this.f73381h = f;
        this.f73382i = f2;
        this.f73383j = f3;
        this.f73384k = false;
    }

    /* renamed from: a */
    private static boolean m60833a(double d, double d2, double d3) {
        return Math.abs(d - d2) < d3;
    }
}

package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aktg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktg extends akuu {

    /* renamed from: a */
    private final cijl f72731a;

    /* renamed from: b */
    private final cijl f72732b;

    /* renamed from: c */
    private final aksc f72733c;

    /* renamed from: d */
    private final float f72734d;

    /* renamed from: e */
    private final Object f72735e = new Object();

    /* renamed from: f */
    private avxv f72736f;

    /* renamed from: g */
    private int[] f72737g;

    /* renamed from: h */
    private Bitmap f72738h;

    /* renamed from: i */
    private long f72739i;

    /* renamed from: j */
    private long f72740j = 0;

    /* renamed from: k */
    private boolean f72741k = false;

    public aktg(cijl cijl, cijl cijl2, aksc aksc, float f) {
        this.f72731a = cijl;
        this.f72732b = cijl2;
        this.f72733c = aksc;
        this.f72734d = f;
        this.f72739i = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39833a() {
        this.f72733c.mo39775g();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Pair mo39835b(Object obj) {
        akvf akvf;
        long j;
        int i;
        SparseArray sparseArray;
        List list;
        String str;
        boolean z;
        boolean z2;
        akvf akvf2 = (akvf) obj;
        avxv c = mo39839c();
        int i2 = 0;
        if (c == null) {
            return new Pair(false, akvf2);
        }
        OcrImage d = akvf2.mo39889d();
        int height = d.getHeight();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int width = d.getWidth();
        int height2 = d.getHeight();
        if (height >= 640) {
            width /= 2;
            height2 /= 2;
        }
        int[] iArr = this.f72737g;
        if (iArr == null) {
            this.f72737g = new int[(width * height2)];
            this.f72738h = Bitmap.createBitmap(width, height2, Bitmap.Config.ARGB_8888);
        } else if (iArr.length != width * height2) {
            throw new IllegalStateException("Convert buffer is wrong size - did the OcrImage change resolution?");
        }
        if (height < 640) {
            int[] iArr2 = this.f72737g;
            if (d.getFormat() == 17) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34974b(z2);
            byte[] data = d.getData();
            int width2 = d.getWidth();
            int height3 = d.getHeight();
            int i3 = width2 * height3;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < height3) {
                while (i2 < width2) {
                    int i7 = i6 + 1;
                    byte b = data[i6];
                    int i8 = i3 + ((i4 / 2) * width2) + (i2 & -2);
                    int i9 = height3;
                    byte b2 = data[i8];
                    int i10 = (b & 255) - 16;
                    int i11 = width2;
                    int i12 = (data[i8 + 1] & 255) - 128;
                    int i13 = (b2 & 255) - 128;
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    int i14 = i10 * 1192;
                    iArr2[i5] = (((Math.min(262143, Math.max(0, (i13 * 1634) + i14)) >> 10) & 255) << 16) | -16777216 | (((Math.min(262143, Math.max(0, (i14 - (i13 * 833)) - (i12 * 400))) >> 10) & 255) << 8) | ((Math.min(262143, Math.max(0, i14 + (i12 * 2066))) >> 10) & 255);
                    i2++;
                    i5++;
                    i6 = i7;
                    height3 = i9;
                    width2 = i11;
                    data = data;
                    akvf2 = akvf2;
                }
                i4++;
                i2 = 0;
            }
            akvf = akvf2;
            j = elapsedRealtime;
        } else {
            akvf = akvf2;
            int[] iArr3 = this.f72737g;
            if (d.getFormat() == 17) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            byte[] data2 = d.getData();
            int width3 = d.getWidth();
            int height4 = d.getHeight();
            int i15 = width3 * height4;
            int i16 = width3 / 2;
            int i17 = height4 / 2;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i18 < i17) {
                int i21 = i17;
                int i22 = 0;
                while (i22 < i16) {
                    int i23 = i16;
                    byte b3 = data2[i20];
                    i20 += 2;
                    int i24 = i15 + 1;
                    byte b4 = data2[i15];
                    int i25 = i24 + 1;
                    int i26 = (b3 & 255) - 16;
                    long j2 = elapsedRealtime;
                    int i27 = (data2[i24] & 255) - 128;
                    int i28 = (b4 & 255) - 128;
                    if (i26 < 0) {
                        i26 = 0;
                    }
                    int i29 = i26 * 1192;
                    iArr3[i19] = (((Math.min(262143, Math.max(0, (i28 * 1634) + i29)) >> 10) & 255) << 16) | -16777216 | (((Math.min(262143, Math.max(0, (i29 - (i28 * 833)) - (i27 * 400))) >> 10) & 255) << 8) | ((Math.min(262143, Math.max(0, i29 + (i27 * 2066))) >> 10) & 255);
                    i22++;
                    i16 = i23;
                    data2 = data2;
                    i15 = i25;
                    elapsedRealtime = j2;
                    i19++;
                }
                i20 += width3;
                i18++;
                i17 = i21;
                i15 = i15;
            }
            j = elapsedRealtime;
        }
        boolean z3 = true;
        this.f72738h.setPixels(this.f72737g, 0, width, 0, 0, width, height2);
        Bitmap bitmap = this.f72738h;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        avxw avxw = new avxw();
        int width4 = bitmap.getWidth();
        int height5 = bitmap.getHeight();
        avxy avxy = avxw.f94088a;
        avxy.f94097c = bitmap;
        avxx avxx = avxy.f94095a;
        avxx.f94089a = width4;
        avxx.f94090b = height5;
        int orientation = d.getOrientation();
        if (orientation == 0) {
            i = 0;
        } else if (orientation == 90) {
            i = 1;
        } else if (orientation == 180) {
            i = 2;
        } else if (orientation == 270) {
            i = 3;
        } else {
            StringBuilder sb = new StringBuilder(49);
            sb.append("Unsupported orientation degree value: ");
            sb.append(orientation);
            throw new IllegalArgumentException(sb.toString());
        }
        avxw.mo51714a(i);
        avxy a = avxw.mo51713a();
        if (!(c instanceof avzv)) {
            sparseArray = c.mo51710a(a);
        } else {
            Rect b5 = ((akqm) this.f72732b).mo6445a();
            if (height >= 640) {
                b5.set(b5.left / 2, b5.top / 2, b5.right / 2, b5.bottom / 2);
            }
            sparseArray = ((avzv) c).mo51764a(a, new RecognitionOptions(b5));
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        new Object[1][0] = Long.valueOf(elapsedRealtime2 - j);
        new Object[1][0] = Long.valueOf(elapsedRealtime3 - elapsedRealtime2);
        if (sparseArray == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(sparseArray.size());
            for (int i30 = 0; i30 < sparseArray.size(); i30++) {
                avzt avzt = (avzt) sparseArray.get(sparseArray.keyAt(i30));
                LineBoxParcel[] lineBoxParcelArr = avzt.f94126a;
                if (lineBoxParcelArr.length != 0) {
                    StringBuilder sb2 = new StringBuilder(lineBoxParcelArr[0].f109741e);
                    for (int i31 = 1; i31 < avzt.f94126a.length; i31++) {
                        sb2.append("\n");
                        sb2.append(avzt.f94126a[i31].f109741e);
                    }
                    str = sb2.toString();
                } else {
                    str = "";
                }
                arrayList.add(str);
            }
            list = arrayList;
        }
        if (!list.isEmpty()) {
            new Object[1][0] = Integer.valueOf(list.size());
        }
        akvf akvf3 = akvf;
        akvf3.mo39888a(list);
        if (list.size() <= 0) {
            z3 = false;
        }
        long elapsedRealtime4 = SystemClock.elapsedRealtime();
        this.f72739i = elapsedRealtime4;
        this.f72740j = (long) Math.round(this.f72734d * ((float) (elapsedRealtime4 - j)));
        return new Pair(Boolean.valueOf(z3), akvf3);
    }

    /* renamed from: c */
    public final avxv mo39839c() {
        avxv avxv;
        synchronized (this.f72735e) {
            if (this.f72736f == null) {
                if (!this.f72741k && Looper.myLooper() != Looper.getMainLooper()) {
                    this.f72736f = (avxv) this.f72731a.mo6445a();
                }
            }
            avxv = this.f72736f;
        }
        return avxv;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo39837d(Object obj) {
        akvf akvf = (akvf) obj;
        avxv c = mo39839c();
        if (c == null) {
            return false;
        }
        return c.mo51712b() && SystemClock.elapsedRealtime() - this.f72739i >= this.f72740j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39834a(long j) {
        this.f72733c.mo39774f(j);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo39836c(Object obj) {
        ((akvf) obj).mo39888a((List) null);
    }

    /* renamed from: b */
    public final void mo39838b() {
        synchronized (this.f72735e) {
            this.f72741k = true;
            avxv avxv = this.f72736f;
            if (avxv != null) {
                avxv.mo51711a();
            }
        }
    }
}

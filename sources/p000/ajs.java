package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.view.SelectionSlider;
import java.util.ArrayList;

/* renamed from: ajs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajs implements ajm {

    /* renamed from: k */
    public static final aju f664k = new aju((byte[]) null);

    /* renamed from: l */
    public static final aju f665l = new aju((boolean[]) null);

    /* renamed from: m */
    public static final aju f666m = new aju((float[]) null);

    /* renamed from: n */
    public static final aju f667n = new aju((byte[][]) null);

    /* renamed from: o */
    public static final aju f668o = new aju((short[]) null);

    /* renamed from: p */
    public static final aju f669p = new aju((int[]) null);

    /* renamed from: q */
    public static final aju f670q = new aju((char[]) null);

    /* renamed from: a */
    public float f671a = 0.0f;

    /* renamed from: b */
    public float f672b = Float.MAX_VALUE;

    /* renamed from: c */
    public final Object f673c;

    /* renamed from: d */
    final aju f674d;

    /* renamed from: e */
    public boolean f675e = false;

    /* renamed from: f */
    public float f676f = Float.MAX_VALUE;

    /* renamed from: g */
    public float f677g = -3.4028235E38f;

    /* renamed from: h */
    public final float f678h;

    /* renamed from: i */
    public final ArrayList f679i = new ArrayList();

    /* renamed from: j */
    public final ajt f680j;

    /* renamed from: r */
    private long f681r = 0;

    /* renamed from: s */
    private final ArrayList f682s = new ArrayList();

    /* renamed from: a */
    private static void m883a(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public ajs(Object obj, aju aju) {
        this.f673c = obj;
        this.f674d = aju;
        if (aju == f667n || aju == f668o || aju == f669p) {
            this.f678h = 0.1f;
        } else if (aju == f670q || aju == f665l || aju == f666m) {
            this.f678h = 0.00390625f;
        } else {
            this.f678h = 1.0f;
        }
        ajt ajt = new ajt();
        this.f680j = ajt;
        ajt.f684b = this.f678h * 0.75f * 62.5f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo836a(float f) {
        ((View) this.f673c).setTranslationX(f);
        for (int i = 0; i < this.f682s.size(); i++) {
            if (this.f682s.get(i) != null) {
                ((ajr) this.f682s.get(i)).mo835a();
            }
        }
        m883a(this.f682s);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo831a(long j) {
        boolean z;
        long j2 = this.f681r;
        if (j2 != 0) {
            this.f681r = j;
            ajt ajt = this.f680j;
            float f = this.f672b;
            float f2 = this.f671a;
            float f3 = (float) (j - j2);
            ajq ajq = ajt.f685c;
            double d = (double) f2;
            double exp = Math.exp((double) ((f3 / 1000.0f) * ajt.f683a));
            Double.isNaN(d);
            ajq.f663b = (float) (d * exp);
            ajq ajq2 = ajt.f685c;
            float f4 = ajt.f683a;
            float f5 = f2 / f4;
            double d2 = (double) (f - f5);
            double d3 = (double) f5;
            double exp2 = Math.exp((double) ((f4 * f3) / 1000.0f));
            Double.isNaN(d3);
            Double.isNaN(d2);
            ajq2.f662a = (float) (d2 + (d3 * exp2));
            if (ajt.mo837a(ajt.f685c.f663b)) {
                ajt.f685c.f663b = 0.0f;
            }
            ajq ajq3 = ajt.f685c;
            float f6 = ajq3.f662a;
            this.f672b = f6;
            float f7 = ajq3.f663b;
            this.f671a = f7;
            float f8 = this.f677g;
            if (f6 >= f8) {
                float f9 = this.f676f;
                if (f6 > f9) {
                    this.f672b = f9;
                    z = true;
                } else if (f6 < f9 && f6 > f8 && !this.f680j.mo837a(f7)) {
                    z = false;
                }
                float min = Math.min(this.f672b, this.f676f);
                this.f672b = min;
                float max = Math.max(min, this.f677g);
                this.f672b = max;
                mo836a(max);
                if (!z) {
                    this.f675e = false;
                    ajp a = ajp.m880a();
                    a.f656b.remove(this);
                    int indexOf = a.f657c.indexOf(this);
                    if (indexOf >= 0) {
                        a.f657c.set(indexOf, null);
                        a.f659e = true;
                    }
                    this.f681r = 0;
                    for (int i = 0; i < this.f679i.size(); i++) {
                        if (this.f679i.get(i) != null) {
                            float f10 = this.f672b;
                            SelectionSlider selectionSlider = ((akjh) this.f679i.get(i)).f72087a;
                            int i2 = (int) f10;
                            selectionSlider.f81161b = i2;
                            if (akiu.m59860a(selectionSlider.getContext())) {
                                selectionSlider.f81161b = (selectionSlider.getWidth() - selectionSlider.f81160a.getWidth()) + i2;
                            }
                            selectionSlider.mo44663a(selectionSlider.mo44662a());
                            selectionSlider.f81161b = 0;
                        }
                    }
                    m883a(this.f679i);
                    return;
                }
                return;
            }
            this.f672b = f8;
            z = true;
            float min2 = Math.min(this.f672b, this.f676f);
            this.f672b = min2;
            float max2 = Math.max(min2, this.f677g);
            this.f672b = max2;
            mo836a(max2);
            if (!z) {
            }
        } else {
            this.f681r = j;
            mo836a(this.f672b);
        }
    }
}

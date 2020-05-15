package p000;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: axw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axw {

    /* renamed from: a */
    public Map f2507a;

    /* renamed from: b */
    public Map f2508b;

    /* renamed from: c */
    public Map f2509c;

    /* renamed from: d */
    public C1246ol f2510d;

    /* renamed from: e */
    public C1230nw f2511e;

    /* renamed from: f */
    public List f2512f;

    /* renamed from: g */
    public Rect f2513g;

    /* renamed from: h */
    public float f2514h;

    /* renamed from: i */
    public float f2515i;

    /* renamed from: j */
    public float f2516j;

    /* renamed from: k */
    public boolean f2517k;

    /* renamed from: l */
    public int f2518l = 0;

    /* renamed from: m */
    private final HashSet f2519m = new HashSet();

    public axw() {
        new ayy();
    }

    /* renamed from: a */
    public final float mo2856a() {
        return (float) ((long) ((mo2860b() / this.f2516j) * 1000.0f));
    }

    /* renamed from: a */
    public final void mo2858a(int i) {
        this.f2518l += i;
    }

    /* renamed from: b */
    public final float mo2860b() {
        return this.f2515i - this.f2514h;
    }

    /* renamed from: c */
    public final void mo2861c() {
        this.f2517k = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        List list = this.f2512f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(((bcj) list.get(i)).mo2995a("\t"));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final bcj mo2857a(long j) {
        return (bcj) this.f2511e.mo15534a(j);
    }

    /* renamed from: a */
    public final void mo2859a(String str) {
        bek.m2805a(str);
        this.f2519m.add(str);
    }
}

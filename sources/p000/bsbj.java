package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bsbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbj {

    /* renamed from: a */
    public bsbk f143942a;

    /* renamed from: b */
    public int f143943b;

    /* renamed from: c */
    public int f143944c;

    /* renamed from: d */
    public int f143945d;

    /* renamed from: e */
    public float f143946e;

    /* renamed from: f */
    public float f143947f;

    /* renamed from: g */
    public float f143948g;

    /* renamed from: h */
    public float f143949h;

    /* renamed from: i */
    public double f143950i;

    /* renamed from: j */
    public double f143951j;

    /* renamed from: k */
    public String f143952k = null;

    /* renamed from: l */
    public int f143953l;

    /* renamed from: m */
    public String f143954m = null;

    /* renamed from: n */
    public int f143955n;

    /* renamed from: o */
    public boolean f143956o = false;

    /* renamed from: a */
    public final void mo70175a(double d) {
        this.f143950i = d;
        this.f143955n |= 2;
    }

    /* renamed from: a */
    public final void mo70177a(float f) {
        this.f143949h = f;
        this.f143955n |= 128;
    }

    /* renamed from: a */
    public final void mo70178a(int i, int i2, int i3) {
        this.f143943b = i;
        this.f143944c = i2;
        this.f143945d = i3;
        this.f143955n |= 1;
    }

    /* renamed from: a */
    public final void mo70180a(String str) {
        this.f143954m = str;
        this.f143955n |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    /* renamed from: b */
    public final void mo70181b(double d) {
        this.f143951j = d;
        this.f143955n |= 16;
    }

    /* renamed from: b */
    public final void mo70182b(float f) {
        this.f143948g = f;
        this.f143955n |= 8;
    }

    /* renamed from: c */
    public final void mo70183c(float f) {
        this.f143947f = f;
        this.f143955n |= 64;
    }

    /* renamed from: d */
    public final void mo70184d(float f) {
        this.f143946e = f;
        this.f143955n |= 4;
    }

    /* renamed from: a */
    public final bsbl mo70174a() {
        bsbl bsbl = new bsbl(this);
        this.f143956o = false;
        return bsbl;
    }

    /* renamed from: a */
    public final void mo70176a(double d, double d2, int i) {
        mo70178a(ayuo.m84849b(d), ayuo.m84849b(d2), i);
    }

    /* renamed from: a */
    public final void mo70179a(bsbk bsbk) {
        if (bsbk != null) {
            this.f143942a = bsbk;
            return;
        }
        throw new IllegalArgumentException("Provider cannot be null, use Provider.UNKNOWN");
    }
}

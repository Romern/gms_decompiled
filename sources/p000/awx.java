package p000;

/* renamed from: awx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awx {

    /* renamed from: a */
    public int f2457a = 0;

    /* renamed from: b */
    private final String f2458b;

    public awx(String str) {
        this.f2458b = str;
    }

    /* renamed from: a */
    public final char mo2775a(int i) {
        if (i < this.f2458b.length()) {
            return this.f2458b.charAt(i);
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo2778b() {
        return this.f2457a < this.f2458b.length();
    }

    /* renamed from: c */
    public final char mo2779c() {
        if (this.f2457a < this.f2458b.length()) {
            return this.f2458b.charAt(this.f2457a);
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo2780d() {
        this.f2457a++;
    }

    /* renamed from: a */
    public final int mo2776a() {
        return this.f2458b.length();
    }

    /* renamed from: a */
    public final int mo2777a(String str, int i) {
        char a = mo2775a(this.f2457a);
        int i2 = 0;
        boolean z = false;
        while (a >= '0' && a <= '9') {
            i2 = (i2 * 10) + (a - '0');
            int i3 = this.f2457a + 1;
            this.f2457a = i3;
            a = mo2775a(i3);
            z = true;
        }
        if (!z) {
            throw new awn(str, 5);
        } else if (i2 > i) {
            return i;
        } else {
            if (i2 >= 0) {
                return i2;
            }
            return 0;
        }
    }
}

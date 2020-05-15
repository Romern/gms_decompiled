package p000;

import java.nio.ByteBuffer;

/* renamed from: buav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class buav {

    /* renamed from: a */
    public int f153174a;

    /* renamed from: b */
    public int f153175b;

    /* renamed from: c */
    public float f153176c;

    /* renamed from: d */
    public int f153177d;

    /* renamed from: e */
    public int f153178e;

    /* renamed from: f */
    public int f153179f;

    /* renamed from: g */
    public int f153180g;

    /* renamed from: h */
    public int f153181h;

    /* renamed from: i */
    public int f153182i;

    /* renamed from: j */
    protected buas f153183j;

    protected buav(buas buas, int i, int i2, float f, ByteBuffer byteBuffer, int i3) {
        if (i2 <= 0 || ((float) i2) >= ((float) i3) * f) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("The initial capacity ");
            sb.append(i2);
            sb.append(" must be between one (inclusive) and ");
            sb.append((int) (((float) i3) * f));
            sb.append(" (exclusive).");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f153183j = buas;
        this.f153174a = i;
        int min = Math.min(i2, i);
        this.f153175b = min;
        this.f153176c = f;
        if (byteBuffer == null) {
            mo72609k(min);
            return;
        }
        this.f153177d = byteBuffer.getInt();
        this.f153178e = byteBuffer.getInt();
        this.f153179f = byteBuffer.getInt();
        this.f153180g = byteBuffer.getInt();
        this.f153181h = byteBuffer.getInt();
        this.f153182i = byteBuffer.getInt();
        mo72590a(byteBuffer);
        this.f153183j.mo72481a(this.f153179f);
    }

    /* renamed from: a */
    public abstract int mo72587a(int i);

    /* renamed from: a */
    public final int mo72603a(int i, boolean z) {
        if (z) {
            i = mo72607i(i);
        }
        mo72602h(i);
        mo72601g(i);
        int i2 = this.f153181h;
        if (i2 != this.f153182i) {
            this.f153181h = mo72596d(i2);
        }
        this.f153177d++;
        return i;
    }

    /* renamed from: a */
    public abstract void mo72588a();

    /* renamed from: a */
    public abstract void mo72589a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo72590a(ByteBuffer byteBuffer);

    /* renamed from: b */
    public abstract int mo72591b();

    /* renamed from: b */
    public abstract int mo72592b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo72604b(int i, int i2) {
        int i3 = this.f153181h;
        int i4 = this.f153180g;
        mo72595c();
        this.f153183j.mo72480a();
        mo72609k(i);
        int i5 = -1;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i3 != i2) {
                this.f153183j.mo72482b(i3);
            } else {
                i5 = this.f153183j.mo72482b(i3);
            }
            i3 = mo72600f(i3);
        }
        mo72597d();
        this.f153183j.mo72483b();
        this.f153177d++;
        return i5;
    }

    /* renamed from: b */
    public abstract void mo72593b(ByteBuffer byteBuffer);

    /* renamed from: c */
    public abstract int mo72594c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo72595c();

    /* renamed from: d */
    public abstract int mo72596d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo72597d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo72598e();

    /* renamed from: e */
    public abstract void mo72599e(int i);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo72600f(int i);

    /* renamed from: f */
    public final boolean mo72605f() {
        return this.f153180g == 0;
    }

    /* renamed from: g */
    public final int mo72606g() {
        if (mo72605f()) {
            return this.f153181h;
        }
        int i = this.f153180g;
        int i2 = this.f153179f;
        if (i == i2 && i != this.f153174a) {
            mo72604b(i2 + i2, -1);
        }
        int i3 = this.f153181h;
        if (this.f153180g == this.f153179f) {
            mo72602h(i3);
            mo72601g(i3);
            this.f153183j.mo72586d(i3);
        } else {
            i3 = mo72594c(i3);
            this.f153181h = i3;
        }
        mo72599e(i3);
        this.f153177d++;
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo72601g(int i);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo72602h(int i);

    /* renamed from: i */
    public final int mo72607i(int i) {
        int i2 = this.f153180g;
        int i3 = this.f153179f;
        return (i2 != i3 / 4 || i3 == this.f153175b) ? i : mo72604b(i3 / 2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo72608j(int i) {
        int i2 = this.f153178e;
        return ((i % i2) + i2) % i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo72609k(int i) {
        this.f153180g = 0;
        int max = Math.max(Math.min(i, this.f153174a), this.f153175b);
        this.f153179f = max;
        this.f153183j.mo72481a(max);
        this.f153178e = (int) (((float) this.f153179f) / this.f153176c);
        this.f153181h = 0;
        this.f153182i = 0;
        mo72598e();
        this.f153177d++;
    }
}

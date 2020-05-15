package p000;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;

/* renamed from: btzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btzl extends buaq {

    /* renamed from: a */
    public long[] f153122a;

    private btzl(buat buat) {
        this.f153165d = new btzk(this, buat);
    }

    /* renamed from: a */
    public static btzi m119052a(int i, buat buat) {
        return new btzi(new btzl(buat), i);
    }

    /* renamed from: d */
    public static int m119053d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: f */
    public static btzi m119054f() {
        return m119052a(128, (buat) null);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return mo72487a(((Long) obj).longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final byte mo72491b() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo72495c() {
        return this.f153122a.length * 8;
    }

    public final boolean remove(Object obj) {
        int c;
        if (!(obj instanceof Long) || (c = mo72496c(((Long) obj).longValue())) == -1) {
            return false;
        }
        this.f153165d.mo72586d(c);
        return true;
    }

    /* renamed from: b */
    public final int mo72492b(long j) {
        int b = mo72493b(j, true);
        if (b != -1) {
            return b;
        }
        int g = this.f153164c.mo72606g();
        this.f153164c.mo72589a(g, m119053d(j));
        this.f153122a[g] = j;
        return g ^ -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buav.a(int, boolean):int
     arg types: [int, int]
     candidates:
      buav.a(int, int):void
      buav.a(int, boolean):int */
    /* renamed from: c */
    public final int mo72496c(long j) {
        int b = mo72493b(j, false);
        if (b != -1) {
            return this.f153164c.mo72603a(b, true);
        }
        return -1;
    }

    /* renamed from: a */
    public final btzj iterator() {
        return new btzj(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72486a(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.f153122a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    /* renamed from: b */
    public final int mo72493b(long j, boolean z) {
        if (!isEmpty()) {
            int a = this.f153164c.mo72587a(m119053d(j));
            while (a != -1) {
                if (j != this.f153122a[a]) {
                    a = this.f153164c.mo72592b(a);
                } else {
                    if (z) {
                        this.f153164c.mo72599e(a);
                    }
                    return a;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean mo72487a(long j) {
        return mo72492b(j) < 0;
    }

    /* renamed from: a */
    public final boolean mo72488a(long j, boolean z) {
        return mo72493b(j, z) != -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: btzl.a(long, boolean):boolean
     arg types: [long, int]
     candidates:
      btzl.a(int, buat):btzi
      buaq.a(buaq, java.nio.ByteBuffer):void
      btzl.a(long, boolean):boolean */
    /* renamed from: a */
    public final boolean mo72489a(Object obj) {
        if (obj instanceof Long) {
            return mo72488a(((Long) obj).longValue(), false);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72494b(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.f153122a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }
}

package p000;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;

/* renamed from: bujt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bujt extends buaq {

    /* renamed from: a */
    public long[] f154049a;

    private bujt(buat buat) {
        this.f153165d = new bujs(this, buat);
    }

    /* renamed from: a */
    public static bujq m119651a(int i) {
        return m119652a(i, (buat) null);
    }

    /* renamed from: a */
    public static boolean m119654a(long j) {
        return j >= 0 && j <= 281474976710655L;
    }

    /* renamed from: b */
    public static int m119655b(long j) {
        long c = m119656c(j);
        return (int) (c ^ (c >>> 32));
    }

    /* renamed from: c */
    public static long m119656c(long j) {
        return j & 281474976710655L;
    }

    /* renamed from: d */
    public static bujt m119657d(ByteBuffer byteBuffer) {
        return m119653a(byteBuffer, (buat) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bujt.a(long, short):boolean
     arg types: [long, int]
     candidates:
      bujt.a(int, buat):bujq
      bujt.a(java.nio.ByteBuffer, buat):bujt
      bujt.a(long, boolean):boolean
      buaq.a(buaq, java.nio.ByteBuffer):void
      bujt.a(long, short):boolean */
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return mo72740a(((Long) obj).longValue(), (short) 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final byte mo72491b() {
        return 1;
    }

    @Deprecated
    public final boolean contains(Object obj) {
        return mo72489a(obj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bujt.b(long, boolean):int
     arg types: [long, int]
     candidates:
      bujt.b(long, short):int
      bujt.b(long, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buav.a(int, boolean):int
     arg types: [int, int]
     candidates:
      buav.a(int, int):void
      buav.a(int, boolean):int */
    @Deprecated
    public final boolean remove(Object obj) {
        int i;
        int b;
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (!m119654a(longValue) || (b = mo72743b(longValue, false)) == -1) {
                i = -1;
            } else {
                i = this.f153164c.mo72603a(b, true);
            }
            if (i != -1) {
                this.f153165d.mo72586d(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static bujq m119652a(int i, buat buat) {
        return new bujq(new bujt(buat), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo72495c() {
        return this.f154049a.length * 8;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bujt.b(long, boolean):int
     arg types: [long, int]
     candidates:
      bujt.b(long, short):int
      bujt.b(long, boolean):int */
    /* renamed from: d */
    public final int mo72745d(long j) {
        int b = mo72743b(m119656c(j), true);
        if (b != -1) {
            this.f154049a[b] = j;
            return b;
        }
        int g = this.f153164c.mo72606g();
        this.f153164c.mo72589a(g, m119655b(j));
        this.f154049a[g] = j;
        return g ^ -1;
    }

    /* renamed from: b */
    public final int mo72742b(long j, short s) {
        if (m119654a(j)) {
            return mo72745d(j + (((long) s) << 48));
        }
        throw new IllegalArgumentException("Specified AP ID is not valid.");
    }

    /* renamed from: a */
    public static bujt m119653a(ByteBuffer byteBuffer, buat buat) {
        bujt bujt = new bujt(buat);
        buaq.m119173a(bujt, byteBuffer);
        return bujt;
    }

    /* renamed from: b */
    public final int mo72743b(long j, boolean z) {
        if (!isEmpty() && m119654a(j)) {
            int a = this.f153164c.mo72587a(m119655b(j));
            while (a != -1) {
                if (j != m119656c(this.f154049a[a])) {
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
    public final bujr iterator() {
        return new bujr(this);
    }

    /* renamed from: a */
    public final void mo72739a(bujt bujt) {
        clear();
        if (bujt != null) {
            bujr a = bujt.iterator();
            while (a.hasNext()) {
                a.mo72576c();
                mo72740a(a.mo72736a(), a.mo72737f());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72486a(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.f154049a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    /* renamed from: b */
    public final short mo72744b(int i) {
        return (short) ((int) (this.f154049a[i] >>> 48));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72494b(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.f154049a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    /* renamed from: a */
    public final boolean mo72740a(long j, short s) {
        return mo72742b(j, s) < 0;
    }

    /* renamed from: a */
    public final boolean mo72741a(long j, boolean z) {
        return mo72743b(j, z) != -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bujt.a(long, boolean):boolean
     arg types: [long, int]
     candidates:
      bujt.a(int, buat):bujq
      bujt.a(java.nio.ByteBuffer, buat):bujt
      bujt.a(long, short):boolean
      buaq.a(buaq, java.nio.ByteBuffer):void
      bujt.a(long, boolean):boolean */
    @Deprecated
    /* renamed from: a */
    public final boolean mo72489a(Object obj) {
        if (obj instanceof Long) {
            return mo72741a(((Long) obj).longValue(), false);
        }
        return false;
    }
}

package p000;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: buks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buks extends buaq {

    /* renamed from: a */
    public short[] f154103a;

    private buks(buat buat) {
        this.f153165d = new bukr(this, buat);
    }

    /* renamed from: a */
    public static bukp m119761a(buat buat) {
        return new bukp(new buks(buat));
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return mo72792a(((Short) obj).shortValue()) < 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final byte mo72491b() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo72495c() {
        int length = this.f154103a.length;
        return length + length;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buks.a(short, boolean):int
     arg types: [short, int]
     candidates:
      buks.a(java.nio.ByteBuffer, buat):buks
      buaq.a(buaq, java.nio.ByteBuffer):void
      buks.a(short, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buav.a(int, boolean):int
     arg types: [int, int]
     candidates:
      buav.a(int, int):void
      buav.a(int, boolean):int */
    @Deprecated
    public final boolean remove(Object obj) {
        int i;
        if (obj instanceof Short) {
            int a = mo72793a(((Short) obj).shortValue(), false);
            if (a != -1) {
                i = this.f153164c.mo72603a(a, true);
            } else {
                i = -1;
            }
            if (i != -1) {
                this.f153165d.mo72586d(i);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72494b(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.f154103a);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }

    /* renamed from: a */
    public static buks m119762a(ByteBuffer byteBuffer, buat buat) {
        buks buks = new buks(buat);
        buaq.m119173a(buks, byteBuffer);
        return buks;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buks.a(short, boolean):int
     arg types: [short, int]
     candidates:
      buks.a(java.nio.ByteBuffer, buat):buks
      buaq.a(buaq, java.nio.ByteBuffer):void
      buks.a(short, boolean):int */
    /* renamed from: a */
    public final int mo72792a(short s) {
        int a = mo72793a(s, true);
        if (a != -1) {
            return a;
        }
        int g = this.f153164c.mo72606g();
        this.f153164c.mo72589a(g, s);
        this.f154103a[g] = s;
        return g ^ -1;
    }

    /* renamed from: b */
    public final boolean mo72795b(short s) {
        return mo72793a(s, false) != -1;
    }

    /* renamed from: a */
    public final int mo72793a(short s, boolean z) {
        if (!isEmpty()) {
            int a = this.f153164c.mo72587a(s);
            while (a != -1) {
                if (s != this.f154103a[a]) {
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
    public final bukq iterator() {
        return new bukq(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72486a(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.f154103a);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo72489a(Object obj) {
        if (obj instanceof Short) {
            return mo72795b(((Short) obj).shortValue());
        }
        return false;
    }
}

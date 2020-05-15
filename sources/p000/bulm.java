package p000;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: bulm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bulm extends buaq {

    /* renamed from: a */
    public int[] f154159a;

    private bulm(buat buat) {
        this.f153165d = new bull(this, buat);
    }

    /* renamed from: a */
    public static bulj m119870a(int i, buat buat) {
        return new bulj(new bulm(buat), i);
    }

    /* renamed from: b */
    public static int m119872b(short s, short s2) {
        return (s << 16) | ((char) s2);
    }

    /* renamed from: b */
    public static short m119873b(int i) {
        return (short) (i >> 16);
    }

    /* renamed from: c */
    public static short m119874c(int i) {
        return (short) ((char) i);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return mo72814a(((Integer) obj).intValue()) < 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final byte mo72491b() {
        return 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bulm.a(int, boolean):int
     arg types: [int, int]
     candidates:
      bulm.a(int, buat):bulj
      bulm.a(java.nio.ByteBuffer, buat):bulm
      bulm.a(short, short):int
      buaq.a(buaq, java.nio.ByteBuffer):void
      bulm.a(int, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buav.a(int, boolean):int
     arg types: [int, int]
     candidates:
      buav.a(int, int):void
      buav.a(int, boolean):int */
    @Deprecated
    public final boolean remove(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int a = mo72815a(((Integer) obj).intValue(), false);
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
    /* renamed from: c */
    public final int mo72495c() {
        return this.f154159a.length * 4;
    }

    /* renamed from: a */
    public static bulm m119871a(ByteBuffer byteBuffer, buat buat) {
        bulm bulm = new bulm(buat);
        buaq.m119173a(bulm, byteBuffer);
        return bulm;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bulm.a(int, boolean):int
     arg types: [int, int]
     candidates:
      bulm.a(int, buat):bulj
      bulm.a(java.nio.ByteBuffer, buat):bulm
      bulm.a(short, short):int
      buaq.a(buaq, java.nio.ByteBuffer):void
      bulm.a(int, boolean):int */
    /* renamed from: a */
    public final int mo72814a(int i) {
        int a = mo72815a(i, true);
        if (a != -1) {
            return a;
        }
        int g = this.f153164c.mo72606g();
        this.f153164c.mo72589a(g, i);
        this.f154159a[g] = i;
        return g ^ -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72494b(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.f154159a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    /* renamed from: a */
    public final int mo72815a(int i, boolean z) {
        if (!isEmpty()) {
            int a = this.f153164c.mo72587a(i);
            while (a != -1) {
                if (i != this.f154159a[a]) {
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
    public final int mo72816a(short s, short s2) {
        return mo72814a(m119872b(s, s2));
    }

    /* renamed from: a */
    public final bulk iterator() {
        return new bulk(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72486a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.f154159a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bulm.a(int, boolean):int
     arg types: [int, int]
     candidates:
      bulm.a(int, buat):bulj
      bulm.a(java.nio.ByteBuffer, buat):bulm
      bulm.a(short, short):int
      buaq.a(buaq, java.nio.ByteBuffer):void
      bulm.a(int, boolean):int */
    @Deprecated
    /* renamed from: a */
    public final boolean mo72489a(Object obj) {
        if (!(obj instanceof Integer) || mo72815a(((Integer) obj).intValue(), false) == -1) {
            return false;
        }
        return true;
    }
}

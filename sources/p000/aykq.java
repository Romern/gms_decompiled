package p000;

import java.nio.ByteBuffer;

/* renamed from: aykq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykq {

    /* renamed from: a */
    public int f97869a = 0;

    /* renamed from: b */
    private final aykn f97870b;

    /* renamed from: c */
    private aykp f97871c = null;

    public aykq(aykn aykn) {
        this.f97870b = aykn;
    }

    /* renamed from: a */
    private static int m84195a(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* renamed from: b */
    public final byte[] mo54068b() {
        aykp aykp = this.f97871c;
        if (aykp == null || this.f97870b.f97857a == 0) {
            return null;
        }
        try {
            this.f97869a = aykp.mo54063a();
            while (true) {
                try {
                    int i = this.f97869a + mo54071e().f97866c;
                    if (i > this.f97870b.f97857a) {
                        break;
                    }
                    this.f97869a = i;
                } catch (IndexOutOfBoundsException e) {
                }
            }
            int a = this.f97869a - this.f97871c.mo54063a();
            if (a != 0) {
                aykp aykp2 = this.f97871c;
                ByteBuffer a2 = m84196a((aykp2.f97865b << 3) + aykp2.f97864a);
                ByteBuffer a3 = m84196a(a);
                byte[] bArr = new byte[(a2.position() + a3.position() + a)];
                System.arraycopy(a2.array(), 0, bArr, 0, a2.position());
                System.arraycopy(a3.array(), 0, bArr, a2.position(), a3.position());
                this.f97870b.mo54058a(this.f97871c.mo54063a(), bArr, a2.position() + a3.position(), a);
                int i2 = this.f97871c.f97868e - a;
                if (i2 > 0) {
                    ByteBuffer a4 = m84196a(i2);
                    int position = this.f97869a - (a2.position() + a4.position());
                    this.f97869a = position;
                    this.f97870b.mo54057a(position, a2.array(), a2.position());
                    this.f97870b.mo54057a(this.f97869a + a2.position(), a4.array(), a4.position());
                }
                mo54070d();
                this.f97870b.mo54059a();
                return bArr;
            }
            this.f97869a = this.f97871c.f97867d;
            return null;
        } catch (ayko | NoSuchMethodException e2) {
            this.f97869a = this.f97871c.f97867d;
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo54069c() {
        aykp aykp = this.f97871c;
        if (aykp == null || this.f97870b.f97857a == 0) {
            return false;
        }
        try {
            int i = aykp.f97866c;
            do {
                int i2 = this.f97870b.f97857a;
                int i3 = this.f97869a;
                int i4 = i2 - i3;
                this.f97869a = i3 + Math.min(i, i4);
                mo54070d();
                if (i > i4) {
                    if (!this.f97870b.mo54059a()) {
                        throw new ayko("Next proto field needs more data but reaches EOF");
                    }
                }
                i -= i4;
            } while (i > 0);
            return true;
        } catch (IndexOutOfBoundsException e) {
            throw new ayko("Failed to skip a field");
        }
    }

    /* renamed from: d */
    public final void mo54070d() {
        aykn aykn = this.f97870b;
        int i = this.f97869a;
        int i2 = aykn.f97857a;
        if (i > i2) {
            i = i2;
        }
        aykn.f97859c = aykn.mo54061b(i);
        aykn.f97857a -= i;
        this.f97869a = 0;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final aykp mo54071e() {
        int i;
        int i2 = this.f97869a;
        try {
            int a = m84195a(mo54072f());
            int i3 = a >> 3;
            int i4 = a & 7;
            if (i4 == 0) {
                mo54072f();
                i = 0;
            } else if (i4 == 1) {
                this.f97869a += 8;
                i = 0;
            } else if (i4 == 2) {
                int a2 = m84195a(mo54072f());
                if (a2 >= 0) {
                    this.f97869a += a2;
                    i = a2;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Negative child size ");
                    sb.append(a2);
                    throw new ayko(sb.toString());
                }
            } else if (i4 == 5) {
                this.f97869a += 4;
                i = 0;
            } else {
                StringBuilder sb2 = new StringBuilder(43);
                sb2.append("The wire type ");
                sb2.append(i4);
                sb2.append(" is not supported!");
                throw new ayko(sb2.toString());
            }
            aykp aykp = new aykp(i4, i3, this.f97869a - i2, i2, i);
            this.f97869a = i2;
            return aykp;
        } catch (Throwable th) {
            this.f97869a = i2;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final long mo54072f() {
        long j = 0;
        int i = 0;
        while (i <= 63) {
            byte a = this.f97870b.mo54056a(this.f97869a);
            this.f97869a++;
            j += (((long) a) & 127) << i;
            i += 7;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw new ayko("Varint is larger than 64 bits, bad data");
    }

    /* renamed from: a */
    static ByteBuffer m84196a(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        while ((i & -128) != 0) {
            allocate.put((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        allocate.put((byte) i);
        return allocate;
    }

    /* renamed from: a */
    public final aykp mo54067a() {
        if (this.f97869a != this.f97870b.f97857a) {
            try {
                aykp e = mo54071e();
                this.f97871c = e;
                int i = this.f97869a + e.f97866c;
                if (i > this.f97870b.f97857a) {
                    return null;
                }
                this.f97869a = i;
                return e;
            } catch (IndexOutOfBoundsException e2) {
            }
        }
        return null;
    }
}

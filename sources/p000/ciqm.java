package p000;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: ciqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqm implements cipw {

    /* renamed from: a */
    public final cipu f191247a = new cipu();

    /* renamed from: b */
    public final ciqr f191248b;

    /* renamed from: c */
    public boolean f191249c;

    public ciqm(ciqr ciqr) {
        if (ciqr != null) {
            this.f191248b = ciqr;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: a */
    public final long mo86379a(byte b) {
        if (!this.f191249c) {
            long j = 0;
            while (j < Long.MAX_VALUE) {
                long a = this.f191247a.mo86281a(b, j);
                if (a != -1) {
                    return a;
                }
                cipu cipu = this.f191247a;
                long j2 = cipu.f191213b;
                if (j2 >= Long.MAX_VALUE || this.f191248b.mo74995c(cipu, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public final boolean mo86295b() {
        if (!this.f191249c) {
            return this.f191247a.mo86295b() && this.f191248b.mo74995c(this.f191247a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f191249c) {
            cipu cipu2 = this.f191247a;
            if (cipu2.f191213b == 0 && this.f191248b.mo74995c(cipu2, 8192) == -1) {
                return -1;
            }
            return this.f191247a.mo74995c(cipu, Math.min(j, this.f191247a.f191213b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void close() {
        if (!this.f191249c) {
            this.f191249c = true;
            this.f191248b.close();
            this.f191247a.mo86328n();
        }
    }

    /* renamed from: d */
    public final cipx mo86303d(long j) {
        mo86285a(j);
        return new cipx(this.f191247a.mo86314g(j));
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f191248b.mo74997df();
    }

    /* renamed from: e */
    public final byte mo86305e() {
        mo86285a(1);
        return this.f191247a.mo86305e();
    }

    /* renamed from: f */
    public final short mo86310f() {
        mo86285a(2);
        return this.f191247a.mo86310f();
    }

    /* renamed from: g */
    public final int mo86312g() {
        mo86285a(4);
        return this.f191247a.mo86312g();
    }

    /* renamed from: h */
    public final void mo86317h(long j) {
        if (!this.f191249c) {
            while (j > 0) {
                cipu cipu = this.f191247a;
                if (cipu.f191213b == 0 && this.f191248b.mo74995c(cipu, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f191247a.f191213b);
                this.f191247a.mo86317h(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: i */
    public final int mo86319i() {
        mo86285a(4);
        return ciqu.m150903a(this.f191247a.mo86312g());
    }

    public final boolean isOpen() {
        return !this.f191249c;
    }

    /* renamed from: q */
    public final long mo86331q() {
        return mo86379a((byte) 0);
    }

    public final int read(ByteBuffer byteBuffer) {
        cipu cipu = this.f191247a;
        if (cipu.f191213b == 0 && this.f191248b.mo74995c(cipu, 8192) == -1) {
            return -1;
        }
        return this.f191247a.read(byteBuffer);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191248b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("buffer(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public final boolean mo86296b(long j) {
        cipu cipu;
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f191249c) {
            do {
                cipu = this.f191247a;
                if (cipu.f191213b >= j) {
                    return true;
                }
            } while (this.f191248b.mo74995c(cipu, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: g */
    public final byte[] mo86314g(long j) {
        mo86285a(j);
        return this.f191247a.mo86314g(j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: l */
    public final String mo86326l() {
        long a = mo86379a((byte) 10);
        if (a != -1) {
            return this.f191247a.mo86309f(a);
        }
        cipu cipu = new cipu();
        cipu cipu2 = this.f191247a;
        cipu2.mo86291b(cipu, Math.min(32L, cipu2.f191213b));
        long min = Math.min(this.f191247a.f191213b, Long.MAX_VALUE);
        String c = cipu.mo86322j().mo86342c();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 50);
        sb.append("\\n not found: limit=");
        sb.append(min);
        sb.append(" content=");
        sb.append(c);
        sb.append(8230);
        throw new EOFException(sb.toString());
    }

    /* renamed from: a */
    public final long mo86282a(cipx cipx) {
        long j;
        long j2;
        int i;
        cipx cipx2 = cipx;
        if (!this.f191249c) {
            long j3 = 0;
            long j4 = 0;
            while (true) {
                cipu cipu = this.f191247a;
                if (j4 >= j3) {
                    ciqn ciqn = cipu.f191212a;
                    if (ciqn != null) {
                        long j5 = cipu.f191213b;
                        if (j5 - j4 >= j4) {
                            j2 = j3;
                            while (true) {
                                long j6 = ((long) (ciqn.f191252c - ciqn.f191251b)) + j2;
                                if (j6 >= j4) {
                                    break;
                                }
                                ciqn = ciqn.f191255f;
                                j2 = j6;
                            }
                        } else {
                            while (j2 > j4) {
                                ciqn = ciqn.f191256g;
                                j5 = j2 - ((long) (ciqn.f191252c - ciqn.f191251b));
                            }
                        }
                        if (cipx.mo86345e() != 2) {
                            byte[] bArr = cipx2.f191216c;
                            long j7 = j4;
                            while (true) {
                                if (j2 >= cipu.f191213b) {
                                    j = -1;
                                    break;
                                }
                                byte[] bArr2 = ciqn.f191250a;
                                int i2 = ciqn.f191252c;
                                for (int i3 = (int) ((((long) ciqn.f191251b) + j7) - j2); i3 < i2; i3++) {
                                    byte b = bArr2[i3];
                                    for (byte b2 : bArr) {
                                        if (b == b2) {
                                            j = ((long) (i3 - ciqn.f191251b)) + j2;
                                            break;
                                        }
                                    }
                                }
                                j7 = ((long) (ciqn.f191252c - ciqn.f191251b)) + j2;
                                ciqn = ciqn.f191255f;
                                j2 = j7;
                            }
                        } else {
                            byte a = cipx2.mo86335a(0);
                            byte a2 = cipx2.mo86335a(1);
                            long j8 = j4;
                            while (true) {
                                if (j2 >= cipu.f191213b) {
                                    j = -1;
                                    break;
                                }
                                byte[] bArr3 = ciqn.f191250a;
                                i = (int) ((((long) ciqn.f191251b) + j8) - j2);
                                int i4 = ciqn.f191252c;
                                while (i < i4) {
                                    byte b3 = bArr3[i];
                                    if (!(b3 == a || b3 == a2)) {
                                        i++;
                                    }
                                }
                                j8 = j2 + ((long) (ciqn.f191252c - ciqn.f191251b));
                                ciqn = ciqn.f191255f;
                                j2 = j8;
                            }
                            j = ((long) (i - ciqn.f191251b)) + j2;
                        }
                    } else {
                        j = -1;
                    }
                    if (j != -1) {
                        return j;
                    }
                    cipu cipu2 = this.f191247a;
                    long j9 = cipu2.f191213b;
                    if (this.f191248b.mo74995c(cipu2, 8192) == -1) {
                        return -1;
                    }
                    j4 = Math.max(j4, j9);
                    j3 = 0;
                } else {
                    throw new IllegalArgumentException("fromIndex < 0");
                }
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: c */
    public final InputStream mo86298c() {
        return new ciql(this);
    }

    /* renamed from: a */
    public final void mo86285a(long j) {
        if (!mo86296b(j)) {
            throw new EOFException();
        }
    }
}

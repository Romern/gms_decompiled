package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: cmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cmr extends FilterInputStream {

    /* renamed from: a */
    private volatile byte[] f7077a;

    /* renamed from: b */
    private int f7078b;

    /* renamed from: c */
    private int f7079c;

    /* renamed from: d */
    private int f7080d = -1;

    /* renamed from: e */
    private int f7081e;

    /* renamed from: f */
    private final cgr f7082f;

    /* renamed from: a */
    private final int m4550a(InputStream inputStream, byte[] bArr) {
        int length;
        int i = this.f7080d;
        if (i != -1) {
            int i2 = this.f7081e;
            int i3 = this.f7079c;
            if (i2 - i < i3) {
                if (i == 0 && i3 > (length = bArr.length) && this.f7078b == length) {
                    int i4 = length + length;
                    if (i4 <= i3) {
                        i3 = i4;
                    }
                    byte[] bArr2 = (byte[]) this.f7082f.mo3870a(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                    this.f7077a = bArr2;
                    this.f7082f.mo3874a(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i5 = this.f7081e - this.f7080d;
                this.f7081e = i5;
                this.f7080d = 0;
                this.f7078b = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f7081e;
                if (read > 0) {
                    i6 += read;
                }
                this.f7078b = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f7080d = -1;
            this.f7081e = 0;
            this.f7078b = read2;
        }
        return read2;
    }

    /* renamed from: c */
    private static IOException m4551c() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f7077a == null || inputStream == null) {
            throw m4551c();
        }
        return (this.f7078b - this.f7081e) + inputStream.available();
    }

    /* renamed from: b */
    public final synchronized void mo3981b() {
        if (this.f7077a != null) {
            this.f7082f.mo3874a(this.f7077a);
            this.f7077a = null;
        }
    }

    public final void close() {
        if (this.f7077a != null) {
            this.f7082f.mo3874a(this.f7077a);
            this.f7077a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void mark(int i) {
        this.f7079c = Math.max(this.f7079c, i);
        this.f7080d = this.f7081e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized int read() {
        byte[] bArr = this.f7077a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw m4551c();
        } else if (this.f7081e >= this.f7078b && m4550a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr != this.f7077a) {
                bArr = this.f7077a;
                if (bArr == null) {
                    throw m4551c();
                }
            }
            int i = this.f7078b;
            int i2 = this.f7081e;
            if (i - i2 <= 0) {
                return -1;
            }
            this.f7081e = i2 + 1;
            return bArr[i2] & 255;
        }
    }

    public final synchronized void reset() {
        if (this.f7077a != null) {
            int i = this.f7080d;
            if (i != -1) {
                this.f7081e = i;
            } else {
                int i2 = this.f7081e;
                int i3 = this.f7079c;
                StringBuilder sb = new StringBuilder(66);
                sb.append("Mark has been invalidated, pos: ");
                sb.append(i2);
                sb.append(" markLimit: ");
                sb.append(i3);
                throw new cmq(sb.toString());
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        return r4;
     */
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f7077a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f7078b;
                int i2 = this.f7081e;
                if (((long) (i - i2)) < j) {
                    long j2 = ((long) i) - ((long) i2);
                    this.f7081e = i;
                    if (this.f7080d != -1) {
                        if (j <= ((long) this.f7079c)) {
                            if (m4550a(inputStream, bArr) != -1) {
                                int i3 = this.f7078b;
                                int i4 = this.f7081e;
                                if (((long) (i3 - i4)) >= j - j2) {
                                    this.f7081e = (int) ((((long) i4) + j) - j2);
                                } else {
                                    this.f7081e = i3;
                                    j2 = (j2 + ((long) i3)) - ((long) i4);
                                }
                            }
                        }
                    }
                    return j2 + inputStream.skip(j - j2);
                }
                this.f7081e = (int) (((long) i2) + j);
            } else {
                throw m4551c();
            }
        } else {
            throw m4551c();
        }
    }

    public cmr(InputStream inputStream, cgr cgr) {
        super(inputStream);
        this.f7082f = cgr;
        this.f7077a = (byte[]) cgr.mo3870a(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x006e, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x007b, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x006d A[EDGE_INSN: B:74:0x006d->B:51:0x006d ?: BREAK  , SYNTHETIC] */
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f7077a;
        if (bArr2 == null) {
            throw m4551c();
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i5 = this.f7081e;
                int i6 = this.f7078b;
                if (i5 >= i6) {
                    i3 = i2;
                } else {
                    int i7 = i6 - i5;
                    if (i7 >= i2) {
                        i7 = i2;
                    }
                    System.arraycopy(bArr2, i5, bArr, i, i7);
                    this.f7081e += i7;
                    if (i7 != i2 && inputStream.available() != 0) {
                        i += i7;
                        i3 = i2 - i7;
                    }
                }
                while (true) {
                    if (this.f7080d == -1) {
                        if (i3 >= bArr2.length) {
                            i4 = inputStream.read(bArr, i, i3);
                            if (i4 == -1) {
                                if (i3 == i2) {
                                    return -1;
                                }
                                return i2 - i3;
                            }
                            i3 -= i4;
                            if (i3 != 0) {
                                if (inputStream.available() == 0) {
                                    break;
                                }
                                i += i4;
                            } else {
                                break;
                            }
                        }
                    }
                    if (m4550a(inputStream, bArr2) != -1) {
                        if (bArr2 != this.f7077a) {
                            bArr2 = this.f7077a;
                            if (bArr2 == null) {
                                throw m4551c();
                            }
                        }
                        int i8 = this.f7078b;
                        int i9 = this.f7081e;
                        i4 = i8 - i9;
                        if (i4 >= i3) {
                            i4 = i3;
                        }
                        System.arraycopy(bArr2, i9, bArr, i, i4);
                        this.f7081e += i4;
                        i3 -= i4;
                        if (i3 != 0) {
                        }
                    } else if (i3 == i2) {
                        return -1;
                    }
                }
                i2 -= i3;
            } else {
                throw m4551c();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo3979a() {
        this.f7079c = this.f7077a.length;
    }
}

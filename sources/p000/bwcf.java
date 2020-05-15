package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bwcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwcf extends InputStream {

    /* renamed from: a */
    protected final InputStream f158812a;

    /* renamed from: b */
    protected bwcd f158813b;

    /* renamed from: c */
    protected int f158814c;

    /* renamed from: d */
    protected final Object f158815d = new Object();

    /* renamed from: e */
    protected volatile boolean f158816e;

    public bwcf(InputStream inputStream, int i) {
        this.f158812a = inputStream;
        this.f158814c = i;
    }

    /* renamed from: a */
    private final int m121744a(byte[] bArr, int i, int i2) {
        int i3 = this.f158814c;
        if (i3 <= 0) {
            return -1;
        }
        try {
            int read = this.f158812a.read(bArr, i, Math.min(i3, i2));
            if (read > 0) {
                this.f158814c -= read;
            }
            if (read > 0 && this.f158814c != 0) {
                return read;
            }
            m121745b();
            return read;
        } catch (IOException e) {
            m121745b();
            throw e;
        }
    }

    /* renamed from: b */
    private final void m121745b() {
        synchronized (this.f158815d) {
            if (!this.f158816e) {
                this.f158816e = true;
                this.f158815d.notifyAll();
                try {
                    this.f158812a.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public final synchronized void close() {
        super.close();
        do {
        } while (read() >= 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0053, code lost:
        if (r2 == 0) goto L_0x0055;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final synchronized int read() {
        byte b;
        bwcd bwcd = this.f158813b;
        b = -1;
        b = -1;
        if (bwcd != null) {
            synchronized (bwcd.f158807a) {
                while (true) {
                    int i = bwcd.f158809c;
                    if (i < 0) {
                        if (bwcd.f158811e) {
                            break;
                        }
                        try {
                            bwcd.f158807a.wait();
                        } catch (InterruptedException e) {
                        }
                    } else {
                        byte[] bArr = bwcd.f158808b;
                        int i2 = i + 1;
                        bwcd.f158809c = i2;
                        byte b2 = bArr[i] & 255;
                        if (i2 == bArr.length) {
                            bwcd.f158809c = 0;
                            i2 = 0;
                        }
                        if (i2 == bwcd.f158810d) {
                            bwcd.f158809c = -1;
                            bwcd.f158810d = 0;
                        }
                        bwcd.f158807a.notifyAll();
                        b = b2;
                    }
                }
            }
        } else if (this.f158814c > 0) {
            try {
                int read = this.f158812a.read();
                if (read >= 0) {
                    int i3 = this.f158814c - 1;
                    this.f158814c = i3;
                }
                m121745b();
                b = read;
            } catch (IOException e2) {
                m121745b();
                throw e2;
            }
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r10.f158814c <= 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r3 = m121744a(r1, 0, 1024);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r3 <= 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r4 = r10.f158813b;
        r5 = r4.f158807a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r3 <= 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7 = r4.f158809c;
        r8 = r4.f158810d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r7 != r8) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.f158807a.notifyAll();
        r4.f158807a.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r7 < 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4.f158809c = 0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r8 >= r7) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        r7 = r7 - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        r7 = r4.f158808b.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        if (r7 > r3) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
        java.lang.System.arraycopy(r1, r6, r4.f158808b, r8, r7);
        r6 = r6 + r7;
        r3 = r3 - r7;
        r8 = r4.f158810d + r7;
        r4.f158810d = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        if (r8 != r4.f158808b.length) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        r4.f158810d = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0069, code lost:
        r4.f158807a.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006e, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0079, code lost:
        throw new java.io.IOException("Premature EOF");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007a, code lost:
        r0 = r10.f158813b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0081, code lost:
        r10.f158813b.mo73452a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0086, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0088, code lost:
        r0 = r10.f158813b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r1 = new byte[1024];
     */
    /* renamed from: a */
    public final void mo73453a() {
        bwcd bwcd;
        synchronized (this) {
            int i = this.f158814c;
            if (i != 0 && this.f158813b == null) {
                this.f158813b = new bwcd(Math.min((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, i));
            } else {
                return;
            }
        }
        bwcd.mo73452a();
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        bwcd bwcd = this.f158813b;
        i3 = -1;
        if (bwcd == null) {
            i3 = m121744a(bArr, i, i2);
        } else if (i2 != 0) {
            synchronized (bwcd.f158807a) {
                while (true) {
                    int i6 = bwcd.f158809c;
                    if (i6 < 0) {
                        if (bwcd.f158811e) {
                            break;
                        }
                        try {
                            bwcd.f158807a.wait();
                        } catch (InterruptedException e) {
                        }
                    } else {
                        int i7 = bwcd.f158810d;
                        if (i6 < i7) {
                            i5 = i7 - i6;
                            i4 = 0;
                        } else {
                            byte[] bArr2 = bwcd.f158808b;
                            i4 = bArr2.length - i6;
                            if (i4 >= i2) {
                                i5 = i4;
                                i4 = 0;
                            } else {
                                System.arraycopy(bArr2, i6, bArr, i, i4);
                                i += i4;
                                i2 -= i4;
                                i5 = bwcd.f158810d;
                                bwcd.f158809c = 0;
                                i6 = 0;
                            }
                        }
                        if (i5 <= i2) {
                            i2 = i5;
                        }
                        System.arraycopy(bwcd.f158808b, i6, bArr, i, i2);
                        int i8 = i4 + i2;
                        int i9 = bwcd.f158809c + i2;
                        bwcd.f158809c = i9;
                        if (i9 == bwcd.f158808b.length) {
                            bwcd.f158809c = 0;
                            i9 = 0;
                        }
                        if (i9 == bwcd.f158810d) {
                            bwcd.f158809c = -1;
                            bwcd.f158810d = 0;
                        }
                        bwcd.f158807a.notifyAll();
                        i3 = i8;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        return i3;
    }
}

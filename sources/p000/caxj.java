package p000;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: caxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caxj extends caxh {

    /* renamed from: d */
    final /* synthetic */ caxn f176313d;

    /* renamed from: e */
    private long f176314e = -1;

    /* renamed from: f */
    private boolean f176315f = true;

    /* renamed from: g */
    private final caxt f176316g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public caxj(caxn caxn, caxt caxt) {
        super(caxn);
        this.f176313d = caxn;
        this.f176316g = caxt;
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        long j2;
        byte b;
        byte b2;
        int i;
        byte b3;
        int i2;
        long j3 = j;
        if (j3 < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f176308b) {
            throw new IllegalStateException("closed");
        } else if (!this.f176315f) {
            return -1;
        } else {
            long j4 = this.f176314e;
            if (j4 == 0 || j4 == -1) {
                if (j4 != -1) {
                    this.f176313d.f176326b.mo86326l();
                }
                try {
                    cipw cipw = this.f176313d.f176326b;
                    ((ciqm) cipw).mo86285a(1);
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        b = 97;
                        b2 = 48;
                        if (!((ciqm) cipw).mo86296b((long) i4)) {
                            break;
                        }
                        byte c = ((ciqm) cipw).f191247a.mo86297c((long) i3);
                        if (c < 48 || c > 57) {
                            if (c < 97 || c > 102) {
                                if (c < 65 || c > 70) {
                                    if (i3 == 0) {
                                        throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(c)));
                                    }
                                }
                            }
                        }
                        i3 = i4;
                    }
                    cipu cipu2 = ((ciqm) cipw).f191247a;
                    if (cipu2.f191213b != 0) {
                        int i5 = 0;
                        long j5 = 0;
                        boolean z = false;
                        while (true) {
                            ciqn ciqn = cipu2.f191212a;
                            byte[] bArr = ciqn.f191250a;
                            int i6 = ciqn.f191251b;
                            int i7 = ciqn.f191252c;
                            while (true) {
                                if (i6 >= i7) {
                                    i = i7;
                                    break;
                                }
                                b3 = bArr[i6];
                                if (b3 < b2 || b3 > 57) {
                                    if (b3 >= b) {
                                        if (b3 <= 102) {
                                            i2 = b3 - 87;
                                        }
                                    }
                                    if (b3 < 65 || b3 > 70) {
                                        i = i7;
                                    } else {
                                        i2 = b3 - 55;
                                    }
                                } else {
                                    i2 = b3 - 48;
                                }
                                if ((j5 & -1152921504606846976L) != 0) {
                                    cipu cipu3 = new cipu();
                                    cipu3.mo86323j(j5);
                                    cipu3.mo86316h((int) b3);
                                    String valueOf = String.valueOf(cipu3.mo86324k());
                                    throw new NumberFormatException(valueOf.length() == 0 ? new String("Number too large: ") : "Number too large: ".concat(valueOf));
                                }
                                j5 = (j5 << 4) | ((long) i2);
                                i6++;
                                i5++;
                                i7 = i7;
                                b = 97;
                                b2 = 48;
                            }
                            i = i7;
                            if (i5 != 0) {
                                z = true;
                                if (i6 == i) {
                                    cipu2.f191212a = ciqn.mo86386b();
                                    ciqo.m150875a(ciqn);
                                } else {
                                    ciqn.f191251b = i6;
                                }
                                if (!z) {
                                    if (cipu2.f191212a == null) {
                                        break;
                                    }
                                    b = 97;
                                    b2 = 48;
                                } else {
                                    break;
                                }
                            } else {
                                String valueOf2 = String.valueOf(Integer.toHexString(b3));
                                throw new NumberFormatException(valueOf2.length() == 0 ? new String("Expected leading [0-9a-fA-F] character but was 0x") : "Expected leading [0-9a-fA-F] character but was 0x".concat(valueOf2));
                            }
                        }
                        cipu2.f191213b -= (long) i5;
                        this.f176314e = j5;
                        String trim = this.f176313d.f176326b.mo86326l().trim();
                        if (this.f176314e < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            long j6 = this.f176314e;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(trim).length() + 74);
                            sb2.append("expected chunk size and optional extensions but was \"");
                            sb2.append(j6);
                            sb2.append(trim);
                            sb2.append("\"");
                            throw new ProtocolException(sb2.toString());
                        }
                        if (this.f176314e == 0) {
                            this.f176315f = false;
                            this.f176316g.mo75056a(this.f176313d.mo75053e());
                            mo75040b();
                        }
                        if (!this.f176315f) {
                            return -1;
                        }
                        j2 = -1;
                    } else {
                        throw new IllegalStateException("size == 0");
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            } else {
                j2 = -1;
            }
            long c2 = this.f176313d.f176326b.mo74995c(cipu, Math.min(j3, this.f176314e));
            if (c2 != j2) {
                this.f176314e -= c2;
                return c2;
            }
            mo75041c();
            throw new ProtocolException("unexpected end of stream");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cavk.a(ciqr, java.util.concurrent.TimeUnit):boolean
     arg types: [caxj, java.util.concurrent.TimeUnit]
     candidates:
      cavk.a(long, long):void
      cavk.a(java.io.Closeable, java.io.Closeable):void
      cavk.a(java.lang.Object, java.lang.Object):boolean
      cavk.a(java.lang.String[], java.lang.String):boolean
      cavk.a(ciqr, java.util.concurrent.TimeUnit):boolean */
    public final void close() {
        if (!this.f176308b) {
            if (this.f176315f && !cavk.m127314a((ciqr) this, TimeUnit.MILLISECONDS)) {
                mo75041c();
            }
            this.f176308b = true;
        }
    }
}

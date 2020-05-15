package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* renamed from: bypy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bypy {

    /* renamed from: a */
    public final ByteArrayInputStream f167364a;

    /* renamed from: b */
    public final byqa f167365b = new byqa(this.f167364a);

    /* renamed from: c */
    private final int f167366c;

    public bypy(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        this.f167364a = byteArrayInputStream;
        this.f167366c = byteArrayInputStream.available();
    }

    /* renamed from: a */
    private static final void m125097a(byte b, long j) {
        switch (b) {
            case 24:
                if (j < 24) {
                    StringBuilder sb = new StringBuilder(111);
                    sb.append("Integer value ");
                    sb.append(j);
                    sb.append(" after add info could have been represented in 0 additional bytes, but used 1");
                    throw new bypm(sb.toString());
                }
                return;
            case 25:
                if (j < 256) {
                    StringBuilder sb2 = new StringBuilder(113);
                    sb2.append("Integer value ");
                    sb2.append(j);
                    sb2.append(" after add info could have been represented in 0-1 additional bytes, but used 2");
                    throw new bypm(sb2.toString());
                }
                return;
            case 26:
                if (j < 65536) {
                    StringBuilder sb3 = new StringBuilder(113);
                    sb3.append("Integer value ");
                    sb3.append(j);
                    sb3.append(" after add info could have been represented in 0-2 additional bytes, but used 4");
                    throw new bypm(sb3.toString());
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    StringBuilder sb4 = new StringBuilder(113);
                    sb4.append("Integer value ");
                    sb4.append(j);
                    sb4.append(" after add info could have been represented in 0-4 additional bytes, but used 8");
                    throw new bypm(sb4.toString());
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final bypx mo74449a() {
        boolean z;
        long j;
        if (this.f167364a.available() != 0) {
            try {
                bypz a = this.f167365b.mo74451a();
                byte b = a.f167368b;
                byte b2 = a.f167367a;
                boolean z2 = true;
                if (b2 == Byte.MIN_VALUE) {
                    byqa byqa = this.f167365b;
                    byqa.mo74452a(Byte.MIN_VALUE);
                    byqa.mo74456d();
                    long c = byqa.mo74454c();
                    if (c >= 0) {
                        if (c > 0) {
                            byqa.f167370b.mo74462b(c);
                        }
                        if (c <= ((long) this.f167366c)) {
                            m125097a(b, c);
                            bypx[] bypxArr = new bypx[((int) c)];
                            for (int i = 0; ((long) i) < c; i++) {
                                bypxArr[i] = mo74449a();
                            }
                            return bypx.m125080a(bypxArr);
                        }
                        throw new bypq("Refusing to parse an array larger than remaining bytes");
                    }
                    throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
                } else if (b2 == -96) {
                    byqa byqa2 = this.f167365b;
                    byqa2.mo74452a((byte) -96);
                    byqa2.mo74456d();
                    long c2 = byqa2.mo74454c();
                    if (c2 < 0 || c2 > 4611686018427387903L) {
                        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
                    }
                    if (c2 > 0) {
                        byqa2.f167370b.mo74462b(c2 + c2);
                    }
                    if (c2 <= ((long) this.f167366c)) {
                        m125097a(b, c2);
                        bypt[] byptArr = new bypt[((int) c2)];
                        bypx bypx = null;
                        int i2 = 0;
                        while (((long) i2) < c2) {
                            bypx a2 = mo74449a();
                            if (bypx != null) {
                                if (a2.compareTo(bypx) <= 0) {
                                    throw new bypm(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", bypx.toString(), a2.toString()));
                                }
                            }
                            byptArr[i2] = new bypt(a2, mo74449a());
                            i2++;
                            bypx = a2;
                        }
                        return bypx.m125084a(byptArr);
                    }
                    throw new bypq("Refusing to parse a map larger than remaining bytes");
                } else if (b2 == -64) {
                    throw new bypq("Tags are currently unsupported");
                } else if (b2 == -32) {
                    byqa byqa3 = this.f167365b;
                    byqa3.mo74452a((byte) -32);
                    if (byqa3.f167369a.f167368b <= 24) {
                        int c3 = (int) byqa3.mo74454c();
                        if (c3 == 20) {
                            z2 = false;
                        } else if (c3 != 21) {
                            throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
                        }
                        return bypx.m125081a(z2);
                    }
                    throw new IllegalStateException("expected simple value");
                } else if (b2 == 0 || b2 == 32) {
                    byqa byqa4 = this.f167365b;
                    byqa4.mo74451a();
                    bypz bypz = byqa4.f167369a;
                    byte b3 = bypz.f167367a;
                    if (b3 == 0) {
                        z = true;
                    } else if (b3 == 32) {
                        z = false;
                    } else {
                        throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(bypz.mo74450a())));
                    }
                    long c4 = byqa4.mo74454c();
                    if (c4 >= 0) {
                        if (!z) {
                            c4 ^= -1;
                        }
                        if (c4 <= 0) {
                            j = -1 ^ c4;
                        } else {
                            j = c4;
                        }
                        m125097a(b, j);
                        return bypx.m125083a(c4);
                    }
                    throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
                } else if (b2 == 64) {
                    byqa byqa5 = this.f167365b;
                    byqa5.mo74452a((byte) 64);
                    byte[] b4 = byqa5.mo74453b();
                    m125097a(b, (long) b4.length);
                    return bypx.m125082a(b4);
                } else if (b2 == 96) {
                    byqa byqa6 = this.f167365b;
                    byqa6.mo74452a((byte) 96);
                    String str = new String(byqa6.mo74453b(), StandardCharsets.UTF_8);
                    m125097a(b, (long) str.length());
                    return bypx.m125085a(str);
                } else {
                    int a3 = a.mo74450a();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unidentifiable major type: ");
                    sb.append(a3);
                    throw new bypq(sb.toString());
                }
            } catch (IOException | RuntimeException e) {
                throw new bypq("Error in decoding CborValue from bytes", e);
            }
        } else {
            throw new bypq("Parser being asked to parse an empty input stream");
        }
    }
}

package p000;

/* renamed from: bxtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxtg {
    /* renamed from: a */
    static int m123133a(int i, byte[] bArr, int i2, int i3, bxtf bxtf) {
        if (bxzh.m124563b(i) != 0) {
            int a = bxzh.m124561a(i);
            if (a == 0) {
                return m123143b(bArr, i2, bxtf);
            }
            if (a == 1) {
                return i2 + 8;
            }
            if (a == 2) {
                return m123141a(bArr, i2, bxtf) + bxtf.f164767a;
            }
            if (a == 3) {
                int i4 = (i & -8) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = m123141a(bArr, i2, bxtf);
                    i5 = bxtf.f164767a;
                    if (i5 == i4) {
                        break;
                    }
                    i2 = m123133a(i5, bArr, i2, i3, bxtf);
                }
                if (i2 <= i3 && i5 == i4) {
                    return i2;
                }
                throw bxwf.m124095h();
            } else if (a == 5) {
                return i2 + 4;
            } else {
                throw bxwf.m124091d();
            }
        } else {
            throw bxwf.m124091d();
        }
    }

    /* renamed from: b */
    static int m123143b(byte[] bArr, int i, bxtf bxtf) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                b = b2;
                i3 = i5;
            }
            bxtf.f164768b = j2;
            return i3;
        }
        bxtf.f164768b = j;
        return i2;
    }

    /* renamed from: c */
    static double m123145c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m123144b(bArr, i));
    }

    /* renamed from: d */
    static float m123147d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m123140a(bArr, i));
    }

    /* renamed from: e */
    static int m123149e(byte[] bArr, int i, bxtf bxtf) {
        int a = m123141a(bArr, i, bxtf);
        int i2 = bxtf.f164767a;
        if (i2 < 0) {
            throw bxwf.m124089b();
        } else if (i2 > bArr.length - a) {
            throw bxwf.m124088a();
        } else if (i2 != 0) {
            bxtf.f164769c = ByteString.m123262a(bArr, a, i2);
            return a + i2;
        } else {
            bxtf.f164769c = ByteString.f164797b;
            return a;
        }
    }

    /* renamed from: c */
    static int m123146c(byte[] bArr, int i, bxtf bxtf) {
        int a = m123141a(bArr, i, bxtf);
        int i2 = bxtf.f164767a;
        if (i2 < 0) {
            throw bxwf.m124089b();
        } else if (i2 != 0) {
            bxtf.f164769c = new String(bArr, a, i2, bxwd.f164980a);
            return a + i2;
        } else {
            bxtf.f164769c = "";
            return a;
        }
    }

    /* renamed from: d */
    static int m123148d(byte[] bArr, int i, bxtf bxtf) {
        int a = m123141a(bArr, i, bxtf);
        int i2 = bxtf.f164767a;
        if (i2 < 0) {
            throw bxwf.m124089b();
        } else if (i2 != 0) {
            bxtf.f164769c = bxzd.m124559c(bArr, a, i2);
            return a + i2;
        } else {
            bxtf.f164769c = "";
            return a;
        }
    }

    /* renamed from: b */
    static long m123144b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: a */
    static int m123134a(int i, byte[] bArr, int i2, int i3, bxwc bxwc, bxtf bxtf) {
        bxvm bxvm = (bxvm) bxwc;
        int a = m123141a(bArr, i2, bxtf);
        bxvm.mo74153d(bxtf.f164767a);
        while (a < i3) {
            int a2 = m123141a(bArr, a, bxtf);
            if (i != bxtf.f164767a) {
                break;
            }
            a = m123141a(bArr, a2, bxtf);
            bxvm.mo74153d(bxtf.f164767a);
        }
        return a;
    }

    /* renamed from: a */
    static int m123135a(int i, byte[] bArr, int i2, int i3, bxyo bxyo, bxtf bxtf) {
        if (bxzh.m124563b(i) != 0) {
            int a = bxzh.m124561a(i);
            if (a == 0) {
                int b = m123143b(bArr, i2, bxtf);
                bxyo.mo74283a(i, Long.valueOf(bxtf.f164768b));
                return b;
            } else if (a == 1) {
                bxyo.mo74283a(i, Long.valueOf(m123144b(bArr, i2)));
                return i2 + 8;
            } else if (a == 2) {
                int a2 = m123141a(bArr, i2, bxtf);
                int i4 = bxtf.f164767a;
                if (i4 < 0) {
                    throw bxwf.m124089b();
                } else if (i4 <= bArr.length - a2) {
                    if (i4 != 0) {
                        bxyo.mo74283a(i, ByteString.m123262a(bArr, a2, i4));
                    } else {
                        bxyo.mo74283a(i, ByteString.f164797b);
                    }
                    return a2 + i4;
                } else {
                    throw bxwf.m124088a();
                }
            } else if (a == 3) {
                int i5 = (i & -8) | 4;
                bxyo a3 = bxyo.m124424a();
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a4 = m123141a(bArr, i2, bxtf);
                    int i7 = bxtf.f164767a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = a4;
                        break;
                    }
                    i6 = i7;
                    i2 = m123135a(i7, bArr, a4, i3, a3, bxtf);
                }
                if (i2 > i3 || i6 != i5) {
                    throw bxwf.m124095h();
                }
                bxyo.mo74283a(i, a3);
                return i2;
            } else if (a == 5) {
                bxyo.mo74283a(i, Integer.valueOf(m123140a(bArr, i2)));
                return i2 + 4;
            } else {
                throw bxwf.m124091d();
            }
        } else {
            throw bxwf.m124091d();
        }
    }

    /* renamed from: a */
    static int m123136a(int i, byte[] bArr, int i2, bxtf bxtf) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 < 0) {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 < 0) {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 < 0) {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                bxtf.f164767a = i9;
                                return i10;
                            }
                        }
                    } else {
                        i4 = b4 << 28;
                    }
                } else {
                    i3 = b3 << 21;
                }
            } else {
                i4 = b2 << 14;
            }
            bxtf.f164767a = i7 | i4;
            return i8;
        }
        i3 = b << 7;
        bxtf.f164767a = i5 | i3;
        return i6;
    }

    /* renamed from: a */
    static int m123137a(bxxv bxxv, int i, byte[] bArr, int i2, int i3, bxwc bxwc, bxtf bxtf) {
        int a = m123139a(bxxv, bArr, i2, i3, bxtf);
        bxwc.add(bxtf.f164769c);
        while (a < i3) {
            int a2 = m123141a(bArr, a, bxtf);
            if (i != bxtf.f164767a) {
                break;
            }
            a = m123139a(bxxv, bArr, a2, i3, bxtf);
            bxwc.add(bxtf.f164769c);
        }
        return a;
    }

    /* renamed from: a */
    static int m123138a(bxxv bxxv, byte[] bArr, int i, int i2, int i3, bxtf bxtf) {
        bxxf bxxf = (bxxf) bxxv;
        Object a = bxxf.mo74218a();
        int a2 = bxxf.mo74217a(a, bArr, i, i2, i3, bxtf);
        bxxf.mo74225d(a);
        bxtf.f164769c = a;
        return a2;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v2, types: [int], assign insn: 0x0006: INVOKE  (r0v2 ? I:int) = (r8v1 byte), (r7v0 byte[]), (r0v0 int), (r10v0 bxtf) type: STATIC call: bxtg.a(int, byte[], int, bxtf):int */
    /* JADX WARN: Type inference failed for: r8v4, types: [int], assign insn: 0x000a: IGET  (r8v4 ? I:int) = (r10v0 bxtf) bxtf.a int */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    static int m123139a(bxxv bxxv, byte[] bArr, int i, int i2, bxtf bxtf) {
        byte b;
        byte b2;
        int i3 = i + 1;
        byte b3 = bArr[i];
        if (b3 < 0) {
            b2 = m123136a(b3, bArr, i3, bxtf);
            b = bxtf.f164767a;
        } else {
            b2 = i3;
            b = b3;
        }
        if (b < 0 || b > i2 - b2) {
            throw bxwf.m124088a();
        }
        Object a = bxxv.mo74218a();
        int i4 = b + b2;
        bxxv.mo74221a(a, bArr, b2, i4, bxtf);
        bxxv.mo74225d(a);
        bxtf.f164769c = a;
        return i4;
    }

    /* renamed from: a */
    static int m123140a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    static int m123141a(byte[] bArr, int i, bxtf bxtf) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m123136a(b, bArr, i2, bxtf);
        }
        bxtf.f164767a = b;
        return i2;
    }

    /* renamed from: a */
    static int m123142a(byte[] bArr, int i, bxwc bxwc, bxtf bxtf) {
        bxvm bxvm = (bxvm) bxwc;
        int a = m123141a(bArr, i, bxtf);
        int i2 = bxtf.f164767a + a;
        while (a < i2) {
            a = m123141a(bArr, a, bxtf);
            bxvm.mo74153d(bxtf.f164767a);
        }
        if (a == i2) {
            return a;
        }
        throw bxwf.m124088a();
    }
}

package p000;

import java.util.Arrays;

/* renamed from: bnoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnoj extends bnhe {

    /* renamed from: b */
    public static final bnhe f131912b = new bnoj(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    final transient Object[] f131913c;

    /* renamed from: d */
    public final transient int f131914d;

    /* renamed from: e */
    private final transient Object f131915e;

    private bnoj(Object obj, Object[] objArr, int i) {
        this.f131915e = obj;
        this.f131913c = objArr;
        this.f131914d = i;
    }

    /* renamed from: a */
    static bnoj m109969a(int i, Object[] objArr) {
        if (i == 0) {
            return (bnoj) f131912b;
        }
        if (i != 1) {
            bmxy.m108599b(i, objArr.length >> 1);
            return new bnoj(m109972a(objArr, i, bnic.m109498b(i), 0), objArr, i);
        }
        bndz.m109114a(objArr[0], objArr[1]);
        return new bnoj(null, objArr, 1);
    }

    /* renamed from: cR */
    public final bnic mo67697cR() {
        return new bnoh(this, new bnoi(this.f131913c, 0, this.f131914d));
    }

    /* renamed from: cT */
    public final boolean mo67651cT() {
        return false;
    }

    /* renamed from: e */
    public final bngm mo67622e() {
        return new bnoi(this.f131913c, 1, this.f131914d);
    }

    /* renamed from: g */
    public final bnic mo67698g() {
        return new bnog(this, this.f131913c, 0, this.f131914d);
    }

    public final Object get(Object obj) {
        return m109971a(this.f131915e, this.f131913c, this.f131914d, 0, obj);
    }

    public final int size() {
        return this.f131914d;
    }

    /* renamed from: a */
    private static IllegalArgumentException m109970a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static Object m109971a(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 != null) {
            if (i == 1) {
                if (objArr[i2].equals(obj2)) {
                    return objArr[i2 ^ 1];
                }
                return null;
            } else if (obj != null) {
                if (!(obj instanceof byte[])) {
                    if (!(obj instanceof short[])) {
                        int[] iArr = (int[]) obj;
                        int length = iArr.length - 1;
                        int a = bngg.m109304a(obj2.hashCode());
                        while (true) {
                            int i3 = a & length;
                            int i4 = iArr[i3];
                            if (i4 == -1) {
                                break;
                            } else if (objArr[i4].equals(obj2)) {
                                return objArr[i4 ^ 1];
                            } else {
                                a = i3 + 1;
                            }
                        }
                    } else {
                        short[] sArr = (short[]) obj;
                        int length2 = sArr.length - 1;
                        int a2 = bngg.m109304a(obj2.hashCode());
                        while (true) {
                            int i5 = a2 & length2;
                            char c = (char) sArr[i5];
                            if (c == 65535) {
                                return null;
                            }
                            if (objArr[c].equals(obj2)) {
                                return objArr[c ^ 1];
                            }
                            a2 = i5 + 1;
                        }
                    }
                } else {
                    byte[] bArr = (byte[]) obj;
                    int length3 = bArr.length - 1;
                    int a3 = bngg.m109304a(obj2.hashCode());
                    while (true) {
                        int i6 = a3 & length3;
                        byte b = bArr[i6] & 255;
                        if (b == 255) {
                            return null;
                        }
                        if (objArr[b].equals(obj2)) {
                            return objArr[b ^ 1];
                        }
                        a3 = i6 + 1;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(short[], short):void}
     arg types: [short[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(short[], short):void} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* renamed from: a */
    static Object m109972a(Object[] objArr, int i, int i2, int i3) {
        if (i != 1) {
            int i4 = i2 - 1;
            int i5 = 0;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                while (i5 < i) {
                    int i6 = i5 + i5 + i3;
                    Object obj = objArr[i6];
                    Object obj2 = objArr[i6 ^ 1];
                    bndz.m109114a(obj, obj2);
                    int a = bngg.m109304a(obj.hashCode());
                    while (true) {
                        int i7 = a & i4;
                        byte b = bArr[i7] & 255;
                        if (b == 255) {
                            break;
                        } else if (!objArr[b].equals(obj)) {
                            a = i7 + 1;
                        } else {
                            throw m109970a(obj, obj2, objArr, b);
                        }
                    }
                }
                return bArr;
            } else if (i2 > 32768) {
                int[] iArr = new int[i2];
                Arrays.fill(iArr, -1);
                while (i5 < i) {
                    int i8 = i5 + i5 + i3;
                    Object obj3 = objArr[i8];
                    Object obj4 = objArr[i8 ^ 1];
                    bndz.m109114a(obj3, obj4);
                    int a2 = bngg.m109304a(obj3.hashCode());
                    while (true) {
                        int i9 = a2 & i4;
                        int i10 = iArr[i9];
                        if (i10 == -1) {
                            break;
                        } else if (!objArr[i10].equals(obj3)) {
                            a2 = i9 + 1;
                        } else {
                            throw m109970a(obj3, obj4, objArr, i10);
                        }
                    }
                }
                return iArr;
            } else {
                short[] sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                while (i5 < i) {
                    int i11 = i5 + i5 + i3;
                    Object obj5 = objArr[i11];
                    Object obj6 = objArr[i11 ^ 1];
                    bndz.m109114a(obj5, obj6);
                    int a3 = bngg.m109304a(obj5.hashCode());
                    while (true) {
                        int i12 = a3 & i4;
                        char c = (char) sArr[i12];
                        if (c == 65535) {
                            break;
                        } else if (!objArr[c].equals(obj5)) {
                            a3 = i12 + 1;
                        } else {
                            throw m109970a(obj5, obj6, objArr, c);
                        }
                    }
                }
                return sArr;
            }
        } else {
            bndz.m109114a(objArr[i3], objArr[i3 ^ 1]);
            return null;
        }
    }
}

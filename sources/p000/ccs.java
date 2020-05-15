package p000;

import android.graphics.Bitmap;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* renamed from: ccs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccs implements cco {

    /* renamed from: a */
    public ByteBuffer f6536a;

    /* renamed from: b */
    public byte[] f6537b;

    /* renamed from: c */
    public byte[] f6538c;

    /* renamed from: d */
    public int[] f6539d;

    /* renamed from: e */
    public int f6540e;

    /* renamed from: f */
    public ccq f6541f;

    /* renamed from: g */
    public Bitmap f6542g;

    /* renamed from: h */
    public Boolean f6543h;

    /* renamed from: i */
    public Bitmap.Config f6544i = Bitmap.Config.ARGB_8888;

    /* renamed from: j */
    public final cns f6545j;

    /* renamed from: k */
    private int[] f6546k;

    /* renamed from: l */
    private final int[] f6547l = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: m */
    private short[] f6548m;

    /* renamed from: n */
    private byte[] f6549n;

    /* renamed from: o */
    private byte[] f6550o;

    /* renamed from: p */
    private boolean f6551p;

    /* renamed from: q */
    private int f6552q;

    /* renamed from: r */
    private int f6553r;

    /* renamed from: s */
    private int f6554s;

    /* renamed from: t */
    private int f6555t;

    static {
        ccs.class.getSimpleName();
    }

    /* renamed from: c */
    private final int m3970c() {
        return this.f6536a.get() & 255;
    }

    /* renamed from: d */
    private final Bitmap m3971d() {
        Boolean bool = this.f6543h;
        Bitmap.Config config = (bool != null && !bool.booleanValue()) ? this.f6544i : Bitmap.Config.ARGB_8888;
        Bitmap b = this.f6545j.f7113a.mo3882b(this.f6555t, this.f6554s, config);
        b.setHasAlpha(true);
        return b;
    }

    /* renamed from: a */
    public final void mo3716a() {
        this.f6540e = (this.f6540e + 1) % this.f6541f.f6521c;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:315:0x042b */
    /* JADX WARN: Type inference failed for: r26v10, types: [int], assign insn: 0x0417: ARITH  (r26v10 ? I:int) = (r26v1 byte) + (8 byte) */
    /* JADX WARN: Type inference failed for: r5v32, assign insn: PHI: (r5v32 ?) = (r5v37 int), (r5v42 int), (r5v31 int) binds: [B:320:0x042b, B:319:0x042b, B:318:0x042b] */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x026c, code lost:
        if (r0 == 1) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x04f8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0112, code lost:
        if (r7.length < r10) goto L_0x0114;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0266  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    public final synchronized Bitmap mo3717b() {
        ccp ccp;
        int i;
        int i2;
        int[] iArr;
        ccp ccp2;
        int i3;
        boolean z;
        int i4;
        int i5;
        ccp ccp3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        ccp ccp4;
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        short s;
        int i19;
        Bitmap bitmap;
        int i20;
        synchronized (this) {
            if (this.f6541f.f6521c <= 0 || this.f6540e < 0) {
                this.f6552q = 1;
            }
            int i21 = this.f6552q;
            if (i21 != 1 && i21 != 2) {
                this.f6552q = 0;
                if (this.f6537b == null) {
                    this.f6537b = this.f6545j.mo4005a(255);
                }
                ccp ccp5 = (ccp) this.f6541f.f6523e.get(this.f6540e);
                int i22 = this.f6540e - 1;
                if (i22 >= 0) {
                    ccp = (ccp) this.f6541f.f6523e.get(i22);
                } else {
                    ccp = null;
                }
                int[] iArr3 = ccp5.f6518k;
                if (iArr3 == null) {
                    iArr3 = this.f6541f.f6519a;
                }
                this.f6546k = iArr3;
                if (iArr3 != null) {
                    if (ccp5.f6513f) {
                        System.arraycopy(iArr3, 0, this.f6547l, 0, iArr3.length);
                        int[] iArr4 = this.f6547l;
                        this.f6546k = iArr4;
                        iArr4[ccp5.f6515h] = 0;
                        if (ccp5.f6514g == 2) {
                            if (this.f6540e == 0) {
                                this.f6543h = true;
                            }
                        }
                    }
                    int[] iArr5 = this.f6539d;
                    if (ccp == null) {
                        Bitmap bitmap2 = this.f6542g;
                        if (bitmap2 != null) {
                            this.f6545j.mo4003a(bitmap2);
                        }
                        this.f6542g = null;
                        Arrays.fill(iArr5, 0);
                    }
                    if (ccp != null && ccp.f6514g == 3 && this.f6542g == null) {
                        Arrays.fill(iArr5, 0);
                    }
                    if (ccp != null && (i19 = ccp.f6514g) > 0) {
                        if (i19 == 2) {
                            if (!ccp5.f6513f) {
                                ccq ccq = this.f6541f;
                                i20 = ccq.f6530l;
                                if (ccp5.f6518k != null && ccq.f6528j == ccp5.f6515h) {
                                    i20 = 0;
                                }
                            } else {
                                i20 = 0;
                            }
                            int i23 = ccp.f6511d;
                            int i24 = this.f6553r;
                            int i25 = i23 / i24;
                            int i26 = ccp.f6509b / i24;
                            int i27 = ccp.f6510c / i24;
                            int i28 = ccp.f6508a / i24;
                            int i29 = this.f6555t;
                            int i30 = (i26 * i29) + i28;
                            int i31 = (i25 * i29) + i30;
                            while (i30 < i31) {
                                int i32 = i30 + i27;
                                for (int i33 = i30; i33 < i32; i33++) {
                                    iArr5[i33] = i20;
                                }
                                i30 += this.f6555t;
                            }
                        } else if (i19 == 3 && (bitmap = this.f6542g) != null) {
                            int i34 = this.f6555t;
                            bitmap.getPixels(iArr5, 0, i34, 0, 0, i34, this.f6554s);
                        }
                    }
                    if (ccp5 != null) {
                        this.f6536a.position(ccp5.f6517j);
                    }
                    if (ccp5 == null) {
                        ccq ccq2 = this.f6541f;
                        i = ccq2.f6524f * ccq2.f6525g;
                    } else {
                        i = ccp5.f6511d * ccp5.f6510c;
                    }
                    byte[] bArr = this.f6538c;
                    if (bArr == null) {
                    }
                    this.f6538c = this.f6545j.mo4005a(i);
                    byte[] bArr2 = this.f6538c;
                    if (this.f6548m == null) {
                        this.f6548m = new short[4096];
                    }
                    short[] sArr = this.f6548m;
                    if (this.f6549n == null) {
                        this.f6549n = new byte[4096];
                    }
                    byte[] bArr3 = this.f6549n;
                    if (this.f6550o == null) {
                        this.f6550o = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
                    }
                    byte[] bArr4 = this.f6550o;
                    int c = m3970c();
                    int i35 = 1 << c;
                    int i36 = i35 + 1;
                    int i37 = i35 + 2;
                    int i38 = c + 1;
                    int i39 = (1 << i38) - 1;
                    int i40 = 0;
                    while (i40 < i35) {
                        sArr[i40] = 0;
                        bArr3[i40] = (byte) i40;
                        i40++;
                        i38 = i2;
                        iArr5 = iArr;
                        ccp5 = ccp2;
                    }
                    byte[] bArr5 = this.f6537b;
                    int i41 = i2;
                    int i42 = i37;
                    int i43 = i39;
                    int i44 = 0;
                    int i45 = 0;
                    int i46 = 0;
                    int i47 = 0;
                    byte b = -1;
                    byte b2 = 0;
                    int i48 = 0;
                    byte b3 = 0;
                    int i49 = 0;
                    while (true) {
                        if (i45 >= i) {
                            break;
                        }
                        if (i3 == 0) {
                            int c2 = m3970c();
                            if (c2 > 0) {
                                ByteBuffer byteBuffer = this.f6536a;
                                i17 = i45;
                                i16 = i2;
                                i3 = c2;
                                byteBuffer.get(this.f6537b, 0, Math.min(c2, byteBuffer.remaining()));
                            } else {
                                i17 = i45;
                                i16 = i2;
                                i3 = 0;
                            }
                            if (i3 <= 0) {
                                this.f6552q = 3;
                                break;
                            }
                            i18 = i44;
                            ccp4 = ccp2;
                            iArr2 = iArr;
                            i47 = 0;
                        } else {
                            i18 = i44;
                            ccp4 = ccp2;
                            i17 = i45;
                            iArr2 = iArr;
                            i16 = i2;
                        }
                        i48 += (bArr5[i47] & 255) << b2;
                        i47++;
                        i46 = i3 - 1;
                        i44 = i18;
                        int i50 = i41;
                        byte b4 = b;
                        int i51 = b2 + 8;
                        byte b5 = b3;
                        int i52 = i42;
                        i45 = i17;
                        while (true) {
                            if (i51 < i50) {
                                i41 = i50;
                                b = b4;
                                b2 = i51;
                                b3 = b5;
                                i42 = i52;
                                i2 = i16;
                                iArr = iArr2;
                                ccp2 = ccp4;
                                break;
                            }
                            byte[] bArr6 = bArr5;
                            byte b6 = i48 & i43;
                            i48 >>= i50;
                            i51 -= i50;
                            if (b6 == i35) {
                                i52 = i37;
                                i43 = i39;
                                bArr5 = bArr6;
                                i50 = i16;
                                b4 = -1;
                            } else if (b6 == i36) {
                                b = b4;
                                b2 = i51;
                                b3 = b5;
                                i42 = i52;
                                bArr5 = bArr6;
                                i2 = i16;
                                iArr = iArr2;
                                ccp2 = ccp4;
                                i41 = i50;
                                break;
                            } else {
                                int i53 = i51;
                                if (b4 == -1) {
                                    bArr2[i44] = bArr3[b6];
                                    i44++;
                                    i45++;
                                    b4 = b6;
                                    b5 = b4;
                                    bArr5 = bArr6;
                                    i51 = i53;
                                } else {
                                    if (b6 >= i52) {
                                        bArr4[i49] = (byte) b5;
                                        i49++;
                                        s = b4;
                                    } else {
                                        s = b6;
                                    }
                                    while (s >= i35) {
                                        bArr4[i49] = bArr3[s];
                                        i49++;
                                        s = sArr[s];
                                    }
                                    b5 = bArr3[s] & 255;
                                    byte b7 = (byte) b5;
                                    bArr2[i44] = b7;
                                    int i54 = i44 + 1;
                                    i45++;
                                    while (i49 > 0) {
                                        i49--;
                                        bArr2[i54] = bArr4[i49];
                                        i54++;
                                        i45++;
                                    }
                                    int i55 = i54;
                                    if (i52 < 4096) {
                                        sArr[i52] = (short) b4;
                                        bArr3[i52] = b7;
                                        i52++;
                                        if ((i52 & i43) == 0) {
                                            if (i52 < 4096) {
                                                i50++;
                                                i43 += i52;
                                            }
                                        }
                                    }
                                    b4 = b6;
                                    bArr5 = bArr6;
                                    i51 = i53;
                                    i44 = i55;
                                }
                            }
                        }
                    }
                    Arrays.fill(bArr2, i44, i, (byte) 0);
                    if (!ccp2.f6512e) {
                        if (this.f6553r == 1) {
                            int[] iArr6 = this.f6539d;
                            int i56 = ccp2.f6511d;
                            int i57 = ccp2.f6509b;
                            int i58 = ccp2.f6510c;
                            int i59 = ccp2.f6508a;
                            int i60 = this.f6540e;
                            int i61 = this.f6555t;
                            byte[] bArr7 = this.f6538c;
                            int[] iArr7 = this.f6546k;
                            int i62 = 0;
                            byte b8 = -1;
                            while (i62 < i56) {
                                int i63 = (i62 + i57) * i61;
                                int i64 = i63 + i59;
                                int i65 = i56;
                                int i66 = i64 + i58;
                                int i67 = i63 + i61;
                                if (i67 < i66) {
                                    i66 = i67;
                                }
                                int i68 = ccp2.f6510c * i62;
                                while (i64 < i66) {
                                    int i69 = i66;
                                    byte b9 = bArr7[i68];
                                    int i70 = i57;
                                    byte b10 = b9 & 255;
                                    if (b10 != b8) {
                                        int i71 = iArr7[b10];
                                        if (i71 != 0) {
                                            iArr6[i64] = i71;
                                        } else {
                                            b8 = b9;
                                        }
                                    }
                                    i68++;
                                    i64++;
                                    i66 = i69;
                                    i57 = i70;
                                }
                                i62++;
                                i56 = i65;
                            }
                            Boolean bool = this.f6543h;
                            if (bool != null) {
                                if (!bool.booleanValue()) {
                                }
                                z2 = true;
                                this.f6543h = Boolean.valueOf(z2);
                                if (!this.f6551p) {
                                    int i72 = ccp2.f6514g;
                                    if (i72 == 0) {
                                    }
                                    if (this.f6542g == null) {
                                        this.f6542g = m3971d();
                                    }
                                    Bitmap bitmap3 = this.f6542g;
                                    int i73 = this.f6555t;
                                    bitmap3.setPixels(iArr, 0, i73, 0, 0, i73, this.f6554s);
                                }
                                Bitmap d = m3971d();
                                int i74 = this.f6555t;
                                d.setPixels(iArr, 0, i74, 0, 0, i74, this.f6554s);
                                return d;
                            }
                            if (this.f6543h == null) {
                                if (i60 == 0) {
                                    if (b8 == -1) {
                                    }
                                    z2 = true;
                                    this.f6543h = Boolean.valueOf(z2);
                                    if (!this.f6551p) {
                                    }
                                    Bitmap d2 = m3971d();
                                    int i742 = this.f6555t;
                                    d2.setPixels(iArr, 0, i742, 0, 0, i742, this.f6554s);
                                    return d2;
                                }
                            }
                            z2 = false;
                            this.f6543h = Boolean.valueOf(z2);
                            if (!this.f6551p) {
                            }
                            Bitmap d22 = m3971d();
                            int i7422 = this.f6555t;
                            d22.setPixels(iArr, 0, i7422, 0, 0, i7422, this.f6554s);
                            return d22;
                        }
                    }
                    int[] iArr8 = this.f6539d;
                    int i75 = ccp2.f6511d;
                    int i76 = this.f6553r;
                    int i77 = i75 / i76;
                    int i78 = ccp2.f6509b / i76;
                    int i79 = ccp2.f6510c / i76;
                    int i80 = ccp2.f6508a / i76;
                    int i81 = this.f6540e;
                    int i82 = this.f6555t;
                    int i83 = this.f6554s;
                    byte[] bArr8 = this.f6538c;
                    int[] iArr9 = this.f6546k;
                    Boolean bool2 = this.f6543h;
                    int i84 = 0;
                    int i85 = 0;
                    int i86 = 1;
                    int i87 = 8;
                    while (i85 < i77) {
                        int[] iArr10 = iArr;
                        if (!ccp2.f6512e) {
                            i4 = i77;
                            i5 = i84;
                            i84 = i85;
                        } else {
                            if (i84 >= i77) {
                                int i88 = i86 + 1;
                                i4 = i77;
                                if (i88 == 2) {
                                    i86 = i88;
                                    i84 = 4;
                                } else if (i88 != 3) {
                                    i86 = i88;
                                    if (i88 == 4) {
                                        i84 = 1;
                                        i87 = 2;
                                    }
                                } else {
                                    i86 = i88;
                                    i84 = 2;
                                    i87 = 4;
                                }
                            } else {
                                i4 = i77;
                            }
                            i5 = i84 + i87;
                        }
                        int i89 = i84 + i78;
                        if (i89 < i83) {
                            int i90 = i89 * i82;
                            int i91 = i90 + i80;
                            i11 = i5;
                            int i92 = i91 + i79;
                            int i93 = i90 + i82;
                            if (i93 < i92) {
                                i92 = i93;
                            }
                            i10 = i78;
                            int i94 = i85 * i76 * ccp2.f6510c;
                            if (i76 != 1) {
                                int i95 = ((i92 - i91) * i76) + i94;
                                while (i91 < i92) {
                                    int i96 = i79;
                                    int i97 = ccp2.f6510c;
                                    ccp ccp6 = ccp2;
                                    int i98 = i94;
                                    int i99 = 0;
                                    int i100 = 0;
                                    int i101 = 0;
                                    int i102 = 0;
                                    int i103 = 0;
                                    while (true) {
                                        i12 = i80;
                                        if (i98 >= this.f6553r + i94) {
                                            i13 = i82;
                                            i14 = i83;
                                            break;
                                        }
                                        byte[] bArr9 = this.f6538c;
                                        i13 = i82;
                                        if (i98 >= bArr9.length || i98 >= i95) {
                                            i14 = i83;
                                        } else {
                                            int i104 = i83;
                                            int i105 = this.f6546k[bArr9[i98] & 255];
                                            if (i105 != 0) {
                                                i103 += (i105 >> 24) & 255;
                                                i99 += (i105 >> 16) & 255;
                                                i100 += (i105 >> 8) & 255;
                                                i101 += i105 & 255;
                                                i102++;
                                            }
                                            i98++;
                                            i80 = i12;
                                            i82 = i13;
                                            i83 = i104;
                                        }
                                    }
                                    int i106 = i97 + i94;
                                    for (int i107 = i106; i107 < this.f6553r + i106; i107++) {
                                        byte[] bArr10 = this.f6538c;
                                        if (i107 >= bArr10.length || i107 >= i95) {
                                            break;
                                        }
                                        int i108 = this.f6546k[bArr10[i107] & 255];
                                        if (i108 != 0) {
                                            i103 += (i108 >> 24) & 255;
                                            i99 += (i108 >> 16) & 255;
                                            i100 += (i108 >> 8) & 255;
                                            i101 += i108 & 255;
                                            i102++;
                                        }
                                    }
                                    if (i102 != 0) {
                                        i15 = ((i103 / i102) << 24) | ((i99 / i102) << 16) | ((i100 / i102) << 8) | (i101 / i102);
                                    } else {
                                        i15 = 0;
                                    }
                                    if (i15 != 0) {
                                        iArr8[i91] = i15;
                                    } else if (i81 == 0 && bool2 == null) {
                                        bool2 = true;
                                    }
                                    i94 += i76;
                                    i91++;
                                    i79 = i96;
                                    i80 = i12;
                                    i82 = i13;
                                    i83 = i14;
                                    ccp2 = ccp6;
                                }
                                ccp3 = ccp2;
                                i9 = i79;
                                i8 = i80;
                                i7 = i82;
                                i6 = i83;
                            } else {
                                ccp3 = ccp2;
                                i9 = i79;
                                i8 = i80;
                                i7 = i82;
                                i6 = i83;
                                while (i91 < i92) {
                                    int i109 = iArr9[bArr8[i94] & 255];
                                    if (i109 != 0) {
                                        iArr8[i91] = i109;
                                    } else if (i81 == 0 && bool2 == null) {
                                        bool2 = true;
                                    }
                                    i94++;
                                    i91++;
                                }
                            }
                        } else {
                            i11 = i5;
                            i10 = i78;
                            ccp3 = ccp2;
                            i9 = i79;
                            i8 = i80;
                            i7 = i82;
                            i6 = i83;
                        }
                        i85++;
                        i84 = i11;
                        i77 = i4;
                        i78 = i10;
                        i79 = i9;
                        i80 = i8;
                        i82 = i7;
                        i83 = i6;
                        iArr = iArr10;
                        ccp2 = ccp3;
                    }
                    if (this.f6543h == null) {
                        if (bool2 != null) {
                            z = bool2.booleanValue();
                        } else {
                            z = false;
                        }
                        this.f6543h = Boolean.valueOf(z);
                    }
                    if (!this.f6551p) {
                    }
                    Bitmap d222 = m3971d();
                    int i74222 = this.f6555t;
                    d222.setPixels(iArr, 0, i74222, 0, 0, i74222, this.f6554s);
                    return d222;
                }
                this.f6552q = 1;
                return null;
            }
        }
    }

    public ccs(cns cns, ccq ccq, ByteBuffer byteBuffer, int i) {
        this.f6545j = cns;
        this.f6541f = new ccq();
        mo3724a(ccq, byteBuffer, i);
    }

    /* renamed from: a */
    public final synchronized void mo3724a(ccq ccq, ByteBuffer byteBuffer, int i) {
        int[] iArr;
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            int i2 = 0;
            this.f6552q = 0;
            this.f6541f = ccq;
            this.f6540e = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f6536a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f6536a.order(ByteOrder.LITTLE_ENDIAN);
            this.f6551p = false;
            List list = ccq.f6523e;
            int size = list.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                int i3 = i2 + 1;
                if (((ccp) list.get(i2)).f6514g == 3) {
                    this.f6551p = true;
                    break;
                }
                i2 = i3;
            }
            this.f6553r = highestOneBit;
            int i4 = ccq.f6524f;
            this.f6555t = i4 / highestOneBit;
            int i5 = ccq.f6525g;
            this.f6554s = i5 / highestOneBit;
            this.f6538c = this.f6545j.mo4005a(i4 * i5);
            cns cns = this.f6545j;
            int i6 = this.f6555t * this.f6554s;
            cgr cgr = cns.f7114b;
            if (cgr != null) {
                iArr = (int[]) cgr.mo3870a(i6, int[].class);
            } else {
                iArr = new int[i6];
            }
            this.f6539d = iArr;
        } else {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}

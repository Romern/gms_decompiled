package p000;

import android.util.SparseIntArray;

/* renamed from: odo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class odo {

    /* renamed from: a */
    public final SparseIntArray f37285a = new SparseIntArray();

    /* renamed from: b */
    public final byte[] f37286b;

    /* renamed from: c */
    public final int f37287c;

    public odo(byte[] bArr, int i) {
        this.f37286b = bArr;
        odn odn = new odn(bArr, i);
        int a = odn.mo22024a(8);
        this.f37285a.put(0, a);
        if (a == 66) {
            this.f37285a.put(1, odn.mo22024a(8));
            this.f37285a.put(2, odn.mo22024a(8));
            odn.mo22023a();
            odn.mo22023a();
            int a2 = odn.mo22023a();
            if (a2 == 0) {
                odn.mo22023a();
            } else if (a2 == 1) {
                odn.mo22024a(1);
                odn.mo22023a();
                odn.mo22023a();
                int a3 = odn.mo22023a();
                for (int i2 = 0; i2 < a3; i2++) {
                    odn.mo22023a();
                }
            }
            odn.mo22023a();
            odn.mo22024a(1);
            this.f37285a.put(3, odn.mo22023a() + 1);
            this.f37285a.put(4, odn.mo22023a() + 1);
            if (odn.mo22024a(1) == 0) {
                odn.mo22024a(1);
            }
            odn.mo22024a(1);
            if (odn.mo22024a(1) == 1) {
                odn.mo22023a();
                odn.mo22023a();
                odn.mo22023a();
                odn.mo22023a();
            }
            this.f37287c = odn.f37282a + (odn.f37283b * 8);
            this.f37285a.put(5, odn.mo22024a(1));
            if (this.f37285a.get(5) == 1) {
                if (odn.mo22024a(1) == 1 && odn.mo22024a(8) == 255) {
                    odn.mo22024a(16);
                    odn.mo22024a(16);
                }
                if (odn.mo22024a(1) == 1) {
                    odn.mo22024a(1);
                }
                if (odn.mo22024a(1) == 1) {
                    odn.mo22024a(3);
                    odn.mo22024a(1);
                    if (odn.mo22024a(1) == 1) {
                        odn.mo22024a(8);
                        odn.mo22024a(8);
                        odn.mo22024a(8);
                    }
                }
                if (odn.mo22024a(1) == 1) {
                    odn.mo22023a();
                    odn.mo22023a();
                }
                if (odn.mo22024a(1) == 1) {
                    odn.mo22024a(32);
                    odn.mo22024a(32);
                    odn.mo22024a(1);
                }
                int a4 = odn.mo22024a(1);
                if (a4 == 1) {
                    m28495a(odn);
                }
                int a5 = odn.mo22024a(1);
                if (a5 == 1) {
                    m28495a(odn);
                }
                if (a4 == 1 || a5 == 1) {
                    odn.mo22024a(1);
                }
                odn.mo22024a(1);
                this.f37285a.put(6, odn.mo22024a(1));
                if (this.f37285a.get(6) == 1) {
                    odn.mo22024a(1);
                    odn.mo22023a();
                    odn.mo22023a();
                    odn.mo22023a();
                    odn.mo22023a();
                    this.f37285a.put(7, odn.mo22023a());
                    this.f37285a.put(8, odn.mo22023a());
                }
            }
            if (odn.mo22024a(1) != 1) {
                throw new IllegalArgumentException();
            }
            return;
        }
        bnsn bnsn = odp.f37288a;
        throw new IllegalArgumentException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SPS{profile=");
        sb.append(this.f37285a.get(0));
        sb.append(", flags=");
        sb.append(this.f37285a.get(1));
        sb.append(", level=");
        sb.append(this.f37285a.get(2));
        sb.append(", pic_width=");
        sb.append(this.f37285a.get(3));
        sb.append(", pic_height=");
        sb.append(this.f37285a.get(4));
        sb.append(", vui_present=");
        sb.append(this.f37285a.get(5));
        if (this.f37285a.get(5) == 1) {
            sb.append(", bitstream_restricted=");
            sb.append(this.f37285a.get(6));
        }
        if (this.f37285a.get(5) == 1 && this.f37285a.get(6) == 1) {
            sb.append(", max_num_reorder_frames=");
            sb.append(this.f37285a.get(7));
            sb.append(", max_num_dec_frame_buffering=");
            sb.append(this.f37285a.get(8));
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private static final void m28495a(odn odn) {
        int a = odn.mo22023a();
        odn.mo22024a(4);
        odn.mo22024a(4);
        for (int i = 0; i <= a; i++) {
            odn.mo22023a();
            odn.mo22023a();
            odn.mo22024a(1);
        }
        odn.mo22024a(5);
        odn.mo22024a(5);
        odn.mo22024a(5);
        odn.mo22024a(5);
    }

    /* renamed from: a */
    public static void m28496a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        while (i3 > 0) {
            int i5 = i2 % 8;
            int i6 = i % 8;
            int i7 = 8 - i6;
            int min = Math.min(i3, Math.min(8 - i5, i7));
            byte b = (byte) ((255 << (i7 - min)) & (255 >> i6));
            byte b2 = bArr2[i2 / 8];
            int i8 = i5 - i6;
            if (i8 < 0) {
                i4 = b2 >> (-i8);
            } else {
                i4 = b2 << i8;
            }
            int i9 = i / 8;
            bArr[i9] = (byte) ((((byte) i4) & b) | bArr[i9]);
            i3 -= min;
            i2 += min;
            i += min;
        }
    }

    /* renamed from: a */
    public final int mo22025a(int i) {
        return this.f37285a.get(i);
    }

    /* renamed from: a */
    public final byte[] mo22026a() {
        byte[] bArr = {0, -38, 8, -124, 106};
        if (this.f37285a.get(5) == 1) {
            bnsi d = odp.f37288a.mo68390d();
            d.mo68432a("odo", "a", 487, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("VUI already present");
            if (this.f37285a.get(6) == 1) {
                return this.f37286b;
            }
            return null;
        }
        int i = this.f37287c;
        int i2 = (i + 8) / 8;
        int i3 = (i + 47) / 8;
        byte[] bArr2 = this.f37286b;
        byte[] bArr3 = new byte[((bArr2.length - i2) + i3)];
        m28496a(bArr3, 0, bArr2, 0, i - 1);
        int i4 = this.f37287c;
        int i5 = i4 / 8;
        bArr3[i5] = (byte) (bArr3[i5] | (128 >>> (i4 % 8)));
        m28496a(bArr3, i4 + 1, bArr, 0, 39);
        byte[] bArr4 = this.f37286b;
        m28496a(bArr3, i3 * 8, bArr4, i2 * 8, (bArr4.length - i2) * 8);
        return bArr3;
    }
}

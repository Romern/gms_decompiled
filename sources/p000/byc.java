package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: byc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byc extends bwz {

    /* renamed from: a */
    public static final byte[] f6102a = {-33, -1, 1};

    /* renamed from: b */
    public static final bzx f6103b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6104c;

    /* renamed from: d */
    public static final byte[] f6105d = {79};

    /* renamed from: g */
    public static final int f6106g = 3;

    /* renamed from: h */
    public static final int f6107h = 1;

    /* renamed from: i */
    public static final int f6108i = 4;

    /* renamed from: j */
    public static final int f6109j = 3;

    /* renamed from: m */
    public static final int f6110m = 5;

    /* renamed from: n */
    public static final int f6111n = 2;

    /* renamed from: e */
    public byte[] f6112e = null;

    /* renamed from: f */
    public Map f6113f = new HashMap();

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "AID with DGIs";
        bzv.f6287b = "Container for storing AID with corresponding AID specific DGIs";
        bzv.f6293h = f6106g;
        bzv.f6294i = f6107h;
        bzv.f6290e = f6103b;
        bzv.f6288c = f6102a;
        bzv.f6295j = f6108i;
        bzv.f6296k = f6109j;
        bzv.f6297l = f6111n;
        bzv.f6298m = f6110m;
        f6104c = bzv.mo3629a();
    }

    public byc(byte[] bArr, bzg bzg) {
        super(bArr, f6104c);
        int length;
        int i;
        if (bArr == null || (length = bArr.length) <= 0) {
            throw new RuntimeException("Failed to parse AID tag");
        } else if (bArr[0] != f6105d[0]) {
            throw new RuntimeException("Expected APPLICATION_IDENTIFIER tag");
        } else if (length - 1 > 0) {
            int parseInt = Integer.parseInt(cbm.m3892a(bArr[1]), 16);
            if (length - 2 >= parseInt) {
                byte[] bArr2 = new byte[parseInt];
                this.f6112e = bArr2;
                System.arraycopy(bArr, 2, bArr2, 0, parseInt);
                int i2 = parseInt + 2;
                while (true) {
                    int length2 = bArr.length;
                    if (i2 >= length2) {
                        return;
                    }
                    if (length2 - i2 >= 2) {
                        int i3 = i2 + 1;
                        int i4 = i3 + 1;
                        bze bze = new bze(bArr[i2], bArr[i3]);
                        if (length2 - i4 > 0) {
                            int i5 = i4 + 1;
                            byte b = bArr[i4];
                            if (b != -1) {
                                i = Integer.parseInt(cbm.m3892a(b), 16);
                            } else if (length2 - i5 >= 2) {
                                int i6 = i5 + 1;
                                byte b2 = bArr[i5];
                                int i7 = i6 + 1;
                                byte b3 = bArr[i6];
                                if (b2 == -1 && b3 == -1) {
                                    throw new RuntimeException("Failed to parse DGI value length");
                                }
                                i = Integer.parseInt(cbm.m3893a(new byte[]{b2, b3}), 16);
                                i5 = i7;
                            } else {
                                throw new RuntimeException("Failed to parse DGI value length");
                            }
                            if (length2 - i5 >= i) {
                                byte[] bArr3 = new byte[i];
                                System.arraycopy(bArr, i5, bArr3, 0, i);
                                i2 = i5 + i;
                                this.f6113f.put(bze, bzg.mo3477a(bze, bArr3));
                            } else {
                                throw new RuntimeException("Failed to parse DGI value");
                            }
                        } else {
                            throw new RuntimeException("Failed to parse DGI value length");
                        }
                    } else {
                        throw new RuntimeException("Failed to parse DGI tag");
                    }
                }
            } else {
                throw new RuntimeException("Failed to parse AID value");
            }
        } else {
            throw new RuntimeException("Failed to parse AID value length");
        }
    }
}

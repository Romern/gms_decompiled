package p000;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;

/* renamed from: bxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bxq extends bwz {

    /* renamed from: c */
    public static final bzx f6008c = bzx.BOTH;

    /* renamed from: e */
    public static final int f6009e = 7;

    /* renamed from: f */
    public static final int f6010f = 1;

    /* renamed from: g */
    public static final int f6011g = 1;

    /* renamed from: h */
    public static final int f6012h = 2;

    /* renamed from: i */
    public static final int f6013i = 5;

    /* renamed from: j */
    public static final int f6014j = 2;

    /* renamed from: d */
    public final LinkedList f6015d = new LinkedList();

    public bxq(byte[] bArr, bzu bzu) {
        super(bArr, bzu);
    }

    /* renamed from: aP */
    public final void mo3547aP() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(mo3563i());
        while (byteArrayInputStream.available() > 0) {
            byte[] bArr = new byte[4];
            byteArrayInputStream.read(bArr, 0, 4);
            this.f6015d.add(new bxu(bArr));
        }
    }

    /* renamed from: b */
    public final void mo3556b(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("AFL must be a multiple of 4");
        }
    }

    public bxq(byte[] bArr, bzu bzu, byte[] bArr2) {
        super(bArr, true, bzu);
    }
}

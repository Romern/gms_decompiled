package p000;

import java.util.BitSet;

/* renamed from: banl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class banl {

    /* renamed from: a */
    private final BitSet f101356a;

    public banl(BitSet bitSet) {
        BitSet bitSet2 = (BitSet) bitSet.clone();
        this.f101356a = bitSet2;
        bitSet2.set(92);
    }

    /* renamed from: a */
    public static bank m87214a() {
        return new bank();
    }

    /* renamed from: a */
    public final ByteString mo55805a(ByteString bxtx) {
        bxtr i = bxtx.iterator();
        int i2 = 0;
        int i3 = 0;
        while (i.hasNext()) {
            if (this.f101356a.get(((Byte) i.next()).byteValue())) {
                i3++;
            }
        }
        byte[] bArr = new byte[(bxtx.mo73744a() + i3)];
        bxtr i4 = bxtx.iterator();
        while (i4.hasNext()) {
            byte byteValue = ((Byte) i4.next()).byteValue();
            if (this.f101356a.get(byteValue)) {
                bArr[i2] = 92;
                i2++;
            }
            bArr[i2] = byteValue;
            i2++;
        }
        return bxtx.m123261a(bArr);
    }
}

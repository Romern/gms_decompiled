package p000;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: bqxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqxe {

    /* renamed from: a */
    public final BitSet f141801a;

    /* renamed from: b */
    public final List f141802b;

    /* renamed from: c */
    private final byte[] f141803c;

    public bqxe(DataInputStream dataInputStream) {
        boolean z;
        if (dataInputStream.readInt() == 1296389185) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        dataInputStream.readInt();
        byte[] bArr = new byte[2];
        this.f141803c = bArr;
        dataInputStream.readFully(bArr);
        BitSet bitSet = new BitSet();
        int a = btue.m117146a(dataInputStream);
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            int a2 = btue.m117146a(dataInputStream);
            if (a2 != 0 && z2) {
                bitSet.set(i, i + a2);
            }
            i += a2;
            z2 = !z2;
        }
        this.f141801a = bitSet;
        int a3 = btue.m117146a(dataInputStream);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < a3; i3++) {
            arrayList.add(Integer.valueOf(btue.m117146a(dataInputStream)));
        }
        this.f141802b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bqxe) {
            bqxe bqxe = (bqxe) obj;
            if (!bqxe.f141801a.equals(this.f141801a) || !Arrays.equals(bqxe.f141803c, this.f141803c) || !bqxe.f141802b.equals(this.f141802b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f141801a.hashCode() + 527) * 31) + Arrays.hashCode(this.f141803c)) * 31) + this.f141802b.hashCode();
    }
}

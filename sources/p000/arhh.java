package p000;

import android.util.SparseArray;
import java.util.LinkedList;
import java.util.List;

/* renamed from: arhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arhh {

    /* renamed from: a */
    private final SparseArray f87727a;

    /* renamed from: b */
    private final arhf f87728b;

    /* renamed from: c */
    private final int f87729c;

    /* renamed from: d */
    private int f87730d;

    public arhh(arhf arhf, int i) {
        if (i != 0) {
            this.f87729c = i;
            this.f87728b = arhf;
            this.f87727a = new SparseArray();
            return;
        }
        throw new IllegalArgumentException("Invalid byte size");
    }

    /* renamed from: a */
    public final synchronized List mo48538a(byte[] bArr) {
        LinkedList linkedList;
        byte[] bArr2;
        int length = bArr.length;
        LinkedList linkedList2 = new LinkedList();
        int i = 0;
        while (i < length) {
            int i2 = length - i;
            int i3 = this.f87729c;
            if (i2 > i3) {
                bArr2 = new byte[i3];
            } else {
                bArr2 = new byte[i2];
            }
            int length2 = bArr2.length;
            System.arraycopy(bArr, i, bArr2, 0, length2);
            i += length2;
            linkedList2.add(bArr2);
        }
        linkedList = new LinkedList();
        int i4 = this.f87730d + 1;
        this.f87730d = i4;
        for (int i5 = 0; i5 < linkedList2.size(); i5++) {
            byte[] bArr3 = (byte[]) linkedList2.get(i5);
            bxvd da = aroj.f88002f.mo74144da();
            int length3 = bArr.length;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aroj aroj = (aroj) da.f164949b;
            aroj.f88004a |= 4;
            aroj.f88007d = length3;
            bxtx a = bxtx.m123261a(bArr3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aroj aroj2 = (aroj) da.f164949b;
            a.getClass();
            int i6 = aroj2.f88004a | 8;
            aroj2.f88004a = i6;
            aroj2.f88008e = a;
            int i7 = i6 | 2;
            aroj2.f88004a = i7;
            aroj2.f88006c = i5;
            aroj2.f88004a = i7 | 1;
            aroj2.f88005b = i4;
            linkedList.add(((aroj) da.mo74062i()).mo73642k());
        }
        return linkedList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo48539b(byte[] bArr) {
        if (bArr.length != 0) {
            try {
                aroj aroj = (aroj) bxvk.m124016a(aroj.f88002f, bArr, bxus.m123744c());
                arhg arhg = (arhg) this.f87727a.get(aroj.f88005b);
                if (arhg == null) {
                    arhg = new arhg();
                    this.f87727a.put(aroj.f88005b, arhg);
                }
                if (arhg.f87723a == null) {
                    arhg.f87723a = new byte[aroj.f88007d];
                }
                int i = arhg.f87724b;
                int i2 = aroj.f88006c;
                if (i + 1 == i2) {
                    arhg.mo48537a(aroj);
                } else {
                    arhg.f87726d.put(i2, aroj);
                }
                byte[] bArr2 = arhg.f87723a;
                if (bArr2 != null && arhg.f87725c == bArr2.length) {
                    this.f87728b.mo48222a(bArr2);
                    this.f87727a.remove(aroj.f88005b);
                }
            } catch (bxwf e) {
                this.f87728b.mo48221a(e);
            }
        } else {
            this.f87728b.mo48221a(new IllegalArgumentException("Empty byte array"));
        }
    }
}

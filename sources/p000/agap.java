package p000;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: agap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agap {

    /* renamed from: a */
    public final byte[] f65083a;

    /* renamed from: b */
    public final int f65084b;

    /* renamed from: c */
    public int f65085c = 0;

    /* renamed from: d */
    public int f65086d = -1;

    /* renamed from: e */
    private final SparseArray f65087e = new SparseArray(16);

    public agap(DatagramPacket datagramPacket) {
        this.f65083a = datagramPacket.getData();
        this.f65084b = datagramPacket.getLength();
    }

    /* renamed from: a */
    public final int mo35143a() {
        int i = this.f65086d;
        if (i < 0) {
            i = this.f65084b;
        }
        return i - this.f65085c;
    }

    /* renamed from: b */
    public final int mo35145b() {
        mo35146b(1);
        byte[] bArr = this.f65083a;
        int i = this.f65085c;
        this.f65085c = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: c */
    public final int mo35147c() {
        mo35146b(2);
        byte[] bArr = this.f65083a;
        int i = this.f65085c;
        int i2 = i + 1;
        this.f65085c = i2;
        byte b = bArr[i];
        this.f65085c = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: d */
    public final String[] mo35148d() {
        ArrayList arrayList = new ArrayList(5);
        agao agao = null;
        while (true) {
            if (mo35143a() <= 0) {
                break;
            }
            mo35146b(1);
            byte[] bArr = this.f65083a;
            int i = this.f65085c;
            byte b = bArr[i];
            if (b == 0) {
                mo35144a(1);
                break;
            } else if ((b & 192) == 192) {
                int b2 = ((mo35145b() & 63) << 8) | mo35145b();
                if (agao != null) {
                    agao.f65082b = b2;
                }
                while (b2 != 0) {
                    agao agao2 = (agao) this.f65087e.get(b2);
                    if (agao2 != null) {
                        arrayList.add(agao2.f65081a);
                        b2 = agao2.f65082b;
                    } else {
                        throw new IOException(String.format(Locale.ROOT, "Invalid label pointer: %04X", Integer.valueOf(b2)));
                    }
                }
            } else {
                String e = mo35149e();
                agao agao3 = new agao(e);
                this.f65087e.put(i, agao3);
                if (agao != null) {
                    agao.f65082b = i;
                }
                arrayList.add(e);
                agao = agao3;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: e */
    public final String mo35149e() {
        int b = mo35145b();
        mo35146b(b);
        String str = new String(this.f65083a, this.f65085c, b, agaj.m53803c());
        this.f65085c += b;
        return str;
    }

    /* renamed from: a */
    public final void mo35144a(int i) {
        mo35146b(i);
        this.f65085c += i;
    }

    /* renamed from: b */
    public final void mo35146b(int i) {
        if (mo35143a() < i) {
            throw new EOFException();
        }
    }
}

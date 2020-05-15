package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ByteArrayPool {
    protected static final Comparator BUF_COMPARATOR = new bnv();

    /* renamed from: a */
    private final List f7315a = new ArrayList();

    /* renamed from: b */
    private final List f7316b = new ArrayList(64);

    /* renamed from: c */
    private int f7317c = 0;

    /* renamed from: d */
    private final int f7318d;

    public ByteArrayPool(int i) {
        this.f7318d = i;
    }

    /* renamed from: a */
    private final synchronized void m4769a() {
        while (this.f7317c > this.f7318d) {
            byte[] bArr = (byte[]) this.f7315a.remove(0);
            this.f7316b.remove(bArr);
            this.f7317c -= bArr.length;
        }
    }

    public synchronized byte[] getBuf(int i) {
        for (int i2 = 0; i2 < this.f7316b.size(); i2++) {
            byte[] bArr = (byte[]) this.f7316b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f7317c -= length;
                this.f7316b.remove(i2);
                this.f7315a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void returnBuf(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= this.f7318d) {
                this.f7315a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f7316b, bArr, BUF_COMPARATOR);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f7316b.add(binarySearch, bArr);
                this.f7317c += length;
                m4769a();
            }
        }
    }
}

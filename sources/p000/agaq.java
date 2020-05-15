package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: agaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agaq {

    /* renamed from: a */
    public final byte[] f65088a = new byte[1500];

    /* renamed from: b */
    public int f65089b = 0;

    /* renamed from: c */
    private final Map f65090c = new HashMap();

    /* renamed from: c */
    private final void m53817c(int i) {
        mo35153b(i | 49152);
    }

    /* renamed from: d */
    private final void m53818d(int i) {
        if (this.f65088a.length - this.f65089b < i) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public final void mo35150a(int i) {
        m53818d(1);
        byte[] bArr = this.f65088a;
        int i2 = this.f65089b;
        this.f65089b = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    /* renamed from: b */
    public final void mo35153b(int i) {
        m53818d(2);
        byte[] bArr = this.f65088a;
        int i2 = this.f65089b;
        int i3 = i2 + 1;
        this.f65089b = i3;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        this.f65089b = i3 + 1;
        bArr[i3] = (byte) (i & 255);
    }

    /* renamed from: a */
    public final void mo35151a(String str) {
        byte[] bytes = str.getBytes(agaj.m53803c());
        int length = bytes.length;
        mo35150a(length);
        m53818d(length);
        System.arraycopy(bytes, 0, this.f65088a, this.f65089b, length);
        this.f65089b += length;
    }

    /* renamed from: a */
    public final void mo35152a(String[] strArr) {
        int length;
        int length2;
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : this.f65090c.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            String[] strArr2 = (String[]) entry.getValue();
            if (Arrays.equals(strArr2, strArr)) {
                m53817c(intValue);
                return;
            } else if (agas.m53826a(strArr2, strArr) && (length2 = strArr2.length) > i) {
                i = length2;
                i2 = intValue;
            }
        }
        if (i <= 0) {
            int[] iArr = new int[strArr.length];
            int i3 = 0;
            while (true) {
                length = strArr.length;
                if (i3 >= length) {
                    break;
                }
                iArr[i3] = this.f65089b;
                mo35151a(strArr[i3]);
                i3++;
            }
            mo35150a(0);
            int i4 = 0;
            while (i4 < strArr.length) {
                String[] strArr3 = new String[length];
                System.arraycopy(strArr, i4, strArr3, 0, length);
                this.f65090c.put(Integer.valueOf(iArr[i4]), strArr3);
                i4++;
                length--;
            }
            return;
        }
        for (int i5 = 0; i5 < strArr.length - i; i5++) {
            mo35151a(strArr[i5]);
        }
        m53817c(i2);
    }
}

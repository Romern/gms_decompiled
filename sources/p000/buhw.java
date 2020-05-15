package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: buhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buhw {

    /* renamed from: a */
    final SparseArray f153903a = new SparseArray();

    /* renamed from: a */
    public final buhv mo72695a(buhs buhs) {
        bmxy.m108581a(buhs);
        int i = buhs.f153883a;
        buht buht = (buht) this.f153903a.get(i);
        boolean z = false;
        if (buhs.mo72690a()) {
            if (buht != null) {
                Locale locale = Locale.US;
                Object[] objArr = {buht, Integer.valueOf(i)};
            }
            buht = new buht(buhs);
            this.f153903a.append(i, buht);
        }
        buhd buhd = null;
        if (buht != null) {
            int i2 = buht.f153890b.f153883a;
            int i3 = buhs.f153883a;
            if (i2 != i3) {
                Locale locale2 = Locale.US;
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(i3);
                Object[] objArr2 = {valueOf, valueOf, valueOf2, valueOf2};
            } else {
                int i4 = buhs.f153884b;
                if (buht.f153891c + 1 != i4) {
                    Locale locale3 = Locale.US;
                    Object[] objArr3 = {Integer.valueOf(buht.f153891c), Integer.valueOf(i4)};
                } else {
                    buht.f153891c = i4;
                    byte[] bArr = buhs.f153888f;
                    if (bArr != null) {
                        buht.f153892d += bArr.length;
                        buht.f153889a.add(bArr);
                    }
                    int i5 = buhs.f153886d & 1;
                    if (i5 != 0) {
                        byte[] bArr2 = new byte[buht.f153892d];
                        ArrayList arrayList = buht.f153889a;
                        int size = arrayList.size();
                        int i6 = 0;
                        for (int i7 = 0; i7 < size; i7++) {
                            byte[] bArr3 = (byte[]) arrayList.get(i7);
                            int length = bArr3.length;
                            System.arraycopy(bArr3, 0, bArr2, i6, length);
                            i6 += length;
                        }
                        buhr buhr = buht.f153890b.f153887e;
                        buhd = new buhd(buhr.f153881a, buhr.f153882b, bArr2);
                    }
                    if (i5 != 0) {
                        this.f153903a.delete(i);
                    }
                    if (i5 != 0) {
                        z = true;
                    }
                    return new buhv(z, buhd);
                }
            }
            this.f153903a.delete(i);
        } else {
            new Object[1][0] = buhs;
        }
        return null;
    }
}

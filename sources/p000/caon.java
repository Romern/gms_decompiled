package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: caon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caon {

    /* renamed from: a */
    private final Map f175465a = new HashMap();

    private caon(caom caom, byte[] bArr) {
        if (caom != null && bArr != null) {
            List list = caom.f175464a;
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                caol caol = (caol) list.get(i);
                int i3 = caol.f175463b;
                if (i2 + i3 <= bArr.length) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i2, bArr2, 0, i3);
                    i2 += caol.f175463b;
                    this.f175465a.put(caol.f175462a, bArr2);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static caon m126881a(caom caom, byte[] bArr) {
        return new caon(caom, bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f175465a.entrySet()) {
            sb.append("[");
            sb.append((String) entry.getKey());
            sb.append("|");
            sb.append(catg.m127164b((byte[]) entry.getValue()));
            sb.append("] ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final byte[] mo74730a(String str) {
        return (byte[]) this.f175465a.get(str);
    }
}

package p000;

import android.util.SparseArray;

/* renamed from: nfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfh extends nfb {

    /* renamed from: b */
    private static final SparseArray f35450b = new nff();

    /* renamed from: c */
    private static final SparseArray f35451c = new nfg();

    /* renamed from: a */
    public final int mo20552a() {
        return 0;
    }

    /* renamed from: a */
    public final byte[] mo20554a(nek nek) {
        return null;
    }

    /* renamed from: c */
    public final boolean mo20557c() {
        return false;
    }

    /* renamed from: d */
    public final String mo20559d(nek nek) {
        String str;
        byte[] a = nek.mo20526a(nfb.f35449a);
        if (a == null || a.length <= 2 || (str = (String) f35450b.get(a[2])) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 3; i < a.length; i++) {
            String str2 = (String) f35451c.get(a[i]);
            if (str2 != null) {
                sb.append(str2);
            } else {
                byte b = a[i];
                if (b <= 32 || b >= Byte.MAX_VALUE) {
                    return null;
                }
                sb.append((char) b);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final Integer mo20553a(int i) {
        return Integer.valueOf(i);
    }
}

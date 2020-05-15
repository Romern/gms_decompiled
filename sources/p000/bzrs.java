package p000;

import java.util.LinkedList;
import java.util.List;

/* renamed from: bzrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzrs {

    /* renamed from: a */
    private static final bmxr f171194a = bmxr.m108544a("");

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a3 A[EDGE_INSN: B:48:0x00a3->B:36:0x00a3 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    private static int m126076a(List list, CharSequence charSequence, int i, bnha bnha) {
        List list2 = list;
        CharSequence charSequence2 = charSequence;
        int i2 = i;
        bnha bnha2 = bnha;
        int length = charSequence.length();
        int i3 = i2;
        char c = 0;
        while (i3 < length && (c = charSequence2.charAt(i3)) != '&' && c != '?' && c != '!' && c != ':' && c != ',') {
            i3++;
        }
        list2.add(0, new StringBuilder(charSequence2.subSequence(i2, i3)).reverse());
        if (c == '!' || c == '?' || c == ':' || c == ',') {
            String a = f171194a.mo66874a((Iterable) list2);
            if (a.length() > 0) {
                bzrr[] values = bzrr.values();
                int length2 = values.length;
                int i4 = 0;
                while (i4 < length2) {
                    bzrr bzrr = values[i4];
                    if (bzrr.f171192c == c || bzrr.f171193d == c) {
                        bnha2.mo67695b(a, bzrr);
                    } else {
                        i4++;
                    }
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("No enum corresponding to given code: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int i5 = i3 + 1;
        if (c != '?' && c != ',') {
            while (true) {
                if (i5 >= length) {
                    i5 += m126076a(list2, charSequence2, i5, bnha2);
                    if (charSequence2.charAt(i5) == '?' || charSequence2.charAt(i5) == ',') {
                        i5++;
                    }
                    if (i5 >= length) {
                        break;
                    }
                }
            }
            i5++;
        }
        list2.remove(0);
        return i5 - i2;
    }

    /* renamed from: a */
    static bnhe m126077a(CharSequence charSequence) {
        bnha h = bnhe.m109414h();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += m126076a(new LinkedList(), charSequence, i, h);
        }
        return h.mo67618b();
    }
}

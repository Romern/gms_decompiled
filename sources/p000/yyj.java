package p000;

/* renamed from: yyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yyj {

    /* renamed from: a */
    public static final bnny f54824a = bnnt.f131877a.mo68159a(yyi.f54823a);

    /* renamed from: a */
    public static cadj m45004a(long j, long j2, int i, cadl cadl) {
        cadi cadi = (cadi) cadj.f172680i.mo74144da();
        if (cadi.f164950c) {
            cadi.mo74035c();
            cadi.f164950c = false;
        }
        cadj cadj = (cadj) cadi.f164949b;
        int i2 = cadj.f172682a | 1;
        cadj.f172682a = i2;
        cadj.f172683b = j;
        int i3 = i2 | 2;
        cadj.f172682a = i3;
        cadj.f172684c = j2;
        int i4 = i3 | 16;
        cadj.f172682a = i4;
        cadj.f172686e = i;
        cadj.f172688g = cadl.f172698g;
        cadj.f172682a = i4 | 32;
        return (cadj) cadi.mo74062i();
    }

    /* renamed from: a */
    public static String m45005a(cadj cadj) {
        Object[] objArr = new Object[6];
        int i = 0;
        objArr[0] = Long.valueOf(cadj.f172683b);
        objArr[1] = Long.valueOf(cadj.f172684c);
        objArr[2] = Integer.valueOf(cadj.f172686e);
        cadl a = cadl.m126501a(cadj.f172688g);
        if (a == null) {
            a = cadl.UNKNOWN_BUCKET;
        }
        objArr[3] = a.name();
        objArr[4] = Boolean.valueOf(cadj.f172689h);
        bxwc bxwc = cadj.f172687f;
        StringBuilder sb = new StringBuilder();
        int size = bxwc.size();
        String str = "";
        while (i < size) {
            sb.append(str);
            sb.append(yyl.m45030a((cadp) bxwc.get(i)));
            i++;
            str = ",";
        }
        objArr[5] = sb.toString();
        return String.format("RawBucket{%s-%s activity=%s, type=%s, server=%s, data=[%s]}", objArr);
    }
}

package p000;

/* renamed from: bafd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bafd implements babq {
    /* renamed from: a */
    public final String apply(bygz bygz) {
        boolean z;
        byhn byhn;
        int i = bygz.f166412a;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        String valueOf = String.valueOf(bygy.m124802a(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78);
        sb.append("This converter should be applied to Footprints ChannelId. Actually called for ");
        sb.append(valueOf);
        bmxy.m108589a(z, sb.toString());
        if (bygz.f166412a == 2) {
            byhn = (byhn) bygz.f166413b;
        } else {
            byhn = byhn.f166478e;
        }
        bmxr a = bmxr.m108543a(':');
        String num = Integer.toString(byhn.f166481b);
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toString(byhn.f166482c);
        byhm a2 = byhm.m124816a(byhn.f166483d);
        if (a2 == null) {
            a2 = byhm.UNKNOWN;
        }
        objArr[1] = Integer.toString(a2.f166477e);
        return a.mo66875a("fs", num, objArr);
    }
}

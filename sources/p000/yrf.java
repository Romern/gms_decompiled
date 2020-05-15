package p000;

import java.util.ArrayList;

/* renamed from: yrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yrf implements yri {
    /* renamed from: a */
    public static final yre m44653a(cacr cacr) {
        bngs b = bngx.m109371b(cacr.f172608b.size());
        bxwc bxwc = cacr.f172608b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            caae caae = ((cabo) bxwc.get(i)).f172464d;
            if (caae == null) {
                caae = caae.f172323i;
            }
            b.mo67668c(caae);
        }
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        bngs b2 = bngx.m109371b(cacr.f172609c.size());
        bxwc bxwc2 = cacr.f172609c;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cabo cabo = (cabo) bxwc2.get(i2);
            if (!cabo.f172462b.isEmpty()) {
                j.mo67668c(yyd.m44992c(cabo.f172462b));
            } else if (!cabo.f172463c.isEmpty()) {
                j2.mo67668c(yyd.m44992c(cabo.f172463c));
            } else if ((cabo.f172461a & 4) != 0) {
                caae caae2 = cabo.f172464d;
                if (caae2 == null) {
                    caae2 = caae.f172323i;
                }
                b2.mo67668c(caae2);
            }
        }
        yrd b3 = yre.m44651b();
        b3.f54474a = b2.mo67664a();
        b3.f54475b = j.mo67664a();
        b3.f54476c = j2.mo67664a();
        b3.f54477d = b.mo67664a();
        b3.f54479f = cacr.f172611e;
        return b3.mo30685a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo30687a(yre yre) {
        ArrayList arrayList = new ArrayList();
        bnre i = yre.f54481a.listIterator();
        while (i.hasNext()) {
            caae caae = (caae) i.next();
            bxvd da = cabo.f172459e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cabo cabo = (cabo) da.f164949b;
            caae.getClass();
            cabo.f172464d = caae;
            cabo.f172461a |= 4;
            arrayList.add((cabo) da.mo74062i());
        }
        bnre i2 = yre.f54483c.listIterator();
        while (i2.hasNext()) {
            bxvd da2 = cabo.f172459e.mo74144da();
            String str = ((caae) i2.next()).f172326b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cabo cabo2 = (cabo) da2.f164949b;
            str.getClass();
            cabo2.f172461a |= 2;
            cabo2.f172463c = str;
            arrayList.add((cabo) da2.mo74062i());
        }
        ArrayList arrayList2 = new ArrayList();
        bnre i3 = yre.f54485e.listIterator();
        while (i3.hasNext()) {
            caae caae2 = (caae) i3.next();
            bxvd da3 = cabo.f172459e.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cabo cabo3 = (cabo) da3.f164949b;
            caae2.getClass();
            cabo3.f172464d = caae2;
            cabo3.f172461a |= 4;
            arrayList2.add((cabo) da3.mo74062i());
        }
        bxvd da4 = cacr.f172605f.mo74144da();
        String str2 = yre.f54486f;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cacr cacr = (cacr) da4.f164949b;
        str2.getClass();
        cacr.f172607a |= 1;
        cacr.f172611e = str2;
        if (!cacr.f172609c.mo73666a()) {
            cacr.f172609c = bxvk.m124021a(cacr.f172609c);
        }
        bxsy.m123078a(arrayList, cacr.f172609c);
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cacr cacr2 = (cacr) da4.f164949b;
        if (!cacr2.f172608b.mo73666a()) {
            cacr2.f172608b = bxvk.m124021a(cacr2.f172608b);
        }
        bxsy.m123078a(arrayList2, cacr2.f172608b);
        return (cacr) da4.mo74062i();
    }

    /* renamed from: a */
    public final yre mo30688a(byte[] bArr, zrd zrd) {
        return m44653a((cacr) bxvk.m124016a(cacr.f172605f, bArr, bxus.m123744c()));
    }
}

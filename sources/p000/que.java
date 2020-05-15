package p000;

import java.util.ArrayList;

/* renamed from: que */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class que extends qty {
    public que(String str) {
        super(str, bngx.m109376e());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bmxv mo24278a(Object obj) {
        bngx bngx = (bngx) obj;
        if (bngx.isEmpty()) {
            return bmvz.f131120a;
        }
        ArrayList arrayList = new ArrayList();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            arrayList.add(boan.f132470d.mo68794a(((String) i.next()).getBytes()));
        }
        return bmxv.m108566b(bmxr.m108543a(',').mo66874a((Iterable) arrayList).getBytes());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24279a(byte[] bArr) {
        bngs j = bngx.m109377j();
        for (String str : bmyx.m108640a(',').mo66918a((CharSequence) new String(bArr, bmwy.f131158c))) {
            if (!"!".equals(str)) {
                j.mo67668c(new String(boan.f132470d.mo68796b(str), bmwy.f131158c));
            }
        }
        return j.mo67664a();
    }
}

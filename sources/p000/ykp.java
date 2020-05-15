package p000;

import java.util.List;

/* renamed from: ykp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ykp extends ykl {

    /* renamed from: i */
    public static final /* synthetic */ int f53983i = 0;

    /* renamed from: j */
    private static final ygd f53984j = ygv.m44053a(ygv.m44056b(ygv.f53773c), ygv.m44056b(ygv.f53772b));

    /* renamed from: k */
    private final String f53985k;

    /* renamed from: l */
    private final yll f53986l;

    protected ykp(yko yko) {
        super(yko);
        String str = yko.f53980l;
        bmxy.m108581a(str);
        this.f53985k = str;
        this.f53986l = yko.f53981m;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.List, ykn]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List mo30562a(List list, yhg yhg, yhy yhy) {
        ygx ygx;
        int i;
        bngx a = bngx.m109355a(bnjd.m109586b((Iterable) list, (bmxz) new ykn(ygv.m44055b(this.f53919e))));
        if (this.f53986l == null) {
            ygx = yjy.m44262a(a, this.f53919e, this.f53985k);
        } else {
            bngs j = bngx.m109377j();
            int size = a.size();
            int i2 = 0;
            while (i2 < size) {
                ygx ygx2 = (ygx) a.get(i2);
                bnre i3 = this.f53986l.f53896a.listIterator();
                while (true) {
                    i = i2 + 1;
                    if (!i3.hasNext()) {
                        break;
                    } else if (((ygz) i3.next()).f53801f.mo30462a(ygx2.mo30474b())) {
                        j.mo67668c(ygx2);
                    }
                }
                i2 = i;
            }
            ygx = this.f53986l.mo30565b(j.mo67664a(), yhg, yhy);
        }
        bngs j2 = bngx.m109377j();
        if (this.f53986l != null) {
            bmzs.m108696a(ygx);
            j2.mo67668c(ygx);
            j2.mo67666b((Iterable) yjy.m44259a(a, ygv.f53773c));
        } else {
            j2.mo67666b((Iterable) yjy.m44259a(a, ygv.m44056b(f53984j)));
        }
        j2.mo67666b((Iterable) yjy.m44259a(a, f53984j));
        return j2.mo67664a();
    }
}

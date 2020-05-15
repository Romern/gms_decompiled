package p000;

import java.util.List;

/* renamed from: ylk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ylk extends yll {

    /* renamed from: c */
    private final String f54035c;

    /* renamed from: d */
    private final String f54036d;

    /* renamed from: e */
    private final String f54037e;

    /* renamed from: f */
    private final ync f54038f;

    /* renamed from: g */
    private final yfr f54039g;

    public ylk(ylj ylj) {
        super(ylj);
        String str = ylj.f54029a;
        bmxy.m108581a(str);
        this.f54035c = str;
        String str2 = ylj.f54032d;
        bmxy.m108581a(str2);
        this.f54036d = str2;
        String str3 = ylj.f54033e;
        bmxy.m108581a(str3);
        this.f54037e = str3;
        ync ync = ylj.f54034f;
        bmxy.m108581a(ync);
        this.f54038f = ync;
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b(this.f54037e);
        a.mo30420a(yfl.f53726a);
        a.mo30419a(ylj.f54031c);
        this.f54039g = a.mo30415a();
    }

    /* renamed from: b */
    public final String mo30564b() {
        return this.f54035c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54039g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        yhx a = yhy.m44167a(this.f54039g);
        ygx a2 = yjy.m44261a(list, this.f54036d);
        if (a2 == null) {
            return a.mo30520b();
        }
        for (yhu yhu : this.f54038f.mo30501a(a2.mo30473a(), a)) {
            if (yfp.m43973b(yhu, yhg)) {
                yht a3 = a.mo30521c().mo30504a(yhu);
                a3.mo30506a(a2.mo30474b());
                yfp.m43963a(a3, yhu.mo30516i());
            }
        }
        return a.mo30520b();
    }
}

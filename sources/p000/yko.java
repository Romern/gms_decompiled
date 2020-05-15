package p000;

/* renamed from: yko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class yko extends ykk {

    /* renamed from: l */
    public String f53980l;

    /* renamed from: m */
    public yll f53981m;

    /* renamed from: q */
    public String f53982q;

    public yko() {
        super("MergeDistanceDelta");
    }

    public yko(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public yha mo30553a() {
        yha a = super.mo30553a();
        a.mo30485a(new ygy("com.google.activity.segment"));
        a.mo30484a("com.google.activity.segment", yhc.m44077a(ygv.m44052a(this.f53982q), this.f54040r));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ygd mo30558c() {
        yll yll = this.f53981m;
        if (yll == null) {
            return ygv.m44058b(ygv.m44056b(ygv.f53772b), ygv.m44057b(this.f53980l));
        }
        bnre i = yll.f53896a.listIterator();
        while (i.hasNext()) {
            ygz ygz = (ygz) i.next();
            if (ygz.f53800e.equals(this.f53907h)) {
                return ygv.m44058b(ygv.m44056b(ygv.f53772b), ygz.f53801f);
            }
        }
        throw new AssertionError();
    }
}

package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;

/* renamed from: ynx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ynx implements ynm {

    /* renamed from: a */
    private final String f54250a;

    /* renamed from: b */
    private final ynv f54251b;

    /* renamed from: c */
    private final String f54252c;

    /* renamed from: d */
    private final ynn f54253d;

    /* renamed from: e */
    private final bngx f54254e;

    public ynx(ynw ynw) {
        String str = ynw.f54245a;
        bmxy.m108581a(str);
        this.f54250a = str;
        ynv ynv = ynw.f54247c;
        bmxy.m108581a(ynv);
        this.f54251b = ynv;
        String str2 = ynw.f54249e;
        bmxy.m108581a(str2);
        this.f54252c = str2;
        ynn ynn = ynw.f54246b;
        bmxy.m108581a(ynn);
        this.f54253d = ynn;
        ygy ygy = new ygy("com.google.location.sample");
        ygy.f53795j = 10;
        yha yha = new yha(bngx.m109356a(ygy));
        yha.mo30484a("com.google.location.sample", yhc.m44077a(ynw.f54248d, ynw.f54246b));
        this.f54254e = bngx.m109368a((Collection) yha.mo30482a());
    }

    /* renamed from: a */
    private static Object m44461a(Iterable iterable) {
        Iterator it = iterable.iterator();
        bmxy.m108589a(it.hasNext(), "no inputs found");
        Object next = it.next();
        if (it.hasNext()) {
            ypq.m44538a("DistanceFromLocationTransformation", Level.WARNING, "more than one input found: %s", iterable);
        }
        return next;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30587a(yfr yfr) {
        return yfr;
    }

    /* renamed from: a */
    public final yfr mo30588a() {
        return ynl.m44410a(this);
    }

    /* renamed from: b */
    public final yfr mo30605b() {
        return m44462a("{source_stream_id}", (caaq) null);
    }

    /* renamed from: c */
    public final bngx mo30606c() {
        return this.f54254e;
    }

    /* renamed from: d */
    public final String mo30607d() {
        return this.f54250a;
    }

    /* renamed from: a */
    private final yfr m44462a(String str, caaq caaq) {
        yfq a = yfr.m43986a();
        String a2 = bzzr.m126369a(this.f54253d.mo30613a(this.f54252c), str);
        a.mo30416a(1);
        a.mo30421b("com.google.distance.delta");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(a2);
        if (caaq != null) {
            a.mo30418a(caaq);
        }
        return a.mo30415a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ yfr mo30603a(Object obj, Iterable iterable) {
        yfr yfr = (yfr) obj;
        yfr yfr2 = (yfr) m44461a(iterable);
        return m44462a(yfr2.mo30425e(), yfr2.mo30428g());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ygx mo30604a(Object obj, Iterable iterable, yhg yhg, yhy yhy) {
        yfr yfr = (yfr) obj;
        yhx a = yhy.m44167a(m44462a(yfr.mo30425e(), yfr.mo30428g()));
        this.f54251b.mo30638a(((ygx) m44461a(iterable)).mo30473a(), a, yhg);
        return a.mo30520b();
    }
}

package p000;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: bdpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdpe extends bdpc implements bdkj {

    /* renamed from: a */
    static final bnic f106192a = bnic.m109494a("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");

    /* renamed from: e */
    private static final bnrt f106193e = bnrt.m110178a("bdpe");

    /* renamed from: b */
    public final bdkg f106194b;

    /* renamed from: c */
    final ConcurrentHashMap f106195c;

    /* renamed from: d */
    public final bmxv f106196d;

    /* renamed from: f */
    private final bdpz f106197f;

    /* renamed from: g */
    private final cijl f106198g;

    /* renamed from: h */
    private final bdqa f106199h;

    public bdpe(bdkh bdkh, cijl cijl, bmxv bmxv, bmxv bmxv2) {
        this.f106197f = new bdpz(((bdpb) bmxv.mo66814b()).mo58250c());
        this.f106194b = bdkh.mo58105a(bqfb.INSTANCE, this.f106197f);
        this.f106198g = cijl;
        this.f106199h = ((bdpb) bmxv.mo66814b()).mo58249b();
        this.f106195c = (ConcurrentHashMap) bmxv2.mo66812a(new ConcurrentHashMap());
        this.f106196d = ((bdpb) bmxv.mo66814b()).mo58251d();
    }

    /* renamed from: a */
    private final bqgg m91218a(String str, boolean z, cios cios, cimz cimz) {
        return bqga.m112771a(new bdpd(this, str, z, cios, cimz), (Executor) this.f106198g.mo6445a());
    }

    /* renamed from: b */
    public final void mo58031b() {
        this.f106195c.clear();
    }

    /* renamed from: c */
    public final void mo58086c() {
    }

    /* renamed from: a */
    private static cios m91219a(bdij bdij) {
        bxvd da = cios.f191113s.mo74144da();
        bxvd da2 = ciot.f191135d.mo74144da();
        long b = bdik.m90866b(bdij);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ciot ciot = (ciot) da2.f164949b;
        ciot.f191137a |= 1;
        ciot.f191138b = b;
        int a = bdik.m90862a(bdik.m90869e(bdij));
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ciot ciot2 = (ciot) da2.f164949b;
        ciot2.f191139c = a - 1;
        ciot2.f191137a |= 2;
        ciot ciot3 = (ciot) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cios cios = (cios) da.f164949b;
        ciot3.getClass();
        cios.f191119e = ciot3;
        cios.f191115a |= 8;
        return (cios) da.mo74062i();
    }

    /* renamed from: a */
    public final bdij mo58260a() {
        if (!this.f106199h.mo58289a() || this.f106197f.mo58288b()) {
            return bdik.f105698a;
        }
        return bdik.m90864a();
    }

    /* renamed from: a */
    public final bqgg mo58261a(bdij bdij, String str, boolean z) {
        if (bdij.m90860a(bdij) || bmxx.m108577a(str)) {
            return bqga.m112777a((Throwable) new IllegalArgumentException("Can't record an event that was never started or has been stopped already"));
        }
        if (f106192a.contains(str)) {
            return bqga.m112777a((Throwable) new IllegalArgumentException(String.format(Locale.US, "%s is reserved event. Dropping timer.", str)));
        } else if (!this.f106197f.mo58288b()) {
            return m91218a(str, z, m91219a(bdij), null);
        } else {
            return bqga.m112775a((Object) null);
        }
    }

    /* renamed from: a */
    public final bqgg mo58262a(String str, boolean z, long j, long j2, cimz cimz) {
        if (this.f106199h.mo58289a() && !this.f106197f.mo58288b()) {
            if (j <= j2) {
                return m91218a(str, z, m91219a(bdik.m90865a(j, j2)), cimz);
            }
            bnrq bnrq = (bnrq) f106193e.mo68388c();
            bnrq.mo68432a("bdpe", "a", 262, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68417a("Skip timer event: end time %d is before start time %d", j2, j);
        }
        return bqga.m112775a((Object) null);
    }
}

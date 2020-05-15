package p000;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: beju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beju {

    /* renamed from: a */
    private final Map f111678a = new HashMap();

    /* renamed from: b */
    private final Map f111679b = new HashMap();

    /* renamed from: c */
    private final Executor f111680c;

    /* renamed from: d */
    private final befa f111681d;

    /* renamed from: e */
    private final beis f111682e;

    /* renamed from: f */
    private final bqeh f111683f;

    /* renamed from: g */
    private final Map f111684g;

    public beju(Executor executor, befa befa, beis beis, Map map, bely bely) {
        bmxy.m108581a(executor);
        this.f111680c = executor;
        bmxy.m108581a(befa);
        this.f111681d = befa;
        bmxy.m108581a(beis);
        this.f111682e = beis;
        bmxy.m108581a(map);
        this.f111684g = map;
        bmxy.m108588a(!map.isEmpty());
        this.f111683f = bely != null ? new bejs(new bekx(bely, bnzi.m110896a())) : bejt.f111677a;
    }

    /* renamed from: a */
    public final synchronized belh mo60765a(bejr bejr) {
        belh belh;
        Uri uri = ((beik) bejr).f111583a;
        belh = (belh) this.f111678a.get(uri);
        if (belh != null) {
            bmxy.m108596a(bejr.equals((bejr) this.f111679b.get(uri)), "Arguments must match previous call for Uri: %s", uri);
        } else {
            Uri uri2 = ((beik) bejr).f111583a;
            bmxy.m108596a(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String b = bmxx.m108578b(uri2.getLastPathSegment());
            int lastIndexOf = b.lastIndexOf(46);
            boolean z = true;
            bmxy.m108596a((lastIndexOf != -1 ? b.substring(lastIndexOf + 1) : "").equals("pb"), "Uri extension must be .pb: %s", uri2);
            bmxy.m108589a(((beik) bejr).f111584b != null, "Proto schema cannot be null");
            bmxy.m108589a(((beik) bejr).f111588f != null, "Handler cannot be null");
            String b2 = ((beik) bejr).f111586d.mo60751b();
            belj belj = (belj) this.f111684g.get(b2);
            if (belj == null) {
                z = false;
            }
            bmxy.m108596a(z, "No XDataStoreVariantFactory registered for ID %s", b2);
            String b3 = bmxx.m108578b(((beik) bejr).f111583a.getLastPathSegment());
            int lastIndexOf2 = b3.lastIndexOf(46);
            belh belh2 = new belh(belj.mo60753a(bejr, lastIndexOf2 != -1 ? b3.substring(0, lastIndexOf2) : b3, this.f111680c, this.f111681d, beir.ALLOWED), this.f111682e, bqdx.m112674a(bqga.m112775a(((beik) bejr).f111583a), this.f111683f, bqfb.INSTANCE));
            bngx bngx = ((beik) bejr).f111585c;
            if (!bngx.isEmpty()) {
                belh2.mo60779a(new bejp(bngx, this.f111680c));
            }
            this.f111678a.put(uri, belh2);
            this.f111679b.put(uri, bejr);
            belh = belh2;
        }
        return belh;
    }
}

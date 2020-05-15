package p000;

import android.location.Location;
import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: bimy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bimy implements bioa {

    /* renamed from: a */
    public final bine f120934a;

    /* renamed from: b */
    public final rkb f120935b;

    /* renamed from: c */
    public final rkb f120936c;

    /* renamed from: d */
    public final LatLngBounds f120937d;

    /* renamed from: e */
    public bimx f120938e;

    /* renamed from: f */
    public bimu f120939f;

    /* renamed from: g */
    public bimv f120940g;

    /* renamed from: h */
    public bimw f120941h;

    /* renamed from: i */
    public rke f120942i;

    /* renamed from: j */
    public LatLngBounds f120943j;

    /* renamed from: k */
    public LatLngBounds f120944k;

    /* renamed from: l */
    public List f120945l;

    /* renamed from: m */
    public boolean f120946m;

    /* renamed from: n */
    public boolean f120947n = true;

    /* renamed from: o */
    public final aehz f120948o = new bimp(this);

    /* renamed from: p */
    public final aenc f120949p;

    /* renamed from: q */
    public final aejn f120950q;

    /* renamed from: r */
    private final binc f120951r;

    /* renamed from: s */
    private boolean f120952s = true;

    /* renamed from: t */
    private boolean f120953t = false;

    /* renamed from: u */
    private boolean f120954u = false;

    public bimy(bine bine, bils bils, binc binc, LatLngBounds latLngBounds, aejn aejn, aenc aenc, boolean z) {
        this.f120934a = bine;
        this.f120935b = bils.f120857a;
        this.f120936c = bils.f120859c;
        this.f120951r = binc;
        this.f120937d = latLngBounds;
        this.f120950q = aejn;
        this.f120949p = aenc;
        this.f120947n = z;
    }

    /* renamed from: a */
    public static float m102577a(LatLng latLng, LatLng latLng2) {
        Location location = new Location("");
        location.setLatitude(latLng.f79894a);
        location.setLongitude(latLng.f79895b);
        Location location2 = new Location("");
        location2.setLatitude(latLng2.f79894a);
        location2.setLongitude(latLng2.f79895b);
        return location.distanceTo(location2);
    }

    /* renamed from: b */
    public final LatLng mo64778b() {
        Location a = aejn.m51936a(this.f120936c);
        if (a != null) {
            return new LatLng(a.getLatitude(), a.getLongitude());
        }
        return null;
    }

    /* renamed from: c */
    public final void mo64780c() {
        this.f120938e.mo64766a(false);
    }

    /* renamed from: a */
    public final void mo64772a() {
        bimv bimv;
        if (this.f120936c.mo24805i() && (bimv = this.f120940g) != null) {
            aejn.m51937a(this.f120936c, bimv.mo64771b(), this.f120948o, null);
        } else if (this.f120936c.mo24806j()) {
            this.f120936c.mo24790a((rjz) new bimr(this));
        }
    }

    /* renamed from: b */
    public final void mo64779b(binq binq) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (binq == binq.f121027b) {
            z = true;
        } else {
            z = false;
        }
        this.f120952s = z;
        if (binq == binq.f121029d) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f120954u = z2;
        if (binq == binq.f121029d || binq == binq.f121028c) {
            z3 = true;
        }
        this.f120953t = z3;
        this.f120938e.mo64766a(this.f120952s);
        this.f120939f.mo64758b(this.f120954u);
        this.f120939f.mo64757a(this.f120953t);
    }

    /* renamed from: a */
    public final void mo64773a(aelh aelh) {
        int indexOf = this.f120945l.indexOf(aelh);
        if (indexOf == -1) {
            Log.wtf("Places", "Selected place did not come from most recent results");
        }
        binc binc = this.f120951r;
        binc.mo64782a();
        bxvd bxvd = binc.f120966a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bppw bppw = (bppw) bxvd.f164949b;
        bppw bppw2 = bppw.f138664f;
        bppw.f138668c = 2;
        bppw.f138666a |= 64;
        bxvd bxvd2 = binc.f120966a;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bppw bppw3 = (bppw) bxvd2.f164949b;
        bppw3.f138670e = 0;
        bppw3.f138666a |= 512;
        bxvd bxvd3 = binc.f120966a;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppw bppw4 = (bppw) bxvd3.f164949b;
        bppw4.f138666a |= 128;
        bppw4.f138669d = indexOf;
        this.f120934a.mo64788a(aelh);
    }

    /* renamed from: a */
    public final void mo64774a(bimu bimu) {
        float f;
        this.f120939f = bimu;
        if (bimu != null) {
            if (!this.f120953t) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            bimu.mo64756a(f);
            this.f120939f.mo64757a(this.f120953t);
            this.f120939f.mo64758b(this.f120954u);
            List list = this.f120945l;
            if (list != null) {
                ((bime) this.f120939f).f120886b.mo64751a(list);
            }
        }
    }

    /* renamed from: a */
    public final void mo64775a(bimx bimx) {
        this.f120938e = bimx;
        if (bimx != null) {
            bimx.mo64766a(this.f120952s);
        }
    }

    /* renamed from: a */
    public final void mo64776a(binq binq) {
        if (binq == binq.f121027b) {
            this.f120938e.mo64766a(true);
        }
    }

    /* renamed from: a */
    public final void mo64777a(binq binq, float f) {
        if (binq == binq.f121028c || binq == binq.f121029d) {
            this.f120939f.mo64756a(1.0f);
        } else if (binq == binq.f121027b) {
            this.f120939f.mo64756a(f);
        }
    }
}

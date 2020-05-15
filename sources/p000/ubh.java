package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.OnListEntriesResponse;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* renamed from: ubh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ubh implements ucb {

    /* renamed from: a */
    final /* synthetic */ boolean f47121a;

    /* renamed from: b */
    final /* synthetic */ Query f47122b;

    /* renamed from: c */
    final /* synthetic */ Query f47123c;

    /* renamed from: d */
    final /* synthetic */ String f47124d;

    /* renamed from: e */
    final /* synthetic */ Set f47125e;

    /* renamed from: f */
    final /* synthetic */ String f47126f;

    /* renamed from: g */
    final /* synthetic */ utr f47127g;

    /* renamed from: h */
    final /* synthetic */ ubk f47128h;

    /* renamed from: i */
    final /* synthetic */ udv f47129i;

    public ubh(ubk ubk, boolean z, Query query, Query query2, String str, Set set, String str2, utr utr, udv udv) {
        this.f47128h = ubk;
        this.f47121a = z;
        this.f47122b = query;
        this.f47123c = query2;
        this.f47124d = str;
        this.f47125e = set;
        this.f47126f = str2;
        this.f47127g = utr;
        this.f47129i = udv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0142, code lost:
        if (r4.f30754a != false) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0173 A[RETURN] */
    /* renamed from: a */
    public final void mo27069a(List list, boolean z) {
        udv udv;
        Date a;
        this.f47128h.f47144e.mo27435d();
        vpe vpe = null;
        try {
            if (!this.f47121a) {
                if (vgo.m40399a((Filter) this.f47122b.f31087a)) {
                    if (!list.isEmpty()) {
                        ubk ubk = this.f47128h;
                        Query query = this.f47122b;
                        Set set = this.f47125e;
                        uog a2 = !list.isEmpty() ? vgb.m40377a(list) : uoh.f48392b;
                        uhn uhn = ubk.f47144e;
                        uey uey = ubk.f47143d;
                        query.mo18285a();
                        vpe a3 = uhn.mo27408a(uey, query.mo18285a(), a2, null, set, query.f31091e, query.f31093g, list, ubk.mo27105l());
                        uyu.m39798a(a3.f49703a, ubk.f47150k);
                        vpe = a3;
                    }
                    this.f47128h.f47144e.mo27442f();
                    this.f47128h.f47144e.mo27439e();
                    if (vpe != null && this.f47121a) {
                        vpe.mo28719a();
                    }
                    if (!this.f47121a) {
                        return;
                    }
                    if (vpe == null) {
                        udv udv2 = this.f47129i;
                        try {
                            udv2.f47328c.f47238b.mo27107a(new Status(7));
                            udv2.f47326a.mo28257b(7);
                        } catch (RemoteException e) {
                            udv2.f47326a.mo28256b();
                        }
                        udv2.mo27252a();
                        return;
                    }
                    udv = this.f47129i;
                    try {
                        DataHolder dataHolder = vpe.f49703a;
                        udv.f47328c.f47239c.mo28283a(udv.f47327b, false, Integer.valueOf(dataHolder.f30168h), null, null);
                        ubk ubk2 = udv.f47328c.f47237a;
                        Query query2 = udv.f47327b;
                        sdo.m34959a(query2);
                        sdo.m34966a(query2.mo18285a(), "Query can't have null spaces (have you validated them?)");
                        boolean z2 = true;
                        sdo.m34975b(!query2.mo18285a().isEmpty(), "Query can't have empty spaces (have you validated them?)");
                        val val = ubk2.f47155p;
                        if (vgo.m40400a(query2) || (a = val.mo28167a(query2)) == null) {
                            z2 = false;
                        } else {
                            uli a4 = val.f48850b.mo27405a(val.f48851c, vab.m39867a(val.mo28168a(query2, a)), a.getTime());
                            if (a4.f48336ao && a4.mo27691c()) {
                                z2 = false;
                            }
                        }
                        OnListEntriesResponse onListEntriesResponse = new OnListEntriesResponse(dataHolder, z2);
                        try {
                            udv.f47328c.f47238b.mo27947a(onListEntriesResponse);
                        } catch (RemoteException e2) {
                            spn.m35858a(e2);
                            udw.f47329f.mo25372b("QueryOperation", "Cannot pass complete response over binder!");
                            udv.f47326a.mo28257b(8);
                            udv.f47328c.mo6503a(Status.f30109c);
                        }
                    } catch (RemoteException e3) {
                        udv.f47326a.mo28256b();
                    } catch (Throwable th) {
                        vpe.mo28719a();
                        throw th;
                    }
                }
            }
            vpe = this.f47128h.mo27079a(this.f47123c, this.f47124d, this.f47125e, list);
            try {
                if (this.f47121a) {
                    this.f47128h.f47151l.mo27819a(this.f47127g, this.f47122b, this.f47126f, new ubi(this.f47128h, this.f47126f, this.f47122b, this.f47124d, this.f47125e), uqm.m39249a(vpe), z);
                }
                this.f47128h.f47144e.mo27442f();
                this.f47128h.f47144e.mo27439e();
                vpe.mo28719a();
                if (!this.f47121a) {
                }
                vpe.mo28719a();
                udv.mo27252a();
            } catch (Throwable th2) {
                th = th2;
                this.f47128h.f47144e.mo27439e();
                if (vpe != null && this.f47121a) {
                    vpe.mo28719a();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            this.f47128h.f47144e.mo27439e();
            vpe.mo28719a();
            throw th;
        }
    }
}

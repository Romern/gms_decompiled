package p000;

import android.content.Context;
import com.google.android.libraries.rocket.impressions.Session;

/* renamed from: vdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class vdt implements vdl {

    /* renamed from: a */
    protected final bebr f49093a;

    /* renamed from: b */
    protected final Context f49094b;

    public vdt(bebr bebr, Context context) {
        sdo.m34959a(bebr);
        this.f49093a = bebr;
        sdo.m34959a(context);
        this.f49094b = context;
    }

    /* renamed from: a */
    public final void mo28310a() {
        bebr bebr = this.f49093a;
        synchronized (bebr.f106877a) {
            bebr.mo58537a(bebu.NOT_STARTED, "startSession");
            bebr.mo58535a();
            bebr.f106879c.f111419c = bebu.IN_PROGRESS;
        }
    }

    /* renamed from: b */
    public final void mo28311b() {
        bebr bebr = this.f49093a;
        synchronized (bebr.f106877a) {
            bebr.mo58537a(bebu.IN_PROGRESS, "sendHeartbeat");
            if (!bebr.mo58539b()) {
                bebw bebw = bebr.f106880d;
                Session session = bebr.f106879c;
                bebr.mo58536a(bebq.m91736a(bebw, session.f111423g, session.f111424h));
            }
        }
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ vcy mo28312c() {
        throw null;
    }

    /* renamed from: d */
    public vdk mo28316d() {
        return new vdk(this, this.f49094b);
    }

    /* renamed from: a */
    public void mo28314a(vdk vdk) {
        bebr bebr = this.f49093a;
        bebq bebq = new bebq(vdk.f49077b);
        synchronized (bebr.f106877a) {
            bebr.mo58537a(bebu.IN_PROGRESS, "log");
            bebr.mo58539b();
            Session session = bebr.f106879c;
            long j = session.f111422f;
            session.f111422f = 1 + j;
            bebq.mo58534b(j);
            bebq.mo58532a(bebr.f106879c.f111423g);
            bebr.mo58538b(bebq);
        }
    }
}

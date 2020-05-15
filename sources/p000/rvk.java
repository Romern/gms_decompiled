package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rvk {

    /* renamed from: a */
    public bpun f43749a = bpun.UNKNOWN;

    /* renamed from: b */
    public Context f43750b;

    /* renamed from: c */
    public rwg f43751c;

    /* renamed from: d */
    public bngx f43752d;

    /* renamed from: e */
    public bngx f43753e = bngx.m109376e();

    /* renamed from: f */
    public Map f43754f = new HashMap();

    /* renamed from: g */
    public rud f43755g;

    /* renamed from: h */
    public rvj f43756h;

    /* renamed from: i */
    public boolean f43757i;

    /* renamed from: j */
    public boolean f43758j;

    public rvk() {
        bngx bngx;
        if (!cdng.m134178e()) {
            this.f43757i = true;
            bngx = bngx.m109376e();
        } else {
            this.f43757i = false;
            bngx = null;
        }
        this.f43752d = bngx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final rvl mo25198a() {
        boolean z;
        if (this.f43749a != bpun.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Entry Point must be set.");
        Context context = this.f43750b;
        sdo.m34959a(context);
        if (this.f43751c == null) {
            this.f43751c = new rwe(context);
        }
        return new rvl(this);
    }

    /* renamed from: a */
    public final void mo25199a(rvd rvd, int i) {
        mo25200a(rvd, i, null);
    }

    /* renamed from: a */
    public final void mo25200a(rvd rvd, int i, bpup bpup) {
        if (this.f43754f.containsKey(rvd.f43726a)) {
            mo25201a(new rve(rvd.f43726a, i, bpup));
            return;
        }
        String str = rvd.f43726a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
        sb.append("Status of '");
        sb.append(str);
        sb.append("' cannot be updated since no original status was set.");
        throw new IllegalArgumentException(sb.toString());
    }

    public rvk(rvl rvl) {
        this.f43749a = rvl.f43759a;
        this.f43750b = rvl.f43760b;
        this.f43751c = rvl.f43761c;
        this.f43752d = rvl.f43762d;
        this.f43753e = rvl.f43763e;
        bngx g = rvl.f43764f.values().mo67639g();
        for (int i = 0; i < g.size(); i++) {
            rve rve = (rve) g.get(i);
            this.f43754f.put(rve.f43729a, rve);
        }
        this.f43755g = rvl.f43765g;
        this.f43756h = rvl.f43766h;
        this.f43757i = rvl.f43767i;
        this.f43758j = rvl.f43768j;
    }

    /* renamed from: a */
    public final void mo25201a(rve rve) {
        this.f43754f.put(rve.f43729a, rve);
    }
}

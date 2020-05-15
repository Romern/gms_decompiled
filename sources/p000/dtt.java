package p000;

import android.app.PendingIntent;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: dtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dtt {

    /* renamed from: a */
    public final PendingIntent f14009a;

    /* renamed from: b */
    public final String f14010b;

    /* renamed from: c */
    public final HashMap f14011c = new HashMap();

    /* renamed from: d */
    public tnq f14012d = null;

    public dtt(PendingIntent pendingIntent, String str) {
        sdo.m34959a(pendingIntent);
        this.f14009a = pendingIntent;
        sdo.m34977c(str);
        this.f14010b = str;
    }

    /* renamed from: a */
    public final Collection mo9586a() {
        return this.f14011c.values();
    }

    /* renamed from: b */
    public final Set mo9588b() {
        return this.f14011c.keySet();
    }

    /* renamed from: c */
    public final boolean mo9589c() {
        return this.f14011c.isEmpty() && this.f14012d == null;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("p.Int", this.f14009a);
        a.mo25396a("key", this.f14010b);
        a.mo25396a("fenceRec", this.f14011c);
        a.mo25396a("listenerRec", this.f14012d);
        return a.toString();
    }

    /* renamed from: a */
    public final void mo9587a(String str, tnp tnp) {
        this.f14011c.put(str, tnp);
    }
}

package p000;

/* renamed from: agcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agcq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f65225a;

    /* renamed from: b */
    final /* synthetic */ long f65226b;

    /* renamed from: c */
    final /* synthetic */ agcs f65227c;

    public agcq(agcs agcs, String str, long j) {
        this.f65227c = agcs;
        this.f65225a = str;
        this.f65226b = j;
    }

    public final void run() {
        agcs agcs = this.f65227c;
        String str = this.f65225a;
        long j = this.f65226b;
        agcs.mo35242i();
        agcs.mo35241h();
        sdo.m34977c(str);
        Integer num = (Integer) agcs.f65231b.get(str);
        if (num != null) {
            agkt o = agcs.mo35236c().mo35597o();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                agcs.f65231b.remove(str);
                Long l = (Long) agcs.f65230a.get(str);
                if (l == null) {
                    agcs.mo35497E().f65564c.mo35435a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    agcs.f65230a.remove(str);
                    agcs.mo35232a(str, j - longValue, o);
                }
                if (agcs.f65231b.isEmpty()) {
                    long j2 = agcs.f65232c;
                    if (j2 == 0) {
                        agcs.mo35497E().f65564c.mo35435a("First ad exposure time was never set");
                        return;
                    }
                    agcs.mo35231a(j - j2, o);
                    agcs.f65232c = 0;
                    return;
                }
                return;
            }
            agcs.f65231b.put(str, Integer.valueOf(intValue));
            return;
        }
        agcs.mo35497E().f65564c.mo35436a("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}

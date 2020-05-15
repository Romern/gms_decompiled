package p000;

import java.util.Map;

/* renamed from: agcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agcp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f65222a;

    /* renamed from: b */
    final /* synthetic */ long f65223b;

    /* renamed from: c */
    final /* synthetic */ agcs f65224c;

    public agcp(agcs agcs, String str, long j) {
        this.f65224c = agcs;
        this.f65222a = str;
        this.f65223b = j;
    }

    public final void run() {
        agcs agcs = this.f65224c;
        String str = this.f65222a;
        long j = this.f65223b;
        agcs.mo35242i();
        agcs.mo35241h();
        sdo.m34977c(str);
        if (agcs.f65231b.isEmpty()) {
            agcs.f65232c = j;
        }
        Integer num = (Integer) agcs.f65231b.get(str);
        if (num != null) {
            agcs.f65231b.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        Map map = agcs.f65231b;
        if (((C1245ok) map).f26809h < 100) {
            map.put(str, 1);
            agcs.f65230a.put(str, Long.valueOf(j));
            return;
        }
        agcs.mo35497E().f65567f.mo35435a("Too many ads visible");
    }
}

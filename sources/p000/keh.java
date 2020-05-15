package p000;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: keh */
final /* synthetic */ class keh implements bqeg {

    /* renamed from: a */
    private final Map f23928a;

    public keh(Map map) {
        this.f23928a = map;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        Map map = this.f23928a;
        bnia j = bnic.m109500j();
        for (Map.Entry entry : map.entrySet()) {
            try {
                j.mo67752b((Iterable) ((kek) bqga.m112780a((Future) ((bqgg) entry.getValue()))).f23936a);
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof kep) {
                    return bqga.m112777a(cause);
                }
                bnsl bnsl = (bnsl) kei.f23929a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("kei", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Exception happened in datasource: %s", entry.getKey());
            }
        }
        return bqga.m112775a(new kek(j.mo67751a()));
    }
}

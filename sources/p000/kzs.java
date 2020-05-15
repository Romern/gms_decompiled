package p000;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/* renamed from: kzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzs implements kpy {

    /* renamed from: a */
    public static final /* synthetic */ int f25467a = 0;

    /* renamed from: b */
    private static final srn f25468b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: c */
    private final kpk f25469c;

    /* renamed from: d */
    private final bngx f25470d;

    public kzs(kpk kpk, bngx bngx) {
        this.f25469c = kpk;
        this.f25470d = bngx;
    }

    /* renamed from: c */
    private final bqgg m18827c() {
        List list = (List) this.f25469c.mo14762a().stream().map(kzp.f25464a).map(kzq.f25465a).collect(Collectors.toList());
        if (list.isEmpty()) {
            return bqga.m112775a((Object) null);
        }
        bngs b = bngx.m109371b(this.f25470d.size());
        bnre i = this.f25470d.listIterator();
        while (i.hasNext()) {
            b.mo67668c(((kzn) i.next()).mo14950a(list, false));
        }
        return bqga.m112785c(b.mo67664a()).mo69216a(kzr.f25466a, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final kpx mo14774a() {
        try {
            m18827c().get();
            return kpx.SUCCESS;
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) f25468b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kzs", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error completing periodic sync with one or more packages.");
            return kpx.FAILURE;
        }
    }

    /* renamed from: b */
    public final bqgg mo14775b() {
        return bqdx.m112673a(m18827c(), kzo.f25463a, bqfb.INSTANCE);
    }
}

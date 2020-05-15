package p000;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: hlk */
public final /* synthetic */ class hlk implements Callable {

    /* renamed from: a */
    private final bqgg f19981a;

    /* renamed from: b */
    private final bqgg f19982b;

    /* renamed from: c */
    private final bqgg f19983c;

    public hlk(bqgg bqgg, bqgg bqgg2, bqgg bqgg3) {
        this.f19981a = bqgg;
        this.f19982b = bqgg2;
        this.f19983c = bqgg3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hmu.a(quo, boolean):boolean
     arg types: [quo, int]
     candidates:
      hmu.a(java.lang.String, boolean):quo
      hmu.a(quo, boolean):boolean */
    public final Object call() {
        boolean z;
        bqgg bqgg = this.f19981a;
        bqgg bqgg2 = this.f19982b;
        bqgg bqgg3 = this.f19983c;
        bnhe a = bnmt.m109790a((Iterable) bqga.m112780a((Future) bqgg), hlm.f19984a);
        hhy hhy = new hhy();
        boolean z2 = true;
        if (a.containsKey("credentials_enable_service")) {
            z = hmu.m14621a((quo) a.get("credentials_enable_service"), true);
        } else {
            z = true;
        }
        hhy.f19817a = z;
        if (a.containsKey("credentials_enable_autosignin")) {
            z2 = hmu.m14621a((quo) a.get("credentials_enable_autosignin"), true);
        }
        hhy.f19818b = z2;
        hhy.mo12478a((List) bqga.m112780a((Future) bqgg2));
        hhy.f19820d = ((Boolean) bqga.m112780a((Future) bqgg3)).booleanValue();
        return hhy.mo12477a();
    }
}

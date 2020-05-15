package p000;

import android.os.Handler;
import android.os.RemoteException;
import java.util.Collection;
import java.util.Set;

/* renamed from: zjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zjr extends zim {

    /* renamed from: b */
    public static final srn f55240b = zvt.m46581a();

    /* renamed from: c */
    public final Handler f55241c;

    /* renamed from: d */
    private final bnic f55242d;

    /* renamed from: e */
    private final zjo f55243e;

    public zjr(Set set, zgf zgf, zjo zjo, Handler handler) {
        super(zgf);
        this.f55242d = bnic.m109495a((Collection) set);
        this.f55243e = zjo;
        this.f55241c = handler;
    }

    /* renamed from: a */
    static final /* synthetic */ void m45609a(zgg zgg, cadn cadn) {
        try {
            zgg.mo30949a(bngx.m109356a(cadn));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f55240b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zjr", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Couldn't send event to listener %s", zgg);
        }
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        caae caae = zgh.f55011a;
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        if (!this.f55242d.contains(caah.f172336b)) {
            return this.f55149a.mo19155a(zgh);
        }
        cadn a = this.f55243e.mo31175a(caae);
        bqgg a2 = this.f55149a.mo19155a(zgh);
        if (a != null) {
            bqga.m112781a(a2, new zjq(this, a, zgh), bqfb.INSTANCE);
        }
        return a2;
    }
}

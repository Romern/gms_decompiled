package p000;

import com.google.android.gms.auth.api.phone.internal.RequestResult;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: hyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hyk {

    /* renamed from: a */
    public long f20566a;

    /* renamed from: b */
    public RequestResult f20567b;

    /* renamed from: c */
    public final bndu f20568c = bndu.m109109r();

    /* renamed from: d */
    public final bndu f20569d = bndu.m109109r();

    /* renamed from: e */
    public final HashMap f20570e = new HashMap();

    /* renamed from: a */
    public final bngx mo12812a(long j, bngx bngx) {
        bngx bngx2;
        if (bngx.isEmpty()) {
            bngx2 = bngx.m109368a((Collection) this.f20568c.mo67316o());
        } else {
            bngs j2 = bngx.m109377j();
            for (String str : this.f20568c.mo67316o()) {
                if (!bngx.contains(str)) {
                    j2.mo67668c(str);
                }
            }
            bngx2 = j2.mo67664a();
        }
        bnre i = bngx2.listIterator();
        while (i.hasNext()) {
            String str2 = (String) i.next();
            this.f20569d.mo67268a(Long.valueOf(j), new hxx(str2, ((Long) this.f20568c.mo67127c(str2).remove(0)).longValue()));
        }
        return bngx2;
    }

    /* renamed from: a */
    public final void mo12813a(long j, RequestResult requestResult) {
        this.f20566a = j;
        this.f20567b = requestResult;
    }

    /* renamed from: a */
    public final boolean mo12814a() {
        return this.f20568c.mo67314m() && this.f20569d.mo67314m() && this.f20570e.isEmpty();
    }
}

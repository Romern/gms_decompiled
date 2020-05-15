package p000;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

@Deprecated
/* renamed from: sdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sdb extends sbm {

    /* renamed from: a */
    private final sbo f44052a;

    public sdb(Context context, sat sat, rjz rjz, rka rka) {
        super(context, context.getMainLooper(), sbq.m34856a(context), rfi.f42868a, 70, sat, null, null);
        sbo sbo = new sbo(context.getMainLooper(), this);
        this.f44052a = sbo;
        sbo.mo25343a(rjz);
        this.f44052a.mo25344a(rka);
    }

    /* renamed from: a */
    public final void mo25292a(int i) {
        super.mo25292a(i);
        this.f44052a.mo25340a(i);
    }

    /* renamed from: b */
    public final boolean mo25391b(rjz rjz) {
        boolean contains;
        sbo sbo = this.f44052a;
        sdo.m34959a(rjz);
        synchronized (sbo.f44009d) {
            contains = sbo.f44006a.contains(rjz);
        }
        return contains;
    }

    /* renamed from: c */
    public final void mo25392c(rjz rjz) {
        this.f44052a.mo25346b(rjz);
    }

    /* renamed from: j */
    public final void mo14032j() {
        this.f44052a.mo25339a();
        super.mo14032j();
    }

    /* renamed from: x */
    public final void mo25308x() {
        this.f44052a.mo25345b();
        super.mo25308x();
    }

    /* renamed from: a */
    public final void mo16781a(IInterface iInterface) {
        super.mo16781a(iInterface);
        this.f44052a.mo25341a(mo16784m());
    }

    /* renamed from: a */
    public final void mo16782a(ConnectionResult connectionResult) {
        super.mo16782a(connectionResult);
        this.f44052a.mo25342a(connectionResult);
    }

    /* renamed from: a */
    public final void mo25389a(rjz rjz) {
        this.f44052a.mo25343a(rjz);
    }

    /* renamed from: a */
    public final void mo25390a(rka rka) {
        this.f44052a.mo25344a(rka);
    }
}

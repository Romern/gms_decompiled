package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: prv */
public final /* synthetic */ class prv implements aubt {

    /* renamed from: a */
    private final prw f40122a;

    public prv(prw prw) {
        this.f40122a = prw;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        prw prw = this.f40122a;
        Status status = new Status(8, "unknown error");
        if (exc instanceof rjp) {
            rjp rjp = (rjp) exc;
            status = new Status(rjp.mo24655a(), rjp.getMessage());
        }
        int i = prt.f40119b;
        prw.mo17716a(status);
    }
}

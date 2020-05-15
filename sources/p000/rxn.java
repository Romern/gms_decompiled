package p000;

import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: rxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rxn extends ryl implements aaai {

    /* renamed from: a */
    private final String f43824a;

    /* renamed from: b */
    private final aaag f43825b;

    public rxn(aaag aaag, GetServiceRequest getServiceRequest) {
        this.f43824a = getServiceRequest.f30230d;
        this.f43825b = aaag;
    }

    /* renamed from: a */
    public final void mo25241a(ryp ryp, DownloadDetails downloadDetails) {
        this.f43825b.mo16658a(new rxp(ryp, downloadDetails));
    }

    /* renamed from: b */
    public final void mo25243b(ryp ryp, String str) {
        this.f43825b.mo16658a(new rxq(ryp, this.f43824a, str));
    }

    /* renamed from: c */
    public final void mo25244c(ryp ryp, String str) {
        this.f43825b.mo16658a(new rxr(ryp, str));
    }

    /* renamed from: a */
    public final void mo25242a(ryp ryp, String str) {
        this.f43825b.mo16658a(new rxo(ryp, str));
    }
}

package p000;

import org.chromium.net.UrlRequest;

/* renamed from: augs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class augs extends bqdt {

    /* renamed from: a */
    final /* synthetic */ augt f91786a;

    public augs(augt augt) {
        this.f91786a = augt;
    }

    /* renamed from: a */
    public final void mo50515a(aufs aufs) {
        super.mo69138b(aufs);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        if (isCancelled()) {
            augt augt = this.f91786a;
            bqgk bqgk = augt.f91787a.f91796a;
            UrlRequest urlRequest = augt.f91789c;
            urlRequest.getClass();
            bqgk.execute(new augr(urlRequest));
        }
        this.f91786a.f91789c = null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f91786a.f91790d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("HttpRequestFuture[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}

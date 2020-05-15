package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;

/* renamed from: axez */
final /* synthetic */ class axez implements axls {

    /* renamed from: a */
    private final Activity f95871a;

    /* renamed from: b */
    private final axfh f95872b;

    public axez(Activity activity, axfh axfh) {
        this.f95871a = activity;
        this.f95872b = axfh;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        Activity activity = this.f95871a;
        axfh axfh = this.f95872b;
        bzvu bzvu = ((axlt) obj).f96158b;
        if (bzvu != null) {
            ErrorDetails a = axep.m82424a(activity, bzvu);
            int a2 = axks.m82680a(bttb.m117113a(bzvu.f171556c));
            switch (a2) {
                case -16505:
                    axfh.mo53099a(4, a.f110804a, a.f110805b, a.f110808e, a.f110809f);
                    return;
                case -16504:
                    axfh.mo53099a(4, a.f110804a, a.f110805b, null, null);
                    return;
                case -16503:
                    axfh.mo53099a(3, a.f110804a, a.f110805b, null, null);
                    return;
                case -16502:
                    axfh.mo53099a(2, a.f110804a, a.f110805b, null, null);
                    return;
                case -16501:
                    axfh.mo53099a(1, a.f110804a, a.f110805b, null, null);
                    return;
                default:
                    axfh.mo53101a(new Status(a2), a);
                    return;
            }
        } else {
            axfh.mo53101a(new Status(-16500), (ErrorDetails) null);
        }
    }
}

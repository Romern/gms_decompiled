package p000;

import java.util.Arrays;

/* renamed from: uav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uav {

    /* renamed from: a */
    private static final sbw f47067a = new sbw("CompletionHandler", "");

    /* renamed from: b */
    private final uqe f47068b;

    /* renamed from: c */
    private final uhn f47069c;

    public uav(uqe uqe, uhn uhn) {
        sdo.m34959a(uqe);
        this.f47068b = uqe;
        sdo.m34959a(uhn);
        this.f47069c = uhn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27024a(int i, uau uau) {
        String str;
        String str2;
        uau uau2 = uau;
        uaw uaw = uau2.f47059a;
        if (uaw.f47072c) {
            String str3 = uau2.f47064f.f47394a.f47682a;
            if (!uaw.f47073d) {
                str = str3;
            } else {
                str = null;
            }
            if (i == 2) {
                String str4 = uau2.f47061c;
                if (str4 == null) {
                    f47067a.mo25377c("CompletionHandler", "Conflict without baseContentHash!");
                }
                str2 = str4;
            } else {
                str2 = null;
            }
            String str5 = "CompletionHandler";
            upx upx = new upx(uau2.f47060b, str, str3, str2, uau2.f47062d, uau2.f47063e, uaw.f47074e, Arrays.asList(uau2.f47066h), i, uaw.f47075f);
            try {
                uey uey = uau2.f47064f;
                this.f47069c.mo27402a(uey, uau2.f47065g);
                this.f47068b.mo27862a(upx, uey);
            } catch (uaa e) {
                f47067a.mo25378c(str5, String.format("Could not get Entry: %s", uau2.f47065g), e);
            }
        }
    }
}

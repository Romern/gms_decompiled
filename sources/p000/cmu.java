package p000;

import java.io.InputStream;

/* renamed from: cmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cmu implements cdm {

    /* renamed from: a */
    private final cme f7087a;

    /* renamed from: b */
    private final cgr f7088b;

    public cmu(cme cme, cgr cgr) {
        this.f7087a = cme;
        this.f7088b = cgr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cgj mo3743a(Object obj, int i, int i2, cdk cdk) {
        cmr cmr;
        boolean z;
        cqs cqs;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof cmr) {
            cmr = (cmr) inputStream;
            z = false;
        } else {
            cmr = new cmr(inputStream, this.f7088b);
            z = true;
        }
        synchronized (cqs.f11860a) {
            cqs = (cqs) cqs.f11860a.poll();
        }
        if (cqs == null) {
            cqs = new cqs();
        }
        cqs.f11861b = cmr;
        try {
            cgj a = this.f7087a.mo3973a(new cqz(cqs), i, i2, cdk, new cmt(cmr, cqs));
            cqs.mo8159a();
            if (z) {
                cmr.mo3981b();
            }
            return a;
        } catch (Throwable th) {
            cqs.mo8159a();
            if (z) {
                cmr.mo3981b();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3744a(Object obj, cdk cdk) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}

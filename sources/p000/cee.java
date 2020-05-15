package p000;

import java.io.InputStream;

/* renamed from: cee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cee implements cdv {

    /* renamed from: a */
    public final cmr f6607a;

    public cee(InputStream inputStream, cgr cgr) {
        cmr cmr = new cmr(inputStream, cgr);
        this.f6607a = cmr;
        cmr.mark(5242880);
    }

    /* renamed from: b */
    public final void mo3766b() {
        this.f6607a.mo3981b();
    }

    /* renamed from: c */
    public final InputStream mo3765a() {
        this.f6607a.reset();
        return this.f6607a;
    }
}

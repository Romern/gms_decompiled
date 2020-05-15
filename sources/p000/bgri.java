package p000;

import android.os.Message;

/* renamed from: bgri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgri extends bgtf {

    /* renamed from: a */
    public final bmzi f117327a;

    /* renamed from: b */
    public final bmzi f117328b;

    /* renamed from: c */
    vvq f117329c;

    /* renamed from: d */
    long f117330d;

    public bgri(bmzi bmzi, bmzi bmzi2) {
        super("RTDrgrd");
        this.f117327a = bmzi;
        this.f117328b = bmzi2;
    }

    /* renamed from: d */
    private final void m99796d() {
        vvq vvq = this.f117329c;
        if (vvq != null) {
            vvq.mo28907b();
            srn srn = bgrw.f117381a;
            this.f117329c = null;
            this.f117330d = 0;
        }
    }

    /* renamed from: a */
    public final void mo63111a() {
        srn srn = bgrw.f117381a;
        this.f117482h.mo63156c();
    }

    /* renamed from: b */
    public final void mo63113b() {
        srn srn = bgrw.f117381a;
        m99796d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo63114c() {
        this.f117482h.f117486b.mo63149a(13, null, cezv.m138508c());
    }

    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        if (message.what != 13) {
            return false;
        }
        srn srn = bgrw.f117381a;
        if (this.f117330d + cezv.m138508c() <= ((Long) this.f117328b.mo6606a()).longValue()) {
            m99796d();
            return true;
        }
        mo63114c();
        return true;
    }
}

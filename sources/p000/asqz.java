package p000;

import java.util.Collections;

/* renamed from: asqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asqz implements asry {

    /* renamed from: a */
    private final ctg f89471a;

    /* renamed from: b */
    private final String f89472b;

    /* renamed from: c */
    private boolean f89473c = false;

    public asqz(ctm ctm, ctp ctp) {
        ctg a = cth.m7544a(new ctn(ctm, ctp));
        this.f89471a = a;
        a.mo8257a();
        this.f89472b = ctp.f12030a;
    }

    /* renamed from: a */
    public final assf mo3391a() {
        boolean b = this.f89471a.mo8259b();
        boolean z = this.f89473c;
        Collections.emptyMap();
        return new asrw(b ? 1 : 0, z, this.f89472b);
    }

    /* renamed from: a */
    public final byte[] mo3393a(byte[] bArr) {
        if (!(bArr[0] == 0 && bArr[1] == -92)) {
            this.f89473c = true;
        }
        return this.f89471a.mo8258a(bArr);
    }
}

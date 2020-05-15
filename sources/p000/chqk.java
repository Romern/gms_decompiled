package p000;

/* renamed from: chqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chqk extends chqi {

    /* renamed from: a */
    final /* synthetic */ chqi f189003a;

    public chqk() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo85540a(chtr chtr) {
        chqi chqi = this.f189003a;
        cidk cidk = (cidk) chqi;
        bmxy.m108601b(!cidk.f189920h, "apply() or fail() already called");
        bmxy.m108582a(chtr, "headers");
        cidk.f189915c.mo85649a(chtr);
        chrk b = cidk.f189917e.mo85567b();
        try {
            chxs a = ((cidk) chqi).f189913a.mo85744a(((cidk) chqi).f189914b, ((cidk) chqi).f189915c, ((cidk) chqi).f189916d);
            cidk.f189917e.mo85566a(b);
            cidk.mo85990a(a);
        } catch (Throwable th) {
            cidk.f189917e.mo85566a(b);
            throw th;
        }
    }

    public chqk(chqi chqi) {
        this.f189003a = chqi;
    }

    /* renamed from: a */
    public final void mo85539a(chuv chuv) {
        this.f189003a.mo85539a(chuv);
    }
}

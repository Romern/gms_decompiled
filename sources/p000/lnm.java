package p000;

import java.time.Duration;

/* renamed from: lnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lnm implements lis {

    /* renamed from: a */
    final /* synthetic */ lno f26454a;

    public lnm(lno lno) {
        this.f26454a = lno;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return "SmsOtpActivityController::fetch";
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        lno lno = this.f26454a;
        lic lic = lno.f26457e;
        lir lir = lno.f26159a;
        aucb a = lic.f26138b.mo12793a();
        bqgy bqgy = lic.f26137a;
        bqgy.getClass();
        a.mo50375a(lir, new lhz(bqgy));
        return lqv.m19546a(lic.f26137a, Duration.ofMinutes(cckh.f179230a.mo6606a().mo76180e()));
    }
}

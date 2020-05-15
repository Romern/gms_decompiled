package p000;

import android.os.Message;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: bgro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgro extends bgtf {

    /* renamed from: a */
    private final bgsd f117365a;

    /* renamed from: b */
    private bgpv f117366b;

    /* renamed from: c */
    private final bgqw f117367c;

    public bgro(bgsd bgsd, bgqw bgqw) {
        super("RTRep");
        this.f117365a = bgsd;
        this.f117367c = bgqw;
    }

    /* renamed from: a */
    public final void mo63111a() {
        this.f117366b = new bgqc(this.f117367c.f117316a.f117383b);
        this.f117482h.mo63156c();
    }

    /* renamed from: b */
    public final void mo63113b() {
        bgpv bgpv = this.f117366b;
        if (bgpv != null) {
            bgqc bgqc = (bgqc) bgpv;
            bgqc.f117263g.shutdown();
            try {
                ((bgqc) bgpv).f117263g.awaitTermination(cezv.m138513h(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                ((bnsl) bgqc.f117262a.mo68388c()).mo68405a("shutdown incomplete");
            }
            bgqc.f117264h.mo34442a();
            this.f117366b = null;
        }
    }

    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        bgqc bgqc;
        ClientContext c;
        ClientContext c2;
        int i = message.what;
        if (i == 6) {
            srn srn = bgrw.f117381a;
            bgpv bgpv = this.f117366b;
            long j = this.f117365a.mo63082h().f117454d;
            if (!cezv.m138515j() || (c = (bgqc = (bgqc) bgpv).mo63094c()) == null) {
                return false;
            }
            bgqc.mo63093a(j, new bgpy(bgqc, c, j));
            return false;
        } else if (i != 8) {
            return false;
        } else {
            srn srn2 = bgrw.f117381a;
            bgpv bgpv2 = this.f117366b;
            long j2 = this.f117365a.mo63082h().f117454d;
            if (!cezv.m138516k()) {
                return false;
            }
            bgqc bgqc2 = (bgqc) bgpv2;
            bxtx bxtx = (bxtx) bgqc2.f117266k.get();
            if (bxtx.f164797b.equals(bxtx) || (c2 = bgqc2.mo63094c()) == null) {
                return false;
            }
            bgqc2.mo63093a(j2, new bgpz(bgqc2, c2, bxtx));
            return false;
        }
    }
}

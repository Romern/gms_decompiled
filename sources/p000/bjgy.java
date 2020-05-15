package p000;

import java.util.ArrayDeque;
import java.util.Locale;

/* renamed from: bjgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjgy {

    /* renamed from: a */
    final C1230nw f122708a = new C1230nw();

    /* renamed from: b */
    public final C1246ol f122709b = new C1246ol();

    /* renamed from: c */
    public final bjhc f122710c;

    /* renamed from: d */
    private final bjhi f122711d;

    public bjgy(bjhi bjhi, bjhc bjhc) {
        this.f122711d = bjhi;
        this.f122710c = bjhc;
    }

    /* renamed from: a */
    public final bjgt mo65205a(long j) {
        return (bjgt) this.f122708a.mo15534a(j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PresenterManager: [");
        int b = this.f122708a.mo15537b();
        for (int i = 0; i < b; i++) {
            sb.append(this.f122708a.mo15538b(i));
            sb.append(",");
        }
        sb.append(" ] ");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* renamed from: a */
    public final bjgt mo65206a(bjgv bjgv, bwxl bwxl) {
        bjgt bjgt;
        ArrayDeque arrayDeque;
        int i = bwxl.f161390f;
        bjgt bjgt2 = null;
        if (this.f122709b.mo15645e(i) && (arrayDeque = (ArrayDeque) this.f122709b.mo15646f(i)) != null && !arrayDeque.isEmpty()) {
            bjgo bjgo = this.f122711d.f122726c;
            bjgt bjgt3 = (bjgt) arrayDeque.peek();
            if (!bjhz.m103567a().mo65273i() || bjgt3.f122677b.f161390f == 260216775) {
                bjgt = (bjgt) arrayDeque.pop();
                this.f122708a.mo15539b(bjgt.mo65188t());
                if (bjgt == null) {
                    bjgo bjgo2 = this.f122711d.f122726c;
                    switch (bwxl.f161390f) {
                        case 62160224:
                            bjgt2 = new bjqz(bjgv);
                            break;
                        case 62783159:
                            bjgt2 = new bjqw(bjgv);
                            break;
                        case 64497341:
                            bjgt2 = new bjqf(bjgv);
                            break;
                        case 65148490:
                            bjgt2 = new bjpq(bjgv);
                            break;
                        case 213678542:
                            bjgt2 = new bjof(bjgv);
                            break;
                        case 213712846:
                            bjgt2 = new bjrr(bjgv);
                            break;
                        case 214299793:
                            bjgt2 = new bjny(bjgv);
                            break;
                        case 220794720:
                            bjgt2 = new bjpi(bjgv);
                            break;
                        case 228971050:
                            bjgt2 = new bjrp(bjgv);
                            break;
                        case 228971051:
                            bjgt2 = new bjls(bjgv);
                            break;
                        case 228982939:
                            bjgt2 = new bjrh(bjgv);
                            break;
                        case 228982941:
                            bjgt2 = new bjrk(bjgv);
                            break;
                        case 229613734:
                            bjgt2 = new bjqp(bjgv);
                            break;
                        case 229613736:
                            bjgt2 = new bjly(bjgv);
                            break;
                        case 231420908:
                            bjgt2 = new bjqk(bjgv);
                            break;
                        case 232057537:
                            bjgt2 = new bjlo(bjgv);
                            break;
                        case 232060281:
                            bjgt2 = new bjpz(bjgv);
                            break;
                        case 251682194:
                            bjgt2 = new bjri(bjgv);
                            break;
                        case 254667696:
                            bjgt2 = new bjnq(bjgv);
                            break;
                        case 255478364:
                            bjgt2 = new bjre(bjgv);
                            break;
                        case 260216773:
                            bjgt2 = new bjlv(bjgv);
                            break;
                        case 260216775:
                            bjgt2 = new bjll(bjgv);
                            break;
                        case 261261518:
                            bjgt2 = new bjoa(bjgv);
                            break;
                        case 264434503:
                            bjgt2 = new bjlz(bjgv);
                            break;
                        case 265707483:
                            bjgt2 = new bjoi(bjgv);
                            break;
                        case 301214406:
                            bjgt2 = new bjod(bjgv);
                            break;
                    }
                    bmxy.m108582a(bjgt2, String.format(Locale.US, "Unable to create node presenter from node ui reference: %s", Long.valueOf(bwxl.f161386b)));
                    bjgt = bjgt2;
                }
                mo65208a(bwxl, bjgt);
                return bjgt;
            }
        }
        bjgt = null;
        if (bjgt == null) {
        }
        mo65208a(bwxl, bjgt);
        return bjgt;
    }

    /* renamed from: a */
    public final void mo65207a(bjgt bjgt) {
        this.f122708a.mo15539b(bjgt.mo65188t());
    }

    /* renamed from: a */
    public final void mo65208a(bwxl bwxl, bjgt bjgt) {
        this.f122708a.mo15540b(bwxl.f161386b, bjgt);
        if (bjgt.mo65174h()) {
            bjgt.mo65169b("Trying to update when in PRESENTED");
        }
        bjgt.mo65162a(bjgt.f122677b, bwxl);
        bjgt.f122677b = bwxl;
        bjgt.f122678c = 1;
        bjgt.mo65170b(true);
        bjgt.mo65155B();
    }
}

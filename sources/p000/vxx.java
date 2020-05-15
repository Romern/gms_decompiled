package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: vxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxx implements vxu {

    /* renamed from: a */
    private final vxw f50211a;

    /* renamed from: b */
    private final sqv f50212b;

    /* renamed from: c */
    private long f50213c;

    /* renamed from: d */
    private final bxvd f50214d;

    public vxx(vxw vxw) {
        srb srb = srb.f45012a;
        this.f50211a = vxw;
        this.f50212b = srb;
        this.f50214d = bltb.f127660b.mo74144da();
        this.f50213c = -1;
    }

    /* renamed from: a */
    public final bltb mo28933a() {
        return (bltb) this.f50214d.mo74062i();
    }

    /* renamed from: c */
    public final vxx clone() {
        return new vxx(this);
    }

    /* renamed from: a */
    public final void mo28934a(int i, vxw vxw) {
        if (vxw == vxw.NOTHING) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        } else if (vxw.compareTo((Enum) this.f50211a) <= 0) {
            bxvd da = blta.f127655d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blta blta = (blta) da.f164949b;
            blta.f127658b = i - 1;
            blta.f127657a |= 1;
            long nanoTime = System.nanoTime();
            if (this.f50213c >= 0) {
                long millis = TimeUnit.NANOSECONDS.toMillis(nanoTime - this.f50213c);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blta blta2 = (blta) da.f164949b;
                blta2.f127657a |= 2;
                blta2.f127659c = millis;
            }
            this.f50213c = nanoTime;
            bxvd bxvd = this.f50214d;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bltb bltb = (bltb) bxvd.f164949b;
            blta blta3 = (blta) da.mo74062i();
            bltb bltb2 = bltb.f127660b;
            blta3.getClass();
            if (!bltb.f127662a.mo73666a()) {
                bltb.f127662a = GeneratedMessageLite.m124021a(bltb.f127662a);
            }
            bltb.f127662a.add(blta3);
        }
    }

    private vxx(vxx vxx) {
        this.f50211a = vxx.f50211a;
        this.f50212b = vxx.f50212b;
        this.f50214d = vxx.f50214d.clone();
        this.f50213c = vxx.f50213c;
    }
}

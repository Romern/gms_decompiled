package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: asrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asrg implements asri {

    /* renamed from: a */
    final /* synthetic */ asrh f89507a;

    public asrg(asrh asrh) {
        this.f89507a = asrh;
    }

    /* renamed from: a */
    public final void mo49402a() {
        this.f89507a.f89512e = true;
    }

    /* renamed from: b */
    public final void mo49405b() {
        this.f89507a.f89513f = true;
    }

    /* renamed from: a */
    public final void mo49403a(caqu caqu) {
        int i;
        asrh asrh = this.f89507a;
        String a = asrk.m74556a(caqu, asrh.f89516i);
        bnsl a2 = asrh.f89508a.mo26019b(aske.m74275a());
        a2.mo68432a("asrh", "a", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a2.mo68420a("Transaction id is: %s", a);
        if (a != null) {
            asrh.f89511d.f89414j = a;
        }
        int i2 = caqu.f175619f;
        int i3 = i2 - 1;
        if (i2 != 0) {
            switch (i3) {
                case 0:
                case 1:
                case 4:
                    i = -1;
                    break;
                case 2:
                case 3:
                    if (asrh.f89513f) {
                        i = 21;
                        break;
                    } else {
                        i = 19;
                        break;
                    }
                case 5:
                    i = 15;
                    break;
                case 6:
                    i = 26;
                    break;
                default:
                    i = 0;
                    break;
            }
            asrh.f89515h = i;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo49404a(caso caso, casy casy) {
        asqu asqu = this.f89507a.f89511d;
        int d = casy.mo74832d();
        boolean z = false;
        boolean z2 = d == 2;
        if (d != 0) {
            asqu.f89409e = z2;
            if (casy.mo74831c()) {
                this.f89507a.f89511d.f89410f = asqv.CDCVM;
            }
            this.f89507a.f89511d.f89416l = caso.mo74823a().equals(cass.f175790b) ? bozu.MC_MSD : bozu.MC_EMV;
            asqu asqu2 = this.f89507a.f89511d;
            if (casy.mo74833e() == 4) {
                z = true;
            }
            asqu2.f89411g = z;
            this.f89507a.f89514g = caso.mo74825b();
            return;
        }
        throw null;
    }
}

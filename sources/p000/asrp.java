package p000;

/* renamed from: asrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asrp implements asri {

    /* renamed from: a */
    final /* synthetic */ caou f89532a;

    /* renamed from: b */
    final /* synthetic */ asrr f89533b;

    public asrp(asrr asrr, caou caou) {
        this.f89533b = asrr;
        this.f89532a = caou;
    }

    /* renamed from: a */
    public final void mo49402a() {
        this.f89533b.f89536b = true;
    }

    /* renamed from: a */
    public final void mo49404a(caso caso, casy casy) {
    }

    /* renamed from: b */
    public final void mo49405b() {
    }

    /* renamed from: a */
    public final void mo49403a(caqu caqu) {
        int i;
        byte[] bArr = caqu.f175614a;
        asrr asrr = this.f89533b;
        if (bArr == null) {
            bArr = this.f89532a.mo49410c();
        }
        asrr.f89537c = asti.m74760a(bArr);
        int i2 = caqu.f175619f;
        int i3 = i2 - 1;
        if (i2 != 0) {
            asrr asrr2 = this.f89533b;
            switch (i3) {
                case 0:
                case 1:
                case 4:
                    i = 1;
                    break;
                case 2:
                case 3:
                    i = 5;
                    break;
                case 5:
                case 6:
                    i = 7;
                    break;
                default:
                    i = 0;
                    break;
            }
            asrr2.f89535a = i;
            return;
        }
        throw null;
    }
}

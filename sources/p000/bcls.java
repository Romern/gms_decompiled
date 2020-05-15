package p000;

/* renamed from: bcls */
final /* synthetic */ class bcls implements C1228nu {

    /* renamed from: a */
    private final bxvd f104446a;

    public bcls(bxvd bxvd) {
        this.f104446a = bxvd;
    }

    /* renamed from: a */
    public final void mo9443a(Object obj) {
        bxvd bxvd = this.f104446a;
        int i = ((bcui) obj).f104926g;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 7 : 6 : 5;
        }
        bxvd da = cbgh.f177032b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbgh) da.f164949b).f177034a = i2 - 2;
        cbgh cbgh = (cbgh) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cbgc cbgc = cbgc.f177010e;
        cbgh.getClass();
        ((cbgc) bxvd.f164949b).f177013b = cbgh;
    }
}

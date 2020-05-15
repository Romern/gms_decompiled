package p000;

/* renamed from: rco */
final /* synthetic */ class rco implements bmxj {

    /* renamed from: a */
    private final long f42646a;

    /* renamed from: b */
    private final rct f42647b;

    /* renamed from: c */
    private final bxvd f42648c;

    public rco(long j, rct rct, bxvd bxvd) {
        this.f42646a = j;
        this.f42647b = rct;
        this.f42648c = bxvd;
    }

    public final Object apply(Object obj) {
        long j = this.f42646a;
        rct rct = this.f42647b;
        bxvd bxvd = this.f42648c;
        cafw cafw = (cafw) obj;
        int i = rde.f42700a;
        bxvd bxvd2 = (bxvd) cafw.mo74142c(5);
        bxvd2.mo73625a((bxvk) cafw);
        int i2 = 0;
        while (i2 < ((cafw) bxvd2.f164949b).f173025a.size()) {
            cafv cafv = (cafv) ((cafw) bxvd2.f164949b).f173025a.get(i2);
            if (cafv.f173021d < j) {
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                cafw cafw2 = (cafw) bxvd2.f164949b;
                cafw cafw3 = cafw.f173023b;
                cafw2.mo74639c();
                cafw2.f173025a.remove(i2);
                i2--;
            } else if (rct.compareTo(new rct((long) cafv.f173019b, cafv.f173020c)) < 0) {
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                cafw cafw4 = (cafw) bxvd2.f164949b;
                cafv cafv2 = (cafv) bxvd.mo74062i();
                cafw cafw5 = cafw.f173023b;
                cafv2.getClass();
                cafw4.mo74639c();
                cafw4.f173025a.add(i2, cafv2);
                return (cafw) bxvd2.mo74062i();
            }
            i2++;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        cafw cafw6 = (cafw) bxvd2.f164949b;
        cafv cafv3 = (cafv) bxvd.mo74062i();
        cafw cafw7 = cafw.f173023b;
        cafv3.getClass();
        cafw6.mo74639c();
        cafw6.f173025a.add(cafv3);
        return (cafw) bxvd2.mo74062i();
    }
}

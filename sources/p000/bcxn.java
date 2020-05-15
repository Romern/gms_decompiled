package p000;

/* renamed from: bcxn */
final /* synthetic */ class bcxn implements bmxj {

    /* renamed from: a */
    static final bmxj f105104a = new bcxn();

    private bcxn() {
    }

    public final Object apply(Object obj) {
        bczy bczy = (bczy) obj;
        bdac bdac = bdac.RICH_TEXT;
        bczv bczv = bczv.STACK_COMPONENT;
        bczj bczj = bczj.STACK_CARD;
        int ordinal = bczy.mo57657b().ordinal();
        if (ordinal == 0) {
            bxvd da = cbfy.f176988d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbfy) da.f164949b).f176992c = cbeo.m127781a(3);
            bczx a = bczy.mo57656a();
            bxvd da2 = cbfv.f176976b.mo74144da();
            bngx a2 = bbow.m88301a(a.mo57754a(), bcxo.f105105a);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbfv cbfv = (cbfv) da2.f164949b;
            if (!cbfv.f176978a.mo73666a()) {
                cbfv.f176978a = GeneratedMessageLite.m124021a(cbfv.f176978a);
            }
            bxsy.m123078a(a2, cbfv.f176978a);
            cbfv cbfv2 = (cbfv) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbfy cbfy = (cbfy) da.f164949b;
            cbfv2.getClass();
            cbfy.f176991b = cbfv2;
            cbfy.f176990a = 101;
            return (cbfy) da.mo74062i();
        } else if (ordinal == 1) {
            bxvd da3 = cbfy.f176988d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((cbfy) da3.f164949b).f176992c = cbeo.m127781a(4);
            cbfz a3 = bcxu.m90218a(bczy.mo57661c());
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cbfy cbfy2 = (cbfy) da3.f164949b;
            a3.getClass();
            cbfy2.f176991b = a3;
            cbfy2.f176990a = 102;
            return (cbfy) da3.mo74062i();
        } else {
            throw new IllegalArgumentException("Got unknown ui component model type");
        }
    }
}

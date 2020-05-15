package p000;

/* renamed from: bclt */
final /* synthetic */ class bclt implements bmxj {

    /* renamed from: a */
    static final bmxj f104447a = new bclt();

    private bclt() {
    }

    public final Object apply(Object obj) {
        bcue bcue = (bcue) obj;
        bcul bcul = bcul.UNKNOWN;
        bcug bcug = bcug.UNKNOWN;
        int ordinal = bcue.mo57214a().ordinal();
        if (ordinal == 1) {
            bxvd da = cbgg.f177027d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbgg) da.f164949b).f177031c = cbeq.m127784a(3);
            bxvd da2 = cbge.f177021b.mo74144da();
            int b = bcue.mo57218b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((cbge) da2.f164949b).f177023a = b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbgg cbgg = (cbgg) da.f164949b;
            cbge cbge = (cbge) da2.mo74062i();
            cbge.getClass();
            cbgg.f177030b = cbge;
            cbgg.f177029a = 2;
            return (cbgg) da.mo74062i();
        } else if (ordinal != 2) {
            String valueOf = String.valueOf(bcue.mo57214a());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Unable to convert rich text line style to proto: ");
            sb.append(valueOf);
            bbos.m88293c("RichTextProtoConvUtils", sb.toString());
            return cbgg.f177027d;
        } else {
            bxvd da3 = cbgg.f177027d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((cbgg) da3.f164949b).f177031c = cbeq.m127784a(4);
            cbgb cbgb = cbgb.f177008a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cbgg cbgg2 = (cbgg) da3.f164949b;
            cbgb.getClass();
            cbgg2.f177030b = cbgb;
            cbgg2.f177029a = 3;
            return (cbgg) da3.mo74062i();
        }
    }
}

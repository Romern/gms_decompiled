package p000;

/* renamed from: bclo */
final /* synthetic */ class bclo implements bmxj {

    /* renamed from: a */
    static final bmxj f104438a = new bclo();

    private bclo() {
    }

    public final Object apply(Object obj) {
        int i;
        bcun bcun = (bcun) obj;
        switch (bcun.f104953j) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            String valueOf = String.valueOf(bcun);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Unrecognized typeface with weight type: ");
            sb.append(valueOf);
            bbos.m88293c("RichTextProtoConvUtils", sb.toString());
            return cbgk.f177043b;
        }
        bxvd da = cbgk.f177043b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbgk) da.f164949b).f177045a = i - 2;
        return (cbgk) da.mo74062i();
    }
}

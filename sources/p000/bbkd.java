package p000;

/* renamed from: bbkd */
final /* synthetic */ class bbkd implements bmxj {

    /* renamed from: a */
    static final bmxj f102803a = new bbkd();

    private bbkd() {
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final Object apply(Object obj) {
        char c;
        bxvd da = bbjs.f102776g.mo74144da();
        bxwc bxwc = ((batr) obj).f101726g;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bato bato = (bato) bxwc.get(i);
            String str = bato.f101713b;
            switch (str.hashCode()) {
                case -2049574418:
                    if (str.equals("medium-photo-id")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1840965476:
                    if (str.equals("small-photo-id")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -208474537:
                    if (str.equals("thumbnail-photo-id")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 593669352:
                    if (str.equals("large-photo-id")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1883898563:
                    if (str.equals("tiny-photo-id")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                String str2 = bato.f101714c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bbjs bbjs = (bbjs) da.f164949b;
                str2.getClass();
                bbjs.f102778a |= 1;
                bbjs.f102779b = str2;
            } else if (c == 1) {
                String str3 = bato.f101714c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bbjs bbjs2 = (bbjs) da.f164949b;
                str3.getClass();
                bbjs2.f102778a |= 2;
                bbjs2.f102780c = str3;
            } else if (c == 2) {
                String str4 = bato.f101714c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bbjs bbjs3 = (bbjs) da.f164949b;
                str4.getClass();
                bbjs3.f102778a |= 4;
                bbjs3.f102781d = str4;
            } else if (c == 3) {
                String str5 = bato.f101714c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bbjs bbjs4 = (bbjs) da.f164949b;
                str5.getClass();
                bbjs4.f102778a |= 8;
                bbjs4.f102782e = str5;
            } else if (c == 4) {
                String str6 = bato.f101714c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bbjs bbjs5 = (bbjs) da.f164949b;
                str6.getClass();
                bbjs5.f102778a |= 16;
                bbjs5.f102783f = str6;
            }
        }
        return (bbjs) da.mo74062i();
    }
}

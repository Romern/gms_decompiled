package p000;

/* renamed from: bcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcz {

    /* renamed from: a */
    private static final bed f3022a = bed.m2754a("ty", "d");

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r2.equals("gs") != false) goto L_0x00be;
     */
    /* renamed from: a */
    static bbo m2718a(bef bef, axw axw) {
        bbo bbo;
        String str;
        bef.mo3024c();
        char c = 2;
        int i = 2;
        while (true) {
            bbo = null;
            if (!bef.mo3026e()) {
                str = null;
                break;
            }
            int a = bef.mo3019a(f3022a);
            if (a == 0) {
                str = bef.mo3029h();
                break;
            } else if (a != 1) {
                bef.mo3028g();
                bef.mo3033l();
            } else {
                i = bef.mo3032k();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                if (str.equals("gf")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                bbo = bdw.m2747a(bef, axw);
                break;
            case 1:
                bbo = bdy.m2749a(bef, axw);
                break;
            case 2:
                bbo = bdg.m2725a(bef, axw);
                break;
            case 3:
                bbo = bdv.m2746a(bef, axw);
                break;
            case 4:
                bbo = bdf.m2724a(bef, axw);
                break;
            case 5:
                bbo = bcv.m2707a(bef, axw);
                break;
            case 6:
                bbo = bdx.m2748a(bef, axw);
                break;
            case 7:
                bbo = bcx.m2716a(bef, axw, i);
                break;
            case 8:
                bbo = bdr.m2742a(bef, axw);
                break;
            case 9:
                bbo = bdz.m2750a(bef, axw);
                break;
            case 10:
                bbo = bdq.m2741a(bef, axw);
                break;
            case 11:
                bbo = bdn.m2738a(bef);
                axw.mo2859a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 12:
                bbo = bds.m2743a(bef, axw);
                break;
            default:
                bek.m2805a("Unknown shape type " + str);
                break;
        }
        while (bef.mo3026e()) {
            bef.mo3033l();
        }
        bef.mo3025d();
        return bbo;
    }
}

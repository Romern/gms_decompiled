package p000;

/* renamed from: bdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdq {

    /* renamed from: a */
    private static final bed f3051a = bed.m2754a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX WARN: Failed to insert an additional move for type inference into block B:37:0x0010 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:26:0x0010 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r2v0, assign insn: 0x0004: CONST  (r2v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean], assign insn: PHI: (r2v1 ?) = (r2v0 ?), (r2v2 ?) binds: [B:0:0x0000, B:26:0x0010] */
    /* JADX WARN: Type inference failed for: r2v2, assign insn: PHI: (r2v2 ?) = (r2v3 ?), (r2v5 ?), (r2v6 ?), (r2v1 ?), (r2v1 ?), (r2v1 ?), (r2v1 ?), (r2v1 ?), (r2v1 ?), (r2v1 ?), (r2v1 ?), (r2v8 ?) binds: [B:40:0x0010, B:38:0x0010, B:39:0x0010, B:37:0x0010, B:36:0x0010, B:35:0x0010, B:34:0x0010, B:33:0x0010, B:32:0x0010, B:31:0x0010, B:30:0x0010, B:29:0x0010] */
    /* JADX WARN: Type inference failed for: r2v3, assign insn: 0x0074: CONST  (r2v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r2v4, types: [int], assign insn: PHI: (r2v4 ?) = (r2v1 ?), (r2v9 ?) binds: [B:14:0x0053, B:21:0x006a] */
    /* JADX WARN: Type inference failed for: r2v5, assign insn: 0x005f: CONST  (r2v5 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r2v6, assign insn: 0x0068: CONST  (r2v6 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r2v8, assign insn: 0x0025: CONST  (r2v8 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r2v9, assign insn: ?: MOVE  (r2v9 ?) = (r2v7 int) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    static bbu m2741a(bef bef, axw axw) {
        bef bef2 = bef;
        axw axw2 = axw;
        ? r2 = 0;
        String str = null;
        bba bba = null;
        bbl bbl = null;
        bba bba2 = null;
        bba bba3 = null;
        bba bba4 = null;
        bba bba5 = null;
        bba bba6 = null;
        int i = 0;
        boolean z = false;
        while (bef.mo3026e()) {
            switch (bef2.mo3019a(f3051a)) {
                case 0:
                    str = bef.mo3029h();
                    r2 = 0;
                    break;
                case 1:
                    int k = bef.mo3032k();
                    char c = 2;
                    int[] iArr = {1, 2};
                    while (true) {
                        if (r2 >= c) {
                            r2 = 0;
                            i = 0;
                            break;
                        } else {
                            i = iArr[r2];
                            if (i == 0) {
                                throw null;
                            } else if (i == k) {
                                r2 = 0;
                                break;
                            } else {
                                c = 2;
                                r2++;
                            }
                        }
                    }
                case 2:
                    bba = bcw.m2709a(bef2, axw2, (boolean) r2);
                    break;
                case 3:
                    bbl = bct.m2705b(bef, axw);
                    break;
                case 4:
                    bba2 = bcw.m2709a(bef2, axw2, (boolean) r2);
                    break;
                case 5:
                    bba4 = bcw.m2708a(bef, axw);
                    break;
                case 6:
                    bba6 = bcw.m2709a(bef2, axw2, (boolean) r2);
                    break;
                case 7:
                    bba3 = bcw.m2708a(bef, axw);
                    break;
                case 8:
                    bba5 = bcw.m2709a(bef2, axw2, (boolean) r2);
                    break;
                case 9:
                    z = bef.mo3030i();
                    break;
                default:
                    bef.mo3028g();
                    bef.mo3033l();
                    r2 = 0;
                    break;
            }
        }
        return new bbu(str, i, bba, bbl, bba2, bba3, bba4, bba5, bba6, z);
    }
}

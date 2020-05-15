package p000;

/* renamed from: canr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum canr {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: k */
    public final int f175410k;

    /* renamed from: l */
    private final int[] f175411l;

    private canr(int[] iArr, int i) {
        this.f175411l = iArr;
        this.f175410k = i;
    }

    /* renamed from: a */
    public final int mo74703a(canu canu) {
        int i = canu.f175417a;
        return this.f175411l[i > 9 ? i <= 26 ? (char) 1 : 2 : 0];
    }
}

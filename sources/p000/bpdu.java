package p000;

/* renamed from: bpdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpdu implements bxvp {
    UNKNOWN_APPLICATION(0),
    GEARHEAD(1),
    GSA(2),
    GMM(3),
    GPM(4),
    TTS(5),
    KAKAO_NAVI(6),
    WAZE(7);
    

    /* renamed from: i */
    private final int f136399i;

    private bpdu(int i) {
        this.f136399i = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f136399i;
    }

    public final String toString() {
        return Integer.toString(this.f136399i);
    }
}

package p000;

/* renamed from: biwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum biwf implements bxvp {
    VIDEO_800x480(1),
    VIDEO_1280x720(2),
    VIDEO_1920x1080(3),
    VIDEO_2560x1440(4),
    VIDEO_3840x2160(5),
    VIDEO_720x1280(6),
    VIDEO_1080x1920(7),
    VIDEO_1440x2560(8),
    VIDEO_2160x3840(9);
    

    /* renamed from: j */
    public final int f122090j;

    private biwf(int i) {
        this.f122090j = i;
    }

    /* renamed from: a */
    public static biwf m102896a(int i) {
        switch (i) {
            case 1:
                return VIDEO_800x480;
            case 2:
                return VIDEO_1280x720;
            case 3:
                return VIDEO_1920x1080;
            case 4:
                return VIDEO_2560x1440;
            case 5:
                return VIDEO_3840x2160;
            case 6:
                return VIDEO_720x1280;
            case 7:
                return VIDEO_1080x1920;
            case 8:
                return VIDEO_1440x2560;
            case 9:
                return VIDEO_2160x3840;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m102897b() {
        return biwe.f122079a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f122090j;
    }

    public final String toString() {
        return Integer.toString(this.f122090j);
    }
}

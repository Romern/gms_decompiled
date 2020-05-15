package p000;

/* renamed from: bzcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzcq implements bxvp {
    UNKNOWN(0),
    WHATSAPP_PROFILE(1),
    WHATSAPP_VOIP_CALL(2),
    WHATSAPP_VIDEO_CALL(3),
    LINE_PROFILE(4);
    

    /* renamed from: f */
    public final int f169401f;

    private bzcq(int i) {
        this.f169401f = i;
    }

    /* renamed from: a */
    public static bzcq m125652a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return WHATSAPP_PROFILE;
        }
        if (i == 2) {
            return WHATSAPP_VOIP_CALL;
        }
        if (i == 3) {
            return WHATSAPP_VIDEO_CALL;
        }
        if (i != 4) {
            return null;
        }
        return LINE_PROFILE;
    }

    /* renamed from: b */
    public static bxvr m125653b() {
        return bzcp.f169394a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f169401f;
    }

    public final String toString() {
        return Integer.toString(this.f169401f);
    }
}

package p000;

/* renamed from: bavq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bavq implements bxvp {
    NONE(0),
    SUBSCRIBED(1),
    DOWNLOAD_IN_PROGRESS(2),
    DOWNLOAD_FAILED(3),
    DOWNLOAD_COMPLETE(4),
    INTERNAL_ERROR(5);
    

    /* renamed from: g */
    public final int f101915g;

    private bavq(int i) {
        this.f101915g = i;
    }

    /* renamed from: a */
    public static bavq m87609a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return SUBSCRIBED;
        }
        if (i == 2) {
            return DOWNLOAD_IN_PROGRESS;
        }
        if (i == 3) {
            return DOWNLOAD_FAILED;
        }
        if (i == 4) {
            return DOWNLOAD_COMPLETE;
        }
        if (i != 5) {
            return null;
        }
        return INTERNAL_ERROR;
    }

    /* renamed from: b */
    public static bxvr m87610b() {
        return bavp.f101907a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f101915g;
    }

    public final String toString() {
        return Integer.toString(this.f101915g);
    }
}

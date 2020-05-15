package p000;

/* renamed from: aaqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aaqg implements bxvp {
    DOZE_QUEUE_EVENT_UNKNOWN(0),
    WRITTEN_TO_DOZE_QUEUE(1),
    SENT_ON_LEAVING_DOZE(2),
    SENT_ON_GMSCORE_RESTART(3);
    

    /* renamed from: e */
    public final int f28888e;

    private aaqg(int i) {
        this.f28888e = i;
    }

    /* renamed from: a */
    public static aaqg m21813a(int i) {
        if (i == 0) {
            return DOZE_QUEUE_EVENT_UNKNOWN;
        }
        if (i == 1) {
            return WRITTEN_TO_DOZE_QUEUE;
        }
        if (i == 2) {
            return SENT_ON_LEAVING_DOZE;
        }
        if (i != 3) {
            return null;
        }
        return SENT_ON_GMSCORE_RESTART;
    }

    /* renamed from: b */
    public static bxvr m21814b() {
        return aaqf.f28882a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f28888e;
    }

    public final String toString() {
        return Integer.toString(this.f28888e);
    }
}

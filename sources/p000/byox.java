package p000;

/* renamed from: byox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byox implements bxvp {
    IMMEDIATE_TRIGGER(0),
    AUTH_INTENT_TRIGGER(1),
    PROXIMITY_TRIGGER(2),
    SERVER_SYNC_TRIGGER(3);
    

    /* renamed from: e */
    public final int f167278e;

    private byox(int i) {
        this.f167278e = i;
    }

    /* renamed from: a */
    public static byox m125045a(int i) {
        if (i == 0) {
            return IMMEDIATE_TRIGGER;
        }
        if (i == 1) {
            return AUTH_INTENT_TRIGGER;
        }
        if (i == 2) {
            return PROXIMITY_TRIGGER;
        }
        if (i != 3) {
            return null;
        }
        return SERVER_SYNC_TRIGGER;
    }

    /* renamed from: b */
    public static bxvr m125046b() {
        return byow.f167272a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f167278e;
    }

    public final String toString() {
        return Integer.toString(this.f167278e);
    }
}

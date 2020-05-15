package p000;

/* renamed from: advd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum advd implements bxvp {
    SYNC_ID_UNKNOWN(0),
    SYNC_ID_SETTINGS_UPLOAD(1),
    SYNC_ID_ULP_DOWNLOAD(2),
    SYNC_ID_WIPEOUT(3),
    SYNC_ID_SETTINGS_CLEANUP(4);
    

    /* renamed from: f */
    private final int f62797f;

    private advd(int i) {
        this.f62797f = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f62797f;
    }

    public final String toString() {
        return Integer.toString(this.f62797f);
    }
}

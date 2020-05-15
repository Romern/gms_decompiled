package p000;

/* renamed from: bpdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpdt implements bxvp {
    NOTIFICATION_SHOWN(1),
    NOTIFICATION_DISMISSED(2),
    PROMPT_SHOWN(4),
    PROMPT_DISMISSED(8),
    RESPONSE_ENJOYING(16),
    RESPONSE_NOT_ENJOYING(32),
    OPEN_PLAY_STORE(64),
    OPEN_HELP_FEEDBACK(128);
    

    /* renamed from: i */
    public final int f136389i;

    private bpdt(int i) {
        this.f136389i = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f136389i;
    }

    public final String toString() {
        return Integer.toString(this.f136389i);
    }
}

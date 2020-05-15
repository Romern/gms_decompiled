package p000;

/* renamed from: uml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum uml {
    UNPINNED(0),
    PINNED_ACTIVE(1),
    PINNED_PAUSED(2);
    

    /* renamed from: d */
    public final long f48221d;

    private uml(long j) {
        this.f48221d = j;
    }

    /* renamed from: a */
    public final boolean mo27695a() {
        return UNPINNED.equals(this);
    }

    /* renamed from: b */
    public final boolean mo27696b() {
        return PINNED_ACTIVE.equals(this);
    }

    /* renamed from: c */
    public final boolean mo27697c() {
        return PINNED_PAUSED.equals(this);
    }
}

package p000;

import java.util.UUID;

/* renamed from: blij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class blij implements bljg {

    /* renamed from: a */
    private final bljg f126617a;

    /* renamed from: b */
    private final UUID f126618b;

    /* renamed from: c */
    private final String f126619c;

    public blij(String str, bljg bljg) {
        this.f126619c = str;
        this.f126617a = bljg;
        this.f126618b = bljg.mo66574b();
    }

    /* renamed from: a */
    public final bljg mo66573a() {
        return this.f126617a;
    }

    /* renamed from: b */
    public final UUID mo66574b() {
        return this.f126618b;
    }

    /* renamed from: c */
    public final String mo66575c() {
        return this.f126619c;
    }

    public final void close() {
        blkh.m107288a(this);
    }

    public final String toString() {
        return blkh.m107297c(this);
    }

    public blij(String str, UUID uuid) {
        this.f126619c = str;
        this.f126617a = null;
        this.f126618b = uuid;
    }
}

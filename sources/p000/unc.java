package p000;

import android.content.ContentValues;

/* renamed from: unc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class unc extends uny {

    /* renamed from: c */
    public static final /* synthetic */ int f48297c = 0;

    /* renamed from: a */
    public final String f48298a;

    /* renamed from: b */
    public final long f48299b;

    /* renamed from: d */
    private final ukk f48300d;

    public unc(uno uno, long j, String str, ukk ukk, long j2) {
        super(uno, unf.f48306a, j);
        this.f48298a = vpc.m40993a(str);
        sdo.m34959a(ukk);
        this.f48300d = ukk;
        this.f48299b = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(une.CONTENT_HASH.f48305d.mo27700a(), this.f48298a);
        contentValues.put(une.ENTRY_ID.f48305d.mo27700a(), Long.valueOf(this.f48300d.f47941a));
        contentValues.put(une.VERSION.f48305d.mo27700a(), Long.valueOf(this.f48299b));
    }

    public final String toString() {
        return String.format("Thumbnail [contentHash=%s, entrySpec=%s, version=%d]", this.f48298a, this.f48300d, Long.valueOf(this.f48299b));
    }
}

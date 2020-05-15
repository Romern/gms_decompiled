package p000;

import android.content.ContentValues;

/* renamed from: ulv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ulv extends uny {

    /* renamed from: b */
    public static final /* synthetic */ int f48162b = 0;

    /* renamed from: a */
    public final String f48163a;

    /* renamed from: c */
    private final ukk f48164c;

    /* renamed from: d */
    private final long f48165d;

    public ulv(uno uno, long j, String str, ukk ukk, long j2) {
        super(uno, uly.f48171a, j);
        this.f48163a = vpc.m40993a(str);
        sdo.m34959a(ukk);
        this.f48164c = ukk;
        this.f48165d = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(ulx.CONTENT_HASH.f48170d.mo27700a(), this.f48163a);
        contentValues.put(ulx.ENTRY_ID.f48170d.mo27700a(), Long.valueOf(this.f48164c.f47941a));
        contentValues.put(ulx.ACTION_ID.f48170d.mo27700a(), Long.valueOf(this.f48165d));
    }

    public final String toString() {
        return String.format("PendingThumbnailUpload [contentHash=%s, entrySpec=%s, actionId=%d]", this.f48163a, this.f48164c, Long.valueOf(this.f48165d));
    }
}

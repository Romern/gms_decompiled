package p000;

import android.content.ContentValues;

/* renamed from: ume */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ume extends uny {

    /* renamed from: a */
    private final long f48199a;

    /* renamed from: b */
    private final String f48200b;

    public ume(uno uno, long j, String str) {
        super(uno, umh.f48205a, -1);
        this.f48199a = j;
        sdo.m34959a((Object) str);
        this.f48200b = vpc.m40993a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(umg.PERSISTED_EVENT_ID.f48204c.mo27700a(), Long.valueOf(this.f48199a));
        contentValues.put(umg.CONTENT_HASH.f48204c.mo27700a(), this.f48200b);
    }

    public final String toString() {
        long j = this.f48199a;
        String str = this.f48200b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 75);
        sb.append("PersistedEventContent [persistedEventId=");
        sb.append(j);
        sb.append(", contentHash=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}

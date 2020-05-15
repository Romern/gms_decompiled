package p000;

import android.content.ContentValues;

/* renamed from: ule */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ule extends uny {

    /* renamed from: a */
    private final long f48110a;

    /* renamed from: b */
    private final long f48111b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(ulg.CHILD_ENTRY_ID.f48115c.mo27700a(), Long.valueOf(this.f48110a));
        contentValues.put(ulg.PARENT_ENTRY_ID.f48115c.mo27700a(), Long.valueOf(this.f48111b));
    }

    public ule(uno uno, long j, long j2) {
        super(uno, ulh.f48116a, -1);
        this.f48110a = j;
        this.f48111b = j2;
    }
}

package p000;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: umn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class umn extends uny {

    /* renamed from: a */
    public final ukk f48223a;

    /* renamed from: b */
    public final long f48224b;

    /* renamed from: c */
    public final String f48225c;

    /* renamed from: d */
    public String f48226d;

    /* renamed from: e */
    public boolean f48227e;

    /* renamed from: f */
    public boolean f48228f;

    /* renamed from: g */
    public int f48229g;

    /* renamed from: h */
    private final String f48230h;

    /* renamed from: i */
    private final long f48231i;

    /* renamed from: j */
    private final int f48232j;

    public umn(uno uno, long j, ukk ukk, String str, String str2, long j2, long j3, String str3, int i, boolean z, boolean z2, int i2) {
        super(uno, umq.f48248a, j);
        this.f48223a = ukk;
        this.f48226d = str;
        this.f48230h = str2;
        this.f48224b = j2;
        this.f48231i = j3;
        sdo.m34959a((Object) str3);
        this.f48225c = str3;
        this.f48232j = i;
        this.f48227e = z;
        this.f48228f = z2;
        this.f48229g = i2;
    }

    /* renamed from: a */
    public static umn m38963a(uno uno, Cursor cursor) {
        ukk ukk;
        Cursor cursor2 = cursor;
        long longValue = ump.DRIVE_APP_ID.f48247n.mo27705b(cursor2).longValue();
        String a = ump.RESOURCE_ID.f48247n.mo27702a(cursor2);
        String a2 = ump.LOCAL_ID.f48247n.mo27702a(cursor2);
        Long b = ump.ENTRY_ID.f48247n.mo27705b(cursor2);
        if (b != null) {
            ukk = ukk.m38862a(b.longValue());
        } else {
            ukk = null;
        }
        return new umn(uno, umq.f48248a.f48341a.mo27705b(cursor2).longValue(), ukk, a, a2, longValue, ump.LAST_ACCESSED.f48247n.mo27705b(cursor2).longValue(), ump.DATABASE_NAME.f48247n.mo27702a(cursor2), ump.SIZE_BYTES.f48247n.mo27705b(cursor2).intValue(), ump.HAS_PENDING_CHANGES.f48247n.mo27718e(cursor2), ump.REQUIRES_SYNC.f48247n.mo27718e(cursor2), ump.HISTORY_LENGTH.f48247n.mo27705b(cursor2).intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(ump.DRIVE_APP_ID.f48247n.mo27700a(), Long.valueOf(this.f48224b));
        if (this.f48223a != null) {
            contentValues.put(ump.ENTRY_ID.f48247n.mo27700a(), Long.valueOf(this.f48223a.f47941a));
        } else {
            contentValues.putNull(ump.ENTRY_ID.f48247n.mo27700a());
        }
        contentValues.put(ump.RESOURCE_ID.f48247n.mo27700a(), this.f48226d);
        contentValues.put(ump.LOCAL_ID.f48247n.mo27700a(), this.f48230h);
        contentValues.put(ump.LAST_ACCESSED.f48247n.mo27700a(), Long.valueOf(this.f48231i));
        contentValues.put(ump.SIZE_BYTES.f48247n.mo27700a(), Integer.valueOf(this.f48232j));
        contentValues.put(ump.DATABASE_NAME.f48247n.mo27700a(), this.f48225c);
        contentValues.put(ump.HAS_PENDING_CHANGES.f48247n.mo27700a(), Integer.valueOf(this.f48227e ? 1 : 0));
        contentValues.put(ump.REQUIRES_SYNC.f48247n.mo27700a(), Integer.valueOf(this.f48228f ? 1 : 0));
        contentValues.put(ump.HISTORY_LENGTH.f48247n.mo27700a(), Integer.valueOf(this.f48229g));
    }
}

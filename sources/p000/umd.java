package p000;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: umd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class umd extends uny {

    /* renamed from: a */
    public final ukk f48193a;

    /* renamed from: b */
    public final long f48194b;

    /* renamed from: c */
    public final String f48195c;

    /* renamed from: d */
    public long f48196d;

    /* renamed from: e */
    public int f48197e;

    /* renamed from: f */
    public int f48198f;

    public umd(uno uno, long j, ukk ukk, long j2, String str, long j3, int i, int i2) {
        super(uno, umk.f48215a, j);
        this.f48193a = ukk;
        this.f48194b = j2;
        sdo.m34959a((Object) str);
        this.f48195c = str;
        Long valueOf = Long.valueOf(j3);
        sdo.m34959a(valueOf);
        this.f48196d = valueOf.longValue();
        this.f48197e = i;
        this.f48198f = i2;
    }

    /* renamed from: a */
    public static umd m38952a(uno uno, Cursor cursor) {
        ukk ukk;
        Cursor cursor2 = cursor;
        Long b = umj.ANDROID_APP_ID.f48214g.mo27705b(cursor2);
        Long b2 = umj.ENTRY_ID.f48214g.mo27705b(cursor2);
        String a = umj.SERIALIZED_EVENT.f48214g.mo27702a(cursor2);
        long longValue = umj.NEXT_NOTIFICATION_TIME.f48214g.mo27705b(cursor2).longValue();
        int intValue = umj.ATTEMPT_COUNT.f48214g.mo27705b(cursor2).intValue();
        int intValue2 = umj.SNOOZE_COUNT.f48214g.mo27705b(cursor2).intValue();
        if (b2 != null) {
            ukk = ukk.m38862a(b2.longValue());
        } else {
            ukk = null;
        }
        return new umd(uno, umk.f48215a.f48341a.mo27705b(cursor2).longValue(), ukk, b.longValue(), a, longValue, intValue, intValue2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48193a);
        long j = this.f48194b;
        String str = this.f48195c;
        long j2 = this.f48196d;
        int i = this.f48197e;
        int i2 = this.f48198f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 186 + String.valueOf(str).length());
        sb.append("PersistedEvent [entrySpec=");
        sb.append(valueOf);
        sb.append(", executingAndroidAppSqlId=");
        sb.append(j);
        sb.append(", serializedEvent=");
        sb.append(str);
        sb.append(", nextNotificationTime=");
        sb.append(j2);
        sb.append(", attemptCount=");
        sb.append(i);
        sb.append(", snoozeCount=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        Long l;
        ukk ukk = this.f48193a;
        if (ukk != null) {
            l = Long.valueOf(ukk.f47941a);
        } else {
            l = null;
        }
        contentValues.put(umj.ENTRY_ID.f48214g.mo27700a(), l);
        contentValues.put(umj.ANDROID_APP_ID.f48214g.mo27700a(), Long.valueOf(this.f48194b));
        contentValues.put(umj.SERIALIZED_EVENT.f48214g.mo27700a(), this.f48195c);
        contentValues.put(umj.NEXT_NOTIFICATION_TIME.f48214g.mo27700a(), Long.valueOf(this.f48196d));
        contentValues.put(umj.ATTEMPT_COUNT.f48214g.mo27700a(), Integer.valueOf(this.f48197e));
        contentValues.put(umj.SNOOZE_COUNT.f48214g.mo27700a(), Integer.valueOf(this.f48198f));
    }
}

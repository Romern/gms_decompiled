package p000;

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.reminders.notification.HandleTriggerIntentOperation;

/* renamed from: aouo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aouo {

    /* renamed from: a */
    public static final String[] f83640a = {"_id", "due_date_millis"};

    /* renamed from: b */
    public final Context f83641b;

    /* renamed from: c */
    final skc f83642c = new skc(this.f83641b);

    public aouo(Context context) {
        this.f83641b = context;
    }

    /* renamed from: a */
    private final void m69534a(long j, Long l) {
        ContentValues contentValues = new ContentValues();
        if (l == null) {
            contentValues.putNull("trigger_time");
        } else {
            contentValues.put("trigger_time", Long.valueOf(l.longValue()));
        }
        this.f83641b.getContentResolver().update(ContentUris.withAppendedId(aosz.f83569a, j), contentValues, null, null);
    }

    /* renamed from: a */
    public final void mo46917a(long j) {
        StringBuilder sb = new StringBuilder(45);
        sb.append("Unschedule time reminder ");
        sb.append(j);
        sb.toString();
        this.f83642c.mo25668a(HandleTriggerIntentOperation.m92231a(this.f83641b, j));
        m69534a(j, (Long) null);
    }

    /* renamed from: a */
    public final void mo46918a(long j, long j2) {
        mo46917a(j);
        PendingIntent a = HandleTriggerIntentOperation.m92231a(this.f83641b, j);
        StringBuilder sb = new StringBuilder(67);
        sb.append("Schedule reminder ");
        sb.append(j);
        sb.append(" at time ");
        sb.append(j2);
        sb.toString();
        this.f83642c.mo25677a("RemindersNSTIME_REMINDER_ALARM", j2, a);
        m69534a(j, Long.valueOf(j2));
    }
}

package com.google.android.gms.reminders.notification;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScheduleTimeRemindersIntentOperation extends IntentOperation {

    /* renamed from: a */
    aouo f107204a;

    public final void onCreate() {
        this.f107204a = new aouo(getApplicationContext());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    public final void onHandleIntent(Intent intent) {
        char c;
        long[] longArrayExtra;
        Intent intent2 = intent;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -1713960234) {
            if (hashCode != -756346452) {
                if (hashCode == 1506284739 && action.equals("com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_BY_IDS")) {
                    c = 1;
                    if (c != 0) {
                        long longExtra = intent2.getLongExtra("SCHEDULE_TIME_REMINDERS_EXTRA_RANGE_START", -1);
                        long longExtra2 = intent2.getLongExtra("SCHEDULE_TIME_REMINDERS_EXTRA_RANGE_END", -1);
                        if (longExtra != -1 && longExtra2 != -1) {
                            aouo aouo = this.f107204a;
                            Object[] objArr = {Long.valueOf(longExtra), Long.valueOf(longExtra2)};
                            ContentResolver contentResolver = aouo.f83641b.getContentResolver();
                            Uri uri = aotd.f83574a;
                            String[] strArr = aouo.f83640a;
                            String valueOf = String.valueOf(aoun.f83636a);
                            Cursor query = contentResolver.query(uri, strArr, valueOf.length() == 0 ? new String("due_date_millis>=? AND due_date_millis<? AND ") : "due_date_millis>=? AND due_date_millis<? AND ".concat(valueOf), new String[]{String.valueOf(longExtra), String.valueOf(longExtra2)}, null);
                            if (query != null) {
                                while (query.moveToNext()) {
                                    try {
                                        aouo.mo46918a(query.getLong(0), query.getLong(1));
                                    } finally {
                                        query.close();
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (c == 1) {
                        HashMap hashMap = (HashMap) intent2.getSerializableExtra("SCHEDULE_TIME_REMINDERS_EXTRA_REMINDER_IDS_AND_TRIGGER_TIME");
                        if (hashMap != null) {
                            for (Map.Entry entry : hashMap.entrySet()) {
                                this.f107204a.mo46918a(((Long) entry.getKey()).longValue(), ((Long) entry.getValue()).longValue());
                            }
                            return;
                        }
                        return;
                    } else if (c == 2 && (longArrayExtra = intent2.getLongArrayExtra("SCHEDULE_TIME_REMINDERS_EXTRA_REMINDER_IDS")) != null) {
                        for (long j : longArrayExtra) {
                            this.f107204a.mo46917a(j);
                        }
                        return;
                    } else {
                        return;
                    }
                }
            } else if (action.equals("com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_UNSCHEDULE_BY_IDS")) {
                c = 2;
                if (c != 0) {
                }
            }
        } else if (action.equals("com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_IN_RANGE")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}

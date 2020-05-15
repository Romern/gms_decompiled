package com.google.android.gms.reminders.notification;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScheduleLocationRemindersIntentOperation extends IntentOperation {

    /* renamed from: a */
    aoum f107203a;

    public final void onCreate() {
        this.f107203a = new aoum(getApplicationContext());
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onHandleIntent(Intent intent) {
        char c;
        HashSet hashSet;
        if (((Boolean) aoss.f83533L.mo58455c()).booleanValue()) {
            String action = intent.getAction();
            switch (action.hashCode()) {
                case -1861668047:
                    if (action.equals("com.google.android.gms.reminders.notification.ACTION_LOC_REMINDERS_SCHEDULE_ALL")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -829259449:
                    if (action.equals("com.google.android.gms.reminders.notification.ACTION_LOC_REMINDERS_UNSCHEDULE_BY_IDS")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1178368:
                    if (action.equals("com.google.android.gms.reminders.notification.ACTION_LOC_REMINDERS_SCHEDULE_BY_IDS")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1938368480:
                    if (action.equals("com.google.android.gms.reminders.notification.ACTION_LOC_REMINDERS_SCHEDULE_ALIAS")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                aoum aoum = this.f107203a;
                Cursor query = aoum.f83635c.getContentResolver().query(aotd.f83574a, null, aoum.mo46913a(aoum.f83633b), null, null);
                if (query != null) {
                    try {
                        aoum.mo46914a(query);
                    } finally {
                        query.close();
                    }
                }
            } else if (c == 1) {
                aoum aoum2 = this.f107203a;
                String str = aoum.f83633b;
                String join = TextUtils.join(",", new Integer[]{1, 2});
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(join).length());
                sb.append(str);
                sb.append(" AND location_type IN (");
                sb.append(join);
                sb.append(")");
                Cursor query2 = aoum2.f83635c.getContentResolver().query(aotd.f83574a, null, aoum2.mo46913a(sb.toString()), null, null);
                if (query2 != null) {
                    try {
                        aoum2.mo46914a(query2);
                    } finally {
                        query2.close();
                    }
                }
            } else if ((c != 2 && c != 3) || (hashSet = (HashSet) intent.getSerializableExtra("SCHEDULE_LOC_REMINDERS_EXTRA_REMINDER_IDS")) == null || hashSet.isEmpty()) {
            } else {
                if (intent.getAction().equals("com.google.android.gms.reminders.notification.ACTION_LOC_REMINDERS_SCHEDULE_BY_IDS")) {
                    aoum aoum3 = this.f107203a;
                    String join2 = TextUtils.join(",", hashSet);
                    String str2 = aoum.f83633b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(join2).length() + 14 + String.valueOf(str2).length());
                    sb2.append("_id IN (");
                    sb2.append(join2);
                    sb2.append(") AND ");
                    sb2.append(str2);
                    Cursor query3 = aoum3.f83635c.getContentResolver().query(aotd.f83574a, null, aoum3.mo46913a(sb2.toString()), null, null);
                    if (query3 != null) {
                        try {
                            aoum3.mo46914a(query3);
                        } finally {
                            query3.close();
                        }
                    }
                } else {
                    aoum aoum4 = this.f107203a;
                    ContentResolver contentResolver = aoum4.f83635c.getContentResolver();
                    Uri uri = aotd.f83574a;
                    String join3 = TextUtils.join(",", hashSet);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(join3).length() + 9);
                    sb3.append("_id IN (");
                    sb3.append(join3);
                    sb3.append(")");
                    Cursor query4 = contentResolver.query(uri, null, sb3.toString(), null, null);
                    if (query4 != null) {
                        try {
                            aoum4.mo46915a(query4, new aoui());
                        } finally {
                            query4.close();
                        }
                    }
                }
            }
        } else {
            throw new IllegalStateException("Location reminder scheduling not enabled.");
        }
    }
}

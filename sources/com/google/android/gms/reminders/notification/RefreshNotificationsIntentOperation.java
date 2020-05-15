package com.google.android.gms.reminders.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RefreshNotificationsIntentOperation extends IntentOperation {

    /* renamed from: a */
    skc f107201a;

    /* renamed from: b */
    private Context f107202b;

    /* renamed from: a */
    private final void m92233a(String str) {
        if (((Boolean) aoss.f83533L.mo58455c()).booleanValue()) {
            if (str.equals("com.google.android.gms.reminders.notification.ACTION_REFRESH_ALIAS_LOCATION_REMINDERS")) {
                Context context = this.f107202b;
                context.startService(IntentOperation.getStartIntent(context, ScheduleLocationRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_LOC_REMINDERS_SCHEDULE_ALIAS"));
            } else {
                Context context2 = this.f107202b;
                context2.startService(IntentOperation.getStartIntent(context2, ScheduleLocationRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_LOC_REMINDERS_SCHEDULE_ALL"));
            }
            m92234a("com.google.android.gms.reminders.notification.ACTION_REFRESH_ALIAS_LOCATION_REMINDERS", "REFRESH_ALIAS_LOCATION_REMINDERS_ALARM", System.currentTimeMillis() + (((long) ((Integer) aoss.f83532K.mo58455c()).intValue()) * 86400000));
        }
    }

    public final void onCreate() {
        this.f107202b = getApplicationContext();
        this.f107201a = new skc(getApplicationContext());
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onHandleIntent(Intent intent) {
        char c;
        long j;
        String action = intent.getAction();
        int i = 0;
        switch (action.hashCode()) {
            case -1317652597:
                if (action.equals("com.google.android.gms.reminders.notification.ACTION_INITIALIZE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1004924091:
                if (action.equals("com.google.android.gms.reminders.notification.ACTION_REFRESH_ALIAS_LOCATION_REMINDERS")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 172491798:
                if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 190662830:
                if (action.equals("com.google.android.gms.reminders.notification.ACTION_REFRESH_TIME_REMINDERS")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 211362435:
                if (action.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 505380757:
                if (action.equals("android.intent.action.TIME_SET")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            m92233a(intent.getAction());
        } else if (!(c == 1 || c == 2)) {
            if (c == 3) {
                String str = (String) aoss.f83558q.mo58455c();
                String str2 = (String) aoss.f83559r.mo58455c();
                String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.changed_component_name_list");
                if (stringArrayExtra != null) {
                    int length = stringArrayExtra.length;
                    while (i < length) {
                        String str3 = stringArrayExtra[i];
                        if (!str3.equals(str) && !str3.equals(str2)) {
                            i++;
                        }
                    }
                    return;
                }
                return;
            } else if (!(c == 4 || c == 5)) {
                return;
            }
            m92233a(intent.getAction());
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!"com.google.android.gms.reminders.notification.ACTION_REFRESH_TIME_REMINDERS".equals(intent.getAction())) {
            j = currentTimeMillis - ((Long) aoss.f83557p.mo58455c()).longValue();
        } else {
            j = aowr.m69721b(currentTimeMillis).getTimeInMillis();
        }
        long a = aowr.m69714a(currentTimeMillis);
        Context context = this.f107202b;
        Intent startIntent = IntentOperation.getStartIntent(context, ScheduleTimeRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_IN_RANGE");
        startIntent.putExtra("SCHEDULE_TIME_REMINDERS_EXTRA_RANGE_START", j);
        startIntent.putExtra("SCHEDULE_TIME_REMINDERS_EXTRA_RANGE_END", a);
        context.startService(startIntent);
        m92234a("com.google.android.gms.reminders.notification.ACTION_REFRESH_TIME_REMINDERS", "REFRESH_TIME_REMINDERS_ALARM", a);
    }

    /* renamed from: a */
    private final void m92234a(String str, String str2, long j) {
        this.f107201a.mo25677a(str2, j, PendingIntent.getService(this.f107202b, 0, IntentOperation.getStartIntent(this.f107202b, RefreshNotificationsIntentOperation.class, str), 134217728));
    }
}

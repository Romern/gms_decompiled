package com.google.android.gms.reminders.notification;

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HandleTriggerIntentOperation extends IntentOperation {
    /* renamed from: a */
    public static PendingIntent m92231a(Context context, long j) {
        Intent startIntent = IntentOperation.getStartIntent(context, HandleTriggerIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_TIME_REMINDER_ALARM_TRIGGERED");
        startIntent.setData(ContentUris.withAppendedId(aosz.f83569a, j));
        startIntent.putExtra("HANDLE_NOTIFICATION_TRIGGER_EXTRA_NOTIFICATION_ID", j);
        return PendingIntent.getService(context, 0, startIntent, 134217728);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 1517183795) {
            if (hashCode == 2101501630 && action.equals("com.google.android.gms.reminders.notification.ACTION_CONTEXT_FENCE_TRIGGERED")) {
                c = 1;
                if (c == 0) {
                    m92232a(intent.getLongExtra("HANDLE_NOTIFICATION_TRIGGER_EXTRA_NOTIFICATION_ID", -1));
                    return;
                } else if (c == 1) {
                    FenceStateImpl fenceStateImpl = new FenceStateImpl(intent.getIntExtra("context_fence_current_state", 0), intent.getLongExtra("context_fence_last_updated_time", 0), intent.getStringExtra("context_fence_key"), intent.getIntExtra("context_fence_previous_state", 0), sef.m35076b(intent, "context_data_list", ContextData.CREATOR));
                    int i = fenceStateImpl.f30653a;
                    int i2 = fenceStateImpl.f30656d;
                    long j = fenceStateImpl.f30654b;
                    long longExtra = intent.getLongExtra("HANDLE_NOTIFICATION_TRIGGER_EXTRA_NOTIFICATION_ID", -1);
                    long longExtra2 = intent.getLongExtra("HANDLE_NOTIFICATION_TRIGGER_EXTRA_FENCE_CREATION_MS", j);
                    Object[] objArr = {Long.valueOf(longExtra), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(longExtra2)};
                    if (i == 2 && i2 != 2 && j - longExtra2 > ((long) ((Integer) aoss.f83531J.mo58455c()).intValue()) * 1000 && longExtra != -1) {
                        m92232a(longExtra);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        } else if (action.equals("com.google.android.gms.reminders.notification.ACTION_TIME_REMINDER_ALARM_TRIGGERED")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* renamed from: a */
    private final void m92232a(long j) {
        new Object[1][0] = Long.valueOf(j);
        if (j >= 0) {
            getContentResolver().update(ContentUris.withAppendedId(aotd.f83578e, j), null, null, null);
        }
    }
}

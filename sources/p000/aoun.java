package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.reminders.notification.ScheduleLocationRemindersIntentOperation;
import com.google.android.gms.reminders.notification.ScheduleTimeRemindersIntentOperation;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: aoun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoun implements Runnable {

    /* renamed from: a */
    public static final String f83636a;

    /* renamed from: b */
    public static final String[] f83637b = {"_id", "trigger_time", "pinned", "archived", "deleted", "due_date_millis", "task_list", "recurrence_master", "due_date_absolute_time_ms"};

    /* renamed from: c */
    private final Context f83638c;

    /* renamed from: d */
    private final Cursor f83639d;

    static {
        String join = TextUtils.join(",", aowr.f83779a);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + ErrorInfo.TYPE_SDU_MEMORY_FULL);
        sb.append("archived != 1 AND deleted != 1 AND (recurrence_master IS NULL OR recurrence_master=0) AND task_list IN (");
        sb.append(join);
        sb.append(")");
        f83636a = sb.toString();
    }

    public aoun(Context context, Cursor cursor) {
        this.f83638c = context;
        this.f83639d = cursor;
    }

    /* renamed from: a */
    public static aoun m69533a(Context context, Collection collection) {
        String join = TextUtils.join(",", collection);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 19);
        sb.append("reminders._id IN (");
        sb.append(join);
        sb.append(")");
        return new aoun(context, context.getContentResolver().query(aosz.f83570b, f83637b, sb.toString(), null, null));
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:13:0x00a5 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:27:0x00ed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object[]], assign insn: 0x0064: NEW_ARRAY  (r1v6 ? I:java.lang.Object[]) = (8 int) type: java.lang.Object[] */
    /* JADX WARN: Type inference failed for: r1v13, assign insn: PHI: (r1v13 ?) = (r1v6 ?), (r1v18 ?) binds: [B:13:0x00a5, B:27:0x00ed] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.HashSet], assign insn: 0x00eb: MOVE  (r1v18 ? I:?[OBJECT, ARRAY]) = (r21v0 java.util.HashSet) */
    public final void run() {
        aoun aoun;
        HashSet hashSet;
        HashSet hashSet2;
        aoun aoun2 = this;
        if (aoun2.f83639d != null) {
            long a = aowr.m69714a(System.currentTimeMillis());
            HashMap hashMap = new HashMap();
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            HashSet hashSet5 = new HashSet();
            while (aoun2.f83639d.moveToNext()) {
                try {
                    try {
                        long j = aoun2.f83639d.getLong(0);
                        boolean c = aows.m69727c(aoun2.f83639d, 2);
                        boolean c2 = aows.m69727c(aoun2.f83639d, 4);
                        boolean c3 = aows.m69727c(aoun2.f83639d, 3);
                        boolean c4 = aows.m69727c(aoun2.f83639d, 7);
                        Integer b = aows.m69726b(aoun2.f83639d, 6);
                        Long a2 = aows.m69725a(aoun2.f83639d, 5);
                        Long a3 = aows.m69725a(aoun2.f83639d, 1);
                        HashSet hashSet6 = hashSet5;
                        Long valueOf = Long.valueOf(j);
                        ? r1 = {valueOf, Boolean.valueOf(c), Boolean.valueOf(c2), Boolean.valueOf(c3), Boolean.valueOf(c4), b, a2, a3};
                        if (c2) {
                            hashSet = hashSet6;
                        } else if (c3 || c4 || b == null) {
                            hashSet = hashSet6;
                        } else {
                            try {
                                if (!aowr.m69722b(b.intValue())) {
                                    hashSet = hashSet6;
                                } else if (a2 == null) {
                                    hashSet3.add(valueOf);
                                    hashSet4.add(valueOf);
                                    aoun2 = this;
                                    hashSet5 = hashSet6;
                                } else if (!a2.equals(a3)) {
                                    if (a2.longValue() <= System.currentTimeMillis() - ((Long) aoss.f83557p.mo58455c()).longValue() || a2.longValue() >= a) {
                                        hashSet3.add(valueOf);
                                    } else {
                                        hashMap.put(valueOf, a2);
                                    }
                                    r1 = hashSet6;
                                    try {
                                        r1.add(valueOf);
                                        hashSet5 = r1;
                                        aoun2 = this;
                                    } catch (Exception e) {
                                        e = e;
                                        hashSet2 = r1;
                                        aowu.m69734a("RemindersNS", e, "Failed to handle reminder %s, continuing with other reminders", Long.valueOf(j));
                                        hashSet5 = hashSet2;
                                        aoun2 = this;
                                    }
                                } else {
                                    hashSet5 = hashSet6;
                                    aoun2 = this;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                hashSet2 = hashSet6;
                                aowu.m69734a("RemindersNS", e, "Failed to handle reminder %s, continuing with other reminders", Long.valueOf(j));
                                hashSet5 = hashSet2;
                                aoun2 = this;
                            }
                        }
                        hashSet3.add(valueOf);
                        hashSet.add(valueOf);
                        hashSet5 = hashSet;
                        aoun2 = this;
                    } catch (Throwable th) {
                        th = th;
                        aoun = this;
                        aoun.f83639d.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    aoun = aoun2;
                    aoun.f83639d.close();
                    throw th;
                }
            }
            HashSet hashSet7 = hashSet5;
            this.f83639d.close();
            if (!hashMap.isEmpty()) {
                Context context = this.f83638c;
                Intent startIntent = IntentOperation.getStartIntent(context, ScheduleTimeRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_BY_IDS");
                startIntent.putExtra("SCHEDULE_TIME_REMINDERS_EXTRA_REMINDER_IDS_AND_TRIGGER_TIME", hashMap);
                context.startService(startIntent);
            }
            if (!hashSet3.isEmpty()) {
                Context context2 = this.f83638c;
                Intent startIntent2 = IntentOperation.getStartIntent(context2, ScheduleTimeRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_UNSCHEDULE_BY_IDS");
                startIntent2.putExtra("SCHEDULE_TIME_REMINDERS_EXTRA_REMINDER_IDS", sqc.m35964b(hashSet3));
                context2.startService(startIntent2);
            }
            if (((Boolean) aoss.f83533L.mo58455c()).booleanValue()) {
                if (!hashSet4.isEmpty()) {
                    Context context3 = this.f83638c;
                    Intent startIntent3 = IntentOperation.getStartIntent(context3, ScheduleLocationRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_LOC_REMINDERS_SCHEDULE_BY_IDS");
                    startIntent3.putExtra("SCHEDULE_LOC_REMINDERS_EXTRA_REMINDER_IDS", hashSet4);
                    context3.startService(startIntent3);
                }
                if (!hashSet7.isEmpty()) {
                    Context context4 = this.f83638c;
                    Intent startIntent4 = IntentOperation.getStartIntent(context4, ScheduleLocationRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_LOC_REMINDERS_UNSCHEDULE_BY_IDS");
                    startIntent4.putExtra("SCHEDULE_LOC_REMINDERS_EXTRA_REMINDER_IDS", hashSet7);
                    context4.startService(startIntent4);
                }
            }
        }
    }
}

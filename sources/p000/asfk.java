package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.stats.controlledevents.ControlledEventsOperation;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

/* renamed from: asfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfk {
    /* renamed from: a */
    private static PendingIntent m73955a(Intent intent) {
        return IntentOperation.getPendingIntent(rpr.m34216b(), ControlledEventsOperation.class, intent, 0, 0);
    }

    /* renamed from: b */
    private static long m73962b(int i, int i2) {
        return ZonedDateTime.of(bqdb.m112614a(bqdc.f140496a), LocalTime.ofSecondOfDay((long) ((bmyk.f131201a.nextInt(i2 - i) + i) * 60)), bqdc.f140496a).toInstant().toEpochMilli();
    }

    /* renamed from: a */
    public static void m73956a() {
        if (cgsi.m146848b()) {
            for (String str : m73963b().getAll().keySet()) {
                if (!str.equals("NextAlarmId")) {
                    m73957a(Integer.parseInt(str));
                }
            }
            m73963b().edit().clear().apply();
            if (cgsi.f187650a.mo6606a().mo84407g()) {
                m73961a("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_WAKELOCK");
            }
            if (cgsi.f187650a.mo6606a().mo84404d()) {
                m73961a("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_BLE_SCAN");
            }
            if (cgsi.f187650a.mo6606a().mo84408h()) {
                m73961a("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_REPEATED_WAKEUP");
            }
            if (cgsi.f187650a.mo6606a().mo84406f()) {
                m73961a("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_PROCESS_CRASH");
            }
        }
    }

    /* renamed from: b */
    private static SharedPreferences m73963b() {
        return rpr.m34216b().getSharedPreferences("ControlledEventsSharedPrefs", 0);
    }

    /* renamed from: a */
    public static void m73957a(int i) {
        skc skc = new skc(rpr.m34216b());
        PendingIntent pendingIntent = null;
        String string = m73963b().getString(String.valueOf(i), null);
        if (!bmxx.m108577a(string)) {
            pendingIntent = m73955a(new Intent(string));
        }
        if (pendingIntent != null) {
            skc.mo25668a(pendingIntent);
            pendingIntent.cancel();
            m73963b().edit().remove(String.valueOf(i)).apply();
        }
    }

    /* renamed from: a */
    public static void m73958a(int i, int i2) {
        m73959a(i, i2, Instant.now().toEpochMilli() + TimeUnit.SECONDS.toMillis(cgsi.f187650a.mo6606a().mo84416p()));
    }

    /* renamed from: a */
    private static void m73959a(int i, int i2, long j) {
        Intent intent = new Intent("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_REPEATED_WAKEUP");
        intent.putExtra("wakeup_duration", cgsi.f187650a.mo6606a().mo84421u()).putExtra("wakeup_remaining_alarms", i).putExtra("wakeup_number_of_attempts", i2);
        m73960a(intent, j);
    }

    /* renamed from: a */
    private static void m73960a(Intent intent, long j) {
        skc skc = new skc(rpr.m34216b());
        SharedPreferences b = m73963b();
        int i = b.getInt("NextAlarmId", 0);
        b.edit().putInt("NextAlarmId", i + 1).apply();
        intent.putExtra("alarm_id_extra", i);
        m73963b().edit().putString(String.valueOf(i), intent.getAction()).apply();
        skc.mo25679b("ControlledEventsAlarm", 0, j, m73955a(intent));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static void m73961a(String str) {
        char c;
        long j;
        Intent intent = new Intent(str);
        switch (str.hashCode()) {
            case -579664806:
                if (str.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_PROCESS_CRASH")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -402052697:
                if (str.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_REPEATED_WAKEUP")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 871387742:
                if (str.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_BLE_SCAN")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2085626924:
                if (str.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_WAKELOCK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            intent.putExtra("wakelock_duration", cgsi.f187650a.mo6606a().mo84413m()).putExtra("wakelock_busy", cgsi.f187650a.mo6606a().mo84412l());
            j = m73962b((int) cgsi.f187650a.mo6606a().mo84415o(), (int) cgsi.f187650a.mo6606a().mo84414n());
        } else if (c == 1) {
            intent.putExtra("bluetooth_low_energy_scan_duration", cgsi.f187650a.mo6606a().mo84401a());
            j = m73962b((int) cgsi.f187650a.mo6606a().mo84403c(), (int) cgsi.f187650a.mo6606a().mo84402b());
        } else if (c == 2) {
            j = m73962b((int) cgsi.f187650a.mo6606a().mo84410j(), (int) cgsi.f187650a.mo6606a().mo84409i());
        } else if (c != 3) {
            asfj.m73952a("ControlledEventsSchedulerUnknownAction");
            return;
        } else {
            m73959a((int) cgsi.f187650a.mo6606a().mo84418r(), 0, m73962b((int) cgsi.f187650a.mo6606a().mo84420t(), (int) cgsi.f187650a.mo6606a().mo84417q()));
            return;
        }
        m73960a(intent, j);
    }
}

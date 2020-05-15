package p000;

import android.content.SharedPreferences;
import android.text.format.Time;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: bjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjr {

    /* renamed from: a */
    public final SharedPreferences f3403a;

    public bjr(SharedPreferences sharedPreferences) {
        this.f3403a = sharedPreferences;
    }

    /* renamed from: a */
    private final long m3222a(String str, long j) {
        long j2 = this.f3403a.getLong(str, 0);
        if (j2 <= j) {
            return j2;
        }
        bjs.m3228a(this.f3403a.edit().putLong(str, j));
        return j;
    }

    /* renamed from: b */
    public final void mo3200b() {
        SharedPreferences.Editor edit = this.f3403a.edit();
        edit.putLong("OperationScheduler_lastErrorTimeMillis", System.currentTimeMillis());
        edit.putInt("OperationScheduler_errorCount", this.f3403a.getInt("OperationScheduler_errorCount", 0) + 1);
        bjs.m3228a(edit);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[OperationScheduler:");
        for (Map.Entry entry : new TreeMap(this.f3403a.getAll()).entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("OperationScheduler_")) {
                if (str.endsWith("TimeMillis")) {
                    Time time = new Time();
                    time.set(((Long) entry.getValue()).longValue());
                    sb.append(" ");
                    sb.append(str.substring(19, str.length() - 10));
                    sb.append("=");
                    sb.append(time.format("%Y-%m-%d/%H:%M:%S"));
                } else {
                    sb.append(" ");
                    sb.append(str.substring(19));
                    Object value = entry.getValue();
                    if (value == null) {
                        sb.append("=(null)");
                    } else {
                        sb.append("=");
                        sb.append(value.toString());
                    }
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final long mo3197a(bjq bjq) {
        if (!this.f3403a.getBoolean("OperationScheduler_enabledState", true) || this.f3403a.getBoolean("OperationScheduler_permanentError", false)) {
            return Long.MAX_VALUE;
        }
        int i = this.f3403a.getInt("OperationScheduler_errorCount", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long a = m3222a("OperationScheduler_lastSuccessTimeMillis", currentTimeMillis);
        long a2 = m3222a("OperationScheduler_lastErrorTimeMillis", currentTimeMillis);
        long j = this.f3403a.getLong("OperationScheduler_triggerTimeMillis", Long.MAX_VALUE);
        long a3 = m3222a("OperationScheduler_moratoriumTimeMillis", m3222a("OperationScheduler_moratoriumSetTimeMillis", currentTimeMillis) + bjq.f3400d);
        long j2 = bjq.f3402f;
        long max = Math.max(j, a3);
        long j3 = bjq.f3401e;
        long max2 = Math.max(max, a);
        if (i <= 0) {
            return max2;
        }
        int i2 = i - 1;
        if (i2 > 30) {
            i2 = 30;
        }
        long j4 = bjq.f3397a;
        return Math.max(max2, a2 + Math.min((bjq.f3398b * ((long) i)) + (((long) bjq.f3399c) << i2), bjq.f3400d));
    }

    /* renamed from: b */
    public final void mo3201b(long j) {
        bjs.m3228a(this.f3403a.edit().putLong("OperationScheduler_moratoriumTimeMillis", j).putLong("OperationScheduler_moratoriumSetTimeMillis", System.currentTimeMillis()));
    }

    /* renamed from: a */
    public final void mo3198a() {
        bjs.m3228a(this.f3403a.edit().remove("OperationScheduler_errorCount"));
        bjs.m3228a(this.f3403a.edit().remove("OperationScheduler_permanentError"));
        bjs.m3228a(this.f3403a.edit().remove("OperationScheduler_errorCount").remove("OperationScheduler_lastErrorTimeMillis").remove("OperationScheduler_permanentError").remove("OperationScheduler_triggerTimeMillis").putLong("OperationScheduler_lastSuccessTimeMillis", System.currentTimeMillis()));
    }

    /* renamed from: a */
    public final void mo3199a(long j) {
        bjs.m3228a(this.f3403a.edit().putLong("OperationScheduler_triggerTimeMillis", j));
    }
}

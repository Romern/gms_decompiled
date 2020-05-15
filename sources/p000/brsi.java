package p000;

import android.content.Context;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.TimeUnit;

/* renamed from: brsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brsi {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zwi.a(java.lang.String, java.lang.Boolean):void
     arg types: [java.lang.String, int]
     candidates:
      zwi.a(java.lang.String, int):void
      zwi.a(java.lang.String, long):void
      zwi.a(java.lang.String, java.lang.Boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zwi.a(java.lang.String, long):void
     arg types: [java.lang.String, int]
     candidates:
      zwi.a(java.lang.String, int):void
      zwi.a(java.lang.String, java.lang.Boolean):void
      zwi.a(java.lang.String, long):void */
    static {
        zwi.m46609a("crash:enabled", (Boolean) true);
        new zwh("crash:gateway_url", "https://mobilecrashreporting.googleapis.com/v1/crashes:batchCreate?key=");
        zwi.m46607a("crash:log_buffer_capacity", 100);
        zwi.m46607a("crash:log_buffer_max_total_size", (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        zwi.m46607a("crash:crash_backlog_capacity", 5);
        zwi.m46608a("crash:crash_backlog_max_age", 604800000L);
        zwi.m46608a("crash:starting_backoff", TimeUnit.SECONDS.toMillis(1));
        zwi.m46608a("crash:backoff_limit", TimeUnit.MINUTES.toMillis(60));
        zwi.m46607a("crash:retry_num_attempts", 12);
        zwi.m46607a("crash:batch_size", 5);
        zwi.m46608a("crash:batch_throttle", TimeUnit.MINUTES.toMillis(5));
        zwi.m46607a("crash:frame_depth", 60);
        zwi.m46607a("crash:receiver_delay", 100);
        zwi.m46607a("crash:thread_idle_timeout", 10);
    }

    /* renamed from: a */
    public static final void m114534a(Context context) {
        zwp.m46614b();
        zwj.m46610a(context);
    }
}

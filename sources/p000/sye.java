package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: sye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sye implements Runnable {
    public final void run() {
        szr.f45526a.mo25409a("Purging invalid deactivation signals", new Object[0]);
        szr.m36694a("event_time< ? AND event_type = ?", new String[]{String.valueOf(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(cdfn.f180658a.mo6606a().mo77404f())), "1"});
        szr.m36694a("event_time< ? AND event_type = ?", new String[]{String.valueOf(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(cdfn.f180658a.mo6606a().mo77415q())), "2"});
    }
}

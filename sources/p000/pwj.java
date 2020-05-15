package p000;

import android.app.PendingIntent;
import java.util.UUID;

/* renamed from: pwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pwj {

    /* renamed from: a */
    public final String f40478a;

    /* renamed from: b */
    public long f40479b;

    /* renamed from: c */
    public long f40480c = -1;

    /* renamed from: d */
    public PendingIntent f40481d;

    public pwj(String str, long j) {
        this.f40478a = str;
        this.f40479b = j;
    }

    /* renamed from: a */
    public static String m31514a() {
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        return valueOf.length() == 0 ? new String("media") : "media".concat(valueOf);
    }

    public final String toString() {
        return String.format("TrackedMediaItem(itemId=%s, loadRequestId=%d, mediaSessionId=%d)", this.f40478a, Long.valueOf(this.f40479b), Long.valueOf(this.f40480c));
    }
}

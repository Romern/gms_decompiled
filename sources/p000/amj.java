package p000;

import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: amj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amj {

    /* renamed from: a */
    public final Bundle f906a;

    public amj(Bundle bundle) {
        this.f906a = bundle;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("MediaSessionStatus{ timestamp=");
        C1248on.m19794a(SystemClock.elapsedRealtime() - this.f906a.getLong("timestamp"), sb);
        sb.append(" ms ago, sessionState=");
        int i = this.f906a.getInt("sessionState", 2);
        if (i != 0) {
            str = i != 1 ? i != 2 ? Integer.toString(i) : "invalidated" : "ended";
        } else {
            str = "active";
        }
        sb.append(str);
        sb.append(", queuePaused=");
        sb.append(this.f906a.getBoolean("queuePaused"));
        sb.append(", extras=");
        sb.append(this.f906a.getBundle("extras"));
        sb.append(" }");
        return sb.toString();
    }
}

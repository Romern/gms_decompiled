package p000;

import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: akm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akm {

    /* renamed from: a */
    public final Bundle f775a;

    public akm(Bundle bundle) {
        this.f775a = bundle;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("MediaItemStatus{ timestamp=");
        C1248on.m19794a(SystemClock.elapsedRealtime() - this.f775a.getLong("timestamp"), sb);
        sb.append(" ms ago, playbackState=");
        int i = this.f775a.getInt("playbackState", 7);
        switch (i) {
            case 0:
                str = "pending";
                break;
            case 1:
                str = "playing";
                break;
            case 2:
                str = "paused";
                break;
            case 3:
                str = "buffering";
                break;
            case 4:
                str = "finished";
                break;
            case 5:
                str = "canceled";
                break;
            case 6:
                str = "invalidated";
                break;
            case 7:
                str = "error";
                break;
            default:
                str = Integer.toString(i);
                break;
        }
        sb.append(str);
        sb.append(", contentPosition=");
        sb.append(this.f775a.getLong("contentPosition", -1));
        sb.append(", contentDuration=");
        sb.append(this.f775a.getLong("contentDuration", -1));
        sb.append(", extras=");
        sb.append(this.f775a.getBundle("extras"));
        sb.append(" }");
        return sb.toString();
    }
}

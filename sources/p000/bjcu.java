package p000;

import com.google.android.ulr.PresenceInterval;

/* renamed from: bjcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcu {
    /* renamed from: a */
    public static byfd m103204a(PresenceInterval presenceInterval) {
        bxvd da = byfd.f166006c.mo74144da();
        if (((String) presenceInterval.f44540b.get("startOffsetSec")) != null) {
            throw new IllegalArgumentException("Json2LiteBadNotNull location.unified.PresenceInterval.start_offset_sec");
        } else if (((String) presenceInterval.f44540b.get("durationSec")) == null) {
            if (presenceInterval.mo71690b() != null) {
                int intValue = presenceInterval.mo71690b().intValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfd byfd = (byfd) da.f164949b;
                byfd.f166008a |= 4;
                byfd.f166009b = intValue;
            }
            return (byfd) da.mo74062i();
        } else {
            throw new IllegalArgumentException("Json2LiteBadNotNull location.unified.PresenceInterval.duration_sec");
        }
    }
}

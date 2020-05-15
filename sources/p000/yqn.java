package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: yqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum yqn {
    CYCLING_SPEED("org.bluetooth.profile.cycling_speed_and_cadence", bzzn.f172066F, bzzn.f172065E, bzzn.f172063C, bzzn.f172064D),
    HEART_RATE_MONITOR("org.bluetooth.profile.heart_rate", bzzn.f172073M),
    RUNNING_SPEED("org.bluetooth.profile.running_speed_and_cadence", bzzn.f172098ak, bzzn.f172100am, bzzn.f172102ao);
    

    /* renamed from: d */
    public final String f54416d;

    /* renamed from: e */
    public final bnic f54417e;

    private yqn(String str, caah... caahArr) {
        this.f54416d = str;
        this.f54417e = bnic.m109496a((Object[]) caahArr);
    }

    /* renamed from: a */
    public static Set m44587a(Set set) {
        HashSet hashSet = new HashSet();
        yqn[] values = values();
        for (yqn yqn : values) {
            if (set.contains(yqn.f54416d)) {
                hashSet.addAll(yqn.f54417e);
            }
        }
        return hashSet;
    }
}

package p000;

import java.util.UUID;

/* renamed from: yqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum yqp {
    CYCLING_SPEED_AND_CADENCE("00001816-0000-1000-8000-00805F9B34FB"),
    HEART_RATE("0000180D-0000-1000-8000-00805F9B34FB"),
    RUNNING_SPEED_AND_CADENCE("00001814-0000-1000-8000-00805F9B34FB");
    

    /* renamed from: d */
    public final UUID f54422d;

    private yqp(String str) {
        this.f54422d = UUID.fromString(str);
    }
}

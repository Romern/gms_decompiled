package p000;

import android.content.Context;
import android.net.TrafficStats;

/* renamed from: bwbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbl {
    /* renamed from: a */
    public static void m121723a(Context context, int i) {
        int a = srf.m36091a(context);
        if (a == -1) {
            a = 7;
        }
        TrafficStats.setThreadStatsTag((a << 28) | i);
    }
}

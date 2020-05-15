package p000;

import android.content.Context;
import android.net.TrafficStats;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HttpStack;

/* renamed from: bwbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbr extends BasicNetwork {

    /* renamed from: a */
    private final Context f158756a;

    public bwbr(Context context, HttpStack httpStack) {
        super(httpStack);
        this.f158756a = context;
    }

    public final NetworkResponse performRequest(Request request) {
        try {
            bwbl.m121723a(this.f158756a, 4353);
            return super.performRequest(request);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}

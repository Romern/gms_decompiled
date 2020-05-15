package p000;

import android.content.Context;
import com.android.volley.RequestQueue;

/* renamed from: akjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjy {

    /* renamed from: a */
    public static final bngx f72124a = bngx.m109357a(caev.QUALITY_SCORE_CURVE, caev.THROUGHPUT_CURVE);

    /* renamed from: b */
    public final Context f72125b;

    public akjy(Context context) {
        this.f72125b = context;
    }

    /* renamed from: a */
    public static void m59904a(RequestQueue requestQueue) {
        requestQueue.cancelAll("quality_tag");
    }
}

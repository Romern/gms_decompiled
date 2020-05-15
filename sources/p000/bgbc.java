package p000;

import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bgbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbc {

    /* renamed from: a */
    public final Context f115968a;

    /* renamed from: b */
    public final AtomicInteger f115969b = new AtomicInteger(((int) SystemClock.elapsedRealtime()) / 1000);

    /* renamed from: c */
    public final ExecutorService f115970c = snp.m35704b(9);

    public bgbc(Context context) {
        this.f115968a = context;
    }
}

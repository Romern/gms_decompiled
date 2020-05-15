package com.google.android.gms.car.power;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BatteryStateMonitor extends TracingBroadcastReceiver {

    /* renamed from: a */
    public final SimpleDateFormat f29498a;

    /* renamed from: b */
    public final List f29499b = new ArrayList(10);

    /* renamed from: c */
    public final Context f29500c;

    /* renamed from: d */
    public oee f29501d;

    /* renamed from: e */
    public final AtomicBoolean f29502e = new AtomicBoolean(false);

    static {
        odk.m28481a("CAR.POWER");
    }

    public BatteryStateMonitor(Context context) {
        super("car");
        this.f29500c = context;
        this.f29498a = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.US);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        float intExtra = (float) (intent.getIntExtra("temperature", -1) / 10);
        int intExtra2 = (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 100);
        this.f29499b.add(new Pair(new Date(), Float.valueOf(intExtra)));
        bmxy.m108581a(this.f29501d);
        this.f29501d.mo22044a(intExtra, intExtra2);
        while (this.f29499b.size() > 10) {
            this.f29499b.remove(0);
        }
    }
}

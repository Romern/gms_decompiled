package com.google.android.contextmanager.controller;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EventHandler$AlarmSetter extends aacn {

    /* renamed from: a */
    public final SparseArray f7695a;

    /* renamed from: b */
    public final HashMap f7696b;

    /* renamed from: c */
    public final long f7697c;

    /* renamed from: d */
    public final String f7698d;

    /* renamed from: e */
    public boolean f7699e;

    /* renamed from: f */
    public final /* synthetic */ drv f7700f;

    /* renamed from: g */
    private final skc f7701g;

    /* renamed from: h */
    private int f7702h = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventHandler$AlarmSetter(drv drv) {
        super("contextmanager");
        this.f7700f = drv;
        this.f7701g = new skc(drv.f13904a);
        this.f7695a = new SparseArray();
        this.f7696b = new HashMap();
        this.f7697c = SystemClock.elapsedRealtime();
        this.f7698d = "CONTEXT_MANAGER_ALARM_WAKEUP";
        this.f7699e = true;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (!intent.hasExtra("alarmId") || !intent.hasExtra("sessionId")) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("com.google.android.contextmanager.controller.EventHandler$AlarmSetter", "a", 583, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[EventHandler] No alarm id or session id found for intent: %s", intent);
        } else if (this.f7699e) {
            this.f7700f.mo9435a(new drs(this, intent.getIntExtra("alarmId", Integer.MIN_VALUE), intent), dqy.m9123a("EventHandler-delayed"));
        } else {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
            bnsl2.mo68432a("com.google.android.contextmanager.controller.EventHandler$AlarmSetter", "a", 589, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[EventHandler] Received an alarm but AlarmSetter has been stopped. intent=%s", intent);
        }
    }

    /* renamed from: a */
    public final void mo6254a(Runnable runnable) {
        this.f7700f.mo9511a();
        Pair pair = (Pair) this.f7696b.get(runnable);
        if (pair != null) {
            int intValue = ((Integer) pair.first).intValue();
            this.f7701g.mo25668a((PendingIntent) pair.second);
            this.f7696b.remove(runnable);
            this.f7695a.remove(intValue);
            Object[] objArr = {Integer.valueOf(intValue), Long.valueOf(this.f7697c), runnable};
        }
    }

    /* renamed from: a */
    public final void mo6255a(Runnable runnable, long j, dqx dqx) {
        this.f7700f.mo9511a();
        mo6254a(runnable);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        int i = this.f7702h + 1;
        this.f7702h = i;
        Intent intent = new Intent(this.f7698d);
        intent.setPackage("com.google.android.gms");
        intent.putExtra("alarmId", i);
        intent.putExtra("sessionId", this.f7697c);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f7700f.f13904a, i, intent, 536870912);
        if (broadcast != null) {
            this.f7701g.mo25668a(broadcast);
        }
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.f7700f.f13904a, i, intent, 134217728);
        this.f7695a.put(i, Pair.create(runnable, dqx));
        HashMap hashMap = this.f7696b;
        Integer valueOf = Integer.valueOf(i);
        hashMap.put(runnable, Pair.create(valueOf, broadcast2));
        Object[] objArr = {valueOf, Long.valueOf(j), Long.valueOf(this.f7697c), runnable};
        int i2 = Build.VERSION.SDK_INT;
        this.f7701g.mo25681b("CMAlarm", 2, elapsedRealtime, broadcast2, dqx.f13846g);
    }
}

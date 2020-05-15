package p000;

import android.app.AlarmManager;

/* renamed from: skb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class skb implements AlarmManager.OnAlarmListener {

    /* renamed from: a */
    private final aabl f44598a;

    protected skb(aabl aabl) {
        sdo.m34959a(aabl);
        this.f44598a = aabl;
    }

    /* renamed from: a */
    public static skb m35502a(String str, String str2, Runnable runnable) {
        return new ska(str, str2, runnable);
    }

    /* renamed from: a */
    public abstract void mo25665a();

    public final void onAlarm() {
        blji b = this.f44598a.mo16696b("onAlarm");
        try {
            mo25665a();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public skb(String str, String str2) {
        this.f44598a = new aabl(getClass(), 15, str2, str);
    }
}

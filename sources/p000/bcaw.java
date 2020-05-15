package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bcaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcaw {

    /* renamed from: a */
    private final ConcurrentMap f103922a = bnmt.m109809c();

    /* renamed from: b */
    private final Context f103923b;

    public bcaw(Context context) {
        this.f103923b = context;
    }

    /* renamed from: a */
    public final synchronized SharedPreferences mo56674a(bcoh bcoh) {
        Long valueOf = Long.valueOf(bcoh.mo57057a());
        if (this.f103922a.containsKey(valueOf)) {
            return (SharedPreferences) this.f103922a.get(valueOf);
        }
        SharedPreferences sharedPreferences = this.f103923b.getSharedPreferences(String.format("lighter_messaging_prefs_%d.xml", valueOf), 0);
        return (SharedPreferences) bmxv.m108567c((SharedPreferences) this.f103922a.putIfAbsent(valueOf, sharedPreferences)).mo66812a(sharedPreferences);
    }
}

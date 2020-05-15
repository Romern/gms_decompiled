package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: zwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwq implements Callable {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f56061a;

    /* renamed from: b */
    final /* synthetic */ String f56062b;

    /* renamed from: c */
    final /* synthetic */ Boolean f56063c;

    public zwq(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f56061a = sharedPreferences;
        this.f56062b = str;
        this.f56063c = bool;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f56061a.getBoolean(this.f56062b, this.f56063c.booleanValue()));
    }
}

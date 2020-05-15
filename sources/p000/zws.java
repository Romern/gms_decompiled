package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: zws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zws implements Callable {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f56065a;

    /* renamed from: b */
    final /* synthetic */ String f56066b;

    /* renamed from: c */
    final /* synthetic */ Integer f56067c;

    public zws(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f56065a = sharedPreferences;
        this.f56066b = str;
        this.f56067c = num;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Integer.valueOf(this.f56065a.getInt(this.f56066b, this.f56067c.intValue()));
    }
}

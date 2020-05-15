package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: zwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwu implements Callable {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f56069a;

    /* renamed from: b */
    final /* synthetic */ String f56070b;

    /* renamed from: c */
    final /* synthetic */ Long f56071c;

    public zwu(SharedPreferences sharedPreferences, String str, Long l) {
        this.f56069a = sharedPreferences;
        this.f56070b = str;
        this.f56071c = l;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Long.valueOf(this.f56069a.getLong(this.f56070b, this.f56071c.longValue()));
    }
}

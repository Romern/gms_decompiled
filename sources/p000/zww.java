package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: zww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zww implements Callable {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f56073a;

    /* renamed from: b */
    final /* synthetic */ String f56074b;

    /* renamed from: c */
    final /* synthetic */ String f56075c;

    public zww(SharedPreferences sharedPreferences, String str, String str2) {
        this.f56073a = sharedPreferences;
        this.f56074b = str;
        this.f56075c = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f56073a.getString(this.f56074b, this.f56075c);
    }
}

package p000;

import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: aiyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyi {

    /* renamed from: a */
    public int f70065a = 3;

    /* renamed from: b */
    public int f70066b = 0;

    /* renamed from: c */
    public int f70067c = -1;

    /* renamed from: d */
    private int f70068d = 300;

    /* renamed from: e */
    private int f70069e = 0;

    public aiyi() {
    }

    /* renamed from: a */
    public final Strategy mo38269a() {
        int i = this.f70067c;
        if (i != 2 || this.f70066b != 1) {
            return new Strategy(2, 0, this.f70068d, this.f70066b, false, i, this.f70065a, this.f70069e);
        }
        throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
    }

    public aiyi(Strategy strategy) {
        this.f70065a = strategy.f80696i;
        this.f70068d = strategy.f80692e;
        this.f70066b = strategy.f80693f;
        this.f70067c = strategy.f80695h;
        Parcelable.Creator creator = Strategy.CREATOR;
        this.f70069e = strategy.f80697j;
    }

    /* renamed from: a */
    public final void mo38270a(int i) {
        boolean z;
        if (i == Integer.MAX_VALUE) {
            z = true;
        } else {
            z = i <= 86400;
        }
        sdo.m34976b(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), 86400);
        this.f70068d = i;
    }
}

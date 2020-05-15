package p000;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import java.util.Set;

/* renamed from: poj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class poj {

    /* renamed from: a */
    public final Context f39917a;

    /* renamed from: b */
    public final pnl f39918b;

    /* renamed from: c */
    public plx f39919c;

    public poj(Context context, pnl pnl) {
        this.f39917a = context;
        this.f39918b = pnl;
    }

    /* renamed from: a */
    public final poq mo23519a(long j) {
        return new pon(this.f39918b, this.f39919c, this.f39917a, Long.valueOf(j));
    }

    /* renamed from: a */
    public final poq mo23520a(CastDevice castDevice) {
        return new poo(this.f39918b, this.f39919c, castDevice);
    }

    /* renamed from: a */
    public final poq mo23521a(Set set) {
        return new pom(this.f39918b, this.f39919c, set);
    }
}

package p000;

import android.os.IBinder;
import com.google.android.gms.fitness.data.DataPoint;

/* renamed from: zcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zcz extends yxg {

    /* renamed from: a */
    private final IBinder f54924a;

    /* renamed from: b */
    private final yxh f54925b;

    /* renamed from: c */
    private final String f54926c;

    /* renamed from: d */
    private final String f54927d;

    public zcz(String str, yxh yxh, String str2) {
        this.f54927d = str;
        this.f54924a = yxh.asBinder();
        this.f54925b = yxh;
        this.f54926c = str2;
    }

    /* renamed from: a */
    public final void mo30823a(DataPoint dataPoint) {
        this.f54925b.mo30823a(dataPoint);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof zcz) && this.f54924a.equals(((zcz) obj).f54924a));
    }

    public final int hashCode() {
        return this.f54924a.hashCode();
    }

    public final String toString() {
        return String.format("BinderListener{%s %s %s}", this.f54927d, this.f54926c, this.f54924a);
    }
}

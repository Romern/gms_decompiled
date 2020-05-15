package p000;

import android.telecom.Phone;
import java.util.List;

/* renamed from: ntv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ntv {

    /* renamed from: a */
    public final Phone f36486a;

    /* renamed from: b */
    public ntt f36487b;

    /* renamed from: c */
    public final Phone.Listener f36488c = new ntu(this);

    public ntv(Phone phone) {
        if (phone != null) {
            this.f36486a = phone;
            return;
        }
        throw new NullPointerException("Null phone provided");
    }

    /* renamed from: a */
    public final List mo21578a() {
        return nid.m26369a(this.f36486a.getCalls());
    }

    public final String toString() {
        return this.f36486a.toString();
    }
}

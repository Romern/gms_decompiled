package p000;

import android.os.IInterface;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: egk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egk {

    /* renamed from: a */
    public final HashMap f14861a = new HashMap();

    /* renamed from: b */
    private final Looper f14862b;

    /* renamed from: c */
    private final egj f14863c;

    public egk(Looper looper, egj egj) {
        this.f14862b = looper;
        this.f14863c = egj;
    }

    /* renamed from: a */
    public final IInterface mo10090a(Object obj) {
        IInterface iInterface = (IInterface) this.f14861a.get(obj);
        if (iInterface != null) {
            return iInterface;
        }
        IInterface a = this.f14863c.mo10089a(obj, this.f14862b);
        this.f14861a.put(obj, a);
        return a;
    }
}

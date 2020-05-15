package p000;

import android.os.Bundle;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: amqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqv {

    /* renamed from: c */
    public static final amqv f75777c = m63196a(0, null);

    /* renamed from: d */
    public static final amqv f75778d = m63196a(16, null);

    /* renamed from: e */
    public static final amqv f75779e = m63196a(8, null);

    /* renamed from: f */
    public static final amqv f75780f = m63196a(7, null);

    /* renamed from: g */
    public static final amqv f75781g = m63196a(5, null);

    /* renamed from: h */
    public static final amqv f75782h = m63196a(10, null);

    /* renamed from: i */
    public static final amqv f75783i = m63196a(102, null);

    /* renamed from: a */
    public final int f75784a;

    /* renamed from: b */
    public final Bundle f75785b;

    static {
        m63196a(100, null);
        m63196a(101, null);
        m63196a(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, null);
        m63196a(ErrorInfo.TYPE_SDU_FAILED, null);
    }

    private amqv(int i, Bundle bundle) {
        this.f75784a = i;
        this.f75785b = bundle;
    }

    /* renamed from: a */
    public static amqv m63196a(int i, Bundle bundle) {
        return new amqv(i, bundle);
    }
}

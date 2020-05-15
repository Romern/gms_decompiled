package p000;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: chy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chy {

    /* renamed from: a */
    public String f6889a;

    /* renamed from: b */
    private final boolean f6890b;

    /* renamed from: c */
    private int f6891c;

    /* renamed from: d */
    private int f6892d;

    /* renamed from: e */
    private final cic f6893e = cic.f6902b;

    public chy(boolean z) {
        this.f6890b = z;
    }

    /* renamed from: a */
    public final cid mo3910a() {
        if (!TextUtils.isEmpty(this.f6889a)) {
            return new cid(new ThreadPoolExecutor(this.f6891c, this.f6892d, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new cia(this.f6889a, this.f6893e, this.f6890b)));
        }
        String valueOf = String.valueOf(this.f6889a);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Name must be non-null and non-empty, but given: ") : "Name must be non-null and non-empty, but given: ".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo3911a(int i) {
        this.f6891c = i;
        this.f6892d = i;
    }
}

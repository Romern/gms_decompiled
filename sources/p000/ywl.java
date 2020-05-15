package p000;

import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ywl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywl {

    /* renamed from: a */
    public Session f54703a = null;

    /* renamed from: b */
    public int f54704b = 0;

    /* renamed from: c */
    public int f54705c = 0;

    /* renamed from: d */
    public boolean f54706d = false;

    /* renamed from: e */
    private long f54707e = 0;

    /* renamed from: f */
    private long f54708f = 0;

    /* renamed from: g */
    private final List f54709g = new ArrayList();

    /* renamed from: a */
    public final Bucket mo30793a() {
        return new Bucket(this.f54707e, this.f54708f, this.f54703a, this.f54704b, this.f54709g, this.f54705c, this.f54706d);
    }

    /* renamed from: a */
    public final void mo30794a(long j, long j2, TimeUnit timeUnit) {
        this.f54707e = timeUnit.toMillis(j);
        this.f54708f = timeUnit.toMillis(j2);
    }

    /* renamed from: a */
    public final void mo30795a(DataSet dataSet) {
        this.f54709g.add(dataSet);
    }
}

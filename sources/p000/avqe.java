package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: avqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avqe extends avqd {

    /* renamed from: f */
    public static final Logger f93772f = avpq.m79020g("NormalNetworkRequester");

    /* renamed from: g */
    private final long f93773g;

    private avqe(Context context, long j) {
        super(context);
        this.f93773g = j;
    }

    /* renamed from: a */
    public static avqe m79047a(Context context, long j) {
        return new avqe(context, j);
    }

    /* renamed from: c */
    public final void mo51499c() {
        try {
            mo51498b(this.f93773g);
        } catch (IOException e) {
            f93772f.mo25417e("Failed to acquire the non-metered network.", e, new Object[0]);
            mo51495a(this.f93773g);
        }
    }
}

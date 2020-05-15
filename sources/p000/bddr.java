package p000;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bddr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bddr implements bdeq {

    /* renamed from: a */
    public final Executor f105380a;

    /* renamed from: b */
    private final Context f105381b;

    /* renamed from: c */
    private final rjx f105382c;

    public bddr(Context context, Executor executor, allq allq) {
        bmxy.m108581a(context);
        bmxy.m108581a(allq);
        rjx a = allr.m61234a(context, allq);
        bmxy.m108581a(context);
        this.f105381b = context;
        bmxy.m108581a(a);
        this.f105382c = a;
        bmxy.m108581a(executor);
        this.f105380a = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12344a(Object obj, int i, bdep bdep) {
        rjx rjx = this.f105382c;
        String b = ((bddo) obj).mo57896b();
        Context context = this.f105381b;
        int i2 = 2;
        if (i > 0) {
            float f = ((float) i) / context.getResources().getDisplayMetrics().density;
            if (f > 64.0f) {
                i2 = 3;
            } else if (f <= 48.0f) {
                i2 = f > 32.0f ? 1 : 0;
            }
        }
        rjx.mo24713a(b, i2, 1).mo9459a(new bddq(this, bdep), 3, TimeUnit.SECONDS);
    }
}

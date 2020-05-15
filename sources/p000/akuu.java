package p000;

import android.util.Pair;
import java.util.concurrent.TimeUnit;

/* renamed from: akuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class akuu extends akup {
    /* renamed from: a */
    public final Object mo39747a(Object obj) {
        bmza b = bmza.m108659b(bmvy.f131119a);
        Pair b2 = mo39835b(obj);
        if (((Boolean) b2.first).booleanValue()) {
            mo39833a();
        }
        mo39834a(b.mo66928a(TimeUnit.MILLISECONDS));
        return b2.second;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39833a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39834a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Pair mo39835b(Object obj);
}

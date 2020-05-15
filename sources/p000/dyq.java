package p000;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: dyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dyq extends eal {

    /* renamed from: b */
    public static final dxr f14438b = new dxr(new dyp(), "DestinationPredictionProducer", new int[]{46}, new int[]{1, 6});

    public dyq(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14438b, str, dqb);
    }

    /* renamed from: a */
    public static bxne m9836a(bxce bxce) {
        byte[] a = ContextData.m22843a(bxce);
        if (a == null) {
            return null;
        }
        try {
            return (bxne) GeneratedMessageLite.m124016a(bxne.f164022b, a, bxus.m123744c());
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("dyq", "a", 69, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[DestinationPredictionProducer] Invalid prediction received.");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
    }
}

package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: ahxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahxb extends ahgx {

    /* renamed from: b */
    private final sqv f68281b;

    public ahxb(Context context) {
        super(context, "nearby-fast-pair", "nearby_scan_fast_pair_item_cache.db");
        this.f68281b = (sqv) ahgz.m55754a(context, sqv.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo36458a() {
        return ahyx.f68417f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo36461a(Object obj) {
        ahyx ahyx = (ahyx) obj;
        return ahyx.f68423e && this.f68281b.mo20505a() - ahyx.f68422d >= TimeUnit.HOURS.toMillis(cfog.m141295w());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo36463b(Object obj) {
        return ((ahyx) obj).f68420b;
    }
}

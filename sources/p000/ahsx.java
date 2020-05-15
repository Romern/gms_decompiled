package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: ahsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahsx extends ahsw {

    /* renamed from: b */
    private final sqv f67972b;

    public ahsx(Context context) {
        super(context, "nearby_discovery_scan_result_cache.db");
        this.f67972b = (sqv) ahgz.m55754a(context, sqv.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo36458a() {
        return aiac.f68544k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo36461a(Object obj) {
        Long l;
        aiac aiac = (aiac) obj;
        long a = this.f67972b.mo20505a();
        if ((aiac.f68546a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            l = Long.valueOf(aiac.f68555j);
        } else {
            l = null;
        }
        return ahsu.m56521b(a, l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo36463b(Object obj) {
        return ((aiac) obj).f68547b;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo37104c(bxxc bxxc) {
        Long l;
        aiac aiac = (aiac) bxxc;
        long a = this.f67972b.mo20505a();
        if ((aiac.f68546a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            l = Long.valueOf(aiac.f68555j);
        } else {
            l = null;
        }
        return !ahsu.m56516a(a, l);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo37103b(bxxc bxxc) {
        aiac aiac = (aiac) bxxc;
        return false;
    }
}

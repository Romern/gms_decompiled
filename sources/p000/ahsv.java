package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: ahsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahsv extends ahsw {

    /* renamed from: b */
    private final sqv f67971b;

    public ahsv(Context context) {
        super(context, "nearby_discovery_item_cache.db");
        this.f67971b = (sqv) ahgz.m55754a(context, sqv.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo36458a() {
        return aiaa.f68501K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo36461a(Object obj) {
        Long l;
        aiaa aiaa = (aiaa) obj;
        long a = this.f67971b.mo20505a();
        if ((aiaa.f68513a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            l = Long.valueOf(aiaa.f68523k);
        } else {
            l = null;
        }
        return ahsu.m56521b(a, l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo36463b(Object obj) {
        return ((aiaa) obj).f68515c;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo37104c(bxxc bxxc) {
        return ahsu.m56517a((aiaa) bxxc, this.f67971b.mo20505a());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo37103b(bxxc bxxc) {
        aiaa aiaa = (aiaa) bxxc;
        if (ahsu.m56515a(this.f67971b.mo20505a(), aiaa)) {
            return true;
        }
        int a = ahzz.m56940a(aiaa.f68525m);
        return a != 0 && a == 3;
    }
}

package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbnn implements bbno {

    /* renamed from: a */
    public final bbnd f102961a;

    /* renamed from: b */
    public final ayte f102962b;

    /* renamed from: c */
    public final bbod f102963c;

    public bbnn(bbnd bbnd, bbod bbod, ayte ayte) {
        this.f102961a = bbnd;
        this.f102963c = bbod;
        this.f102962b = ayte;
    }

    /* renamed from: a */
    public final bqgg mo56235a() {
        AtomicReference atomicReference = new AtomicReference();
        return bqdx.m112673a(this.f102963c.mo56271a(new bbmy(atomicReference)), new bbmz(this, atomicReference), bqfb.INSTANCE);
    }

    @Deprecated
    public bbnn(Class cls, bbod bbod, ayte ayte) {
        this.f102961a = new bbnc(cls);
        this.f102963c = bbod;
        this.f102962b = ayte;
    }

    /* renamed from: a */
    public final bqgg mo56236a(Enum enumR) {
        return this.f102963c.mo56271a(new bbmx(this, enumR, this.f102962b.mo54417a()));
    }

    /* renamed from: a */
    public final bqgg mo56237a(Iterable iterable) {
        return bqdx.m112674a(mo56235a(), new bbna(iterable), bqfb.INSTANCE);
    }
}

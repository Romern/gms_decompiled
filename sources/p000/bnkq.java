package p000;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bnkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnkq extends bnfk implements Serializable {
    private static final long serialVersionUID = 3;

    /* renamed from: a */
    final bnle f131775a;

    /* renamed from: b */
    final bnle f131776b;

    /* renamed from: c */
    final bmxh f131777c;

    /* renamed from: d */
    final int f131778d;

    /* renamed from: e */
    transient ConcurrentMap f131779e;

    public bnkq(bnle bnle, bnle bnle2, bmxh bmxh, int i, ConcurrentMap concurrentMap) {
        this.f131775a = bnle;
        this.f131776b = bnle2;
        this.f131777c = bmxh;
        this.f131778d = i;
        this.f131779e = concurrentMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ConcurrentMap mo67519a() {
        return this.f131779e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Map mo67520b() {
        return this.f131779e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9244c() {
        return this.f131779e;
    }
}

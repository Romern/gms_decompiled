package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agki implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f65791a;

    /* renamed from: b */
    final /* synthetic */ String f65792b;

    /* renamed from: c */
    final /* synthetic */ String f65793c;

    /* renamed from: d */
    final /* synthetic */ String f65794d;

    /* renamed from: e */
    final /* synthetic */ agkm f65795e;

    public agki(agkm agkm, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f65795e = agkm;
        this.f65791a = atomicReference;
        this.f65792b = str;
        this.f65793c = str2;
        this.f65794d = str3;
    }

    public final void run() {
        agln l = this.f65795e.f65756y.mo35508l();
        AtomicReference atomicReference = this.f65791a;
        String str = this.f65792b;
        String str2 = this.f65793c;
        String str3 = this.f65794d;
        l.mo35241h();
        l.mo35245l();
        l.mo35621a(new aglf(l, atomicReference, str, str2, str3, l.mo35615a(false)));
    }
}

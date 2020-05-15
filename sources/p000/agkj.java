package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f65796a;

    /* renamed from: b */
    final /* synthetic */ String f65797b;

    /* renamed from: c */
    final /* synthetic */ String f65798c;

    /* renamed from: d */
    final /* synthetic */ String f65799d;

    /* renamed from: e */
    final /* synthetic */ boolean f65800e;

    /* renamed from: f */
    final /* synthetic */ agkm f65801f;

    public agkj(agkm agkm, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f65801f = agkm;
        this.f65796a = atomicReference;
        this.f65797b = str;
        this.f65798c = str2;
        this.f65799d = str3;
        this.f65800e = z;
    }

    public final void run() {
        agln l = this.f65801f.f65756y.mo35508l();
        AtomicReference atomicReference = this.f65796a;
        String str = this.f65797b;
        String str2 = this.f65798c;
        String str3 = this.f65799d;
        boolean z = this.f65800e;
        l.mo35241h();
        l.mo35245l();
        l.mo35621a(new aglg(l, atomicReference, str, str2, str3, z, l.mo35615a(false)));
    }
}

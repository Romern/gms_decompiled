package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: ceu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ceu extends WeakReference {

    /* renamed from: a */
    final cdg f6626a;

    /* renamed from: b */
    final boolean f6627b;

    /* renamed from: c */
    cgj f6628c = null;

    public ceu(cdg cdg, cgb cgb, ReferenceQueue referenceQueue) {
        super(cgb, referenceQueue);
        crb.m7382a(cdg);
        this.f6626a = cdg;
        this.f6627b = cgb.f6772a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3783a() {
        this.f6628c = null;
        clear();
    }
}

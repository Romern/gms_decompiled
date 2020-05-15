package p000;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: agp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agp {

    /* renamed from: a */
    public boolean f514a = false;

    /* renamed from: b */
    public final CopyOnWriteArrayList f515b = new CopyOnWriteArrayList();

    /* renamed from: c */
    final /* synthetic */ C1050hj f516c;

    public agp() {
    }

    /* renamed from: a */
    public final void mo684a(agj agj) {
        this.f515b.add(agj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo685b(agj agj) {
        this.f515b.remove(agj);
    }

    public agp(C1050hj hjVar) {
        this.f516c = hjVar;
    }
}

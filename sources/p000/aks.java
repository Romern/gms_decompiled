package p000;

import java.util.Collection;

/* renamed from: aks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aks implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aku f787a;

    /* renamed from: b */
    final /* synthetic */ Collection f788b;

    /* renamed from: c */
    final /* synthetic */ akv f789c;

    public aks(akv akv, aku aku, Collection collection) {
        this.f789c = akv;
        this.f787a = aku;
        this.f788b = collection;
    }

    public final void run() {
        this.f787a.mo928a(this.f789c, this.f788b);
    }
}

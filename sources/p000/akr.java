package p000;

import java.util.Collection;

/* renamed from: akr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aku f784a;

    /* renamed from: b */
    final /* synthetic */ Collection f785b;

    /* renamed from: c */
    final /* synthetic */ akv f786c;

    public akr(akv akv, aku aku, Collection collection) {
        this.f786c = akv;
        this.f784a = aku;
        this.f785b = collection;
    }

    public final void run() {
        this.f784a.mo928a(this.f786c, this.f785b);
    }
}

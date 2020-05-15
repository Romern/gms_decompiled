package p000;

import com.google.android.gms.measurement.internal.AppMetadata;

/* renamed from: agjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f65730a;

    /* renamed from: b */
    final /* synthetic */ aghp f65731b;

    public agjl(aghp aghp, AppMetadata appMetadata) {
        this.f65731b = aghp;
        this.f65730a = appMetadata;
    }

    public final void run() {
        this.f65731b.f65526a.mo35701y();
        agmn agmn = this.f65731b.f65526a;
        AppMetadata appMetadata = this.f65730a;
        agmn.mo35694r();
        agmn.mo35695s();
        sdo.m34977c(appMetadata.f80098a);
        agmn.mo35674b(appMetadata);
    }
}

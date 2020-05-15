package p000;

import com.google.android.gms.measurement.internal.AppMetadata;

/* renamed from: agjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f65746a;

    /* renamed from: b */
    final /* synthetic */ aghp f65747b;

    public agjr(aghp aghp, AppMetadata appMetadata) {
        this.f65747b = aghp;
        this.f65746a = appMetadata;
    }

    public final void run() {
        this.f65747b.f65526a.mo35701y();
        this.f65747b.f65526a.mo35667a(this.f65746a);
    }
}

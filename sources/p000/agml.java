package p000;

import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;

/* renamed from: agml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agml implements Callable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f65939a;

    /* renamed from: b */
    final /* synthetic */ agmn f65940b;

    public agml(agmn agmn, AppMetadata appMetadata) {
        this.f65940b = agmn;
        this.f65939a = appMetadata;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f65940b.mo35674b(this.f65939a).mo35252b();
    }
}

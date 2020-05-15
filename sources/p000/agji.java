package p000;

import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;

/* renamed from: agji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agji implements Callable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f65720a;

    /* renamed from: b */
    final /* synthetic */ String f65721b;

    /* renamed from: c */
    final /* synthetic */ String f65722c;

    /* renamed from: d */
    final /* synthetic */ aghp f65723d;

    public agji(aghp aghp, AppMetadata appMetadata, String str, String str2) {
        this.f65723d = aghp;
        this.f65720a = appMetadata;
        this.f65721b = str;
        this.f65722c = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f65723d.f65526a.mo35701y();
        return this.f65723d.f65526a.mo35684h().mo35350b(this.f65720a.f80098a, this.f65721b, this.f65722c);
    }
}

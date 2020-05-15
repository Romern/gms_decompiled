package p000;

import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;

/* renamed from: agjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjg implements Callable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f65712a;

    /* renamed from: b */
    final /* synthetic */ String f65713b;

    /* renamed from: c */
    final /* synthetic */ String f65714c;

    /* renamed from: d */
    final /* synthetic */ aghp f65715d;

    public agjg(aghp aghp, AppMetadata appMetadata, String str, String str2) {
        this.f65715d = aghp;
        this.f65712a = appMetadata;
        this.f65713b = str;
        this.f65714c = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f65715d.f65526a.mo35701y();
        return this.f65715d.f65526a.mo35684h().mo35341a(this.f65712a.f80098a, this.f65713b, this.f65714c);
    }
}

package p000;

import java.util.Set;

/* renamed from: aiku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiku {

    /* renamed from: a */
    private final Set f69065a = new C1225nr();

    /* renamed from: b */
    private ahfk f69066b = new ahfk();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized ahfk mo37603a() {
        return this.f69066b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo37605b(String str) {
        if (!this.f69065a.contains(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiku", "b", 2215, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("In ScanningCancellationFlag, service %s attempted to cancel the scan but they were not registered as a scanner", str);
            return;
        }
        this.f69065a.remove(str);
        if (this.f69065a.isEmpty()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aiku", "b", 2227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("In ScanningCancellationFlag, service %s is the last scanner to stop scanning. The flag has been cancelled.", str);
            this.f69066b.mo36398a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo37604a(String str) {
        if (this.f69065a.isEmpty()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiku", "a", 2203, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("In ScanningCancellationFlag, service %s has become the first scanner. The flag has been reset.", str);
            this.f69066b = new ahfk();
        }
        this.f69065a.add(str);
    }
}

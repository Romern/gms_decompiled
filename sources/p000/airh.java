package p000;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: airh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class airh implements bluw {

    /* renamed from: a */
    final /* synthetic */ airi f69542a;

    public airh(airi airi) {
        this.f69542a = airi;
    }

    /* renamed from: a */
    public final void mo13814a() {
        airi airi = this.f69542a;
        CountDownLatch countDownLatch = airi.f69544b;
        countDownLatch.getClass();
        airi.mo37892a(new aire(countDownLatch));
    }

    /* renamed from: a */
    public final void mo13818a(byte[] bArr) {
        this.f69542a.mo37894b(bArr);
    }

    /* renamed from: b */
    public final void mo13820b() {
        this.f69542a.mo37892a(new airf(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo37890b(IOException iOException) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68437a(iOException);
        bnsl.mo68432a("airh", "b", 383, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PhysicalBleSocket connected to %s encountered an error with its internal Weave socket.", this.f69542a.f69543a);
    }

    /* renamed from: a */
    public final void mo13815a(IOException iOException) {
        this.f69542a.mo37892a(new airg(this, iOException));
    }
}

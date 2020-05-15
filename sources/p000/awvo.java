package p000;

import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvo implements srl {

    /* renamed from: a */
    final /* synthetic */ Object f95163a;

    /* renamed from: b */
    final /* synthetic */ String f95164b;

    /* renamed from: c */
    final /* synthetic */ bjev f95165c;

    /* renamed from: d */
    final /* synthetic */ int f95166d;

    /* renamed from: e */
    final /* synthetic */ awvy f95167e;

    public awvo(awvy awvy, Object obj, String str, bjev bjev, int i) {
        this.f95167e = awvy;
        this.f95163a = obj;
        this.f95164b = str;
        this.f95165c = bjev;
        this.f95166d = i;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, bxxc], assign insn: 0x0002: IGET  (r5v2 ? I:java.lang.Object) = (r4v0 'this' awvo A[THIS]) awvo.a java.lang.Object */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21850a(Object obj) {
        Void voidR = (Void) obj;
        ? r5 = this.f95163a;
        if (r5 instanceof bxxc) {
            ServerResponse a = this.f95167e.f95196c.mo52125a(this.f95164b, this.f95165c, r5.mo73642k(), this.f95166d);
            if (a.mo60051d()) {
                if (a.mo60052e() != null) {
                    a.mo60052e();
                    bjvp.m104739a(this.f95164b);
                } else {
                    throw new IllegalArgumentException("ServerResponse should contain proto response");
                }
            }
            return a;
        }
        throw new IllegalArgumentException("Request should be MessageLite type");
    }
}

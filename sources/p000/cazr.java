package p000;

/* renamed from: cazr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cazr implements cazn {

    /* renamed from: a */
    public final bqgg f176456a;

    /* renamed from: b */
    final /* synthetic */ cazt f176457b;

    /* JADX WARN: Type inference failed for: r0v1, types: [cazp, java.lang.Runnable], assign insn: 0x0011: CONSTRUCTOR  (r0v1 ? I:cazp) = (r3v2 cazs) call: cazp.<init>(bqgg):void type: CONSTRUCTOR */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public cazr(cazt cazt) {
        this.f176457b = cazt;
        cazs cazs = this.f176457b.f176458a;
        if (!cazs.isDone()) {
            ? cazp = new cazp(cazs);
            cazs.mo741a((Runnable) cazp, bqfb.INSTANCE);
            cazs = cazp;
        }
        this.f176456a = cazs;
    }

    /* renamed from: b */
    public final bqgg mo75201b() {
        this.f176457b.mo75201b();
        return this.f176456a;
    }
}

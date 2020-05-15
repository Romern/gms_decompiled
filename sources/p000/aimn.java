package p000;

import android.content.Context;

/* renamed from: aimn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aimn {

    /* renamed from: a */
    public final aivd f69193a;

    /* renamed from: b */
    public final aivv f69194b;

    /* renamed from: c */
    private final aitq f69195c = new aitq();

    /* renamed from: d */
    private final aivn f69196d = new aivn();

    public aimn(Context context, airs airs) {
        this.f69193a = new aivd(context, this.f69195c, this.f69196d, airs);
        this.f69194b = new aivv(this.f69193a, this.f69195c, this.f69196d, airs);
    }

    /* renamed from: a */
    public final synchronized void mo37687a() {
        this.f69194b.mo38132a();
        this.f69193a.mo38088a();
        this.f69196d.mo38121a();
    }

    /* renamed from: b */
    public final boolean mo37688b() {
        return this.f69193a.mo38101b();
    }
}

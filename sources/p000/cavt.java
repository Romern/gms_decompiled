package p000;

import java.io.IOException;

/* renamed from: cavt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavt extends cavc {

    /* renamed from: b */
    final /* synthetic */ int f176173b;

    /* renamed from: c */
    final /* synthetic */ cawc f176174c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cavt(cawc cawc, String str, Object[] objArr, int i) {
        super(str, objArr);
        this.f176174c = cawc;
        this.f176173b = i;
    }

    /* renamed from: a */
    public final void mo74949a() {
        try {
            this.f176174c.f176211q.mo74976a(this.f176173b, cavl.CANCEL);
            synchronized (this.f176174c) {
                this.f176174c.f176213s.remove(Integer.valueOf(this.f176173b));
            }
        } catch (IOException e) {
        }
    }
}

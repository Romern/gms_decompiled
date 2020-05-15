package p000;

import java.io.IOException;

/* renamed from: cavs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavs extends cavc {

    /* renamed from: b */
    final /* synthetic */ int f176171b;

    /* renamed from: c */
    final /* synthetic */ cawc f176172c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cavs(cawc cawc, String str, Object[] objArr, int i) {
        super(str, objArr);
        this.f176172c = cawc;
        this.f176171b = i;
    }

    /* renamed from: a */
    public final void mo74949a() {
        try {
            this.f176172c.f176211q.mo74976a(this.f176171b, cavl.CANCEL);
            synchronized (this.f176172c) {
                this.f176172c.f176213s.remove(Integer.valueOf(this.f176171b));
            }
        } catch (IOException e) {
        }
    }
}

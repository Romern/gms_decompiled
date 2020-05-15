package p000;

import java.io.IOException;

/* renamed from: cavu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavu extends cavc {

    /* renamed from: b */
    final /* synthetic */ int f176175b;

    /* renamed from: c */
    final /* synthetic */ cipu f176176c;

    /* renamed from: d */
    final /* synthetic */ int f176177d;

    /* renamed from: e */
    final /* synthetic */ cawc f176178e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cavu(cawc cawc, String str, Object[] objArr, int i, cipu cipu, int i2) {
        super(str, objArr);
        this.f176178e = cawc;
        this.f176175b = i;
        this.f176176c = cipu;
        this.f176177d = i2;
    }

    /* renamed from: a */
    public final void mo74949a() {
        try {
            this.f176176c.mo86317h((long) this.f176177d);
            this.f176178e.f176211q.mo74976a(this.f176175b, cavl.CANCEL);
            synchronized (this.f176178e) {
                this.f176178e.f176213s.remove(Integer.valueOf(this.f176175b));
            }
        } catch (IOException e) {
        }
    }
}

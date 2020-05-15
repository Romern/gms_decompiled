package p000;

/* renamed from: bjqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqo extends bjhs {

    /* renamed from: d */
    int f123143d;

    public bjqo() {
        super(bwzn.f161623d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        int a = bwzm.m122468a(((bwzn) bxxc).f161626b);
        if (a == 0) {
            a = 2;
        }
        this.f123143d = a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwzn.f161622c.mo74144da();
        int i = this.f123143d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwzn bwzn = (bwzn) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bwzn.f161626b = i2;
            bwzn.f161625a |= 1;
            return (bwzn) da.mo74062i();
        }
        throw null;
    }
}

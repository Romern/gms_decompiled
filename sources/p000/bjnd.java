package p000;

/* renamed from: bjnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjnd extends bjhs {

    /* renamed from: d */
    ByteString f122996d = null;

    public bjnd() {
        super(bwrq.f160791d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        ByteString bxtx;
        bwrq bwrq = (bwrq) bxxc;
        if (bwrq.f160793a == 1) {
            bxtx = (ByteString) bwrq.f160794b;
        } else {
            bxtx = bxtx.f164797b;
        }
        this.f122996d = bxtx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwrq.f160790c.mo74144da();
        ByteString bxtx = this.f122996d;
        if (bxtx != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwrq bwrq = (bwrq) da.f164949b;
            bxtx.getClass();
            bwrq.f160793a = 1;
            bwrq.f160794b = bxtx;
        }
        return (bwrq) da.mo74062i();
    }
}

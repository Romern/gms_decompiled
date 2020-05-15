package p000;

/* renamed from: bjfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjfl implements bjex {

    /* renamed from: a */
    private final bjex[] f122628a;

    public bjfl(bjex[] bjexArr) {
        this.f122628a = bjexArr;
    }

    /* renamed from: a */
    public final bjfd mo52450a(bjfc bjfc) {
        bjex[] bjexArr = this.f122628a;
        for (int i = 0; i < 3; i++) {
            bjex bjex = bjexArr[i];
            if (bjex.mo52451b(bjfc)) {
                return bjex.mo52450a(bjfc);
            }
        }
        return new bjfd(bjfd.m103295a(2));
    }

    /* renamed from: b */
    public boolean mo52451b(bjfc bjfc) {
        bjex[] bjexArr = this.f122628a;
        for (int i = 0; i < 3; i++) {
            if (bjexArr[i].mo52451b(bjfc)) {
                return true;
            }
        }
        return false;
    }
}

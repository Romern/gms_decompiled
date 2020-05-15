package p000;

/* renamed from: atbp */
final /* synthetic */ class atbp implements atbl {

    /* renamed from: a */
    private final String f90016a;

    public atbp(String str) {
        this.f90016a = str;
    }

    /* renamed from: a */
    public final Object mo49778a(atda atda) {
        String str = this.f90016a;
        srn srn = atbq.f90017a;
        if (!atda.f90103d.equals(str)) {
            atda.f90103d = str;
            atda.f90109j = null;
            return atda;
        }
        throw new atbk(new atcz("Wants to update the state to existing one."));
    }
}

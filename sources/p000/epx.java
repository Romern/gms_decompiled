package p000;

/* renamed from: epx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class epx extends C0942ds {
    public epx(C0953ec ecVar) {
        super(ecVar);
    }

    /* renamed from: a */
    public final String mo10122a() {
        return "INSERT OR REPLACE INTO `dismissed_prompt_item` (`accountName`,`promptItemId`) VALUES (?,?)";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9522a(C0939dp dpVar, Object obj) {
        eqb eqb = (eqb) obj;
        String str = eqb.f15508a;
        if (str == null) {
            dpVar.mo8917a(1);
        } else {
            dpVar.mo8919a(1, str);
        }
        Long l = eqb.f15509b;
        if (l == null) {
            dpVar.mo8917a(2);
        } else {
            dpVar.mo8918a(2, l.longValue());
        }
    }
}

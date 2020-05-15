package p000;

/* renamed from: eqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eqp extends C0942ds {
    public eqp(C0953ec ecVar) {
        super(ecVar);
    }

    /* renamed from: a */
    public final String mo10122a() {
        return "INSERT OR REPLACE INTO `per_device_dismissed_onboarding_flow` (`dismissalId`) VALUES (?)";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9522a(C0939dp dpVar, Object obj) {
        Long l = ((eqt) obj).f15535a;
        if (l == null) {
            dpVar.mo8917a(1);
        } else {
            dpVar.mo8918a(1, l.longValue());
        }
    }
}

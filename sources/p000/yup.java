package p000;

/* renamed from: yup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yup {

    /* renamed from: a */
    private static final srn f54652a = zvt.m46581a();

    /* renamed from: b */
    private static final bmyx f54653b = bmyx.m108640a(',').mo66917a();

    /* renamed from: a */
    public static bnic m44878a(String str) {
        try {
            return bnic.m109488a(bnjd.m109575a(f54653b.mo66918a((CharSequence) str), yuo.f54651a));
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f54652a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("yup", "a", 33, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Failed to parse DataType names:{%s} provided in flag:{%s}", str, "fitness.data_update_notification_allowed_data_types");
            return bnon.f131923a;
        }
    }
}

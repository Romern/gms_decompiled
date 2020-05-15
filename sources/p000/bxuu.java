package p000;

/* renamed from: bxuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxuu {

    /* renamed from: a */
    public static final bxut f164876a = new bxut();

    /* renamed from: b */
    private static final bxut f164877b;

    static {
        bxut bxut;
        try {
            bxut = (bxut) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            bxut = null;
        }
        f164877b = bxut;
    }

    /* renamed from: a */
    static bxut m123753a() {
        bxut bxut = f164877b;
        if (bxut != null) {
            return bxut;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}

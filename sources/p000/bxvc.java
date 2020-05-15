package p000;

/* renamed from: bxvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxvc implements bxxa {

    /* renamed from: a */
    public static final bxvc f164947a = new bxvc();

    private bxvc() {
    }

    /* renamed from: a */
    public final boolean mo73930a(Class cls) {
        return bxvk.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final bxwz mo73931b(Class cls) {
        if (!bxvk.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported message type: ") : "Unsupported message type: ".concat(valueOf));
        }
        try {
            Class asSubclass = cls.asSubclass(bxvk.class);
            bxvk bxvk = (bxvk) bxvk.f164959aj.get(asSubclass);
            if (bxvk == null) {
                Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                bxvk = (bxvk) bxvk.f164959aj.get(asSubclass);
            }
            if (bxvk == null) {
                bxvk = (bxvk) ((bxvk) bxyx.m124496a(asSubclass)).mo74142c(6);
                if (bxvk != null) {
                    bxvk.f164959aj.put(asSubclass, bxvk);
                } else {
                    throw new IllegalStateException();
                }
            }
            return (bxwz) bxvk.mo74142c(3);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Class initialization cannot fail.", e);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Unable to get message info for ") : "Unable to get message info for ".concat(valueOf2), e2);
        }
    }
}

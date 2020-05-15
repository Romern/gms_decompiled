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
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final bxwz mo73931b(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported message type: ") : "Unsupported message type: ".concat(valueOf));
        }
        try {
            Class asSubclass = cls.asSubclass(GeneratedMessageLite.class);
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) GeneratedMessageLite.f164959aj.get(asSubclass);
            if (GeneratedMessageLite == null) {
                Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                GeneratedMessageLite = (GeneratedMessageLite) GeneratedMessageLite.f164959aj.get(asSubclass);
            }
            if (GeneratedMessageLite == null) {
                GeneratedMessageLite = (GeneratedMessageLite) ((GeneratedMessageLite) bxyx.m124496a(asSubclass)).mo74142c(6);
                if (GeneratedMessageLite != null) {
                    GeneratedMessageLite.f164959aj.put(asSubclass, GeneratedMessageLite);
                } else {
                    throw new IllegalStateException();
                }
            }
            return (bxwz) GeneratedMessageLite.mo74142c(3);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Class initialization cannot fail.", e);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Unable to get message info for ") : "Unable to get message info for ".concat(valueOf2), e2);
        }
    }
}

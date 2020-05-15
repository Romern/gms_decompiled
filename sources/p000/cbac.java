package p000;

/* renamed from: cbac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbac {

    /* renamed from: a */
    private static final bmxj f176469a = new cazz();

    /* renamed from: b */
    private static final bqeh f176470b = new cbaa();

    static {
        new cazo(bqga.m112775a(bnoj.f131912b));
    }

    /* renamed from: a */
    public static bqgg m127642a(bqgg bqgg) {
        return bqdf.m112620a(bqdx.m112673a(bqgg, f176469a, bqfb.INSTANCE), Throwable.class, f176470b, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public static cazn m127643a(cazn cazn) {
        if (cazn instanceof cazv) {
            return ((cazv) cazn).mo75204bf();
        }
        String valueOf = String.valueOf(cazn);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
        sb.append("nonCancellationPropagatingViewOf called with non-CancellableProducer: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [cazv, java.lang.Object, cazn], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static cazn m127644a(cazn r2, cazw cazw) {
        if (r2 instanceof cazv) {
            return r2.mo75202a(cazw);
        }
        String valueOf = String.valueOf((Object) r2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("entryPointViewOf called with non-CancellableProducer: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static cazn m127645a(cijl cijl) {
        bmxy.m108581a(cijl);
        return new cbab(cijl);
    }

    /* renamed from: a */
    public static void m127646a(cazn cazn, boolean z) {
        if (cazn instanceof cazv) {
            ((cazv) cazn).mo75203a(z);
            return;
        }
        String valueOf = String.valueOf(cazn);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("cancel called with non-CancellableProducer: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}

package p000;

/* renamed from: cayx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayx implements cijl, cayo {

    /* renamed from: a */
    private static final Object f176436a = new Object();

    /* renamed from: b */
    private volatile cijl f176437b;

    /* renamed from: c */
    private volatile Object f176438c = f176436a;

    private cayx(cijl cijl) {
        this.f176437b = cijl;
    }

    /* renamed from: a */
    public static cijl m127579a(cijl cijl) {
        cazf.m127594a(cijl);
        return !(cijl instanceof cayx) ? new cayx(cijl) : cijl;
    }

    /* renamed from: b */
    public static cayo m127580b(cijl cijl) {
        if (cijl instanceof cayo) {
            return (cayo) cijl;
        }
        cazf.m127594a(cijl);
        return new cayx(cijl);
    }

    /* renamed from: a */
    public final Object mo6445a() {
        Object obj = this.f176438c;
        if (obj == f176436a) {
            synchronized (this) {
                obj = this.f176438c;
                if (obj == f176436a) {
                    obj = this.f176437b.mo6445a();
                    Object obj2 = this.f176438c;
                    if (obj2 != f176436a) {
                        if (!(obj2 instanceof caze)) {
                            if (obj2 != obj) {
                                String valueOf = String.valueOf(obj2);
                                String valueOf2 = String.valueOf(obj);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                                sb.append("Scoped provider was invoked recursively returning different results: ");
                                sb.append(valueOf);
                                sb.append(" & ");
                                sb.append(valueOf2);
                                sb.append(". This is likely due to a circular dependency.");
                                throw new IllegalStateException(sb.toString());
                            }
                        }
                    }
                    this.f176438c = obj;
                    this.f176437b = null;
                }
            }
        }
        return obj;
    }
}

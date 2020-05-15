package p000;

/* renamed from: afxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afxx extends afyf {

    /* renamed from: a */
    public final afyd f64951a;

    /* renamed from: b */
    private final afye f64952b;

    public afxx(afyd afyd, afye afye) {
        if (afyd != null) {
            this.f64951a = afyd;
            if (afye != null) {
                this.f64952b = afye;
                return;
            }
            throw new NullPointerException("Null scheduleType");
        }
        throw new NullPointerException("Null taskId");
    }

    /* renamed from: a */
    public final afyd mo35058a() {
        return this.f64951a;
    }

    /* renamed from: b */
    public final afye mo35059b() {
        return this.f64952b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afyf) {
            afyf afyf = (afyf) obj;
            return this.f64951a.equals(afyf.mo35058a()) && this.f64952b.equals(afyf.mo35059b());
        }
    }

    public final int hashCode() {
        return ((this.f64951a.hashCode() ^ 1000003) * 1000003) ^ this.f64952b.hashCode();
    }
}

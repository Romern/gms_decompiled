package p000;

import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: bllh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bllh extends bllc {
    private static final long serialVersionUID = 4556936364828217687L;

    /* renamed from: a */
    private final Object f126791a;

    /* renamed from: b */
    private Map f126792b;

    /* renamed from: c */
    private blld f126793c;

    protected bllh() {
        this(null);
    }

    /* renamed from: b */
    private final boolean m107324b() {
        return this.f126792b == null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    /* renamed from: a */
    public final Map mo66642a() {
        Map map;
        synchronized (this.f126791a) {
            if (!m107324b()) {
                map = this.f126792b;
                bmxy.m108582a(map, "requestMetadata");
            } else {
                synchronized (this.f126791a) {
                    this.f126792b = null;
                    this.f126793c = null;
                    throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
                }
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bllh) {
            bllh bllh = (bllh) obj;
            if (!Objects.equals(this.f126792b, bllh.f126792b) || !Objects.equals(this.f126793c, bllh.f126793c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f126792b, this.f126793c);
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("requestMetadata", this.f126792b);
        a.mo66885a("temporaryAccess", this.f126793c);
        return a.toString();
    }

    @Deprecated
    public bllh(blld blld) {
        this.f126791a = new byte[0];
        if (blld != null) {
            this.f126793c = blld;
            String valueOf = String.valueOf(blld.f126787a);
            this.f126792b = Collections.singletonMap("Authorization", Collections.singletonList(valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf)));
        }
    }

    /* renamed from: a */
    public final void mo66643a(Executor executor, chvm chvm) {
        synchronized (this.f126791a) {
            if (!m107324b()) {
                Map map = this.f126792b;
                bmxy.m108582a(map, "cached requestMetadata");
                chvm.mo85712a(map);
                return;
            }
            executor.execute(new bllb(this, chvm));
        }
    }
}

package p000;

import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Callable;

/* renamed from: jpk */
final /* synthetic */ class jpk implements Callable {

    /* renamed from: a */
    private final jpo f22976a;

    /* renamed from: b */
    private final String f22977b;

    /* renamed from: c */
    private final Role f22978c;

    /* renamed from: d */
    private final byte[] f22979d;

    public jpk(jpo jpo, String str, Role role, byte[] bArr) {
        this.f22976a = jpo;
        this.f22977b = str;
        this.f22978c = role;
        this.f22979d = bArr;
    }

    public final Object call() {
        jpo jpo = this.f22976a;
        String str = this.f22977b;
        Role role = this.f22978c;
        byte[] bArr = this.f22979d;
        if (!jpo.f22991b.mo13908b(str, role.mo7789a())) {
            return Status.f30109c;
        }
        jnt a = jpo.f22991b.mo13903a(str, role.mo7789a());
        if (a == null) {
            return Status.f30109c;
        }
        a.mo13819a(bArr, role.f11146b);
        return Status.f30107a;
    }
}

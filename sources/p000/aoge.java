package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleMemberEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aoge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoge {

    /* renamed from: a */
    private String f78298a;

    /* renamed from: b */
    private String f78299b;

    /* renamed from: c */
    private final Set f78300c = new HashSet();

    /* renamed from: a */
    public final aogf mo42702a() {
        return new ClientLoggedCircleMemberEntity(this.f78300c, this.f78298a, this.f78299b);
    }

    /* renamed from: b */
    public final void mo42704b(String str) {
        this.f78299b = str;
        this.f78300c.add(5);
    }

    /* renamed from: a */
    public final void mo42703a(String str) {
        this.f78298a = str;
        this.f78300c.add(3);
    }
}

package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aogb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aogb {

    /* renamed from: a */
    private String f78296a;

    /* renamed from: b */
    private final Set f78297b = new HashSet();

    /* renamed from: a */
    public final aogc mo42698a() {
        return new ClientLoggedCircleEntity(this.f78297b, this.f78296a);
    }

    /* renamed from: a */
    public final void mo42699a(String str) {
        this.f78296a = str;
        this.f78297b.add(2);
    }
}

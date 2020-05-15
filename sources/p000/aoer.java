package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.AclDetailsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aoer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoer {

    /* renamed from: a */
    public String f78258a;

    /* renamed from: b */
    public String f78259b;

    /* renamed from: c */
    public final Set f78260c = new HashSet();

    /* renamed from: d */
    private AclDetailsEntity f78261d;

    /* renamed from: e */
    private int f78262e;

    /* renamed from: a */
    public final aoes mo42642a() {
        return new ActionTargetEntity(this.f78260c, this.f78261d, this.f78258a, this.f78262e, this.f78259b);
    }

    /* renamed from: a */
    public final void mo42643a(int i) {
        this.f78262e = i;
        this.f78260c.add(6);
    }

    /* renamed from: a */
    public final void mo42644a(aoeo aoeo) {
        this.f78261d = (AclDetailsEntity) aoeo;
        this.f78260c.add(2);
    }
}

package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientAclDetailsEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aofv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aofv {

    /* renamed from: a */
    public List f78287a;

    /* renamed from: b */
    public final Set f78288b = new HashSet();

    /* renamed from: c */
    private List f78289c;

    /* renamed from: d */
    private List f78290d;

    /* renamed from: a */
    public final aofw mo42687a() {
        return new ClientAclDetailsEntity(this.f78288b, this.f78289c, this.f78287a, this.f78290d);
    }

    /* renamed from: b */
    public final void mo42689b(List list) {
        this.f78290d = list;
        this.f78288b.add(5);
    }

    /* renamed from: a */
    public final void mo42688a(List list) {
        this.f78289c = list;
        this.f78288b.add(2);
    }
}

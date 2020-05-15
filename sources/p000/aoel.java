package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aoel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoel {

    /* renamed from: a */
    public boolean f78243a;

    /* renamed from: b */
    public boolean f78244b;

    /* renamed from: c */
    public final Set f78245c = new HashSet();

    /* renamed from: d */
    private boolean f78246d;

    /* renamed from: e */
    private List f78247e;

    /* renamed from: a */
    public final aoem mo42626a() {
        return new AclEntity(this.f78245c, this.f78246d, this.f78247e, this.f78243a, this.f78244b);
    }

    /* renamed from: a */
    public final void mo42627a(List list) {
        this.f78247e = list;
        this.f78245c.add(6);
    }

    /* renamed from: a */
    public final void mo42628a(boolean z) {
        this.f78246d = z;
        this.f78245c.add(4);
    }
}

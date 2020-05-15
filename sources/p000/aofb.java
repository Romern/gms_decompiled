package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aofb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aofb {

    /* renamed from: a */
    public String f78284a;

    /* renamed from: b */
    public final Set f78285b = new HashSet();

    /* renamed from: c */
    private List f78286c;

    /* renamed from: a */
    public final aofc mo42651a() {
        return new ActivityEntity.ObjectEntity(this.f78285b, this.f78286c, this.f78284a);
    }

    /* renamed from: a */
    public final void mo42652a(List list) {
        this.f78286c = list;
        this.f78285b.add(3);
    }
}

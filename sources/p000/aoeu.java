package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aoeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoeu {

    /* renamed from: a */
    public AclEntity f78263a;

    /* renamed from: b */
    public final Set f78264b = new HashSet();

    /* renamed from: c */
    private ActivityEntity.ObjectEntity f78265c;

    /* renamed from: a */
    public final aofd mo42647a() {
        return new ActivityEntity(this.f78264b, this.f78263a, this.f78265c);
    }

    /* renamed from: a */
    public final void mo42648a(aofc aofc) {
        this.f78265c = (ActivityEntity.ObjectEntity) aofc;
        this.f78264b.add(15);
    }
}

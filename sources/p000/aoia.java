package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.PlusAclentryResourceEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aoia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoia {

    /* renamed from: a */
    private String f78344a;

    /* renamed from: b */
    private String f78345b;

    /* renamed from: c */
    private final Set f78346c = new HashSet();

    /* renamed from: a */
    public final aoib mo42785a() {
        return new PlusAclentryResourceEntity(this.f78346c, this.f78344a, this.f78345b);
    }

    /* renamed from: b */
    public final void mo42787b(String str) {
        this.f78345b = str;
        this.f78346c.add(4);
    }

    /* renamed from: a */
    public final void mo42786a(String str) {
        this.f78344a = str;
        this.f78346c.add(3);
    }
}

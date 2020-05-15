package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aodz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aodz {

    /* renamed from: a */
    public boolean f78234a;

    /* renamed from: b */
    public String f78235b;

    /* renamed from: c */
    public AccountField.ValueEntity.NameEntity f78236c;

    /* renamed from: d */
    public final Set f78237d = new HashSet();

    /* renamed from: e */
    private String f78238e;

    /* renamed from: f */
    private String f78239f;

    /* renamed from: a */
    public final aoec mo42582a() {
        return new AccountField.ValueEntity(this.f78237d, this.f78234a, this.f78235b, this.f78236c, this.f78238e, this.f78239f);
    }

    /* renamed from: b */
    public final void mo42584b(String str) {
        this.f78239f = str;
        this.f78237d.add(6);
    }

    /* renamed from: a */
    public final void mo42583a(String str) {
        this.f78238e = str;
        this.f78237d.add(5);
    }
}

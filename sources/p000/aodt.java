package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aodt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aodt {

    /* renamed from: a */
    public String f78229a;

    /* renamed from: b */
    public String f78230b;

    /* renamed from: c */
    public String f78231c;

    /* renamed from: d */
    public final Set f78232d = new HashSet();

    /* renamed from: e */
    private AccountField.ValueEntity f78233e;

    /* renamed from: a */
    public final aoed mo42557a() {
        return new AccountField(this.f78232d, this.f78229a, this.f78230b, this.f78233e, this.f78231c);
    }

    /* renamed from: a */
    public final void mo42558a(aoec aoec) {
        this.f78233e = (AccountField.ValueEntity) aoec;
        this.f78232d.add(10);
    }
}

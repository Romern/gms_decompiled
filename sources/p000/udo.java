package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udo extends ucg {

    /* renamed from: f */
    public static final sbw f47302f = new sbw("IsAutobackupEnabledOper", "");

    public udo(ubk ubk, uto uto) {
        super("IsAutobackupEnabledOper", ubk, uto, 38);
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.allOf(twt.class);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        String str = this.f47237a.f47143d.f47394a.f47682a;
        if (str != null) {
            rjy rjy = new rjy(context);
            rjy.mo24778a(str);
            rjy.mo24779a(anjk.f77000a);
            new udn(rjy.mo24784b(), str, this.f47238b).execute(new Void[0]);
            return;
        }
        this.f47238b.mo27107a(Status.f30109c);
    }
}

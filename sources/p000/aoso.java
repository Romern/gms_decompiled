package p000;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Task;

/* renamed from: aoso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoso extends aosk {
    public aoso(Context context, DataHolder dataHolder) {
        super(context, dataHolder);
    }

    /* renamed from: a */
    public final void mo46827a() {
        String str;
        Task b = new aotz(this.f83513b).mo24661a(0);
        if (((Boolean) aoss.f83565x.mo58455c()).booleanValue()) {
            str = "com.google.android.gms.apitest";
        } else if (!aowr.m69722b(b.mo58702d().intValue())) {
            new Object[1][0] = b.mo58702d();
            return;
        } else {
            str = aowr.m69723c(b.mo58702d().intValue());
        }
        mo46828a(str, new aosn(this.f83512a, this.f83513b, b));
    }
}

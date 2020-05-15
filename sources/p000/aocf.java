package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: aocf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocf extends aoba {

    /* renamed from: a */
    private final String f78165a;

    /* renamed from: b */
    private final antn f78166b;

    public aocf(String str, antn antn) {
        this.f78165a = str;
        this.f78166b = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String a = soz.m35784a(context, this.f78165a);
        if (a == null) {
            List d = soz.m35801d(context, this.f78165a);
            if (d.size() == 1) {
                a = ((Account) d.get(0)).name;
            }
        }
        this.f78166b.mo41922a(a);
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        this.f78166b.mo41922a(null);
    }
}

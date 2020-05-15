package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: aobc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobc extends aoba {

    /* renamed from: a */
    private final String f78062a;

    public aobc(String str) {
        this.f78062a = str;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String a = soz.m35784a(context, this.f78062a);
        if (!TextUtils.isEmpty(a)) {
            aoam.m65704a(context.getContentResolver(), a, this.f78062a);
        }
        soz.m35799c(context, this.f78062a);
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
    }
}

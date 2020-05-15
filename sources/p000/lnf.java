package p000;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: lnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lnf implements lnc {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo15290a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        Intent intent = new Intent();
        if (bmxv.mo66813a()) {
            intent.putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", (Parcelable) bmxv.mo66814b());
        }
        return intent;
    }

    /* renamed from: a */
    public final lis mo15291a(lir lir, AssistStructure assistStructure, bmxv bmxv, Bundle bundle, int i) {
        return new lne(lir, assistStructure, bmxv);
    }
}

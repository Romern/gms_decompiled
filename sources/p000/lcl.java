package p000;

import android.content.Context;
import android.os.Build;
import android.service.autofill.SaveInfo;
import com.google.android.gms.autofill.fill.FillField;

/* renamed from: lcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lcl extends lbm {
    public lcl(Context context, kpk kpk, kbe kbe, lhi lhi) {
        super(context, kpk, kbe, lhi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14963a(lcf lcf, FillField fillField, FillField fillField2) {
        if (fillField == null || fillField2 != null) {
            return bqga.m112775a(bmvz.f131120a);
        }
        int i = Build.VERSION.SDK_INT;
        return bqga.m112775a(bmxv.m108566b(lcg.m18922a(new SaveInfo.Builder(1).setFlags(4).build(), true)));
    }
}

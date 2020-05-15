package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;

/* renamed from: aexn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexn {
    /* renamed from: a */
    public static Bitmap m52651a(Context context, String str) {
        allp a = allq.m61232a();
        a.f73626a = 80;
        allq a2 = a.mo40491a();
        if (TextUtils.isEmpty(str)) {
            return aeti.m52533a(context);
        }
        allh allh = (allh) amcy.m62630a(allr.m61234a(context, a2).f43165D, str, 1, 0).mo9455a();
        Bitmap bitmap = null;
        if (allh.mo7183bo() != null && allh.mo7183bo().mo17710c()) {
            ParcelFileDescriptor b = allh.mo40486b();
            try {
                Bitmap a3 = alls.m61238a(b);
                aeti.m52534b(context);
                if (a3 != null) {
                    bitmap = suj.m36368a(context, suj.m36369a(a3, aeti.f63770a), aeti.f63772c);
                } else {
                    bitmap = aeti.f63771b;
                }
            } finally {
                srz.m36170a(b);
            }
        }
        return bitmap;
    }
}

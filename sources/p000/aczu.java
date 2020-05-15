package p000;

import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.FACLData;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;

/* renamed from: aczu */
final /* synthetic */ class aczu implements bmxj {

    /* renamed from: a */
    static final bmxj f61175a = new aczu();

    private aczu() {
    }

    public final Object apply(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        String str2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        ScopeDetail scopeDetail = (ScopeDetail) obj;
        int i = aczv.f61176a;
        ArrayList a = bnkn.m109663a((Iterable) scopeDetail.mo7704a());
        FACLData fACLData = scopeDetail.f10904h;
        boolean z12 = false;
        if (fACLData != null) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        if (!z) {
            str2 = null;
            str = null;
            z7 = false;
            z6 = false;
            z5 = false;
            z4 = false;
            z3 = false;
            z2 = false;
        } else {
            FACLConfig fACLConfig = fACLData.f10865b;
            if (fACLConfig != null) {
                str3 = fACLConfig.f10859c;
                z12 = fACLConfig.f10863g;
                z10 = fACLConfig.f10861e;
                z9 = fACLConfig.f10862f;
                z8 = fACLConfig.f10858b;
                z11 = fACLConfig.f10860d;
            } else {
                z11 = false;
                z10 = false;
                z9 = false;
                z8 = false;
            }
            str = fACLData.f10866c;
            z7 = fACLData.f10867d;
            z6 = z12;
            z2 = z11;
            z5 = z10;
            z4 = z9;
            z3 = z8;
            str2 = str3;
        }
        return new ScopeData(scopeDetail.f10898b, scopeDetail.f10899c, scopeDetail.f10900d, scopeDetail.f10901e, z, str2, str, z7, z6, z5, z4, z3, z2, a, scopeDetail.f10902f);
    }
}

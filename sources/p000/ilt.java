package p000;

import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.FACLData;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ilt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilt {
    static {
        String simpleName = ilt.class.getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2);
        sb.append("[");
        sb.append(simpleName);
        sb.append("]");
        sb.toString();
    }

    /* renamed from: a */
    public static ScopeDetail m15673a(jfd jfd) {
        FACLData fACLData;
        String str;
        jfd jfd2 = jfd;
        if ((jfd2.f22350a & 16) != 0) {
            jey jey = jfd2.f22355f;
            if (jey == null) {
                jey = jey.f22324i;
            }
            fACLData = new FACLData(new FACLConfig(jey.f22330e, jey.f22326a, jey.f22331f, jey.f22333h, jey.f22332g, false), jey.f22327b, jey.f22329d, jey.f22328c);
        } else {
            fACLData = null;
        }
        int size = jfd2.f22357h.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            bxwc bxwc = jfd2.f22357h;
            int size2 = bxwc.size();
            for (int i = 0; i < size2; i++) {
                arrayList.add(((jfe) bxwc.get(i)).f22361a);
            }
        }
        String str2 = jfd2.f22351b;
        String str3 = jfd2.f22352c;
        String str4 = jfd2.f22353d;
        String str5 = jfd2.f22356g;
        if (!jfd2.f22354e.isEmpty()) {
            str = jfd2.f22354e;
        } else {
            str = null;
        }
        return new ScopeDetail(str5, str2, str3, str4, str, fACLData, arrayList);
    }

    /* renamed from: a */
    public static ArrayList m15674a(List list) {
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
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                ScopeDetail scopeDetail = (ScopeDetail) it.next();
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : scopeDetail.mo7704a()) {
                    arrayList2.add(str3);
                }
                FACLData fACLData = scopeDetail.f10904h;
                boolean z12 = false;
                if (fACLData != null) {
                    z = true;
                } else {
                    z = false;
                }
                String str4 = null;
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
                        str4 = fACLConfig.f10859c;
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
                    z6 = z12;
                    z2 = z11;
                    z5 = z10;
                    z4 = z9;
                    z3 = z8;
                    str = fACLData.f10866c;
                    z7 = fACLData.f10867d;
                    str2 = str4;
                }
                arrayList.add(new ScopeData(scopeDetail.f10898b, scopeDetail.f10899c, scopeDetail.f10900d, scopeDetail.f10901e, z, str2, str, z7, z6, z5, z4, z3, z2, arrayList2, scopeDetail.f10902f));
            }
        }
        return arrayList;
    }
}

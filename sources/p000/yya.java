package p000;

import java.util.Collection;
import java.util.Set;

/* renamed from: yya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yya {
    /* renamed from: a */
    public static cacv m44975a(String str, String str2, Collection collection, Set set) {
        bxvd da = cacv.f172628f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacv cacv = (cacv) da.f164949b;
        str.getClass();
        int i = cacv.f172630a | 1;
        cacv.f172630a = i;
        cacv.f172631b = str;
        str2.getClass();
        cacv.f172630a = i | 2;
        cacv.f172632c = str2;
        if (!cacv.f172633d.mo73666a()) {
            cacv.f172633d = GeneratedMessageLite.m124021a(cacv.f172633d);
        }
        bxsy.m123078a(collection, cacv.f172633d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacv cacv2 = (cacv) da.f164949b;
        if (!cacv2.f172634e.mo73666a()) {
            cacv2.f172634e = GeneratedMessageLite.m124021a(cacv2.f172634e);
        }
        bxsy.m123078a(set, cacv2.f172634e);
        return (cacv) da.mo74062i();
    }
}

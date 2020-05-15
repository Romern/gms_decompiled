package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;
import java.util.Collections;
import java.util.Map;

/* renamed from: ahaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahaa {

    /* renamed from: a */
    private static final srn f66924a = srn.m36126a("MobileSubscription", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public static Bundle m55374a(bszs bszs) {
        if (bszs == null || bszs.f147885a.size() <= 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : Collections.unmodifiableMap(bszs.f147885a).entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    /* renamed from: a */
    public static bszs m55375a(Bundle bundle) {
        if (bundle == null || bundle.size() <= 0) {
            return null;
        }
        bszq bszq = (bszq) bszs.f147883b.mo74144da();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (!(obj instanceof String)) {
                obj.getClass().getName();
                bszq.mo70728a(str, "INVALID_NON_STRING");
            } else {
                bszq.mo70728a(str, (String) obj);
            }
        }
        return (bszs) bszq.mo74062i();
    }

    /* renamed from: a */
    public static btbo m55376a(UserKey userKey) {
        if (userKey == null) {
            return null;
        }
        bxvd da = btbo.f148180e.mo74144da();
        Long l = userKey.f80385a;
        if (l != null) {
            long longValue = l.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btbo) da.f164949b).f148182a = longValue;
        }
        String str = userKey.f80387c;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((btbo) da.f164949b).f148183b = str;
        }
        Long l2 = userKey.f80388d;
        if (l2 != null) {
            bxyk a = bxzt.m124580a(l2.longValue());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((btbo) da.f164949b).f148184c = a;
        }
        AuthType authType = userKey.f80386b;
        if (authType != null) {
            int i = authType.f80342a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btbo) da.f164949b).f148185d = i;
        }
        return (btbo) da.mo74062i();
    }

    /* renamed from: a */
    public static Status m55377a(chuw chuw) {
        bnsl bnsl = (bnsl) f66924a.mo68390d();
        bnsl.mo68437a(chuw);
        bnsl.mo68405a("Parsing GTAF status exception.");
        chuv chuv = chuw.f189236a;
        if (chuv == null) {
            return new Status(27011, "Calling GTAF failed.");
        }
        chus chus = chus.OK;
        int ordinal = chuv.f189233s.ordinal();
        if (ordinal == 5) {
            String valueOf = String.valueOf(chuv);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("GTAF returns: ");
            sb.append(valueOf);
            return new Status(27002, sb.toString());
        } else if (ordinal == 11) {
            String valueOf2 = String.valueOf(chuv);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
            sb2.append("GTAF returns: ");
            sb2.append(valueOf2);
            return new Status(27017, sb2.toString());
        } else if (ordinal == 14) {
            String valueOf3 = String.valueOf(chuv);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append("Unable to reach GTAF:");
            sb3.append(valueOf3);
            return new Status(27022, sb3.toString());
        } else if (ordinal == 16) {
            String valueOf4 = String.valueOf(chuv);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 13);
            sb4.append("GTAF returns:");
            sb4.append(valueOf4);
            return new Status(27009, sb4.toString());
        } else if (ordinal == 8) {
            String valueOf5 = String.valueOf(chuv);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 13);
            sb5.append("GTAF returns:");
            sb5.append(valueOf5);
            return new Status(27012, sb5.toString());
        } else if (ordinal != 9) {
            String valueOf6 = String.valueOf(chuv);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 14);
            sb6.append("GTAF returns: ");
            sb6.append(valueOf6);
            return new Status(27011, sb6.toString());
        } else {
            String valueOf7 = String.valueOf(chuv);
            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf7).length() + 14);
            sb7.append("GTAF returns: ");
            sb7.append(valueOf7);
            return new Status(27030, sb7.toString());
        }
    }
}

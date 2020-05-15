package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: crz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class crz {

    /* renamed from: a */
    private final Class f11902a;

    protected crz(Class cls) {
        this.f11902a = cls;
    }

    /* renamed from: a */
    public static czf m7431a(Map map, crn crn, csn csn) {
        boolean z;
        crz crz = (crz) map.get(crn.getClass());
        if (crz == null) {
            z = true;
        } else {
            z = false;
        }
        css.INSTRUCTION_CODE_NOT_SUPPORTED_OR_INVALID.mo8229a(z);
        css.UNKNOWN_ERROR_RESPONSE.mo8229a(true ^ crz.f11902a.isInstance(crn));
        try {
            crn.mo8196f();
            return crz.mo8202a(crn, csn);
        } catch (ctu e) {
            throw e;
        } catch (Exception e2) {
            throw new ctu(e2, css.UNKNOWN_ERROR_RESPONSE);
        }
    }

    /* renamed from: a */
    public abstract czf mo8202a(crn crn, csn csn);

    /* renamed from: a */
    public static Map m7432a(crz... crzArr) {
        List<crz> asList = Arrays.asList(crzArr);
        HashMap hashMap = new HashMap(asList.size());
        for (crz crz : asList) {
            hashMap.put(crz.f11902a, crz);
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

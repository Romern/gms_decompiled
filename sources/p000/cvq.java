package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cvq {

    /* renamed from: a */
    private final Class f12204a;

    protected cvq(Class cls) {
        this.f12204a = cls;
    }

    /* renamed from: a */
    public static cvv m7687a(Map map, cuf cuf, cvs cvs) {
        boolean z;
        cvq cvq = (cvq) map.get(cuf.getClass());
        if (cvq == null) {
            z = true;
        } else {
            z = false;
        }
        cuu.INSTRUCTION_CODE_NOT_SUPPORTED_OR_INVALID.mo8315a(z);
        cuu.UNKNOWN_ERROR_RESPONSE.mo8315a(true ^ cvq.f12204a.isInstance(cuf));
        try {
            cuf.mo8303f();
            return cvq.mo8339a(cuf, cvs);
        } catch (cvl e) {
            throw e;
        } catch (Exception e2) {
            throw new cvl(e2, cuu.UNKNOWN_ERROR_RESPONSE);
        }
    }

    /* renamed from: a */
    public abstract cvv mo8339a(cuf cuf, cvs cvs);

    /* renamed from: a */
    public static Map m7688a(cvq... cvqArr) {
        List<cvq> asList = Arrays.asList(cvqArr);
        HashMap hashMap = new HashMap(asList.size());
        for (cvq cvq : asList) {
            hashMap.put(cvq.f12204a, cvq);
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

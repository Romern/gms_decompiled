package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: agvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum agvf {
    NO_CONNECTION(C0126R.string.connection_error_title, C0126R.string.no_data_desc, C0126R.string.common_refresh, C0126R.string.refresh_failed_connection, C0126R.string.no_data_desc, true, 27018, 27019),
    GTAF_UNREACHABLE(C0126R.string.connection_error_title, C0126R.string.bad_connection_desc_with_carrier, C0126R.string.common_refresh, C0126R.string.refresh_failed_generic, C0126R.string.bad_connection_desc, true, 27022),
    GENERIC(C0126R.string.server_error_title, 0, C0126R.string.common_refresh, C0126R.string.refresh_failed_generic, 0, true, new Integer[0]),
    UNSUPPORTED(C0126R.string.unsupported_plan_title, 0, 0, 0, 0, true, 27000, 27001, 27002, 27006, 27013),
    DENIED_CONSENT(C0126R.string.denied_consent_title, C0126R.string.denied_consent_desc, C0126R.string.allow_access_button_text, 0, C0126R.string.denied_consent_desc, false, 27023),
    OPTED_OUT(C0126R.string.opted_out_title, C0126R.string.opted_out_text, C0126R.string.common_turn_on, 0, C0126R.string.opted_out_text, false, new Integer[0]);
    

    /* renamed from: m */
    private static Map f66624m;

    /* renamed from: g */
    public final int f66626g;

    /* renamed from: h */
    public final int f66627h;

    /* renamed from: i */
    public final int f66628i;

    /* renamed from: j */
    public final int f66629j;

    /* renamed from: k */
    public final int f66630k;

    /* renamed from: l */
    public final boolean f66631l;

    /* renamed from: n */
    private final List f66632n;

    private agvf(int i, int i2, int i3, int i4, int i5, boolean z, Integer... numArr) {
        this.f66626g = i;
        this.f66627h = i2;
        this.f66628i = i3;
        this.f66629j = i4;
        this.f66630k = i5;
        this.f66631l = z;
        this.f66632n = Collections.unmodifiableList(Arrays.asList(numArr));
    }

    /* renamed from: a */
    public static agvf m55168a(Exception exc) {
        agvf agvf;
        if ((exc instanceof ExecutionException) && exc.getCause() != null && (exc.getCause() instanceof Exception)) {
            exc = (Exception) exc.getCause();
        }
        if (f66624m == null) {
            m55169a();
        }
        return (!(exc instanceof rjp) || (agvf = (agvf) f66624m.get(Integer.valueOf(((rjp) exc).mo24655a()))) == null) ? GENERIC : agvf;
    }

    /* renamed from: a */
    private static synchronized void m55169a() {
        synchronized (agvf.class) {
            HashMap hashMap = new HashMap();
            agvf[] values = values();
            for (agvf agvf : values) {
                for (Integer num : agvf.f66632n) {
                    hashMap.put(Integer.valueOf(num.intValue()), agvf);
                }
            }
            f66624m = Collections.unmodifiableMap(hashMap);
        }
    }
}

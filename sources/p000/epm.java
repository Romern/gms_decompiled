package p000;

import org.json.JSONObject;

/* renamed from: epm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class epm {

    /* renamed from: a */
    public final bswt f15485a;

    /* renamed from: b */
    public final JSONObject f15486b;

    /* renamed from: c */
    public final int f15487c;

    public epm(int i) {
        this(i, null, null);
    }

    public epm(int i, bswt bswt, JSONObject jSONObject) {
        boolean z = false;
        if (!(i == 3 && (bswt == null || jSONObject == null))) {
            z = true;
        }
        sdo.m34974b(z);
        this.f15485a = bswt;
        this.f15486b = jSONObject;
        this.f15487c = i;
    }
}

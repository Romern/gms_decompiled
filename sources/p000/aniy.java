package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: aniy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aniy {

    /* renamed from: a */
    public final bqze f76983a;

    /* renamed from: b */
    public final int f76984b;

    /* renamed from: c */
    public final boolean f76985c;

    /* renamed from: d */
    public final int f76986d;

    private aniy(bqze bqze, int i, boolean z, int i2) {
        this.f76983a = bqze;
        this.f76984b = i;
        this.f76985c = z;
        this.f76986d = i2;
    }

    /* renamed from: a */
    public static aniy m64550a() {
        return new aniy(null, 0, false, ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE);
    }

    /* renamed from: a */
    public static aniy m64551a(int i) {
        return new aniy(null, 0, true, i);
    }

    /* renamed from: a */
    public static aniy m64552a(bqze bqze, int i, int i2) {
        return new aniy(bqze, i, true, i2);
    }
}

package p000;

import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: zyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyu {

    /* renamed from: a */
    public static final zyu f56227a = new zyu(0);

    /* renamed from: b */
    public final zxi f56228b;

    /* renamed from: c */
    public final zxh f56229c;

    /* renamed from: d */
    public final int f56230d;

    static {
        new FontMatchSpec("ResolvedFont FontMatchSpec For Failure");
    }

    private zyu() {
        this(0);
    }

    /* renamed from: a */
    public static zyu m46718a(int i) {
        return i != 0 ? new zyu(i) : f56227a;
    }

    /* renamed from: a */
    public final boolean mo31608a() {
        return this.f56229c != null;
    }

    private zyu(int i) {
        this.f56228b = null;
        this.f56229c = null;
        this.f56230d = i;
    }

    public zyu(zxi zxi, zxh zxh, int i) {
        sdo.checkIfNull(zxi, "family");
        this.f56228b = zxi;
        sdo.checkIfNull(zxh, "font");
        this.f56229c = zxh;
        this.f56230d = i;
    }
}

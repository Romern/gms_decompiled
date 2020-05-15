package p000;

import java.util.Map;

/* renamed from: eix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class eix {
    /* renamed from: a */
    public final int mo10184a(String str) {
        String str2 = (String) mo10168f().get(str);
        if (str2 != null) {
            return Integer.valueOf(str2).intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public abstract String mo10162a();

    /* renamed from: b */
    public abstract Integer mo10163b();

    /* renamed from: b */
    public final String mo10185b(String str) {
        String str2 = (String) mo10168f().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public abstract eiv mo10164c();

    /* renamed from: d */
    public abstract long mo10165d();

    /* renamed from: e */
    public abstract long mo10166e();

    /* renamed from: f */
    public abstract Map mo10168f();
}

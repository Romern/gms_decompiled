package p000;

import android.util.Log;

/* renamed from: bbnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbnc implements bbnd {

    /* renamed from: a */
    private final Enum[] f102943a;

    public bbnc(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        bmxy.m108581a(enumArr);
        bmxy.m108589a(enumArr.length > 0, "Event type must have at least one enum value!");
        this.f102943a = enumArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo56228a(Object obj) {
        return ((Enum) obj).ordinal();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56229a(Integer num) {
        if (num != null && num.intValue() >= 0) {
            int intValue = num.intValue();
            Enum[] enumArr = this.f102943a;
            if (intValue < enumArr.length) {
                return enumArr[num.intValue()];
            }
        }
        String valueOf = String.valueOf(num);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Unknown event code ");
        sb.append(valueOf);
        sb.append("!");
        Log.e("SyncMetadata", sb.toString());
        return this.f102943a[0];
    }
}

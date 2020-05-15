package p000;

import android.content.Context;

/* renamed from: rsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rsy extends rtc {
    public rsy(String str, Integer num) {
        super(str, num);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25079a() {
        rtb rtb = rtc.f43640d;
        return Integer.valueOf(aymn.m84260a(rtb.f43638a, this.f43644b, ((Integer) this.f43645c).intValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25080a(Context context, String str, Object obj) {
        Integer num = (Integer) obj;
        String string = m34381b(context).getString(str, null);
        if (string == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(string));
        } catch (NumberFormatException e) {
            return num;
        }
    }
}

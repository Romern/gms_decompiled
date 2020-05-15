package p000;

import android.content.Context;

/* renamed from: rsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rsw extends rtc {
    public rsw(String str, Boolean bool) {
        super(str, bool);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25079a() {
        rtb rtb = rtc.f43640d;
        return Boolean.valueOf(aymn.m84269a(rtb.f43638a, this.f43644b, ((Boolean) this.f43645c).booleanValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25080a(Context context, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        String string = m34381b(context).getString(str, null);
        if (string == null) {
            return bool;
        }
        try {
            return Boolean.valueOf(Boolean.parseBoolean(string));
        } catch (NumberFormatException e) {
            return bool;
        }
    }
}

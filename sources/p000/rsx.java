package p000;

import android.content.Context;

/* renamed from: rsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rsx extends rtc {
    public rsx(String str, Long l) {
        super(str, l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25079a() {
        rtb rtb = rtc.f43640d;
        return Long.valueOf(aymn.m84261a(rtb.f43638a, this.f43644b, ((Long) this.f43645c).longValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25080a(Context context, String str, Object obj) {
        Long l = (Long) obj;
        String string = m34381b(context).getString(str, null);
        if (string == null) {
            return l;
        }
        try {
            return Long.valueOf(Long.parseLong(string));
        } catch (NumberFormatException e) {
            return l;
        }
    }
}

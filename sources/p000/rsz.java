package p000;

import android.content.Context;

/* renamed from: rsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rsz extends rtc {
    public rsz(String str, Float f) {
        super(str, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25079a() {
        rtb rtb = rtc.f43640d;
        String str = this.f43644b;
        Float f = (Float) this.f43645c;
        String a = aymn.m84265a(rtb.f43638a, str, (String) null);
        if (a == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(a));
        } catch (NumberFormatException e) {
            return f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25080a(Context context, String str, Object obj) {
        Float f = (Float) obj;
        String string = m34381b(context).getString(str, null);
        if (string == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(string));
        } catch (NumberFormatException e) {
            return f;
        }
    }
}

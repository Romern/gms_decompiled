package p000;

import android.content.Context;

/* renamed from: bqqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqd {

    /* renamed from: a */
    public bqnu f141358a = null;

    /* renamed from: b */
    public String f141359b = null;

    /* renamed from: c */
    public boolean f141360c = true;

    /* renamed from: d */
    public bqsf f141361d = null;

    /* renamed from: e */
    public bqqi f141362e = null;

    /* renamed from: a */
    public final bqqe mo69322a() {
        return new bqqe(this);
    }

    /* renamed from: a */
    public final void mo69323a(Context context, String str, String str2) {
        if (context != null) {
            this.f141358a = new bqqh(context, str, str2);
            this.f141362e = new bqqi(context, str, str2);
            return;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    /* renamed from: a */
    public final void mo69324a(String str) {
        if (str.startsWith("android-keystore://")) {
            this.f141359b = str;
            return;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }
}

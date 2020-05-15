package p000;

import android.os.Build;
import android.os.Bundle;

/* renamed from: rrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rrq {

    /* renamed from: a */
    public String f43552a;

    /* renamed from: b */
    public final boolean f43553b;

    /* renamed from: c */
    public final boolean f43554c;

    /* renamed from: d */
    public final int f43555d;

    /* renamed from: e */
    public final int f43556e;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x0022;
     */
    private rrq(String str, boolean z, boolean z2, int i, int i2) {
        if (str == null) {
            if (cbxv.f178529a.mo6606a().mo75599m()) {
                str = stn.m36304a("setupwizard.theme", "");
            }
            int f = (int) cbxv.f178529a.mo6606a().mo75592f();
            if (f != 1) {
                if (f != 2) {
                    if (f == 3) {
                        str = "glif_v2_light";
                    } else if (f != 4) {
                        int i3 = Build.VERSION.SDK_INT;
                    } else {
                        str = "glif_v3_light";
                    }
                }
                str = "glif_light";
            } else {
                str = null;
            }
        }
        this.f43552a = str;
        this.f43553b = z;
        this.f43554c = z2;
        this.f43555d = i;
        this.f43556e = i2;
    }

    /* renamed from: a */
    public static rrq m34308a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new rrq(bundle.getString("theme"), bundle.getBoolean("shown_on_keyguard", false), bundle.getBoolean("fixed_window_size", false), bundle.getInt("window_size_x", 0), bundle.getInt("window_size_y", 0));
    }

    /* renamed from: a */
    public final Bundle mo25045a() {
        Bundle bundle = new Bundle();
        bundle.putString("theme", this.f43552a);
        bundle.putBoolean("shown_on_keyguard", this.f43553b);
        bundle.putBoolean("fixed_window_size", this.f43554c);
        bundle.putInt("window_size_x", this.f43555d);
        bundle.putInt("window_size_y", this.f43556e);
        return bundle;
    }
}

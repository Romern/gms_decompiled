package p000;

import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;

/* renamed from: arej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arej implements arel {

    /* renamed from: a */
    private final aqxy f87512a;

    /* renamed from: b */
    private final DisplayText f87513b;

    public arej(aqxy aqxy, DisplayText displayText) {
        sdo.m34966a(aqxy, "callbacks cannot be null.");
        this.f87512a = aqxy;
        sdo.m34966a(displayText, "displayText cannot be null.");
        this.f87513b = displayText;
    }

    /* renamed from: a */
    public final void mo48472a() {
        arem.f87517d.mo25409a("Processing DisplayText", new Object[0]);
        String str = this.f87513b.f107972b;
        if (!TextUtils.isEmpty(str)) {
            this.f87512a.mo48225a(str);
        }
    }
}

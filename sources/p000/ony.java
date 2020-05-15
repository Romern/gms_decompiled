package p000;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import android.os.Build;
import java.util.Map;

/* renamed from: ony */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ony {

    /* renamed from: a */
    protected final Context f38056a;

    /* renamed from: b */
    protected final UsbManager f38057b;

    /* renamed from: c */
    private bmxv f38058c = bmvz.f131120a;

    protected ony(Context context, UsbManager usbManager) {
        this.f38056a = context;
        this.f38057b = usbManager;
    }

    /* renamed from: a */
    public abstract Map mo22357a();

    /* renamed from: b */
    public abstract boolean mo22358b();

    /* renamed from: c */
    public abstract void mo22359c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo22378d() {
        if (!ccwa.f180080a.mo6606a().mo76921c()) {
            return true;
        }
        if (!this.f38058c.mo66813a()) {
            this.f38058c = bmxv.m108566b(Boolean.valueOf(mo22358b()));
        }
        return ((Boolean) this.f38058c.mo66814b()).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final onx mo22379e() {
        Intent a = onr.m29253a(this.f38056a);
        if (a != null) {
            return onx.m29276a(a.getExtras());
        }
        return null;
    }

    /* renamed from: a */
    public static ony m29286a(Context context, UsbManager usbManager) {
        int i = Build.VERSION.SDK_INT;
        return new ono(context, usbManager);
    }
}

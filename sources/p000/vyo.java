package p000;

import android.content.Context;
import android.media.MediaDrm;
import android.os.Build;
import java.util.HashMap;

/* renamed from: vyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyo {

    /* renamed from: a */
    private final Context f50243a;

    /* renamed from: b */
    private final String f50244b;

    public vyo(Context context, String str) {
        this.f50243a = context;
        this.f50244b = str;
    }

    /* renamed from: a */
    public String mo28965a(byte[] bArr) {
        return new String(new vwn("", this.f50243a, null).mo28913a(new HashMap(), bArr));
    }

    /* renamed from: b */
    public String mo28966b() {
        return String.valueOf(spn.getAndroidId(this.f50243a));
    }

    /* renamed from: c */
    public String mo28967c() {
        return this.f50244b;
    }

    /* renamed from: d */
    public void mo28968d(Object obj, byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        synchronized (vzg.f50281a) {
            ((MediaDrm) obj).closeSession(bArr);
        }
    }

    /* renamed from: e */
    public void mo28969e(int i) {
        vyq a = vyq.m41600a(this.f50243a);
        if (i == 1) {
            a.mo28971a(Integer.valueOf(a.mo28975d() + 1));
        } else if (i == 0) {
            a.mo28971a((Integer) null);
        }
        a.f50245a.mo28979a(((vwc) a.f50246b.mo74062i()).serializeToBytes());
    }
}

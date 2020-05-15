package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;

/* renamed from: avvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avvb extends avuo {

    /* renamed from: a */
    private final avuv f93949a;

    /* renamed from: b */
    private final String f93950b;

    /* renamed from: c */
    private final byte[] f93951c;

    /* renamed from: d */
    private final String f93952d;

    /* renamed from: e */
    private final int[] f93953e;

    /* renamed from: f */
    private final int f93954f;

    /* renamed from: g */
    private final Context f93955g;

    /* renamed from: h */
    private final aucf f93956h;

    /* renamed from: a */
    public final void mo51616a(Status status, boolean z, ConsentInformation consentInformation) {
        if (z) {
            try {
                this.f93949a.mo51632a(this.f93952d, consentInformation, new avve(this.f93950b, this.f93951c, this.f93953e, this.f93954f, this.f93955g, this.f93956h));
            } catch (RemoteException e) {
                this.f93956h.mo50390a((Exception) e);
            }
        } else {
            this.f93956h.mo50390a((Exception) new IllegalStateException("Not allowed to log."));
        }
    }

    public avvb(avuv avuv, String str, byte[] bArr, String str2, int[] iArr, int i, Context context, aucf aucf) {
        this.f93949a = avuv;
        this.f93950b = str;
        this.f93951c = bArr;
        this.f93952d = str2;
        this.f93953e = iArr;
        this.f93954f = i;
        this.f93956h = aucf;
        this.f93955g = context;
        new qws(context, null, null);
    }
}

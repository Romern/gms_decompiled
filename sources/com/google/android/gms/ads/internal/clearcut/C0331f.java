package com.google.android.gms.ads.internal.clearcut;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.clearcut.C0231a;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.client.C0635j;
import com.google.android.gms.ads.internal.util.client.C0636k;

/* renamed from: com.google.android.gms.ads.internal.clearcut.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0331f {

    /* renamed from: a */
    boolean f8100a;

    /* renamed from: b */
    C0231a f8101b;

    public C0331f() {
    }

    /* renamed from: a */
    public final C0330e mo6570a(byte[] bArr) {
        return new C0330e(this, bArr);
    }

    public C0331f(Context context) {
        C0371o.m5339a(context);
        if (((Boolean) C0371o.f8236an.mo6604a()).booleanValue()) {
            try {
                this.f8101b = (C0231a) C0636k.m5677a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", C0329d.f8095a);
                vzs.m41642a(context);
                C0231a aVar = this.f8101b;
                vzr a = vzs.m41642a(context);
                Parcel bj = aVar.mo8529bj();
                dcl.m8164a(bj, a);
                bj.writeString("GMA_SDK");
                aVar.mo8528b(2, bj);
                this.f8100a = true;
            } catch (RemoteException | C0635j | NullPointerException e) {
                C0633h.m5664a("Cannot dynamite load clearcut");
            }
        }
    }

    public C0331f(Context context, String str) {
        C0371o.m5339a(context);
        try {
            this.f8101b = (C0231a) C0636k.m5677a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", C0328c.f8094a);
            vzs.m41642a(context);
            C0231a aVar = this.f8101b;
            vzr a = vzs.m41642a(context);
            Parcel bj = aVar.mo8529bj();
            dcl.m8164a(bj, a);
            bj.writeString(str);
            bj.writeString(null);
            aVar.mo8528b(8, bj);
            this.f8100a = true;
        } catch (RemoteException | C0635j | NullPointerException e) {
            C0633h.m5664a("Cannot dynamite load clearcut");
        }
    }
}

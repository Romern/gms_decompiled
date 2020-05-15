package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbj extends scj {

    /* renamed from: a */
    public final List f43994a = new ArrayList();

    /* renamed from: b */
    private final sck f43995b;

    /* renamed from: c */
    private final GetServiceRequest f43996c;

    /* renamed from: d */
    private final ConnectionInfo f43997d;

    /* renamed from: e */
    private final Context f43998e;

    /* renamed from: f */
    private final zzp f43999f;

    /* renamed from: g */
    private final int f44000g;

    public sbj(sck sck, GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo, Context context, zzp zzp, int i) {
        this.f43995b = sck;
        this.f43996c = getServiceRequest;
        this.f43997d = connectionInfo;
        this.f43998e = context;
        this.f43999f = zzp;
        this.f44000g = i;
    }

    /* renamed from: a */
    public final void mo16677a(int i, Bundle bundle) {
        this.f43995b.mo16677a(i, bundle);
    }

    public final IBinder asBinder() {
        return this.f43995b.asBinder();
    }

    /* renamed from: a */
    public final void mo16678a(int i, IBinder iBinder, Bundle bundle) {
        int i2;
        int i3;
        ConnectionInfo connectionInfo = this.f43997d;
        connectionInfo.f30223a = bundle;
        if (!(iBinder == null || this.f43998e == null || !mo25338a() || (i2 = this.f44000g) == -1)) {
            if (!this.f43996c.f30237k || i2 != spn.f44932a) {
                i3 = 0;
            } else {
                int a = aaay.m21038a(this.f43996c.f30238l);
                connectionInfo.f30225c = a;
                i3 = a;
            }
            if ((!(iBinder instanceof aaai) && !(iBinder instanceof sjr)) || i3 != 0 || cdoz.f181455a.mo6606a().mo78107T()) {
                Context context = this.f43998e;
                zzp zzp = this.f43999f;
                int i4 = this.f44000g;
                if (aacg.m21082a(iBinder)) {
                    iBinder = new aacg((Binder) iBinder, context, zzp, i4, i3);
                }
            }
        }
        mo16679a(i, iBinder, this.f43997d);
    }

    /* renamed from: a */
    public final void mo16679a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        if (connectionInfo == null) {
            connectionInfo = this.f43997d;
        }
        List list = this.f43994a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (((sbf) list.get(i2)).mo25333a(this.f43996c, i)) {
                i2 = i3;
            } else {
                return;
            }
        }
        if (!this.f43996c.f30237k) {
            this.f43995b.mo16678a(i, iBinder, connectionInfo.f30223a);
        } else {
            this.f43995b.mo16679a(i, iBinder, connectionInfo);
        }
    }

    /* renamed from: a */
    public final boolean mo25338a() {
        return this.f43995b.asBinder() != this.f43995b;
    }
}

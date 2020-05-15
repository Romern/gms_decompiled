package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.mdns.MdnsOptions;

/* renamed from: agcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agcl extends sbm {

    /* renamed from: a */
    public final C1245ok f65215a = new C1245ok();

    /* renamed from: b */
    private final MdnsOptions f65216b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdns.internal.IMdnsApiService");
        if (queryLocalInterface instanceof agbz) {
            return (agbz) queryLocalInterface;
        }
        return new agbx(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.mdns.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.mdns.internal.IMdnsApiService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("MDNS_OPTIONS", sef.m35074a(this.f65216b));
        return bundle;
    }

    public agcl(Context context, Looper looper, sat sat, rjz rjz, rka rka, MdnsOptions mdnsOptions) {
        super(context, looper, 168, sat, rjz, rka);
        this.f65216b = mdnsOptions;
    }
}

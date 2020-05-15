package p000;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: gew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gew extends sbm {

    /* renamed from: a */
    private IBinder f18076a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audiomodem.internal.IAudioModemService");
        if (queryLocalInterface instanceof gfc) {
            return (gfc) queryLocalInterface;
        }
        return new gfa(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.audiomodem.service.AudioModemService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.audiomodem.internal.IAudioModemService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* renamed from: e */
    public final IBinder mo11754e() {
        if (this.f18076a == null) {
            this.f18076a = new Binder();
        }
        return this.f18076a;
    }

    public gew(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 48, sat, rjz, rka);
        new gfn();
        new gfn();
    }
}

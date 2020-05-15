package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.CarInfo;

/* renamed from: pam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pam implements ozp {

    /* renamed from: a */
    public static final bnsn f38717a = odk.m28481a("CAR.CONMAN");

    /* renamed from: b */
    public final Context f38718b;

    /* renamed from: c */
    public final Handler f38719c;

    /* renamed from: d */
    public final Handler f38720d = new adzt(Looper.getMainLooper());

    /* renamed from: e */
    public final bmzi f38721e;

    /* renamed from: f */
    public final CarInfo f38722f;

    /* renamed from: g */
    public pad f38723g;

    /* renamed from: h */
    public final nov f38724h;

    public pam(Context context, Handler handler, bmzi bmzi, nov nov, CarInfo carInfo) {
        this.f38718b = context;
        this.f38719c = handler;
        this.f38721e = bmzi;
        this.f38724h = nov;
        this.f38722f = carInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final pad mo22836a(long j, ComponentName componentName, oha oha, oml oml) {
        return new pad(this, j, componentName, oha, oml);
    }

    /* renamed from: a */
    public final void mo22809a() {
        bnsi d = f38717a.mo68390d();
        d.mo68432a("pam", "a", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Teardown initiated");
        this.f38719c.post(new ozv(this));
    }

    /* renamed from: a */
    public final void mo22810a(bipi bipi) {
        bnsi d = f38717a.mo68390d();
        d.mo68432a("pam", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Teardown initiated for ByeByeReason %d", bipi.f121169f);
        this.f38719c.post(new ozu(this, bipi));
    }
}

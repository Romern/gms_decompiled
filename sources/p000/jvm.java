package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.gms.auth.uiflows.addaccount.CheckinReceiver;

/* renamed from: jvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jvm extends Loader implements jvn {

    /* renamed from: a */
    private static final Logger f23369a = ght.m13171a("CheckinLoader");

    /* renamed from: b */
    private boolean f23370b;

    /* renamed from: c */
    private final CheckinReceiver f23371c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jvm(Context context) {
        super(context);
        CheckinReceiver checkinReceiver = new CheckinReceiver(rpr.m34216b());
        this.f23371c = checkinReceiver;
    }

    /* renamed from: a */
    public final void mo14152a(boolean z) {
        this.f23371c.mo7868a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("checkin_loader_result", z);
        deliverResult(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        this.f23371c.mo7868a();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (!this.f23370b) {
            this.f23370b = true;
            if (spn.getAndroidId(getContext()) != 0) {
                f23369a.mo25412b("Checkin already completed.", new Object[0]);
                mo14152a(true);
                return;
            }
            CheckinReceiver checkinReceiver = this.f23371c;
            synchronized (checkinReceiver.f11363c) {
                if (!checkinReceiver.f11364d) {
                    checkinReceiver.f11361a = this;
                    checkinReceiver.f11362b.registerReceiver(checkinReceiver, new IntentFilter("com.google.android.checkin.CHECKIN_COMPLETE"));
                    checkinReceiver.f11364d = true;
                }
            }
            f23369a.mo25412b("Broadcasting to checkin.", new Object[0]);
            getContext().sendBroadcast(new Intent("android.server.checkin.CHECKIN_NOW").setPackage("com.google.android.gms"));
        }
    }
}

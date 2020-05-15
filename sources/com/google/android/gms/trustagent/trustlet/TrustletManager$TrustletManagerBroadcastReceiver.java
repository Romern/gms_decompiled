package com.google.android.gms.trustagent.trustlet;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrustletManager$TrustletManagerBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ aurl f109165a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrustletManager$TrustletManagerBroadcastReceiver(aurl aurl) {
        super("trustagent");
        this.f109165a = aurl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Iterator it;
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            aurl aurl = this.f109165a;
            aurl.mo50830a("GServices values changed");
            aurl.mo50838c("gservices_flag_changed");
        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            aurl aurl2 = this.f109165a;
            synchronized (aurl2.f92336e) {
                Iterator it2 = aurl2.f92340i.iterator();
                boolean z = false;
                while (true) {
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    auri auri = (auri) it2.next();
                    if (!auri.mo50823c() || !auri.mo50821a()) {
                        z2 = false;
                    }
                    z |= z2;
                }
                if (z) {
                    if (aurl2.f92353v) {
                        it = aurl2.f92340i.iterator();
                        while (it.hasNext()) {
                            auri auri2 = (auri) it.next();
                            if (auri2.mo50823c()) {
                                if (auri2.mo50821a()) {
                                    aurl2.mo50828a(auri2);
                                }
                            }
                            if (aurl.f92334c.contains(auri2.f92321d)) {
                                aurl2.mo50828a(auri2);
                            }
                        }
                        if (aurl2.f92347p) {
                            aurl2.f92347p = false;
                            aurl2.mo50830a("User present with authentication");
                            aurl2.mo50837c();
                            aurl2.mo50839d();
                            aurl2.mo50838c("user_is_present_with_authentication");
                        }
                    }
                }
                aurl2.f92352u = SystemClock.elapsedRealtime();
                aurl2.f92351t = true;
                aurl2.f92353v = true;
                it = aurl2.f92340i.iterator();
                while (it.hasNext()) {
                }
                if (aurl2.f92347p) {
                }
            }
        }
    }
}

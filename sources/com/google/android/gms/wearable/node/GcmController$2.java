package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmController$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ axye f110980a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GcmController$2(axye axye, String str) {
        super(str);
        this.f110980a = axye;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char c;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -1886648615) {
            if (hashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                c = 0;
                if (c == 0) {
                    this.f110980a.f96756a.getAndSet(true);
                } else if (c == 1) {
                    this.f110980a.f96756a.getAndSet(false);
                } else {
                    return;
                }
                this.f110980a.mo53761a();
            }
        } else if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            c = 1;
            if (c == 0) {
            }
            this.f110980a.mo53761a();
        }
        c = 65535;
        if (c == 0) {
        }
        this.f110980a.mo53761a();
    }
}

package com.google.android.gms.car.usb;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UsbIssueDetector$ConnectionTypeReceiver extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ onq f29527a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsbIssueDetector$ConnectionTypeReceiver(onq onq) {
        super("car");
        this.f29527a = onq;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0071 A[Catch:{ oex -> 0x009d }] */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char c;
        try {
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -625334656) {
                    if (hashCode != -203776308) {
                        if (hashCode == 1449022483 && action.equals("com.google.android.gms.car.PROJECTION_STARTED")) {
                            c = 1;
                            if (c != 0) {
                                oez oez = oez.UNKNOWN;
                                oew oew = oew.UNKNOWN;
                                int ordinal = ((oew) ofd.m28610a(intent, oew.values())).ordinal();
                                if (ordinal == 2) {
                                    onq onq = this.f29527a;
                                    bnsn bnsn = onq.f38022a;
                                    onq.mo22361c();
                                    return;
                                } else if (ordinal == 3 || ordinal == 4) {
                                    onq onq2 = this.f29527a;
                                    bnsn bnsn2 = onq.f38022a;
                                    onq2.mo22362d();
                                    return;
                                } else {
                                    return;
                                }
                            } else if (c == 1) {
                                oez oez2 = oez.UNKNOWN;
                                oew oew2 = oew.UNKNOWN;
                                int ordinal2 = ((oez) ofd.m28610a(intent, oez.values())).ordinal();
                                if (ordinal2 == 1) {
                                    onq onq3 = this.f29527a;
                                    bnsn bnsn3 = onq.f38022a;
                                    onq3.mo22361c();
                                    return;
                                } else if (ordinal2 == 2) {
                                    onq onq4 = this.f29527a;
                                    bnsn bnsn4 = onq.f38022a;
                                    onq4.mo22362d();
                                    return;
                                } else {
                                    return;
                                }
                            } else if (c == 2) {
                                onq onq5 = this.f29527a;
                                bnsn bnsn5 = onq.f38022a;
                                onq5.mo22361c();
                                return;
                            } else {
                                return;
                            }
                        }
                    } else if (action.equals("com.google.android.gms.car.PROJECTION_ENDED")) {
                        c = 2;
                        if (c != 0) {
                        }
                    }
                } else if (action.equals("com.google.android.gms.car.FIRST_ACTIVITY")) {
                    c = 0;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
        } catch (oex e) {
            bnsi c2 = onq.f38022a.mo68388c();
            c2.mo68432a("com.google.android.gms.car.usb.UsbIssueDetector$ConnectionTypeReceiver", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68424a("received %s with invalid state: %s", intent.getAction(), e.getMessage());
        }
    }
}

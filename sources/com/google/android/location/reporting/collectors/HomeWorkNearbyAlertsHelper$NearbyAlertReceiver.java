package com.google.android.location.reporting.collectors;

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class HomeWorkNearbyAlertsHelper$NearbyAlertReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgto f150861a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeWorkNearbyAlertsHelper$NearbyAlertReceiver(bgto bgto) {
        super("location");
        this.f150861a = bgto;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Received nearby alert: ");
        sb.append(valueOf);
        sb.toString();
        if (this.f150861a.f117508i != null) {
            aele a = aele.m52094a(intent);
            if (a != null) {
                try {
                    if (a.f63483c.f30115i == 0) {
                        HashSet hashSet = new HashSet();
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            hashSet.add(((aeld) it.next()).mo34295bB().mo8007a());
                        }
                        int i = a.f63482b;
                        if (!hashSet.isEmpty()) {
                            bgto bgto = this.f150861a;
                            if (bgto.f117508i != null) {
                                if (i == 1) {
                                    if (hashSet.contains(bgto.f117503d)) {
                                        bgto bgto2 = this.f150861a;
                                        bgto2.f117500a.f118017i = true;
                                        bgto2.f117508i.mo63309a(3);
                                    } else if (hashSet.contains(this.f150861a.f117504e)) {
                                        bgto bgto3 = this.f150861a;
                                        bgto3.f117500a.f118018j = true;
                                        bgto3.f117508i.mo63309a(4);
                                    }
                                } else if (i != 2) {
                                    StringBuilder sb2 = new StringBuilder(48);
                                    sb2.append("Ignoring Nearby alert for transition:");
                                    sb2.append(i);
                                    sb2.toString();
                                } else if (hashSet.contains(bgto.f117503d)) {
                                    bgto bgto4 = this.f150861a;
                                    bgto4.f117500a.f118017i = false;
                                    bgto4.f117508i.mo63309a(5);
                                } else if (hashSet.contains(this.f150861a.f117504e)) {
                                    bgto bgto5 = this.f150861a;
                                    bgto5.f117500a.f118018j = false;
                                    bgto5.f117508i.mo63309a(6);
                                }
                            }
                        }
                        a.mo12460c();
                    }
                } catch (Throwable th) {
                    if (a != null) {
                        a.mo12460c();
                    }
                    throw th;
                }
            }
            String valueOf2 = String.valueOf(a);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
            sb3.append("Nearby alert returned an error:");
            sb3.append(valueOf2);
            sb3.toString();
            if (a == null) {
                return;
            }
            a.mo12460c();
        }
    }
}

package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: fkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fkc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ fnl f16769a;

    /* renamed from: b */
    final /* synthetic */ fkh f16770b;

    public fkc(fkh fkh, fnl fnl) {
        this.f16770b = fkh;
        this.f16769a = fnl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    public final void run() {
        String str;
        long j;
        Pair pair;
        flb flb = this.f16770b.f16778a;
        fnl fnl = this.f16769a;
        sdo.m34959a(fnl);
        fje.m11804a();
        flb.mo10954t();
        if (flb.f16842i) {
            flb.mo10937e("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            flb.mo10926a("Delivering hit", fnl);
        }
        fno fno = null;
        if (TextUtils.isEmpty(fnl.mo11022a("_m", ""))) {
            fnx fnx = flb.mo10949n().f16990b;
            long b = fnx.mo11047b();
            if (b != 0) {
                j = Math.abs(b - fnx.f16987b.mo10936e().mo20505a());
            } else {
                j = 0;
            }
            long j2 = fnx.f16986a;
            if (j >= j2) {
                if (j <= j2 + j2) {
                    String string = fnx.f16987b.f16989a.getString(fnx.mo11049d(), null);
                    long j3 = fnx.f16987b.f16989a.getLong(fnx.mo11048c(), 0);
                    fnx.mo11046a();
                    pair = (string == null || j3 <= 0) ? null : new Pair(string, Long.valueOf(j3));
                    if (pair != null) {
                        String str2 = (String) pair.first;
                        String valueOf = String.valueOf((Long) pair.second);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
                        sb.append(valueOf);
                        sb.append(":");
                        sb.append(str2);
                        String sb2 = sb.toString();
                        HashMap hashMap = new HashMap(fnl.f16956a);
                        hashMap.put("_m", sb2);
                        fnl = new fnl(flb, hashMap, fnl.f16959d, fnl.f16961f, fnl.f16958c, fnl.f16960e, fnl.f16957b);
                    }
                } else {
                    fnx.mo11046a();
                }
            }
            pair = null;
            if (pair != null) {
            }
        }
        if (!flb.f16842i) {
            flb.mo10943h();
            if (((Boolean) fni.f16923a.mo11021a()).booleanValue() && !flb.f16838e.mo10970b()) {
                flb.mo10943h();
                if (flb.f16840g.mo11060a(((Long) fni.f16919E.mo11021a()).longValue())) {
                    flb.f16840g.mo11059a();
                    flb.mo10933d("Connecting to service");
                    fkt fkt = flb.f16838e;
                    fje.m11804a();
                    fkt.mo10954t();
                    if (fkt.f16816b == null) {
                        fks fks = fkt.f16815a;
                        fje.m11804a();
                        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
                        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
                        Context f = fks.f16814c.mo10939f();
                        intent.putExtra("app_package_name", f.getPackageName());
                        skh a = skh.m35531a();
                        synchronized (fks) {
                            fks.f16812a = null;
                            fks.f16813b = true;
                            boolean a2 = a.mo25690a(f, intent, fks.f16814c.f16815a, 129);
                            fks.f16814c.mo10926a("Bind to service requested", Boolean.valueOf(a2));
                            if (a2) {
                                try {
                                    fks.f16814c.mo10943h();
                                    fks.wait(((Long) fni.f16918D.mo11021a()).longValue());
                                } catch (InterruptedException e) {
                                    fks.f16814c.mo10940f("Wait for service connect was interrupted");
                                }
                                fks.f16813b = false;
                                fno fno2 = fks.f16812a;
                                fks.f16812a = null;
                                if (fno2 == null) {
                                    fks.f16814c.mo10942g("Successfully bound to service but never got onServiceConnected callback");
                                }
                                fno = fno2;
                            } else {
                                fks.f16813b = false;
                            }
                        }
                        if (fno != null) {
                            fkt.f16816b = fno;
                            fkt.mo10971c();
                        }
                    }
                    flb.mo10933d("Connected to service");
                    flb.f16840g.mo11061b();
                    flb.mo10993b();
                }
            }
        }
        fkt fkt2 = flb.f16838e;
        sdo.m34959a(fnl);
        fje.m11804a();
        fkt2.mo10954t();
        fno fno3 = fkt2.f16816b;
        if (fno3 != null) {
            if (fnl.f16961f) {
                fkt2.mo10943h();
                str = flh.m11937g();
            } else {
                fkt2.mo10943h();
                str = flh.m11939i();
            }
            try {
                fno3.mo11024a(fnl.f16956a, fnl.f16959d, str, Collections.emptyList());
                fkt2.mo10971c();
                flb.mo10937e("Hit sent to the device AnalyticsService for delivery");
                return;
            } catch (RemoteException e2) {
                fkt2.mo10933d("Failed to send hits to AnalyticsService");
            }
        }
        flb.mo10943h();
        flb.mo10941g().mo11027a(fnl, "Service unavailable on package side");
    }
}

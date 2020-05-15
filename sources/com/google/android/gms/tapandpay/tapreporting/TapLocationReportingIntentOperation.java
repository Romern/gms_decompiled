package com.google.android.gms.tapandpay.tapreporting;

import android.content.Intent;
import android.location.Location;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapLocationReportingIntentOperation extends asjx {

    /* renamed from: c */
    private static final srn f108737c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    atoq f108738a;

    /* renamed from: b */
    rjx f108739b;

    /* renamed from: d */
    private int f108740d;

    /* renamed from: e */
    private int f108741e;

    /* renamed from: f */
    private long f108742f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = r1.f108739b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = r1.f108739b;
     */
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        String stringExtra;
        ator ator;
        rjx rjx;
        Intent intent2 = intent;
        if (this.f108739b == null) {
            this.f108739b = aeie.m51878c(getApplicationContext());
        }
        if (this.f108738a == null) {
            this.f108738a = new atoq();
        }
        if (!TextUtils.isEmpty(intent2.getStringExtra("account_id_extra")) && (stringExtra = intent2.getStringExtra("account_name_extra")) != null && intent2.hasExtra("tap_info_extra")) {
            bxvd da = btqp.f149992o.mo74144da();
            try {
                da.mo73635b(intent2.getByteArrayExtra("tap_info_extra"), bxus.m123744c());
                try {
                    this.f108740d = (int) cgwq.f187934a.mo6606a().mo84648b();
                    this.f108741e = (int) cgwq.f187934a.mo6606a().mo84649c();
                    this.f108742f = cgwq.f187934a.mo6606a().mo84647a() * 1000;
                    if (C1133kh.m17835a(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        sdo.m34961a(this.f108740d);
                        ArrayList<Location> arrayList = new ArrayList();
                        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(this.f108740d);
                        LocationRequest locationRequest = new LocationRequest();
                        locationRequest.mo43551b(this.f108740d);
                        locationRequest.mo43554c((long) this.f108741e);
                        locationRequest.mo43549a(this.f108742f);
                        locationRequest.mo43553c(100);
                        ator = new ator(arrayBlockingQueue);
                        rjx rjx2 = this.f108739b;
                        LocationRequestInternal a = LocationRequestInternal.m66889a("TagLocationReport", locationRequest);
                        a.mo43611a();
                        a.f79426h = "com.google.android.gms.tapandpay";
                        rjx2.mo24725a(a, ator, Looper.getMainLooper());
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j = this.f108742f + elapsedRealtime;
                        while (true) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            if (elapsedRealtime2 >= j) {
                                rjx = this.f108739b;
                                break;
                            }
                            LocationResult locationResult = (LocationResult) arrayBlockingQueue.poll(Math.max(300L, this.f108742f - (elapsedRealtime2 - elapsedRealtime)), TimeUnit.MILLISECONDS);
                            if (locationResult == null) {
                                break;
                            } else if (locationResult.mo43561a() != null) {
                                arrayList.add(locationResult.mo43561a());
                                if (arrayList.size() >= this.f108740d) {
                                    break;
                                }
                            }
                        }
                        rjx.mo24716a((aehy) ator);
                        if (!arrayList.isEmpty()) {
                            for (Location location : arrayList) {
                                bxvd da2 = btqn.f149986e.mo74144da();
                                bxvd da3 = btnc.f149591d.mo74144da();
                                double latitude = location.getLatitude();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                ((btnc) da3.f164949b).f149593a = latitude;
                                double longitude = location.getLongitude();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                ((btnc) da3.f164949b).f149594b = longitude;
                                float accuracy = location.getAccuracy();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                ((btnc) da3.f164949b).f149595c = accuracy;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                btnc btnc = (btnc) da3.mo74062i();
                                btnc.getClass();
                                ((btqn) da2.f164949b).f149988a = btnc;
                                long time = location.getTime() * 1000;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                ((btqn) da2.f164949b).f149990c = time;
                                int j2 = aeim.m51906j(location);
                                int i = 3;
                                if (j2 != 1) {
                                    i = j2 != 2 ? j2 != 3 ? 2 : 5 : 4;
                                }
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                ((btqn) da2.f164949b).f149991d = i - 2;
                                try {
                                    WifiScan a2 = WifiScan.m66875a(location);
                                    if (a2 != null) {
                                        int a3 = a2.mo43592a();
                                        ArrayList<bxvd> arrayList2 = new ArrayList(a3);
                                        for (int i2 = 0; i2 < a3; i2++) {
                                            bxvd da4 = btqm.f149980e.mo74144da();
                                            long a4 = a2.mo43593a(i2);
                                            if (da4.f164950c) {
                                                da4.mo74035c();
                                                da4.f164950c = false;
                                            }
                                            ((btqm) da4.f164949b).f149982a = a4;
                                            byte b = a2.mo43594b(i2);
                                            if (da4.f164950c) {
                                                da4.mo74035c();
                                                da4.f164950c = false;
                                            }
                                            ((btqm) da4.f164949b).f149983b = b;
                                            arrayList2.add(da4);
                                        }
                                        atot.m76239a((WifiManager) getApplicationContext().getSystemService("wifi"), arrayList2);
                                        for (bxvd bxvd : arrayList2) {
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            btqn btqn = (btqn) da2.f164949b;
                                            btqm btqm = (btqm) bxvd.mo74062i();
                                            btqm.getClass();
                                            if (!btqn.f149989b.mo73666a()) {
                                                btqn.f149989b = bxvk.m124021a(btqn.f149989b);
                                            }
                                            btqn.f149989b.add(btqm);
                                        }
                                    }
                                } catch (RuntimeException e) {
                                    bnsl bnsl = (bnsl) f108737c.mo68387b();
                                    bnsl.mo68437a(e);
                                    bnsl.mo68405a("Best-effort Wifi scan attachment failed");
                                }
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                btqp btqp = (btqp) da.f164949b;
                                btqn btqn2 = (btqn) da2.mo74062i();
                                btqn2.getClass();
                                if (!btqp.f150002i.mo73666a()) {
                                    btqp.f150002i = bxvk.m124021a(btqp.f150002i);
                                }
                                btqp.f150002i.add(btqn2);
                            }
                            btqn btqn3 = (btqn) ((btqp) da.f164949b).f150002i.get(arrayList.size() - 1);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btqn3.getClass();
                            ((btqp) da.f164949b).f150001h = btqn3;
                        }
                    }
                } catch (InterruptedException e2) {
                    rjx = this.f108739b;
                } catch (asks e3) {
                    bnsl bnsl2 = (bnsl) f108737c.mo68387b();
                    bnsl2.mo68437a(e3);
                    bnsl2.mo68405a("Error reporting tap location");
                    return;
                } catch (Throwable th) {
                    this.f108739b.mo24716a((aehy) ator);
                    throw th;
                }
                atmw.m76192a(this, (btqp) da.mo74062i(), stringExtra, askc.m74272b(), "TapInfos");
                if (this.f108738a.mo50090a(this) != 0) {
                    TapInfoUploadGcmTaskOperation.m93182b(this);
                }
            } catch (bxwf e4) {
                bnsl bnsl3 = (bnsl) f108737c.mo68387b();
                bnsl3.mo68437a(e4);
                bnsl3.mo68405a("Error parsing TapInfo proto");
            }
        }
    }
}

package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.CheckInResponse;
import java.util.concurrent.TimeoutException;

/* renamed from: bifh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bifh implements aubg {

    /* renamed from: a */
    final /* synthetic */ Context f120441a;

    /* renamed from: b */
    final /* synthetic */ PlacesParams f120442b;

    /* renamed from: c */
    final /* synthetic */ bhpt f120443c;

    /* renamed from: d */
    final /* synthetic */ bifi f120444d;

    public bifh(bifi bifi, Context context, PlacesParams placesParams, bhpt bhpt) {
        this.f120444d = bifi;
        this.f120441a = context;
        this.f120442b = placesParams;
        this.f120443c = bhpt;
    }

    /* renamed from: b */
    public final CheckInResponse mo7031a(aucb aucb) {
        byte[][] bArr;
        UdcCacheResponse udcCacheResponse = (UdcCacheResponse) aucb.mo50386d();
        if (udcCacheResponse.f109350a.size() == 1) {
            if (((UdcCacheResponse.UdcSetting) udcCacheResponse.f109350a.get(0)).f109354a == 1) {
                if (((UdcCacheResponse.UdcSetting) udcCacheResponse.f109350a.get(0)).f109355b == 2) {
                    Context context = this.f120441a;
                    Location location = bioh.m102655a(context, this.f120442b.f79572b, aeie.m51878c(context), bifi.f120445a).f121044a;
                    biam a = biam.m101859a(this.f120441a, this.f120442b, this.f120443c);
                    try {
                        PlacesParams placesParams = this.f120442b;
                        CheckInReport checkInReport = this.f120444d.f120446b;
                        long j = checkInReport.f109553a;
                        String str = checkInReport.f109554b;
                        int i = checkInReport.f109556d;
                        byte[] bArr2 = checkInReport.f109557e;
                        byte[][] bArr3 = checkInReport.f109558f;
                        sgv sgv = a.f120057e;
                        ClientContext clientContext = a.f120054b;
                        Context context2 = a.f120053a;
                        bxvd da = bvor.f157199l.mo74144da();
                        bvov a2 = bian.m101870a(context2, placesParams);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvor bvor = (bvor) da.f164949b;
                        a2.getClass();
                        bvor.f157202b = a2;
                        int i2 = 1 | bvor.f157201a;
                        bvor.f157201a = i2;
                        int i3 = i2 | 2;
                        bvor.f157201a = i3;
                        bvor.f157203c = j;
                        str.getClass();
                        bvor.f157201a = i3 | 4;
                        bvor.f157204d = str;
                        String str2 = Build.FINGERPRINT;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvor bvor2 = (bvor) da.f164949b;
                        str2.getClass();
                        bvor2.f157201a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bvor2.f157210j = str2;
                        if (location != null) {
                            bxvd da2 = bzrv.f171206c.mo74144da();
                            double latitude = location.getLatitude();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((bzrv) da2.f164949b).f171208a = latitude;
                            double longitude = location.getLongitude();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((bzrv) da2.f164949b).f171209b = longitude;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bvor bvor3 = (bvor) da.f164949b;
                            bzrv bzrv = (bzrv) da2.mo74062i();
                            bzrv.getClass();
                            bvor3.f157205e = bzrv;
                            bvor3.f157201a |= 8;
                            long time = location.getTime() * 1000;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bvor bvor4 = (bvor) da.f164949b;
                            bvor4.f157201a |= 16;
                            bvor4.f157206f = time;
                            float accuracy = location.getAccuracy() * 1000.0f;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bvor bvor5 = (bvor) da.f164949b;
                            bvor5.f157201a |= 32;
                            bvor5.f157207g = accuracy;
                        }
                        if (i != -1) {
                            bvor bvor6 = (bvor) da.f164949b;
                            bvor6.f157201a |= 64;
                            bvor6.f157208h = i;
                        }
                        if (bArr2 != null) {
                            bxtx a3 = bxtx.m123261a(bArr2);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bvor bvor7 = (bvor) da.f164949b;
                            a3.getClass();
                            bvor7.f157201a |= 128;
                            bvor7.f157209i = a3;
                        }
                        if (bArr3 != null) {
                            for (byte[] bArr4 : bArr3) {
                                bxtx a4 = bxtx.m123261a(bArr4);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bvor bvor8 = (bvor) da.f164949b;
                                a4.getClass();
                                if (!bvor8.f157211k.mo73666a()) {
                                    bvor8.f157211k = bxvk.m124021a(bvor8.f157211k);
                                }
                                bvor8.f157211k.add(a4);
                            }
                        }
                        bvos bvos = (bvos) sgv.mo25515a(clientContext, 1, "reportCheckIn", ((bvor) da.mo74062i()).mo73642k(), bvos.f157212c, cggs.m145360c(), 10269);
                        Context context3 = a.f120053a;
                        if (bvos != null) {
                            bvow bvow = bvos.f157214a;
                            if (bvow == null) {
                                bvow = bvow.f157230c;
                            }
                            bian.m101877a(context3, bvow);
                            int size = bvos.f157215b.size();
                            bArr = new byte[size][];
                            for (int i4 = 0; i4 < size; i4++) {
                                bArr[i4] = ((bxtx) bvos.f157215b.get(i4)).mo73780k();
                            }
                        } else {
                            bArr = null;
                        }
                        avvw avvw = new avvw();
                        avvw.f93996a = bArr;
                        return avvw.mo51655a();
                    } catch (VolleyError | gid | TimeoutException e) {
                        bhuj.m101555a().mo64361c("CheckIn report to PlacesServer failed");
                        throw e;
                    }
                } else {
                    bhuj.m101555a();
                    String str3 = this.f120442b.f79574d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73);
                    sb.append("DataUploadOptIn is off for account ");
                    sb.append(str3);
                    sb.append(". CheckIn not reported to PlacesServer");
                    sb.toString();
                    return new avvw().mo51655a();
                }
            }
        }
        bhuj.m101555a().mo64360b("Call to UDC failed");
        throw new RuntimeException("Call to UDC failed");
    }
}

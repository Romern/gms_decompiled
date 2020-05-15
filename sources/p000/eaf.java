package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import java.util.Map;

/* renamed from: eaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eaf extends dyg {

    /* renamed from: b */
    public static final dxr f14538b = new dxr(eae.f14537a, "SemanticLocationProducer", new int[]{74}, null);

    /* renamed from: k */
    private Map f14539k;

    /* renamed from: l */
    private final PendingIntent f14540l = PendingIntent.getBroadcast(this.f14388d, 0, new Intent("android.gms.contextmanager.GEOFENCE"), 134217728);

    public eaf(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14538b, str, dqb);
    }

    /* renamed from: a */
    private static final ParcelableGeofence m9965a(String str, LatLng latLng, float f) {
        aehf aehf = new aehf();
        aehf.f63389b = 3;
        aehf.f63388a = str;
        aehf.mo34147b();
        aehf.f63392e = 0;
        aehf.mo34146a(latLng.f79894a, latLng.f79895b, f);
        return aehf.mo34145a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        aeie.m51876a(this.f14388d).mo24741d(this.f14540l).mo50371a(new dqi("[SemanticLocationProducer] reset Geofences", new Object[0]));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.gms.contextmanager.GEOFENCE");
        return intentFilter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo9903j() {
        if (sqw.m36042a(this.f14539k)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("eaf", "j", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[SemanticLocationProducer] The location of Home and Work alias is not available.");
            return;
        }
        aehm aehm = new aehm();
        aehm.mo34153b(3);
        for (Map.Entry entry : this.f14539k.entrySet()) {
            String str = (String) entry.getKey();
            LatLng latLng = (LatLng) entry.getValue();
            Object[] objArr = {str, latLng};
            aehm.mo34150a(m9965a(str, latLng, (float) cdgp.f180782a.mo6606a().mo77541aF()));
            if (str.equals("Home")) {
                aehm.mo34150a(m9965a("Travel", latLng, (float) cdgp.f180782a.mo6606a().mo77542aG()));
            }
        }
        GeofencingRequest a = aehm.mo34149a();
        aeie.m51876a(dwq.m9662f()).mo24684a(a, this.f14540l).mo50371a(new dqi("[SemanticLocationProducer] add Geofence %s", a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        this.f14539k = dwq.m9651H().mo9842a(this.f14389e);
        mo9903j();
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        if ("android.gms.contextmanager.GEOFENCE".equals(intent.getAction())) {
            aehl a = aehl.m51844a(intent);
            if (!a.mo34148a()) {
                bxvd da = bxnb.f164005c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxnb bxnb = (bxnb) da.f164949b;
                bxnb.f164009b = 0;
                bxnb.f164008a |= 1;
                List list = a.f63404c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String str = ((ParcelableGeofence) list.get(i)).f79438a;
                    int i2 = a.f63403b;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxnb bxnb2 = (bxnb) da.f164949b;
                            bxnb2.f164009b = 0;
                            bxnb2.f164008a |= 1;
                        } else if (str.equals("Travel")) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxnb bxnb3 = (bxnb) da.f164949b;
                            bxnb3.f164009b = 3;
                            bxnb3.f164008a |= 1;
                        }
                    } else if (str.equals("Home")) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bxnb bxnb4 = (bxnb) da.f164949b;
                        bxnb4.f164009b = 1;
                        bxnb4.f164008a |= 1;
                    } else if (str.equals("Work")) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bxnb bxnb5 = (bxnb) da.f164949b;
                        bxnb5.f164009b = 2;
                        bxnb5.f164008a |= 1;
                    }
                }
                tip tip = new tip(4, 74, 1);
                tip.mo26572a(bxnb.f164006d, (bxnb) da.mo74062i());
                mo9856c(tip.mo26570a());
                return;
            }
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("eaf", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[SemanticLocationProducer] Geofence intent error %d", a.f63402a);
        }
    }

    /* renamed from: a */
    public final void mo9855a(dwa dwa, dwa dwa2) {
        Object[] objArr = {dwa, dwa2};
        Map a = dwq.m9651H().mo9842a(this.f14389e);
        if (a == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("eaf", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[SemanticLocationProducer] Unexpected null aliasToLatLng returned");
        } else if (!this.f14539k.equals(a)) {
            mo9903j();
        }
    }
}

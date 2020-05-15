package p000;

import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: dxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dxx implements aubg {

    /* renamed from: a */
    final /* synthetic */ Map f14378a;

    public dxx(Map map) {
        this.f14378a = map;
    }

    /* renamed from: b */
    public final aucb mo9840b(aucb aucb) {
        if (aucb.mo50384b()) {
            aelj aelj = (aelj) aucb.mo50386d();
            if (aelj == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dxx", "b", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[StandardPlaceAliasManager] Unknown error: null returned from GeoDataClient#getPlaceById");
                return aucu.m76778a((Object) null);
            }
            HashMap hashMap = new HashMap();
            Iterator it = aelj.iterator();
            while (it.hasNext()) {
                aelh aelh = (aelh) it.next();
                hashMap.put(aelh.mo8007a(), aelh.mo8010d());
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : this.f14378a.entrySet()) {
                String str = (String) entry.getKey();
                LatLng latLng = (LatLng) hashMap.get((String) entry.getValue());
                if (latLng != null) {
                    hashMap2.put(str, latLng);
                }
            }
            if (hashMap2.isEmpty()) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("dxx", "b", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[StandardPlaceAliasManager] No LatLng information found for placeId %s", this.f14378a.values());
            }
            return aucu.m76778a(hashMap2);
        }
        bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
        bnsl3.mo68437a(aucb.mo50387e());
        bnsl3.mo68432a("dxx", "b", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("[StandardPlaceAliasManager] getPlaceById failed: ");
        return aucu.m76778a((Object) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7031a(aucb aucb) {
        if (aucb.mo50384b()) {
            aelj aelj = (aelj) aucb.mo50386d();
            if (aelj == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dxx", "b", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[StandardPlaceAliasManager] Unknown error: null returned from GeoDataClient#getPlaceById");
                return aucu.m76778a((Object) null);
            }
            HashMap hashMap = new HashMap();
            Iterator it = aelj.iterator();
            while (it.hasNext()) {
                aelh aelh = (aelh) it.next();
                hashMap.put(aelh.mo8007a(), aelh.mo8010d());
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : this.f14378a.entrySet()) {
                String str = (String) entry.getKey();
                LatLng latLng = (LatLng) hashMap.get((String) entry.getValue());
                if (latLng != null) {
                    hashMap2.put(str, latLng);
                }
            }
            if (hashMap2.isEmpty()) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("dxx", "b", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[StandardPlaceAliasManager] No LatLng information found for placeId %s", this.f14378a.values());
            }
            return aucu.m76778a(hashMap2);
        }
        bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
        bnsl3.mo68437a(aucb.mo50387e());
        bnsl3.mo68432a("dxx", "b", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("[StandardPlaceAliasManager] getPlaceById failed: ");
        return aucu.m76778a((Object) null);
    }
}

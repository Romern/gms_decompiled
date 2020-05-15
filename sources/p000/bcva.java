package p000;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: bcva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcva {
    /* renamed from: a */
    public static bmxv m90099a(bctr bctr) {
        int a = bctr.mo57365f().mo57180a();
        if (a == 0) {
            throw null;
        } else if (a != 3 || !bctr.mo57365f().mo57184b().mo57379a().equals("photos")) {
            return bmvz.f131120a;
        } else {
            return m90101a(bctr.mo57365f().mo57184b().mo57380b());
        }
    }

    /* renamed from: a */
    public static bmxv m90100a(bcwr bcwr) {
        try {
            HashMap hashMap = new HashMap();
            if (bcwr.mo57622a() != null) {
                bcwp a = bcwr.mo57622a();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("RESOURCE_ID", a.mo57617a());
                hashMap2.put("RESOURCE_REGION", Integer.valueOf(a.mo57618b()));
                hashMap.put("MEDIA_ID", hashMap2);
            }
            if (bcwr.mo57623b() != null) {
                hashMap.put("LOCAL_URI", bcwr.mo57623b());
            }
            hashMap.put("WIDTH", Integer.valueOf(bcwr.mo57625d()));
            hashMap.put("HEIGHT", Integer.valueOf(bcwr.mo57626e()));
            hashMap.put("SIZE", Integer.valueOf(bcwr.mo57628f()));
            hashMap.put("DOWNLOAD_STATUS", Integer.valueOf(bcwr.mo57629g()));
            if (bcwr.mo57624c().mo66813a()) {
                hashMap.put("THUMBNAIL", bcwr.mo57624c().mo66814b());
            }
            return bmxv.m108566b(bbqu.m88422a((Serializable) hashMap));
        } catch (IOException e) {
            bbos.m88292b("PhotoUtils", "Failed to serialize photo data", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public static bmxv m90101a(byte[] bArr) {
        bmxv bmxv;
        HashMap b = bbqu.m88424b(bArr);
        try {
            bcwq i = bcwr.m90183i();
            i.mo57642d(((Integer) b.get("WIDTH")).intValue());
            i.mo57640b(((Integer) b.get("HEIGHT")).intValue());
            i.mo57641c(((Integer) b.get("SIZE")).intValue());
            i.mo57638a(((Integer) b.get("DOWNLOAD_STATUS")).intValue());
            if (b.containsKey("THUMBNAIL")) {
                i.mo57639a((byte[]) b.get("THUMBNAIL"));
            }
            if (b.containsKey("MEDIA_ID")) {
                HashMap hashMap = (HashMap) b.get("MEDIA_ID");
                try {
                    bcwo c = bcwp.m90173c();
                    c.mo57635a((String) hashMap.get("RESOURCE_ID"));
                    c.mo57634a(((Integer) hashMap.get("RESOURCE_REGION")).intValue());
                    bmxv = bmxv.m108566b(c.mo57633a());
                } catch (Exception e) {
                    bbos.m88292b("PhotoConverters", "failed to convert HashMap to LighterMediaId", e);
                    bmxv = bmvz.f131120a;
                }
                i.f105079a = (bcwp) bmxv.mo66814b();
            }
            if (b.containsKey("LOCAL_URI")) {
                i.f105080b = (String) b.get("LOCAL_URI");
            }
            return bmxv.m108566b(i.mo57637a());
        } catch (Exception e2) {
            bbos.m88292b("PhotoConverters", "failed to convert HashMap to PhotoData", e2);
            return bmvz.f131120a;
        }
    }
}

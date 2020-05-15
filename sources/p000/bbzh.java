package p000;

import android.database.Cursor;
import android.graphics.Bitmap;
import java.util.HashMap;

/* renamed from: bbzh */
final /* synthetic */ class bbzh implements bmxj {

    /* renamed from: a */
    static final bmxj f103795a = new bbzh();

    private bbzh() {
    }

    public final Object apply(Object obj) {
        bmxv bmxv;
        Bitmap a;
        bmxv bmxv2;
        Cursor cursor = (Cursor) obj;
        if (cursor.getPosition() == -1 && !cursor.moveToFirst()) {
            return bmvz.f131120a;
        }
        bcsi m = bcsj.m89802m();
        m.mo57441a(bcbv.m88775a(0, cursor));
        HashMap b = bbqu.m88424b(cursor.getBlob(bcds.m88852a(6)));
        if (b.containsKey("expiration_time_ms")) {
            m.mo57442a((Long) b.get("expiration_time_ms"));
        } else {
            m.mo57442a((Long) -1L);
        }
        if (b.containsKey("name")) {
            m.mo57446b((String) b.get("name"));
        }
        if (b.containsKey("image_url")) {
            m.mo57443a((String) b.get("image_url"));
        }
        if (b.containsKey("image_stale")) {
            m.mo57444a(((Boolean) b.get("image_stale")).booleanValue());
        }
        if (b.containsKey("custom_view_content") && ((Integer) b.get("custom_view_content_type")).intValue() == 1) {
            byte[] bArr = (byte[]) b.get("custom_view_content");
            if (bArr == null || bArr.length == 0) {
                bmxv2 = bmvz.f131120a;
            } else {
                HashMap b2 = bbqu.m88424b(bArr);
                if (b2.containsKey("TYPE") && ((Integer) b2.get("TYPE")).intValue() == 1) {
                    bmxv a2 = bbqu.m88420a(b2.get("CONTENT"));
                    if (a2.mo66813a()) {
                        bmxv a3 = bccr.m88800a((HashMap) a2.mo66814b());
                        if (a3.mo66813a()) {
                            bcup c = bcuq.m90048c();
                            c.mo57570a((bcuo) a3.mo66814b());
                            bmxv2 = bmxv.m108566b(c.mo57569a());
                        }
                    }
                }
                bmxv2 = bmvz.f131120a;
            }
            if (bmxv2.mo66813a()) {
                m.mo57438a((bcsv) bmxv2.mo66814b());
            }
        }
        m.mo57440a(bcbv.m88774a(b, "menu_items").mo67664a());
        m.mo57445b(bcbv.m88774a(b, "toolbar_buttons").mo67664a());
        if (b.containsKey("image") && (a = bbqu.m88419a((byte[]) b.get("image"))) != null) {
            m.mo57437a(a);
        }
        if (b.containsKey("ui_configurations")) {
            try {
                HashMap hashMap = (HashMap) b.get("ui_configurations");
                try {
                    bctc c2 = bctd.m89892c();
                    c2.mo57500a(0);
                    c2.mo57501b(0);
                    if (hashMap.containsKey("BADGE")) {
                        c2.mo57500a(((Integer) hashMap.get("BADGE")).intValue());
                    }
                    if (hashMap.containsKey("PROFILE_LABEL_STYLE")) {
                        c2.mo57501b(((Integer) hashMap.get("PROFILE_LABEL_STYLE")).intValue());
                    }
                    bmxv = bmxv.m108566b(c2.mo57499a());
                } catch (ClassCastException e) {
                    bbos.m88294d("ContactCursors", "Failed to de-serialize UI configurations properties.");
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    m.mo57439a((bctd) bmxv.mo66814b());
                }
            } catch (ClassCastException e2) {
                bbos.m88294d("ContactCursors", "Failed to de-serialize UI configurations map.");
            }
        }
        return bmxv.m108566b(m.mo57436a());
    }
}

package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bcbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcbv {
    /* renamed from: a */
    public static ContentValues m88773a(bcsj bcsj) {
        byte[] bArr;
        bmxv bmxv;
        ContentValues contentValues = new ContentValues();
        contentValues.put("lighter_id_type", Integer.valueOf(bcsj.mo57302a().mo60494c().f111365f));
        contentValues.put("lighter_id_id", bcsj.mo57302a().mo60492a());
        contentValues.put("lighter_id_normalized_id", bcsj.mo57302a().mo60494c() == ContactId.ContactType.EMAIL ? bboo.m88285a(bcsj.mo57302a().mo60492a()) : bcsj.mo57302a().mo60492a());
        contentValues.put("lighter_handler_id", (String) bcsj.mo57302a().mo60495d().mo66815c());
        contentValues.put("lighter_id_app_name", bcsj.mo57302a().mo60493b());
        HashMap hashMap = new HashMap();
        hashMap.put("expiration_time_ms", bcsj.mo57308g());
        hashMap.put("image_stale", Boolean.valueOf(bcsj.mo57307f()));
        if (bcsj.mo57303b().mo66813a()) {
            hashMap.put("name", bcsj.mo57303b().mo66814b());
        }
        if (bcsj.mo57305d().mo66813a()) {
            hashMap.put("image_url", bcsj.mo57305d().mo66814b());
        }
        if (bcsj.mo57306e().mo66813a()) {
            hashMap.put("image", bbqu.m88421a((Bitmap) bcsj.mo57306e().mo66814b()));
        }
        if (!bcsj.mo57309h().isEmpty()) {
            hashMap.put("menu_items", bbow.m88302b(bcsj.mo57309h(), bcbt.f103947a));
        }
        if (bcsj.mo57311j().mo66813a()) {
            bcsv bcsv = (bcsv) bcsj.mo57311j().mo66814b();
            if (bcsv.mo57483b() == 1) {
                if (bcsv.mo57483b() == 1) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("TYPE", 1);
                    hashMap2.put("CONTENT", bccr.m88801a(((bcuq) bcsv).mo57402a()));
                    try {
                        bmxv = bmxv.m108566b(bbqu.m88422a((Serializable) hashMap2));
                    } catch (IOException e) {
                        bbos.m88292b("SerRichTextModel", "Failed to serialize contact properties.", e);
                        bmxv = bmvz.f131120a;
                    }
                } else {
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    hashMap.put("custom_view_content_type", 1);
                    hashMap.put("custom_view_content", bmxv.mo66814b());
                }
            }
        }
        if (!bcsj.mo57310i().isEmpty()) {
            hashMap.put("toolbar_buttons", bbow.m88302b(bcsj.mo57310i(), bcbu.f103948a));
        }
        if (bcsj.mo57312k().mo66813a()) {
            bctd bctd = (bctd) bcsj.mo57312k().mo66814b();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("BADGE", Integer.valueOf(bctd.mo57354a()));
            hashMap3.put("PROFILE_LABEL_STYLE", Integer.valueOf(bctd.mo57355b()));
            hashMap.put("ui_configurations", hashMap3);
        }
        try {
            bArr = bbqu.m88422a((Serializable) hashMap);
        } catch (IOException e2) {
            bbos.m88292b("ContactCursors", "Failed to serialize contact properties.", e2);
            bArr = new byte[0];
        }
        contentValues.put("contact_properties", bArr);
        return contentValues;
    }

    /* renamed from: a */
    public static bngs m88774a(HashMap hashMap, String str) {
        ArrayList arrayList;
        bmxv bmxv;
        bngs j = bngx.m109377j();
        if (hashMap.containsKey(str)) {
            try {
                arrayList = (ArrayList) hashMap.get(str);
            } catch (ClassCastException e) {
                bbos.m88292b("ContactCursors", str.length() == 0 ? new String("Failed to deserialize ") : "Failed to deserialize ".concat(str), e);
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Map map = (Map) arrayList.get(i);
                if (!map.containsKey("ACTION") || !map.containsKey("MENU_NAME")) {
                    bbos.m88294d("MenuItemConv", "Missing necessary properties.");
                    bmxv = bmvz.f131120a;
                } else {
                    bcta d = bctb.m89884d();
                    d.mo57496a((String) map.get("MENU_NAME"));
                    bmxv a = bbot.m88295a(bbqu.m88420a(map.get("ACTION")), bccc.f103949a);
                    if (!a.mo66813a()) {
                        bbos.m88294d("MenuItemConv", "Parse Action failed.");
                        bmxv = bmvz.f131120a;
                    } else {
                        d.mo57495a((bcov) a.mo66814b());
                        if (map.containsKey("ICON")) {
                            d.mo57497a(Base64.decode((String) map.get("ICON"), 2));
                        }
                        bmxv = bmxv.m108566b(d.mo57494a());
                    }
                }
                if (bmxv.mo66813a()) {
                    j.mo67668c((bctb) bmxv.mo66814b());
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public static ContactId m88775a(int i, Cursor cursor) {
        bcsk f = ContactId.m94830f();
        f.mo57453b(cursor.getString(bcds.m88852a(3) + i));
        f.mo57454c(cursor.getString(bcds.m88852a(5) + i));
        f.mo57451a(ContactId.ContactType.m94837a(cursor.getInt(bcds.m88852a(2) + i)));
        String string = cursor.getString(i + bcds.m88852a(4));
        if (string != null) {
            f.mo57452a(string);
        }
        return f.mo57450a();
    }
}

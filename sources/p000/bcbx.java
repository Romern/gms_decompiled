package p000;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: bcbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcbx {
    /* renamed from: a */
    public static bmxv m88778a(Cursor cursor) {
        bmxv bmxv;
        Bitmap a;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            int length = bcdv.f104020b.length;
            int length2 = bcdt.f104018a.length + length;
            bcso n = bcsp.m89835n();
            if (ConversationId.IdType.m94851a(cursor.getInt(bcdu.m88853a(2))) == ConversationId.IdType.GROUP) {
                bcsq f = ConversationId.m94839f();
                bcsr c = ConversationId.GroupId.m94847c();
                c.mo57478b(cursor.getString(bcdu.m88853a(3)));
                c.mo57477a(cursor.getString(bcdu.m88853a(4)));
                f.mo57474a(c.mo57476a());
                f.mo57473a(bcbv.m88775a(length, cursor));
                n.mo57459a(f);
            } else {
                bcsq f2 = ConversationId.m94839f();
                f2.mo57475b(bcbv.m88775a(length2, cursor));
                f2.mo57473a(bcbv.m88775a(length, cursor));
                n.mo57459a(f2);
            }
            n.mo57464a(bbqu.m88425c(cursor.getBlob(bcdu.m88853a(8))));
            n.f104811a = Long.valueOf(cursor.getLong(bcdu.m88853a(9)));
            HashMap b = bbqu.m88424b(cursor.getBlob(bcdu.m88853a(10)));
            if (b.isEmpty()) {
                bbos.m88294d("ConversationCursors", "Failed to deserialize conversation properties: No properties.");
            } else {
                if (b.containsKey("expiration_time_ms")) {
                    n.mo57462a((Long) b.get("expiration_time_ms"));
                } else {
                    n.mo57462a((Long) -1L);
                }
                if (b.containsKey("blockable")) {
                    n.mo57465a(((Boolean) b.get("blockable")).booleanValue());
                }
                if (b.containsKey("title")) {
                    n.mo57467b((String) b.get("title"));
                }
                if (b.containsKey("image_url")) {
                    n.mo57463a((String) b.get("image_url"));
                }
                if (b.containsKey("image_stale")) {
                    n.mo57468b(((Boolean) b.get("image_stale")).booleanValue());
                }
                if (b.containsKey("image") && (a = bbqu.m88419a((byte[]) b.get("image"))) != null) {
                    n.mo57458a(a);
                }
                if (b.containsKey("suggestion_list")) {
                    HashMap b2 = bbqu.m88424b((byte[]) b.get("suggestion_list"));
                    try {
                        bcut f3 = bcuu.m90069f();
                        f3.mo57581b((String) b2.get("ID"));
                        f3.mo57578a(((Integer) b2.get("RENDER_STYLE")).intValue());
                        f3.mo57582c((String) b2.get("MESSAGE_ID"));
                        f3.mo57580a((String) b2.get("HINT_TEXT"));
                        bngx c2 = bbow.m88303c((ArrayList) b2.get("SUGGESTIONS"), bcct.f103962a);
                        if (!c2.isEmpty()) {
                            f3.mo57579a(c2);
                            bmxv = bmxv.m108566b(f3.mo57577a());
                        } else {
                            bmxv = bmvz.f131120a;
                        }
                    } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                        bbos.m88292b("ChipsListConverters", "failed to convert HashMap to SuggestionList", e);
                        bmxv = bmvz.f131120a;
                    }
                    n.f104812b = bmxv;
                }
                if (b.containsKey("capabilities")) {
                    try {
                        n.mo57460a(bngx.m109368a((Collection) ((ArrayList) b.get("capabilities"))));
                    } catch (ClassCastException e2) {
                        bbos.m88292b("ConversationCursors", "Error deserializing Capabilities in Conversation properties", e2);
                    }
                }
                if (b.containsKey("properties_expiration_time_ms")) {
                    n.mo57466b((Long) b.get("properties_expiration_time_ms"));
                } else {
                    n.mo57466b((Long) -1L);
                }
            }
            try {
                return bmxv.m108566b(n.mo57457a());
            } catch (IllegalStateException e3) {
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: b */
    public static byte[] m88783b(bcsp bcsp) {
        try {
            return bbqu.m88422a((Serializable) m88779a(bcsp));
        } catch (IOException e) {
            bbos.m88292b("ConversationCursors", "Failed to serialize conversation properties.", e);
            return new byte[0];
        }
    }

    /* renamed from: a */
    public static HashMap m88779a(bcsp bcsp) {
        HashMap hashMap = new HashMap();
        m88781a(hashMap, bcsp);
        if (bcsp.mo57326j().mo66813a()) {
            bcuu bcuu = (bcuu) bcsp.mo57326j().mo66814b();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ID", bcuu.mo57416a());
            hashMap2.put("MESSAGE_ID", bcuu.mo57417b());
            hashMap2.put("RENDER_STYLE", Integer.valueOf(bcuu.mo57419d()));
            hashMap2.put("SUGGESTIONS", bbow.m88302b(bcuu.mo57418c(), bccs.f103961a));
            hashMap2.put("HINT_TEXT", bcuu.mo57420e());
            hashMap.put("suggestion_list", bbqu.m88422a((Serializable) hashMap2));
        }
        hashMap.put("capabilities", new ArrayList(bcsp.mo57327k()));
        hashMap.put("properties_expiration_time_ms", bcsp.mo57328l());
        return hashMap;
    }

    /* renamed from: a */
    public static HashMap m88780a(byte[] bArr) {
        try {
            Object readObject = new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            return !(readObject instanceof HashMap) ? new HashMap() : (HashMap) readObject;
        } catch (IOException | ClassNotFoundException e) {
            bbos.m88292b("ConversationCursors", "Error reading conversation properties.", e);
            return new HashMap();
        }
    }

    /* renamed from: a */
    public static void m88781a(HashMap hashMap, bcsp bcsp) {
        hashMap.put("expiration_time_ms", bcsp.mo57322f());
        hashMap.put("blockable", Boolean.valueOf(bcsp.mo57324h()));
        hashMap.put("image_stale", Boolean.valueOf(bcsp.mo57321e()));
        if (bcsp.mo57318b().mo66813a()) {
            hashMap.put("title", bcsp.mo57318b().mo66814b());
        }
        if (bcsp.mo57319c().mo66813a()) {
            hashMap.put("image_url", bcsp.mo57319c().mo66814b());
        }
        if (bcsp.mo57320d().mo66813a()) {
            hashMap.put("image", bbqu.m88421a((Bitmap) bcsp.mo57320d().mo66814b()));
        }
    }

    /* renamed from: a */
    public static byte[] m88782a(HashMap hashMap) {
        try {
            return bbqu.m88422a((Serializable) hashMap);
        } catch (IOException e) {
            bbos.m88292b("ConversationCursors", "Failed to serialize conversation properties.", e);
            return new byte[0];
        }
    }
}

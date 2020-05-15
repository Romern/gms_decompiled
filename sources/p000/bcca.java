package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;

/* renamed from: bcca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcca {
    /* renamed from: a */
    public static bmxv m88790a(HashMap hashMap) {
        try {
            bcsr c = ConversationId.GroupId.m94847c();
            c.mo57478b((String) hashMap.get("ID"));
            c.mo57477a((String) hashMap.get("APP_NAME"));
            return bmxv.m108566b(c.mo57476a());
        } catch (ClassCastException e) {
            bbos.m88294d("GroupIdConverters", "failed to convert HashMap to GroupId");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public static HashMap m88791a(ConversationId.GroupId groupId) {
        HashMap hashMap = new HashMap();
        hashMap.put("ID", groupId.mo60503a());
        hashMap.put("APP_NAME", groupId.mo60504b());
        return hashMap;
    }
}

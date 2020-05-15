package p000;

import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.util.HashMap;

/* renamed from: bcae */
final /* synthetic */ class bcae implements bmxj {

    /* renamed from: a */
    static final bmxj f103865a = new bcae();

    private bcae() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b A[Catch:{ Exception -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0006 A[SYNTHETIC] */
    public final Object apply(Object obj) {
        bmxv bmxv;
        bmxv bmxv2;
        bmxv bmxv3;
        Cursor cursor = (Cursor) obj;
        bngs j = bngx.m109377j();
        while (cursor.moveToNext()) {
            if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
                bctt g = Notification.m94865g();
                g.mo57546a(cursor.getString(bcdy.m88855a(2)));
                g.f104898a = Long.valueOf(cursor.getLong(bcdy.m88855a(6)));
                g.mo57547a(bbqu.m88425c(cursor.getBlob(bcdy.m88855a(4))));
                HashMap b = bbqu.m88424b(cursor.getBlob(bcdy.m88855a(5)));
                bmxv a = Notification.NotificationType.m94872a(cursor.getInt(bcdy.m88855a(3)));
                if (a.mo66813a()) {
                    if (((Notification.NotificationType) a.mo66814b()).ordinal() == 0) {
                        try {
                            HashMap hashMap = (HashMap) b.get("message_received_notification");
                            try {
                                bcts j2 = MessageReceivedNotification.m94855j();
                                HashMap hashMap2 = (HashMap) hashMap.get("CONVERSATION_ID");
                                try {
                                    bcsq f = ConversationId.m94839f();
                                    bmxv a2 = bcbw.m88776a((HashMap) hashMap2.get("OWNER"));
                                    if (a2.mo66813a()) {
                                        f.mo57473a((ContactId) a2.mo66814b());
                                        ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
                                        int ordinal = ConversationId.IdType.m94851a(((Integer) hashMap2.get("TYPE")).intValue()).ordinal();
                                        if (ordinal == 0) {
                                            bmxv a3 = bcbw.m88776a((HashMap) hashMap2.get("OTHER_PARTICIPANT"));
                                            if (a3.mo66813a()) {
                                                f.mo57475b((ContactId) a3.mo66814b());
                                            }
                                        } else if (ordinal == 1) {
                                            bmxv a4 = bcca.m88790a((HashMap) hashMap2.get("GROUP"));
                                            if (a4.mo66813a()) {
                                                f.mo57474a((ConversationId.GroupId) a4.mo66814b());
                                            } else {
                                                bmxv3 = bmvz.f131120a;
                                                if (bmxv3.mo66813a()) {
                                                    j2.mo57536a((ConversationId) bmxv3.mo66814b());
                                                    j2.mo57541d((String) hashMap.get("MESSAGE_ID"));
                                                    bmxv a5 = bcbw.m88776a((HashMap) hashMap.get("SENDER_ID"));
                                                    if (a5.mo66813a()) {
                                                        j2.mo57535a((ContactId) a5.mo66814b());
                                                        j2.mo57537a((String) hashMap.get("AVATAR_URL"));
                                                        j2.mo57543f((String) hashMap.get("TITLE"));
                                                        j2.mo57539b((String) hashMap.get("BODY"));
                                                        j2.mo57542e((String) hashMap.get("SENDER_NAME"));
                                                        j2.mo57540c((String) hashMap.get("MESSAGE_CONTENT"));
                                                        j2.mo57538a(Boolean.TRUE.equals(hashMap.get("DISABLE_INLINE_RESPONSE")));
                                                        bmxv2 = bmxv.m108566b(j2.mo57534a());
                                                        if (bmxv2.mo66813a()) {
                                                            bmxv = bmvz.f131120a;
                                                            if (bmxv.mo66813a()) {
                                                                j.mo67668c((Notification) bmxv.mo66814b());
                                                            }
                                                        } else {
                                                            g.mo57545a((MessageReceivedNotification) bmxv2.mo66814b());
                                                        }
                                                    }
                                                }
                                                bmxv2 = bmvz.f131120a;
                                                if (bmxv2.mo66813a()) {
                                                }
                                            }
                                        }
                                        bmxv3 = bmxv.m108566b(f.mo57472a());
                                        if (bmxv3.mo66813a()) {
                                        }
                                        bmxv2 = bmvz.f131120a;
                                        if (bmxv2.mo66813a()) {
                                        }
                                    }
                                    bmxv3 = bmvz.f131120a;
                                } catch (Exception e) {
                                    bbos.m88294d("ConversationIdConverters", "failed to convert HashMap to ConversationId");
                                    bmxv3 = bmvz.f131120a;
                                }
                                if (bmxv3.mo66813a()) {
                                }
                                bmxv2 = bmvz.f131120a;
                            } catch (Exception e2) {
                                bbos.m88294d("MessageReceivedNotificationConverters", "failed to convert HashMap to MessageReceivedNotification");
                                bmxv2 = bmvz.f131120a;
                            }
                            if (bmxv2.mo66813a()) {
                            }
                        } catch (ClassCastException e3) {
                            bmxv = bmvz.f131120a;
                        }
                    }
                    bmxv = bmxv.m108566b(g.mo57544a());
                    if (bmxv.mo66813a()) {
                    }
                }
            }
            bmxv = bmvz.f131120a;
            if (bmxv.mo66813a()) {
            }
        }
        return j.mo67664a();
    }
}

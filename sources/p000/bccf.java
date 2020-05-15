package p000;

import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bccf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bccf {
    /* renamed from: a */
    public static bctr m88795a(ConversationId conversationId, Cursor cursor) {
        HashMap hashMap;
        bmxv bmxv;
        ObjectInputStream objectInputStream;
        int length = bcdx.f104021a.length;
        bcte p = bctr.m89953p();
        p.mo57520c(cursor.getString(bcdw.m88854a(2)));
        p.f104841a = bctl.m89930a(cursor.getInt(bcdw.m88854a(3)));
        p.mo57506a(bctk.m89929a(cursor.getInt(bcdw.m88854a(8))));
        p.mo57512a(Long.valueOf(cursor.getLong(bcdw.m88854a(6))));
        p.mo57511a(conversationId);
        p.mo57503a(cursor.getInt(bcdw.m88854a(10)));
        p.mo57516b(cursor.getInt(bcdw.m88854a(12)));
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cursor.getBlob(bcdw.m88854a(7)));
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                hashMap = (HashMap) objectInputStream.readObject();
                objectInputStream.close();
                byteArrayInputStream.close();
                if (hashMap.containsKey("content_type")) {
                    int b = bctf.m89916b(bqcn.m112579a((byte[]) hashMap.get("content_type")));
                    if (hashMap.containsKey("message_content")) {
                        bctq bctq = bctq.f104880a;
                        int i = b - 1;
                        if (i == 0) {
                            byte[] bArr = (byte[]) hashMap.get("message_content");
                            p.mo57505a(bcqa.m89618a(bArr == null ? bxtx.f164797b : bxtx.m123261a(bArr)));
                        } else if (i == 1) {
                            p.mo57517b(new String((byte[]) hashMap.get("message_content")));
                        } else if (i == 2) {
                            bctg c = bcth.m89920c();
                            c.mo57523a(new String((byte[]) hashMap.get("custom_message_content_type")));
                            c.mo57524a((byte[]) hashMap.get("message_content"));
                            p.mo57504a(c.mo57522a());
                        } else if (i != 3) {
                            p.mo57515b();
                        } else {
                            HashMap b2 = bbqu.m88424b((byte[]) hashMap.get("message_content"));
                            if (b2.isEmpty()) {
                                bbos.m88294d("MessageCursors", "Failed to deserialize RichText message content.");
                            }
                            bmxv a = bccr.m88800a(b2);
                            if (a.mo66813a()) {
                                p.mo57508a((bcuo) a.mo66814b());
                            } else {
                                p.mo57505a(bcqa.m89618a(bxtx.f164797b));
                            }
                        }
                    } else {
                        p.mo57505a(bcqa.m89618a(bxtx.f164797b));
                    }
                } else {
                    p.mo57505a(bcqa.m89618a(bxtx.f164797b));
                }
                byte[] bArr2 = (byte[]) hashMap.get("metadata");
                if (bArr2 != null) {
                    bnha bnha = new bnha();
                    for (Map.Entry entry : bbqu.m88425c(bArr2).entrySet()) {
                        bnha.mo67695b((String) entry.getKey(), bxtx.m123261a((byte[]) entry.getValue()));
                    }
                    p.mo57514a(bnha.mo67618b());
                }
                byte[] bArr3 = (byte[]) hashMap.get("fallback");
                if (bArr3 != null) {
                    p.mo57513a(new String(bArr3));
                }
                byte[] bArr4 = (byte[]) hashMap.get("snippet");
                if (bArr4 != null) {
                    p.mo57521d(new String(bArr4));
                }
                int i2 = cursor.getInt(bcdw.m88854a(11));
                bctq bctq2 = bctq.f104880a;
                int ordinal = bctq.m89952a(i2).ordinal();
                if (ordinal == 0) {
                    p.mo57507a(bcqb.f104671a);
                } else if (ordinal == 1) {
                    p.mo57507a(bcqe.f104674a);
                } else if (ordinal == 2) {
                    HashMap b3 = bbqu.m88424b((byte[]) hashMap.get("overlay_header"));
                    bctm h = bctn.m89940h();
                    h.mo57532c(((Integer) b3.get("time_to_live_sec")).intValue());
                    h.mo57531b(((Integer) b3.get("OVERLAY_STYLE")).intValue());
                    if (b3.containsKey("display_icon")) {
                        h.mo57529a(bxtx.m123261a((byte[]) b3.get("display_icon")));
                    }
                    if (b3.containsKey("display_text")) {
                        h.mo57530a((String) b3.get("display_text"));
                    }
                    if (b3.containsKey("dismiss_action")) {
                        bmxv a2 = bbot.m88295a(bbqu.m88420a(b3.get("dismiss_action")), bcce.f103950a);
                        bcoo j = bcov.m89535j();
                        j.mo57094c();
                        h.mo57527a((bcov) a2.mo66812a(j.mo57085a()));
                    }
                    if (b3.containsKey("overlay_expire_time")) {
                        h.mo57526a(bqcn.m112579a((byte[]) b3.get("overlay_expire_time")));
                    }
                    if (b3.containsKey("overlay_lighter_icon")) {
                        bmxv = bccb.m88792a(bbqu.m88424b((byte[]) b3.get("overlay_lighter_icon")));
                    } else {
                        bmxv = bmvz.f131120a;
                    }
                    if (bmxv.mo66813a()) {
                        h.mo57528a((bcsz) bmxv.mo66814b());
                    } else {
                        h.mo57528a(bcsz.m89873h());
                    }
                    p.mo57507a(bcqg.m89626a(h.mo57525a()));
                } else if (ordinal == 3) {
                    p.mo57507a(bcqc.f104672a);
                }
                p.mo57510a(bcbv.m88775a(length, cursor));
                return p.mo57502a();
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException | ClassNotFoundException e) {
            bbos.m88292b("MessageCursors", "Error loading message profile.", e);
            hashMap = new HashMap();
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }

    /* renamed from: b */
    public static bngx m88797b(ConversationId conversationId, Cursor cursor) {
        bngs j = bngx.m109377j();
        if (!cursor.moveToFirst()) {
            return j.mo67664a();
        }
        do {
            try {
                j.mo67668c(bcbp.m88770a(m88795a(conversationId, cursor)));
            } catch (Exception e) {
                bcnr q = bcns.m89409q();
                q.mo57011b(10032);
                q.mo57008a(conversationId);
                j.mo67668c(bcbp.m88769a(q.mo57002a()));
            }
        } while (cursor.moveToNext());
        return j.mo67664a();
    }

    /* renamed from: a */
    public static HashMap m88796a(bctr bctr) {
        byte[] bArr;
        HashMap hashMap = new HashMap();
        int a = bctr.mo57365f().mo57180a();
        int i = a - 1;
        if (a != 0) {
            hashMap.put("content_type", bqcn.m112583a(i));
            bctq bctq = bctq.f104880a;
            int a2 = bctr.mo57365f().mo57180a();
            int i2 = a2 - 1;
            if (a2 != 0) {
                if (i2 == 0) {
                    hashMap.put("message_content", bctr.mo57365f().mo57196e().mo73780k());
                } else if (i2 == 1) {
                    hashMap.put("message_content", bbou.m88298a(bctr.mo57365f().mo57192d()));
                } else if (i2 == 2) {
                    hashMap.put("message_content", bctr.mo57365f().mo57184b().mo57380b());
                    hashMap.put("custom_message_content_type", bbou.m88298a(bctr.mo57365f().mo57184b().mo57379a()));
                } else if (i2 == 3) {
                    hashMap.put("message_content", bbqu.m88422a((Serializable) bccr.m88801a(bctr.mo57365f().mo57188c())));
                }
                if (!bctr.mo57369i().isEmpty()) {
                    HashMap b = bnmt.m109803b(bctr.mo57369i());
                    try {
                        HashMap hashMap2 = new HashMap();
                        for (Map.Entry entry : b.entrySet()) {
                            hashMap2.put((String) entry.getKey(), ((bxtx) entry.getValue()).mo73780k());
                        }
                        bArr = bbqu.m88422a((Serializable) hashMap2);
                    } catch (IOException e) {
                        bbos.m88292b("MessageCursors", "Failed to serialize message metadata.", e);
                        bArr = new byte[0];
                    }
                    hashMap.put("metadata", bArr);
                }
                bmxv e2 = bctr.mo57363e();
                if (e2.mo66813a()) {
                    hashMap.put("fallback", bbou.m88298a((String) e2.mo66814b()));
                }
                bmxv h = bctr.mo57367h();
                if (h.mo66813a()) {
                    hashMap.put("snippet", bbou.m88298a((String) h.mo66814b()));
                }
                bcto k = bctr.mo57371k();
                if (k.mo57200a().ordinal() == 2) {
                    bctn b2 = k.mo57207b();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("time_to_live_sec", Integer.valueOf(b2.mo57388e()));
                    hashMap3.put("OVERLAY_STYLE", Integer.valueOf(b2.mo57391g()));
                    if (b2.mo57384a().mo66813a()) {
                        hashMap3.put("dismiss_action", bcbk.m88754a((bcov) b2.mo57384a().mo66814b()));
                    }
                    if (b2.mo57385b().mo66813a()) {
                        hashMap3.put("display_icon", ((bxtx) b2.mo57385b().mo66814b()).mo73780k());
                    }
                    if (b2.mo57387d().mo66813a()) {
                        hashMap3.put("display_text", b2.mo57387d().mo66814b());
                    }
                    if (b2.mo57386c().mo66813a()) {
                        hashMap3.put("overlay_lighter_icon", bbqu.m88422a((Serializable) bccb.m88793a((bcsz) b2.mo57386c().mo66814b())));
                    }
                    if (b2.mo57390f().mo66813a()) {
                        hashMap3.put("overlay_expire_time", bqcn.m112583a(((Integer) b2.mo57390f().mo66814b()).intValue()));
                    }
                    hashMap.put("overlay_header", bbqu.m88422a((Serializable) hashMap3));
                }
                hashMap.put("intended_rendering_type", bqcn.m112583a(bctr.mo57372l()));
                return hashMap;
            }
            throw null;
        }
        throw null;
    }
}

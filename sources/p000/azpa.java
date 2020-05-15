package p000;

import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: azpa */
final /* synthetic */ class azpa implements bmxj {

    /* renamed from: a */
    static final bmxj f99805a = new azpa();

    private azpa() {
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0194 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0184 A[Catch:{ JSONException -> 0x0285 }] */
    public final Object apply(Object obj) {
        String str;
        char c;
        bmxv bmxv;
        bmxv bmxv2;
        String str2 = "Message";
        JSONObject jSONObject = (JSONObject) obj;
        try {
            bcte p = bctr.m89953p();
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                Iterator<String> it = keys;
                HashMap hashMap2 = hashMap;
                String str3 = str2;
                switch (next.hashCode()) {
                    case -1852633547:
                        if (next.equals("SENDER")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1343652611:
                        if (next.equals("SNIPPET")) {
                            c = 8;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1205599117:
                        if (next.equals("MESSAGE_ID")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -298577640:
                        if (next.equals("CAPABILITY")) {
                            c = 9;
                            break;
                        }
                        c = 65535;
                        break;
                    case 697939543:
                        if (next.equals("CONVERSATION_ID")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 802036737:
                        if (next.equals("MESSAGE_CONTENT")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1060768914:
                        if (next.equals("MESSAGE_TYPE")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1135343107:
                        if (next.equals("SERVER_TIMESTAMP_US")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1458000714:
                        if (next.equals("MESSAGE_STATUS")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1543870178:
                        try {
                            if (next.equals("FALLBACK")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        } catch (JSONException e) {
                            str = str3;
                            bbos.m88294d(str, "failed to convert JSONObject to Message");
                            return bmvz.f131120a;
                        }
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        p.mo57520c(jSONObject.getString("MESSAGE_ID"));
                        str2 = str3;
                        keys = it;
                        hashMap = hashMap2;
                        break;
                    case 1:
                        p.f104841a = bctl.m89930a(jSONObject.getInt("MESSAGE_TYPE"));
                        str2 = str3;
                        keys = it;
                        hashMap = hashMap2;
                        break;
                    case 2:
                        String str4 = str3;
                        bmxv a = ContactId.m94828a(jSONObject.getJSONObject("SENDER"));
                        if (a.mo66813a()) {
                            p.mo57510a((ContactId) a.mo66814b());
                            str2 = str4;
                            keys = it;
                            hashMap = hashMap2;
                            break;
                        } else {
                            return bmxv.m108566b(p.mo57502a());
                        }
                    case 3:
                        String str5 = str3;
                        bmxv a2 = ConversationId.m94838a(jSONObject.getJSONObject("CONVERSATION_ID"));
                        if (a2.mo66813a()) {
                            p.mo57511a((ConversationId) a2.mo66814b());
                            str2 = str5;
                            keys = it;
                            hashMap = hashMap2;
                            break;
                        } else {
                            return bmxv.m108566b(p.mo57502a());
                        }
                    case 4:
                        p.mo57512a(Long.valueOf(jSONObject.getLong("SERVER_TIMESTAMP_US")));
                        str2 = str3;
                        keys = it;
                        hashMap = hashMap2;
                        break;
                    case 5:
                        p.mo57513a(jSONObject.getString("FALLBACK"));
                        str2 = str3;
                        keys = it;
                        hashMap = hashMap2;
                        break;
                    case 6:
                        JSONObject jSONObject2 = jSONObject.getJSONObject("MESSAGE_CONTENT");
                        try {
                            bctq bctq = bctq.f104880a;
                            int b = bctf.m89916b(jSONObject2.getInt("TYPE")) - 1;
                            if (b == 1) {
                                str = str3;
                                bmxv = bmxv.m108566b(bcqa.m89619a(jSONObject2.getString("TEXT")));
                            } else if (b == 2) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("CUSTOM");
                                try {
                                    bctg c2 = bcth.m89920c();
                                    c2.mo57523a(jSONObject3.getString("TYPE"));
                                    c2.mo57524a(Base64.decode(jSONObject3.getString("CONTENT"), 0));
                                    bmxv2 = bmxv.m108566b(c2.mo57522a());
                                    str = str3;
                                } catch (JSONException e2) {
                                    str = str3;
                                    try {
                                        bbos.m88294d(str, "failed to convert JSONObject to CustomMessage");
                                        bmxv2 = bmvz.f131120a;
                                    } catch (JSONException e3) {
                                        bbos.m88294d(str, "failed to convert JSONObject to MessageContent");
                                        bmxv = bmvz.f131120a;
                                        if (bmxv.mo66813a()) {
                                        }
                                    }
                                }
                                bmxv = bmxv2.mo66813a() ? bmxv.m108566b(bcqa.m89616a((bcth) bmxv2.mo66814b())) : bmvz.f131120a;
                            } else if (b != 3) {
                                bmxv = bmxv.m108566b(bcqa.m89618a(bxtx.f164797b));
                                str = str3;
                            } else {
                                bmxv = bmvz.f131120a;
                                str = str3;
                            }
                        } catch (JSONException e4) {
                            str = str3;
                            bbos.m88294d(str, "failed to convert JSONObject to MessageContent");
                            bmxv = bmvz.f131120a;
                            if (bmxv.mo66813a()) {
                            }
                        }
                        if (bmxv.mo66813a()) {
                            p.mo57505a((bcti) bmxv.mo66814b());
                            str2 = str;
                            keys = it;
                            hashMap = hashMap2;
                            break;
                        } else {
                            return bmxv.m108566b(p.mo57502a());
                        }
                    case 7:
                        p.mo57506a(bctk.m89929a(jSONObject.getInt("MESSAGE_STATUS")));
                        keys = it;
                        hashMap = hashMap2;
                        str2 = str3;
                        break;
                    case 8:
                        p.mo57521d(jSONObject.getString("SNIPPET"));
                        keys = it;
                        hashMap = hashMap2;
                        str2 = str3;
                        break;
                    case 9:
                        p.mo57503a(jSONObject.getInt("CAPABILITY"));
                        keys = it;
                        hashMap = hashMap2;
                        str2 = str3;
                        break;
                    default:
                        str = str3;
                        try {
                            bxvd da = bxte.f164763c.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            "type.googleapis.com/google.protobuf.StringValue".getClass();
                            ((bxte) da.f164949b).f164765a = "type.googleapis.com/google.protobuf.StringValue";
                            bxtx aL = bxye.m124404a(jSONObject.getString(next)).mo73639aL();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aL.getClass();
                            ((bxte) da.f164949b).f164766b = aL;
                            hashMap = hashMap2;
                            hashMap.put(next, ((bxte) da.mo74062i()).mo73639aL());
                            str2 = str;
                            keys = it;
                            break;
                        } catch (JSONException e5) {
                            break;
                        }
                }
            }
            p.mo57514a(hashMap);
            return bmxv.m108566b(p.mo57502a());
        } catch (JSONException e6) {
            str = str2;
            bbos.m88294d(str, "failed to convert JSONObject to Message");
            return bmvz.f131120a;
        }
    }
}

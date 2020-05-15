package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.felicanetworks.sdu.ErrorInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwh implements bcle {
    /* renamed from: a */
    public final bcti mo56967a(bcoh bcoh, cbff cbff) {
        cbfh cbfh;
        cbfh cbfh2;
        cbfh cbfh3;
        cbfh cbfh4;
        cbfh cbfh5;
        cbfh cbfh6;
        cbfh cbfh7;
        cbei a = cbei.m127772a(cbff.f176905l);
        if (a == null) {
            a = cbei.UNRECOGNIZED;
        }
        if (a.equals(cbei.PHOTO)) {
            if (cbff.f176896c == 103) {
                cbfh = (cbfh) cbff.f176897d;
            } else {
                cbfh = cbfh.f176916d;
            }
            cbey cbey = cbfh.f176918a;
            if (cbey == null) {
                cbey = cbey.f176867f;
            }
            if (cbey.f176870b.equalsIgnoreCase("image/jpeg")) {
                if (cbff.f176896c == 103) {
                    cbfh2 = (cbfh) cbff.f176897d;
                } else {
                    cbfh2 = cbfh.f176916d;
                }
                cbey cbey2 = cbfh2.f176918a;
                if (cbey2 == null) {
                    cbey2 = cbey.f176867f;
                }
                byte[] k = cbey2.f176871c.getKey();
                bcwq i = bcwr.m90183i();
                i.mo57639a(k);
                i.mo57638a(0);
                i.f105080b = null;
                if (cbff.f176896c == 103) {
                    cbfh3 = (cbfh) cbff.f176897d;
                } else {
                    cbfh3 = cbfh.f176916d;
                }
                i.mo57642d(cbfh3.f176919b);
                if (cbff.f176896c == 103) {
                    cbfh4 = (cbfh) cbff.f176897d;
                } else {
                    cbfh4 = cbfh.f176916d;
                }
                i.mo57640b(cbfh4.f176920c);
                if (cbff.f176896c == 103) {
                    cbfh5 = (cbfh) cbff.f176897d;
                } else {
                    cbfh5 = cbfh.f176916d;
                }
                cbey cbey3 = cbfh5.f176918a;
                if (cbey3 == null) {
                    cbey3 = cbey.f176867f;
                }
                i.mo57641c(cbey3.f176873e);
                bcwo c = bcwp.m90173c();
                if (cbff.f176896c == 103) {
                    cbfh6 = (cbfh) cbff.f176897d;
                } else {
                    cbfh6 = cbfh.f176916d;
                }
                cbey cbey4 = cbfh6.f176918a;
                if (cbey4 == null) {
                    cbey4 = cbey.f176867f;
                }
                cbmf cbmf = cbey4.f176869a;
                if (cbmf == null) {
                    cbmf = cbmf.f177611d;
                }
                c.mo57635a(cbmf.f177613a);
                if (cbff.f176896c == 103) {
                    cbfh7 = (cbfh) cbff.f176897d;
                } else {
                    cbfh7 = cbfh.f176916d;
                }
                cbey cbey5 = cbfh7.f176918a;
                if (cbey5 == null) {
                    cbey5 = cbey.f176867f;
                }
                cbmf cbmf2 = cbey5.f176869a;
                if (cbmf2 == null) {
                    cbmf2 = cbmf.f177611d;
                }
                bxvl bxvl = cbmf2.f177615c;
                if (bxvl == null) {
                    bxvl = bxvl.f164962b;
                }
                c.mo57634a(bxvl.f164964a);
                i.f105079a = c.mo57633a();
                bmxv a2 = bcva.m90100a(i.mo57637a());
                if (a2.mo66813a()) {
                    bctg c2 = bcth.m89920c();
                    c2.mo57523a("photos");
                    c2.mo57524a((byte[]) a2.mo66814b());
                    return bcqa.m89616a(c2.mo57522a());
                }
                bbos.m88294d("PhotoMsgConverter", "Failed to serialize photo message");
                return bcqa.m89618a(ByteString.f164797b);
            }
            bbos.m88294d("PhotoMsgConverter", "Attempted to convert non-jpeg Photo message");
            return bcqa.m89618a(ByteString.f164797b);
        }
        bbos.m88294d("PhotoMsgConverter", "Attempted to convert non-photo LighterMessage");
        return bcqa.m89618a(ByteString.f164797b);
    }

    /* renamed from: a */
    public final bmxv mo56968a(bcth bcth) {
        bmxv bmxv;
        bbos.m88289a("PhotoMsgConverter", "encode photo custom message");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("TYPE", bcth.mo57379a());
            bmxv a = bcva.m90101a(bcth.mo57380b());
            if (a.mo66813a()) {
                bcwr bcwr = (bcwr) a.mo66814b();
                bbos.m88289a("PhotoData", "encode photo data");
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (bcwr.mo57622a() != null && bcwr.mo57622a().mo57636d().mo66813a()) {
                        jSONObject2.put("MEDIA_ID", bcwr.mo57622a().mo57636d().mo66814b());
                    }
                    if (bcwr.mo57623b() != null) {
                        jSONObject2.put("LOCAL_URI", bcwr.mo57623b());
                    }
                    jSONObject2.put("WIDTH", bcwr.mo57625d());
                    jSONObject2.put("HEIGHT", bcwr.mo57626e());
                    jSONObject2.put("SIZE", bcwr.mo57628f());
                    jSONObject2.put("DOWNLOAD_STATUS", bcwr.mo57629g());
                    if (bcwr.mo57624c().mo66813a()) {
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray((byte[]) bcwr.mo57624c().mo66814b(), 0, ((byte[]) bcwr.mo57624c().mo66814b()).length);
                        jSONObject2.put("THUMBNAIL_HEIGHT", decodeByteArray.getHeight());
                        jSONObject2.put("THUMBNAIL_WIDTH", decodeByteArray.getWidth());
                        jSONObject2.put("THUMBNAIL", Base64.encodeToString((byte[]) bcwr.mo57624c().mo66814b(), 2));
                    }
                    bbos.m88289a("PhotoData", "return photoData JSON Optional back");
                    bmxv = bmxv.m108566b(jSONObject2);
                } catch (JSONException e) {
                    bbos.m88292b("PhotoData", "failed to convert photoData to JSON Object", e);
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    jSONObject.put("CONTENT", bmxv.mo66814b());
                    bbos.m88289a("PhotoMsgConverter", "return photo custom message json optional back");
                    return bmxv.m108566b(jSONObject);
                }
                bbos.m88294d("PhotoMsgConverter", "failed to convert CustomMessage to JSONObject without photoDataJson");
                return bmvz.f131120a;
            }
            bbos.m88294d("PhotoMsgConverter", "failed to convert CustomMessage to JSONObject without photoData");
            return bmvz.f131120a;
        } catch (JSONException e2) {
            bbos.m88294d("PhotoMsgConverter", "failed to convert CustomMessage to JSONObject");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final bmxv mo56969a(JSONObject jSONObject) {
        bmxv bmxv;
        try {
            bctg c = bcth.m89920c();
            c.mo57523a(jSONObject.getString("TYPE"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("CONTENT");
            try {
                bcwq i = bcwr.m90183i();
                i.mo57642d(((Integer) jSONObject2.get("WIDTH")).intValue());
                i.mo57640b(((Integer) jSONObject2.get("HEIGHT")).intValue());
                i.mo57641c(((Integer) jSONObject2.get("SIZE")).intValue());
                i.mo57638a(((Integer) jSONObject2.get("DOWNLOAD_STATUS")).intValue());
                if (jSONObject2.has("THUMBNAIL")) {
                    i.mo57639a(Base64.decode(jSONObject2.getString("THUMBNAIL"), 2));
                }
                if (jSONObject2.has("MEDIA_ID")) {
                    bmxv a = bcwp.m90172a((JSONObject) jSONObject2.get("MEDIA_ID"));
                    if (a.mo66813a()) {
                        i.f105079a = (bcwp) a.mo66814b();
                    }
                }
                if (jSONObject2.has("LOCAL_URI")) {
                    i.f105080b = (String) jSONObject2.get("LOCAL_URI");
                }
                bmxv = bmxv.m108566b(i.mo57637a());
            } catch (Exception e) {
                bbos.m88292b("PhotoData", "failed to convert JSON Object to PhotoData", e);
                bmxv = bmvz.f131120a;
            }
            if (bmxv.mo66813a()) {
                bmxv a2 = bcva.m90100a((bcwr) bmxv.mo66814b());
                if (a2.mo66813a()) {
                    c.mo57524a((byte[]) a2.mo66814b());
                    return bmxv.m108566b(c.mo57522a());
                }
                bbos.m88294d("PhotoMsgConverter", "failed to convert JSONObject to CustomMessage without photoData in byte array");
                return bmvz.f131120a;
            }
            bbos.m88294d("PhotoMsgConverter", "failed to convert JSONObject to CustomMessage without photoData");
            return bmvz.f131120a;
        } catch (JSONException e2) {
            bbos.m88294d("PhotoMsgConverter", "failed to convert JSONObject to CustomMessage");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final bxvd mo56970a(bctr bctr) {
        byte[] bArr;
        bmxv a = bcva.m90099a(bctr);
        if (!a.mo66813a()) {
            bbos.m88294d("PhotoMsgConverter", "Attempted to convert non-photo Message");
            bxvd da = cbff.f176892t.mo74144da();
            cbei cbei = cbei.UNKNOWN;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbff) da.f164949b).f176905l = cbei.mo3214a();
            return da;
        }
        bcwr bcwr = (bcwr) a.mo66814b();
        if (bcwr.mo57624c().mo66813a()) {
            bArr = (byte[]) bcwr.mo57624c().mo66814b();
        } else {
            bArr = null;
        }
        bxvd da2 = cbff.f176892t.mo74144da();
        cbei cbei2 = cbei.PHOTO;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbff) da2.f164949b).f176905l = cbei2.mo3214a();
        bxvd da3 = cbfh.f176916d.mo74144da();
        bxvd da4 = cbey.f176867f.mo74144da();
        bxvd da5 = cbmf.f177611d.mo74144da();
        String a2 = bcwr.mo57622a().mo57617a();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        a2.getClass();
        ((cbmf) da5.f164949b).f177613a = a2;
        bxvl a3 = bxvl.m124044a(bcwr.mo57622a().mo57618b());
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        cbmf cbmf = (cbmf) da5.f164949b;
        a3.getClass();
        cbmf.f177615c = a3;
        cbmf.f177614b = cipi.m150693a(12);
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cbmf cbmf2 = (cbmf) da5.mo74062i();
        cbmf2.getClass();
        ((cbey) da4.f164949b).f176869a = cbmf2;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        "image/jpeg".getClass();
        ((cbey) da4.f164949b).f176870b = "image/jpeg";
        ByteString a4 = ByteString.m123261a(bArr);
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cbey cbey = (cbey) da4.f164949b;
        a4.getClass();
        cbey.f176871c = a4;
        "image/jpeg".getClass();
        cbey.f176872d = "image/jpeg";
        int f = bcwr.mo57628f();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        ((cbey) da4.f164949b).f176873e = f;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        cbey cbey2 = (cbey) da4.mo74062i();
        cbey2.getClass();
        ((cbfh) da3.f164949b).f176918a = cbey2;
        int d = bcwr.mo57625d();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((cbfh) da3.f164949b).f176919b = d;
        int e = bcwr.mo57626e();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((cbfh) da3.f164949b).f176920c = e;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbff cbff = (cbff) da2.f164949b;
        cbfh cbfh = (cbfh) da3.mo74062i();
        cbfh.getClass();
        cbff.f176897d = cbfh;
        cbff.f176896c = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
        return da2;
    }
}

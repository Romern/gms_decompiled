package p000;

import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: xyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xyb implements xhm {

    /* renamed from: a */
    private final String f53359a;

    /* renamed from: b */
    private final String f53360b;

    /* renamed from: c */
    private final String f53361c;

    /* renamed from: d */
    private final ChannelIdValue f53362d;

    public xyb(String str, String str2, String str3, ChannelIdValue channelIdValue) {
        sdo.m34959a((Object) str);
        this.f53359a = str;
        sdo.m34959a((Object) str2);
        this.f53360b = str2;
        sdo.m34959a((Object) str3);
        this.f53361c = str3;
        sdo.m34959a(channelIdValue);
        this.f53362d = channelIdValue;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xyb) {
            xyb xyb = (xyb) obj;
            return this.f53359a.equals(xyb.f53359a) && this.f53360b.equals(xyb.f53360b) && this.f53361c.equals(xyb.f53361c) && this.f53362d.equals(xyb.f53362d);
        }
    }

    public final int hashCode() {
        return ((((((this.f53359a.hashCode() + 31) * 31) + this.f53360b.hashCode()) * 31) + this.f53361c.hashCode()) * 31) + this.f53362d.hashCode();
    }

    /* renamed from: b */
    public final String mo30248b() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("typ", this.f53359a);
            jSONObject2.put("challenge", this.f53360b);
            jSONObject2.put("origin", this.f53361c);
            ChannelIdValue.ChannelIdValueType channelIdValueType = ChannelIdValue.ChannelIdValueType.ABSENT;
            int ordinal = this.f53362d.f31892b.ordinal();
            if (ordinal == 1) {
                jSONObject2.put("cid_pubkey", this.f53362d.f31893c);
            } else if (ordinal == 2) {
                String str = this.f53362d.f31894d;
                if (str != null) {
                    jSONObject = new JSONObject(str);
                } else {
                    jSONObject = null;
                }
                jSONObject2.put("cid_pubkey", jSONObject);
            }
            return jSONObject2.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}

package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.security.InvalidParameterException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ConversationId implements Parcelable, Serializable {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class GroupId implements Parcelable, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        public static bmxv m94846a(JSONObject jSONObject) {
            try {
                bcsr c = m94847c();
                c.mo57478b(jSONObject.getString("ID"));
                c.mo57477a(jSONObject.getString("APP_NAME"));
                return bmxv.m108566b(c.mo57476a());
            } catch (JSONException e) {
                bbos.m88294d("ConversationId", "failed to convert JSONObject to GroupId");
                return bmvz.f131120a;
            }
        }

        /* renamed from: c */
        public static bcsr m94847c() {
            return new bcsr();
        }

        /* renamed from: a */
        public abstract String mo60503a();

        /* renamed from: b */
        public abstract String mo60504b();

        /* renamed from: d */
        public final bmxv mo60560d() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ID", mo60503a());
                jSONObject.put("APP_NAME", mo60504b());
                return bmxv.m108566b(jSONObject);
            } catch (JSONException e) {
                bbos.m88294d("ConversationId", "failed to convert GroupId to JSONObject");
                return bmvz.f131120a;
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum IdType implements Parcelable {
        ONE_TO_ONE(0),
        GROUP(1);
        
        public static final Parcelable.Creator CREATOR = new bcst();

        /* renamed from: c */
        public final int f111369c;

        private IdType(int i) {
            this.f111369c = i;
        }

        /* renamed from: a */
        public static IdType m94851a(int i) {
            IdType idType = (IdType) bnfi.m109237a(values()).mo67507c(new bcss(i)).mo66815c();
            if (idType != null) {
                return idType;
            }
            throw new InvalidParameterException("Invalid conversation IdType.");
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f111369c);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class OneOfId implements Parcelable, Serializable {
        public static final Parcelable.Creator CREATOR = new bcsu();
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        public abstract GroupId mo60527a();

        /* renamed from: b */
        public abstract IdType mo60528b();

        /* renamed from: c */
        public abstract ContactId mo60532c();

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(mo60528b(), i);
            IdType idType = IdType.ONE_TO_ONE;
            int ordinal = mo60528b().ordinal();
            if (ordinal == 0) {
                parcel.writeParcelable(mo60532c(), i);
            } else if (ordinal == 1) {
                parcel.writeParcelable(mo60527a(), i);
            }
        }
    }

    /* renamed from: a */
    public static bmxv m94838a(JSONObject jSONObject) {
        try {
            bcsq f = m94839f();
            bmxv a = ContactId.m94828a(jSONObject.getJSONObject("OWNER"));
            if (!a.mo66813a()) {
                return bmvz.f131120a;
            }
            f.mo57473a((ContactId) a.mo66814b());
            IdType idType = IdType.ONE_TO_ONE;
            int ordinal = IdType.m94851a(jSONObject.getInt("TYPE")).ordinal();
            if (ordinal == 0) {
                bmxv a2 = ContactId.m94828a(jSONObject.getJSONObject("OTHER_PARTICIPANT"));
                if (!a2.mo66813a()) {
                    return bmvz.f131120a;
                }
                f.mo57475b((ContactId) a2.mo66814b());
            } else if (ordinal == 1) {
                bmxv a3 = GroupId.m94846a(jSONObject.getJSONObject("GROUP"));
                if (!a3.mo66813a()) {
                    return bmvz.f131120a;
                }
                f.mo57474a((GroupId) a3.mo66814b());
            }
            return bmxv.m108566b(f.mo57472a());
        } catch (JSONException e) {
            bbos.m88294d("ConversationId", "failed to convert JSONObject to ConversationId");
            return bmvz.f131120a;
        }
    }

    /* renamed from: f */
    public static bcsq m94839f() {
        return new bcsq();
    }

    /* renamed from: a */
    public abstract ContactId mo60498a();

    /* renamed from: b */
    public abstract OneOfId mo60499b();

    /* renamed from: c */
    public final IdType mo60556c() {
        return mo60499b().mo60528b();
    }

    /* renamed from: d */
    public final GroupId mo60557d() {
        return mo60499b().mo60527a();
    }

    /* renamed from: e */
    public final ContactId mo60558e() {
        return mo60499b().mo60532c();
    }

    /* renamed from: g */
    public final bmxv mo60559g() {
        try {
            JSONObject jSONObject = new JSONObject();
            bmxv g = mo60498a().mo60552g();
            if (!g.mo66813a()) {
                return bmvz.f131120a;
            }
            jSONObject.put("OWNER", g.mo66814b());
            jSONObject.put("TYPE", mo60556c().f111369c);
            IdType idType = IdType.ONE_TO_ONE;
            int ordinal = mo60556c().ordinal();
            if (ordinal == 0) {
                bmxv g2 = mo60558e().mo60552g();
                if (!g2.mo66813a()) {
                    return bmvz.f131120a;
                }
                jSONObject.put("OTHER_PARTICIPANT", g2.mo66814b());
            } else if (ordinal == 1) {
                bmxv d = mo60557d().mo60560d();
                if (!d.mo66813a()) {
                    return bmvz.f131120a;
                }
                jSONObject.put("GROUP", d.mo66814b());
            }
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e) {
            bbos.m88294d("ConversationId", "failed to convert ConversationId to JSONObject");
            return bmvz.f131120a;
        }
    }
}

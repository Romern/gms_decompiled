package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ContactId implements Parcelable, Serializable {

    /* renamed from: a */
    private ContactId f111358a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum ContactType implements Parcelable {
        UNKNOWN(0),
        PHONE_NUMBER(1),
        EMAIL(2),
        HANDLER(3),
        DEVICE_ID(5);
        
        public static final Parcelable.Creator CREATOR = new bcsm();

        /* renamed from: f */
        public final int f111365f;

        private ContactType(int i) {
            this.f111365f = i;
        }

        /* renamed from: a */
        public static ContactType m94837a(int i) {
            return (ContactType) bnfi.m109237a(values()).mo67507c(new bcsl(i)).mo66812a(UNKNOWN);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f111365f);
        }
    }

    /* renamed from: a */
    public static bmxv m94828a(JSONObject jSONObject) {
        try {
            bcsk f = m94830f();
            f.mo57453b(jSONObject.getString("ID"));
            f.mo57454c(jSONObject.getString("TACHYON_APP_NAME"));
            f.mo57451a(ContactType.m94837a(jSONObject.getInt("TYPE")));
            if (jSONObject.has("HANDLER_ID")) {
                f.mo57452a(jSONObject.getString("HANDLER_ID"));
            }
            return bmxv.m108566b(f.mo57450a());
        } catch (JSONException e) {
            bbos.m88294d("ContactId", "failed to convert JSONObject to ContactId");
            return bmvz.f131120a;
        }
    }

    /* renamed from: f */
    public static bcsk m94830f() {
        return new bcsk((byte[]) null);
    }

    /* renamed from: a */
    public abstract String mo60492a();

    /* renamed from: b */
    public abstract String mo60493b();

    /* renamed from: c */
    public abstract ContactType mo60494c();

    /* renamed from: d */
    public abstract bmxv mo60495d();

    /* renamed from: e */
    public abstract bcsk mo60496e();

    public final boolean equals(Object obj) {
        if (obj instanceof ContactId) {
            ContactId contactId = (ContactId) obj;
            if (this.f111358a == null) {
                this.f111358a = m94829a(this);
            }
            if (contactId.f111358a == null) {
                contactId.f111358a = m94829a(contactId);
            }
            if (!this.f111358a.mo60492a().equals(contactId.f111358a.mo60492a()) || !this.f111358a.mo60493b().equals(contactId.f111358a.mo60493b()) || !this.f111358a.mo60494c().equals(contactId.f111358a.mo60494c()) || !this.f111358a.mo60495d().equals(contactId.f111358a.mo60495d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final bmxv mo60552g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ID", mo60492a());
            jSONObject.put("TACHYON_APP_NAME", mo60493b());
            jSONObject.put("TYPE", mo60494c().f111365f);
            bmxv d = mo60495d();
            if (d.mo66813a()) {
                jSONObject.put("HANDLER_ID", d.mo66814b());
            }
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e) {
            bbos.m88294d("ContactId", "failed to convert ContactId to JSONObject");
            return bmvz.f131120a;
        }
    }

    public final int hashCode() {
        if (this.f111358a == null) {
            this.f111358a = m94829a(this);
        }
        return ((((((this.f111358a.mo60492a().hashCode() + 527) * 31) + this.f111358a.mo60493b().hashCode()) * 31) + this.f111358a.mo60494c().hashCode()) * 31) + this.f111358a.mo60495d().hashCode();
    }

    /* renamed from: a */
    private static ContactId m94829a(ContactId contactId) {
        if (contactId.mo60494c() != ContactType.EMAIL) {
            return contactId;
        }
        bcsk e = contactId.mo60496e();
        e.mo57453b(bboo.m88285a(contactId.mo60492a()));
        return e.mo57450a();
    }
}

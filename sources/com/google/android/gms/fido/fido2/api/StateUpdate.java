package com.google.android.gms.fido.fido2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xor();
    @Deprecated

    /* renamed from: a */
    public static final StateUpdate f31690a = new StateUpdate(Type.CANCEL);

    /* renamed from: b */
    public static final StateUpdate f31691b = new StateUpdate(Type.PAUSE);

    /* renamed from: c */
    public static final StateUpdate f31692c = new StateUpdate(Type.RESUME);

    /* renamed from: d */
    public static final StateUpdate f31693d = new StateUpdate(Type.STOP);

    /* renamed from: e */
    public final Type f31694e;

    /* renamed from: f */
    public final String f31695f;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum Type implements Parcelable {
        CANCEL("cancel"),
        PAUSE("pause"),
        RESUME("resume"),
        STOP("stop"),
        DEVICE_SELECTION("user_selected_device"),
        SELECT_VIEW("user_selected_view"),
        SELECT_TRANSPORT_VIEW("user_selected_view_for_transport"),
        UPDATE_CURRENT_VIEW("update_current_view");
        
        public static final Parcelable.Creator CREATOR = new xop();

        /* renamed from: i */
        public final String f31705i;

        private Type(String str) {
            this.f31705i = str;
        }

        /* renamed from: a */
        public static Type m23442a(String str) {
            Type[] values = values();
            for (Type type : values) {
                if (str.equals(type.f31705i)) {
                    return type;
                }
            }
            throw new xoq(str);
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return this.f31705i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f31705i);
        }
    }

    public StateUpdate(Type type) {
        this(type, (JSONObject) null);
    }

    /* renamed from: a */
    public static StateUpdate m23439a(JSONObject jSONObject) {
        if (jSONObject.has("type")) {
            Type a = Type.m23442a(jSONObject.getString("type"));
            if (a.equals(Type.CANCEL) || a.equals(Type.PAUSE) || a.equals(Type.RESUME) || a.equals(Type.STOP)) {
                return new StateUpdate(a);
            }
            if (jSONObject.has("data")) {
                try {
                    return new StateUpdate(a, jSONObject.getJSONObject("data"));
                } catch (JSONException e) {
                    throw new JSONException("malformed required field \"data\"");
                }
            } else {
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Missing required field \"data\" for \"type\"");
                sb.append(valueOf);
                throw new JSONException(sb.toString());
            }
        } else {
            throw new JSONException("Missing required field \"type\"");
        }
    }

    /* renamed from: b */
    public final JSONObject mo18645b() {
        String str = this.f31695f;
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StateUpdate) {
            StateUpdate stateUpdate = (StateUpdate) obj;
            if (!sdg.m34949a(this.f31694e, stateUpdate.f31694e) || !sdg.m34949a(this.f31695f, stateUpdate.f31695f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Type type = this.f31694e;
        Type type2 = Type.CANCEL;
        return Arrays.hashCode(new Object[]{type.f31705i, this.f31695f});
    }

    public StateUpdate(Type type, JSONObject jSONObject) {
        sdo.m34959a(type);
        this.f31694e = type;
        if (jSONObject == null) {
            boolean z = true;
            if (!type.equals(Type.CANCEL) && !type.equals(Type.PAUSE) && !type.equals(Type.RESUME) && !type.equals(Type.STOP)) {
                z = false;
            }
            sdo.m34974b(z);
            this.f31695f = null;
            return;
        }
        this.f31695f = jSONObject.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, mo18644a(), false);
        see.m35046a(parcel, 3, this.f31695f, false);
        see.m35062b(parcel, a);
    }

    public StateUpdate(String str, String str2) {
        sdo.m34959a((Object) str);
        try {
            this.f31694e = Type.m23442a(str);
            this.f31695f = str2;
        } catch (xoq e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final String mo18644a() {
        Type type = this.f31694e;
        Type type2 = Type.CANCEL;
        return type.f31705i;
    }
}

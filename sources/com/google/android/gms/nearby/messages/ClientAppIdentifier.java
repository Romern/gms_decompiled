package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClientAppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aiwk();

    /* renamed from: a */
    public static final ClientAppIdentifier f80666a = m67376a("com.google.android.gms", new ClientAppContext("com.google.android.gms", "0p:com.google.android.gms"));

    /* renamed from: b */
    final int f80667b;

    /* renamed from: c */
    public final ClientAppContext f80668c;

    /* renamed from: d */
    public final String f80669d;

    /* renamed from: e */
    public int f80670e;

    public ClientAppIdentifier(int i, ClientAppContext clientAppContext, String str, int i2) {
        this.f80667b = i;
        this.f80668c = clientAppContext;
        this.f80669d = str;
        this.f80670e = i2;
    }

    /* renamed from: a */
    public static ClientAppIdentifier m67375a(String str) {
        return m67376a(str, new ClientAppContext(str));
    }

    /* renamed from: b */
    public static boolean m67378b(String str) {
        return "com.google.android.gms".equals(str);
    }

    /* renamed from: a */
    public final boolean mo44292a(int i) {
        return (i & this.f80670e) != 0;
    }

    /* renamed from: c */
    public final String mo44294c() {
        if (mo44293b()) {
            return this.f80668c.f80724c;
        }
        return this.f80668c.f80723b;
    }

    /* renamed from: d */
    public final boolean mo44296d() {
        if (mo44293b()) {
            return aixt.m58151a(this.f80668c.f80724c);
        }
        return aixt.m58151a(this.f80669d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClientAppIdentifier) {
            ClientAppIdentifier clientAppIdentifier = (ClientAppIdentifier) obj;
            if (m67377a(this.f80668c.f80723b, clientAppIdentifier.f80668c.f80723b) && m67377a(this.f80668c.f80724c, clientAppIdentifier.f80668c.f80724c)) {
                ClientAppContext clientAppContext = this.f80668c;
                boolean z = clientAppContext.f80725d;
                ClientAppContext clientAppContext2 = clientAppIdentifier.f80668c;
                return z == clientAppContext2.f80725d && clientAppContext.f80726e == clientAppContext2.f80726e;
            }
        }
    }

    public final int hashCode() {
        ClientAppContext clientAppContext = this.f80668c;
        return Arrays.hashCode(new Object[]{clientAppContext.f80723b, clientAppContext.f80724c, Boolean.valueOf(clientAppContext.f80725d), Integer.valueOf(this.f80668c.f80726e)});
    }

    public final String toString() {
        if (!mo44293b()) {
            return this.f80668c.f80723b;
        }
        ClientAppContext clientAppContext = this.f80668c;
        String str = clientAppContext.f80723b;
        String str2 = clientAppContext.f80724c;
        boolean z = clientAppContext.f80725d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        sb.append("#");
        sb.append(z);
        return sb.toString();
    }

    /* renamed from: a */
    public static ClientAppIdentifier m67376a(String str, ClientAppContext clientAppContext) {
        return new ClientAppIdentifier(1, clientAppContext, str, 0);
    }

    /* renamed from: b */
    public final boolean mo44293b() {
        return !TextUtils.isEmpty(this.f80668c.f80724c);
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
        see.m35063b(parcel, 1, this.f80667b);
        see.m35040a(parcel, 2, this.f80668c, i, false);
        see.m35046a(parcel, 3, this.f80669d, false);
        see.m35063b(parcel, 4, this.f80670e);
        see.m35062b(parcel, a);
    }

    /* renamed from: c */
    public final boolean mo44295c(String str) {
        String str2;
        ClientAppContext clientAppContext = this.f80668c;
        if (clientAppContext == null || (str2 = clientAppContext.f80724c) == null) {
            return false;
        }
        return str2.equals(str);
    }

    /* renamed from: a */
    private static boolean m67377a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    public final String mo44291a() {
        return !mo44293b() ? this.f80668c.f80723b : "com.google.android.gms";
    }
}

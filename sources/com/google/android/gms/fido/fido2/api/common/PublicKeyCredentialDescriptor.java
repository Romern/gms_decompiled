package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xqa();

    /* renamed from: c */
    private static bnic f31775c = bnic.m109490a(xqv.f52936a, xqv.f52937b);

    /* renamed from: a */
    public final byte[] f31776a;

    /* renamed from: b */
    public final List f31777b;

    /* renamed from: d */
    private final PublicKeyCredentialType f31778d;

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        sdo.m34959a((Object) str);
        try {
            this.f31778d = PublicKeyCredentialType.m23492a(str);
            this.f31776a = (byte[]) sdo.m34959a(bArr);
            this.f31777b = list;
        } catch (xqg e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static PublicKeyCredentialDescriptor m23481a(bypx bypx) {
        List list;
        try {
            sdo.m34959a(bypx);
            if (bypx instanceof bypu) {
                bnim bnim = ((bypu) bypx).f167361a;
                if (bnim.f131670c.containsAll(f31775c)) {
                    bypx bypx2 = (bypx) bnim.get(xqv.f52936a);
                    sdo.m34959a(bypx2);
                    if (bypx2 instanceof bypp) {
                        byte[] k = ((bypp) bypx2).f167357a.mo73780k();
                        PublicKeyCredentialType a = PublicKeyCredentialType.m23491a((bypx) bnim.get(xqv.f52937b));
                        if (bnim.containsKey(xqv.f52938c)) {
                            list = Transport.m23429a((bypx) bnim.get(xqv.f52938c));
                        } else {
                            list = null;
                        }
                        return new PublicKeyCredentialDescriptor(a.f31794b, k, list);
                    }
                    throw new xpz("Cannot parse credential descriptor that has a non-bytestring CBOR value for id label");
                }
                throw new xpz("Cannot parse credential descriptor from input that does not have both id and type as labels");
            }
            throw new xpz("Cannot parse credential descriptor from non-map CBOR input");
        } catch (xhk | xqg e) {
            throw new xpz("Error parsing field of credential descriptor", e);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj instanceof PublicKeyCredentialDescriptor) {
            PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
            if (this.f31778d.equals(publicKeyCredentialDescriptor.f31778d) && Arrays.equals(this.f31776a, publicKeyCredentialDescriptor.f31776a)) {
                List list2 = this.f31777b;
                if (list2 == null && publicKeyCredentialDescriptor.f31777b == null) {
                    return true;
                }
                if (list2 == null || (list = publicKeyCredentialDescriptor.f31777b) == null || !list2.containsAll(list) || !publicKeyCredentialDescriptor.f31777b.containsAll(this.f31777b)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31778d, Integer.valueOf(Arrays.hashCode(this.f31776a)), this.f31777b});
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f31778d.f31794b, false);
        see.m35052a(parcel, 3, this.f31776a, false);
        see.m35066c(parcel, 4, this.f31777b, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static PublicKeyCredentialDescriptor m23482a(JSONObject jSONObject) {
        List list;
        String string = jSONObject.getString("type");
        byte[] decode = Base64.decode(jSONObject.getString("id"), 11);
        if (jSONObject.has("transports")) {
            list = Transport.m23430a(jSONObject.getJSONArray("transports"));
        } else {
            list = null;
        }
        return new PublicKeyCredentialDescriptor(string, decode, list);
    }

    /* renamed from: a */
    public final bypu mo18717a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bypt(xqv.f52937b, bypx.m125085a(this.f31778d.f31794b)));
        arrayList.add(new bypt(xqv.f52936a, bypx.m125082a(this.f31776a)));
        List list = this.f31777b;
        if (list != null && !list.isEmpty()) {
            bypv bypv = xqv.f52938c;
            sdo.m34959a(this.f31777b);
            ArrayList arrayList2 = new ArrayList();
            List list2 = this.f31777b;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(bypx.m125085a(((Transport) list2.get(i)).f31675g));
            }
            arrayList.add(new bypt(bypv, bypx.m125079a(arrayList2)));
        }
        return bypx.m125086b(arrayList);
    }
}

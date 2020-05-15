package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    CABLE("cable");
    
    public static final Parcelable.Creator CREATOR = new xhj();

    /* renamed from: g */
    public final String f31675g;

    private Transport(String str) {
        this.f31675g = str;
    }

    /* renamed from: a */
    public static Transport m23428a(String str) {
        Transport[] values = values();
        for (Transport transport : values) {
            if (str.equals(transport.f31675g)) {
                return transport;
            }
        }
        throw new xhk(String.format("Transport %s not supported", str));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f31675g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31675g);
    }

    /* renamed from: a */
    public static List m23429a(bypx bypx) {
        sdo.m34959a(bypx);
        if (bypx instanceof bypn) {
            ArrayList arrayList = new ArrayList();
            bnre i = ((bypn) bypx).f167354a.listIterator();
            while (i.hasNext()) {
                bypx bypx2 = (bypx) i.next();
                sdo.m34959a(bypx2);
                if (bypx2 instanceof bypv) {
                    arrayList.add(m23428a(((bypv) bypx2).f167363a));
                } else {
                    throw new xhk("Cannot parse a transport from non-textstring CBOR input");
                }
            }
            return arrayList;
        }
        throw new xhk("Cannot parse a list of transports from non-array CBOR input");
    }

    /* renamed from: a */
    public static List m23430a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(m23428a(string));
                } catch (xhk e) {
                    Log.w("Transport", string.length() == 0 ? new String("Ignoring unrecognized transport ") : "Ignoring unrecognized transport ".concat(string));
                }
            }
        }
        return new ArrayList(hashSet);
    }
}

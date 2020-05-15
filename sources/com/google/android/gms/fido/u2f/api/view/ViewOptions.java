package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ViewOptions extends AbstractSafeParcelable implements xhm {
    public static final Parcelable.Creator CREATOR = new yaw();

    /* renamed from: a */
    private final int f31969a;

    /* renamed from: c */
    public Set f31970c;

    public ViewOptions() {
        this(1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions.<init>(boolean, java.util.List):void
     arg types: [boolean, java.util.ArrayList]
     candidates:
      com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions.<init>(boolean, java.util.Collection):void
      com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions.<init>(boolean, java.util.List):void */
    /* renamed from: a */
    public static ViewOptions m23647a(JSONObject jSONObject) {
        ViewOptions viewOptions;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ArrayList arrayList;
        try {
            String string = jSONObject.getString("viewName");
            yav[] values = yav.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                yav yav = values[i];
                if (!string.equals(yav.f53544k)) {
                    i++;
                } else {
                    switch (yav.ordinal()) {
                        case 0:
                            List a = Transport.m23430a(jSONObject.getJSONArray("transports"));
                            if (a != null) {
                                viewOptions = new MultiTransportViewOptions(a);
                                break;
                            } else {
                                throw new JSONException("null transports unexpected in MultiTransportViewOptions");
                            }
                        case 1:
                            if (jSONObject.has("deviceRemovedTooSoon")) {
                                z = jSONObject.getBoolean("deviceRemovedTooSoon");
                            } else {
                                z = false;
                            }
                            if (jSONObject.has("recommendUsb")) {
                                z2 = jSONObject.getBoolean("recommendUsb");
                            } else {
                                z2 = false;
                            }
                            viewOptions = new NfcViewOptions(z, z2);
                            break;
                        case 2:
                            viewOptions = new NfcEnableViewOptions();
                            break;
                        case 3:
                            if (jSONObject.has("anyU2fDevicesPaired")) {
                                z3 = jSONObject.getBoolean("anyU2fDevicesPaired");
                            } else {
                                z3 = false;
                            }
                            viewOptions = new BleViewOptions(z3);
                            break;
                        case 4:
                            if (jSONObject.has("bluetoothEnabled")) {
                                z4 = jSONObject.getBoolean("bluetoothEnabled");
                            } else {
                                z4 = false;
                            }
                            if (jSONObject.has("locationServiceEnabled")) {
                                z5 = jSONObject.getBoolean("locationServiceEnabled");
                            } else {
                                z5 = false;
                            }
                            viewOptions = new BleEnableViewOptions(z4, z5);
                            break;
                        case 5:
                            viewOptions = new BlePairViewOptions(BleDeviceIdentifier.m23607a(jSONObject));
                            break;
                        case 6:
                            BleDeviceIdentifier a2 = BleDeviceIdentifier.m23607a(jSONObject);
                            if (jSONObject.has("tupNeeded")) {
                                z6 = jSONObject.getBoolean("tupNeeded");
                            } else {
                                z6 = false;
                            }
                            viewOptions = new BleProcessRequestViewOptions(a2, z6);
                            break;
                        case 7:
                            if (jSONObject.has("previousPairingAttemptFailed")) {
                                z7 = jSONObject.getBoolean("previousPairingAttemptFailed");
                            } else {
                                z7 = false;
                            }
                            if (jSONObject.has("devicesList")) {
                                JSONArray jSONArray = jSONObject.getJSONArray("devicesList");
                                arrayList = new ArrayList(jSONArray.length());
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    arrayList.add(BleDeviceIdentifier.m23607a(jSONArray.getJSONObject(i2)));
                                }
                            } else {
                                arrayList = null;
                            }
                            viewOptions = new BleSelectViewOptions(z7, (List) arrayList);
                            break;
                        case 8:
                            viewOptions = new UsbViewOptions();
                            break;
                        default:
                            throw new JSONException(String.format("View %s unimplemented", yav.f53544k));
                    }
                    if (jSONObject.has("alternateAvailableTransports")) {
                        Log.i("ViewOptions", "Alternate transport set is found");
                        EnumSet noneOf = EnumSet.noneOf(Transport.class);
                        try {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("alternateAvailableTransports");
                            if (jSONArray2 != null) {
                                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                                    noneOf.add(Transport.m23428a(jSONArray2.getString(i3)));
                                }
                            }
                        } catch (xhk e) {
                            Log.e("ViewOptions", "Ignoring transport", e);
                        }
                        if (!noneOf.isEmpty()) {
                            viewOptions.mo18875a(noneOf);
                        }
                    }
                    return viewOptions;
                }
            }
            throw new yau(string);
        } catch (yau e2) {
            throw new JSONException(e2.getMessage());
        }
    }

    /* renamed from: b */
    public Transport mo18854b() {
        throw new UnsupportedOperationException("getTransport() unimplemented");
    }

    /* renamed from: c */
    public yav mo18855c() {
        throw new UnsupportedOperationException("This method must be overwritten by subclasses");
    }

    /* renamed from: d */
    public JSONObject mo18856d() {
        throw new UnsupportedOperationException("This method must be overwritten by subclasses");
    }

    /* renamed from: e */
    public int mo18868e() {
        return this.f31969a;
    }

    public final String toString() {
        return mo18664a().toString();
    }

    public ViewOptions(int i) {
        this.f31970c = new HashSet();
        this.f31969a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, mo18868e());
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public JSONObject mo18664a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewName", mo18855c().f53544k);
            Set set = this.f31970c;
            if (set != null && !set.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (Transport transport : this.f31970c) {
                    jSONArray.put(transport.f31675g);
                }
                jSONObject.put("alternateAvailableTransports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo18875a(Set set) {
        HashSet hashSet = new HashSet();
        this.f31970c = hashSet;
        hashSet.addAll(set);
    }
}

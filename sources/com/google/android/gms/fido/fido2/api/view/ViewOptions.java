package com.google.android.gms.fido.fido2.api.view;

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
    public static final Parcelable.Creator CREATOR = new xrw();

    /* renamed from: a */
    private final int f31836a;

    /* renamed from: d */
    public final Set f31837d;

    public ViewOptions() {
        this(1);
    }

    /* renamed from: a */
    public static ViewOptions m23543a(JSONObject jSONObject) {
        ViewOptions viewOptions;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        byte[] bArr;
        sdo.m34959a(jSONObject);
        try {
            String string = jSONObject.getString("viewName");
            xrv[] values = xrv.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                xrv xrv = values[i];
                if (!string.equals(xrv.f53000n)) {
                    i++;
                } else {
                    ArrayList arrayList = null;
                    byte[] bArr2 = null;
                    byte[] bArr3 = null;
                    switch (xrv.ordinal()) {
                        case 0:
                            sdo.m34959a(jSONObject);
                            List a = Transport.m23430a(jSONObject.getJSONArray("transports"));
                            if (a != null) {
                                viewOptions = new MultiTransportViewOptions(a);
                                break;
                            } else {
                                throw new JSONException("null transports unexpected in MultiTransportViewOptions");
                            }
                        case 1:
                            sdo.m34959a(jSONObject);
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
                            sdo.m34959a(jSONObject);
                            if (jSONObject.has("anyFido2DevicesPaired")) {
                                z3 = jSONObject.getBoolean("anyFido2DevicesPaired");
                            } else {
                                z3 = false;
                            }
                            viewOptions = new BleViewOptions(z3);
                            break;
                        case 4:
                            sdo.m34959a(jSONObject);
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
                            sdo.m34959a(jSONObject);
                            viewOptions = new BlePairViewOptions(BleDeviceIdentifier.m23502a(jSONObject));
                            break;
                        case 6:
                            sdo.m34959a(jSONObject);
                            BleDeviceIdentifier a2 = BleDeviceIdentifier.m23502a(jSONObject);
                            if (jSONObject.has("tupNeeded")) {
                                z6 = jSONObject.getBoolean("tupNeeded");
                            } else {
                                z6 = false;
                            }
                            viewOptions = new BleProcessRequestViewOptions(a2, z6);
                            break;
                        case 7:
                            sdo.m34959a(jSONObject);
                            if (jSONObject.has("previousPairingAttemptFailed")) {
                                z7 = jSONObject.getBoolean("previousPairingAttemptFailed");
                            } else {
                                z7 = false;
                            }
                            if (jSONObject.has("devicesList")) {
                                JSONArray jSONArray = jSONObject.getJSONArray("devicesList");
                                ArrayList arrayList2 = new ArrayList(jSONArray.length());
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    arrayList2.add(BleDeviceIdentifier.m23502a(jSONArray.getJSONObject(i2)));
                                }
                                arrayList = arrayList2;
                            }
                            viewOptions = new BleSelectViewOptions(z7, arrayList);
                            break;
                        case 8:
                            viewOptions = new UsbViewOptions();
                            break;
                        case 9:
                            viewOptions = new InternalTransportUserSelectedViewOptions();
                            break;
                        case 10:
                            sdo.m34959a(jSONObject);
                            if (jSONObject.has("rpId")) {
                                String string2 = jSONObject.getString("rpId");
                                if (jSONObject.has("keyHandle")) {
                                    bArr = InternalTransportChallengeViewOptions.m23524a(jSONObject.getString("keyHandle"));
                                } else {
                                    bArr = null;
                                }
                                if (jSONObject.has("dataToSign")) {
                                    bArr3 = InternalTransportChallengeViewOptions.m23524a(jSONObject.getString("dataToSign"));
                                }
                                viewOptions = new InternalTransportChallengeViewOptions(string2, bArr, bArr3);
                                break;
                            } else {
                                throw new JSONException("Null rpId unexpected in InternalTransportChallengeViewOptions");
                            }
                        case 11:
                            if (jSONObject.has("statusCode")) {
                                int i3 = jSONObject.getInt("statusCode");
                                if (jSONObject.has("signedData")) {
                                    bArr2 = boan.f132470d.mo68796b(jSONObject.getString("signedData"));
                                }
                                viewOptions = new InternalTransportChallengeCompletedViewOptions(i3, bArr2);
                                break;
                            } else {
                                throw new JSONException("Null statusCode unexpected in InternalTransportChallengeCompletedViewOptions");
                            }
                        case 12:
                            viewOptions = new RequestValidationViewOptions();
                            break;
                        default:
                            throw new JSONException(String.format("View %s unimplemented", xrv.f53000n));
                    }
                    if (jSONObject.has("alternateAvailableTransports")) {
                        Log.i("ViewOptions", "Alternate transport set is found");
                        EnumSet noneOf = EnumSet.noneOf(Transport.class);
                        try {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("alternateAvailableTransports");
                            if (jSONArray2 != null) {
                                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                                    noneOf.add(Transport.m23428a(jSONArray2.getString(i4)));
                                }
                            }
                        } catch (xhk e) {
                            Log.e("ViewOptions", "Ignoring transport", e);
                        }
                        if (!noneOf.isEmpty()) {
                            sdo.m34959a(noneOf);
                            viewOptions.f31837d.clear();
                            viewOptions.f31837d.addAll(noneOf);
                        }
                    }
                    return viewOptions;
                }
            }
            throw new xru(string);
        } catch (xru e2) {
            throw new JSONException(e2.getMessage());
        }
    }

    /* renamed from: b */
    public Transport mo18758b() {
        throw new UnsupportedOperationException("getTransport() unimplemented");
    }

    /* renamed from: c */
    public xrv mo18759c() {
        throw new UnsupportedOperationException("This method must be overwritten by subclasses");
    }

    /* renamed from: d */
    public int mo18776d() {
        return this.f31836a;
    }

    public final String toString() {
        return mo18664a().toString();
    }

    public ViewOptions(int i) {
        this.f31837d = new HashSet();
        this.f31836a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, mo18776d());
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public JSONObject mo18664a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewName", mo18759c().f53000n);
            Set set = this.f31837d;
            if (set != null && !set.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (Transport transport : this.f31837d) {
                    jSONArray.put(transport.f31675g);
                }
                jSONObject.put("alternateAvailableTransports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}

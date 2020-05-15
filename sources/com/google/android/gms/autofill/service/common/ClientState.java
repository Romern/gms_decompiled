package com.google.android.gms.autofill.service.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import com.google.android.gms.autofill.util.PaymentsUtils$CardNetwork;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClientState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ldg();

    /* renamed from: a */
    public byte[] f11669a = new byte[0];

    /* renamed from: b */
    public PaymentsUtils$CardNetwork[] f11670b = new PaymentsUtils$CardNetwork[0];

    /* renamed from: c */
    public DetectionHistory f11671c = new DetectionHistory();

    /* renamed from: d */
    public UserFieldTypeManager f11672d = new UserFieldTypeManager();

    /* renamed from: e */
    public MetricsContext f11673e = null;

    /* renamed from: a */
    public static ClientState m7165a() {
        return new ClientState();
    }

    /* renamed from: b */
    public final Bundle mo7976b() {
        return lqx.m19547a((Parcelable) lqx.m19547a(this));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeByteArray(this.f11669a);
        parcel.writeTypedArray(this.f11670b, i);
        parcel.writeTypedObject(this.f11671c, i);
        parcel.writeTypedObject(this.f11672d, i);
        MetricsContext metricsContext = this.f11673e;
        if (metricsContext == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (metricsContext != null) {
            parcel.writeParcelable(metricsContext, i);
        }
    }

    /* renamed from: a */
    public static ClientState m7166a(Bundle bundle) {
        if (bundle == null) {
            return m7165a();
        }
        Bundle bundle2 = (Bundle) lqx.m19548a(bundle);
        if (bundle2 == null) {
            return m7165a();
        }
        ClassLoader classLoader = ClientState.class.getClassLoader();
        if (classLoader == null) {
            return m7165a();
        }
        bundle2.setClassLoader(classLoader);
        ClientState clientState = (ClientState) lqx.m19548a(bundle2);
        return clientState == null ? m7165a() : clientState;
    }
}

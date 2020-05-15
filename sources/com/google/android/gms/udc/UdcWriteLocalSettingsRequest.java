package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcWriteLocalSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avan();

    /* renamed from: a */
    public SettingChange[] f109359a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SettingChange extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new auzr();

        /* renamed from: a */
        public int f109360a;

        /* renamed from: b */
        public boolean f109361b;

        public SettingChange(int i, boolean z) {
            this.f109360a = i;
            this.f109361b = z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 2, this.f109360a);
            see.m35051a(parcel, 3, this.f109361b);
            see.m35062b(parcel, a);
        }
    }

    public UdcWriteLocalSettingsRequest(SettingChange[] settingChangeArr) {
        this.f109359a = settingChangeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 2, this.f109359a, i);
        see.m35062b(parcel, a);
    }
}

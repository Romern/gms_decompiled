package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agho extends dcj implements aghq {
    public agho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final List mo35391a(String str, String str2, AppMetadata appMetadata) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8165a(bj, appMetadata);
        Parcel a = mo8526a(16, bj);
        ArrayList createTypedArrayList = a.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: b */
    public final String mo35402b(AppMetadata appMetadata) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, appMetadata);
        Parcel a = mo8526a(11, bj);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final List mo35392a(String str, String str2, String str3) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        Parcel a = mo8526a(17, bj);
        ArrayList createTypedArrayList = a.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List mo35393a(String str, String str2, String str3, boolean z) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        dcl.m8166a(bj, z);
        Parcel a = mo8526a(15, bj);
        ArrayList createTypedArrayList = a.createTypedArrayList(UserAttributeParcel.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List mo35394a(String str, String str2, boolean z, AppMetadata appMetadata) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8166a(bj, z);
        dcl.m8165a(bj, appMetadata);
        Parcel a = mo8526a(14, bj);
        ArrayList createTypedArrayList = a.createTypedArrayList(UserAttributeParcel.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final void mo35395a(long j, String str, String str2, String str3) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo35396a(AppMetadata appMetadata) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, appMetadata);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo35397a(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, conditionalUserPropertyParcel);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo35398a(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, conditionalUserPropertyParcel);
        dcl.m8165a(bj, appMetadata);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo35399a(EventParcel eventParcel, AppMetadata appMetadata) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, eventParcel);
        dcl.m8165a(bj, appMetadata);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo35400a(EventParcel eventParcel, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, eventParcel);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo35401a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, userAttributeParcel);
        dcl.m8165a(bj, appMetadata);
        mo8528b(2, bj);
    }
}

package p000;

import android.os.IInterface;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.List;

/* renamed from: aghq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aghq extends IInterface {
    /* renamed from: a */
    List mo35391a(String str, String str2, AppMetadata appMetadata);

    /* renamed from: a */
    List mo35392a(String str, String str2, String str3);

    /* renamed from: a */
    List mo35393a(String str, String str2, String str3, boolean z);

    /* renamed from: a */
    List mo35394a(String str, String str2, boolean z, AppMetadata appMetadata);

    /* renamed from: a */
    void mo35395a(long j, String str, String str2, String str3);

    /* renamed from: a */
    void mo35396a(AppMetadata appMetadata);

    /* renamed from: a */
    void mo35397a(ConditionalUserPropertyParcel conditionalUserPropertyParcel);

    /* renamed from: a */
    void mo35398a(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata);

    /* renamed from: a */
    void mo35399a(EventParcel eventParcel, AppMetadata appMetadata);

    /* renamed from: a */
    void mo35400a(EventParcel eventParcel, String str, String str2);

    /* renamed from: a */
    void mo35401a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata);

    /* renamed from: b */
    String mo35402b(AppMetadata appMetadata);
}

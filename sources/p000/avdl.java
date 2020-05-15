package p000;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;

/* renamed from: avdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface avdl extends IInterface {
    /* renamed from: a */
    void mo51154a(Status status);

    /* renamed from: a */
    void mo51155a(Status status, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo51156a(Status status, DeviceDataUploadOptInFlags deviceDataUploadOptInFlags);

    /* renamed from: a */
    void mo51157a(Status status, DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable);

    /* renamed from: a */
    void mo51158a(Status status, SettingDisplayInfo settingDisplayInfo, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo51159a(Status status, UdcCacheResponse udcCacheResponse);

    /* renamed from: a */
    void mo51160a(Status status, List list);

    /* renamed from: a */
    void mo51161a(Status status, byte[] bArr);

    /* renamed from: b */
    void mo51162b(Status status, byte[] bArr);

    /* renamed from: c */
    void mo51163c(Status status, byte[] bArr);

    /* renamed from: d */
    void mo51164d(Status status, byte[] bArr);
}

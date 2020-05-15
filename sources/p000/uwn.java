package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.model.File;
import org.json.JSONObject;

/* renamed from: uwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uwn extends uyk {
    public uwn(uvy uvy) {
        super(uvy, false, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        return DriveId.m22925b(jSONObject.getString(this.f48716b.mo28084a()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28108b(Object obj) {
        DriveId driveId = (DriveId) obj;
        if (driveId != null && driveId.f30728a == null) {
            return ujs.f47815a.f48341a.mo27700a();
        }
        return ujr.RESOURCE_ID.f47814c.mo27700a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        return ujx.mo27610g();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        String str2 = ((DriveId) obj).f30728a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2);
        sb.append("'");
        sb.append(str2);
        sb.append("'");
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo28107a(Object obj) {
        DriveId driveId = (DriveId) obj;
        String str = driveId.f30728a;
        return str == null ? Long.toString(driveId.f30729b) : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        DriveId driveId = (DriveId) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.f48716b.mo28084a(), ((DriveId) obj).mo18112a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        DriveId driveId = (DriveId) obj;
        throw new UnsupportedOperationException("Cannot set DRIVE_ID.");
    }
}

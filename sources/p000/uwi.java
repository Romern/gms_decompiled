package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.ParentReference;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: uwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uwi extends uxw {
    public uwi(uvu uvu, vad vad) {
        super(uvu, false, vad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(this.f48716b.mo28084a());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(DriveId.m22925b(jSONArray.getString(i)));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        Collection collection = (Collection) obj;
        throw new UnsupportedOperationException("Cannot query Drive API v2 for a collection of items.");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo28103a(Object obj, String str) {
        return uxs.f48679a.mo28105b((DriveId) obj, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (DriveId driveId : (Collection) obj) {
            String str = driveId.f30728a;
            if (str != null && !"root".equals(str)) {
                ParentReference parentReference = new ParentReference();
                if (driveId.f30728a.startsWith("appdata")) {
                    parentReference.mo18248e("appdata");
                } else {
                    parentReference.mo18248e(driveId.f30728a);
                }
                parentReference.f31034c = false;
                parentReference.f31032a.add(3);
                arrayList.add(parentReference);
            }
        }
        file.mo18241a(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        JSONArray jSONArray = new JSONArray();
        for (DriveId driveId : (Collection) obj) {
            jSONArray.put(driveId.mo18112a());
        }
        jSONObject.put(this.f48716b.mo28084a(), jSONArray);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        Collection collection = (Collection) obj;
        throw new UnsupportedOperationException("Cannot currently set collections.");
    }
}

package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;

/* renamed from: aomz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aomz {

    /* renamed from: a */
    public final Bundle f78560a;

    public aomz(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            Bundle bundle = new Bundle();
            this.f78560a = bundle;
            bundle.putString("label", str);
            this.f78560a.putString("url", str2);
            this.f78560a.putString("deepLinkId", str3);
            return;
        }
        throw new IllegalArgumentException("At least one of url or deepLinkId is required.");
    }

    /* renamed from: a */
    public static aomz m66116a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("label");
        String string2 = bundle.getString("url");
        String string3 = bundle.getString("deepLinkId");
        if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3)) {
            return new aomz(string, string2, string3);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo43068a(aoex aoex) {
        aoew aoew = new aoew();
        aoew.f78269a = this.f78560a.getString("deepLinkId");
        aoew.f78271c.add(2);
        aoew.f78270b = this.f78560a.getString("url");
        aoew.f78271c.add(3);
        ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity deepLinkEntity = new ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity(aoew.f78271c, aoew.f78269a, aoew.f78270b);
        aoev aoev = new aoev();
        aoev.f78267b = this.f78560a.getString("label");
        aoev.f78268c.add(4);
        aoev.f78266a = deepLinkEntity;
        aoev.f78268c.add(2);
        aoex.f78272a = new ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity(aoev.f78268c, aoev.f78266a, aoev.f78267b);
        aoex.f78278g.add(2);
        aoex.f78277f = "action";
        aoex.f78278g.add(11);
    }
}

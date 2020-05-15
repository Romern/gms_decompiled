package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: aloe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aloe extends alnb {

    /* renamed from: b */
    private final String f73936b;

    /* renamed from: d */
    public final DataHolder mo40606d(Context context) {
        String str = this.f75731l;
        String str2 = this.f73936b;
        Bundle bundle = new Bundle();
        bundle.putString("account", str);
        bundle.putString("pagegaiaid", str2);
        alog.m61420a(context, str, str2, bundle);
        alto b = altq.m61806a(context).mo40763b();
        if (b == null) {
            return DataHolder.m22537a(new String[0]).mo25163a(13);
        }
        return new DataHolder(b.mo40744a("SELECT c.contact_id AS contact_id,c.display_name AS display_name,i.value AS phone_number,p.last_update_time AS last_update_time FROM ac_people AS p JOIN ac_container AS c ON p._id=c.people_id JOIN ac_item AS i ON c._id=i.container_id WHERE (p.owner_id=?)AND (c.container_type=1)AND (i.item_type=2)ORDER BY display_name,people_v2_id", new String[]{altn.m61774a(context).mo40739b(str, str2)}), bundle);
    }

    public aloe(String str, int i, alzm alzm, String str2, String str3) {
        super(str, i, alzm, str2, "LoadPhoneNumbers", null);
        this.f73936b = str3;
    }
}

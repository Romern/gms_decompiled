package p000;

import android.content.ContentValues;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rtu {

    /* renamed from: a */
    public final String[] f43677a;

    /* renamed from: b */
    public final ArrayList f43678b = new ArrayList();

    /* renamed from: a */
    public final int mo25162a() {
        return this.f43678b.size();
    }

    public /* synthetic */ rtu(String[] strArr) {
        this.f43677a = (String[]) sdo.m34959a(strArr);
        new HashMap();
    }

    /* renamed from: a */
    public final DataHolder mo25163a(int i) {
        return new DataHolder(this, i, null);
    }

    /* renamed from: a */
    public final DataHolder mo25164a(int i, Bundle bundle) {
        return new DataHolder(this.f43677a, DataHolder.m22538a(this), i, bundle);
    }

    /* renamed from: a */
    public void mo25160a(ContentValues contentValues) {
        rzz.m34731b(contentValues);
        HashMap hashMap = new HashMap(contentValues.size());
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        mo25161a(hashMap);
    }

    /* renamed from: a */
    public void mo25161a(HashMap hashMap) {
        rzz.m34731b(hashMap);
        this.f43678b.add(hashMap);
    }
}

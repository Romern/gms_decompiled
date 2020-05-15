package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: uzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzf extends uvu {
    public uzf(String str) {
        super(str, Collections.singleton(str), Collections.emptySet(), 4300000);
    }

    /* renamed from: a */
    public static String m39820a(Collection collection) {
        if (collection != null) {
            return new JSONArray(collection).toString();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28089b(Bundle bundle) {
        return bundle.getStringArrayList(this.f48653a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo28092c(DataHolder dataHolder, int i, int i2) {
        return mo28092c(dataHolder, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Collection mo28096d(DataHolder dataHolder, int i, int i2) {
        try {
            return m39821a(dataHolder.mo17769c(this.f48653a, i, i2));
        } catch (JSONException e) {
            throw new IllegalStateException("DataHolder supplied invalid JSON", e);
        }
    }

    /* renamed from: a */
    public static Collection m39821a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28085a(Bundle bundle, Object obj) {
        bundle.putStringArrayList(this.f48653a, new ArrayList((Collection) obj));
    }
}

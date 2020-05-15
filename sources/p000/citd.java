package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.UrlResponseInfo;

/* renamed from: citd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class citd extends UrlResponseInfo.HeaderBlock {

    /* renamed from: a */
    public final List f191397a;

    /* renamed from: b */
    public Map f191398b;

    public citd(List list) {
        this.f191397a = list;
    }

    public final List getAsList() {
        return this.f191397a;
    }

    public final Map getAsMap() {
        Map map = this.f191398b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : this.f191397a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.f191398b = unmodifiableMap;
        return unmodifiableMap;
    }
}

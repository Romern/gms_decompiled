package p000;

import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: uyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uyj {

    /* renamed from: a */
    private static final sbw f48714a = new sbw("MetadataBufferConversio", "");

    /* renamed from: a */
    public static File m39758a(MetadataBundle metadataBundle) {
        File file = new File();
        for (uvy uvy : metadataBundle.mo18274c()) {
            uyk a = uxx.m39710a(uvy);
            sdo.m34966a(metadataBundle, "changeSet");
            sdo.m34966a(file, "serverFile");
            Object a2 = metadataBundle.mo18269a(a.f48716b);
            if (a2 != null) {
                a.mo28100a(file, a2);
            }
        }
        return file;
    }

    /* renamed from: b */
    public static JSONObject m39762b(MetadataBundle metadataBundle) {
        JSONObject jSONObject = new JSONObject();
        for (uvy uvy : metadataBundle.mo18274c()) {
            uyk a = uxx.m39710a(uvy);
            sdo.m34966a(metadataBundle, "collection");
            sdo.m34966a(jSONObject, "jsonObject");
            if (metadataBundle.mo18275c(a.f48716b)) {
                Object a2 = metadataBundle.mo18269a(a.f48716b);
                if (a2 == null) {
                    jSONObject.put(a.f48716b.mo28084a(), JSONObject.NULL);
                } else {
                    a.mo28104a(jSONObject, a2);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static MetadataBundle m39759a(JSONObject jSONObject) {
        MetadataBundle a = MetadataBundle.m23056a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            uvy a2 = uyu.m39796a(next);
            if (a2 != null) {
                uyk a3 = uxx.m39710a(a2);
                sdo.m34966a(jSONObject, "jsonObject");
                sdo.m34966a(a, "collection");
                if (jSONObject.has(a3.f48716b.mo28084a())) {
                    if (jSONObject.get(a3.f48716b.mo28084a()).equals(JSONObject.NULL)) {
                        a.mo18273b(a3.f48716b, null);
                    } else {
                        a.mo18273b(a3.f48716b, a3.mo28102a(jSONObject));
                    }
                }
            } else {
                f48714a.mo25375b("Ignored unknown metadata field in JSON: %s", next);
            }
        }
        return a;
    }

    /* renamed from: a */
    public static MetadataBundle m39760a(ujx ujx, String str) {
        MetadataBundle a = MetadataBundle.m23056a();
        for (uvy uvy : uyu.m39795a()) {
            uyk a2 = uxx.m39710a(uvy);
            sdo.m34966a(ujx, "entry");
            sdo.m34966a(a, "changeSet");
            a.mo18273b(a2.f48716b, a2.mo28099a(ujx, str));
        }
        return a;
    }

    /* renamed from: a */
    public static void m39761a(ujx ujx, ukt ukt, long j, String str, MetadataBundle metadataBundle) {
        sdo.m34966a(ukt, "GenoaValues should always be passed when writing to entry.");
        MetadataBundle a = MetadataBundle.m23056a();
        for (uvy uvy : metadataBundle.mo18274c()) {
            uyk a2 = uxx.m39710a(uvy);
            sdo.m34966a(ujx, "entry");
            sdo.m34966a(metadataBundle, "changeSet");
            sdo.m34966a(a, "undoChangeSet");
            uvy uvy2 = a2.f48716b;
            a.mo18273b(uvy2, a2.mo28110a(ujx, str, metadataBundle.mo18269a(uvy2)));
            a2.mo28106a(ujx, ukt, j);
            sdo.m34966a(metadataBundle, "changeSet");
            sdo.m34966a(ujx, "entry");
            a2.mo28101a(ujx, str, metadataBundle.mo18269a(a2.f48716b), j);
        }
    }
}

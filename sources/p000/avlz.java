package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: avlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avlz {

    /* renamed from: a */
    private static final Logger f93353a = avpq.m79016c("PackagePropertyFiles");

    /* renamed from: b */
    private static final bnic f93354b = bnic.m109491a("metadata", "payload.bin", "payload_properties.txt");

    /* renamed from: a */
    public static List m78770a(String str) {
        return m78771a(str, f93354b);
    }

    /* renamed from: a */
    private static List m78771a(String str, bnic bnic) {
        bnic bnic2 = bnic;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : bmyx.m108640a(',').mo66918a((CharSequence) str.replaceAll("\\s+", ""))) {
            List c = bmyx.m108640a(':').mo66925c((CharSequence) str2);
            if (c.size() == 3) {
                String str3 = (String) c.get(0);
                try {
                    long parseLong = Long.parseLong((String) c.get(1));
                    long parseLong2 = Long.parseLong((String) c.get(2));
                    if (parseLong < 0 || parseLong2 < 0) {
                        throw new IOException(String.format("Invalid tokens: [%s].", str2));
                    }
                    linkedHashMap.put(str3, new avly(str3, parseLong, parseLong2));
                    f93353a.logVerbose("Found tokens: filename=%s, offset=%d, size=%d.", str3, Long.valueOf(parseLong), Long.valueOf(parseLong2));
                } catch (NumberFormatException e) {
                    throw new IOException(String.format("Invalid tokens: [%s].", str2), e);
                }
            } else {
                throw new IOException(String.format("Unknown tokens: [%s].", str2));
            }
        }
        if (linkedHashMap.keySet().containsAll(bnic2)) {
            return new ArrayList(linkedHashMap.values());
        }
        throw new IOException(String.format("Missing required property files: [%s].", bmxr.m108543a(',').mo66874a((Iterable) rsr.m34361b(bnic2, linkedHashMap.keySet()))));
    }

    /* renamed from: b */
    public static List m78772b(String str) {
        return m78771a(str, bnon.f131923a);
    }
}

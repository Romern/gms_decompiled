package p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: avlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avlx {

    /* renamed from: a */
    private static final Logger f93344a = avpq.m79016c("PackageMetadatas");
    @Deprecated

    /* renamed from: b */
    private static final avto f93345b = new avto("post_build_fingerprint", "");
    @Deprecated

    /* renamed from: c */
    private static final avtk f93346c = new avtk("post_build_timestamp", -1L);
    @Deprecated

    /* renamed from: d */
    private static final avta f93347d = new avta("is_downgrade_package", false);
    @Deprecated

    /* renamed from: e */
    private static final avto f93348e = new avto("package_type", "");

    /* renamed from: f */
    private static final bmyx f93349f = bmyx.m108640a('|').mo66917a();

    /* renamed from: a */
    private static avsv m78761a(String str, Map map) {
        avsu avsu = (avsu) avsv.f93858g.mo74144da();
        Iterable a = f93349f.mo66918a((CharSequence) bmxx.m108578b((String) map.get(str.concat("build"))));
        if (avsu.f164950c) {
            avsu.mo74035c();
            avsu.f164950c = false;
        }
        avsv avsv = (avsv) avsu.f164949b;
        avsv.mo51587a();
        bxsy.m123078a(a, avsv.f93861b);
        Iterable a2 = f93349f.mo66918a((CharSequence) bmxx.m108578b((String) map.get(str.concat("bootloader"))));
        if (avsu.f164950c) {
            avsu.mo74035c();
            avsu.f164950c = false;
        }
        avsv avsv2 = (avsv) avsu.f164949b;
        if (!avsv2.f93860a.mo73666a()) {
            avsv2.f93860a = GeneratedMessageLite.m124021a(avsv2.f93860a);
        }
        bxsy.m123078a(a2, avsv2.f93860a);
        Iterable a3 = f93349f.mo66918a((CharSequence) bmxx.m108578b((String) map.get(str.concat("radio"))));
        if (avsu.f164950c) {
            avsu.mo74035c();
            avsu.f164950c = false;
        }
        avsv avsv3 = (avsv) avsu.f164949b;
        if (!avsv3.f93863d.mo73666a()) {
            avsv3.f93863d = GeneratedMessageLite.m124021a(avsv3.f93863d);
        }
        bxsy.m123078a(a3, avsv3.f93863d);
        Iterable a4 = f93349f.mo66918a((CharSequence) bmxx.m108578b((String) map.get(str.concat("device"))));
        if (avsu.f164950c) {
            avsu.mo74035c();
            avsu.f164950c = false;
        }
        avsv avsv4 = (avsv) avsu.f164949b;
        if (!avsv4.f93862c.mo73666a()) {
            avsv4.f93862c = GeneratedMessageLite.m124021a(avsv4.f93862c);
        }
        bxsy.m123078a(a4, avsv4.f93862c);
        Long a5 = bqcr.m112596a(bmxx.m108578b((String) map.get(str.concat("timestamp"))));
        if (a5 != null) {
            avsu.mo51586a(a5.longValue());
        }
        String b = bmxx.m108578b((String) map.get(str.concat("security-patch-level")));
        if (!b.isEmpty()) {
            if (avsu.f164950c) {
                avsu.mo74035c();
                avsu.f164950c = false;
            }
            b.getClass();
            ((avsv) avsu.f164949b).f93865f = b;
        }
        return (avsv) avsu.mo74062i();
    }

    /* renamed from: b */
    public static boolean m78768b(avsw avsw) {
        String a = stn.m36304a("ro.build.fingerprint", "");
        if (bmxx.m108577a(a)) {
            f93344a.mo25418e("Unknown current build fingerprint.", new Object[0]);
            return false;
        }
        Long a2 = bqcr.m112596a(stn.m36304a("ro.build.date.utc", ""));
        if (a2 == null) {
            f93344a.mo25418e("Invalid current build timestamp %s.", stn.m36304a("ro.build.date.utc", ""));
            return false;
        }
        avsv avsv = avsw.f93871d;
        if (avsv == null) {
            avsv = avsv.f93858g;
        }
        if (avsv.f93864e.size() != 0) {
            avsv avsv2 = avsw.f93871d;
            if (avsv2 == null) {
                avsv2 = avsv.f93858g;
            }
            if (avsv2.f93861b.contains(a)) {
                avsv avsv3 = avsw.f93871d;
                if (avsv3 == null) {
                    avsv3 = avsv.f93858g;
                }
                if (avsv3.f93864e.mo74160a(0) == a2.longValue()) {
                    return true;
                }
            }
            return false;
        }
        f93344a.mo25418e("Unknown build timestamp in package metadata.", new Object[0]);
        return false;
    }

    /* renamed from: c */
    public static boolean m78769c(avsw avsw) {
        if (!avsw.f93869b) {
            Long a = bqcr.m112596a(stn.m36304a("ro.build.date.utc", ""));
            if (a == null) {
                f93344a.mo25418e("Invalid current build timestamp %s.", stn.m36304a("ro.build.date.utc", ""));
                return false;
            }
            avsv avsv = avsw.f93871d;
            if (avsv == null) {
                avsv = avsv.f93858g;
            }
            if (avsv.f93864e.size() != 0) {
                long longValue = a.longValue();
                avsv avsv2 = avsw.f93871d;
                if (avsv2 == null) {
                    avsv2 = avsv.f93858g;
                }
                if (longValue > avsv2.f93864e.mo74160a(0)) {
                    return true;
                }
                return false;
            }
            f93344a.mo25418e("Unknown build timestamp in package metadata.", new Object[0]);
            return false;
        }
        f93344a.mo25414c("Intentionally downgrading package.", new Object[0]);
        return false;
    }

    @Deprecated
    /* renamed from: a */
    public static avsw m78762a(avte avte) {
        avsu avsu = (avsu) avsv.f93858g.mo74144da();
        if (!bmxx.m108577a((String) avte.mo51597a(f93345b))) {
            String str = (String) avte.mo51597a(f93345b);
            if (avsu.f164950c) {
                avsu.mo74035c();
                avsu.f164950c = false;
            }
            avsv avsv = (avsv) avsu.f164949b;
            str.getClass();
            avsv.mo51587a();
            avsv.f93861b.add(str);
        }
        if (((Long) avte.mo51597a(f93346c)).longValue() != -1) {
            avsu.mo51586a(((Long) avte.mo51597a(f93346c)).longValue());
        }
        bxvd da = avsw.f93866e.mo74144da();
        String str2 = (String) avte.mo51597a(f93348e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str2.getClass();
        ((avsw) da.f164949b).f93868a = str2;
        boolean booleanValue = ((Boolean) avte.mo51597a(f93347d)).booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((avsw) da.f164949b).f93869b = booleanValue;
        avsv avsv2 = avsv.f93858g;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        avsw avsw = (avsw) da.f164949b;
        avsv2.getClass();
        avsw.f93870c = avsv2;
        avsv avsv3 = (avsv) avsu.mo74062i();
        avsv3.getClass();
        avsw.f93871d = avsv3;
        return (avsw) da.mo74062i();
    }

    /* renamed from: a */
    public static avsw m78763a(File file) {
        return m78764a(m78766a(new FileReader(file)));
    }

    /* renamed from: a */
    private static avsw m78764a(Map map) {
        bxvd da = avsw.f93866e.mo74144da();
        String b = bmxx.m108578b((String) map.get("ota-type"));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((avsw) da.f164949b).f93868a = b;
        boolean equals = "yes".equals(map.get("ota-downgrade"));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((avsw) da.f164949b).f93869b = equals;
        avsv a = m78761a("pre-", map);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((avsw) da.f164949b).f93870c = a;
        avsv a2 = m78761a("post-", map);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((avsw) da.f164949b).f93871d = a2;
        return (avsw) da.mo74062i();
    }

    /* renamed from: a */
    public static avsw m78765a(ZipFile zipFile) {
        ZipEntry entry = zipFile.getEntry("META-INF/com/android/metadata");
        if (entry != null) {
            InputStream inputStream = zipFile.getInputStream(entry);
            if (inputStream != null) {
                return m78764a(m78766a(new InputStreamReader(inputStream)));
            }
            throw new IOException("Unable to get input stream.");
        }
        throw new IOException("Unable to find METADATA file.");
    }

    /* renamed from: a */
    private static Map m78766a(Reader reader) {
        BufferedReader bufferedReader = new BufferedReader(reader);
        HashMap hashMap = new HashMap();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return hashMap;
            }
            String h = bmww.f131155b.mo66848h(readLine);
            if (!h.isEmpty() && h.charAt(0) != '#') {
                String[] split = h.split("=");
                if (split.length != 2) {
                    f93344a.mo25418e("Mal-formatted line: %s.", h);
                } else {
                    hashMap.put(bmww.f131155b.mo66848h(split[0]), bmww.f131155b.mo66848h(split[1]));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m78767a(avsw avsw) {
        return "BRICK".equalsIgnoreCase(avsw.f93868a);
    }
}

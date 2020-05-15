package p000;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: uvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvx {

    /* renamed from: a */
    private static final sbw f48661a = new sbw("MetadataChangeValidator", "");

    /* renamed from: a */
    static void m39526a(MetadataBundle metadataBundle) {
        String str = (String) metadataBundle.mo18269a(uzm.f48741Q);
        String str2 = (String) metadataBundle.mo18269a(uzm.f48744c);
        String str3 = (String) metadataBundle.mo18269a(uzm.f48738N);
        if (str != null) {
            m39528a("title", str, ((Integer) twy.f46848af.mo58455c()).intValue());
        }
        if (str2 != null) {
            m39528a("description", str2, ((Integer) twy.f46844ab.mo58455c()).intValue());
        }
        if (str3 != null) {
            m39528a("mimeType", str3, ((Integer) twy.f46846ad.mo58455c()).intValue());
            m39529a("mimeType", str3, (String) twy.f46850ah.mo58455c());
        }
    }

    /* renamed from: a */
    static void m39527a(MetadataBundle metadataBundle, boolean z) {
        String str = (String) metadataBundle.mo18269a(uzm.f48748g);
        if (str == null) {
            return;
        }
        if (!z) {
            throw new aaaj(10, "Cannot set folderColorRgb for non-folders.");
        } else if (!Pattern.compile("^#[A-Fa-f0-9]{6}$").matcher(str).matches()) {
            metadataBundle.mo18273b(uzm.f48748g, (String) twy.f46811V.mo58455c());
        }
    }

    /* renamed from: a */
    static void m39528a(String str, String str2, int i) {
        if (str2.codePointCount(0, str2.length()) > i) {
            throw new aaaj(10, String.format("%s value too large.", str));
        }
    }

    /* renamed from: a */
    static void m39529a(String str, String str2, String str3) {
        try {
            if (!Pattern.matches(str3, str2)) {
                throw new aaaj(10, String.format("Invalid characters in %s value.", str));
            }
        } catch (PatternSyntaxException e) {
            f48661a.mo25378c("MetadataChangeValidator", "Invalid mime type pattern", e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ujx.a(java.lang.String, boolean):java.util.List
     arg types: [java.lang.String, int]
     candidates:
      ujx.a(boolean, boolean):void
      ujx.a(java.lang.String, java.lang.String):uot
      ujx.a(boolean, long):void
      ujx.a(java.lang.String, boolean):java.util.List */
    /* renamed from: a */
    static void m39530a(String str, ujx ujx, MetadataBundle metadataBundle) {
        int i;
        int i2;
        long j;
        Map map;
        String str2;
        int i3;
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) metadataBundle.mo18269a(uzm.f48736L);
        if (appVisibleCustomProperties != null) {
            if (ujx != null) {
                map = uot.m39108a(ujx.mo27550a(str, false));
                j = (long) ujx.f47825a.f47881J;
                i2 = 0;
                i = 0;
                for (uot uot : map.values()) {
                    if (!uot.mo27788h()) {
                        i++;
                    } else {
                        i2++;
                    }
                }
            } else {
                map = Collections.emptyMap();
                j = 0;
                i2 = 0;
                i = 0;
            }
            Iterator it = appVisibleCustomProperties.iterator();
            while (it.hasNext()) {
                CustomProperty customProperty = (CustomProperty) it.next();
                CustomPropertyKey customPropertyKey = customProperty.f31068a;
                String str3 = customPropertyKey.f31064a;
                if (customPropertyKey.f31065b == 1) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                boolean containsKey = map.containsKey(uot.m39107a(str3, str2));
                String str4 = customProperty.f31069b;
                if (containsKey) {
                    i3 = str4 == null ? -1 : 0;
                } else if (str4 != null) {
                    i3 = 1;
                } else {
                    String valueOf = String.valueOf(customProperty.f31068a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                    sb.append("Cannot delete non-existent property: ");
                    sb.append(valueOf);
                    throw new aaaj(10, sb.toString());
                }
                if (customProperty.f31068a.f31065b != 1) {
                    i2 += i3;
                } else {
                    i += i3;
                }
                j += (long) i3;
            }
            if (i2 > 30) {
                throw new aaaj(10, String.format("A resource cannot have more than %d public properties", 30));
            } else if (i > 30) {
                throw new aaaj(10, String.format("A resource cannot have more than %d private properties", 30));
            } else if (j > 100) {
                throw new aaaj(10, String.format("A resource cannot have more than %d total properties", 100));
            }
        }
    }

    /* renamed from: a */
    public static void m39531a(uey uey, MetadataBundle metadataBundle, boolean z) {
        m39530a(uey.f47395b, (ujx) null, metadataBundle);
        m39527a(metadataBundle, z);
        m39526a(metadataBundle);
    }

    /* renamed from: a */
    public static void m39532a(uey uey, ujx ujx, MetadataBundle metadataBundle) {
        sdo.m34959a(ujx);
        if (!metadataBundle.mo18275c(uzm.f48730F) || ujx.mo27621j()) {
            m39530a(uey.f47395b, ujx, metadataBundle);
            m39527a(metadataBundle, ujx.mo27640w());
            m39533a(uzm.f48741Q, metadataBundle);
            m39533a(uzm.f48738N, metadataBundle);
            m39526a(metadataBundle);
            return;
        }
        throw new aaaj(10, "Only owner can update writersCanShare property of a Drive resource");
    }

    /* renamed from: a */
    static void m39533a(uvy uvy, MetadataBundle metadataBundle) {
        if (metadataBundle.mo18275c(uvy) && metadataBundle.mo18269a(uvy) == null) {
            throw new aaaj(10, String.format("%s must not be null", ((uvt) uvy).f48653a));
        }
    }
}

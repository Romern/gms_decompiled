package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: axh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axh {

    /* renamed from: a */
    private final Map f2488a = new HashMap();

    /* renamed from: b */
    private final Map f2489b = new HashMap();

    /* renamed from: c */
    private final Map f2490c = new HashMap();

    /* renamed from: d */
    private final Pattern f2491d = Pattern.compile("[/*?\\[\\]]");

    public axh() {
        try {
            mo2814a("http://www.w3.org/XML/1998/namespace", "xml");
            mo2814a("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
            mo2814a("http://purl.org/dc/elements/1.1/", "dc");
            mo2814a("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
            mo2814a("adobe:ns:meta/", "x");
            mo2814a("http://ns.adobe.com/iX/1.0/", "iX");
            mo2814a("http://ns.adobe.com/xap/1.0/", "xmp");
            mo2814a("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
            mo2814a("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
            mo2814a("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
            mo2814a("http://ns.adobe.com/xmp/note/", "xmpNote");
            mo2814a("http://ns.adobe.com/pdf/1.3/", "pdf");
            mo2814a("http://ns.adobe.com/pdfx/1.3/", "pdfx");
            mo2814a("http://www.npes.org/pdfx/ns/id/", "pdfxid");
            mo2814a("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
            mo2814a("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
            mo2814a("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
            mo2814a("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
            mo2814a("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
            mo2814a("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
            mo2814a("http://ns.adobe.com/photoshop/1.0/", "photoshop");
            mo2814a("http://ns.adobe.com/album/1.0/", "album");
            mo2814a("http://ns.adobe.com/exif/1.0/", "exif");
            mo2814a("http://ns.adobe.com/exif/1.0/aux/", "aux");
            mo2814a("http://ns.adobe.com/tiff/1.0/", "tiff");
            mo2814a("http://ns.adobe.com/png/1.0/", "png");
            mo2814a("http://ns.adobe.com/jpeg/1.0/", "jpeg");
            mo2814a("http://ns.adobe.com/jp2k/1.0/", "jp2k");
            mo2814a("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
            mo2814a("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
            mo2814a("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
            mo2814a("http://ns.adobe.com/asf/1.0/", "asf");
            mo2814a("http://ns.adobe.com/xmp/wav/1.0/", "wav");
            mo2814a("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
            mo2814a("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
            mo2814a("http://ns.adobe.com/xap/1.0/t/", "xmpT");
            mo2814a("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
            mo2814a("http://ns.adobe.com/xap/1.0/g/", "xmpG");
            mo2814a("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
            mo2814a("http://ns.adobe.com/xap/1.0/sType/Font#", "stFNT");
            mo2814a("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
            mo2814a("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
            mo2814a("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
            mo2814a("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
            mo2814a("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
            mo2814a("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
            mo2814a("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
            axm axm = new axm();
            axm.mo2828a(1536, true);
            axm axm2 = new axm();
            axm2.mo2828a(7680, true);
            mo2815a("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", axm);
            mo2815a("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
            mo2815a("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
            mo2815a("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
            mo2815a("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            mo2815a("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
            mo2815a("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", null);
            mo2815a("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            mo2815a("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", axm);
            mo2815a("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
            mo2815a("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            mo2815a("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            mo2815a("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            mo2815a("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", axm2);
            mo2815a("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", axm2);
            mo2815a("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", axm);
            mo2815a("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", axm2);
            mo2815a("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", axm2);
            mo2815a("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            mo2815a("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
            mo2815a("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", axm2);
            mo2815a("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
            mo2815a("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", axm);
            mo2815a("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            mo2815a("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            mo2815a("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
            mo2815a("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            mo2815a("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", axm);
            mo2815a("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", axm2);
            mo2815a("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            mo2815a("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", axm2);
            mo2815a("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            mo2815a("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            mo2815a("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", axm2);
        } catch (awn e) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    /* renamed from: a */
    public final synchronized String mo2813a(String str) {
        return (String) this.f2488a.get(str);
    }

    /* renamed from: b */
    public final synchronized String mo2816b(String str) {
        if (str != null) {
            if (!str.endsWith(":")) {
                str = str.concat(":");
            }
        }
        return (String) this.f2489b.get(str);
    }

    /* renamed from: c */
    public final synchronized axg mo2817c(String str) {
        return (axg) this.f2490c.get(str);
    }

    /* renamed from: a */
    public final synchronized String mo2814a(String str, String str2) {
        awv.m2290b(str);
        if (str2 == null || str2.length() == 0) {
            throw new awn("Empty prefix", 4);
        }
        int i = 1;
        if (str2.charAt(str2.length() - 1) != ':') {
            StringBuilder sb = new StringBuilder(str2.length() + 1);
            sb.append(str2);
            sb.append(':');
            str2 = sb.toString();
        }
        if (awy.m2313e(str2.substring(0, str2.length() - 1))) {
            String str3 = (String) this.f2488a.get(str);
            String str4 = (String) this.f2489b.get(str2);
            if (str3 != null) {
                return str3;
            }
            if (str4 != null) {
                String str5 = str2;
                while (this.f2489b.containsKey(str5)) {
                    String substring = str2.substring(0, str2.length() - 1);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 14);
                    sb2.append(substring);
                    sb2.append("_");
                    sb2.append(i);
                    sb2.append("_:");
                    str5 = sb2.toString();
                    i++;
                }
                str2 = str5;
            }
            this.f2489b.put(str2, str);
            this.f2488a.put(str, str2);
            return str2;
        }
        throw new awn("The prefix is a bad XML name", ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo2815a(String str, String str2, String str3, String str4, axm axm) {
        axm axm2;
        awv.m2290b(str);
        awv.m2289a(str2);
        awv.m2290b(str3);
        awv.m2289a(str4);
        if (axm != null) {
            axp c = axm.mo2826c();
            if (c.mo2846f()) {
                c.mo2851k();
            }
            if (c.mo2845e()) {
                c.mo2852l();
            }
            if (c.mo2829a(1024)) {
                c.mo2849i();
            }
            c.mo2831c(c.f2502a);
            axm2 = new axm(c.f2502a);
        } else {
            axm2 = new axm();
        }
        if (this.f2491d.matcher(str2).find() || this.f2491d.matcher(str4).find()) {
            throw new awn("Alias and actual property names must be simple", 102);
        }
        String a = mo2813a(str);
        String a2 = mo2813a(str3);
        if (a == null) {
            throw new awn("Alias namespace is not registered", 101);
        } else if (a2 != null) {
            String str5 = str2.length() == 0 ? new String(a) : a.concat(str2);
            if (!this.f2490c.containsKey(str5)) {
                if (!this.f2490c.containsKey(str4.length() == 0 ? new String(a2) : a2.concat(str4))) {
                    this.f2490c.put(str5, new axg(str3, a2, str4, axm2));
                } else {
                    throw new awn("Actual property is already an alias, use the base property", 4);
                }
            } else {
                throw new awn("Alias is already existing", 4);
            }
        } else {
            throw new awn("Actual namespace is not registered", 101);
        }
    }
}

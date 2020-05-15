package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: beai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beai {

    /* renamed from: a */
    private final PackageManager f106740a;

    public beai(PackageManager packageManager) {
        this.f106740a = packageManager;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private final List m91660a(int i, PackageInfo packageInfo) {
        String str;
        String str2;
        char c;
        PackageInfo packageInfo2 = packageInfo;
        XmlResourceParser xml = this.f106740a.getResourcesForApplication(packageInfo2.packageName).getXml(i);
        if (xml == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            xml.next();
            while (xml.next() != 1) {
                if (xml.getEventType() == 2) {
                    String name = xml.getName();
                    if ("phenotype-registrations".equals(name)) {
                        m91663b(xml, "phenotype-registrations");
                        ArrayList arrayList2 = new ArrayList();
                        while (true) {
                            int i2 = 3;
                            if (xml.nextTag() != 3) {
                                String name2 = xml.getName();
                                if ("phenotype-registration".equals(name2)) {
                                    m91663b(xml, "phenotype-registration");
                                    braf braf = (braf) braj.f142139l.mo74144da();
                                    boolean z = false;
                                    while (true) {
                                        str2 = name;
                                        if (xml.nextTag() == i2) {
                                            m91662a(xml, "phenotype-registration");
                                            String str3 = ((braj) braf.f164949b).f142144d;
                                            if (!str3.isEmpty()) {
                                                if (z) {
                                                    if (!str3.contains("#")) {
                                                        String str4 = packageInfo2.packageName;
                                                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
                                                        sb.append(str3);
                                                        sb.append("#");
                                                        sb.append(str4);
                                                        str3 = sb.toString();
                                                    } else {
                                                        Object[] objArr = new Object[4];
                                                        objArr[0] = "auto-subpackage";
                                                        objArr[1] = "configuration-package";
                                                        objArr[2] = "#";
                                                        objArr[i2] = str3;
                                                        throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", objArr));
                                                    }
                                                }
                                                if (braf.f164950c) {
                                                    braf.mo74035c();
                                                    braf.f164950c = false;
                                                }
                                                braj braj = (braj) braf.f164949b;
                                                str3.getClass();
                                                braj.f142141a |= 1;
                                                braj.f142144d = str3;
                                                arrayList2.add((braj) braf.mo74062i());
                                            } else {
                                                throw new IllegalArgumentException("Empty configuration package");
                                            }
                                        } else {
                                            String name3 = xml.getName();
                                            switch (name3.hashCode()) {
                                                case -995427962:
                                                    if (name3.equals("params")) {
                                                        c = 3;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case -260675356:
                                                    if (name3.equals("auto-subpackage")) {
                                                        c = 4;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 515651183:
                                                    if (name3.equals("configuration-package")) {
                                                        c = 0;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 770547247:
                                                    if (name3.equals("log-sources")) {
                                                        c = 2;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 1674321665:
                                                    if (name3.equals("configuration-version")) {
                                                        c = 1;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 2055708904:
                                                    if (name3.equals("experiment-ids")) {
                                                        c = 5;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                default:
                                                    c = 65535;
                                                    break;
                                            }
                                            if (c == 0) {
                                                String nextText = xml.nextText();
                                                if (braf.f164950c) {
                                                    braf.mo74035c();
                                                    braf.f164950c = false;
                                                }
                                                braj braj2 = (braj) braf.f164949b;
                                                nextText.getClass();
                                                braj2.f142141a |= 1;
                                                braj2.f142144d = nextText;
                                            } else if (c == 1) {
                                                int parseInt = Integer.parseInt(xml.nextText());
                                                if (braf.f164950c) {
                                                    braf.mo74035c();
                                                    braf.f164950c = false;
                                                }
                                                braj braj3 = (braj) braf.f164949b;
                                                braj3.f142141a |= 2;
                                                braj3.f142145e = parseInt;
                                            } else if (c == 2) {
                                                m91663b(xml, "log-sources");
                                                ArrayList arrayList3 = new ArrayList();
                                                while (xml.nextTag() != 3) {
                                                    String name4 = xml.getName();
                                                    if ("log-source".equals(name4)) {
                                                        arrayList3.add(xml.nextText());
                                                    } else {
                                                        m91661a(xml);
                                                    }
                                                    m91662a(xml, name4);
                                                }
                                                m91662a(xml, "log-sources");
                                                braf.mo69472a(arrayList3);
                                            } else if (c == 3) {
                                                ByteString a = ByteString.m123261a(Base64.decode(xml.nextText(), 8));
                                                if (braf.f164950c) {
                                                    braf.mo74035c();
                                                    braf.f164950c = false;
                                                }
                                                braj braj4 = (braj) braf.f164949b;
                                                a.getClass();
                                                braj4.f142141a |= 4;
                                                braj4.f142148h = a;
                                            } else if (c == 4) {
                                                z = Boolean.parseBoolean(xml.nextText());
                                            } else if (c != 5) {
                                                m91661a(xml);
                                            } else {
                                                m91663b(xml, "experiment-ids");
                                                ArrayList arrayList4 = new ArrayList();
                                                while (xml.nextTag() != 3) {
                                                    String name5 = xml.getName();
                                                    if ("experiment-id".equals(name5)) {
                                                        arrayList4.add(Integer.valueOf(Integer.parseInt(xml.nextText())));
                                                    } else {
                                                        m91661a(xml);
                                                    }
                                                    m91662a(xml, name5);
                                                }
                                                m91662a(xml, "experiment-ids");
                                                if (braf.f164950c) {
                                                    braf.mo74035c();
                                                    braf.f164950c = false;
                                                }
                                                braj braj5 = (braj) braf.f164949b;
                                                braj5.mo69473a();
                                                bxsy.m123078a(arrayList4, braj5.f142147g);
                                                if (braf.f164950c) {
                                                    braf.mo74035c();
                                                    braf.f164950c = false;
                                                }
                                                braj braj6 = (braj) braf.f164949b;
                                                braj6.f142141a |= 8;
                                                braj6.f142149i = true;
                                            }
                                            m91662a(xml, name3);
                                            name = str2;
                                            i2 = 3;
                                        }
                                    }
                                } else {
                                    str2 = name;
                                    m91661a(xml);
                                }
                                m91662a(xml, name2);
                                name = str2;
                            } else {
                                str = name;
                                m91662a(xml, "phenotype-registrations");
                                arrayList.addAll(arrayList2);
                            }
                        }
                    } else {
                        str = name;
                        m91661a(xml);
                    }
                    m91662a(xml, str);
                } else {
                    int eventType = xml.getEventType();
                    StringBuilder sb2 = new StringBuilder(29);
                    sb2.append("Unexpected event: ");
                    sb2.append(eventType);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            return arrayList;
        } finally {
            xml.close();
        }
    }

    /* renamed from: b */
    private static final void m91663b(XmlResourceParser xmlResourceParser, String str) {
        if (xmlResourceParser.getEventType() != 2) {
            int lineNumber = xmlResourceParser.getLineNumber();
            StringBuilder sb = new StringBuilder(str.length() + 46);
            sb.append("Expected a start tag named ");
            sb.append(str);
            sb.append(" (line ");
            sb.append(lineNumber);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } else if (!str.equals(xmlResourceParser.getName())) {
            int lineNumber2 = xmlResourceParser.getLineNumber();
            String name = xmlResourceParser.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 53 + str.length());
            sb2.append("Unexpected start tag at line ");
            sb2.append(lineNumber2);
            sb2.append(": ");
            sb2.append(name);
            sb2.append(". Expected ");
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private final void m91661a(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        while (xmlResourceParser.next() != 3) {
            int eventType = xmlResourceParser.getEventType();
            if (eventType == 2) {
                m91661a(xmlResourceParser);
            } else if (eventType == 4) {
                xmlResourceParser.next();
                m91662a(xmlResourceParser, name);
                return;
            } else {
                int eventType2 = xmlResourceParser.getEventType();
                StringBuilder sb = new StringBuilder(29);
                sb.append("Unexpected event: ");
                sb.append(eventType2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m91662a(xmlResourceParser, name);
    }

    /* renamed from: a */
    private static final void m91662a(XmlResourceParser xmlResourceParser, String str) {
        if (xmlResourceParser.getEventType() != 3) {
            int lineNumber = xmlResourceParser.getLineNumber();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45);
            sb.append("Expected an end tag named ");
            sb.append(str);
            sb.append(" (line ");
            sb.append(lineNumber);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } else if (!str.equals(xmlResourceParser.getName())) {
            int lineNumber2 = xmlResourceParser.getLineNumber();
            String name = xmlResourceParser.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(name).length());
            sb2.append("Mismatched end tag at line ");
            sb2.append(lineNumber2);
            sb2.append(". Expected ");
            sb2.append(str);
            sb2.append(" but was ");
            sb2.append(name);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x033d A[Catch:{ Exception -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0183 A[Catch:{ Exception -> 0x034c }] */
    /* renamed from: a */
    public final List mo58477a(PackageInfo packageInfo) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int i2;
        PackageInfo packageInfo2 = packageInfo;
        if (packageInfo2 != null) {
            int i3 = 1;
            boolean z = false;
            try {
                if (packageInfo2.applicationInfo == null || packageInfo2.applicationInfo.metaData == null) {
                    arrayList = new ArrayList();
                    if (packageInfo2.applicationInfo == null) {
                        i = packageInfo2.applicationInfo.metaData.getInt("com.google.android.gms.phenotype.registration.array", 0);
                        if (i == 0) {
                        }
                        arrayList.addAll(arrayList2);
                        return arrayList;
                    }
                    arrayList2 = new ArrayList();
                    arrayList.addAll(arrayList2);
                    return arrayList;
                }
                ArrayList<braj> arrayList3 = new ArrayList();
                for (String str : packageInfo2.applicationInfo.metaData.keySet()) {
                    if (!"com.google.android.gms.phenotype.registration.xml".equals(str)) {
                        if (!str.startsWith("com.google.android.gms.phenotype.registration.xml:")) {
                        }
                    }
                    int i4 = packageInfo2.applicationInfo.metaData.getInt(str, 0);
                    if (i4 != 0) {
                        arrayList3.addAll(m91660a(i4, packageInfo2));
                    }
                }
                if (packageInfo2.services != null) {
                    ServiceInfo[] serviceInfoArr = packageInfo2.services;
                    int length = serviceInfoArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        ServiceInfo serviceInfo = serviceInfoArr[i5];
                        if (serviceInfo != null) {
                            if ("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(serviceInfo.name)) {
                                if (serviceInfo.metaData != null) {
                                    for (String str2 : serviceInfo.metaData.keySet()) {
                                        if (("com.google.android.gms.phenotype.registration.xml".equals(str2) || str2.startsWith("com.google.android.gms.phenotype.registration.xml:")) && (i2 = serviceInfo.metaData.getInt(str2, 0)) != 0) {
                                            for (braj braj : m91660a(i2, packageInfo2)) {
                                                bxvd bxvd = (bxvd) braj.mo74142c(5);
                                                bxvd.mo73625a((GeneratedMessageLite) braj);
                                                braf braf = (braf) bxvd;
                                                if (braf.f164950c) {
                                                    braf.mo74035c();
                                                    braf.f164950c = false;
                                                }
                                                braj braj2 = (braj) braf.f164949b;
                                                braj braj3 = braj.f142139l;
                                                braj2.f142151k = 1;
                                                braj2.f142141a |= 128;
                                                arrayList3.add((braj) braf.mo74062i());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5++;
                    }
                }
                arrayList = new ArrayList(arrayList3.size());
                for (braj braj4 : arrayList3) {
                    bxvd bxvd2 = (bxvd) braj4.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) braj4);
                    braf braf2 = (braf) bxvd2;
                    String str3 = packageInfo2.packageName;
                    if (braf2.f164950c) {
                        braf2.mo74035c();
                        braf2.f164950c = false;
                    }
                    braj braj5 = (braj) braf2.f164949b;
                    braj braj6 = braj.f142139l;
                    str3.getClass();
                    braj5.f142142b = 7;
                    braj5.f142143c = str3;
                    if (braj4.f142145e == 0) {
                        int i6 = packageInfo2.versionCode;
                        if (braf2.f164950c) {
                            braf2.mo74035c();
                            braf2.f164950c = false;
                        }
                        braj braj7 = (braj) braf2.f164949b;
                        braj7.f142141a |= 2;
                        braj7.f142145e = i6;
                    }
                    braj braj8 = (braj) braf2.f164949b;
                    braj8.f142150j = 2;
                    braj8.f142141a |= 64;
                    arrayList.add((braj) braf2.mo74062i());
                }
                try {
                    if (packageInfo2.applicationInfo == null || packageInfo2.applicationInfo.metaData == null) {
                        arrayList2 = new ArrayList();
                    } else {
                        i = packageInfo2.applicationInfo.metaData.getInt("com.google.android.gms.phenotype.registration.array", 0);
                        if (i == 0) {
                            Resources resourcesForApplication = this.f106740a.getResourcesForApplication(packageInfo2.packageName);
                            String[] stringArray = resourcesForApplication.getStringArray(i);
                            if (stringArray != null) {
                                int length2 = stringArray.length;
                                arrayList2 = new ArrayList(length2);
                                int i7 = 0;
                                while (i7 < length2) {
                                    String str4 = stringArray[i7];
                                    braf braf3 = (braf) braj.f142139l.mo74144da();
                                    if (braf3.f164950c) {
                                        braf3.mo74035c();
                                        braf3.f164950c = z;
                                    }
                                    braj braj9 = (braj) braf3.f164949b;
                                    str4.getClass();
                                    braj9.f142141a |= i3;
                                    braj9.f142144d = str4;
                                    String str5 = packageInfo2.packageName;
                                    if (braf3.f164950c) {
                                        braf3.mo74035c();
                                        braf3.f164950c = z;
                                    }
                                    braj braj10 = (braj) braf3.f164949b;
                                    str5.getClass();
                                    braj10.f142142b = 7;
                                    braj10.f142143c = str5;
                                    braj10.f142150j = 2;
                                    braj10.f142141a |= 64;
                                    String replaceAll = str4.replaceAll("[^A-Za-z0-9]", "_");
                                    String valueOf = String.valueOf(replaceAll);
                                    int identifier = resourcesForApplication.getIdentifier(valueOf.length() == 0 ? new String("phenotype_version_") : "phenotype_version_".concat(valueOf), "integer", packageInfo2.packageName);
                                    if (identifier != 0) {
                                        int integer = resourcesForApplication.getInteger(identifier);
                                        if (braf3.f164950c) {
                                            braf3.mo74035c();
                                            braf3.f164950c = false;
                                        }
                                        braj braj11 = (braj) braf3.f164949b;
                                        braj11.f142141a |= 2;
                                        braj11.f142145e = integer;
                                    } else {
                                        int i8 = packageInfo2.versionCode;
                                        if (braf3.f164950c) {
                                            braf3.mo74035c();
                                            braf3.f164950c = false;
                                        }
                                        braj braj12 = (braj) braf3.f164949b;
                                        braj12.f142141a |= 2;
                                        braj12.f142145e = i8;
                                    }
                                    String valueOf2 = String.valueOf(replaceAll);
                                    int identifier2 = resourcesForApplication.getIdentifier(valueOf2.length() == 0 ? new String("phenotype_logSources_") : "phenotype_logSources_".concat(valueOf2), "array", packageInfo2.packageName);
                                    if (identifier2 != 0) {
                                        String[] stringArray2 = resourcesForApplication.getStringArray(identifier2);
                                        if (stringArray2 != null) {
                                            braf3.mo69472a(Arrays.asList(stringArray2));
                                        }
                                    }
                                    String valueOf3 = String.valueOf(replaceAll);
                                    int identifier3 = resourcesForApplication.getIdentifier(valueOf3.length() == 0 ? new String("phenotype_params_") : "phenotype_params_".concat(valueOf3), "string", packageInfo2.packageName);
                                    if (identifier3 != 0) {
                                        ByteString a = ByteString.m123261a(Base64.decode(resourcesForApplication.getString(identifier3), 8));
                                        if (braf3.f164950c) {
                                            braf3.mo74035c();
                                            braf3.f164950c = false;
                                        }
                                        braj braj13 = (braj) braf3.f164949b;
                                        a.getClass();
                                        braj13.f142141a |= 4;
                                        braj13.f142148h = a;
                                    }
                                    String valueOf4 = String.valueOf(replaceAll);
                                    int identifier4 = resourcesForApplication.getIdentifier(valueOf4.length() == 0 ? new String("phenotype_subpackage_") : "phenotype_subpackage_".concat(valueOf4), "string", packageInfo2.packageName);
                                    if (identifier4 == 0) {
                                        z = false;
                                    } else {
                                        String string = resourcesForApplication.getString(identifier4);
                                        if (string == null) {
                                            z = false;
                                        } else if (!string.isEmpty()) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + string.length());
                                            sb.append(str4);
                                            sb.append("#");
                                            sb.append(string);
                                            String sb2 = sb.toString();
                                            if (!braf3.f164950c) {
                                                z = false;
                                            } else {
                                                braf3.mo74035c();
                                                z = false;
                                                braf3.f164950c = false;
                                            }
                                            braj braj14 = (braj) braf3.f164949b;
                                            sb2.getClass();
                                            braj14.f142141a |= 1;
                                            braj14.f142144d = sb2;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    arrayList2.add((braj) braf3.mo74062i());
                                    i7++;
                                    i3 = 1;
                                }
                            } else {
                                arrayList2 = new ArrayList();
                            }
                        } else {
                            arrayList2 = new ArrayList();
                        }
                    }
                    arrayList.addAll(arrayList2);
                } catch (Exception e) {
                    Log.e("PhenotypeResourceReader", "Error reading phenotype alternate registration format: ", e);
                }
                return arrayList;
            } catch (Exception e2) {
                Log.e("PhenotypeResourceReader", "Error reading phenotype XML registration format: ", e2);
                arrayList = new ArrayList();
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }
}

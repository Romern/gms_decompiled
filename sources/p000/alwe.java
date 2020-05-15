package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: alwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwe {

    /* renamed from: j */
    private static final String[] f74441j = {"android.provider.ALTERNATE_CONTACTS_STRUCTURE", "android.provider.CONTACTS_STRUCTURE"};

    /* renamed from: a */
    public String f74442a = null;

    /* renamed from: b */
    public String f74443b = null;

    /* renamed from: c */
    public String f74444c;

    /* renamed from: d */
    public int f74445d = -1;

    /* renamed from: e */
    public int f74446e = -1;

    /* renamed from: f */
    public HashMap f74447f = new HashMap();

    /* renamed from: g */
    public boolean f74448g;

    /* renamed from: h */
    public List f74449h;

    /* renamed from: i */
    public boolean f74450i;

    /* renamed from: k */
    private ArrayList f74451k = new ArrayList();

    /* renamed from: l */
    private String f74452l;

    /* renamed from: m */
    private String f74453m;

    /* renamed from: n */
    private String f74454n;

    /* renamed from: o */
    private String f74455o;

    /* renamed from: a */
    static int m61993a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.charAt(0) != '@') {
            Log.e("ExAccountType", str3.concat(" must be a resource name beginning with '@'"));
            return -1;
        }
        try {
            int identifier = context.getPackageManager().getResourcesForApplication(str2).getIdentifier(str.substring(1), null, str2);
            if (identifier != 0) {
                return identifier;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(str2).length());
            sb.append("Unable to load ");
            sb.append(str);
            sb.append(" from package ");
            sb.append(str2);
            Log.e("ExAccountType", sb.toString());
            return -1;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(str2);
            Log.e("ExAccountType", valueOf.length() == 0 ? new String("Unable to load package ") : "Unable to load package ".concat(valueOf));
            return -1;
        }
    }

    public alwe(Context context, String str) {
        XmlResourceParser xmlResourceParser = null;
        this.f74444c = str;
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.content.SyncAdapter").setPackage(str), 132);
        if (queryIntentServices != null) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    for (String str2 : f74441j) {
                        XmlResourceParser loadXmlMetaData = serviceInfo.loadXmlMetaData(packageManager, str2);
                        if (loadXmlMetaData != null) {
                            xmlResourceParser = loadXmlMetaData;
                            break loop0;
                        }
                    }
                    continue;
                }
            }
        }
        if (xmlResourceParser != null) {
            try {
                m61994a(context, xmlResourceParser);
            } catch (alwd e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Problem reading XML");
                if (xmlResourceParser != null) {
                    sb.append(" in line ");
                    sb.append(xmlResourceParser.getLineNumber());
                }
                sb.append(" for external package ");
                sb.append(str);
                Log.e("ExAccountType", sb.toString(), e);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        }
        if (xmlResourceParser != null) {
            xmlResourceParser.close();
        }
        this.f74449h = new ArrayList();
        m61993a(context, this.f74452l, str, "inviteContactActionLabel");
        m61993a(context, this.f74453m, str, "viewGroupActionLabel");
        this.f74445d = m61993a(context, this.f74454n, str, "accountTypeLabel");
        this.f74446e = m61993a(context, this.f74455o, str, "accountTypeIcon");
        this.f74448g = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r1 = new java.lang.String("Top level element must be ContactsAccountType, not ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r1 = "Top level element must be ContactsAccountType, not ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r11.f74450i = true;
        r2 = r13.getAttributeCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r6 >= r2) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8 = r13.getAttributeName(r6);
        r9 = r13.getAttributeValue(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if ("editContactActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if ("createContactActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if ("inviteContactActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if ("inviteContactActionLabel".equals(r8) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if ("viewContactNotifyService".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if ("viewGroupActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        if ("viewGroupActionLabel".equals(r8) != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        if ("viewStreamItemActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if ("viewStreamItemPhotoActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if ("dataSet".equals(r8) != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
        if ("extensionPackageNames".equals(r8) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if ("accountType".equals(r8) != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if ("accountTypeLabel".equals(r8) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if ("accountTypeIcon".equals(r8) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
        if ("readOnly".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
        r8 = java.lang.String.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r13.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        if (r8.length() != 0) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        r8 = new java.lang.String("Unsupported attribute ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
        r8 = "Unsupported attribute ".concat(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
        android.util.Log.e("ExAccountType", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e4, code lost:
        r11.f74455o = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e7, code lost:
        r11.f74454n = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
        r11.f74442a = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ed, code lost:
        r11.f74449h.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
        r11.f74443b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f6, code lost:
        r11.f74453m = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ("ContactsAccountType".equals(r2) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f9, code lost:
        r11.f74452l = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fb, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ff, code lost:
        r2 = r13.getDepth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
        r6 = r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        if (r6 != 3) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        if (r13.getDepth() <= r2) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0110, code lost:
        if (r6 == 1) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0112, code lost:
        if (r6 != 2) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011a, code lost:
        if (r13.getDepth() != (r2 + 1)) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0126, code lost:
        if ("ContactsDataKind".equals(r13.getName()) == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0128, code lost:
        r6 = r12.obtainStyledAttributes(r1, new int[]{16842790, 16843426, 16843427});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013d, code lost:
        if (r6 != null) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013f, code lost:
        android.util.Log.e("ExAccountType", "Failed to obtain ContactsDataKind styled attributes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0145, code lost:
        r8 = r6.getString(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014a, code lost:
        if (r8 == null) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014c, code lost:
        r9 = new p000.alwg();
        r9.f74461b = r8;
        r8 = r6.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0157, code lost:
        if (r8 != null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if ("ContactsSource".equals(r2) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015a, code lost:
        r9.f74462c = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015c, code lost:
        r8 = r6.getString(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0161, code lost:
        if (r8 != null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0164, code lost:
        r9.f74463d = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0166, code lost:
        r6.recycle();
        r6 = r9.f74461b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016b, code lost:
        if (r6 == null) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0173, code lost:
        if (r11.f74447f.get(r6) != null) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0175, code lost:
        r9.f74460a = r11.f74444c;
        r11.f74451k.add(r9);
        r11.f74447f.put(r9.f74461b, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0187, code lost:
        r13 = r9.f74461b;
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r13).length() + 34);
        r2.append("mime type '");
        r2.append(r13);
        r2.append("' is already registered");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ae, code lost:
        throw new p000.alwd(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        throw new p000.alwd("null is not a valid mime type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b7, code lost:
        android.util.Log.e("ExAccountType", "Failed to obtain mimeType from ContactsDataKind styled attributes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r1.length() != 0) goto L_0x0036;
     */
    /* renamed from: a */
    private final void m61994a(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    break;
                } else if (next == 1) {
                    throw new IllegalStateException("No start tag found");
                }
            } catch (XmlPullParserException e) {
                throw new alwd("Problem reading XML", e);
            } catch (IOException e2) {
                throw new alwd("Problem reading XML", e2);
            }
        }
    }
}

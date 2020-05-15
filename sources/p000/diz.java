package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: diz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class diz {

    /* renamed from: a */
    private static final Set f13288a = bnic.m109492a("activity", "service", "receiver", "provider");

    /* renamed from: d */
    private static int f13289d = 0;

    /* renamed from: e */
    private static final dka f13290e = new dka();

    /* renamed from: b */
    private final Context f13291b;

    /* renamed from: c */
    private final Set f13292c;

    /* renamed from: f */
    private final dka f13293f = new dka();

    /* renamed from: g */
    private final dmx f13294g = new dmx();

    /* renamed from: h */
    private final dnf f13295h = new dnf();

    /* renamed from: i */
    private final dne f13296i = new dne();

    /* renamed from: j */
    private final dnd f13297j = new dnd();

    /* renamed from: k */
    private final dng f13298k = new dng();

    public diz(Context context, Iterable iterable) {
        this.f13291b = context;
        this.f13292c = bnic.m109488a(iterable);
    }

    /* renamed from: a */
    private static int m8600a(int i) {
        if (i != 1) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static boolean m8604a(int i, boolean z) {
        if (i == 1) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r2 == null) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ea A[Catch:{ IOException | XmlPullParserException -> 0x0205, all -> 0x0203 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0545 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x01f9 A[SYNTHETIC] */
    /* renamed from: b */
    private final void m8606b(djz djz, Set set) {
        int i;
        Throwable th;
        ComponentName componentName;
        String str;
        String str2;
        String str3;
        String str4;
        Exception exc;
        String valueOf;
        StringBuilder sb;
        Throwable th2;
        XmlResourceParser xmlResourceParser;
        XmlPullParserException xmlPullParserException;
        int i2;
        ComponentName componentName2;
        String str5;
        XmlResourceParser xmlResourceParser2;
        int i3;
        int i4;
        Throwable th3;
        XmlResourceParser xmlResourceParser3;
        int i5;
        boolean z;
        int i6;
        dne dne;
        int i7;
        dnd dnd;
        int i8;
        int i9;
        dng dng;
        dnf dnf;
        int i10;
        dmx dmx;
        int i11;
        int i12;
        djz djz2 = djz;
        Set set2 = set;
        String str6 = "Cannot set component-enabled-setting on the pending provider: ";
        String str7 = " to ";
        String packageName = this.f13291b.getPackageName();
        int i13 = 0;
        int i14 = -1;
        try {
            xmlResourceParser = mo9108a(packageName, f13289d);
        } catch (IOException e) {
            xmlResourceParser = null;
        } catch (XmlPullParserException e2) {
            xmlPullParserException = e2;
            str4 = str6;
            str3 = str7;
            componentName = null;
            i = -1;
            try {
                dgd.m8383a(this.f13291b, 41, exc.toString());
                String valueOf2 = String.valueOf(exc);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                sb2.append("Cannot parse all proxy components from manifest. ");
                sb2.append(valueOf2);
                Log.e("ComponentsEnabler", sb2.toString());
                if (componentName == null) {
                }
            } catch (Throwable th4) {
                str = str4;
                str2 = str3;
                th = th4;
                if (componentName != null) {
                }
                throw th;
            }
        } catch (Throwable th5) {
            th2 = th5;
            str4 = str6;
            str3 = str7;
            th = th2;
            componentName = null;
            str = str4;
            str2 = str3;
            i = -1;
            if (componentName != null) {
            }
            throw th;
        }
        if (i12 == 0) {
            z = this.f13291b.getResources().getBoolean(i12);
        }
        i5++;
        i3 = i6;
        str5 = str4;
        componentName2 = str3;
        int i15 = 0;
        while (xmlResourceParser == null) {
            str4 = str6;
            str3 = str7;
            try {
                if (i15 != f13289d) {
                    xmlResourceParser = mo9108a(packageName, i15);
                }
                i15++;
                str6 = str4;
                str7 = str3;
                i14 = -1;
                i13 = 0;
            } catch (IOException | XmlPullParserException e3) {
                e = e3;
                xmlPullParserException = e;
                componentName = null;
                i = -1;
                dgd.m8383a(this.f13291b, 41, exc.toString());
                String valueOf22 = String.valueOf(exc);
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 49);
                sb22.append("Cannot parse all proxy components from manifest. ");
                sb22.append(valueOf22);
                Log.e("ComponentsEnabler", sb22.toString());
                if (componentName == null) {
                }
            } catch (Throwable th6) {
                th = th6;
                th2 = th;
                th = th2;
                componentName = null;
                str = str4;
                str2 = str3;
                i = -1;
                if (componentName != null) {
                }
                throw th;
            }
        }
        try {
            f13289d = i15 + i14;
            xmlResourceParser2 = xmlResourceParser;
            int next = xmlResourceParser2.next();
            componentName = null;
            i3 = -1;
            while (next != 1) {
                if (next == 0) {
                    i4 = i3;
                    xmlResourceParser3 = xmlResourceParser2;
                    str4 = str5;
                    str3 = componentName2;
                    componentName2 = componentName;
                } else if (next == 2) {
                    try {
                        String name = xmlResourceParser2.getName();
                        if (xmlResourceParser2.getDepth() != 3 || !f13288a.contains(name)) {
                            i4 = i3;
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser2;
                            str4 = str5;
                            str3 = componentName2;
                            ComponentName componentName3 = componentName;
                            next = xmlResourceParser4.next();
                            componentName = componentName3;
                            i3 = i4;
                            xmlResourceParser2 = xmlResourceParser4;
                            str5 = str4;
                            componentName2 = str3;
                            i2 = 0;
                        } else {
                            ComponentName componentName4 = componentName;
                            String str8 = null;
                            String str9 = null;
                            i5 = 0;
                            boolean z2 = true;
                            z = false;
                            while (true) {
                                i6 = i3;
                                try {
                                    if (i5 >= xmlResourceParser2.getAttributeCount()) {
                                        break;
                                    }
                                    str4 = str5;
                                    try {
                                        if ("name".equals(xmlResourceParser2.getAttributeName(i5))) {
                                            try {
                                                if ("http://schemas.android.com/apk/res/android".equals(xmlResourceParser2.getAttributeNamespace(i5))) {
                                                    str8 = xmlResourceParser2.getAttributeValue(i5);
                                                    str3 = componentName2;
                                                    i5++;
                                                    i3 = i6;
                                                    str5 = str4;
                                                    componentName2 = str3;
                                                }
                                            } catch (IOException | XmlPullParserException e4) {
                                                exc = e4;
                                                str3 = componentName2;
                                                componentName2 = componentName4;
                                                i4 = i6;
                                                componentName = componentName2;
                                                i = i4;
                                                dgd.m8383a(this.f13291b, 41, exc.toString());
                                                String valueOf222 = String.valueOf(exc);
                                                StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf222).length() + 49);
                                                sb222.append("Cannot parse all proxy components from manifest. ");
                                                sb222.append(valueOf222);
                                                Log.e("ComponentsEnabler", sb222.toString());
                                                if (componentName == null) {
                                                }
                                            } catch (Throwable th7) {
                                                th3 = th7;
                                                str3 = componentName2;
                                                componentName2 = componentName4;
                                                i4 = i6;
                                                th = th3;
                                                componentName = componentName2;
                                                i = i4;
                                                str = str4;
                                                str2 = str3;
                                                if (componentName != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        str3 = componentName2;
                                    } catch (IOException | XmlPullParserException e5) {
                                        e = e5;
                                        str3 = componentName2;
                                        exc = e;
                                        componentName2 = componentName4;
                                        i4 = i6;
                                        componentName = componentName2;
                                        i = i4;
                                        dgd.m8383a(this.f13291b, 41, exc.toString());
                                        String valueOf2222 = String.valueOf(exc);
                                        StringBuilder sb2222 = new StringBuilder(String.valueOf(valueOf2222).length() + 49);
                                        sb2222.append("Cannot parse all proxy components from manifest. ");
                                        sb2222.append(valueOf2222);
                                        Log.e("ComponentsEnabler", sb2222.toString());
                                        if (componentName == null) {
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        str3 = componentName2;
                                        th3 = th;
                                        componentName2 = componentName4;
                                        i4 = i6;
                                        th = th3;
                                        componentName = componentName2;
                                        i = i4;
                                        str = str4;
                                        str2 = str3;
                                        if (componentName != null) {
                                        }
                                        throw th;
                                    }
                                    try {
                                        if (!"enabled".equals(xmlResourceParser2.getAttributeName(i5)) || !"http://schemas.android.com/apk/res/android".equals(xmlResourceParser2.getAttributeNamespace(i5))) {
                                            if ("implementingModuleId".equals(xmlResourceParser2.getAttributeName(i5))) {
                                                if ("http://schemas.android.com/chimera".equals(xmlResourceParser2.getAttributeNamespace(i5))) {
                                                    str9 = xmlResourceParser2.getAttributeValue(i5);
                                                    i5++;
                                                    i3 = i6;
                                                    str5 = str4;
                                                    componentName2 = str3;
                                                }
                                            }
                                            if ("autoEnabled".equals(xmlResourceParser2.getAttributeName(i5))) {
                                                if ("http://schemas.android.com/chimera".equals(xmlResourceParser2.getAttributeNamespace(i5))) {
                                                    String attributeValue = xmlResourceParser2.getAttributeValue(i5);
                                                    if (attributeValue != null) {
                                                        if (attributeValue.equals("true")) {
                                                            z = true;
                                                        } else if (attributeValue.startsWith("@")) {
                                                            if (attributeValue.startsWith("@bool/")) {
                                                                i12 = this.f13291b.getResources().getIdentifier(attributeValue.substring(6), "bool", packageName);
                                                            } else {
                                                                try {
                                                                    i12 = Integer.decode(attributeValue.substring(1)).intValue();
                                                                } catch (NumberFormatException e6) {
                                                                    String valueOf3 = String.valueOf(e6);
                                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 46);
                                                                    sb3.append("Couldn't parse autoEnabled value in manifest: ");
                                                                    sb3.append(valueOf3);
                                                                    Log.e("ComponentsEnabler", sb3.toString());
                                                                    i12 = 0;
                                                                }
                                                            }
                                                            if (i12 == 0) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i5++;
                                            i3 = i6;
                                            str5 = str4;
                                            componentName2 = str3;
                                        } else {
                                            z2 = !"false".equals(xmlResourceParser2.getAttributeValue(i5));
                                            i5++;
                                            i3 = i6;
                                            str5 = str4;
                                            componentName2 = str3;
                                        }
                                    } catch (IOException | XmlPullParserException e7) {
                                        e = e7;
                                        exc = e;
                                        componentName2 = componentName4;
                                        i4 = i6;
                                        componentName = componentName2;
                                        i = i4;
                                        dgd.m8383a(this.f13291b, 41, exc.toString());
                                        String valueOf22222 = String.valueOf(exc);
                                        StringBuilder sb22222 = new StringBuilder(String.valueOf(valueOf22222).length() + 49);
                                        sb22222.append("Cannot parse all proxy components from manifest. ");
                                        sb22222.append(valueOf22222);
                                        Log.e("ComponentsEnabler", sb22222.toString());
                                        if (componentName == null) {
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        th3 = th;
                                        componentName2 = componentName4;
                                        i4 = i6;
                                        th = th3;
                                        componentName = componentName2;
                                        i = i4;
                                        str = str4;
                                        str2 = str3;
                                        if (componentName != null) {
                                        }
                                        throw th;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                    str4 = str5;
                                    str3 = componentName2;
                                    componentName2 = componentName4;
                                    i4 = i6;
                                    exc = e;
                                    componentName = componentName2;
                                    i = i4;
                                    dgd.m8383a(this.f13291b, 41, exc.toString());
                                    String valueOf222222 = String.valueOf(exc);
                                    StringBuilder sb222222 = new StringBuilder(String.valueOf(valueOf222222).length() + 49);
                                    sb222222.append("Cannot parse all proxy components from manifest. ");
                                    sb222222.append(valueOf222222);
                                    Log.e("ComponentsEnabler", sb222222.toString());
                                    if (componentName == null) {
                                    }
                                } catch (XmlPullParserException e9) {
                                    e = e9;
                                    str4 = str5;
                                    str3 = componentName2;
                                    componentName2 = componentName4;
                                    i4 = i6;
                                    exc = e;
                                    componentName = componentName2;
                                    i = i4;
                                    dgd.m8383a(this.f13291b, 41, exc.toString());
                                    String valueOf2222222 = String.valueOf(exc);
                                    StringBuilder sb2222222 = new StringBuilder(String.valueOf(valueOf2222222).length() + 49);
                                    sb2222222.append("Cannot parse all proxy components from manifest. ");
                                    sb2222222.append(valueOf2222222);
                                    Log.e("ComponentsEnabler", sb2222222.toString());
                                    if (componentName == null) {
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    str4 = str5;
                                    str3 = componentName2;
                                    componentName2 = componentName4;
                                    i4 = i6;
                                    th3 = th;
                                    th = th3;
                                    componentName = componentName2;
                                    i = i4;
                                    str = str4;
                                    str2 = str3;
                                    if (componentName != null) {
                                    }
                                    throw th;
                                }
                            }
                            str4 = str5;
                            str3 = componentName2;
                            if (!z) {
                                xmlResourceParser3 = xmlResourceParser2;
                                componentName2 = componentName4;
                                i4 = i6;
                            } else if (str8 != null) {
                                try {
                                    ComponentName componentName5 = new ComponentName(this.f13291b, str8);
                                    if (name.equals("activity")) {
                                        brtm f = djz.mo9181f();
                                        dmx dmx2 = this.f13294g;
                                        String a = dmv.m8834a(djz.mo9181f().mo69896E(), componentName5.getClassName());
                                        int __offset = f.__offset(22);
                                        if (__offset != 0) {
                                            dmx = dmx.m8846a(dmx2, f.__vector(__offset), a, f.f143329bb);
                                        } else {
                                            dmx = null;
                                        }
                                        if (dmx != null) {
                                            i11 = this.f13294g.mo9290S();
                                        } else {
                                            i11 = -1;
                                        }
                                        componentName5.toShortString();
                                        if (m8605a(set2, djz2, i11)) {
                                            componentName2 = componentName4;
                                            i4 = i6;
                                            xmlResourceParser3 = xmlResourceParser2;
                                            try {
                                                m8603a(componentName5, str9, djz, i11, z2, this.f13291b);
                                            } catch (IOException | XmlPullParserException e10) {
                                                e = e10;
                                                exc = e;
                                                componentName = componentName2;
                                                i = i4;
                                                dgd.m8383a(this.f13291b, 41, exc.toString());
                                                String valueOf22222222 = String.valueOf(exc);
                                                StringBuilder sb22222222 = new StringBuilder(String.valueOf(valueOf22222222).length() + 49);
                                                sb22222222.append("Cannot parse all proxy components from manifest. ");
                                                sb22222222.append(valueOf22222222);
                                                Log.e("ComponentsEnabler", sb22222222.toString());
                                                if (componentName == null) {
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                th3 = th;
                                                th = th3;
                                                componentName = componentName2;
                                                i = i4;
                                                str = str4;
                                                str2 = str3;
                                                if (componentName != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            xmlResourceParser3 = xmlResourceParser2;
                                            componentName2 = componentName4;
                                            i4 = i6;
                                        }
                                    } else {
                                        xmlResourceParser3 = xmlResourceParser2;
                                        componentName2 = componentName4;
                                        i4 = i6;
                                        if (name.equals("service")) {
                                            brtm f2 = djz.mo9181f();
                                            dnf dnf2 = this.f13295h;
                                            String a2 = dmv.m8834a(djz.mo9181f().mo69896E(), componentName5.getClassName());
                                            int __offset2 = f2.__offset(16);
                                            if (__offset2 != 0) {
                                                dnf = dnf.m8867a(dnf2, f2.__vector(__offset2), a2, f2.f143329bb);
                                            } else {
                                                dnf = null;
                                            }
                                            if (dnf != null) {
                                                i10 = this.f13295h.mo9290S();
                                            } else {
                                                i10 = -1;
                                            }
                                            componentName5.toShortString();
                                            if (m8605a(set2, djz2, i10)) {
                                                m8603a(componentName5, str9, djz, i10, z2, this.f13291b);
                                            }
                                        } else if (!name.equals("receiver")) {
                                            brtm f3 = djz.mo9181f();
                                            dnd dnd2 = this.f13297j;
                                            String a3 = dmv.m8834a(djz.mo9181f().mo69896E(), componentName5.getClassName());
                                            int __offset3 = f3.__offset(20);
                                            if (__offset3 != 0) {
                                                dnd = dnd.m8863a(dnd2, f3.__vector(__offset3), a3, f3.f143329bb);
                                            } else {
                                                dnd = null;
                                            }
                                            if (dnd == null) {
                                                brtm f4 = djz.mo9181f();
                                                dng dng2 = this.f13298k;
                                                String a4 = dmv.m8834a(djz.mo9181f().mo69896E(), componentName5.getClassName());
                                                int __offset4 = f4.__offset(34);
                                                if (__offset4 != 0) {
                                                    dng = dng.m8869a(dng2, f4.__vector(__offset4), a4, f4.f143329bb);
                                                } else {
                                                    dng = null;
                                                }
                                                if (dng != null) {
                                                    i8 = this.f13298k.mo9290S();
                                                } else {
                                                    i8 = -1;
                                                }
                                            } else {
                                                i8 = this.f13297j.mo9290S();
                                            }
                                            componentName5.toString();
                                            if (m8605a(set2, djz2, i8)) {
                                                i9 = m8600a(m8601a(djz2, i8, str9));
                                                if (m8604a(i9, z2)) {
                                                    if (componentName2 == null && !m8604a(this.f13291b.getPackageManager().getComponentEnabledSetting(componentName5), z2)) {
                                                    }
                                                }
                                                m8602a(i9, componentName5, z2, this.f13291b);
                                                i9 = -1;
                                            } else {
                                                i9 = -1;
                                            }
                                            if (i9 != -1) {
                                                componentName = componentName5;
                                                i3 = i9;
                                                next = xmlResourceParser3.next();
                                                xmlResourceParser2 = xmlResourceParser3;
                                                str5 = str4;
                                                componentName2 = str3;
                                                i2 = 0;
                                            }
                                        } else {
                                            brtm f5 = djz.mo9181f();
                                            dne dne2 = this.f13296i;
                                            String a5 = dmv.m8834a(djz.mo9181f().mo69896E(), componentName5.getClassName());
                                            int __offset5 = f5.__offset(18);
                                            if (__offset5 != 0) {
                                                dne = dne.m8865a(dne2, f5.__vector(__offset5), a5, f5.f143329bb);
                                            } else {
                                                dne = null;
                                            }
                                            if (dne != null) {
                                                i7 = this.f13296i.mo9290S();
                                            } else {
                                                i7 = -1;
                                            }
                                            componentName5.toShortString();
                                            if (m8605a(set2, djz2, i7)) {
                                                m8603a(componentName5, str9, djz, i7, z2, this.f13291b);
                                            }
                                        }
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    componentName2 = componentName4;
                                    i4 = i6;
                                    exc = e;
                                    componentName = componentName2;
                                    i = i4;
                                    dgd.m8383a(this.f13291b, 41, exc.toString());
                                    String valueOf222222222 = String.valueOf(exc);
                                    StringBuilder sb222222222 = new StringBuilder(String.valueOf(valueOf222222222).length() + 49);
                                    sb222222222.append("Cannot parse all proxy components from manifest. ");
                                    sb222222222.append(valueOf222222222);
                                    Log.e("ComponentsEnabler", sb222222222.toString());
                                    if (componentName == null) {
                                    }
                                } catch (XmlPullParserException e12) {
                                    e = e12;
                                    componentName2 = componentName4;
                                    i4 = i6;
                                    exc = e;
                                    componentName = componentName2;
                                    i = i4;
                                    dgd.m8383a(this.f13291b, 41, exc.toString());
                                    String valueOf2222222222 = String.valueOf(exc);
                                    StringBuilder sb2222222222 = new StringBuilder(String.valueOf(valueOf2222222222).length() + 49);
                                    sb2222222222.append("Cannot parse all proxy components from manifest. ");
                                    sb2222222222.append(valueOf2222222222);
                                    Log.e("ComponentsEnabler", sb2222222222.toString());
                                    if (componentName == null) {
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    componentName2 = componentName4;
                                    i4 = i6;
                                    th3 = th;
                                    th = th3;
                                    componentName = componentName2;
                                    i = i4;
                                    str = str4;
                                    str2 = str3;
                                    if (componentName != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                xmlResourceParser3 = xmlResourceParser2;
                                componentName2 = componentName4;
                                i4 = i6;
                            }
                        }
                    } catch (IOException | XmlPullParserException e13) {
                        e = e13;
                        i4 = i3;
                        str4 = str5;
                        str3 = componentName2;
                        componentName2 = componentName;
                        exc = e;
                        componentName = componentName2;
                        i = i4;
                        dgd.m8383a(this.f13291b, 41, exc.toString());
                        String valueOf22222222222 = String.valueOf(exc);
                        StringBuilder sb22222222222 = new StringBuilder(String.valueOf(valueOf22222222222).length() + 49);
                        sb22222222222.append("Cannot parse all proxy components from manifest. ");
                        sb22222222222.append(valueOf22222222222);
                        Log.e("ComponentsEnabler", sb22222222222.toString());
                        if (componentName == null) {
                            String valueOf4 = String.valueOf(componentName);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 40);
                            sb4.append("setting pending provider ");
                            sb4.append(valueOf4);
                            sb4.append(str3);
                            sb4.append(i);
                            Log.i("ComponentsEnabler", sb4.toString());
                            try {
                                this.f13291b.getPackageManager().setComponentEnabledSetting(componentName, i, 0);
                                return;
                            } catch (IllegalArgumentException e14) {
                                valueOf = String.valueOf(e14);
                                sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                                sb.append(str4);
                                sb.append(valueOf);
                                Log.e("ComponentsEnabler", sb.toString());
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        i4 = i3;
                        str4 = str5;
                        str3 = componentName2;
                        componentName2 = componentName;
                        th3 = th;
                        th = th3;
                        componentName = componentName2;
                        i = i4;
                        str = str4;
                        str2 = str3;
                        if (componentName != null) {
                            String valueOf5 = String.valueOf(componentName);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 40);
                            sb5.append("setting pending provider ");
                            sb5.append(valueOf5);
                            sb5.append(str2);
                            sb5.append(i);
                            Log.i("ComponentsEnabler", sb5.toString());
                            try {
                                this.f13291b.getPackageManager().setComponentEnabledSetting(componentName, i, 0);
                            } catch (IllegalArgumentException e15) {
                                String valueOf6 = String.valueOf(e15);
                                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 62);
                                sb6.append(str);
                                sb6.append(valueOf6);
                                Log.e("ComponentsEnabler", sb6.toString());
                            }
                        }
                        throw th;
                    }
                } else {
                    i4 = i3;
                    xmlResourceParser3 = xmlResourceParser2;
                    str4 = str5;
                    str3 = componentName2;
                    componentName2 = componentName;
                }
                componentName = componentName2;
                i3 = i4;
                try {
                    next = xmlResourceParser3.next();
                    xmlResourceParser2 = xmlResourceParser3;
                    str5 = str4;
                    componentName2 = str3;
                    i2 = 0;
                } catch (IOException | XmlPullParserException e16) {
                    exc = e16;
                    i = i3;
                    dgd.m8383a(this.f13291b, 41, exc.toString());
                    String valueOf222222222222 = String.valueOf(exc);
                    StringBuilder sb222222222222 = new StringBuilder(String.valueOf(valueOf222222222222).length() + 49);
                    sb222222222222.append("Cannot parse all proxy components from manifest. ");
                    sb222222222222.append(valueOf222222222222);
                    Log.e("ComponentsEnabler", sb222222222222.toString());
                    if (componentName == null) {
                    }
                } catch (Throwable th14) {
                    i = i3;
                    str = str4;
                    str2 = str3;
                    th = th14;
                    if (componentName != null) {
                    }
                    throw th;
                }
            }
        } catch (IOException | XmlPullParserException e17) {
            e = e17;
            str4 = str6;
            str3 = str7;
            xmlPullParserException = e;
            componentName = null;
            i = -1;
            dgd.m8383a(this.f13291b, 41, exc.toString());
            String valueOf2222222222222 = String.valueOf(exc);
            StringBuilder sb2222222222222 = new StringBuilder(String.valueOf(valueOf2222222222222).length() + 49);
            sb2222222222222.append("Cannot parse all proxy components from manifest. ");
            sb2222222222222.append(valueOf2222222222222);
            Log.e("ComponentsEnabler", sb2222222222222.toString());
            if (componentName == null) {
            }
        } catch (Throwable th15) {
            th = th15;
            str4 = str6;
            str3 = str7;
            th2 = th;
            th = th2;
            componentName = null;
            str = str4;
            str2 = str3;
            i = -1;
            if (componentName != null) {
            }
            throw th;
        }
        try {
            xmlResourceParser2.close();
            if (componentName != null) {
                String valueOf7 = String.valueOf(componentName);
                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf7).length() + 40);
                sb7.append("setting pending provider ");
                sb7.append(valueOf7);
                sb7.append(componentName2);
                sb7.append(i3);
                Log.i("ComponentsEnabler", sb7.toString());
                try {
                    this.f13291b.getPackageManager().setComponentEnabledSetting(componentName, i3, i2);
                } catch (IllegalArgumentException e18) {
                    valueOf = String.valueOf(e18);
                    sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                    sb.append(str5);
                    sb.append(valueOf);
                    Log.e("ComponentsEnabler", sb.toString());
                }
            }
        } catch (IOException | XmlPullParserException e19) {
            exc = e19;
            i4 = i3;
            str4 = str5;
            str3 = componentName2;
            componentName2 = componentName;
            componentName = componentName2;
            i = i4;
            dgd.m8383a(this.f13291b, 41, exc.toString());
            String valueOf22222222222222 = String.valueOf(exc);
            StringBuilder sb22222222222222 = new StringBuilder(String.valueOf(valueOf22222222222222).length() + 49);
            sb22222222222222.append("Cannot parse all proxy components from manifest. ");
            sb22222222222222.append(valueOf22222222222222);
            Log.e("ComponentsEnabler", sb22222222222222.toString());
            if (componentName == null) {
            }
        } catch (Throwable th16) {
            th3 = th16;
            i4 = i3;
            str4 = str5;
            str3 = componentName2;
            componentName2 = componentName;
            th = th3;
            componentName = componentName2;
            i = i4;
            str = str4;
            str2 = str3;
            if (componentName != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return r3;
     */
    /* renamed from: a */
    private static synchronized int m8601a(djz djz, int i, String str) {
        synchronized (diz.class) {
            if (i >= 0) {
                int i2 = djz.mo9169a(djz.mo9176b(i).mo9183R()).mo9149a() == 1 ? 2 : 3;
            } else if (str != null) {
                dka dka = f13290e;
                int __offset = djz.__offset(8);
                if ((__offset != 0 ? dka.m8717a(dka, djz.__vector(__offset), str, djz.f143329bb) : null) == null) {
                    return 4;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m8602a(int i, ComponentName componentName, boolean z, Context context) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(componentName);
            boolean a = m8604a(componentEnabledSetting, z);
            boolean a2 = m8604a(i, z);
            if (a != a2) {
                Log.i("ComponentsEnabler", String.format("auto-enabling %s from %d (effect: %b) to %d (effect: %b)", componentName, Integer.valueOf(componentEnabledSetting), Boolean.valueOf(a), Integer.valueOf(i), Boolean.valueOf(a2)));
                try {
                    context.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
                } catch (IllegalArgumentException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb.append("Cannot set component-enabled-setting: ");
                    sb.append(valueOf);
                    Log.e("ComponentsEnabler", sb.toString());
                }
            }
        } catch (IllegalArgumentException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
            sb2.append("Cannot get component-enabled-setting: ");
            sb2.append(valueOf2);
            Log.e("ComponentsEnabler", sb2.toString());
        }
    }

    /* renamed from: a */
    private static void m8603a(ComponentName componentName, String str, djz djz, int i, boolean z, Context context) {
        m8602a(m8600a(m8601a(djz, i, str)), componentName, z, context);
    }

    /* renamed from: a */
    private final boolean m8605a(Set set, djz djz, int i) {
        String str = null;
        if (i >= 0 && i < djz.mo9177c()) {
            djz.mo9171a(this.f13293f, i);
            str = this.f13293f.mo9184b();
        }
        if (str == null || set.contains(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* renamed from: a */
    public final XmlResourceParser mo9108a(String str, int i) {
        XmlResourceParser xmlResourceParser;
        try {
            xmlResourceParser = this.f13291b.getAssets().openXmlResourceParser(i, "AndroidManifest.xml");
            try {
                int next = xmlResourceParser.next();
                while (true) {
                    if (next == 1) {
                        break;
                    }
                    if (next == 2 && xmlResourceParser.getDepth() == 1) {
                        if (xmlResourceParser.getName().equals("manifest")) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= xmlResourceParser.getAttributeCount()) {
                                    break;
                                } else if (!"package".equals(xmlResourceParser.getAttributeName(i2))) {
                                    i2++;
                                } else if (str.equals(xmlResourceParser.getAttributeValue(i2))) {
                                    return xmlResourceParser;
                                }
                            }
                        }
                    }
                    next = xmlResourceParser.next();
                }
            } catch (XmlPullParserException e) {
                e = e;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                sb.append("The XML parser cannot pull from AndroidManifest.xml: ");
                sb.append(valueOf);
                Log.w("ComponentsEnabler", sb.toString());
                if (xmlResourceParser != null) {
                }
                return null;
            }
        } catch (XmlPullParserException e2) {
            e = e2;
            xmlResourceParser = null;
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 53);
            sb2.append("The XML parser cannot pull from AndroidManifest.xml: ");
            sb2.append(valueOf2);
            Log.w("ComponentsEnabler", sb2.toString());
            if (xmlResourceParser != null) {
            }
            return null;
        }
        if (xmlResourceParser != null) {
            xmlResourceParser.close();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo9109a(djz djz) {
        mo9110a(djz, (Set) null);
    }

    /* renamed from: a */
    public final void mo9110a(djz djz, Set set) {
        Set set2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (set != null) {
            set2 = bnpf.m110055b(this.f13292c, set);
        } else {
            set2 = this.f13292c;
        }
        synchronized (diz.class) {
            m8606b(djz, set2);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder(68);
        sb.append("Elapsed milliSeconds to auto-enable components: ");
        sb.append(elapsedRealtime2 - elapsedRealtime);
        Log.i("ComponentsEnabler", sb.toString());
    }
}

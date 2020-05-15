package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: uz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1422uz extends MenuInflater {

    /* renamed from: a */
    static final Class[] f27326a;

    /* renamed from: b */
    static final Class[] f27327b;

    /* renamed from: c */
    final Object[] f27328c;

    /* renamed from: d */
    final Object[] f27329d;

    /* renamed from: e */
    final Context f27330e;

    /* renamed from: f */
    public Object f27331f;

    static {
        Class[] clsArr = {Context.class};
        f27326a = clsArr;
        f27327b = clsArr;
    }

    public C1422uz(Context context) {
        super(context);
        this.f27330e = context;
        Object[] objArr = {context};
        this.f27328c = objArr;
        this.f27329d = objArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x020e  */
    /* renamed from: a */
    private final void m20540a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        AttributeSet attributeSet2 = attributeSet;
        C1421uy uyVar = new C1421uy(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            z2 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            uyVar.mo16119a();
                        } else if (!name2.equals("item")) {
                            if (name2.equals("menu")) {
                                z = true;
                            }
                        } else if (!uyVar.f27307h) {
                            C1252or orVar = uyVar.f27294A;
                            if (orVar != null && orVar.mo15667e()) {
                                uyVar.mo16121b();
                            } else {
                                uyVar.f27307h = true;
                                uyVar.mo16120a(uyVar.f27300a.add(uyVar.f27301b, uyVar.f27308i, uyVar.f27309j, uyVar.f27310k));
                            }
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = uyVar.f27299F.f27330e.obtainStyledAttributes(attributeSet2, C1390tu.f27208q);
                        uyVar.f27301b = obtainStyledAttributes.getResourceId(1, 0);
                        uyVar.f27302c = obtainStyledAttributes.getInt(3, 0);
                        uyVar.f27303d = obtainStyledAttributes.getInt(4, 0);
                        uyVar.f27304e = obtainStyledAttributes.getInt(5, 0);
                        uyVar.f27305f = obtainStyledAttributes.getBoolean(2, true);
                        uyVar.f27306g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        adr a = adr.m522a(uyVar.f27299F.f27330e, attributeSet2, C1390tu.f27209r);
                        uyVar.f27308i = a.mo460f(i, 0);
                        uyVar.f27309j = ((char) a.mo448a(6, uyVar.f27303d)) | (a.mo448a(5, uyVar.f27302c) & 0);
                        uyVar.f27310k = a.mo455c(7);
                        uyVar.f27311l = a.mo455c(8);
                        uyVar.f27312m = a.mo460f(0, 0);
                        uyVar.f27313n = C1421uy.m20535a(a.mo457d(9));
                        uyVar.f27314o = a.mo448a(16, 4096);
                        uyVar.f27315p = C1421uy.m20535a(a.mo457d(10));
                        uyVar.f27316q = a.mo448a(20, 4096);
                        if (a.mo461f(11)) {
                            uyVar.f27317r = a.mo451a(11, false) ? 1 : 0;
                        } else {
                            uyVar.f27317r = uyVar.f27304e;
                        }
                        uyVar.f27318s = a.mo451a(3, false);
                        uyVar.f27319t = a.mo451a(4, uyVar.f27305f);
                        uyVar.f27320u = a.mo451a(1, uyVar.f27306g);
                        uyVar.f27321v = a.mo448a(21, -1);
                        uyVar.f27325z = a.mo457d(12);
                        uyVar.f27322w = a.mo460f(13, 0);
                        uyVar.f27323x = a.mo457d(15);
                        uyVar.f27324y = a.mo457d(14);
                        String str2 = uyVar.f27324y;
                        if (str2 != null) {
                            if (uyVar.f27322w == 0 && uyVar.f27323x == null) {
                                uyVar.f27294A = (C1252or) uyVar.mo16118a(str2, f27327b, uyVar.f27299F.f27329d);
                                uyVar.f27295B = a.mo455c(17);
                                uyVar.f27296C = a.mo455c(22);
                                if (!a.mo461f(19)) {
                                    uyVar.f27298E = C1540zi.m20968a(a.mo448a(19, -1), uyVar.f27298E);
                                } else {
                                    uyVar.f27298E = null;
                                }
                                if (!a.mo461f(18)) {
                                    uyVar.f27297D = a.mo459e(18);
                                } else {
                                    uyVar.f27297D = null;
                                }
                                a.mo450a();
                                uyVar.f27307h = false;
                            } else {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                        }
                        uyVar.f27294A = null;
                        uyVar.f27295B = a.mo455c(17);
                        uyVar.f27296C = a.mo455c(22);
                        if (!a.mo461f(19)) {
                        }
                        if (!a.mo461f(18)) {
                        }
                        a.mo450a();
                        uyVar.f27307h = false;
                    } else if (name3.equals("menu")) {
                        m20540a(xmlPullParser, attributeSet2, uyVar.mo16121b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    public final void inflate(int i, Menu menu) {
        if (menu instanceof C1179lz) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.f27330e.getResources().getLayout(i);
                try {
                    m20540a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                } catch (XmlPullParserException e) {
                    e = e;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (IOException e2) {
                    e = e2;
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e3) {
                e = e3;
                throw new InflateException("Error inflating menu XML", e);
            } catch (IOException e4) {
                e = e4;
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable th) {
                th = th;
                if (xmlResourceParser != null) {
                }
                throw th;
            }
        } else {
            super.inflate(i, menu);
        }
    }

    /* renamed from: a */
    public final Object mo16122a(Object obj) {
        return ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) ? obj : mo16122a(((ContextWrapper) obj).getBaseContext());
    }
}

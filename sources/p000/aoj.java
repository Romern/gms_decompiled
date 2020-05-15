package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: aoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoj {

    /* renamed from: b */
    private static final Class[] f1876b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final HashMap f1877c = new HashMap();

    /* renamed from: a */
    public final Context f1878a;

    /* renamed from: d */
    private final Object[] f1879d = new Object[2];

    /* renamed from: e */
    private final aon f1880e;

    /* renamed from: f */
    private final String[] f1881f;

    public aoj(Context context, aon aon) {
        this.f1878a = context;
        this.f1880e = aon;
        this.f1881f = new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
    }

    /* renamed from: a */
    private final Preference m1766a(String str, AttributeSet attributeSet) {
        try {
            if (str.indexOf(46) == -1) {
                return m1767a(str, this.f1881f, attributeSet);
            }
            return m1767a(str, (String[]) null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        r0 = new android.view.InflateException(r13.getPositionDescription() + ": Error inflating class " + r11);
        r0.initCause(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d A[Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }, ExcHandler: Exception (r12v4 'e' java.lang.Exception A[CUSTOM_DECLARE, Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }]), Splitter:B:2:0x000d] */
    /* renamed from: a */
    private final Preference m1767a(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) f1877c.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = this.f1878a.getClassLoader();
                if (strArr != null) {
                    int length = strArr.length;
                    if (length != 0) {
                        cls = null;
                        ClassNotFoundException e = null;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            cls = Class.forName(strArr[i] + str, false, classLoader);
                            break;
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e;
                        }
                        constructor = cls.getConstructor(f1876b);
                        constructor.setAccessible(true);
                        f1877c.put(str, constructor);
                    }
                }
                cls = Class.forName(str, false, classLoader);
                constructor = cls.getConstructor(f1876b);
                constructor.setAccessible(true);
                f1877c.put(str, constructor);
            } catch (ClassNotFoundException e2) {
                throw e2;
            } catch (Exception e3) {
            }
        }
        Object[] objArr = this.f1879d;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* renamed from: a */
    private final void m1768a(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f1604t = Intent.parseIntent(this.f1878a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f1878a.getResources();
                    if (preference.f1606v == null) {
                        preference.f1606v = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f1606v);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference a = m1766a(name, attributeSet);
                    ((PreferenceGroup) preference).mo2019a(a);
                    m1768a(xmlPullParser, a, attributeSet);
                }
            }
        }
    }

    /* renamed from: a */
    public final Preference mo2230a(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f1879d) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f1879d[0] = this.f1878a;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        PreferenceGroup preferenceGroup2 = (PreferenceGroup) m1766a(xmlPullParser.getName(), asAttributeSet);
                        if (preferenceGroup == null) {
                            preferenceGroup2.mo1980a(this.f1880e);
                            preferenceGroup = preferenceGroup2;
                        }
                        m1768a(xmlPullParser, preferenceGroup, asAttributeSet);
                    }
                } catch (InflateException e) {
                    throw e;
                } catch (XmlPullParserException e2) {
                    InflateException inflateException = new InflateException(e2.getMessage());
                    inflateException.initCause(e2);
                    throw inflateException;
                } catch (IOException e3) {
                    InflateException inflateException2 = new InflateException(xmlPullParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
        }
        return preferenceGroup;
    }
}

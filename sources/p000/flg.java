package p000;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: flg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class flg extends fki {

    /* renamed from: a */
    final fnj f16850a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public flg(fkm fkm) {
        super(fkm);
        fnj fnj = new fnj(fkm);
        this.f16850a = fnj;
    }

    /* renamed from: a */
    private final fnk m11931a(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue)) {
                            TextUtils.isEmpty(trim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            fnj fnj = this.f16850a;
                            if ("ga_appName".equals(attributeValue2)) {
                                fnj.f16950b.f16951a = trim2;
                            } else if ("ga_appVersion".equals(attributeValue2)) {
                                fnj.f16950b.f16952b = trim2;
                            } else if (!"ga_logLevel".equals(attributeValue2)) {
                                fnj.f16949a.mo10957a().mo10934d("String xml configuration name not recognized", attributeValue2);
                            } else {
                                fnj.f16950b.f16953c = trim2;
                            }
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                boolean parseBoolean = Boolean.parseBoolean(trim3);
                                fnj fnj2 = this.f16850a;
                                if (!"ga_dryRun".equals(attributeValue3)) {
                                    fnj2.f16949a.mo10957a().mo10934d("Bool xml configuration name not recognized", attributeValue3);
                                } else {
                                    fnj2.f16950b.f16955e = parseBoolean ? 1 : 0;
                                }
                            } catch (NumberFormatException e) {
                                mo10932c("Error parsing bool configuration value", trim3, e);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                int parseInt = Integer.parseInt(trim4);
                                fnj fnj3 = this.f16850a;
                                if (!"ga_dispatchPeriod".equals(attributeValue4)) {
                                    fnj3.f16949a.mo10957a().mo10934d("Int xml configuration name not recognized", attributeValue4);
                                } else {
                                    fnj3.f16950b.f16954d = parseInt;
                                }
                            } catch (NumberFormatException e2) {
                                mo10932c("Error parsing int configuration value", trim4, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            mo10938e("Error parsing tracker configuration file", e3);
        } catch (IOException e4) {
            mo10938e("Error parsing tracker configuration file", e4);
        }
        return this.f16850a.f16950b;
    }

    /* renamed from: a */
    public final fnk mo11004a(int i) {
        try {
            return m11931a(this.f16779d.f16786b.getResources().getXml(i));
        } catch (Resources.NotFoundException e) {
            mo10934d("inflate() called with unknown resourceId", e);
            return null;
        }
    }
}

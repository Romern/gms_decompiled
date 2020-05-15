package p000;

import org.xmlpull.v1.XmlSerializer;

/* renamed from: canc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canc extends camx {
    public canc(camz camz) {
        super(camz);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74680a(XmlSerializer xmlSerializer) {
        xmlSerializer.setPrefix("gsync", "http://schemas.google.com/gsync/data");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo74681b(XmlSerializer xmlSerializer) {
        camz camz = (camz) this.f175328a;
        camy camy = camz.f175332n;
        xmlSerializer.startTag("http://schemas.google.com/gsync/data", "feedurl");
        xmlSerializer.attribute(null, "value", camy.f175329a);
        xmlSerializer.attribute(null, "service", camy.f175330b);
        xmlSerializer.attribute(null, "authtoken", camy.f175331c);
        xmlSerializer.endTag("http://schemas.google.com/gsync/data", "feedurl");
        String str = camz.f175334p;
        String str2 = "";
        if (camt.m126794a(str)) {
            str = str2;
        }
        xmlSerializer.startTag("http://schemas.google.com/gsync/data", "clientToken");
        xmlSerializer.text(str);
        xmlSerializer.endTag("http://schemas.google.com/gsync/data", "clientToken");
        String str3 = camz.f175333o;
        if (!camt.m126794a(str3)) {
            str2 = str3;
        }
        xmlSerializer.startTag("http://schemas.google.com/gsync/data", "routingInfo");
        xmlSerializer.text(str2);
        xmlSerializer.endTag("http://schemas.google.com/gsync/data", "routingInfo");
    }
}

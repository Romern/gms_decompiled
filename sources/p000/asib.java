package p000;

import java.io.OutputStream;
import java.io.Writer;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: asib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asib implements XmlSerializer {

    /* renamed from: a */
    private final XmlSerializer f89001a;

    public asib(XmlSerializer xmlSerializer) {
        this.f89001a = xmlSerializer;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: a */
    static String m74158a(String str) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' || charAt == 10 || charAt == 9 || charAt == 13) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(str.length());
                sb.append((CharSequence) str, 0, i);
                while (true) {
                    i++;
                    if (i >= str.length()) {
                        return sb.toString();
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 >= ' ' || charAt2 == 10 || charAt2 == 9 || charAt2 == 13) {
                        sb.append(charAt2);
                    }
                }
            }
        }
        return str;
    }

    public final XmlSerializer attribute(String str, String str2, String str3) {
        return this.f89001a.attribute(str, str2, m74158a(str3));
    }

    public final void cdsect(String str) {
        this.f89001a.cdsect(str);
    }

    public final void comment(String str) {
        this.f89001a.comment(str);
    }

    public final void docdecl(String str) {
        this.f89001a.docdecl(str);
    }

    public final void endDocument() {
        this.f89001a.endDocument();
    }

    public final XmlSerializer endTag(String str, String str2) {
        return this.f89001a.endTag(str, str2);
    }

    public final void entityRef(String str) {
        this.f89001a.entityRef(str);
    }

    public final void flush() {
        this.f89001a.flush();
    }

    public final int getDepth() {
        return this.f89001a.getDepth();
    }

    public final boolean getFeature(String str) {
        return this.f89001a.getFeature(str);
    }

    public final String getName() {
        return this.f89001a.getName();
    }

    public final String getNamespace() {
        return this.f89001a.getNamespace();
    }

    public final String getPrefix(String str, boolean z) {
        return this.f89001a.getPrefix(str, z);
    }

    public final Object getProperty(String str) {
        return this.f89001a.getProperty(str);
    }

    public final void ignorableWhitespace(String str) {
        this.f89001a.ignorableWhitespace(str);
    }

    public final void processingInstruction(String str) {
        this.f89001a.processingInstruction(str);
    }

    public final void setFeature(String str, boolean z) {
        this.f89001a.setFeature(str, z);
    }

    public final void setOutput(OutputStream outputStream, String str) {
        this.f89001a.setOutput(outputStream, str);
    }

    public final void setPrefix(String str, String str2) {
        this.f89001a.setPrefix(str, str2);
    }

    public final void setProperty(String str, Object obj) {
        this.f89001a.setProperty(str, obj);
    }

    public final void startDocument(String str, Boolean bool) {
        this.f89001a.startDocument(str, bool);
    }

    public final XmlSerializer startTag(String str, String str2) {
        return this.f89001a.startTag(str, str2);
    }

    public final XmlSerializer text(String str) {
        return this.f89001a.text(m74158a(str));
    }

    public final void setOutput(Writer writer) {
        this.f89001a.setOutput(writer);
    }

    public final XmlSerializer text(char[] cArr, int i, int i2) {
        return text(new String(cArr, i, i2));
    }
}

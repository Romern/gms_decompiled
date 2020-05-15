package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import android.text.style.ParagraphStyle;
import android.text.style.StyleSpan;
import com.google.android.gms.udc.p077ui.UdcAuthUrlSpan;
import java.io.IOException;
import java.io.StringReader;
import org.ccil.cowan.tagsoup.Parser;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* renamed from: avhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avhj implements ContentHandler {

    /* renamed from: a */
    private final String f93179a;

    /* renamed from: b */
    private final XMLReader f93180b;

    /* renamed from: c */
    private final SpannableStringBuilder f93181c = new SpannableStringBuilder();

    /* renamed from: d */
    private final avin f93182d;

    public avhj(String str, Parser parser, avin avin) {
        this.f93179a = str;
        this.f93180b = parser;
        this.f93182d = avin;
    }

    /* renamed from: a */
    private static Object m78504a(Spanned spanned, Class cls) {
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        int length = spans.length;
        if (length != 0) {
            return spans[length - 1];
        }
        return null;
    }

    /* renamed from: b */
    private static void m78509b(SpannableStringBuilder spannableStringBuilder, Object obj) {
        m78505a((Editable) spannableStringBuilder);
        m78508a(spannableStringBuilder, obj);
    }

    public final void characters(char[] cArr, int i, int i2) {
        char c;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i3 + i];
            if (c2 == ' ' || c2 == 10) {
                int length = sb.length();
                if (length == 0) {
                    int length2 = this.f93181c.length();
                    if (length2 != 0) {
                        c = this.f93181c.charAt(length2 - 1);
                    } else {
                        c = 10;
                    }
                } else {
                    c = sb.charAt(length - 1);
                }
                if (!(c == ' ' || c == 10)) {
                    sb.append(' ');
                }
            } else {
                sb.append(c2);
            }
        }
        this.f93181c.append((CharSequence) sb);
    }

    public final void endDocument() {
    }

    public final void endPrefixMapping(String str) {
    }

    public final void ignorableWhitespace(char[] cArr, int i, int i2) {
    }

    public final void processingInstruction(String str, String str2) {
    }

    public final void setDocumentLocator(Locator locator) {
    }

    public final void skippedEntity(String str) {
    }

    public final void startDocument() {
    }

    public final void startPrefixMapping(String str, String str2) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avhj.a(android.text.Spanned, java.lang.Class):java.lang.Object
     arg types: [android.text.SpannableStringBuilder, java.lang.Class]
     candidates:
      avhj.a(android.text.SpannableStringBuilder, java.lang.Object):void
      avhj.a(android.text.Spanned, java.lang.Class):java.lang.Object */
    public final void endElement(String str, String str2, String str3) {
        avhf avhf;
        String str4;
        if (str2.equalsIgnoreCase("br")) {
            this.f93181c.append((CharSequence) "\n");
        } else if (str2.equalsIgnoreCase("p")) {
            m78506a(this.f93181c);
        } else {
            boolean z = true;
            if (str2.equalsIgnoreCase("b")) {
                m78507a(this.f93181c, avhe.class, new StyleSpan(1));
            } else if (str2.equalsIgnoreCase("i")) {
                m78507a(this.f93181c, avhg.class, new StyleSpan(2));
            } else if (str2.equalsIgnoreCase("a")) {
                SpannableStringBuilder spannableStringBuilder = this.f93181c;
                avin avin = this.f93182d;
                int length = spannableStringBuilder.length();
                Object a = m78504a((Spanned) spannableStringBuilder, avhf.class);
                int spanStart = spannableStringBuilder.getSpanStart(a);
                spannableStringBuilder.removeSpan(a);
                if (spanStart != length && (str4 = (avhf = (avhf) a).f93176a) != null) {
                    String str5 = avhf.f93177b;
                    if (TextUtils.isEmpty(avhf.f93178c)) {
                        z = false;
                    } else if (!avhf.f93178c.equalsIgnoreCase("yes")) {
                        z = false;
                    }
                    spannableStringBuilder.setSpan(new UdcAuthUrlSpan(str4, str5, z, avin), spanStart, length, 33);
                }
            } else if (str2.equalsIgnoreCase("ul")) {
                SpannableStringBuilder spannableStringBuilder2 = this.f93181c;
                m78505a((Editable) spannableStringBuilder2);
                m78507a(spannableStringBuilder2, avhi.class, new avgz());
            } else if (str2.equalsIgnoreCase("li")) {
                SpannableStringBuilder spannableStringBuilder3 = this.f93181c;
                m78505a((Editable) spannableStringBuilder3);
                int length2 = spannableStringBuilder3.length();
                Object a2 = m78504a((Spanned) spannableStringBuilder3, avhh.class);
                int spanStart2 = spannableStringBuilder3.getSpanStart(a2);
                spannableStringBuilder3.removeSpan(a2);
                if (spanStart2 != length2) {
                    spannableStringBuilder3.setSpan(new LeadingMarginSpan.Standard(5), spanStart2, length2, 33);
                    spannableStringBuilder3.setSpan(new avhr(), spanStart2, length2, 33);
                }
            }
        }
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str2.equalsIgnoreCase("br")) {
            return;
        }
        if (str2.equalsIgnoreCase("p")) {
            m78506a(this.f93181c);
        } else if (str2.equalsIgnoreCase("b")) {
            m78508a(this.f93181c, new avhe());
        } else if (str2.equalsIgnoreCase("i")) {
            m78508a(this.f93181c, new avhg());
        } else if (str2.equalsIgnoreCase("a")) {
            SpannableStringBuilder spannableStringBuilder = this.f93181c;
            String value = attributes.getValue("", "href");
            String value2 = attributes.getValue("", "data-auth");
            if (TextUtils.isEmpty(value2)) {
                value2 = attributes.getValue("", "auth");
            }
            String value3 = attributes.getValue("", "data-avref");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new avhf(value, value3, value2), length, length, 17);
        } else if (str2.equalsIgnoreCase("ul")) {
            m78509b(this.f93181c, new avhi());
        } else if (str2.equalsIgnoreCase("li")) {
            m78509b(this.f93181c, new avhh());
        }
    }

    /* renamed from: a */
    private static void m78505a(Editable editable) {
        if (!TextUtils.isEmpty(editable) && editable.charAt(editable.length() - 1) != 10) {
            editable.append((CharSequence) "\n");
        }
    }

    /* renamed from: a */
    private static void m78506a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        if (length <= 0 || spannableStringBuilder.charAt(length - 1) != 10) {
            if (length != 0) {
                spannableStringBuilder.append((CharSequence) "\n\n");
            }
        } else if (length < 2 || spannableStringBuilder.charAt(length - 2) != 10) {
            spannableStringBuilder.append((CharSequence) "\n");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avhj.a(android.text.Spanned, java.lang.Class):java.lang.Object
     arg types: [android.text.SpannableStringBuilder, java.lang.Class]
     candidates:
      avhj.a(android.text.SpannableStringBuilder, java.lang.Object):void
      avhj.a(android.text.Spanned, java.lang.Class):java.lang.Object */
    /* renamed from: a */
    private static void m78507a(SpannableStringBuilder spannableStringBuilder, Class cls, Object obj) {
        int length = spannableStringBuilder.length();
        Object a = m78504a((Spanned) spannableStringBuilder, cls);
        int spanStart = spannableStringBuilder.getSpanStart(a);
        spannableStringBuilder.removeSpan(a);
        if (spanStart != length) {
            spannableStringBuilder.setSpan(obj, spanStart, length, 33);
        }
    }

    /* renamed from: a */
    private static void m78508a(SpannableStringBuilder spannableStringBuilder, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(obj, length, length, 17);
    }

    /* renamed from: a */
    public final Spanned mo51220a() {
        this.f93180b.setContentHandler(this);
        try {
            this.f93180b.parse(new InputSource(new StringReader(this.f93179a)));
            SpannableStringBuilder spannableStringBuilder = this.f93181c;
            Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ParagraphStyle.class);
            for (int i = 0; i < spans.length; i++) {
                int spanStart = this.f93181c.getSpanStart(spans[i]);
                int spanEnd = this.f93181c.getSpanEnd(spans[i]);
                int i2 = spanEnd - 2;
                if (i2 >= 0) {
                    int i3 = spanEnd - 1;
                    if (this.f93181c.charAt(i3) == 10 && this.f93181c.charAt(i2) == 10) {
                        spanEnd = i3;
                    }
                }
                if (spanEnd != spanStart) {
                    this.f93181c.setSpan(spans[i], spanStart, spanEnd, 51);
                } else {
                    this.f93181c.removeSpan(spans[i]);
                }
            }
            return this.f93181c;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e2) {
            throw new RuntimeException(e2);
        }
    }
}

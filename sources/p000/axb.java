package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: axb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axb {

    /* renamed from: a */
    private static final Object f2470a = new Object();

    /* renamed from: b */
    private static final DocumentBuilderFactory f2471b;

    static {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
        }
        f2471b = newInstance;
    }

    /* renamed from: a */
    public static awo m2326a(Object obj) {
        Document document;
        awv.m2288a(obj);
        axo axo = new axo();
        if (obj instanceof InputStream) {
            InputStream inputStream = (InputStream) obj;
            if (axo.mo2836b() || axo.mo2835a()) {
                try {
                    document = m2327a(new awr(inputStream), axo);
                } catch (IOException e) {
                    throw new awn("Error reading the XML-file", 204, e);
                }
            } else {
                document = m2328a(new InputSource(inputStream));
            }
        } else {
            document = m2327a(new awr((byte[]) obj), axo);
        }
        Object[] a = m2329a(document, axo.mo2829a(1), new Object[3]);
        if (a == null || a[1] != f2470a) {
            return new axa();
        }
        Node node = (Node) a[0];
        axa axa = new axa();
        if (node.hasAttributes()) {
            axd axd = axa.f2469a;
            for (int i = 0; i < node.getChildNodes().getLength(); i++) {
                Node item = node.getChildNodes().item(i);
                if (!aww.m2295a(item)) {
                    aww.m2292a(axa, axd, item, true);
                }
            }
            String str = (String) a[2];
            if (!axo.mo2829a(32)) {
                axf.m2361a(axa, axo);
            }
            return axa;
        }
        throw new awn("Invalid attributes of rdf:RDF element", 202);
    }

    /* renamed from: a */
    private static Document m2327a(awr awr, axo axo) {
        try {
            return m2328a(new InputSource(awr.mo2769a()));
        } catch (awn e) {
            int i = e.f2449a;
            if (i == 201 || i == 204) {
                if (axo.mo2836b() && "UTF-8".equals(awr.mo2773b())) {
                    byte[] bArr = new byte[8];
                    awr awr2 = new awr((awr.f2452b * 4) / 3);
                    int i2 = 0;
                    char c = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = awr.f2452b;
                        if (i2 >= i5) {
                            if (c == 11) {
                                for (int i6 = 0; i6 < i4; i6++) {
                                    awr2.mo2771a(awu.m2287a(bArr[i6]));
                                }
                            }
                            awr = awr2;
                        } else if (i2 < i5) {
                            byte b = awr.f2451a[i2] & 255;
                            if (c != 11) {
                                if (b < Byte.MAX_VALUE) {
                                    awr2.mo2770a(awr2.f2452b + 1);
                                    byte[] bArr2 = awr2.f2451a;
                                    int i7 = awr2.f2452b;
                                    awr2.f2452b = i7 + 1;
                                    bArr2[i7] = (byte) b;
                                } else if (b < 192) {
                                    awr2.mo2771a(awu.m2287a((byte) b));
                                } else {
                                    int i8 = b;
                                    i3 = -1;
                                    while (i3 < 8 && (i8 & 128) == 128) {
                                        i3++;
                                        i8 += i8;
                                    }
                                    bArr[i4] = (byte) b;
                                    i4++;
                                    c = 11;
                                }
                            } else if (i3 > 0 && (b & 192) == 128) {
                                int i9 = i4 + 1;
                                bArr[i4] = (byte) b;
                                i3--;
                                if (i3 == 0) {
                                    awr2.mo2772a(bArr, i9);
                                    c = 0;
                                    i4 = 0;
                                } else {
                                    i4 = i9;
                                }
                            } else {
                                awr2.mo2771a(awu.m2287a(bArr[0]));
                                i2 -= i4;
                                c = 0;
                                i4 = 0;
                            }
                            i2++;
                        } else {
                            throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
                        }
                    }
                }
                if (!axo.mo2835a()) {
                    return m2328a(new InputSource(awr.mo2769a()));
                }
                try {
                    return m2328a(new InputSource(new aws(new InputStreamReader(awr.mo2769a(), awr.mo2773b()))));
                } catch (UnsupportedEncodingException e2) {
                    throw new awn("Unsupported Encoding", 9, e);
                }
            } else {
                throw e;
            }
        }
    }

    /* renamed from: a */
    private static Document m2328a(InputSource inputSource) {
        try {
            DocumentBuilder newDocumentBuilder = f2471b.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(null);
            return newDocumentBuilder.parse(inputSource);
        } catch (SAXException e) {
            throw new awn("XML parsing failure", ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, e);
        } catch (ParserConfigurationException e2) {
            throw new awn("XML Parser not correctly configured", 0, e2);
        } catch (IOException e3) {
            throw new awn("Error reading the XML-file", 204, e3);
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object[]], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private static Object[] m2329a(Node node, boolean z, Object[] r9) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 7) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) item;
                if (processingInstruction.getTarget() == "xpacket") {
                    r9[2] = processingInstruction.getData();
                }
            }
            if (!(item.getNodeType() == 3 || item.getNodeType() == 7)) {
                String namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if (("xmpmeta".equals(localName) || "xapmeta".equals(localName)) && "adobe:ns:meta/".equals(namespaceURI)) {
                    return m2329a(item, false, r9);
                }
                if (z || !"RDF".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                    Object[] a = m2329a(item, z, r9);
                    if (a != null) {
                        return a;
                    }
                } else {
                    r9[0] = item;
                    r9[1] = f2470a;
                    return r9;
                }
            }
        }
        return null;
    }
}

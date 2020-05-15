package p000;

import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* renamed from: aww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aww {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axe.a(axd, java.lang.String, java.lang.String, boolean):axd
     arg types: [axd, java.lang.String, java.lang.String, int]
     candidates:
      axe.a(axd, axj, boolean, axp):axd
      axe.a(axd, java.lang.String, java.lang.String, boolean):axd */
    /* renamed from: a */
    private static axd m2291a(axa axa, axd axd, Node node, String str, boolean z) {
        String str2;
        axh axh = awp.f2450a;
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            if ("http://purl.org/dc/1.1/".equals(namespaceURI)) {
                namespaceURI = "http://purl.org/dc/elements/1.1/";
            }
            String a = axh.mo2813a(namespaceURI);
            if (a == null) {
                if (node.getPrefix() == null) {
                    str2 = "_dflt";
                } else {
                    str2 = node.getPrefix();
                }
                a = axh.mo2814a(namespaceURI, str2);
            }
            String valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(node.getLocalName());
            String str3 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            axp axp = new axp();
            boolean z2 = false;
            if (z) {
                axd = axe.m2356a(axa.f2469a, namespaceURI, "_dflt", true);
                axd.f2478f = false;
                if (axh.mo2817c(str3) != null) {
                    axa.f2469a.f2479g = true;
                    axd.f2479g = true;
                    z2 = true;
                }
            }
            boolean equals = "rdf:li".equals(str3);
            boolean equals2 = "rdf:value".equals(str3);
            axd axd2 = new axd(str3, str, axp);
            axd2.f2480h = z2;
            if (!equals2) {
                axd.mo2794a(axd2);
            } else {
                axd.mo2805e(axd2);
                if (z || !axd.mo2810i().mo2841b()) {
                    throw new awn("Misplaced rdf:value element", 202);
                }
                axd.f2481i = true;
            }
            if (equals) {
                if (axd.mo2810i().mo2843c()) {
                    axd2.f2473a = "[]";
                } else {
                    throw new awn("Misplaced rdf:li element", 202);
                }
            }
            return axd2;
        }
        throw new awn("XML namespace required for all elements and attributes", 202);
    }

    /* renamed from: b */
    private static int m2296b(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            return 0;
        }
        if ("li".equals(localName)) {
            return 9;
        }
        if ("parseType".equals(localName)) {
            return 4;
        }
        if ("Description".equals(localName)) {
            return 8;
        }
        if ("about".equals(localName)) {
            return 3;
        }
        if ("resource".equals(localName)) {
            return 5;
        }
        if ("RDF".equals(localName)) {
            return 1;
        }
        if ("ID".equals(localName)) {
            return 2;
        }
        if ("nodeID".equals(localName)) {
            return 6;
        }
        if ("datatype".equals(localName)) {
            return 7;
        }
        if ("aboutEach".equals(localName)) {
            return 10;
        }
        if (!"aboutEachPrefix".equals(localName)) {
            return "bagID".equals(localName) ? 12 : 0;
        }
        return 11;
    }

    /* renamed from: c */
    private static void m2298c(axa axa, axd axd, Node node, boolean z) {
        axd a = m2291a(axa, axd, node, null, z);
        int i = 0;
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node item = node.getAttributes().item(i2);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                String namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if ("xml:lang".equals(item.getNodeName())) {
                    m2294a(a, "xml:lang", item.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!"ID".equals(localName) && !"datatype".equals(localName))) {
                    throw new awn("Invalid attribute for literal property element", 202);
                }
            }
        }
        String str = "";
        while (i < node.getChildNodes().getLength()) {
            Node item2 = node.getChildNodes().item(i);
            if (item2.getNodeType() == 3) {
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(item2.getNodeValue());
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                i++;
            } else {
                throw new awn("Invalid child of literal property element", 202);
            }
        }
        a.f2474b = str;
    }

    /* renamed from: d */
    private static void m2299d(axa axa, axd axd, Node node, boolean z) {
        boolean z2;
        axa axa2 = axa;
        if (!node.hasChildNodes()) {
            Node node2 = null;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (int i = 0; i < node.getAttributes().getLength(); i++) {
                Node item = node.getAttributes().item(i);
                if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                    int b = m2296b(item);
                    if (b != 0) {
                        if (b == 2) {
                            continue;
                        } else if (b != 5) {
                            if (b != 6) {
                                throw new awn("Unrecognized attribute of empty property element", 202);
                            } else if (!z4) {
                                z5 = true;
                            } else {
                                throw new awn("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                            }
                        } else if (z5) {
                            throw new awn("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                        } else if (!z3) {
                            node2 = item;
                            z3 = false;
                            z4 = true;
                        } else {
                            throw new awn("Empty property element can't have both rdf:value and rdf:resource", 203);
                        }
                    } else if (!"value".equals(item.getLocalName()) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item.getNamespaceURI())) {
                        if (!"xml:lang".equals(item.getNodeName())) {
                            z6 = true;
                        }
                    } else if (!z4) {
                        node2 = item;
                        z3 = true;
                    } else {
                        throw new awn("Empty property element can't have both rdf:value and rdf:resource", 203);
                    }
                }
            }
            String str = "";
            axd a = m2291a(axa2, axd, node, str, z);
            if (z3 || z4) {
                if (node2 != null) {
                    str = node2.getNodeValue();
                }
                a.f2474b = str;
                if (!z3) {
                    a.mo2810i().mo2828a(2, true);
                }
                z2 = false;
            } else if (z6) {
                a.mo2810i().mo2844d(true);
                z2 = true;
            } else {
                z2 = false;
            }
            for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
                Node item2 = node.getAttributes().item(i2);
                if (item2 != node2) {
                    if (!"xmlns".equals(item2.getPrefix())) {
                        if (item2.getPrefix() != null || !"xmlns".equals(item2.getNodeName())) {
                            int b2 = m2296b(item2);
                            if (b2 != 0) {
                                if (b2 != 2) {
                                    if (b2 == 5) {
                                        m2294a(a, "rdf:resource", item2.getNodeValue());
                                    } else if (b2 != 6) {
                                        throw new awn("Unrecognized attribute of empty property element", 202);
                                    }
                                }
                            } else if (!z2) {
                                m2294a(a, item2.getNodeName(), item2.getNodeValue());
                            } else if ("xml:lang".equals(item2.getNodeName())) {
                                m2294a(a, "xml:lang", item2.getNodeValue());
                            } else {
                                m2291a(axa2, a, item2, item2.getNodeValue(), false);
                            }
                        }
                    }
                }
            }
            return;
        }
        throw new awn("Nested content not allowed with rdf:resource or property attributes", 202);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00df, code lost:
        if ("datatype".equals(r4) == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
        if ("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(r7) != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e8, code lost:
        m2298c(r1, r2, r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f4, code lost:
        if ("parseType".equals(r4) == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fa, code lost:
        if ("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(r7) != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        if ("Literal".equals(r8) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010d, code lost:
        if ("Resource".equals(r8) == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010f, code lost:
        r4 = m2291a(r1, r2, r6, "", r3);
        r4.mo2810i().mo2844d(true);
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0124, code lost:
        if (r7 >= r6.getAttributes().getLength()) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0126, code lost:
        r8 = r6.getAttributes().item(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0136, code lost:
        if ("xmlns".equals(r8.getPrefix()) == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013d, code lost:
        if (r8.getPrefix() != null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        if ("xmlns".equals(r8.getNodeName()) != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        r9 = r8.getLocalName();
        r11 = r8.getNamespaceURI();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0159, code lost:
        if ("xml:lang".equals(r8.getNodeName()) == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015b, code lost:
        m2294a(r4, "xml:lang", r8.getNodeValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0168, code lost:
        if ("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(r11) == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016e, code lost:
        if ("ID".equals(r9) != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0174, code lost:
        if ("parseType".equals(r9) == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0176, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0182, code lost:
        throw new p000.awn("Invalid attribute for ParseTypeResource property element", 202);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0183, code lost:
        m2297b(r1, r4, r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018a, code lost:
        if (r4.f2481i == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018c, code lost:
        m2293a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019c, code lost:
        if ("Collection".equals(r8) == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a7, code lost:
        throw new p000.awn("ParseTypeCollection property element not allowed", 203);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b1, code lost:
        throw new p000.awn("ParseTypeOther property element not allowed", 203);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01bb, code lost:
        throw new p000.awn("ParseTypeLiteral property element not allowed", 203);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bc, code lost:
        m2299d(r1, r2, r6, r3);
     */
    /* renamed from: b */
    private static void m2297b(axa axa, axd axd, Node node, boolean z) {
        axa axa2 = axa;
        axd axd2 = axd;
        boolean z2 = z;
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node item = node.getChildNodes().item(i);
            if (!m2295a(item)) {
                if (item.getNodeType() == 1) {
                    int b = m2296b(item);
                    if (b != 8 && b < 10 && (b <= 0 || b > 7)) {
                        NamedNodeMap attributes = item.getAttributes();
                        ArrayList arrayList = null;
                        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                            Node item2 = attributes.item(i2);
                            if ("xmlns".equals(item2.getPrefix()) || (item2.getPrefix() == null && "xmlns".equals(item2.getNodeName()))) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(item2.getNodeName());
                            }
                        }
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                attributes.removeNamedItem((String) arrayList.get(i3));
                            }
                        }
                        if (attributes.getLength() <= 3) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= attributes.getLength()) {
                                    if (item.hasChildNodes()) {
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= item.getChildNodes().getLength()) {
                                                m2298c(axa2, axd2, item, z2);
                                                break;
                                            } else if (item.getChildNodes().item(i5).getNodeType() == 3) {
                                                i5++;
                                            } else if (!z2 || !"iX:changes".equals(item.getNodeName())) {
                                                axd a = m2291a(axa2, axd2, item, "", z2);
                                                for (int i6 = 0; i6 < item.getAttributes().getLength(); i6++) {
                                                    Node item3 = item.getAttributes().item(i6);
                                                    if (!"xmlns".equals(item3.getPrefix()) && (item3.getPrefix() != null || !"xmlns".equals(item3.getNodeName()))) {
                                                        String localName = item3.getLocalName();
                                                        String namespaceURI = item3.getNamespaceURI();
                                                        if ("xml:lang".equals(item3.getNodeName())) {
                                                            m2294a(a, "xml:lang", item3.getNodeValue());
                                                        } else if (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                                                            throw new awn("Invalid attribute for resource property element", 202);
                                                        }
                                                    }
                                                }
                                                boolean z3 = false;
                                                for (int i7 = 0; i7 < item.getChildNodes().getLength(); i7++) {
                                                    Node item4 = item.getChildNodes().item(i7);
                                                    if (!m2295a(item4)) {
                                                        if (item4.getNodeType() != 1) {
                                                            if (!z3) {
                                                                throw new awn("Children of resource property element must be XML elements", 202);
                                                            }
                                                        } else if (!z3) {
                                                            boolean equals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item4.getNamespaceURI());
                                                            String localName2 = item4.getLocalName();
                                                            if (equals && "Bag".equals(localName2)) {
                                                                a.mo2810i().mo2849i();
                                                            } else if (equals && "Seq".equals(localName2)) {
                                                                axp i8 = a.mo2810i();
                                                                i8.mo2849i();
                                                                i8.mo2852l();
                                                            } else if (!equals || !"Alt".equals(localName2)) {
                                                                a.mo2810i().mo2844d(true);
                                                                if (!equals) {
                                                                    if (!"Description".equals(localName2)) {
                                                                        String namespaceURI2 = item4.getNamespaceURI();
                                                                        if (namespaceURI2 != null) {
                                                                            StringBuilder sb = new StringBuilder(namespaceURI2.length() + 1 + String.valueOf(localName2).length());
                                                                            sb.append(namespaceURI2);
                                                                            sb.append(':');
                                                                            sb.append(localName2);
                                                                            m2294a(a, "rdf:type", sb.toString());
                                                                        } else {
                                                                            throw new awn("All XML elements must be in a namespace", 203);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                axp i9 = a.mo2810i();
                                                                i9.mo2849i();
                                                                i9.mo2852l();
                                                                i9.mo2851k();
                                                            }
                                                            m2292a(axa2, a, item4, false);
                                                            if (a.f2481i) {
                                                                m2293a(a);
                                                                z3 = true;
                                                            } else {
                                                                if (a.mo2810i().mo2845e() && a.mo2810i().mo2845e() && a.mo2806e()) {
                                                                    Iterator f = a.mo2807f();
                                                                    while (true) {
                                                                        if (!f.hasNext()) {
                                                                            break;
                                                                        } else if (((axd) f.next()).mo2810i().mo2839a()) {
                                                                            a.mo2810i().mo2850j();
                                                                            if (a.mo2810i().mo2846f()) {
                                                                                int i10 = 2;
                                                                                while (true) {
                                                                                    if (i10 > a.mo2799c()) {
                                                                                        break;
                                                                                    }
                                                                                    axd a2 = a.mo2791a(i10);
                                                                                    if (a2.mo2808g()) {
                                                                                        if ("x-default".equals(a2.mo2795b(1).f2474b)) {
                                                                                            try {
                                                                                                a.mo2811j().remove(i10 - 1);
                                                                                                a.mo2793a();
                                                                                                a.mo2805e(a2);
                                                                                            } catch (awn e) {
                                                                                            }
                                                                                            if (i10 == 2) {
                                                                                                a.mo2791a(2).f2474b = a2.f2474b;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    i10++;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                z3 = true;
                                                            }
                                                        }
                                                        throw new awn("Invalid child of resource property element", 202);
                                                    }
                                                }
                                                if (!z3) {
                                                    throw new awn("Missing child of resource property element", 202);
                                                }
                                            }
                                        }
                                    } else {
                                        m2299d(axa2, axd2, item, z2);
                                    }
                                } else {
                                    Node item5 = attributes.item(i4);
                                    String localName3 = item5.getLocalName();
                                    String namespaceURI3 = item5.getNamespaceURI();
                                    String nodeValue = item5.getNodeValue();
                                    if ("xml:lang".equals(item5.getNodeName()) && (!"ID".equals(localName3) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI3))) {
                                        i4++;
                                    }
                                }
                            }
                        } else {
                            m2299d(axa2, axd2, item, z2);
                        }
                    } else {
                        throw new awn("Invalid property element name", 202);
                    }
                } else {
                    throw new awn("Expected property element node not found", 202);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2292a(axa axa, axd axd, Node node, boolean z) {
        char c;
        int b = m2296b(node);
        if (b == 8 || b == 0) {
            if (!z) {
                c = 0;
            } else if (b != 0) {
                c = 0;
            } else {
                throw new awn("Top level typed node not allowed", 203);
            }
            for (int i = 0; i < node.getAttributes().getLength(); i++) {
                Node item = node.getAttributes().item(i);
                if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                    int b2 = m2296b(item);
                    if (b2 == 0) {
                        m2291a(axa, axd, item, item.getNodeValue(), z);
                    } else if (b2 != 6 && b2 != 2 && b2 != 3) {
                        throw new awn("Invalid nodeElement attribute", 202);
                    } else if (c <= 0) {
                        if (z && b2 == 3) {
                            String str = axd.f2473a;
                            if (str == null || str.length() <= 0) {
                                axd.f2473a = item.getNodeValue();
                                c = 1;
                            } else if (!axd.f2473a.equals(item.getNodeValue())) {
                                throw new awn("Mismatched top level rdf:about values", 203);
                            }
                        }
                        c = 1;
                    } else {
                        throw new awn("Mutally exclusive about, ID, nodeID attributes", 202);
                    }
                }
            }
            m2297b(axa, axd, node, z);
            return;
        }
        throw new awn("Node element must be rdf:Description or typed node", 202);
    }

    /* renamed from: a */
    private static void m2293a(axd axd) {
        axd a = axd.mo2791a(1);
        if (a.mo2810i().mo2839a()) {
            if (!axd.mo2810i().mo2839a()) {
                axd b = a.mo2795b(1);
                a.mo2804d(b);
                axd.mo2800c(b);
            } else {
                throw new awn("Redundant xml:lang for rdf:value element", 203);
            }
        }
        for (int i = 1; i <= a.mo2803d(); i++) {
            axd.mo2800c(a.mo2795b(i));
        }
        for (int i2 = 2; i2 <= axd.mo2799c(); i2++) {
            axd.mo2800c(axd.mo2791a(i2));
        }
        axd.f2481i = false;
        axd.mo2810i().mo2844d(false);
        axd.mo2810i().mo2837a(a.mo2810i());
        axd.f2474b = a.f2474b;
        axd.mo2797b();
        Iterator f = a.mo2807f();
        while (f.hasNext()) {
            axd.mo2794a((axd) f.next());
        }
    }

    /* renamed from: a */
    private static void m2294a(axd axd, String str, String str2) {
        if ("xml:lang".equals(str)) {
            str2 = awy.m2306a(str2);
        }
        axd.mo2800c(new axd(str, str2, null));
    }

    /* renamed from: a */
    public static boolean m2295a(Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

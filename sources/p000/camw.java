package p000;

import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: camw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class camw {

    /* renamed from: a */
    public final XmlPullParser f175325a;

    /* renamed from: b */
    private final InputStream f175326b;

    /* renamed from: c */
    private boolean f175327c = false;

    public camw(InputStream inputStream, XmlPullParser xmlPullParser) {
        this.f175326b = inputStream;
        this.f175325a = xmlPullParser;
        if (inputStream != null) {
            try {
                xmlPullParser.setInput(inputStream, null);
            } catch (XmlPullParserException e) {
                throw new camv("Could not create XmlGDataParser", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public cams mo74670a() {
        return new cams();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo74672b(cams cams) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo74674c() {
        if (mo74673b()) {
            int eventType = this.f175325a.getEventType();
            while (eventType != 1) {
                if (eventType != 2 || !"entry".equals(this.f175325a.getName())) {
                    eventType = this.f175325a.next();
                } else {
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("you shouldn't call this if hasMoreData() is false");
    }

    /* renamed from: d */
    public final void mo74675d() {
        InputStream inputStream = this.f175326b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: e */
    public final void mo74676e() {
        try {
            if (this.f175325a.getEventType() == 0) {
                try {
                    int next = this.f175325a.next();
                    while (next != 1) {
                        if (next == 2 && "feed".equals(this.f175325a.getName())) {
                            try {
                                int next2 = this.f175325a.next();
                                while (next2 != 1) {
                                    if (next2 == 2) {
                                        String name = this.f175325a.getName();
                                        if ("totalResults".equals(name)) {
                                            camt.m126795b(camu.m126796a(this.f175325a));
                                        } else if ("startIndex".equals(name)) {
                                            camt.m126795b(camu.m126796a(this.f175325a));
                                        } else if ("itemsPerPage".equals(name)) {
                                            camt.m126795b(camu.m126796a(this.f175325a));
                                        } else if ("title".equals(name)) {
                                            camu.m126796a(this.f175325a);
                                        } else if ("id".equals(name)) {
                                            camu.m126796a(this.f175325a);
                                        } else if ("updated".equals(name)) {
                                            camu.m126796a(this.f175325a);
                                        } else if ("category".equals(name)) {
                                            camt.m126794a(this.f175325a.getAttributeValue(null, "term"));
                                            camt.m126794a(this.f175325a.getAttributeValue(null, "scheme"));
                                        } else if ("entry".equals(name)) {
                                            return;
                                        }
                                    }
                                    next2 = this.f175325a.next();
                                }
                                return;
                            } catch (XmlPullParserException e) {
                                throw new camv("Unable to parse <feed>.", e);
                            } catch (IOException e2) {
                                throw new camv("Unable to parse <feed>.", e2);
                            }
                        } else {
                            try {
                                next = this.f175325a.next();
                            } catch (XmlPullParserException e3) {
                                throw new camv("Could not read next event.", e3);
                            } catch (IOException e4) {
                                throw new camv("Could not read next event.", e4);
                            }
                        }
                    }
                    throw new camv("No <feed> found in document.");
                } catch (XmlPullParserException e5) {
                    throw new camv("Could not read next event.", e5);
                } catch (IOException e6) {
                    throw new camv("Could not read next event.", e6);
                }
            } else {
                throw new camv("Attempting to initialize parsing beyond the start of the document.");
            }
        } catch (XmlPullParserException e7) {
            throw new camv("Could not parse GData feed.", e7);
        }
    }

    /* renamed from: f */
    public final void mo74677f() {
        cams a = mo74670a();
        try {
            if (this.f175325a.getEventType() == 0) {
                try {
                    int next = this.f175325a.next();
                    while (next != 1) {
                        if (next == 2 && "entry".equals(this.f175325a.getName())) {
                            try {
                                this.f175325a.next();
                                mo74671a(a);
                                return;
                            } catch (XmlPullParserException e) {
                                throw new camv("Unable to parse <entry>.", e);
                            } catch (IOException e2) {
                                throw new camv("Unable to parse <entry>.", e2);
                            }
                        } else {
                            try {
                                next = this.f175325a.next();
                            } catch (XmlPullParserException e3) {
                                throw new camv("Could not read next event.", e3);
                            }
                        }
                    }
                    throw new camv("No <entry> found in document.");
                } catch (XmlPullParserException e4) {
                    throw new camv("Could not read next event.", e4);
                } catch (IOException e5) {
                    throw new camv("Could not read next event.", e5);
                }
            } else {
                throw new camv("Attempting to initialize parsing beyond the start of the document.");
            }
        } catch (XmlPullParserException e6) {
            throw new camv("Could not parse GData entry.", e6);
        }
    }

    /* renamed from: g */
    public final cams mo74678g() {
        if (mo74673b()) {
            try {
                int eventType = this.f175325a.getEventType();
                if (eventType != 2) {
                    String valueOf = String.valueOf(XmlPullParser.TYPES[eventType]);
                    throw new camv(valueOf.length() == 0 ? new String("Expected event START_TAG: Actual event: ") : "Expected event START_TAG: Actual event: ".concat(valueOf));
                }
                String name = this.f175325a.getName();
                if ("entry".equals(name)) {
                    cams a = mo74670a();
                    try {
                        this.f175325a.next();
                        mo74671a(a);
                        return a;
                    } catch (camv e) {
                        try {
                            if (mo74673b()) {
                                mo74674c();
                            }
                        } catch (XmlPullParserException e2) {
                            this.f175327c = true;
                        }
                        String valueOf2 = String.valueOf(a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                        sb.append("Could not parse <entry>, ");
                        sb.append(valueOf2);
                        throw new camv(sb.toString(), e);
                    } catch (XmlPullParserException e3) {
                        try {
                            if (mo74673b()) {
                                mo74674c();
                            }
                        } catch (XmlPullParserException e4) {
                            this.f175327c = true;
                        }
                        String valueOf3 = String.valueOf(a);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                        sb2.append("Could not parse <entry>, ");
                        sb2.append(valueOf3);
                        throw new camv(sb2.toString(), e3);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 36);
                    sb3.append("Expected <entry>: Actual element: <");
                    sb3.append(name);
                    sb3.append(">");
                    throw new camv(sb3.toString());
                }
            } catch (XmlPullParserException e5) {
                throw new camv("Could not parse entry.", e5);
            }
        } else {
            throw new IllegalStateException("you shouldn't call this if hasMoreData() is false");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74671a(cams cams) {
        int eventType = this.f175325a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = this.f175325a.getName();
                if ("entry".equals(name)) {
                    return;
                }
                if ("id".equals(name)) {
                    cams.f175312a = camu.m126796a(this.f175325a);
                } else if ("title".equals(name)) {
                    cams.f175313b = camu.m126796a(this.f175325a);
                } else if ("link".equals(name)) {
                    String attributeValue = this.f175325a.getAttributeValue(null, "rel");
                    String attributeValue2 = this.f175325a.getAttributeValue(null, "type");
                    String attributeValue3 = this.f175325a.getAttributeValue(null, "href");
                    if ("edit".equals(attributeValue)) {
                        cams.f175314c = attributeValue3;
                    } else if ("alternate".equals(attributeValue) && "text/html".equals(attributeValue2)) {
                        cams.f175315d = attributeValue3;
                    }
                } else if ("summary".equals(name)) {
                    cams.f175316e = camu.m126796a(this.f175325a);
                } else if ("content".equals(name)) {
                    cams.f175317f = camu.m126796a(this.f175325a);
                } else if ("author".equals(name)) {
                    int eventType2 = this.f175325a.getEventType();
                    this.f175325a.getName();
                    if (eventType2 != 2 || !"author".equals(this.f175325a.getName())) {
                        String name2 = this.f175325a.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 37);
                        sb.append("Expected <author>: Actual element: <");
                        sb.append(name2);
                        sb.append(">");
                        throw new IllegalStateException(sb.toString());
                    }
                    int next = this.f175325a.next();
                    while (next != 1) {
                        if (next != 2) {
                            if (next == 3 && "author".equals(this.f175325a.getName())) {
                                break;
                            }
                        } else {
                            String name3 = this.f175325a.getName();
                            if ("name".equals(name3)) {
                                cams.f175318g = camu.m126796a(this.f175325a);
                            } else if ("email".equals(name3)) {
                                cams.f175319h = camu.m126796a(this.f175325a);
                            }
                        }
                        next = this.f175325a.next();
                    }
                } else if ("category".equals(name)) {
                    String attributeValue4 = this.f175325a.getAttributeValue(null, "term");
                    if (attributeValue4 != null && attributeValue4.length() > 0) {
                        cams.f175320i = attributeValue4;
                    }
                    String attributeValue5 = this.f175325a.getAttributeValue(null, "scheme");
                    if (attributeValue5 != null && attributeValue4.length() > 0) {
                        cams.f175321j = attributeValue5;
                    }
                } else if ("published".equals(name)) {
                    cams.f175322k = camu.m126796a(this.f175325a);
                } else if ("updated".equals(name)) {
                    cams.f175323l = camu.m126796a(this.f175325a);
                } else if (!"deleted".equals(name)) {
                    mo74672b(cams);
                } else {
                    cams.f175324m = true;
                }
            }
            eventType = this.f175325a.next();
        }
    }

    /* renamed from: b */
    public final boolean mo74673b() {
        if (!this.f175327c) {
            try {
                return this.f175325a.getEventType() != 1;
            } catch (XmlPullParserException e) {
            }
        }
        return false;
    }
}

package p000;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: abyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyt extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    public abyt(String str, XmlPullParser xmlPullParser, String str2) {
        super(r3.toString());
        String positionDescription = xmlPullParser.getPositionDescription();
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(positionDescription).length() + String.valueOf(str2).length());
        sb.append("From ");
        sb.append(str);
        sb.append(": ");
        sb.append(positionDescription);
        sb.append(": ");
        sb.append(str2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public abyt(String str, XmlPullParser xmlPullParser, String str2, Throwable th) {
        super(r3.toString(), th);
        String positionDescription = xmlPullParser.getPositionDescription();
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(positionDescription).length() + String.valueOf(str2).length());
        sb.append("From ");
        sb.append(str);
        sb.append(": ");
        sb.append(positionDescription);
        sb.append(": ");
        sb.append(str2);
    }
}

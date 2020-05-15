package p000;

import android.util.Xml;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: canb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canb {

    /* renamed from: a */
    public final asia f175335a;

    public canb(asia asia) {
        this.f175335a = asia;
    }

    /* renamed from: a */
    public static final camw m126812a(InputStream inputStream) {
        try {
            return new cana(inputStream, Xml.newPullParser());
        } catch (XmlPullParserException e) {
            throw new camv("Could not create XmlPullParser", e);
        }
    }

    /* renamed from: a */
    public static final camw m126813a(Class cls, InputStream inputStream) {
        if (cls == camz.class) {
            return m126812a(inputStream);
        }
        throw new IllegalArgumentException("SubscribedFeeds supports only a single feed type");
    }
}

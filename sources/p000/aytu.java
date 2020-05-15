package p000;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.io.Closeable;

/* renamed from: aytu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aytu implements Closeable {

    /* renamed from: a */
    public static final String[] f98473a = {"android.provider.ALTERNATE_CONTACTS_STRUCTURE", "android.provider.CONTACTS_STRUCTURE"};

    /* renamed from: b */
    public final Context f98474b;

    /* renamed from: c */
    public XmlResourceParser f98475c;

    /* renamed from: d */
    public boolean f98476d;

    /* renamed from: e */
    public boolean f98477e;

    /* renamed from: f */
    public boolean f98478f;

    public aytu(Context context) {
        this.f98474b = context;
    }

    /* renamed from: a */
    public final void mo54433a() {
        this.f98478f = false;
        this.f98476d = false;
        this.f98477e = false;
    }

    public final void close() {
        XmlResourceParser xmlResourceParser = this.f98475c;
        if (xmlResourceParser != null) {
            xmlResourceParser.close();
            this.f98475c = null;
        }
    }
}

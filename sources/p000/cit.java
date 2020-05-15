package p000;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: cit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cit implements cdt {

    /* renamed from: a */
    private final String f6914a;

    /* renamed from: b */
    private Object f6915b;

    public cit(String str) {
        this.f6914a = str;
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final void mo3753b() {
        try {
            ((InputStream) this.f6915b).close();
        } catch (IOException e) {
        }
    }

    /* renamed from: c */
    public final void mo3754c() {
    }

    /* renamed from: d */
    public final int mo3755d() {
        return 1;
    }

    /* renamed from: a */
    public final void mo3751a(cbs cbs, cds cds) {
        try {
            String str = this.f6914a;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                } else if (str.substring(0, indexOf).endsWith(";base64")) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    this.f6915b = byteArrayInputStream;
                    cds.mo3762a(byteArrayInputStream);
                } else {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
            } else {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        } catch (IllegalArgumentException e) {
            cds.mo3761a((Exception) e);
        }
    }
}

package p000;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: aykm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykm {

    /* renamed from: a */
    public final aykn f97852a;

    /* renamed from: b */
    public final ArrayList f97853b = new ArrayList();

    /* renamed from: c */
    public boolean f97854c = false;

    /* renamed from: d */
    public int f97855d = 0;

    /* renamed from: e */
    private final aykq f97856e = new aykq(this.f97852a);

    /* renamed from: a */
    public final ByteString mo54055a() {
        this.f97852a.mo54059a();
        if (this.f97852a.f97857a == 0) {
            return ByteString.f164797b;
        }
        int i = 0;
        while (true) {
            try {
                aykp a = this.f97856e.mo54067a();
                if (a != null) {
                    i += a.f97866c;
                    if (a.f97864a != 2) {
                        int i2 = a.f97865b;
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Section ");
                        sb.append(i2);
                        sb.append(" is not a message type");
                        throw new aykl(sb.toString());
                    } else if (a.f97865b == 1) {
                        this.f97853b.add((caeh) GeneratedMessageLite.m124014a(caeh.f172821b, this.f97852a.mo54060a(a.mo54063a(), a.f97868e)));
                    }
                } else if (i == 0) {
                    byte[] b = this.f97856e.mo54068b();
                    if (b != null) {
                        this.f97855d++;
                        return ByteString.m123261a(b);
                    } else if (this.f97856e.mo54069c()) {
                        return mo54055a();
                    } else {
                        throw new aykl("Can't skip the next field");
                    }
                } else if (i == this.f97856e.f97869a) {
                    ByteString a2 = ByteString.m123261a(this.f97852a.mo54060a(0, i));
                    this.f97856e.mo54070d();
                    this.f97855d++;
                    return a2;
                } else {
                    throw new aykl(String.format(Locale.getDefault(), "bytes to upload %d should equal to index of read %d", Integer.valueOf(i), Integer.valueOf(this.f97856e.f97869a)));
                }
            } catch (ayko e) {
                throw new aykl("can't serialize to valid proto", e);
            } catch (NoSuchMethodException e2) {
                throw new aykl("Invalid invocation", e2);
            }
        }
    }

    public aykm(InputStream inputStream, int i) {
        this.f97852a = new aykn(inputStream, i);
    }
}

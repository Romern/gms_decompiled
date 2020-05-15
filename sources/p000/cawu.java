package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cawu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawu {

    /* renamed from: a */
    public int f176286a;

    /* renamed from: b */
    public final cipw f176287b;

    /* renamed from: c */
    private final ciqd f176288c;

    public cawu(cipw cipw) {
        caws caws = new caws(this, cipw);
        ciqd ciqd = new ciqd(ciqh.m150828a(caws), new cawt());
        this.f176288c = ciqd;
        this.f176287b = ciqh.m150828a(ciqd);
    }

    /* renamed from: a */
    private final cipx m127431a() {
        return this.f176287b.mo86303d((long) this.f176287b.mo86312g());
    }

    /* renamed from: a */
    public final List mo75030a(int i) {
        this.f176286a += i;
        int g = this.f176287b.mo86312g();
        if (g < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("numberOfPairs < 0: ");
            sb.append(g);
            throw new IOException(sb.toString());
        } else if (g <= 1024) {
            ArrayList arrayList = new ArrayList(g);
            int i2 = 0;
            while (i2 < g) {
                cipx d = m127431a().mo86344d();
                cipx a = m127431a();
                if (d.mo86345e() != 0) {
                    arrayList.add(new cawh(d, a));
                    i2++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            if (this.f176286a > 0) {
                this.f176288c.mo86361b();
                int i3 = this.f176286a;
                if (i3 != 0) {
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("compressedLimit > 0: ");
                    sb2.append(i3);
                    throw new IOException(sb2.toString());
                }
            }
            return arrayList;
        } else {
            StringBuilder sb3 = new StringBuilder(33);
            sb3.append("numberOfPairs > 1024: ");
            sb3.append(g);
            throw new IOException(sb3.toString());
        }
    }
}

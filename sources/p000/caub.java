package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: caub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caub {

    /* renamed from: a */
    public final List f175979a = new ArrayList(20);

    /* renamed from: d */
    private static final void m127196d(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            if (str2 != null) {
                int length2 = str2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char charAt2 = str2.charAt(i2);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str2));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("value == null");
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: a */
    public final cauc mo74866a() {
        return new cauc(this);
    }

    /* renamed from: b */
    public final void mo74869b(String str, String str2) {
        m127196d(str, str2);
        mo74867a(str);
        mo74868a(str, str2);
    }

    /* renamed from: c */
    public final void mo74870c(String str, String str2) {
        m127196d(str, str2);
        mo74868a(str, str2);
    }

    /* renamed from: a */
    public final void mo74867a(String str) {
        int i = 0;
        while (i < this.f175979a.size()) {
            if (str.equalsIgnoreCase((String) this.f175979a.get(i))) {
                this.f175979a.remove(i);
                this.f175979a.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* renamed from: a */
    public final void mo74868a(String str, String str2) {
        this.f175979a.add(str);
        this.f175979a.add(str2.trim());
    }
}

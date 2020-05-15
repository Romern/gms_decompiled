package p000;

import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: bobk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobk {

    /* renamed from: a */
    public final Queue f132501a = new LinkedList();

    /* renamed from: b */
    private final Readable f132502b;

    /* renamed from: c */
    private final Reader f132503c;

    /* renamed from: d */
    private final CharBuffer f132504d;

    /* renamed from: e */
    private final char[] f132505e;

    /* renamed from: f */
    private final bobj f132506f = new bobj(this);

    public bobk(Readable readable) {
        CharBuffer allocate = CharBuffer.allocate(2048);
        this.f132504d = allocate;
        this.f132505e = allocate.array();
        bmxy.m108581a(readable);
        this.f132502b = readable;
        this.f132503c = (Reader) readable;
    }

    /* renamed from: a */
    public final String mo68856a() {
        int i;
        while (true) {
            if (this.f132501a.peek() != null) {
                break;
            }
            this.f132504d.clear();
            Reader reader = this.f132503c;
            int i2 = 0;
            if (reader != null) {
                char[] cArr = this.f132505e;
                i = reader.read(cArr, 0, cArr.length);
            } else {
                i = this.f132502b.read(this.f132504d);
            }
            if (i != -1) {
                bobj bobj = this.f132506f;
                char[] cArr2 = this.f132505e;
                if (bobj.f132499b && i > 0) {
                    char c = cArr2[0];
                    bobj.mo68855a();
                    if (c == 10) {
                        i2 = 1;
                    }
                }
                int i3 = i2;
                while (i2 < i) {
                    char c2 = cArr2[i2];
                    if (c2 == 10) {
                        bobj.f132498a.append(cArr2, i3, i2 - i3);
                        bobj.mo68855a();
                        i3 = i2 + 1;
                    } else if (c2 == 13) {
                        bobj.f132498a.append(cArr2, i3, i2 - i3);
                        bobj.f132499b = true;
                        int i4 = i2 + 1;
                        if (i4 < i) {
                            char c3 = cArr2[i4];
                            bobj.mo68855a();
                            if (c3 == 10) {
                                i2 = i4;
                            }
                        }
                        i3 = i2 + 1;
                    }
                    i2++;
                }
                bobj.f132498a.append(cArr2, i3, i - i3);
            } else {
                bobj bobj2 = this.f132506f;
                if (bobj2.f132499b || bobj2.f132498a.length() > 0) {
                    bobj2.mo68855a();
                }
            }
        }
        return (String) this.f132501a.poll();
    }
}

package p000;

import com.android.volley.Header;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnx {

    /* renamed from: a */
    public long f5212a;

    /* renamed from: b */
    public final String f5213b;

    /* renamed from: c */
    public final String f5214c;

    /* renamed from: d */
    public final long f5215d;

    /* renamed from: e */
    public final long f5216e;

    /* renamed from: f */
    public final long f5217f;

    /* renamed from: g */
    public final long f5218g;

    /* renamed from: h */
    public final List f5219h;

    public bnx(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.f5213b = str;
        this.f5214c = "".equals(str2) ? null : str2;
        this.f5215d = j;
        this.f5216e = j2;
        this.f5217f = j3;
        this.f5218g = j4;
        this.f5219h = list;
    }

    /* renamed from: a */
    public static bnx m3396a(bny bny) {
        if (DiskBasedCache.m4770a((InputStream) bny) == 538247942) {
            String a = DiskBasedCache.m4772a(bny);
            String a2 = DiskBasedCache.m4772a(bny);
            long b = DiskBasedCache.m4779b(bny);
            long b2 = DiskBasedCache.m4779b(bny);
            long b3 = DiskBasedCache.m4779b(bny);
            long b4 = DiskBasedCache.m4779b(bny);
            int a3 = DiskBasedCache.m4770a((InputStream) bny);
            if (a3 >= 0) {
                List arrayList = a3 != 0 ? new ArrayList() : Collections.emptyList();
                for (int i = 0; i < a3; i++) {
                    arrayList.add(new Header(DiskBasedCache.m4772a(bny).intern(), DiskBasedCache.m4772a(bny).intern()));
                }
                return new bnx(a, a2, b, b2, b3, b4, arrayList);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(a3);
            throw new IOException(sb.toString());
        }
        throw new IOException();
    }
}

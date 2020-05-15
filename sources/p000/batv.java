package p000;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: batv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class batv {

    /* renamed from: a */
    private static final bnzc f101734a = bnzi.m110905g();

    /* renamed from: b */
    private static final TimeZone f101735b = TimeZone.getTimeZone("America/Los_Angeles");

    /* renamed from: c */
    private final ayte f101736c;

    /* renamed from: d */
    private final String f101737d;

    /* renamed from: e */
    private final int f101738e;

    /* renamed from: f */
    private final Set f101739f = new HashSet();

    /* renamed from: g */
    private volatile long f101740g;

    /* renamed from: h */
    private final int f101741h;

    public batv(ayte ayte, String str, int i, int i2) {
        this.f101736c = ayte;
        this.f101737d = str;
        this.f101738e = i;
        this.f101741h = i2;
        this.f101740g = m87537a();
    }

    /* renamed from: a */
    private final long m87537a() {
        if (this.f101741h == 1) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(this.f101736c.mo54417a());
            gregorianCalendar.setTimeZone(f101735b);
            gregorianCalendar.set(11, 0);
            gregorianCalendar.set(12, 0);
            gregorianCalendar.set(13, 0);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(f101735b);
        gregorianCalendar2.setTimeInMillis(this.f101736c.mo54417a());
        gregorianCalendar2.set(11, 0);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        gregorianCalendar2.set(14, 0);
        return gregorianCalendar2.getTimeInMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (r0 != false) goto L_0x00c0;
     */
    /* renamed from: a */
    public final bpwx mo55958a(String str) {
        if (this.f101738e == 0) {
            return null;
        }
        long a = m87537a();
        String str2 = this.f101737d;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 22 + String.valueOf(str).length());
        sb.append(a);
        sb.append("|");
        sb.append(str2);
        sb.append("|");
        sb.append(str);
        bnzb a2 = f101734a.mo68720a(sb.toString());
        int i = this.f101738e;
        if (this.f101741h != 1 ? a2.mo68742d() % ((long) i) == 0 : a2.mo68741c() % i == 0) {
            if (a >= this.f101740g) {
                synchronized (this) {
                    if (this.f101740g < a) {
                        this.f101740g = a;
                        this.f101739f.clear();
                    }
                    boolean z = !this.f101739f.add(a2);
                }
            }
            bxvd da = bpwx.f139583f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwx bpwx = (bpwx) da.f164949b;
            str.getClass();
            int i2 = bpwx.f139585a | 1;
            bpwx.f139585a = i2;
            bpwx.f139586b = str;
            int i3 = i2 | 2;
            bpwx.f139585a = i3;
            bpwx.f139587c = a;
            int i4 = this.f101738e;
            int i5 = i3 | 4;
            bpwx.f139585a = i5;
            bpwx.f139588d = (long) i4;
            int i6 = this.f101741h;
            if (i6 != 0) {
                bpwx.f139585a = i5 | 8;
                bpwx.f139589e = i6 - 1;
                return (bpwx) da.mo74062i();
            }
            throw null;
        }
        return null;
    }
}

package p000;

import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pjk {

    /* renamed from: a */
    final Map f39357a = new HashMap();

    /* renamed from: b */
    int f39358b;

    /* renamed from: c */
    boolean f39359c;

    /* renamed from: d */
    blsw f39360d;

    /* renamed from: e */
    public pja f39361e;

    /* renamed from: f */
    private final String f39362f;

    /* renamed from: g */
    private final int f39363g;

    /* renamed from: h */
    private final int f39364h;

    /* renamed from: i */
    private int f39365i = 0;

    /* renamed from: j */
    private final List f39366j = new ArrayList();

    public pjk(blsw blsw, String str, int i, int i2) {
        mo23268a(blsw);
        this.f39362f = str;
        this.f39363g = i;
        this.f39364h = i2;
    }

    /* renamed from: a */
    public static int m30560a(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).length();
        }
        if (obj instanceof byte[]) {
            return ((byte[]) obj).length;
        }
        return 0;
    }

    /* renamed from: b */
    private final void m30562b(String str) {
        pja pja = this.f39361e;
        if (pja != null) {
            ptb ptb = (ptb) pja.f39268a.f39322k.get(str);
        }
    }

    /* renamed from: a */
    public final void mo23268a(blsw blsw) {
        this.f39360d = blsw;
        this.f39359c = blsw.f127636f > 0;
    }

    /* renamed from: b */
    public final synchronized boolean mo23273b() {
        return this.f39358b > 0;
    }

    /* renamed from: c */
    public final synchronized void mo23274c() {
        this.f39357a.clear();
        this.f39366j.clear();
        this.f39365i = 0;
        this.f39358b = 0;
    }

    /* renamed from: a */
    private final void m30561a(pjj pjj, String str) {
        List list = (List) this.f39357a.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f39357a.put(str, list);
            this.f39366j.add(str);
        }
        list.add(pjj);
        this.f39358b++;
        if (list.size() == this.f39364h) {
            m30562b(str);
        }
    }

    /* renamed from: a */
    public final synchronized pji mo23266a() {
        boolean z;
        int i;
        List list = null;
        if (!mo23273b()) {
            return null;
        }
        String str = null;
        do {
            String str2 = (String) this.f39366j.get(this.f39365i);
            List list2 = (List) this.f39357a.get(str2);
            boolean isEmpty = list2.isEmpty();
            if (!isEmpty) {
                str = str2;
            }
            if (!isEmpty) {
                list = list2;
            }
            z = true;
            int i2 = this.f39365i + 1;
            this.f39365i = i2;
            if (i2 == this.f39366j.size()) {
                this.f39365i = 0;
                continue;
            }
        } while (list == null);
        pjj pjj = (pjj) list.get(0);
        bxvd da = blsx.f127637k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blsx blsx = (blsx) da.f164949b;
        str.getClass();
        int i3 = blsx.f127639a | 8;
        blsx.f127639a = i3;
        blsx.f127643e = str;
        boolean z2 = pjj.f39354d;
        if (!z2) {
            i = 1;
        } else {
            i = 2;
        }
        blsx.f127644f = i - 1;
        int i4 = i3 | 16;
        blsx.f127639a = i4;
        blsx.f127640b = this.f39360d.f127636f;
        int i5 = i4 | 1;
        blsx.f127639a = i5;
        String str3 = this.f39362f;
        str3.getClass();
        int i6 = i5 | 2;
        blsx.f127639a = i6;
        blsx.f127641c = str3;
        String str4 = pjj.f39352b;
        str4.getClass();
        int i7 = i6 | 4;
        blsx.f127639a = i7;
        blsx.f127642d = str4;
        if (pjj.f39355e) {
            int a = pjj.f39351a.mo73744a() - pjj.f39353c;
            int min = Math.min(this.f39363g, a);
            int i8 = a - min;
            ByteString bxtx = pjj.f39351a;
            int i9 = pjj.f39353c;
            ByteString a2 = bxtx.mo73754a(i9, i9 + min);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blsx blsx2 = (blsx) da.f164949b;
            a2.getClass();
            int i10 = blsx2.f127639a | 64;
            blsx2.f127639a = i10;
            blsx2.f127646h = a2;
            if (i8 == 0) {
                z = false;
            }
            int i11 = i10 | 128;
            blsx2.f127639a = i11;
            blsx2.f127647i = z;
            blsx2.f127639a = i11 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            blsx2.f127648j = i8;
            pjj.f39353c += min;
            if (i8 == 0) {
            }
            return new pji((blsx) da.mo74062i(), pjj.f39356f, pjj.f39351a.mo73744a());
        } else if (z2) {
            ByteString bxtx2 = pjj.f39351a;
            bxtx2.getClass();
            blsx.f127639a = i7 | 64;
            blsx.f127646h = bxtx2;
        } else {
            String l = pjj.f39351a.mo73781l();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blsx blsx3 = (blsx) da.f164949b;
            l.getClass();
            blsx3.f127639a |= 32;
            blsx3.f127645g = l;
        }
        list.remove(0);
        this.f39358b--;
        if (list.size() == this.f39364h - 1) {
            m30562b(str);
        }
        return new pji((blsx) da.mo74062i(), pjj.f39356f, pjj.f39351a.mo73744a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized pji mo23267a(String str, Object obj, long j, String str2) {
        if (!TextUtils.isEmpty(str)) {
            bxvd da = blsx.f127637k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blsx blsx = (blsx) da.f164949b;
            blsx.f127644f = 0;
            blsx.f127639a |= 16;
            blsw blsw = blsw.CASTV2_1_0;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blsx blsx2 = (blsx) da.f164949b;
            blsx2.f127640b = blsw.f127636f;
            int i = blsx2.f127639a | 1;
            blsx2.f127639a = i;
            String str3 = this.f39362f;
            str3.getClass();
            int i2 = i | 2;
            blsx2.f127639a = i2;
            blsx2.f127641c = str3;
            str2.getClass();
            int i3 = i2 | 4;
            blsx2.f127639a = i3;
            blsx2.f127642d = str2;
            str.getClass();
            int i4 = i3 | 8;
            blsx2.f127639a = i4;
            blsx2.f127643e = str;
            if (obj instanceof String) {
                String str4 = (String) obj;
                str4.getClass();
                int i5 = i4 | 32;
                blsx2.f127639a = i5;
                blsx2.f127645g = str4;
                blsx2.f127644f = 0;
                blsx2.f127639a = i5 | 16;
            } else if (obj instanceof byte[]) {
                ByteString a = ByteString.m123261a((byte[]) obj);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blsx blsx3 = (blsx) da.f164949b;
                a.getClass();
                int i6 = blsx3.f127639a | 64;
                blsx3.f127639a = i6;
                blsx3.f127646h = a;
                blsx3.f127644f = 1;
                blsx3.f127639a = i6 | 16;
            }
            return new pji((blsx) da.mo74062i(), j, m30560a(obj));
        }
    }

    /* renamed from: a */
    public final synchronized void mo23269a(String str, long j) {
        List list = (List) this.f39357a.get(str);
        if (list != null && !list.isEmpty() && ((pjj) list.get(0)).f39356f == j) {
            list.remove(0);
            this.f39358b--;
            if (list.size() == this.f39364h - 1) {
                m30562b(str);
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo23270a(String str) {
        List list = (List) this.f39357a.get(str);
        return (list != null ? list.size() : 0) == this.f39364h;
    }

    /* renamed from: a */
    public final synchronized boolean mo23271a(String str, String str2, String str3, long j) {
        boolean z;
        if (mo23270a(str2) || TextUtils.isEmpty(str2)) {
            z = false;
        } else {
            m30561a(new pjj(ByteString.m123258a(str), false, str3, this.f39359c, j), str2);
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized boolean mo23272a(byte[] bArr, String str, String str2, long j) {
        boolean z;
        if (mo23270a(str) || TextUtils.isEmpty(str)) {
            z = false;
        } else {
            m30561a(new pjj(ByteString.m123261a(bArr), true, str2, this.f39359c, j), str);
            z = true;
        }
        return z;
    }
}

package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: yvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yvk {

    /* renamed from: a */
    public static final /* synthetic */ int f54677a = 0;

    /* renamed from: b */
    private static final srn f54678b = zvt.m46581a();

    /* renamed from: c */
    private final boolean f54679c;

    /* renamed from: d */
    private final caaq f54680d;

    /* renamed from: e */
    private final int f54681e;

    /* renamed from: f */
    private bmzi f54682f;

    /* renamed from: g */
    private bmzi f54683g;

    /* renamed from: h */
    private String f54684h;

    /* renamed from: i */
    private yvj[] f54685i;

    /* renamed from: j */
    private final yuw f54686j = yuq.m44881a(yux.f54662a, yva.f54665a);

    public yvk(caaq caaq, boolean z, int i, int i2) {
        bmzi bmzi;
        this.f54680d = caaq;
        this.f54679c = z;
        this.f54681e = i;
        if (m44901a(zvn.f56031a, (Set) this.f54686j.mo30787a())) {
            this.f54682f = yvb.f54666a;
            this.f54683g = yvc.f54667a;
        } else {
            if (i2 != 1) {
                caap caap = caap.WATCH;
                caap a = caap.m126421a(caaq.f172360c);
                if (!caap.equals(a == null ? caap.UNKNOWN : a)) {
                    this.f54682f = yvf.f54670a;
                    bmzi = yvg.f54671a;
                } else {
                    this.f54682f = yvh.f54672a;
                    bmzi = yvi.f54673a;
                }
            } else {
                this.f54682f = yvd.f54668a;
                bmzi = yve.f54669a;
            }
            this.f54683g = bmzi;
        }
        String str = (String) this.f54682f.mo6606a();
        this.f54684h = str;
        try {
            this.f54685i = m44902a(str);
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f54678b.mo68388c();
            bnsl.mo68432a("yvk", "<init>", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to parse config. Will revert to default sampling rate instead.");
            this.f54685i = new yvj[0];
        }
    }

    /* renamed from: a */
    private final void m44900a() {
        if (m44901a(zvn.f56031a, (Set) this.f54686j.mo30787a())) {
            this.f54682f = yuy.f54663a;
            this.f54683g = yuz.f54664a;
        }
        if (!this.f54684h.equals(this.f54682f.mo6606a())) {
            String str = this.f54684h;
            String str2 = (String) this.f54682f.mo6606a();
            this.f54684h = str2;
            try {
                this.f54685i = m44902a(str2);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) f54678b.mo68388c();
                bnsl.mo68432a("yvk", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Failed to parse new config: %s. Reverting to old config: %s", this.f54684h, str);
                this.f54684h = str;
            }
        }
    }

    /* renamed from: a */
    private static boolean m44901a(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static yvj[] m44902a(String str) {
        if (str.isEmpty()) {
            return new yvj[0];
        }
        String[] split = str.split(":");
        int length = split.length;
        yvj[] yvjArr = new yvj[length];
        for (int i = 0; i < length; i++) {
            String[] split2 = split[i].split(",");
            int length2 = split2.length;
            if (length2 == 2) {
                yvjArr[i] = new yvj(null, split2[0], Long.parseLong(split2[1]));
            } else if (length2 == 3) {
                yvjArr[i] = new yvj(split2[0], split2[1], Long.parseLong(split2[2]));
            } else {
                throw new IllegalArgumentException(String.format("Invalid rule #%s: %s", Integer.valueOf(i), split[i]));
            }
        }
        return yvjArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        if (p000.cdzm.f182081a.mo6606a().mo78613e() == false) goto L_0x00bb;
     */
    /* renamed from: a */
    public final synchronized long mo30788a(caae caae, caah caah) {
        boolean z;
        if (m44901a(zvn.f56031a, (Set) this.f54686j.mo30787a())) {
            this.f54682f = yuy.f54663a;
            this.f54683g = yuz.f54664a;
        }
        if (!this.f54684h.equals(this.f54682f.mo6606a())) {
            String str = this.f54684h;
            String str2 = (String) this.f54682f.mo6606a();
            this.f54684h = str2;
            try {
                this.f54685i = m44902a(str2);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) f54678b.mo68388c();
                bnsl.mo68432a("yvk", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Failed to parse new config: %s. Reverting to old config: %s", this.f54684h, str);
                this.f54684h = str;
            }
        }
        if (this.f54681e == 1) {
            if (caae != null) {
                caah caah2 = bzzn.f172073M;
                caah caah3 = caae.f172330f;
                if (caah3 == null) {
                    caah3 = caah.f172333d;
                }
                if (caah2.equals(caah3)) {
                    caaq caaq = this.f54680d;
                    caaq caaq2 = caae.f172331g;
                    if (caaq2 == null) {
                        caaq2 = caaq.f172356h;
                    }
                    if (caaq.equals(caaq2)) {
                        caap caap = caap.UNKNOWN;
                        caap a = caap.m126421a(this.f54680d.f172360c);
                        if (a == null) {
                            a = caap.UNKNOWN;
                        }
                        if (a.ordinal() != 3) {
                            if (!cdzm.f182081a.mo6606a().mo78612d()) {
                            }
                        } else if (!this.f54679c) {
                            if (!cdzm.f182081a.mo6606a().mo78614f()) {
                            }
                        }
                        return -1;
                    }
                }
            }
        }
        yvj[] yvjArr = this.f54685i;
        for (yvj yvj : yvjArr) {
            String str3 = yvj.f54674a;
            if (str3 == null) {
                z = true;
            } else {
                if (caae != null) {
                    if (str3.equals(caae.f172328d)) {
                        z = true;
                    }
                }
                z = false;
            }
            if (yvj.f54675b.equals(caah.f172336b) && z) {
                return yvj.f54676c;
            }
        }
        caap caap2 = caap.WATCH;
        caap a2 = caap.m126421a(this.f54680d.f172360c);
        if (a2 == null) {
            a2 = caap.UNKNOWN;
        }
        if (caap2.equals(a2)) {
            if (caah.f172336b.equals("com.google.step_count.cumulative")) {
                return cdzd.f182003a.mo6606a().mo78537D();
            }
        }
        return ((Long) this.f54683g.mo6606a()).longValue();
    }
}

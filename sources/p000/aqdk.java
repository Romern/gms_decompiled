package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aqdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqdk {

    /* renamed from: a */
    private static final bnic f85766a = bnic.m109494a(1, 4, 5, 3, 12, 13, 15);

    /* renamed from: e */
    private static aqdk f85767e = null;

    /* renamed from: b */
    private final boolean f85768b;

    /* renamed from: c */
    private final boolean f85769c;

    /* renamed from: d */
    private final long f85770d;

    /* renamed from: f */
    private final SparseIntArray f85771f;

    /* renamed from: g */
    private final SparseIntArray f85772g;

    /* renamed from: h */
    private SparseIntArray f85773h;

    /* renamed from: i */
    private String f85774i = "";

    /* renamed from: j */
    private Set f85775j = null;

    /* renamed from: k */
    private int f85776k = -1;

    /* renamed from: l */
    private final apyk f85777l;

    static {
        aqdk.class.getSimpleName();
    }

    private aqdk(Context context) {
        this.f85768b = apum.m71052d(context);
        this.f85769c = apum.m71054f(context);
        this.f85770d = apum.m71053e(context);
        this.f85777l = new apyk(context);
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f85771f = sparseIntArray;
        sparseIntArray.append(1, 15);
        this.f85771f.append(4, 16);
        this.f85771f.append(5, 15);
        this.f85771f.append(13, 14);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        this.f85772g = sparseIntArray2;
        sparseIntArray2.append(4, 11);
    }

    /* renamed from: a */
    static synchronized aqdk m71388a(Context context) {
        aqdk aqdk;
        synchronized (aqdk.class) {
            if (f85767e == null) {
                f85767e = new aqdk(context);
            }
            aqdk = f85767e;
        }
        return aqdk;
    }

    /* renamed from: b */
    private final synchronized void m71389b() {
        int i;
        if (this.f85775j == null || !this.f85774i.equals(cgkt.m145947s())) {
            if (!TextUtils.isEmpty(cgkt.m145947s())) {
                String s = cgkt.m145947s();
                List c = bmyx.m108640a(';').mo66925c((CharSequence) s);
                try {
                    i = Integer.parseInt((String) c.get(0));
                } catch (NumberFormatException e) {
                    i = 0;
                }
                String string = this.f85777l.f85144b.getString("safe_browsing_config", "");
                if (!TextUtils.isEmpty(string)) {
                    List c2 = bmyx.m108640a(';').mo66925c((CharSequence) string);
                    try {
                        if (c2.size() > 2 && (Integer.parseInt((String) c2.get(0)) >= i || c.size() <= 2)) {
                            c = c2;
                            s = string;
                        }
                    } catch (NumberFormatException e2) {
                    }
                }
                if (c.size() > 2) {
                    HashSet hashSet = new HashSet();
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    try {
                        int parseInt = Integer.parseInt((String) c.get(1));
                        if (parseInt >= 0 && this.f85770d >= apum.m71042a((long) parseInt)) {
                            int i2 = 2;
                            while (i2 < c.size()) {
                                List c3 = bmyx.m108640a(',').mo66925c((CharSequence) c.get(i2));
                                if (c3.size() == 2) {
                                    int parseInt2 = Integer.parseInt((String) c3.get(0));
                                    int parseInt3 = Integer.parseInt((String) c3.get(1));
                                    hashSet.add(Integer.valueOf(parseInt2));
                                    sparseIntArray.append(parseInt2, Math.min(parseInt3, 20));
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                            this.f85776k = parseInt;
                            this.f85775j = hashSet;
                            this.f85773h = sparseIntArray;
                            this.f85774i = s;
                            apyk.m71179a(this.f85777l.f85144b, "safe_browsing_config", s);
                        }
                    } catch (NumberFormatException e3) {
                    }
                }
            } else {
                this.f85775j = null;
                this.f85773h = null;
                this.f85776k = -1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo47758a(int i) {
        int i2;
        m71389b();
        if (this.f85769c) {
            return 1048576;
        }
        if (this.f85776k >= 0) {
            SparseIntArray sparseIntArray = this.f85773h;
            if (sparseIntArray == null || (i2 = sparseIntArray.get(i, -1)) < 0) {
                return 0;
            }
            return 1 << i2;
        } else if (this.f85768b) {
            int i3 = this.f85772g.get(i, -1);
            if (i3 >= 0) {
                return 1 << i3;
            }
            return 1024;
        } else {
            int i4 = this.f85771f.get(i, -1);
            if (i4 >= 0) {
                return 1 << i4;
            }
            return 1024;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set mo47759a() {
        Set set;
        if (!TextUtils.isEmpty(cgkt.m145947s())) {
            m71389b();
            set = this.f85775j;
        } else {
            set = null;
        }
        return set == null ? f85766a : set;
    }
}

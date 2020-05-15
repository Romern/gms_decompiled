package p000;

import android.content.ContentResolver;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bdyx {

    /* renamed from: a */
    private static final Object f106649a = new Object();

    /* renamed from: b */
    public static Context f106650b = null;

    /* renamed from: f */
    private static Collection f106651f;

    /* renamed from: g */
    private static bmzi f106652g;

    /* renamed from: h */
    private static final AtomicInteger f106653h = new AtomicInteger();

    /* renamed from: c */
    final bdyw f106654c;

    /* renamed from: d */
    final String f106655d;

    /* renamed from: e */
    public final Object f106656e;

    /* renamed from: i */
    private volatile int f106657i = -1;

    /* renamed from: j */
    private volatile Object f106658j;

    public bdyx(bdyw bdyw, String str, Object obj) {
        String str2 = bdyw.f106640a;
        if (str2 == null && bdyw.f106641b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || bdyw.f106641b == null) {
            this.f106654c = bdyw;
            this.f106655d = str;
            this.f106656e = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    /* renamed from: a */
    public static bdyx m91605a(bdyw bdyw, String str, double d) {
        return new bdyr(bdyw, str, Double.valueOf(d));
    }

    /* renamed from: b */
    public static void m91615b(Context context) {
        synchronized (f106649a) {
            if (f106650b == null) {
                m91614a(context);
            }
        }
    }

    /* renamed from: d */
    private final Object m91616d() {
        bdyc bdyc;
        Object a;
        boolean z = this.f106654c.f106646g;
        String b = bdyf.m91574a(f106650b).mo58433a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (b == null || !aymn.f97982c.matcher(b).matches()) {
            if (this.f106654c.f106641b == null) {
                bdyc = bdyz.m91622a(f106650b, this.f106654c.f106640a);
            } else if (!bdyi.m91580a(f106650b, this.f106654c.f106641b)) {
                bdyc = null;
            } else if (this.f106654c.f106647h) {
                ContentResolver contentResolver = f106650b.getContentResolver();
                String lastPathSegment = this.f106654c.f106641b.getLastPathSegment();
                String packageName = f106650b.getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(lastPathSegment).length() + 1 + String.valueOf(packageName).length());
                sb.append(lastPathSegment);
                sb.append("#");
                sb.append(packageName);
                bdyc = bdxy.m91563a(contentResolver, bdyj.m91581a(sb.toString()));
            } else {
                bdyc = bdxy.m91563a(f106650b.getContentResolver(), this.f106654c.f106641b);
            }
            if (!(bdyc == null || (a = bdyc.mo58433a(mo58453b())) == null)) {
                return mo58442a(a);
            }
        }
        return null;
    }

    /* renamed from: e */
    private final Object m91617e() {
        bmxj bmxj;
        String str;
        bdyw bdyw = this.f106654c;
        if (!bdyw.f106644e && ((bmxj = bdyw.f106648i) == null || ((Boolean) bmxj.apply(f106650b)).booleanValue())) {
            bdyf a = bdyf.m91574a(f106650b);
            bdyw bdyw2 = this.f106654c;
            if (!bdyw2.f106644e) {
                str = m91612a(bdyw2.f106642c);
            } else {
                str = null;
            }
            String b = a.mo58433a(str);
            if (b != null) {
                return mo58442a((Object) b);
            }
        }
        return null;
    }

    /* renamed from: a */
    public abstract Object mo58442a(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* renamed from: c */
    public final Object mo58455c() {
        Object obj;
        bmxv bmxv;
        int i = f106653h.get();
        if (this.f106657i < i) {
            synchronized (this) {
                if (this.f106657i < i) {
                    if (f106650b != null) {
                        if (this.f106654c.f106645f) {
                            obj = m91617e();
                            if (obj == null) {
                                obj = m91616d();
                                if (obj == null) {
                                }
                            }
                            bmxv = (bmxv) f106652g.mo6606a();
                            if (bmxv.mo66813a()) {
                                bdyw bdyw = this.f106654c;
                                String a = ((bdyg) bmxv.mo66814b()).mo58439a(bdyw.f106641b, bdyw.f106640a, bdyw.f106643d, this.f106655d);
                                if (a != null) {
                                    obj = mo58442a((Object) a);
                                } else {
                                    obj = this.f106656e;
                                }
                            }
                            this.f106658j = obj;
                            this.f106657i = i;
                        } else {
                            obj = m91616d();
                            if (obj == null) {
                                obj = m91617e();
                            }
                            bmxv = (bmxv) f106652g.mo6606a();
                            if (bmxv.mo66813a()) {
                            }
                            this.f106658j = obj;
                            this.f106657i = i;
                        }
                        obj = this.f106656e;
                        bmxv = (bmxv) f106652g.mo6606a();
                        if (bmxv.mo66813a()) {
                        }
                        this.f106658j = obj;
                        this.f106657i = i;
                    } else {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                }
            }
        }
        return this.f106658j;
    }

    /* renamed from: a */
    public static bdyx m91606a(bdyw bdyw, String str, int i) {
        return new bdyp(bdyw, str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static bdyx m91607a(bdyw bdyw, String str, long j) {
        return new bdyo(bdyw, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static bdyx m91608a(bdyw bdyw, String str, Object obj, bdyv bdyv) {
        return new bdyu(bdyw, str, obj, bdyv);
    }

    /* renamed from: b */
    public final String mo58453b() {
        return m91612a(this.f106654c.f106643d);
    }

    /* renamed from: a */
    public static bdyx m91609a(bdyw bdyw, String str, String str2) {
        return new bdys(bdyw, str, str2);
    }

    /* renamed from: b */
    public final void mo58454b(Object obj) {
        if (obj != null) {
            this.f106658j = obj;
            this.f106657i = Integer.MAX_VALUE;
            if (f106651f == null) {
                f106651f = new ArrayList();
            }
            f106651f.add(this);
            return;
        }
        this.f106657i = -1;
    }

    /* renamed from: a */
    public static bdyx m91610a(bdyw bdyw, String str, boolean z) {
        return new bdyq(bdyw, str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static bdyx m91611a(bdyw bdyw, String str, byte[] bArr) {
        return new bdyt(bdyw, str, bArr);
    }

    /* renamed from: a */
    private final String m91612a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f106655d;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f106655d);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    static void m91613a() {
        f106653h.incrementAndGet();
    }

    /* renamed from: a */
    public static void m91614a(Context context) {
        synchronized (f106649a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f106650b != context) {
                bdxy.m91565c();
                bdyz.m91624c();
                bdyf.m91575a();
                m91613a();
                f106650b = context;
                f106652g = bmzn.m108681a(bdyn.f106638a);
            }
        }
    }
}

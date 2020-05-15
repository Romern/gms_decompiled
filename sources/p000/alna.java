package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.concurrent.TimeUnit;

/* renamed from: alna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alna extends amqd {

    /* renamed from: Dn */
    private final alzm f73816Dn;

    /* renamed from: Do */
    private final ancw f73817Do;

    /* renamed from: Dp */
    private final boolean f73818Dp;

    /* renamed from: Dq */
    private bmza f73819Dq;

    /* renamed from: a */
    protected final boolean f73820a;

    /* renamed from: b */
    protected almh f73821b;

    public alna(String str, int i, alzm alzm, String str2, String str3) {
        this(str, i, alzm, str2, str3, null);
    }

    /* renamed from: a */
    private final void m61377a(int i, int i2) {
        almh almh;
        if (this.f73818Dp && (almh = this.f75735r) != null) {
            almh.mo40510b(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        m61377a(r2, 0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0172  */
    /* renamed from: b */
    public final void mo40603b(Context context) {
        almh almh;
        bmza bmza;
        amqv amqv;
        bmza bmza2;
        almh almh2;
        bmza bmza3;
        bmza bmza4;
        bmza bmza5;
        bmza bmza6;
        bmza bmza7;
        bmza bmza8;
        if (!this.f75733p) {
            int i = 6;
            Bundle bundle = null;
            try {
                Pair c = mo40604c(context);
                amqv = (amqv) c.first;
                Bundle bundle2 = (Bundle) c.second;
                almh almh3 = this.f73821b;
                if (almh3 != null) {
                    if (this.f73820a && (bmza8 = this.f73819Dq) != null) {
                        almh3.mo40509a(almk.m61269b(2, bmza8.mo66928a(TimeUnit.MICROSECONDS)));
                        this.f73819Dq.mo66931e();
                    }
                    this.f73821b.mo40507a(2, 1);
                }
                m61377a(2, 1);
                bundle = bundle2;
            } catch (IllegalArgumentException e) {
                Log.e("BasePeopleOperation", "Bad operation", e);
                amqv = amqv.f75782h;
                m61378a(context, e);
                almh almh4 = this.f73821b;
                if (almh4 != null) {
                    if (this.f73820a && (bmza2 = this.f73819Dq) != null) {
                        almh4.mo40509a(almk.m61269b(2, bmza2.mo66928a(TimeUnit.MICROSECONDS)));
                        this.f73819Dq.mo66931e();
                    }
                    this.f73821b.mo40507a(11, 0);
                }
                m61377a(11, 0);
            } catch (RuntimeException e2) {
                if (cfyu.f186178a.mo6606a().mo83144a()) {
                    if (e2 instanceof NullPointerException) {
                        i = 12;
                        amqv = amqv.f75782h;
                        m61378a(context, e2);
                        almh2 = this.f73821b;
                        if (almh2 != null) {
                            if (this.f73820a && (bmza3 = this.f73819Dq) != null) {
                                almh2.mo40509a(almk.m61269b(2, bmza3.mo66928a(TimeUnit.MICROSECONDS)));
                                this.f73819Dq.mo66931e();
                            }
                            this.f73821b.mo40507a(i, 0);
                        }
                    }
                }
                String str = this.f75731l;
                if (str == null || this.f73817Do.mo41676a(context, str) != null) {
                    throw e2;
                }
                e2.getMessage();
                amqv = amqv.f75781g;
                i = 3;
                m61378a(context, e2);
                almh2 = this.f73821b;
                if (almh2 != null) {
                }
            } catch (UserRecoverableAuthException e3) {
                Log.e("BasePeopleOperation", "Error during operation", e3);
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("pendingIntent", spn.m35844a(context, e3.mo7366a(), 134217728));
                amqv = amqv.m63196a(4, bundle3);
                m61378a(context, e3);
                almh almh5 = this.f73821b;
                if (almh5 != null) {
                    if (this.f73820a && (bmza4 = this.f73819Dq) != null) {
                        almh5.mo40509a(almk.m61269b(2, bmza4.mo66928a(TimeUnit.MICROSECONDS)));
                        this.f73819Dq.mo66931e();
                    }
                    this.f73821b.mo40507a(4, 0);
                }
                m61377a(4, 0);
            } catch (gid e4) {
                Log.e("BasePeopleOperation", "Error during operation", e4);
                amqv = amqv.m63196a(5, null);
                m61378a(context, e4);
                almh almh6 = this.f73821b;
                if (almh6 != null) {
                    if (this.f73820a && (bmza5 = this.f73819Dq) != null) {
                        almh6.mo40509a(almk.m61269b(2, bmza5.mo66928a(TimeUnit.MICROSECONDS)));
                        this.f73819Dq.mo66931e();
                    }
                    this.f73821b.mo40507a(3, 0);
                }
                m61377a(3, 0);
            } catch (VolleyError e5) {
                Log.e("BasePeopleOperation", "Error during operation", e5);
                amqv = amqv.f75779e;
                m61378a(context, e5);
                almh almh7 = this.f73821b;
                if (almh7 != null) {
                    if (this.f73820a && (bmza6 = this.f73819Dq) != null) {
                        almh7.mo40509a(almk.m61269b(2, bmza6.mo66928a(TimeUnit.MICROSECONDS)));
                        this.f73819Dq.mo66931e();
                    }
                    this.f73821b.mo40507a(5, 0);
                }
                m61377a(5, 0);
            } catch (Exception e6) {
                Log.e("BasePeopleOperation", "Error during operation", e6);
                amqv = amqv.f75779e;
                m61378a(context, e6);
                almh almh8 = this.f73821b;
                if (almh8 != null) {
                    if (this.f73820a && (bmza7 = this.f73819Dq) != null) {
                        almh8.mo40509a(almk.m61269b(2, bmza7.mo66928a(TimeUnit.MICROSECONDS)));
                        this.f73819Dq.mo66931e();
                    }
                    this.f73821b.mo40507a(6, 0);
                }
            } catch (Throwable th) {
                th = th;
                i = 11;
                almh = this.f73821b;
                if (almh != null) {
                }
                m61377a(i, 0);
                throw th;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            mo40602a(amqv, bundle);
            return;
        }
        almh almh9 = this.f73821b;
        if (almh9 != null) {
            almh9.mo40507a(8, 0);
        }
        m61377a(8, 0);
    }

    /* renamed from: c */
    public abstract Pair mo40604c(Context context);

    protected alna(String str, int i, alzm alzm, String str2, String str3, byte[] bArr) {
        super(str, i, str2, str3, null);
        this.f73817Do = anbx.INSTANCE;
        this.f73816Dn = alzm;
        this.f73820a = cfyu.f186178a.mo6606a().mo83145b();
        this.f73818Dp = cfyx.m143985b();
        almh almh = new almh(str3);
        this.f73821b = almh;
        almh.f73688b = str2;
        almh.f73689c = str;
        if (this.f73820a) {
            this.f73819Dq = bmza.m108659b(bmvy.f131119a);
        }
    }

    /* renamed from: a */
    private static final void m61378a(Context context, Exception exc) {
        if (cfyu.f186178a.mo6606a().mo83146c()) {
            ande.f76660a.mo41719a(context).mo41718a(exc, cfyu.f186178a.mo6606a().mo83147d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40602a(amqv amqv, Bundle bundle) {
        try {
            this.f73816Dn.mo40528a(amqv.f75784a, amqv.f75785b, bundle);
        } catch (DeadObjectException e) {
        } catch (Exception e2) {
            Log.e("BasePeopleOperation", "Unknown error", e2);
        }
    }
}

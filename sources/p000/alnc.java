package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: alnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class alnc extends amqd {

    /* renamed from: a */
    protected final almh f73822a;

    /* renamed from: b */
    private final alzm f73823b;

    /* renamed from: c */
    private final boolean f73824c;

    /* renamed from: d */
    private final ancw f73825d = anbx.INSTANCE;

    /* renamed from: e */
    private final boolean f73826e;

    protected alnc(String str, int i, alzm alzm, boolean z, String str2, String str3) {
        super(str, i, str2, str3, null);
        this.f73823b = alzm;
        this.f73824c = z;
        this.f73826e = cfyx.m143985b();
        almh almh = new almh(str3);
        this.f73822a = almh;
        almh.f73688b = str2;
        almh.f73689c = str;
    }

    /* renamed from: a */
    private static void m61384a(Context context, Exception exc) {
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83273aC()).booleanValue()) {
            ande.f76660a.mo41719a(context).mo41718a(exc, ((Double) amgz.f74902a.mo41191a()).doubleValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9 A[Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9 A[Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo40603b(Context context) {
        int i;
        amqv amqv;
        DataHolder[] dataHolderArr;
        int i2;
        almh almh;
        String str;
        almh almh2;
        Context context2 = context;
        if (this.f75733p) {
            this.f73822a.mo40507a(8, 0);
            if (this.f73826e && (almh2 = this.f75735r) != null) {
                almh2.mo40510b(8, 0);
                return;
            }
            return;
        }
        int i3 = 3;
        DataHolder dataHolder = null;
        try {
            dataHolderArr = mo40605c(context);
            amqv = amqv.f75777c;
            if (dataHolderArr != null) {
                int length = dataHolderArr.length;
                int i4 = 0;
                i = 0;
                while (i4 < length) {
                    try {
                        DataHolder dataHolder2 = dataHolderArr[i4];
                        i += dataHolder2.f30168h;
                        mo41260a(dataHolder2);
                        i4++;
                    } catch (RuntimeException e) {
                        e = e;
                        Log.e("BasePeopleOperation", "Error during operation", e);
                        str = this.f75731l;
                        if (str == null) {
                        }
                        throw e;
                    } catch (UserRecoverableAuthException e2) {
                        e = e2;
                        Log.e("BasePeopleOperation", "Error during operation", e);
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", spn.m35844a(context2, e.mo7366a(), 134217728));
                        amqv = amqv.m63196a(4, bundle);
                        m61384a(context2, e);
                        dataHolderArr = null;
                        i3 = 4;
                        if (this.f73824c) {
                        }
                        i2 = i3;
                        this.f73822a.mo40507a(i2, i);
                        if (this.f73826e) {
                        }
                    } catch (gid e3) {
                        e = e3;
                        Log.e("BasePeopleOperation", "Error during operation", e);
                        amqv = amqv.m63196a(5, null);
                        m61384a(context2, e);
                        dataHolderArr = null;
                        if (this.f73824c) {
                        }
                        i2 = i3;
                        this.f73822a.mo40507a(i2, i);
                        if (this.f73826e) {
                        }
                    } catch (VolleyError e4) {
                        e = e4;
                        Log.e("BasePeopleOperation", "Error during operation", e);
                        amqv = amqv.f75779e;
                        m61384a(context2, e);
                        dataHolderArr = null;
                        i3 = 5;
                        if (this.f73824c) {
                        }
                        i2 = i3;
                        this.f73822a.mo40507a(i2, i);
                        if (this.f73826e) {
                        }
                    } catch (Exception e5) {
                        e = e5;
                        Log.e("BasePeopleOperation", "Error during operation", e);
                        amqv = amqv.f75779e;
                        m61384a(context2, e);
                        dataHolderArr = null;
                        i3 = 6;
                        if (this.f73824c) {
                        }
                        i2 = i3;
                        this.f73822a.mo40507a(i2, i);
                        if (this.f73826e) {
                        }
                    }
                }
            } else {
                i = 0;
            }
            i3 = 2;
        } catch (RuntimeException e6) {
            e = e6;
            i = 0;
            Log.e("BasePeopleOperation", "Error during operation", e);
            str = this.f75731l;
            if (str == null && this.f73825d.mo41676a(context2, str) == null) {
                e.getMessage();
                amqv = amqv.f75781g;
                m61384a(context2, e);
                dataHolderArr = null;
                if (this.f73824c) {
                }
                i2 = i3;
                this.f73822a.mo40507a(i2, i);
                if (this.f73826e) {
                    return;
                }
            }
            throw e;
        } catch (UserRecoverableAuthException e7) {
            e = e7;
            i = 0;
            Log.e("BasePeopleOperation", "Error during operation", e);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("pendingIntent", spn.m35844a(context2, e.mo7366a(), 134217728));
            amqv = amqv.m63196a(4, bundle2);
            m61384a(context2, e);
            dataHolderArr = null;
            i3 = 4;
            if (this.f73824c) {
            }
            i2 = i3;
            this.f73822a.mo40507a(i2, i);
            if (this.f73826e) {
            }
        } catch (gid e8) {
            e = e8;
            i = 0;
            Log.e("BasePeopleOperation", "Error during operation", e);
            amqv = amqv.m63196a(5, null);
            m61384a(context2, e);
            dataHolderArr = null;
            if (this.f73824c) {
            }
            i2 = i3;
            this.f73822a.mo40507a(i2, i);
            if (this.f73826e) {
            }
        } catch (VolleyError e9) {
            e = e9;
            i = 0;
            Log.e("BasePeopleOperation", "Error during operation", e);
            amqv = amqv.f75779e;
            m61384a(context2, e);
            dataHolderArr = null;
            i3 = 5;
            if (this.f73824c) {
            }
            i2 = i3;
            this.f73822a.mo40507a(i2, i);
            if (this.f73826e) {
            }
        } catch (Exception e10) {
            e = e10;
            i = 0;
            Log.e("BasePeopleOperation", "Error during operation", e);
            amqv = amqv.f75779e;
            m61384a(context2, e);
            dataHolderArr = null;
            i3 = 6;
            if (this.f73824c) {
            }
            i2 = i3;
            this.f73822a.mo40507a(i2, i);
            if (this.f73826e) {
            }
        }
        try {
            if (this.f73824c) {
                alzm alzm = this.f73823b;
                int i5 = amqv.f75784a;
                Bundle bundle3 = amqv.f75785b;
                if (dataHolderArr != null) {
                    dataHolder = dataHolderArr[0];
                }
                alzm.mo40531a(i5, bundle3, dataHolder);
            } else {
                this.f73823b.mo40532a(amqv.f75784a, amqv.f75785b, dataHolderArr);
            }
            i2 = i3;
        } catch (DeadObjectException e11) {
            m61384a(context2, e11);
            i2 = 7;
        } catch (Exception e12) {
            Log.e("BasePeopleOperation", "Unknown error", e12);
            m61384a(context2, e12);
            i2 = 6;
        }
        this.f73822a.mo40507a(i2, i);
        if (this.f73826e && (almh = this.f75735r) != null) {
            almh.mo40510b(i2, i);
        }
    }

    /* renamed from: c */
    public abstract DataHolder[] mo40605c(Context context);
}

package p000;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: aeyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeyw implements aeyp {

    /* renamed from: h */
    private static boolean f64013h = false;

    /* renamed from: i */
    private static boolean f64014i = false;

    /* renamed from: a */
    private final SharedPreferences f64015a;

    /* renamed from: b */
    private final bosx f64016b;

    /* renamed from: c */
    private final Iterator f64017c;

    /* renamed from: d */
    private aeyt f64018d;

    /* renamed from: e */
    private final long f64019e;

    /* renamed from: f */
    private long f64020f;

    /* renamed from: g */
    private final PackageManager f64021g;

    /* renamed from: j */
    private final HashMap f64022j = new HashMap();

    public aeyw(SharedPreferences sharedPreferences, aeyv aeyv, bosx bosx, long j, PackageManager packageManager) {
        Iterator it;
        this.f64015a = sharedPreferences;
        this.f64016b = bosx;
        this.f64021g = packageManager;
        long j2 = this.f64015a.getLong("lastEventMillis", 0);
        this.f64019e = j2;
        long j3 = j2 + 1;
        if (j3 >= j) {
            StringBuilder sb = new StringBuilder(62);
            sb.append("wrong time range: [");
            sb.append(j3);
            sb.append(", ");
            sb.append(j);
            sb.append(")");
            Log.e("AppUsageEventWatcher", sb.toString());
            this.f64017c = Collections.emptyIterator();
        } else {
            try {
                it = new aeyu(aeyv.f64012a.queryEvents(j3, j));
            } catch (NullPointerException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("AppUsageEventWatcher", valueOf.length() == 0 ? new String("Query events in UsageStatsManager caused NPE: ") : "Query events in UsageStatsManager caused NPE: ".concat(valueOf));
                it = Collections.emptyIterator();
            }
            this.f64017c = it;
        }
        f64013h = cfbi.f183585a.mo6606a().mo80806a();
        int i = Build.VERSION.SDK_INT;
        f64014i = cfbo.f183592a.mo6606a().mo80811a();
    }

    /* renamed from: a */
    private static final boolean m52697a(int i) {
        return i == 1 || i == 2 || (f64013h && i == 8) || (f64014i && i == 11);
    }

    public final boolean hasNext() {
        if (this.f64018d == null) {
            while (this.f64017c.hasNext()) {
                aeyt aeyt = (aeyt) this.f64017c.next();
                this.f64018d = aeyt;
                int b = aeyt.mo34663b();
                if (m52697a(b) || b == 5) {
                    break;
                }
                this.f64018d = null;
            }
        }
        return this.f64018d != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Pair pair;
        sdo.checkIfNull(this.f64018d, "hasNext() must be called and must return true before calling next()");
        if (this.f64018d.mo34662a() > this.f64020f) {
            this.f64020f = this.f64018d.mo34662a();
        }
        aeyt aeyt = this.f64018d;
        bxvd da = bojt.f133336l.mo74144da();
        int b = aeyt.mo34663b();
        int a = bojs.m111266a(b);
        if (a != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojt bojt = (bojt) da.f164949b;
            bojt.f133339b = a - 1;
            bojt.f133338a |= 1;
        }
        long a2 = aeyt.mo34662a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bojt bojt2 = (bojt) da.f164949b;
        int i = bojt2.f133338a | 2;
        bojt2.f133338a = i;
        bojt2.f133340c = a2;
        bosx bosx = this.f64016b;
        bosx.getClass();
        bojt2.f133344g = bosx;
        bojt2.f133338a = i | 32;
        if (m52697a(b)) {
            String a3 = stm.m36299a(aeyt.f64010a.getPackageName());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojt bojt3 = (bojt) da.f164949b;
            a3.getClass();
            bojt3.f133338a |= 4;
            bojt3.f133341d = a3;
            String a4 = stm.m36299a(aeyt.f64010a.getClassName());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojt bojt4 = (bojt) da.f164949b;
            a4.getClass();
            bojt4.f133338a |= 8;
            bojt4.f133342e = a4;
            if (bojt4.f133341d.length() > 0) {
                if (this.f64022j.containsKey(((bojt) da.f164949b).f133341d)) {
                    Pair pair2 = (Pair) this.f64022j.get(((bojt) da.f164949b).f133341d);
                    if (pair2 != null) {
                        int intValue = ((Integer) pair2.first).intValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bojt bojt5 = (bojt) da.f164949b;
                        bojt5.f133338a |= 64;
                        bojt5.f133345h = intValue;
                        String str = (String) pair2.second;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bojt bojt6 = (bojt) da.f164949b;
                        str.getClass();
                        bojt6.f133338a |= 128;
                        bojt6.f133346i = str;
                    }
                } else {
                    try {
                        PackageInfo packageInfo = this.f64021g.getPackageInfo(((bojt) da.f164949b).f133341d, 0);
                        int i2 = packageInfo.versionCode;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bojt bojt7 = (bojt) da.f164949b;
                        bojt7.f133338a |= 64;
                        bojt7.f133345h = i2;
                        String a5 = stm.m36299a(packageInfo.versionName);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bojt bojt8 = (bojt) da.f164949b;
                        a5.getClass();
                        bojt8.f133338a |= 128;
                        bojt8.f133346i = a5;
                        this.f64022j.put(bojt8.f133341d, Pair.create(Integer.valueOf(bojt8.f133345h), ((bojt) da.f164949b).f133346i));
                    } catch (PackageManager.NameNotFoundException e) {
                        this.f64022j.put(((bojt) da.f164949b).f133341d, null);
                    }
                }
            }
            if (f64013h && aeyt.mo34663b() == 8) {
                String a6 = stm.m36299a(aeyt.f64010a.getShortcutId());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bojt bojt9 = (bojt) da.f164949b;
                a6.getClass();
                bojt9.f133338a |= 512;
                bojt9.f133347j = a6;
            }
            if (f64014i && aeyt.mo34663b() == 11) {
                int appStandbyBucket = aeyt.f64010a.getAppStandbyBucket();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bojt bojt10 = (bojt) da.f164949b;
                bojt10.f133338a |= 1024;
                bojt10.f133348k = appStandbyBucket;
            }
            pair = Pair.create("LB_AS", (bojt) da.mo74062i());
        } else {
            sdo.m34970a(b == 5);
            Configuration configuration = aeyt.f64010a.getConfiguration();
            if (configuration != null) {
                bxvd da2 = boik.f133172k.mo74144da();
                float f = configuration.fontScale;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boik boik = (boik) da2.f164949b;
                boik.f133174a = 1 | boik.f133174a;
                boik.f133175b = f;
                if (configuration.locale != null) {
                    String locale = configuration.locale.toString();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boik boik2 = (boik) da2.f164949b;
                    locale.getClass();
                    boik2.f133174a |= 2;
                    boik2.f133176c = locale;
                }
                int a7 = boid.m111225a((configuration.screenLayout & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC) >> 6);
                if (a7 != 0) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boik boik3 = (boik) da2.f164949b;
                    boik3.f133177d = a7 - 1;
                    boik3.f133174a |= 4;
                }
                int a8 = boif.m111227a(configuration.orientation);
                if (a8 != 0) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boik boik4 = (boik) da2.f164949b;
                    boik4.f133178e = a8 - 1;
                    boik4.f133174a |= 8;
                }
                int a9 = boij.m111231a(configuration.uiMode & 15);
                if (a9 != 0) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boik boik5 = (boik) da2.f164949b;
                    boik5.f133179f = a9 - 1;
                    boik5.f133174a |= 16;
                }
                int a10 = boih.m111229a((configuration.uiMode & 48) >> 4);
                if (a10 != 0) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boik boik6 = (boik) da2.f164949b;
                    boik6.f133180g = a10 - 1;
                    boik6.f133174a |= 32;
                }
                int a11 = bohz.m111221a(configuration.keyboardHidden);
                if (a11 != 0) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boik boik7 = (boik) da2.f164949b;
                    boik7.f133181h = a11 - 1;
                    boik7.f133174a |= 64;
                }
                int a12 = bohx.m111219a(configuration.hardKeyboardHidden);
                if (a12 != 0) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boik boik8 = (boik) da2.f164949b;
                    boik8.f133182i = a12 - 1;
                    boik8.f133174a |= 128;
                }
                int a13 = boib.m111223a(configuration.navigationHidden);
                if (a13 != 0) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boik boik9 = (boik) da2.f164949b;
                    boik9.f133183j = a13 - 1;
                    boik9.f133174a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                boik boik10 = (boik) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bojt bojt11 = (bojt) da.f164949b;
                boik10.getClass();
                bojt11.f133343f = boik10;
                bojt11.f133338a |= 16;
            }
            pair = Pair.create("LB_CFG", (bojt) da.mo74062i());
        }
        this.f64018d = null;
        return pair;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo34657a() {
        if (this.f64020f > this.f64019e) {
            SharedPreferences.Editor edit = this.f64015a.edit();
            edit.putLong("lastEventMillis", this.f64020f);
            edit.apply();
        }
    }
}

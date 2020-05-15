package p000;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.cast.JGCastService;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* renamed from: agmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agmn implements agjw {

    /* renamed from: q */
    private static volatile agmn f65946q;

    /* renamed from: a */
    public final agiw f65947a;

    /* renamed from: b */
    public agdl f65948b;

    /* renamed from: c */
    public agik f65949c;

    /* renamed from: d */
    public agme f65950d;

    /* renamed from: e */
    public agdd f65951e;

    /* renamed from: f */
    public agkr f65952f;

    /* renamed from: g */
    public final agje f65953g;

    /* renamed from: h */
    public boolean f65954h = false;

    /* renamed from: i */
    long f65955i;

    /* renamed from: j */
    public List f65956j;

    /* renamed from: k */
    public int f65957k;

    /* renamed from: l */
    public int f65958l;

    /* renamed from: m */
    public boolean f65959m;

    /* renamed from: n */
    public List f65960n;

    /* renamed from: o */
    public List f65961o;

    /* renamed from: p */
    public long f65962p;

    /* renamed from: r */
    private final agii f65963r;

    /* renamed from: s */
    private final agmp f65964s;

    /* renamed from: t */
    private boolean f65965t;

    /* renamed from: u */
    private boolean f65966u;

    /* renamed from: v */
    private boolean f65967v;

    /* renamed from: w */
    private FileLock f65968w;

    /* renamed from: x */
    private FileChannel f65969x;

    /* renamed from: a */
    public static agmn m54505a(Context context) {
        sdo.m34959a(context);
        sdo.m34959a(context.getApplicationContext());
        if (f65946q == null) {
            synchronized (agmn.class) {
                if (f65946q == null) {
                    agmo agmo = null;
                    boolean z = true;
                    if (!agde.m54035a(context)) {
                        z = false;
                    } else {
                        try {
                            agmo = (agmo) Class.forName("com.google.android.gms.measurement.internal.ModuleUploadFactory").asSubclass(agmo.class).getConstructor(Context.class).newInstance(context);
                            z = false;
                        } catch (ClassNotFoundException e) {
                        } catch (IllegalAccessException e2) {
                            throw new IllegalStateException(e2);
                        } catch (InstantiationException e3) {
                            throw new IllegalStateException(e3);
                        } catch (NoSuchMethodException e4) {
                            throw new IllegalStateException(e4);
                        } catch (InvocationTargetException e5) {
                            throw new IllegalStateException(e5);
                        }
                    }
                    if (agde.m54035a(context)) {
                        if (!z) {
                            f65946q = agmo.mo35704a();
                        }
                    }
                    agmo = new agmo(context);
                    f65946q = agmo.mo35704a();
                }
            }
        }
        return f65946q;
    }

    /* renamed from: b */
    private final Boolean m54513b(agcv agcv) {
        try {
            if (agcv.mo35277j() == -2147483648L) {
                String str = svr.m36484b(mo35690n()).mo26176b(agcv.mo35248a(), 0).versionName;
                if (agcv.mo35275i() != null && agcv.mo35275i().equals(str)) {
                    return true;
                }
            } else {
                if (agcv.mo35277j() == ((long) svr.m36484b(mo35690n()).mo26176b(agcv.mo35248a(), 0).versionCode)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: d */
    private static final boolean m54515d(AppMetadata appMetadata) {
        cfjt.m139846c();
        return !TextUtils.isEmpty(appMetadata.f80099b) || !TextUtils.isEmpty(appMetadata.f80115r);
    }

    /* renamed from: E */
    public final agid mo35497E() {
        return this.f65953g.mo35497E();
    }

    /* renamed from: F */
    public final agjb mo35498F() {
        return this.f65953g.mo35498F();
    }

    /* renamed from: a */
    public final agde mo35664a() {
        return this.f65953g.f65690f;
    }

    /* renamed from: a */
    public String mo35432a(String str, long j) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo35679c(AppMetadata appMetadata) {
        try {
            return (String) mo35498F().mo35490a(new agml(this, appMetadata)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo35497E().f65564c.mo35437a("Failed to get app instance id. appId", agid.m54288a(appMetadata.f80098a), e);
            return null;
        }
    }

    /* renamed from: d */
    public final agdi mo35680d() {
        return this.f65953g.f65691g;
    }

    /* renamed from: e */
    public final agiq mo35681e() {
        return this.f65953g.mo35499a();
    }

    /* renamed from: f */
    public final agiw mo35682f() {
        m54506a(this.f65947a);
        return this.f65947a;
    }

    /* renamed from: g */
    public final agii mo35683g() {
        m54506a(this.f65963r);
        return this.f65963r;
    }

    /* renamed from: h */
    public final agdl mo35684h() {
        m54506a(this.f65948b);
        return this.f65948b;
    }

    /* renamed from: i */
    public final agik mo35685i() {
        agik agik = this.f65949c;
        if (agik != null) {
            return agik;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: j */
    public final agme mo35686j() {
        m54506a(this.f65950d);
        return this.f65950d;
    }

    /* renamed from: k */
    public final agdd mo35687k() {
        m54506a(this.f65951e);
        return this.f65951e;
    }

    /* renamed from: l */
    public final agmp mo35688l() {
        m54506a(this.f65964s);
        return this.f65964s;
    }

    /* renamed from: m */
    public final aghu mo35689m() {
        return this.f65953g.mo35503g();
    }

    /* renamed from: n */
    public final Context mo35690n() {
        return this.f65953g.f65685a;
    }

    /* renamed from: o */
    public final sqv mo35691o() {
        return this.f65953g.f65696l;
    }

    /* renamed from: p */
    public final agms mo35692p() {
        return this.f65953g.mo35502f();
    }

    /* renamed from: q */
    public final agdp mo35693q() {
        return this.f65953g.mo35509m();
    }

    /* renamed from: r */
    public final void mo35694r() {
        mo35498F().mo35241h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo35695s() {
        if (!this.f65954h) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final long mo35696t() {
        long a = mo35691o().mo20505a();
        agiq e = mo35681e();
        e.mo35544k();
        e.mo35241h();
        long a2 = e.f65623h.mo35458a();
        if (a2 == 0) {
            a2 = ((long) e.mo35540x().mo35751e().nextInt(86400000)) + 1;
            e.f65623h.mo35459a(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agmp.a(bxxb, byte[]):bxxb
     arg types: [bxvd, byte[]]
     candidates:
      agmp.a(bxvd, java.lang.String):int
      agmp.a(java.lang.StringBuilder, int):void
      agmp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):boolean
      agmp.a(java.util.List, int):boolean
      agmp.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable
      agmp.a(agni, java.lang.String):java.lang.Object
      agmp.a(java.util.List, java.util.List):java.util.List
      agmp.a(bxvd, java.lang.Object):void
      agmp.a(long, long):boolean
      agmp.a(bxxb, byte[]):bxxb */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r1.f65962p = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02e4, code lost:
        if (r6 != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02ef, code lost:
        if (r6 != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0315, code lost:
        if (r6 != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x031c, code lost:
        if (r7.isEmpty() != false) goto L_0x08d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x031e, code lost:
        r2 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0326, code lost:
        if (r2.hasNext() == false) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0328, code lost:
        r3 = (p000.agnm) ((android.util.Pair) r2.next()).first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0338, code lost:
        if (android.text.TextUtils.isEmpty(r3.f66125u) != false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x033a, code lost:
        r2 = r3.f66125u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x033d, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x033e, code lost:
        if (r2 != null) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0341, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0346, code lost:
        if (r3 >= r7.size()) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0348, code lost:
        r6 = (p000.agnm) ((android.util.Pair) r7.get(r3)).first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0358, code lost:
        if (android.text.TextUtils.isEmpty(r6.f66125u) == false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0361, code lost:
        if (r6.f66125u.equals(r2) != false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0363, code lost:
        r7 = r7.subList(0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0369, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x036c, code lost:
        r2 = p000.agnl.f66085b.mo74144da();
        r3 = r7.size();
        r6 = new java.util.ArrayList(r7.size());
        r9 = mo35680d().mo35324e(r8);
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0388, code lost:
        if (r10 >= r3) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x038a, code lost:
        r13 = (p000.agnm) ((android.util.Pair) r7.get(r10)).first;
        r14 = (p000.bxvd) r13.mo74142c(5);
        r14.mo73625a((p000.GeneratedMessageLite) r13);
        r6.add((java.lang.Long) ((android.util.Pair) r7.get(r10)).second);
        r11 = mo35680d().mo35318c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03b5, code lost:
        if (r14.f164950c != false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03b8, code lost:
        r14.mo74035c();
        r14.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03be, code lost:
        r13 = (p000.agnm) r14.f164949b;
        r17 = p000.agnm.f66088P;
        r15 = r13.f66105a | com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        r13.f66105a = r15;
        r13.f66124t = r11;
        r13.f66105a = r15 | 2;
        r13.f66110f = r4;
        r11 = mo35664a().f65291a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03dd, code lost:
        if (r14.f164950c != false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03e0, code lost:
        r14.mo74035c();
        r14.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03e6, code lost:
        r12 = (p000.agnm) r14.f164949b;
        r13 = r12.f66105a | 8388608;
        r12.f66105a = r13;
        r12.f66091B = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03f3, code lost:
        if (r9 != false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03f5, code lost:
        r12.f66105a = Integer.MAX_VALUE & r13;
        r12.f66098I = p000.agnm.f66088P.f66098I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x040b, code lost:
        if (mo35680d().mo35320c(r8, p000.aghn.f65464T) == false) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x040d, code lost:
        r11 = mo35688l().mo35707a(((p000.agnm) r14.mo74062i()).mo73642k());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0421, code lost:
        if (r14.f164950c != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0424, code lost:
        r14.mo74035c();
        r14.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x042a, code lost:
        r13 = (p000.agnm) r14.f164949b;
        r13.f66106b |= 32;
        r13.f66104O = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0436, code lost:
        r2.mo74104r(r14);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0446, code lost:
        if (mo35497E().mo35441a(2) == false) goto L_0x0823;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0448, code lost:
        r7 = mo35688l();
        r9 = (p000.agnl) r2.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0452, code lost:
        if (r9 == null) goto L_0x081c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0454, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("\nbatch {\n");
        r9 = r9.f66087a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x046a, code lost:
        if (r9.hasNext() != false) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        r10.append("}\n");
        r9 = r10.toString();
        r26 = r4;
        r4 = r8;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0479, code lost:
        r11 = (p000.agnm) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x047f, code lost:
        if (r11 == null) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0481, code lost:
        p000.agmp.m54567a(r10, 1);
        r10.append("bundle {\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x048e, code lost:
        if ((r11.f66105a & 1) != 0) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0490, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0492, code lost:
        r15 = 1;
        p000.agmp.m54569a(r10, 1, "protocol_version", java.lang.Integer.valueOf(r11.f66107c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x049e, code lost:
        p000.agmp.m54569a(r10, r15, "platform", r11.f66115k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04a9, code lost:
        if ((r11.f66105a & com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) goto L_0x04b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04ab, code lost:
        p000.agmp.m54569a(r10, 1, "gmp_version", java.lang.Long.valueOf(r11.f66123s));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04bd, code lost:
        if ((r11.f66105a & com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) == 0) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04bf, code lost:
        p000.agmp.m54569a(r10, 1, "uploading_gmp_version", java.lang.Long.valueOf(r11.f66124t));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04cf, code lost:
        if ((r11.f66106b & 16) == 0) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04d1, code lost:
        p000.agmp.m54569a(r10, 1, "dynamite_version", java.lang.Long.valueOf(r11.f66103N));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04e2, code lost:
        if ((r11.f66105a & 536870912) != 0) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04e4, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04e6, code lost:
        r15 = 1;
        p000.agmp.m54569a(r10, 1, "config_version", java.lang.Long.valueOf(r11.f66096G));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04f2, code lost:
        p000.agmp.m54569a(r10, r15, "gmp_app_id", r11.f66090A);
        p000.agmp.m54569a(r10, r15, "admob_app_id", r11.f66100K);
        p000.agmp.m54569a(r10, r15, "app_id", r11.f66121q);
        p000.agmp.m54569a(r10, r15, "app_version", r11.f66122r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0513, code lost:
        if ((r11.f66105a & 33554432) != 0) goto L_0x0517;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0515, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0517, code lost:
        r15 = 1;
        p000.agmp.m54569a(r10, 1, "app_version_major", java.lang.Integer.valueOf(r11.f66094E));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0523, code lost:
        p000.agmp.m54569a(r10, r15, "firebase_instance_id", r11.f66093D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x052f, code lost:
        if ((r11.f66105a & com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0531, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0533, code lost:
        r15 = 1;
        p000.agmp.m54569a(r10, 1, "dev_cert_hash", java.lang.Long.valueOf(r11.f66128x));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x053f, code lost:
        p000.agmp.m54569a(r10, r15, "app_store", r11.f66120p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x054a, code lost:
        if ((r11.f66105a & 2) == 0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x054c, code lost:
        p000.agmp.m54569a(r10, 1, "upload_timestamp_millis", java.lang.Long.valueOf(r11.f66110f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x055c, code lost:
        if ((r11.f66105a & 4) == 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x055e, code lost:
        p000.agmp.m54569a(r10, 1, "start_timestamp_millis", java.lang.Long.valueOf(r11.f66111g));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x056e, code lost:
        if ((r11.f66105a & 8) == 0) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0570, code lost:
        p000.agmp.m54569a(r10, 1, "end_timestamp_millis", java.lang.Long.valueOf(r11.f66112h));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0580, code lost:
        if ((r11.f66105a & 16) == 0) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0582, code lost:
        p000.agmp.m54569a(r10, 1, "previous_bundle_start_timestamp_millis", java.lang.Long.valueOf(r11.f66113i));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0592, code lost:
        if ((r11.f66105a & 32) != 0) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0594, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0596, code lost:
        r15 = 1;
        p000.agmp.m54569a(r10, 1, "previous_bundle_end_timestamp_millis", java.lang.Long.valueOf(r11.f66114j));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05a2, code lost:
        p000.agmp.m54569a(r10, r15, "app_instance_id", r11.f66127w);
        p000.agmp.m54569a(r10, r15, "resettable_device_id", r11.f66125u);
        p000.agmp.m54569a(r10, r15, "device_id", r11.f66095F);
        p000.agmp.m54569a(r10, r15, "ds_id", r11.f66098I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05c3, code lost:
        if ((r11.f66105a & com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05c5, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05c7, code lost:
        r15 = 1;
        p000.agmp.m54569a(r10, 1, "limited_ad_tracking", java.lang.Boolean.valueOf(r11.f66126v));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05d3, code lost:
        p000.agmp.m54569a(r10, r15, "os_version", r11.f66116l);
        p000.agmp.m54569a(r10, r15, "device_model", r11.f66117m);
        p000.agmp.m54569a(r10, r15, "user_default_language", r11.f66118n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05ed, code lost:
        if ((r11.f66105a & 1024) == 0) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05ef, code lost:
        p000.agmp.m54569a(r10, 1, "time_zone_offset_minutes", java.lang.Integer.valueOf(r11.f66119o));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0600, code lost:
        if ((r11.f66105a & 1048576) == 0) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0602, code lost:
        p000.agmp.m54569a(r10, 1, "bundle_sequential_index", java.lang.Integer.valueOf(r11.f66129y));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0613, code lost:
        if ((r11.f66105a & 8388608) != 0) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0615, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0617, code lost:
        r14 = 1;
        p000.agmp.m54569a(r10, 1, "service_upload", java.lang.Boolean.valueOf(r11.f66091B));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0623, code lost:
        p000.agmp.m54569a(r10, r14, "health_monitor", r11.f66130z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0634, code lost:
        if (r7.mo35538v().mo35314a(p000.aghn.f65472aA) != false) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x063b, code lost:
        if ((r11.f66105a & com.google.android.cast.JGCastService.FLAG_PRIVATE_DISPLAY) == 0) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x063d, code lost:
        r13 = r11.f66097H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0643, code lost:
        if (r13 == 0) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0645, code lost:
        p000.agmp.m54569a(r10, 1, "android_id", java.lang.Long.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0656, code lost:
        if ((r11.f66106b & 2) == 0) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0658, code lost:
        p000.agmp.m54569a(r10, 1, "retry_counter", java.lang.Integer.valueOf(r11.f66099J));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0664, code lost:
        r13 = r11.f66109e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0666, code lost:
        r14 = "name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0668, code lost:
        if (r13 == null) goto L_0x0709;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        r13 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0672, code lost:
        if (r13.hasNext() == false) goto L_0x0702;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0674, code lost:
        r15 = (p000.agnq) r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x067a, code lost:
        if (r15 == null) goto L_0x06f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x067c, code lost:
        r24 = r9;
        p000.agmp.m54567a(r10, 2);
        r10.append("user_property {\n");
        r25 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0691, code lost:
        if ((r15.f66147a & 1) == 0) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0693, code lost:
        r26 = r4;
        r5 = r3;
        r3 = java.lang.Long.valueOf(r15.f66148b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x069d, code lost:
        r26 = r4;
        r5 = r3;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06a1, code lost:
        p000.agmp.m54569a(r10, 2, "set_timestamp_millis", r3);
        p000.agmp.m54569a(r10, 2, r14, r7.mo35541y().mo35426c(r15.f66149c));
        p000.agmp.m54569a(r10, 2, "string_value", r15.f66150d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06c1, code lost:
        if ((r15.f66147a & 8) == 0) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06c3, code lost:
        r4 = r8;
        r8 = java.lang.Long.valueOf(r15.f66151e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06cb, code lost:
        r4 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06cd, code lost:
        p000.agmp.m54569a(r10, 2, "int_value", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06d7, code lost:
        if ((r15.f66147a & 32) == 0) goto L_0x06e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06d9, code lost:
        r8 = java.lang.Double.valueOf(r15.f66152f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06e0, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x06e1, code lost:
        p000.agmp.m54569a(r10, 2, "double_value", r8);
        p000.agmp.m54567a(r10, 2);
        r10.append("}\n");
        r8 = r4;
        r3 = r5;
        r9 = r24;
        r13 = r25;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06f6, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0702, code lost:
        r26 = r4;
        r4 = r8;
        r24 = r9;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0709, code lost:
        r26 = r4;
        r4 = r8;
        r24 = r9;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x070f, code lost:
        r3 = r11.f66092C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0711, code lost:
        if (r3 == null) goto L_0x0778;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0713, code lost:
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x071b, code lost:
        if (r3.hasNext() == false) goto L_0x0778;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x071d, code lost:
        r8 = (p000.agng) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0723, code lost:
        if (r8 == null) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0725, code lost:
        p000.agmp.m54567a(r10, 2);
        r10.append("audience_membership {\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0732, code lost:
        if ((r8.f66054a & 1) == 0) goto L_0x0740;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0734, code lost:
        p000.agmp.m54569a(r10, 2, "audience_id", java.lang.Integer.valueOf(r8.f66055b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0744, code lost:
        if ((r8.f66054a & 8) == 0) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0746, code lost:
        p000.agmp.m54569a(r10, 2, "new_audience", java.lang.Boolean.valueOf(r8.f66058e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0752, code lost:
        r13 = r8.f66056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0756, code lost:
        if (r13 == null) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0759, code lost:
        r13 = p000.agno.f66134e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x075b, code lost:
        p000.agmp.m54570a(r10, "current_data", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0762, code lost:
        if ((r8.f66054a & 4) == 0) goto L_0x076f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0764, code lost:
        r8 = r8.f66057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0768, code lost:
        if (r8 != null) goto L_0x076c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x076a, code lost:
        r8 = p000.agno.f66134e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x076c, code lost:
        p000.agmp.m54570a(r10, "previous_data", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x076f, code lost:
        p000.agmp.m54567a(r10, 2);
        r10.append("}\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0778, code lost:
        r3 = r11.f66108d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x077a, code lost:
        if (r3 != null) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x077f, code lost:
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0787, code lost:
        if (r3.hasNext() == false) goto L_0x07fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0789, code lost:
        r8 = (p000.agni) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x078f, code lost:
        if (r8 == null) goto L_0x07f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0791, code lost:
        p000.agmp.m54567a(r10, 2);
        r10.append("event {\n");
        p000.agmp.m54569a(r10, 2, r14, r7.mo35541y().mo35422a(r8.f66068c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x07ab, code lost:
        if ((r8.f66066a & 2) == 0) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x07ad, code lost:
        r11 = r14;
        p000.agmp.m54569a(r10, 2, "timestamp_millis", java.lang.Long.valueOf(r8.f66069d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x07bb, code lost:
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07c0, code lost:
        if ((r8.f66066a & 4) == 0) goto L_0x07ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x07c2, code lost:
        p000.agmp.m54569a(r10, 2, "previous_timestamp_millis", java.lang.Long.valueOf(r8.f66070e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07d2, code lost:
        if ((r8.f66066a & 8) == 0) goto L_0x07e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x07d4, code lost:
        p000.agmp.m54569a(r10, 2, "count", java.lang.Integer.valueOf(r8.f66071f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07e6, code lost:
        if (r8.f66067b.size() != 0) goto L_0x07ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x07e8, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07ea, code lost:
        r9 = 2;
        r7.mo35714a(r10, 2, r8.f66067b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07f0, code lost:
        p000.agmp.m54567a(r10, r9);
        r10.append("}\n");
        r14 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07fd, code lost:
        p000.agmp.m54567a(r10, 1);
        r10.append("}\n");
        r8 = r4;
        r3 = r5;
        r9 = r24;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x080d, code lost:
        r9 = r9;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x081c, code lost:
        r26 = r4;
        r4 = r8;
        r5 = r3;
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0823, code lost:
        r26 = r4;
        r4 = r8;
        r5 = r3;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0828, code lost:
        mo35688l();
        r14 = ((p000.agnl) r2.mo74062i()).mo73642k();
        mo35680d();
        r3 = (java.lang.String) p000.aghn.f65516q.mo35389a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:?, code lost:
        r13 = new java.net.URL(r3);
        p000.sdo.m34974b(!r6.isEmpty());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0850, code lost:
        if (r1.f65960n == null) goto L_0x085e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0852, code lost:
        mo35497E().f65564c.mo35435a("Set uploading progress before finishing the previous upload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x085e, code lost:
        r1.f65960n = new java.util.ArrayList(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0865, code lost:
        mo35681e().f65620e.mo35459a(r26);
        r6 = "?";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0872, code lost:
        if (r5 <= 0) goto L_0x0883;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0874, code lost:
        r6 = ((p000.agnm) ((p000.agnl) r2.f164949b).f66087a.get(0)).f66121q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0883, code lost:
        mo35497E().f65572k.mo35438a("Uploading data. app, uncompressed size, data", r6, java.lang.Integer.valueOf(r14.length), r9);
        r1.f65959m = true;
        r11 = mo35683g();
        r2 = new p000.agmi(r1);
        r11.mo35241h();
        r11.mo35659q();
        p000.sdo.m34959a(r13);
        p000.sdo.m34959a(r14);
        p000.sdo.m34959a(r2);
        r11.mo35498F().mo35494b(new p000.agih(r11, r4, r13, r14, null, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:?, code lost:
        mo35497E().f65564c.mo35437a("Failed to parse upload URL. Not uploading. appId", p000.agid.m54288a(r4), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        if (r2 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0133, code lost:
        if (r2 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0175, code lost:
        if (r13 != null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017b, code lost:
        if (r13 != null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0197, code lost:
        if (r13 != null) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a3 A[Catch:{ all -> 0x014e, all -> 0x0909 }] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x08da A[SYNTHETIC, Splitter:B:402:0x08da] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013d A[Catch:{ all -> 0x014e, all -> 0x0909 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0153 A[Catch:{ all -> 0x014e, all -> 0x0909 }] */
    /* renamed from: u */
    public final void mo35697u() {
        int i;
        Cursor cursor;
        Throwable th;
        List list;
        Cursor cursor2;
        SQLiteException sQLiteException;
        agmp o;
        Throwable th2;
        SQLiteException sQLiteException2;
        Cursor cursor3;
        Cursor cursor4;
        Throwable th3;
        SQLiteException sQLiteException3;
        Cursor cursor5;
        mo35694r();
        mo35695s();
        int i2 = 1;
        this.f65967v = true;
        int i3 = 0;
        if (!mo35664a().f65291a) {
            Boolean bool = this.f65953g.mo35508l().f65888d;
            if (bool == null) {
                mo35497E().f65567f.mo35435a("Upload data called on the client side before use of service was decided");
                this.f65967v = false;
            } else if (bool.booleanValue()) {
                mo35497E().f65564c.mo35435a("Upload called in the client side when service should be used");
                this.f65967v = false;
            }
            mo35700x();
        }
        try {
            if (this.f65955i <= 0) {
                mo35694r();
                if (this.f65960n == null) {
                    if (mo35683g().mo35448c()) {
                        long a = mo35691o().mo20505a();
                        Cursor cursor6 = null;
                        r9 = null;
                        r9 = null;
                        cursor4 = null;
                        r9 = null;
                        String str = null;
                        if (cfkh.f184233a.mo6606a().mo81359a()) {
                            i = mo35680d().mo35317b(null, aghn.f65455K);
                        } else {
                            i = 1;
                        }
                        if (i <= 1) {
                            mo35680d();
                            mo35673a(a - agdi.m54038m());
                        } else {
                            mo35680d();
                            long m = a - agdi.m54038m();
                            for (int i4 = 0; i4 < i && mo35673a(m); i4++) {
                            }
                        }
                        long a2 = mo35681e().f65619d.mo35458a();
                        if (a2 != 0) {
                            mo35497E().f65571j.mo35436a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a - a2)));
                        }
                        String g = mo35684h().mo35363g();
                        long j = -1;
                        j = -1;
                        j = -1;
                        j = -1;
                        if (TextUtils.isEmpty(g)) {
                            this.f65962p = -1;
                            agdl h = mo35684h();
                            mo35680d();
                            long m2 = a - agdi.m54038m();
                            h.mo35241h();
                            h.mo35659q();
                            try {
                                cursor5 = h.mo35360e().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(m2)});
                                try {
                                    if (!cursor5.moveToFirst()) {
                                        h.mo35497E().f65572k.mo35435a("No expired configs for apps with pending events");
                                        if (cursor5 != null) {
                                            cursor5.close();
                                            if (!TextUtils.isEmpty(str)) {
                                                agcv b = mo35684h().mo35349b(str);
                                                if (b != null) {
                                                    mo35666a(b);
                                                }
                                            }
                                        } else if (!TextUtils.isEmpty(str)) {
                                        }
                                    } else {
                                        str = cursor5.getString(0);
                                    }
                                } catch (SQLiteException e) {
                                    sQLiteException3 = e;
                                    h.mo35497E().f65564c.mo35436a("Error selecting expired configs", sQLiteException3);
                                } catch (Throwable th4) {
                                    th3 = th4;
                                    cursor4 = cursor5;
                                    if (cursor4 != null) {
                                    }
                                    throw th3;
                                }
                            } catch (SQLiteException e2) {
                                sQLiteException3 = e2;
                                cursor5 = null;
                                h.mo35497E().f65564c.mo35436a("Error selecting expired configs", sQLiteException3);
                            } catch (Throwable th5) {
                                th3 = th5;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                throw th3;
                            }
                        } else {
                            if (this.f65962p == -1) {
                                agdl h2 = mo35684h();
                                try {
                                    cursor3 = h2.mo35360e().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            j = cursor3.getLong(0);
                                        }
                                    } catch (SQLiteException e3) {
                                        sQLiteException2 = e3;
                                        try {
                                            h2.mo35497E().f65564c.mo35436a("Error querying raw events", sQLiteException2);
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                            cursor6 = cursor3;
                                            if (cursor6 != null) {
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th7) {
                                        th2 = th7;
                                        cursor6 = cursor3;
                                        if (cursor6 != null) {
                                        }
                                        throw th2;
                                    }
                                } catch (SQLiteException e4) {
                                    sQLiteException2 = e4;
                                    cursor3 = null;
                                    h2.mo35497E().f65564c.mo35436a("Error querying raw events", sQLiteException2);
                                } catch (Throwable th8) {
                                    th2 = th8;
                                    if (cursor6 != null) {
                                        cursor6.close();
                                    }
                                    throw th2;
                                }
                            }
                            int b2 = mo35680d().mo35317b(g, aghn.f65506g);
                            int max = Math.max(0, mo35680d().mo35317b(g, aghn.f65507h));
                            agdl h3 = mo35684h();
                            h3.mo35241h();
                            h3.mo35659q();
                            sdo.m34974b(b2 > 0);
                            sdo.m34974b(max > 0);
                            sdo.m34977c(g);
                            int i5 = 1024;
                            try {
                                cursor2 = h3.mo35360e().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{g}, null, null, "rowid", String.valueOf(b2));
                                try {
                                    if (cursor2.moveToFirst()) {
                                        list = new ArrayList();
                                        int i6 = 0;
                                        while (true) {
                                            long j2 = cursor2.getLong(i3);
                                            try {
                                                byte[] blob = cursor2.getBlob(i2);
                                                o = h3.mo35657o();
                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                byte[] bArr = new byte[i5];
                                                while (true) {
                                                    int read = gZIPInputStream.read(bArr);
                                                    if (read <= 0) {
                                                        break;
                                                    }
                                                    ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                                                    byteArrayOutputStream.write(bArr, 0, read);
                                                    byteArrayInputStream = byteArrayInputStream2;
                                                }
                                                gZIPInputStream.close();
                                                byteArrayInputStream.close();
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                if (list.isEmpty() || byteArray.length + i6 <= max) {
                                                    try {
                                                        bxvd bxvd = (bxvd) agmp.m54563a((bxxb) agnm.f66088P.mo74144da(), byteArray);
                                                        if (!cursor2.isNull(2)) {
                                                            int i7 = cursor2.getInt(2);
                                                            if (bxvd.f164950c) {
                                                                bxvd.mo74035c();
                                                                bxvd.f164950c = false;
                                                            }
                                                            agnm agnm = (agnm) bxvd.f164949b;
                                                            agnm.f66106b |= 2;
                                                            agnm.f66099J = i7;
                                                        }
                                                        i6 += byteArray.length;
                                                        list.add(Pair.create((agnm) bxvd.mo74062i(), Long.valueOf(j2)));
                                                    } catch (IOException e5) {
                                                        h3.mo35497E().f65564c.mo35437a("Failed to merge queued bundle. appId", agid.m54288a(g), e5);
                                                    }
                                                    if (!cursor2.moveToNext() || i6 > max) {
                                                        break;
                                                    }
                                                    i2 = 1;
                                                    i3 = 0;
                                                    i5 = 1024;
                                                } else {
                                                    break;
                                                }
                                            } catch (IOException e6) {
                                                IOException iOException = e6;
                                                o.mo35497E().f65564c.mo35436a("Failed to ungzip content", iOException);
                                                throw iOException;
                                            } catch (IOException e7) {
                                                h3.mo35497E().f65564c.mo35437a("Failed to unzip queued bundle. appId", agid.m54288a(g), e7);
                                            }
                                        }
                                    } else {
                                        list = Collections.emptyList();
                                    }
                                } catch (SQLiteException e8) {
                                    sQLiteException = e8;
                                    try {
                                        h3.mo35497E().f65564c.mo35437a("Error querying bundles. appId", agid.m54288a(g), sQLiteException);
                                        list = Collections.emptyList();
                                    } catch (Throwable th9) {
                                        th = th9;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    cursor = cursor2;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e9) {
                                sQLiteException = e9;
                                cursor2 = null;
                                h3.mo35497E().f65564c.mo35437a("Error querying bundles. appId", agid.m54288a(g), sQLiteException);
                                list = Collections.emptyList();
                            } catch (Throwable th11) {
                                th = th11;
                                cursor = null;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        this.f65967v = false;
                    } else {
                        mo35497E().f65572k.mo35435a("Network not connected, ignoring upload request");
                        mo35699w();
                        this.f65967v = false;
                    }
                    mo35700x();
                }
                mo35497E().f65572k.mo35435a("Uploading requested multiple times");
                this.f65967v = false;
                mo35700x();
            }
            mo35699w();
            this.f65967v = false;
            mo35700x();
        } catch (Throwable th12) {
            Throwable th13 = th12;
            this.f65967v = false;
            mo35700x();
            throw th13;
        }
    }

    /* renamed from: v */
    public final boolean mo35698v() {
        mo35694r();
        mo35695s();
        return mo35684h().mo35334a("select count(1) > 0 from raw_events", null) != 0 || !TextUtils.isEmpty(mo35684h().mo35363g());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b0  */
    /* renamed from: w */
    public final void mo35699w() {
        boolean z;
        long j;
        long j2;
        mo35694r();
        mo35695s();
        if (this.f65955i > 0) {
            long abs = 3600000 - Math.abs(mo35691o().mo20506b() - this.f65955i);
            if (abs > 0) {
                mo35497E().f65572k.mo35436a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                mo35685i().mo35450a();
                mo35686j().mo35455b();
                return;
            }
            this.f65955i = 0;
        }
        if (!this.f65953g.mo35518v() || !mo35698v()) {
            mo35497E().f65572k.mo35435a("Nothing to upload or uploading impossible");
            mo35685i().mo35450a();
            mo35686j().mo35455b();
            return;
        }
        long a = mo35691o().mo20505a();
        mo35680d();
        long max = Math.max(0L, ((Long) aghn.f65525z.mo35389a()).longValue());
        if (mo35684h().mo35334a("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) == 0 && mo35684h().mo35334a("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            mo35680d();
            j = Math.max(0L, ((Long) aghn.f65518s.mo35389a()).longValue());
        } else {
            String k = mo35680d().mo35327k();
            if (TextUtils.isEmpty(k) || ".none.".equals(k)) {
                mo35680d();
                j = Math.max(0L, ((Long) aghn.f65519t.mo35389a()).longValue());
            } else {
                mo35680d();
                j = Math.max(0L, ((Long) aghn.f65520u.mo35389a()).longValue());
            }
        }
        long a2 = mo35681e().f65619d.mo35458a();
        long a3 = mo35681e().f65620e.mo35458a();
        long max2 = Math.max(mo35684h().mo35335a("select max(bundle_end_timestamp) from queue", (String[]) null, 0), mo35684h().mo35335a("select max(timestamp) from raw_events", (String[]) null, 0));
        if (max2 != 0) {
            long abs2 = a - Math.abs(max2 - a);
            long abs3 = Math.abs(a2 - a);
            long abs4 = a - Math.abs(a3 - a);
            long max3 = Math.max(a - abs3, abs4);
            j2 = max + abs2;
            if (z && max3 > 0) {
                j2 = Math.min(abs2, max3) + j;
            }
            if (!mo35688l().mo35715a(max3, j)) {
                j2 = max3 + j;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i = 0;
                while (true) {
                    mo35680d();
                    if (i >= Math.min(20, Math.max(0, ((Integer) aghn.f65446B.mo35389a()).intValue()))) {
                        break;
                    }
                    mo35680d();
                    j2 += Math.max(0L, ((Long) aghn.f65445A.mo35389a()).longValue()) * (1 << i);
                    if (j2 > abs4) {
                        break;
                    }
                    i++;
                }
            }
            if (j2 != 0) {
                mo35497E().f65572k.mo35435a("Next upload time is 0");
                mo35685i().mo35450a();
                mo35686j().mo35455b();
                return;
            } else if (!mo35683g().mo35448c()) {
                mo35497E().f65572k.mo35435a("No network");
                agik i2 = mo35685i();
                i2.f65592a.mo35695s();
                i2.f65592a.mo35694r();
                if (!i2.f65593b) {
                    i2.mo35451b().registerReceiver(i2, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    i2.f65594c = i2.f65592a.mo35683g().mo35448c();
                    i2.mo35452c().f65572k.mo35436a("Registering connectivity change receiver. Network connected", Boolean.valueOf(i2.f65594c));
                    i2.f65593b = true;
                }
                mo35686j().mo35455b();
                return;
            } else {
                long a4 = mo35681e().f65621f.mo35458a();
                mo35680d();
                long max4 = Math.max(0L, ((Long) aghn.f65517r.mo35389a()).longValue());
                if (!mo35688l().mo35715a(a4, max4)) {
                    j2 = Math.max(j2, a4 + max4);
                }
                mo35685i().mo35450a();
                long a5 = j2 - mo35691o().mo20505a();
                if (a5 <= 0) {
                    mo35680d();
                    a5 = Math.max(0L, ((Long) aghn.f65521v.mo35389a()).longValue());
                    mo35681e().f65619d.mo35459a(mo35691o().mo20505a());
                }
                agib agib = mo35497E().f65572k;
                Long valueOf = Long.valueOf(a5);
                agib.mo35436a("Upload scheduled in approximately ms", valueOf);
                agme j3 = mo35686j();
                j3.mo35659q();
                if (!j3.mo35537u().f65291a) {
                    Context z2 = j3.mo35542z();
                    if (!agiv.m54326a(z2)) {
                        j3.mo35497E().f65571j.mo35435a("Receiver not registered/enabled");
                    }
                    if (!agms.m54590a(z2)) {
                        j3.mo35497E().f65571j.mo35435a("Service not registered/enabled");
                    }
                }
                j3.mo35455b();
                j3.mo35497E().f65572k.mo35436a("Scheduling upload, millis", valueOf);
                j3.mo35534A().mo20506b();
                j3.mo35538v();
                if (a5 < Math.max(0L, ((Long) aghn.f65522w.mo35389a()).longValue()) && !j3.f65927a.mo35369b()) {
                    j3.f65927a.mo35368a(a5);
                }
                if (j3.mo35537u().f65291a) {
                    j3.mo35454a(a5);
                    return;
                }
                int i3 = Build.VERSION.SDK_INT;
                Context z3 = j3.mo35542z();
                ComponentName componentName = new ComponentName(z3, "com.google.android.gms.measurement.AppMeasurementJobService");
                int d = j3.mo35654d();
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                adzi.m51464a(z3, new JobInfo.Builder(d, componentName).setMinimumLatency(a5).setOverrideDeadline(a5 + a5).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
                return;
            }
        }
        j2 = 0;
        if (j2 != 0) {
        }
    }

    /* renamed from: x */
    public final void mo35700x() {
        mo35694r();
        if (!this.f65966u && !this.f65959m && !this.f65967v) {
            mo35497E().f65572k.mo35435a("Stopping uploading service(s)");
            List list = this.f65956j;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Runnable) list.get(i)).run();
                }
                this.f65956j.clear();
                return;
            }
            return;
        }
        mo35497E().f65572k.mo35438a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f65966u), Boolean.valueOf(this.f65959m), Boolean.valueOf(this.f65967v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo35701y() {
        mo35694r();
        mo35695s();
        if (!this.f65965t) {
            this.f65965t = true;
            if (mo35702z()) {
                FileChannel fileChannel = this.f65969x;
                mo35694r();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo35497E().f65564c.mo35435a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0L);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo35497E().f65567f.mo35436a("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo35497E().f65564c.mo35436a("Failed to read from channel", e);
                    }
                }
                int r = this.f65953g.mo35510n().mo35407r();
                mo35694r();
                if (i > r) {
                    mo35497E().f65564c.mo35437a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(r));
                } else if (i < r) {
                    FileChannel fileChannel2 = this.f65969x;
                    mo35694r();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo35497E().f65564c.mo35435a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(r);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0L);
                            if (mo35680d().mo35314a(aghn.f65489ao)) {
                                int i2 = Build.VERSION.SDK_INT;
                            }
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo35497E().f65564c.mo35436a("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo35497E().f65572k.mo35437a("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(r));
                            return;
                        } catch (IOException e2) {
                            mo35497E().f65564c.mo35436a("Failed to write to channel", e2);
                        }
                    }
                    mo35497E().f65564c.mo35437a("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(r));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo35702z() {
        FileLock fileLock;
        mo35694r();
        if (mo35680d().mo35314a(aghn.f65480af) && (fileLock = this.f65968w) != null && fileLock.isValid()) {
            mo35497E().f65572k.mo35435a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(mo35690n().getFilesDir(), this.f65948b.mo35361f()), "rw").getChannel();
            this.f65969x = channel;
            FileLock tryLock = channel.tryLock();
            this.f65968w = tryLock;
            if (tryLock == null) {
                mo35497E().f65564c.mo35435a("Storage concurrent data access panic");
                return false;
            }
            mo35497E().f65572k.mo35435a("Storage concurrent access okay");
            return true;
        } catch (FileNotFoundException e) {
            mo35497E().f65564c.mo35436a("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            mo35497E().f65564c.mo35436a("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            mo35497E().f65567f.mo35436a("Storage lock already acquired", e3);
            return false;
        }
    }

    public agmn(agmo agmo) {
        sdo.m34959a(agmo);
        this.f65953g = agje.m54353a(agmo.f65970a);
        this.f65962p = -1;
        agmp agmp = new agmp(this);
        agmp.mo35660r();
        this.f65964s = agmp;
        agii a = agmo.mo35703a(this);
        a.mo35660r();
        this.f65963r = a;
        agiw agiw = new agiw(this);
        agiw.mo35660r();
        this.f65947a = agiw;
        mo35498F().mo35492a(new agmh(this, agmo));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agmp.a(bxvd, java.lang.String, java.lang.Object):void
     arg types: [bxvd, java.lang.String, long]
     candidates:
      agmp.a(boolean, boolean, boolean):java.lang.String
      agmp.a(java.lang.StringBuilder, java.lang.String, agno):void
      agmp.a(java.lang.StringBuilder, int, agmv):void
      agmp.a(java.lang.StringBuilder, int, java.util.List):void
      agmp.a(bxvd, java.lang.String, java.lang.Object):void */
    /* renamed from: b */
    private final void m54514b(bxvd bxvd, bxvd bxvd2) {
        sdo.m34974b("_e".equals(((agni) bxvd.f164949b).f66068c));
        mo35688l();
        agnk b = agmp.m54574b((agni) bxvd.mo74062i(), "_et");
        if ((b.f66079a & 4) != 0) {
            long j = b.f66082d;
            if (j > 0) {
                mo35688l();
                agnk b2 = agmp.m54574b((agni) bxvd2.mo74062i(), "_et");
                if (b2 != null) {
                    long j2 = b2.f66082d;
                    if (j2 > 0) {
                        j += j2;
                    }
                }
                mo35688l().mo35712a(bxvd2, "_et", Long.valueOf(j));
                mo35688l().mo35712a(bxvd, "_fr", (Object) 1L);
            }
        }
    }

    /* renamed from: a */
    public static final void m54506a(agmg agmg) {
        if (agmg == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!agmg.mo35658p()) {
            String valueOf = String.valueOf(agmg.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a3, code lost:
        if (r3 != false) goto L_0x01a5;
     */
    /* renamed from: b */
    public final agcv mo35674b(AppMetadata appMetadata) {
        boolean z;
        mo35694r();
        mo35695s();
        sdo.m34959a(appMetadata);
        sdo.m34977c(appMetadata.f80098a);
        agcv b = mo35684h().mo35349b(appMetadata.f80098a);
        String b2 = mo35681e().mo35467b(appMetadata.f80098a);
        cfjg.f184202a.mo6606a();
        boolean z2 = false;
        boolean z3 = true;
        if (b == null) {
            b = new agcv(this.f65953g, appMetadata.f80098a);
            b.mo35250a(mo35692p().mo35755o());
            b.mo35262d(b2);
            z = true;
        } else if (!b2.equals(b.mo35263e())) {
            b.mo35262d(b2);
            b.mo35250a(mo35692p().mo35755o());
            z = true;
        } else {
            z = false;
        }
        if (!TextUtils.equals(appMetadata.f80099b, b.mo35256c())) {
            b.mo35254b(appMetadata.f80099b);
            z = true;
        }
        if (!TextUtils.equals(appMetadata.f80115r, b.mo35260d())) {
            b.mo35258c(appMetadata.f80115r);
            z = true;
        }
        cfjt.m139846c();
        if (!TextUtils.isEmpty(appMetadata.f80108k) && !appMetadata.f80108k.equals(b.mo35266f())) {
            b.mo35265e(appMetadata.f80108k);
            z = true;
        }
        long j = appMetadata.f80102e;
        if (!(j == 0 || j == b.mo35280l())) {
            b.mo35261d(appMetadata.f80102e);
            z = true;
        }
        if (!TextUtils.isEmpty(appMetadata.f80100c) && !appMetadata.f80100c.equals(b.mo35275i())) {
            b.mo35268f(appMetadata.f80100c);
            z = true;
        }
        if (appMetadata.f80107j != b.mo35277j()) {
            b.mo35257c(appMetadata.f80107j);
            z = true;
        }
        String str = appMetadata.f80101d;
        if (str != null && !str.equals(b.mo35279k())) {
            b.mo35271g(appMetadata.f80101d);
            z = true;
        }
        if (appMetadata.f80103f != b.mo35281m()) {
            b.mo35264e(appMetadata.f80103f);
            z = true;
        }
        if (appMetadata.f80105h != b.mo35283o()) {
            b.mo35251a(appMetadata.f80105h);
            z = true;
        }
        if (!TextUtils.isEmpty(appMetadata.f80104g) && !appMetadata.f80104g.equals(b.mo35288t())) {
            b.mo35274h(appMetadata.f80104g);
            z = true;
        }
        if (!mo35680d().mo35314a(aghn.f65472aA) && appMetadata.f80109l != b.mo35289u()) {
            b.mo35278j(appMetadata.f80109l);
            z = true;
        }
        if (appMetadata.f80112o != b.mo35290v()) {
            b.mo35255b(appMetadata.f80112o);
            z = true;
        }
        if (appMetadata.f80113p != b.mo35291w()) {
            b.mo35259c(appMetadata.f80113p);
            z = true;
        }
        if (appMetadata.f80116s != b.mo35292x()) {
            Boolean bool = appMetadata.f80116s;
            b.f65240a.mo35512p();
            boolean z4 = b.f65250k;
            Boolean bool2 = b.f65241b;
            int i = agms.f65976a;
            if (bool2 == null && bool == null) {
                z2 = true;
            } else if (bool2 != null) {
                z2 = bool2.equals(bool);
            }
            b.f65250k = (!z2) | z4;
            b.f65241b = bool;
        } else {
            z3 = z;
        }
        long j2 = appMetadata.f80117t;
        if (j2 != 0 && j2 != b.mo35282n()) {
            b.mo35267f(appMetadata.f80117t);
        }
        mo35684h().mo35342a(b);
        return b;
    }

    /* renamed from: a */
    private static final void m54507a(bxvd bxvd) {
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        agnm agnm = (agnm) bxvd.f164949b;
        agnm agnm2 = agnm.f66088P;
        int i = agnm.f66105a | 4;
        agnm.f66105a = i;
        agnm.f66111g = Long.MAX_VALUE;
        agnm.f66105a = i | 8;
        agnm.f66112h = Long.MIN_VALUE;
        for (int i2 = 0; i2 < ((agnm) bxvd.f164949b).f66108d.size(); i2++) {
            agni D = bxvd.mo73938D(i2);
            long j = D.f66069d;
            if (j < ((agnm) bxvd.f164949b).f66111g) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                agnm agnm3 = (agnm) bxvd.f164949b;
                agnm3.f66105a |= 4;
                agnm3.f66111g = j;
            }
            long j2 = D.f66069d;
            if (j2 > ((agnm) bxvd.f164949b).f66112h) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                agnm agnm4 = (agnm) bxvd.f164949b;
                agnm4.f66105a |= 8;
                agnm4.f66112h = j2;
            }
        }
    }

    /* renamed from: a */
    static final void m54508a(bxvd bxvd, int i, String str) {
        List unmodifiableList = Collections.unmodifiableList(((agni) bxvd.f164949b).f66067b);
        int i2 = 0;
        while (i2 < unmodifiableList.size()) {
            if (!"_err".equals(((agnk) unmodifiableList.get(i2)).f66080b)) {
                i2++;
            } else {
                return;
            }
        }
        bxvd da = agnk.f66077g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        agnk agnk = (agnk) da.f164949b;
        "_err".getClass();
        agnk.f66079a |= 1;
        agnk.f66080b = "_err";
        long longValue = Long.valueOf((long) i).longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        agnk agnk2 = (agnk) da.f164949b;
        agnk2.f66079a |= 4;
        agnk2.f66082d = longValue;
        agnk agnk3 = (agnk) da.mo74062i();
        bxvd da2 = agnk.f66077g.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        agnk agnk4 = (agnk) da2.f164949b;
        "_ev".getClass();
        int i3 = agnk4.f66079a | 1;
        agnk4.f66079a = i3;
        agnk4.f66080b = "_ev";
        str.getClass();
        agnk4.f66079a = i3 | 2;
        agnk4.f66081c = str;
        bxvd.mo73985a(agnk3);
        bxvd.mo73985a((agnk) da2.mo74062i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo35675b(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        Bundle bundle;
        sdo.m34959a(conditionalUserPropertyParcel);
        sdo.m34977c(conditionalUserPropertyParcel.f80120a);
        sdo.m34959a(conditionalUserPropertyParcel.f80122c);
        sdo.m34977c(conditionalUserPropertyParcel.f80122c.f80139b);
        mo35694r();
        mo35695s();
        if (!m54515d(appMetadata)) {
            return;
        }
        if (!appMetadata.f80105h) {
            mo35674b(appMetadata);
            return;
        }
        mo35684h().mo35352b();
        try {
            mo35674b(appMetadata);
            ConditionalUserPropertyParcel d = mo35684h().mo35357d(conditionalUserPropertyParcel.f80120a, conditionalUserPropertyParcel.f80122c.f80139b);
            if (d != null) {
                mo35497E().f65571j.mo35437a("Removing conditional user property", conditionalUserPropertyParcel.f80120a, mo35689m().mo35426c(conditionalUserPropertyParcel.f80122c.f80139b));
                mo35684h().mo35362f(conditionalUserPropertyParcel.f80120a, conditionalUserPropertyParcel.f80122c.f80139b);
                if (d.f80124e) {
                    mo35684h().mo35353b(conditionalUserPropertyParcel.f80120a, conditionalUserPropertyParcel.f80122c.f80139b);
                }
                EventParcel eventParcel = conditionalUserPropertyParcel.f80130k;
                if (eventParcel != null) {
                    EventParams eventParams = eventParcel.f80133b;
                    if (eventParams != null) {
                        bundle = eventParams.mo44007a();
                    } else {
                        bundle = null;
                    }
                    agms p = mo35692p();
                    String str = conditionalUserPropertyParcel.f80120a;
                    EventParcel eventParcel2 = conditionalUserPropertyParcel.f80130k;
                    mo35676b(p.mo35725a(str, eventParcel2.f80132a, bundle, d.f80121b, eventParcel2.f80135d), appMetadata);
                }
            } else {
                mo35497E().f65567f.mo35437a("Conditional user property doesn't exist", agid.m54288a(conditionalUserPropertyParcel.f80120a), mo35689m().mo35426c(conditionalUserPropertyParcel.f80122c.f80139b));
            }
            mo35684h().mo35355c();
        } finally {
            mo35684h().mo35358d();
        }
    }

    /* renamed from: a */
    private final void m54509a(bxvd bxvd, long j, boolean z) {
        String str;
        agmr agmr;
        String str2;
        if (!z) {
            str = "_lte";
        } else {
            str = "_se";
        }
        agmr c = mo35684h().mo35354c(((agnm) bxvd.f164949b).f66121q, str);
        if (c == null || c.f65975e == null) {
            agmr = new agmr(((agnm) bxvd.f164949b).f66121q, "auto", str, mo35691o().mo20505a(), Long.valueOf(j));
        } else {
            agmr = new agmr(((agnm) bxvd.f164949b).f66121q, "auto", str, mo35691o().mo20505a(), Long.valueOf(((Long) c.f65975e).longValue() + j));
        }
        bxvd da = agnq.f66145g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        agnq agnq = (agnq) da.f164949b;
        str.getClass();
        agnq.f66147a |= 2;
        agnq.f66149c = str;
        long a = mo35691o().mo20505a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        agnq agnq2 = (agnq) da.f164949b;
        agnq2.f66147a |= 1;
        agnq2.f66148b = a;
        long longValue = ((Long) agmr.f65975e).longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        agnq agnq3 = (agnq) da.f164949b;
        agnq3.f66147a |= 8;
        agnq3.f66151e = longValue;
        agnq agnq4 = (agnq) da.mo74062i();
        int a2 = agmp.m54562a(bxvd, str);
        if (a2 >= 0) {
            bxvd.mo73967a(a2, agnq4);
        } else {
            bxvd.mo73986a(agnq4);
        }
        if (j > 0) {
            mo35684h().mo35347a(agmr);
            if (!z) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            mo35497E().f65572k.mo35437a("Updated engagement user property. scope, value", str2, agmr.f65975e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(android.os.Bundle, java.lang.String, java.lang.Object):void
     arg types: [android.os.Bundle, java.lang.String, long]
     candidates:
      agms.a(java.lang.String, int, boolean):java.lang.String
      agms.a(java.lang.String, int, java.lang.String):boolean
      agms.a(java.lang.String, java.lang.String[], java.lang.String):boolean
      agms.a(android.os.Bundle, java.lang.String, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03d1 A[Catch:{ SQLiteException -> 0x05d3, all -> 0x0d4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x041e A[Catch:{ SQLiteException -> 0x05d3, all -> 0x0d4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x048c A[Catch:{ SQLiteException -> 0x05d3, all -> 0x0d4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04af A[Catch:{ SQLiteException -> 0x05d3, all -> 0x0d4b }] */
    /* renamed from: b */
    public final void mo35676b(EventParcel eventParcel, AppMetadata appMetadata) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        long n;
        String str;
        agdl h;
        long j3;
        agdq agdq;
        agdr agdr;
        agdl h2;
        agnm agnm;
        boolean z3;
        ArrayList arrayList;
        agmr c;
        long j4;
        long j5;
        agmr agmr;
        char c2;
        char c3;
        String str2;
        String str3;
        int i;
        int i2;
        Iterator it;
        EventParcel eventParcel2 = eventParcel;
        AppMetadata appMetadata2 = appMetadata;
        sdo.m34959a(appMetadata);
        sdo.m34977c(appMetadata2.f80098a);
        long nanoTime = System.nanoTime();
        mo35694r();
        mo35695s();
        String str4 = appMetadata2.f80098a;
        mo35688l();
        if (!agmp.m54571a(eventParcel, appMetadata)) {
            return;
        }
        if (!appMetadata2.f80105h) {
            mo35674b(appMetadata2);
        } else if (mo35682f().mo35479b(str4, eventParcel2.f80132a)) {
            mo35497E().f65567f.mo35437a("Dropping blacklisted event. appId", agid.m54288a(str4), mo35689m().mo35422a(eventParcel2.f80132a));
            if (mo35682f().mo35483e(str4) || mo35682f().mo35484f(str4)) {
                agcv b = mo35684h().mo35349b(str4);
                if (b != null) {
                    long abs = Math.abs(mo35691o().mo20505a() - Math.max(b.mo35286r(), b.mo35285q()));
                    mo35680d();
                    if (abs > ((Long) aghn.f65524y.mo35389a()).longValue()) {
                        mo35497E().f65571j.mo35435a("Fetching config for blacklisted app");
                        mo35666a(b);
                    }
                }
            } else if (!"_err".equals(eventParcel2.f80132a)) {
                mo35692p().mo35732a(str4, 11, "_ev", eventParcel2.f80132a, 0);
            }
        } else {
            if (cfie.m139761b() && mo35680d().mo35314a(aghn.f65499ay)) {
                agie agie = new agie(eventParcel2.f80132a, eventParcel2.f80134c, eventParcel2.f80133b.mo44007a(), eventParcel2.f80135d);
                agms p = mo35692p();
                int a = mo35680d().mo35310a(str4, aghn.f65452H, 25, 100);
                Iterator it2 = new TreeSet(agie.f65577d.keySet()).iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    String str5 = (String) it2.next();
                    if (agms.m54591a(str5)) {
                        int i4 = i3 + 1;
                        if (i4 > a) {
                            StringBuilder sb = new StringBuilder(48);
                            sb.append("Event can't contain more than ");
                            sb.append(a);
                            sb.append(" params");
                            i = a;
                            it = it2;
                            i2 = i4;
                            p.mo35497E().f65566e.mo35437a(sb.toString(), p.mo35541y().mo35422a(agie.f65574a), p.mo35541y().mo35421a(agie.f65577d));
                            p.mo35735a(agie.f65577d, 5);
                            agie.f65577d.remove(str5);
                        } else {
                            i = a;
                            it = it2;
                            i2 = i4;
                        }
                        a = i;
                        it2 = it;
                        i3 = i2;
                    }
                }
                eventParcel2 = new EventParcel(agie.f65574a, new EventParams(new Bundle(agie.f65577d)), agie.f65575b, agie.f65576c);
            }
            if (mo35497E().mo35441a(2)) {
                agib agib = mo35497E().f65572k;
                aghu m = mo35689m();
                if (eventParcel2 == null) {
                    str2 = null;
                } else if (!m.mo35425b()) {
                    str2 = eventParcel2.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("origin=");
                    sb2.append(eventParcel2.f80134c);
                    sb2.append(",name=");
                    sb2.append(m.mo35422a(eventParcel2.f80132a));
                    sb2.append(",params=");
                    EventParams eventParams = eventParcel2.f80133b;
                    if (eventParams != null) {
                        str3 = !m.mo35425b() ? eventParams.toString() : m.mo35421a(eventParams.mo44007a());
                    } else {
                        str3 = null;
                    }
                    sb2.append(str3);
                    str2 = sb2.toString();
                }
                agib.mo35436a("Logging event", str2);
            }
            mo35684h().mo35352b();
            try {
                mo35674b(appMetadata2);
                if (!cfik.m139776b() || !mo35680d().mo35314a(aghn.f65498ax)) {
                    z = false;
                } else {
                    z = true;
                }
                if ("ecommerce_purchase".equals(eventParcel2.f80132a)) {
                    z2 = true;
                } else {
                    if (z) {
                        if ("purchase".equals(eventParcel2.f80132a) || "refund".equals(eventParcel2.f80132a)) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                if (!"_iap".equals(eventParcel2.f80132a)) {
                    if (!z2) {
                        j = nanoTime;
                        boolean a2 = agms.m54591a(eventParcel2.f80132a);
                        boolean equals = "_err".equals(eventParcel2.f80132a);
                        if (cfik.m139776b() || !mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65494at)) {
                            j2 = 1;
                        } else {
                            mo35692p();
                            EventParams eventParams2 = eventParcel2.f80133b;
                            if (eventParams2 != null) {
                                Iterator it3 = eventParams2.iterator();
                                j4 = 0;
                                while (it3.hasNext()) {
                                    Object a3 = eventParams2.mo44008a((String) it3.next());
                                    if (a3 instanceof Parcelable[]) {
                                        j4 += (long) ((Parcelable[]) a3).length;
                                    }
                                }
                            } else {
                                j4 = 0;
                            }
                            j2 = j4 + 1;
                        }
                        String str6 = str4;
                        agdj a4 = mo35684h().mo35336a(mo35696t(), str4, j2, true, a2, false, equals, false);
                        long j6 = a4.f65297b;
                        mo35680d();
                        n = j6 - agdi.m54039n();
                        if (n > 0) {
                            if (n % 1000 == 1) {
                                mo35497E().f65564c.mo35437a("Data loss. Too many events logged. appId, count", agid.m54288a(str6), Long.valueOf(a4.f65297b));
                            }
                            mo35684h().mo35355c();
                        } else {
                            if (a2) {
                                long j7 = a4.f65296a;
                                mo35680d();
                                long intValue = j7 - ((long) ((Integer) aghn.f65512m.mo35389a()).intValue());
                                if (intValue > 0) {
                                    if (intValue % 1000 == 1) {
                                        mo35497E().f65564c.mo35437a("Data loss. Too many public events logged. appId, count", agid.m54288a(str6), Long.valueOf(a4.f65296a));
                                    }
                                    mo35692p().mo35732a(str6, 16, "_ev", eventParcel2.f80132a, 0);
                                    mo35684h().mo35355c();
                                }
                            }
                            if (equals) {
                                long max = a4.f65299d - ((long) Math.max(0, Math.min(1000000, mo35680d().mo35317b(appMetadata2.f80098a, aghn.f65511l))));
                                if (max > 0) {
                                    if (max == 1) {
                                        mo35497E().f65564c.mo35437a("Too many error events logged. appId, count", agid.m54288a(str6), Long.valueOf(a4.f65299d));
                                    }
                                    mo35684h().mo35355c();
                                }
                            }
                            Bundle a5 = eventParcel2.f80133b.mo44007a();
                            mo35692p().mo35731a(a5, "_o", eventParcel2.f80134c);
                            str = str6;
                            if (mo35692p().mo35753g(str)) {
                                mo35692p().mo35731a(a5, "_dbg", (Object) 1L);
                                mo35692p().mo35731a(a5, "_r", (Object) 1L);
                            }
                            if ("_s".equals(eventParcel2.f80132a) && (c = mo35684h().mo35354c(appMetadata2.f80098a, "_sno")) != null && (c.f65975e instanceof Long)) {
                                mo35692p().mo35731a(a5, "_sno", c.f65975e);
                            }
                            h = mo35684h();
                            sdo.m34977c(str);
                            h.mo35241h();
                            h.mo35659q();
                            j3 = (long) h.mo35360e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, h.mo35538v().mo35317b(str, aghn.f65515p))))});
                            if (j3 > 0) {
                                mo35497E().f65567f.mo35437a("Data lost. Too many events stored on disk, deleted. appId", agid.m54288a(str), Long.valueOf(j3));
                            }
                            agje agje = this.f65953g;
                            String str7 = eventParcel2.f80134c;
                            String str8 = eventParcel2.f80132a;
                            long j8 = eventParcel2.f80135d;
                            String str9 = "_r";
                            String str10 = str;
                            agdq agdq2 = new agdq(agje, str7, str, str8, j8, 0, a5);
                            agdr a6 = mo35684h().mo35338a(str10, agdq2.f65325b);
                            if (a6 != null) {
                                agdq = new agdq(this.f65953g, agdq2.f65326c, agdq2.f65324a, agdq2.f65325b, agdq2.f65327d, a6.f65335f, agdq2.f65329f);
                                agdr = a6.mo35378a(agdq.f65327d);
                            } else {
                                agdl h3 = mo35684h();
                                sdo.m34977c(str10);
                                if (h3.mo35335a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str10}, 0) >= ((long) mo35680d().mo35309a(str10))) {
                                    if (a2) {
                                        mo35497E().f65564c.mo35438a("Too many event names used, ignoring event. appId, name, supported count", agid.m54288a(str10), mo35689m().mo35422a(agdq2.f65325b), Integer.valueOf(mo35680d().mo35309a(str10)));
                                        mo35692p().mo35732a(str10, 8, (String) null, (String) null, 0);
                                    }
                                }
                                agdr agdr2 = new agdr(str10, agdq2.f65325b, agdq2.f65327d);
                                agdq = agdq2;
                                agdr = agdr2;
                            }
                            mo35684h().mo35343a(agdr);
                            mo35694r();
                            mo35695s();
                            sdo.m34959a(agdq);
                            sdo.m34959a(appMetadata);
                            sdo.m34977c(agdq.f65324a);
                            sdo.m34974b(agdq.f65324a.equals(appMetadata2.f80098a));
                            bxvd da = agnm.f66088P.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            agnm.m54658a((agnm) da.f164949b);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            agnm agnm2 = (agnm) da.f164949b;
                            "android".getClass();
                            agnm2.f66105a |= 64;
                            agnm2.f66115k = "android";
                            if (!TextUtils.isEmpty(appMetadata2.f80098a)) {
                                String str11 = appMetadata2.f80098a;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm3 = (agnm) da.f164949b;
                                str11.getClass();
                                agnm3.f66105a |= 4096;
                                agnm3.f66121q = str11;
                            }
                            if (!TextUtils.isEmpty(appMetadata2.f80101d)) {
                                String str12 = appMetadata2.f80101d;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm4 = (agnm) da.f164949b;
                                str12.getClass();
                                agnm4.f66105a |= 2048;
                                agnm4.f66120p = str12;
                            }
                            if (!TextUtils.isEmpty(appMetadata2.f80100c)) {
                                String str13 = appMetadata2.f80100c;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm5 = (agnm) da.f164949b;
                                str13.getClass();
                                agnm5.f66105a |= 8192;
                                agnm5.f66122r = str13;
                            }
                            long j9 = appMetadata2.f80107j;
                            if (j9 != -2147483648L) {
                                int i5 = (int) j9;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm6 = (agnm) da.f164949b;
                                agnm6.f66105a |= 33554432;
                                agnm6.f66094E = i5;
                            }
                            long j10 = appMetadata2.f80102e;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            agnm agnm7 = (agnm) da.f164949b;
                            agnm7.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            agnm7.f66123s = j10;
                            if (!TextUtils.isEmpty(appMetadata2.f80099b)) {
                                String str14 = appMetadata2.f80099b;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm8 = (agnm) da.f164949b;
                                str14.getClass();
                                agnm8.f66105a |= 4194304;
                                agnm8.f66090A = str14;
                            }
                            cfjt.m139846c();
                            int i6 = 4;
                            if (TextUtils.isEmpty(((agnm) da.f164949b).f66090A) && !TextUtils.isEmpty(appMetadata2.f80115r)) {
                                String str15 = appMetadata2.f80115r;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm9 = (agnm) da.f164949b;
                                str15.getClass();
                                agnm9.f66106b |= 4;
                                agnm9.f66100K = str15;
                            }
                            long j11 = appMetadata2.f80103f;
                            if (j11 != 0) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm10 = (agnm) da.f164949b;
                                agnm10.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                agnm10.f66128x = j11;
                            }
                            long j12 = appMetadata2.f80117t;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            agnm agnm11 = (agnm) da.f164949b;
                            agnm11.f66106b |= 16;
                            agnm11.f66103N = j12;
                            if (mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65462R)) {
                                agmp l = mo35688l();
                                Map a7 = aghn.m54210a(l.f65930j.mo35690n());
                                if (a7 == null || a7.size() == 0) {
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList();
                                    int intValue2 = ((Integer) aghn.f65454J.mo35389a()).intValue();
                                    Iterator it4 = a7.entrySet().iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it4.next();
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int parseInt = Integer.parseInt((String) entry.getValue());
                                                if (parseInt != 0) {
                                                    arrayList.add(Integer.valueOf(parseInt));
                                                    if (arrayList.size() >= intValue2) {
                                                        l.mo35497E().f65567f.mo35436a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e) {
                                                l.mo35497E().f65567f.mo35436a("Experiment ID NumberFormatException", e);
                                            }
                                        }
                                    }
                                    if (arrayList.size() == 0) {
                                        arrayList = null;
                                    }
                                }
                                if (arrayList != null) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    agnm agnm12 = (agnm) da.f164949b;
                                    if (!agnm12.f66102M.mo73666a()) {
                                        agnm12.f66102M = GeneratedMessageLite.m124019a(agnm12.f66102M);
                                    }
                                    bxsy.m123078a(arrayList, agnm12.f66102M);
                                }
                            }
                            Pair a8 = mo35681e().mo35465a(appMetadata2.f80098a);
                            if (TextUtils.isEmpty((CharSequence) a8.first)) {
                                agdp q = mo35693q();
                                Context n2 = mo35690n();
                                if (q.f65318a == null) {
                                    if (!q.mo35537u().f65291a) {
                                        q.f65318a = false;
                                        try {
                                            PackageManager packageManager = n2.getPackageManager();
                                            if (packageManager != null) {
                                                packageManager.getPackageInfo("com.google.android.gms", 128);
                                                q.f65318a = true;
                                            }
                                        } catch (PackageManager.NameNotFoundException e2) {
                                        }
                                    } else {
                                        q.f65318a = true;
                                    }
                                }
                                if (!q.f65318a.booleanValue()) {
                                    if (appMetadata2.f80113p) {
                                        String string = Settings.Secure.getString(mo35690n().getContentResolver(), "android_id");
                                        if (string == null) {
                                            mo35497E().f65567f.mo35436a("null secure ID. appId", agid.m54288a(((agnm) da.f164949b).f66121q));
                                            string = "null";
                                        } else if (string.isEmpty()) {
                                            mo35497E().f65567f.mo35436a("empty secure ID. appId", agid.m54288a(((agnm) da.f164949b).f66121q));
                                        }
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        agnm agnm13 = (agnm) da.f164949b;
                                        string.getClass();
                                        agnm13.f66105a |= 268435456;
                                        agnm13.f66095F = string;
                                    }
                                }
                            } else if (appMetadata2.f80112o) {
                                String str16 = (String) a8.first;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm14 = (agnm) da.f164949b;
                                str16.getClass();
                                agnm14.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                agnm14.f66125u = str16;
                                if (a8.second != null) {
                                    boolean booleanValue = ((Boolean) a8.second).booleanValue();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    agnm agnm15 = (agnm) da.f164949b;
                                    agnm15.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                    agnm15.f66126v = booleanValue;
                                }
                            }
                            String b2 = mo35693q().mo35372b();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            agnm agnm16 = (agnm) da.f164949b;
                            b2.getClass();
                            agnm16.f66105a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            agnm16.f66117m = b2;
                            String c4 = mo35693q().mo35373c();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            agnm agnm17 = (agnm) da.f164949b;
                            c4.getClass();
                            agnm17.f66105a = 128 | agnm17.f66105a;
                            agnm17.f66116l = c4;
                            int d = (int) mo35693q().mo35374d();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            agnm agnm18 = (agnm) da.f164949b;
                            agnm18.f66105a |= 1024;
                            agnm18.f66119o = d;
                            String e3 = mo35693q().mo35375e();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            agnm agnm19 = (agnm) da.f164949b;
                            e3.getClass();
                            agnm19.f66105a |= 512;
                            agnm19.f66118n = e3;
                            if (!mo35680d().mo35314a(aghn.f65472aA)) {
                                long j13 = appMetadata2.f80109l;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm20 = (agnm) da.f164949b;
                                agnm20.f66105a |= JGCastService.FLAG_PRIVATE_DISPLAY;
                                agnm20.f66097H = j13;
                            }
                            if (this.f65953g.mo35513q()) {
                                String a9 = mo35432a(((agnm) da.f164949b).f66121q, 1000);
                                if (!TextUtils.isEmpty(a9)) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    agnm agnm21 = (agnm) da.f164949b;
                                    a9.getClass();
                                    agnm21.f66105a |= Integer.MIN_VALUE;
                                    agnm21.f66098I = a9;
                                }
                            }
                            agcv b3 = mo35684h().mo35349b(appMetadata2.f80098a);
                            if (b3 == null) {
                                b3 = new agcv(this.f65953g, appMetadata2.f80098a);
                                b3.mo35250a(mo35692p().mo35755o());
                                b3.mo35265e(appMetadata2.f80108k);
                                b3.mo35254b(appMetadata2.f80099b);
                                b3.mo35262d(mo35681e().mo35467b(appMetadata2.f80098a));
                                b3.mo35270g(0);
                                b3.mo35249a(0);
                                b3.mo35253b(0);
                                b3.mo35268f(appMetadata2.f80100c);
                                b3.mo35257c(appMetadata2.f80107j);
                                b3.mo35271g(appMetadata2.f80101d);
                                b3.mo35261d(appMetadata2.f80102e);
                                b3.mo35264e(appMetadata2.f80103f);
                                b3.mo35251a(appMetadata2.f80105h);
                                if (!mo35680d().mo35314a(aghn.f65472aA)) {
                                    b3.mo35278j(appMetadata2.f80109l);
                                }
                                b3.mo35267f(appMetadata2.f80117t);
                                mo35684h().mo35342a(b3);
                            }
                            if (!TextUtils.isEmpty(b3.mo35252b())) {
                                String b4 = b3.mo35252b();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm22 = (agnm) da.f164949b;
                                b4.getClass();
                                agnm22.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                agnm22.f66127w = b4;
                            }
                            if (!TextUtils.isEmpty(b3.mo35266f())) {
                                String f = b3.mo35266f();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm23 = (agnm) da.f164949b;
                                f.getClass();
                                agnm23.f66105a |= 16777216;
                                agnm23.f66093D = f;
                            }
                            List a10 = mo35684h().mo35340a(appMetadata2.f80098a);
                            int i7 = 0;
                            while (i7 < a10.size()) {
                                bxvd da2 = agnq.f66145g.mo74144da();
                                String str17 = ((agmr) a10.get(i7)).f65973c;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                agnq agnq = (agnq) da2.f164949b;
                                str17.getClass();
                                agnq.f66147a |= 2;
                                agnq.f66149c = str17;
                                long j14 = ((agmr) a10.get(i7)).f65974d;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                agnq agnq2 = (agnq) da2.f164949b;
                                agnq2.f66147a |= 1;
                                agnq2.f66148b = j14;
                                mo35688l().mo35711a(da2, ((agmr) a10.get(i7)).f65975e);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                agnm agnm24 = (agnm) da.f164949b;
                                agnq agnq3 = (agnq) da2.mo74062i();
                                agnq3.getClass();
                                agnm24.mo35759b();
                                agnm24.f66109e.add(agnq3);
                                i7++;
                                i6 = 4;
                            }
                            try {
                                h2 = mo35684h();
                                agnm = (agnm) da.mo74062i();
                                h2.mo35241h();
                                h2.mo35659q();
                                sdo.m34959a(agnm);
                                sdo.m34977c(agnm.f66121q);
                                byte[] k = agnm.serializeToBytes();
                                long a11 = h2.mo35657o().mo35707a(k);
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("app_id", agnm.f66121q);
                                contentValues.put("metadata_fingerprint", Long.valueOf(a11));
                                contentValues.put("metadata", k);
                                h2.mo35360e().insertWithOnConflict("raw_events_metadata", null, contentValues, i6);
                                agdl h4 = mo35684h();
                                Iterator it5 = agdq.f65329f.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        z3 = mo35682f().mo35481c(agdq.f65324a, agdq.f65325b) ? mo35684h().mo35337a(mo35696t(), agdq.f65324a, false, false).f65300e < ((long) mo35680d().mo35316b(agdq.f65324a)) : false;
                                    } else if (str9.equals((String) it5.next())) {
                                        z3 = true;
                                        break;
                                    }
                                }
                                if (h4.mo35346a(agdq, a11, z3)) {
                                    this.f65955i = 0;
                                }
                            } catch (SQLiteException e4) {
                                SQLiteException sQLiteException = e4;
                                h2.mo35497E().f65564c.mo35437a("Error storing raw event metadata. appId", agid.m54288a(agnm.f66121q), sQLiteException);
                                throw sQLiteException;
                            } catch (IOException e5) {
                                mo35497E().f65564c.mo35437a("Data loss. Failed to insert raw event metadata. appId", agid.m54288a(((agnm) da.f164949b).f66121q), e5);
                            }
                            mo35684h().mo35355c();
                            mo35684h().mo35358d();
                            mo35699w();
                            mo35497E().f65572k.mo35436a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j) + 500000) / 1000000));
                            return;
                        }
                        mo35684h().mo35358d();
                    }
                }
                String c5 = eventParcel2.f80133b.mo44010c("currency");
                if (z2) {
                    double doubleValue = Double.valueOf(eventParcel2.f80133b.f80131a.getDouble("value")).doubleValue() * 1000000.0d;
                    if (doubleValue == 0.0d) {
                        double longValue = (double) eventParcel2.f80133b.mo44009b("value").longValue();
                        Double.isNaN(longValue);
                        doubleValue = longValue * 1000000.0d;
                    }
                    if (doubleValue <= 9.223372036854776E18d && doubleValue >= -9.223372036854776E18d) {
                        j5 = Math.round(doubleValue);
                        if (cfik.m139776b() && mo35680d().mo35314a(aghn.f65498ax) && "refund".equals(eventParcel2.f80132a)) {
                            j5 = -j5;
                        }
                    } else {
                        mo35497E().f65567f.mo35437a("Data lost. Currency value is too big. appId", agid.m54288a(str4), Double.valueOf(doubleValue));
                        mo35684h().mo35355c();
                        mo35684h().mo35358d();
                    }
                } else {
                    j5 = eventParcel2.f80133b.mo44009b("value").longValue();
                }
                if (!TextUtils.isEmpty(c5)) {
                    String upperCase = c5.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        String valueOf = String.valueOf(upperCase);
                        String str18 = valueOf.length() == 0 ? new String("_ltv_") : "_ltv_".concat(valueOf);
                        agmr c6 = mo35684h().mo35354c(str4, str18);
                        if (c6 != null) {
                            Object obj = c6.f65975e;
                            if (obj instanceof Long) {
                                j = nanoTime;
                                agmr = new agmr(str4, eventParcel2.f80134c, str18, mo35691o().mo20505a(), Long.valueOf(((Long) obj).longValue() + j5));
                                if (!mo35684h().mo35347a(agmr)) {
                                    mo35497E().f65564c.mo35438a("Too many unique user properties are set. Ignoring user property. appId", agid.m54288a(str4), mo35689m().mo35426c(agmr.f65973c), agmr.f65975e);
                                    mo35692p().mo35732a(str4, 9, (String) null, (String) null, 0);
                                }
                            } else {
                                j = nanoTime;
                                c3 = 0;
                                c2 = 1;
                            }
                        } else {
                            j = nanoTime;
                            c3 = 0;
                            c2 = 1;
                        }
                        agdl h5 = mo35684h();
                        int b5 = mo35680d().mo35317b(str4, aghn.f65448D) - 1;
                        sdo.m34977c(str4);
                        h5.mo35241h();
                        h5.mo35659q();
                        try {
                            SQLiteDatabase e6 = h5.mo35360e();
                            String[] strArr = new String[3];
                            strArr[c3] = str4;
                            strArr[c2] = str4;
                            try {
                                strArr[2] = String.valueOf(b5);
                                e6.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr);
                            } catch (SQLiteException e7) {
                                e = e7;
                            }
                        } catch (SQLiteException e8) {
                            e = e8;
                            h5.mo35497E().f65564c.mo35437a("Error pruning currencies. appId", agid.m54288a(str4), e);
                            agmr = new agmr(str4, eventParcel2.f80134c, str18, mo35691o().mo20505a(), Long.valueOf(j5));
                            if (!mo35684h().mo35347a(agmr)) {
                            }
                            boolean a22 = agms.m54591a(eventParcel2.f80132a);
                            boolean equals2 = "_err".equals(eventParcel2.f80132a);
                            if (cfik.m139776b()) {
                            }
                            j2 = 1;
                            String str62 = str4;
                            agdj a42 = mo35684h().mo35336a(mo35696t(), str4, j2, true, a22, false, equals2, false);
                            long j62 = a42.f65297b;
                            mo35680d();
                            n = j62 - agdi.m54039n();
                            if (n > 0) {
                            }
                            mo35684h().mo35358d();
                        }
                        agmr = new agmr(str4, eventParcel2.f80134c, str18, mo35691o().mo20505a(), Long.valueOf(j5));
                        if (!mo35684h().mo35347a(agmr)) {
                        }
                    } else {
                        j = nanoTime;
                    }
                } else {
                    j = nanoTime;
                }
                boolean a222 = agms.m54591a(eventParcel2.f80132a);
                boolean equals22 = "_err".equals(eventParcel2.f80132a);
                if (cfik.m139776b()) {
                }
                j2 = 1;
                String str622 = str4;
                agdj a422 = mo35684h().mo35336a(mo35696t(), str4, j2, true, a222, false, equals22, false);
                long j622 = a422.f65297b;
                mo35680d();
                n = j622 - agdi.m54039n();
                if (n > 0) {
                }
            } catch (SQLiteException e9) {
                h.mo35497E().f65564c.mo35437a("Error deleting over the limit events. appId", agid.m54288a(str), e9);
                j3 = 0;
            } catch (Throwable th) {
                Throwable th2 = th;
                mo35684h().mo35358d();
                throw th2;
            }
            mo35684h().mo35358d();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agmp.a(bxvd, java.lang.String, java.lang.Object):void
     arg types: [bxvd, java.lang.String, long]
     candidates:
      agmp.a(boolean, boolean, boolean):java.lang.String
      agmp.a(java.lang.StringBuilder, java.lang.String, agno):void
      agmp.a(java.lang.StringBuilder, int, agmv):void
      agmp.a(java.lang.StringBuilder, int, java.util.List):void
      agmp.a(bxvd, java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    private final void m54510a(bxvd bxvd, agmm agmm) {
        int i;
        long j;
        int i2;
        long j2;
        agdr agdr;
        Long l;
        long j3;
        agdr agdr2;
        Integer num;
        bxvd bxvd2 = bxvd;
        agmm agmm2 = agmm;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        SecureRandom e = mo35692p().mo35751e();
        int i3 = 0;
        while (i3 < ((agnm) bxvd2.f164949b).f66108d.size()) {
            agni D = bxvd2.mo73938D(i3);
            bxvd bxvd3 = (bxvd) D.mo74142c(5);
            bxvd3.mo73625a((GeneratedMessageLite) D);
            if (((agni) bxvd3.f164949b).f66068c.equals("_ep")) {
                String str = (String) mo35688l().mo35709a((agni) bxvd3.mo74062i(), "_en");
                agdr agdr3 = (agdr) hashMap.get(str);
                if (agdr3 == null) {
                    agdr3 = mo35684h().mo35338a(agmm2.f65941a.f66121q, str);
                    hashMap.put(str, agdr3);
                }
                if (agdr3.f65338i == null) {
                    if (agdr3.f65339j.longValue() > 1) {
                        mo35688l().mo35712a(bxvd3, "_sr", agdr3.f65339j);
                    }
                    Boolean bool = agdr3.f65340k;
                    if (bool != null && bool.booleanValue()) {
                        mo35688l().mo35712a(bxvd3, "_efs", (Object) 1L);
                    }
                    arrayList.add((agni) bxvd3.mo74062i());
                }
                bxvd2.mo74036c(i3, bxvd3);
                i = i3;
            } else {
                agiw f = mo35682f();
                String str2 = agmm2.f65941a.f66121q;
                String a = f.mo35308a(str2, "measurement.account.time_zone_offset_minutes");
                if (!TextUtils.isEmpty(a)) {
                    try {
                        j = Long.parseLong(a);
                    } catch (NumberFormatException e2) {
                        f.mo35497E().f65567f.mo35437a("Unable to parse timezone offset. appId", agid.m54288a(str2), e2);
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                int i4 = i3;
                long a2 = mo35692p().mo35721a(((agni) bxvd3.f164949b).f66069d, j);
                agni agni = (agni) bxvd3.mo74062i();
                Long l2 = 1L;
                String str3 = "_efs";
                if (!TextUtils.isEmpty("_dbg")) {
                    bxwc bxwc = agni.f66067b;
                    int size = bxwc.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        bxwc bxwc2 = bxwc;
                        agnk agnk = (agnk) bxwc.get(i5);
                        int i6 = i5 + 1;
                        if (!"_dbg".equals(agnk.f66080b)) {
                            i5 = i6;
                            bxwc = bxwc2;
                        } else if (l2.equals(Long.valueOf(agnk.f66082d))) {
                            i2 = 1;
                        }
                    }
                }
                agiw f2 = mo35682f();
                String str4 = agmm2.f65941a.f66121q;
                String str5 = ((agni) bxvd3.f164949b).f66068c;
                f2.mo35241h();
                f2.mo35476a(str4);
                Map map = (Map) f2.f65649b.get(str4);
                i2 = (map == null || (num = (Integer) map.get(str5)) == null) ? 1 : num.intValue();
                if (i2 <= 0) {
                    mo35497E().f65567f.mo35437a("Sample rate must be positive. event, rate", ((agni) bxvd3.f164949b).f66068c, Integer.valueOf(i2));
                    arrayList.add((agni) bxvd3.mo74062i());
                    i = i4;
                    bxvd2.mo74036c(i, bxvd3);
                } else {
                    i = i4;
                    agdr agdr4 = (agdr) hashMap.get(((agni) bxvd3.f164949b).f66068c);
                    if (agdr4 == null && (agdr4 = mo35684h().mo35338a(agmm2.f65941a.f66121q, ((agni) bxvd3.f164949b).f66068c)) == null) {
                        j2 = j;
                        mo35497E().f65567f.mo35437a("Event being bundled has no eventAggregate. appId, eventName", agmm2.f65941a.f66121q, ((agni) bxvd3.f164949b).f66068c);
                        String str6 = agmm2.f65941a.f66121q;
                        agni agni2 = (agni) bxvd3.f164949b;
                        agdr4 = new agdr(str6, agni2.f66068c, 1, 1, 1, agni2.f66069d, 0, null, null, null, null);
                    } else {
                        j2 = j;
                    }
                    Long l3 = (Long) mo35688l().mo35709a((agni) bxvd3.mo74062i(), "_eid");
                    Boolean valueOf = Boolean.valueOf(l3 != null);
                    if (i2 == 1) {
                        arrayList.add((agni) bxvd3.mo74062i());
                        if (valueOf.booleanValue() && !(agdr4.f65338i == null && agdr4.f65339j == null && agdr4.f65340k == null)) {
                            hashMap.put(((agni) bxvd3.f164949b).f66068c, agdr4.mo35380a(null, null, null));
                        }
                        bxvd2.mo74036c(i, bxvd3);
                    } else {
                        if (e.nextInt(i2) == 0) {
                            agmp l4 = mo35688l();
                            Long valueOf2 = Long.valueOf((long) i2);
                            l4.mo35712a(bxvd3, "_sr", valueOf2);
                            arrayList.add((agni) bxvd3.mo74062i());
                            if (valueOf.booleanValue()) {
                                agdr4 = agdr4.mo35380a(null, valueOf2, null);
                            }
                            agni agni3 = (agni) bxvd3.f164949b;
                            hashMap.put(agni3.f66068c, agdr4.mo35379a(agni3.f66069d, a2));
                        } else {
                            Long l5 = agdr4.f65337h;
                            if (l5 != null) {
                                agdr = agdr4;
                                j3 = l5.longValue();
                                l = l3;
                            } else {
                                agdr = agdr4;
                                l = l3;
                                j3 = mo35692p().mo35721a(((agni) bxvd3.f164949b).f66070e, j2);
                            }
                            if (j3 != a2) {
                                mo35688l().mo35712a(bxvd3, str3, (Object) 1L);
                                agmp l6 = mo35688l();
                                Long valueOf3 = Long.valueOf((long) i2);
                                l6.mo35712a(bxvd3, "_sr", valueOf3);
                                arrayList.add((agni) bxvd3.mo74062i());
                                if (valueOf.booleanValue()) {
                                    agdr2 = agdr.mo35380a(null, valueOf3, true);
                                } else {
                                    agdr2 = agdr;
                                }
                                agni agni4 = (agni) bxvd3.f164949b;
                                hashMap.put(agni4.f66068c, agdr2.mo35379a(agni4.f66069d, a2));
                            } else {
                                agdr agdr5 = agdr;
                                if (valueOf.booleanValue()) {
                                    hashMap.put(((agni) bxvd3.f164949b).f66068c, agdr5.mo35380a(l, null, null));
                                }
                            }
                        }
                        bxvd2 = bxvd;
                        bxvd2.mo74036c(i, bxvd3);
                    }
                }
            }
            i3 = i + 1;
            agmm2 = agmm;
        }
        if (arrayList.size() < ((agnm) bxvd2.f164949b).f66108d.size()) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            agnm agnm = agnm.f66088P;
            ((agnm) bxvd2.f164949b).f66108d = GeneratedMessageLite.m124030de();
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            agnm agnm2 = (agnm) bxvd2.f164949b;
            agnm2.mo35758a();
            bxsy.m123078a(arrayList, agnm2.f66108d);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            mo35684h().mo35343a((agdr) entry.getValue());
        }
    }

    /* renamed from: a */
    static final void m54511a(bxvd bxvd, String str) {
        List unmodifiableList = Collections.unmodifiableList(((agni) bxvd.f164949b).f66067b);
        int i = 0;
        while (i < unmodifiableList.size()) {
            if (!str.equals(((agnk) unmodifiableList.get(i)).f66080b)) {
                i++;
            } else {
                bxvd.mo73936C(i);
                return;
            }
        }
    }

    /* renamed from: a */
    private final boolean m54512a(bxvd bxvd, bxvd bxvd2) {
        String str;
        sdo.m34974b("_e".equals(((agni) bxvd.f164949b).f66068c));
        mo35688l();
        agnk b = agmp.m54574b((agni) bxvd.mo74062i(), "_sc");
        String str2 = null;
        if (b != null) {
            str = b.f66081c;
        } else {
            str = null;
        }
        mo35688l();
        agnk b2 = agmp.m54574b((agni) bxvd2.mo74062i(), "_pc");
        if (b2 != null) {
            str2 = b2.f66081c;
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        m54514b(bxvd, bxvd2);
        return true;
    }

    /* renamed from: a */
    public final AppMetadata mo35665a(String str) {
        String str2 = str;
        agcv b = mo35684h().mo35349b(str2);
        if (b == null || TextUtils.isEmpty(b.mo35275i())) {
            mo35497E().f65571j.mo35436a("No app data available; dropping", str2);
            return null;
        }
        Boolean b2 = m54513b(b);
        if (b2 == null || b2.booleanValue()) {
            String c = b.mo35256c();
            String i = b.mo35275i();
            long j = b.mo35277j();
            String k = b.mo35279k();
            long l = b.mo35280l();
            long m = b.mo35281m();
            boolean o = b.mo35283o();
            String f = b.mo35266f();
            long u = b.mo35289u();
            boolean v = b.mo35290v();
            boolean w = b.mo35291w();
            String d = b.mo35260d();
            Boolean x = b.mo35292x();
            long n = b.mo35282n();
            List y = b.mo35293y();
            cfjt.m139846c();
            return new AppMetadata(str, c, i, j, k, l, m, null, o, false, f, u, 0, 0, v, w, false, d, x, n, y);
        }
        mo35497E().f65564c.mo35436a("App version does not match; dropping. appId", agid.m54288a(str));
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35666a(agcv agcv) {
        C1223np npVar;
        mo35694r();
        cfjt.m139846c();
        if (!TextUtils.isEmpty(agcv.mo35256c()) || !TextUtils.isEmpty(agcv.mo35260d())) {
            agdi d = mo35680d();
            Uri.Builder builder = new Uri.Builder();
            String c = agcv.mo35256c();
            if (TextUtils.isEmpty(c)) {
                cfjt.m139846c();
                c = agcv.mo35260d();
            }
            Uri.Builder encodedAuthority = builder.scheme((String) aghn.f65504e.mo35389a()).encodedAuthority((String) aghn.f65505f.mo35389a());
            String valueOf = String.valueOf(c);
            encodedAuthority.path(valueOf.length() == 0 ? new String("config/app/") : "config/app/".concat(valueOf)).appendQueryParameter("app_instance_id", agcv.mo35252b()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(d.mo35318c()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                mo35497E().f65572k.mo35436a("Fetching remote configuration", agcv.mo35248a());
                agne b = mo35682f().mo35478b(agcv.mo35248a());
                agiw f = mo35682f();
                String a = agcv.mo35248a();
                f.mo35241h();
                String str = (String) f.f65650c.get(a);
                if (b == null || TextUtils.isEmpty(str)) {
                    npVar = null;
                } else {
                    C1223np npVar2 = new C1223np();
                    npVar2.put("If-Modified-Since", str);
                    npVar = npVar2;
                }
                this.f65966u = true;
                agii g = mo35683g();
                String a2 = agcv.mo35248a();
                agmj agmj = new agmj(this);
                g.mo35241h();
                g.mo35659q();
                sdo.m34959a(url);
                sdo.m34959a(agmj);
                g.mo35498F().mo35494b(new agih(g, a2, url, null, npVar, agmj));
            } catch (MalformedURLException e) {
                mo35497E().f65564c.mo35437a("Failed to parse config URL. Not fetching. appId", agid.m54288a(agcv.mo35248a()), uri);
            }
        } else {
            mo35672a(agcv.mo35248a(), 204, null, null, null);
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: agcv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.content.pm.PackageInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: android.content.pm.PackageInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: agcv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: agcv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: agcv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: agcv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: agcv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: android.content.pm.PackageInfo} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03c7 A[Catch:{ NameNotFoundException -> 0x0423, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03cf A[Catch:{ NameNotFoundException -> 0x0423, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03d5 A[Catch:{ NameNotFoundException -> 0x0423, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03d6 A[Catch:{ NameNotFoundException -> 0x0423, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03fd A[Catch:{ NameNotFoundException -> 0x0423, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0413 A[SYNTHETIC, Splitter:B:146:0x0413] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04e1 A[Catch:{ NameNotFoundException -> 0x0423, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0506 A[Catch:{ NameNotFoundException -> 0x0423, all -> 0x054b }] */
    /* renamed from: a */
    public final void mo35667a(AppMetadata appMetadata) {
        agcv agcv;
        int i;
        agdr agdr;
        String str;
        String str2;
        long j;
        PackageInfo packageInfo;
        String str3;
        String str4;
        int i2;
        ApplicationInfo applicationInfo;
        boolean z;
        long j2;
        String str5;
        long j3;
        AppMetadata appMetadata2 = appMetadata;
        mo35694r();
        mo35695s();
        sdo.m34959a(appMetadata);
        sdo.m34977c(appMetadata2.f80098a);
        if (m54515d(appMetadata)) {
            agcv b = mo35684h().mo35349b(appMetadata2.f80098a);
            if (b != null && TextUtils.isEmpty(b.mo35256c()) && !TextUtils.isEmpty(appMetadata2.f80099b)) {
                b.mo35273h(0);
                mo35684h().mo35342a(b);
                agiw f = mo35682f();
                String str6 = appMetadata2.f80098a;
                f.mo35241h();
                f.f65648a.remove(str6);
            }
            if (!appMetadata2.f80105h) {
                mo35674b(appMetadata);
                return;
            }
            long j4 = appMetadata2.f80110m;
            if (j4 == 0) {
                j4 = mo35691o().mo20505a();
            }
            agdp q = mo35693q();
            q.mo35241h();
            q.f65319b = null;
            q.f65320c = 0;
            int i3 = appMetadata2.f80111n;
            if (!(i3 == 0 || i3 == 1)) {
                mo35497E().f65567f.mo35437a("Incorrect app type, assuming installed app. appId, appType", agid.m54288a(appMetadata2.f80098a), Integer.valueOf(i3));
                i3 = 0;
            }
            mo35684h().mo35352b();
            try {
                agmr c = mo35684h().mo35354c(appMetadata2.f80098a, "_npa");
                if (c == null || "auto".equals(c.f65972b)) {
                    Boolean bool = appMetadata2.f80116s;
                    if (bool != null) {
                        if (!bool.booleanValue()) {
                            j3 = 0;
                        } else {
                            j3 = 1;
                        }
                        UserAttributeParcel userAttributeParcel = r13;
                        agmr agmr = c;
                        agcv = null;
                        agcv = null;
                        UserAttributeParcel userAttributeParcel2 = new UserAttributeParcel("_npa", j4, Long.valueOf(j3), "auto");
                        if (agmr == null || !agmr.f65975e.equals(userAttributeParcel.f80141d)) {
                            mo35671a(userAttributeParcel, appMetadata2);
                        }
                    } else {
                        agcv = null;
                        agcv = null;
                        if (c != null) {
                            mo35677b(new UserAttributeParcel("_npa", j4, null, "auto"), appMetadata2);
                        }
                    }
                } else {
                    agcv = null;
                }
                agcv b2 = mo35684h().mo35349b(appMetadata2.f80098a);
                if (b2 != null && mo35692p().mo35739a(appMetadata2.f80099b, b2.mo35256c(), appMetadata2.f80115r, b2.mo35260d())) {
                    mo35497E().f65567f.mo35436a("New GMP App Id passed in. Removing cached database data. appId", agid.m54288a(b2.mo35248a()));
                    mo35684h().mo35356c(b2.mo35248a());
                    b2 = agcv;
                }
                if (b2 != null) {
                    if (((b2.mo35277j() == -2147483648L || b2.mo35277j() == appMetadata2.f80107j) ? false : true) || (b2.mo35277j() == -2147483648L && b2.mo35275i() != null && !b2.mo35275i().equals(appMetadata2.f80100c))) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", b2.mo35275i());
                        mo35669a(new EventParcel("_au", new EventParams(bundle), "auto", j4), appMetadata2);
                    }
                }
                mo35674b(appMetadata);
                if (i3 != 0) {
                    agdr = mo35684h().mo35338a(appMetadata2.f80098a, "_v");
                    i = 1;
                } else {
                    i = i3;
                    agdr = mo35684h().mo35338a(appMetadata2.f80098a, "_f");
                }
                if (agdr == null) {
                    long j5 = ((j4 / 3600000) + 1) * 3600000;
                    if (i != 0) {
                        String str7 = "_et";
                        mo35671a(new UserAttributeParcel("_fvt", j4, Long.valueOf(j5), "auto"), appMetadata2);
                        mo35694r();
                        mo35695s();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("_c", 1);
                        bundle2.putLong("_r", 1);
                        if (mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65459O)) {
                            bundle2.putLong(str7, 1);
                        }
                        if (appMetadata2.f80114q) {
                            bundle2.putLong("_dac", 1);
                        }
                        mo35669a(new EventParcel("_v", new EventParams(bundle2), "auto", j4), appMetadata2);
                        str = str7;
                    } else {
                        String str8 = "_dac";
                        String str9 = "_et";
                        mo35671a(new UserAttributeParcel("_fot", j4, Long.valueOf(j5), "auto"), appMetadata2);
                        if (mo35680d().mo35320c(appMetadata2.f80099b, aghn.f65457M)) {
                            mo35694r();
                            agit agit = this.f65953g.f65702r;
                            String str10 = appMetadata2.f80098a;
                            if (str10 != null) {
                                if (!str10.isEmpty()) {
                                    agit.f65646a.mo35512p();
                                    if (agit.mo35473a()) {
                                        agis agis = new agis(agit, str10);
                                        agit.f65646a.mo35512p();
                                        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                        PackageManager packageManager = agit.f65646a.f65685a.getPackageManager();
                                        if (packageManager == null) {
                                            agit.f65646a.mo35497E().f65568g.mo35435a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                        } else {
                                            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                            if (queryIntentServices != null) {
                                                if (!queryIntentServices.isEmpty()) {
                                                    ResolveInfo resolveInfo = queryIntentServices.get(0);
                                                    if (resolveInfo.serviceInfo != null) {
                                                        String str11 = resolveInfo.serviceInfo.packageName;
                                                        if (resolveInfo.serviceInfo.name != null) {
                                                            if ("com.android.vending".equals(str11)) {
                                                                if (agit.mo35473a()) {
                                                                    try {
                                                                        try {
                                                                            boolean a = skh.m35531a().mo25690a(agit.f65646a.f65685a, new Intent(intent), agis, 1);
                                                                            agib agib = agit.f65646a.mo35497E().f65572k;
                                                                            if (!a) {
                                                                                str5 = "not available";
                                                                            } else {
                                                                                str5 = "available";
                                                                            }
                                                                            agib.mo35436a("Install Referrer Service is", str5);
                                                                        } catch (Exception e) {
                                                                            e = e;
                                                                            agit.f65646a.mo35497E().f65564c.mo35436a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                                            mo35694r();
                                                                            mo35695s();
                                                                            Bundle bundle3 = new Bundle();
                                                                            bundle3.putLong("_c", 1);
                                                                            bundle3.putLong("_r", 1);
                                                                            bundle3.putLong("_uwa", 0);
                                                                            bundle3.putLong("_pfo", 0);
                                                                            bundle3.putLong("_sys", 0);
                                                                            bundle3.putLong("_sysu", 0);
                                                                            if (mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65459O)) {
                                                                            }
                                                                            if (appMetadata2.f80114q) {
                                                                            }
                                                                            agdl h = mo35684h();
                                                                            String str12 = appMetadata2.f80098a;
                                                                            sdo.m34977c(str12);
                                                                            h.mo35241h();
                                                                            h.mo35659q();
                                                                            long e2 = h.mo35359e(str12, "first_open_count");
                                                                            if (mo35690n().getPackageManager() == null) {
                                                                            }
                                                                            if (j >= 0) {
                                                                            }
                                                                            mo35669a(new EventParcel("_f", new EventParams(bundle3), "auto", j4), appMetadata2);
                                                                            if (!mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65460P)) {
                                                                            }
                                                                            mo35684h().mo35355c();
                                                                            mo35684h().mo35358d();
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        agit.f65646a.mo35497E().f65564c.mo35436a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                                        mo35694r();
                                                                        mo35695s();
                                                                        Bundle bundle32 = new Bundle();
                                                                        bundle32.putLong("_c", 1);
                                                                        bundle32.putLong("_r", 1);
                                                                        bundle32.putLong("_uwa", 0);
                                                                        bundle32.putLong("_pfo", 0);
                                                                        bundle32.putLong("_sys", 0);
                                                                        bundle32.putLong("_sysu", 0);
                                                                        if (mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65459O)) {
                                                                        }
                                                                        if (appMetadata2.f80114q) {
                                                                        }
                                                                        agdl h2 = mo35684h();
                                                                        String str122 = appMetadata2.f80098a;
                                                                        sdo.m34977c(str122);
                                                                        h2.mo35241h();
                                                                        h2.mo35659q();
                                                                        long e22 = h2.mo35359e(str122, "first_open_count");
                                                                        if (mo35690n().getPackageManager() == null) {
                                                                        }
                                                                        if (j >= 0) {
                                                                        }
                                                                        mo35669a(new EventParcel("_f", new EventParams(bundle32), "auto", j4), appMetadata2);
                                                                        if (!mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65460P)) {
                                                                        }
                                                                        mo35684h().mo35355c();
                                                                        mo35684h().mo35358d();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        agit.f65646a.mo35497E().f65567f.mo35435a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                    }
                                                }
                                            }
                                            agit.f65646a.mo35497E().f65570i.mo35435a("Play Service for fetching Install Referrer is unavailable on device");
                                        }
                                    } else {
                                        agit.f65646a.mo35497E().f65570i.mo35435a("Install Referrer Reporter is not available");
                                    }
                                }
                            }
                            agit.f65646a.mo35497E().f65568g.mo35435a("Install Referrer Reporter was called with invalid app package name");
                        }
                        mo35694r();
                        mo35695s();
                        Bundle bundle322 = new Bundle();
                        bundle322.putLong("_c", 1);
                        bundle322.putLong("_r", 1);
                        bundle322.putLong("_uwa", 0);
                        bundle322.putLong("_pfo", 0);
                        bundle322.putLong("_sys", 0);
                        bundle322.putLong("_sysu", 0);
                        if (mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65459O)) {
                            str2 = str9;
                            bundle322.putLong(str2, 1);
                        } else {
                            str2 = str9;
                        }
                        if (appMetadata2.f80114q) {
                            bundle322.putLong(str8, 1);
                        }
                        agdl h22 = mo35684h();
                        String str1222 = appMetadata2.f80098a;
                        sdo.m34977c(str1222);
                        h22.mo35241h();
                        h22.mo35659q();
                        long e222 = h22.mo35359e(str1222, "first_open_count");
                        if (mo35690n().getPackageManager() == null) {
                            mo35497E().f65564c.mo35436a("PackageManager is null, first open report might be inaccurate. appId", agid.m54288a(appMetadata2.f80098a));
                            str = str2;
                            j = e222;
                        } else {
                            packageInfo = svr.m36484b(mo35690n()).mo26176b(appMetadata2.f80098a, 0);
                            if (packageInfo != 0) {
                                str = str2;
                                if (packageInfo.firstInstallTime != 0) {
                                    str4 = "_sysu";
                                    str3 = "_sys";
                                    if (packageInfo.firstInstallTime == packageInfo.lastUpdateTime) {
                                        z = true;
                                    } else if (!mo35680d().mo35314a(aghn.f65485ak)) {
                                        bundle322.putLong("_uwa", 1);
                                        z = false;
                                    } else {
                                        if (e222 == 0) {
                                            bundle322.putLong("_uwa", 1);
                                        }
                                        z = false;
                                    }
                                    if (!z) {
                                        j2 = 0;
                                    } else {
                                        j2 = 1;
                                    }
                                    Long valueOf = Long.valueOf(j2);
                                    j = e222;
                                    i2 = 1;
                                    mo35671a(new UserAttributeParcel("_fi", j4, valueOf, "auto"), appMetadata2);
                                } else {
                                    str4 = "_sysu";
                                    str3 = "_sys";
                                    j = e222;
                                    i2 = 1;
                                }
                            } else {
                                str4 = "_sysu";
                                str3 = "_sys";
                                str = str2;
                                j = e222;
                                i2 = 1;
                            }
                            try {
                                applicationInfo = svr.m36484b(mo35690n()).mo26172a(appMetadata2.f80098a, 0);
                            } catch (PackageManager.NameNotFoundException e4) {
                                mo35497E().f65564c.mo35437a("Application info is null, first open report might be inaccurate. appId", agid.m54288a(appMetadata2.f80098a), e4);
                                applicationInfo = agcv;
                            }
                            if (applicationInfo != 0) {
                                if ((applicationInfo.flags & i2) != 0) {
                                    bundle322.putLong(str3, 1);
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle322.putLong(str4, 1);
                                }
                            }
                        }
                        if (j >= 0) {
                            bundle322.putLong("_pfo", j);
                        }
                        mo35669a(new EventParcel("_f", new EventParams(bundle322), "auto", j4), appMetadata2);
                    }
                    if (!mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65460P)) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong(str, 1);
                        if (mo35680d().mo35320c(appMetadata2.f80098a, aghn.f65459O)) {
                            bundle4.putLong("_fr", 1);
                        }
                        mo35669a(new EventParcel("_e", new EventParams(bundle4), "auto", j4), appMetadata2);
                    }
                } else if (appMetadata2.f80106i) {
                    mo35669a(new EventParcel("_cd", new EventParams(new Bundle()), "auto", j4), appMetadata2);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                mo35497E().f65564c.mo35437a("Package info is null, first open report might be inaccurate. appId", agid.m54288a(appMetadata2.f80098a), e5);
                packageInfo = agcv;
            } catch (Throwable th) {
                mo35684h().mo35358d();
                throw th;
            }
            mo35684h().mo35355c();
            mo35684h().mo35358d();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cf A[Catch:{ all -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013f A[Catch:{ all -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0163 A[Catch:{ all -> 0x0191 }] */
    /* renamed from: a */
    public final void mo35668a(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        sdo.m34959a(conditionalUserPropertyParcel);
        sdo.m34977c(conditionalUserPropertyParcel.f80120a);
        sdo.m34959a((Object) conditionalUserPropertyParcel.f80121b);
        sdo.m34959a(conditionalUserPropertyParcel.f80122c);
        sdo.m34977c(conditionalUserPropertyParcel.f80122c.f80139b);
        mo35694r();
        mo35695s();
        if (!m54515d(appMetadata)) {
            return;
        }
        if (!appMetadata.f80105h) {
            mo35674b(appMetadata);
            return;
        }
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
        boolean z = false;
        conditionalUserPropertyParcel2.f80124e = false;
        mo35684h().mo35352b();
        try {
            ConditionalUserPropertyParcel d = mo35684h().mo35357d(conditionalUserPropertyParcel2.f80120a, conditionalUserPropertyParcel2.f80122c.f80139b);
            if (d != null && !d.f80121b.equals(conditionalUserPropertyParcel2.f80121b)) {
                mo35497E().f65567f.mo35438a("Updating a conditional user property with different origin. name, origin, origin (from DB)", mo35689m().mo35426c(conditionalUserPropertyParcel2.f80122c.f80139b), conditionalUserPropertyParcel2.f80121b, d.f80121b);
            }
            if (d != null) {
                if (d.f80124e) {
                    conditionalUserPropertyParcel2.f80121b = d.f80121b;
                    conditionalUserPropertyParcel2.f80123d = d.f80123d;
                    conditionalUserPropertyParcel2.f80127h = d.f80127h;
                    conditionalUserPropertyParcel2.f80125f = d.f80125f;
                    conditionalUserPropertyParcel2.f80128i = d.f80128i;
                    conditionalUserPropertyParcel2.f80124e = true;
                    UserAttributeParcel userAttributeParcel = conditionalUserPropertyParcel2.f80122c;
                    conditionalUserPropertyParcel2.f80122c = new UserAttributeParcel(userAttributeParcel.f80139b, d.f80122c.f80140c, userAttributeParcel.mo44016a(), d.f80122c.f80143f);
                    if (conditionalUserPropertyParcel2.f80124e) {
                        UserAttributeParcel userAttributeParcel2 = conditionalUserPropertyParcel2.f80122c;
                        agmr agmr = new agmr(conditionalUserPropertyParcel2.f80120a, conditionalUserPropertyParcel2.f80121b, userAttributeParcel2.f80139b, userAttributeParcel2.f80140c, userAttributeParcel2.mo44016a());
                        if (!mo35684h().mo35347a(agmr)) {
                            mo35497E().f65564c.mo35438a("(2)Too many active user properties, ignoring", agid.m54288a(conditionalUserPropertyParcel2.f80120a), mo35689m().mo35426c(agmr.f65973c), agmr.f65975e);
                        } else {
                            mo35497E().f65571j.mo35438a("User property updated immediately", conditionalUserPropertyParcel2.f80120a, mo35689m().mo35426c(agmr.f65973c), agmr.f65975e);
                        }
                        if (z) {
                            EventParcel eventParcel = conditionalUserPropertyParcel2.f80128i;
                            if (eventParcel != null) {
                                mo35676b(new EventParcel(eventParcel, conditionalUserPropertyParcel2.f80123d), appMetadata);
                            }
                        }
                    }
                    if (mo35684h().mo35348a(conditionalUserPropertyParcel2)) {
                        mo35497E().f65564c.mo35438a("Too many conditional properties, ignoring", agid.m54288a(conditionalUserPropertyParcel2.f80120a), mo35689m().mo35426c(conditionalUserPropertyParcel2.f80122c.f80139b), conditionalUserPropertyParcel2.f80122c.mo44016a());
                    } else {
                        mo35497E().f65571j.mo35438a("Conditional property added", conditionalUserPropertyParcel2.f80120a, mo35689m().mo35426c(conditionalUserPropertyParcel2.f80122c.f80139b), conditionalUserPropertyParcel2.f80122c.mo44016a());
                    }
                    mo35684h().mo35355c();
                }
            }
            if (TextUtils.isEmpty(conditionalUserPropertyParcel2.f80125f)) {
                UserAttributeParcel userAttributeParcel3 = conditionalUserPropertyParcel2.f80122c;
                conditionalUserPropertyParcel2.f80122c = new UserAttributeParcel(userAttributeParcel3.f80139b, conditionalUserPropertyParcel2.f80123d, userAttributeParcel3.mo44016a(), conditionalUserPropertyParcel2.f80122c.f80143f);
                conditionalUserPropertyParcel2.f80124e = true;
                z = true;
            }
            if (conditionalUserPropertyParcel2.f80124e) {
            }
            if (mo35684h().mo35348a(conditionalUserPropertyParcel2)) {
            }
            mo35684h().mo35355c();
        } finally {
            mo35684h().mo35358d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo35677b(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        long j;
        mo35694r();
        mo35695s();
        if (!m54515d(appMetadata)) {
            return;
        }
        if (!appMetadata.f80105h) {
            mo35674b(appMetadata);
        } else if (!"_npa".equals(userAttributeParcel.f80139b) || appMetadata.f80116s == null) {
            mo35497E().f65571j.mo35436a("Removing user property", mo35689m().mo35426c(userAttributeParcel.f80139b));
            mo35684h().mo35352b();
            try {
                mo35674b(appMetadata);
                mo35684h().mo35353b(appMetadata.f80098a, userAttributeParcel.f80139b);
                mo35684h().mo35355c();
                mo35497E().f65571j.mo35436a("User property removed", mo35689m().mo35426c(userAttributeParcel.f80139b));
            } finally {
                mo35684h().mo35358d();
            }
        } else {
            mo35497E().f65571j.mo35435a("Falling back to manifest metadata value for ad personalization");
            long a = mo35691o().mo20505a();
            if (!appMetadata.f80116s.booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            mo35671a(new UserAttributeParcel("_npa", a, Long.valueOf(j), "auto"), appMetadata);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agdl.a(long, java.lang.String, boolean, boolean):agdj
     arg types: [long, java.lang.String, int, int]
     candidates:
      agdl.a(java.lang.String, long, long, agmm):void
      agdl.a(java.lang.String, java.lang.Long, long, agni):void
      agdl.a(long, java.lang.String, boolean, boolean):agdj */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agmn.a(bxvd, long, boolean):void
     arg types: [bxvd, long, int]
     candidates:
      agmn.a(bxvd, int, java.lang.String):void
      agmn.a(bxvd, long, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0b84, code lost:
        if (r7 > (p000.agdi.m54040o() + r4)) goto L_0x0b86;
     */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0617 A[Catch:{ SQLiteException -> 0x0c16, all -> 0x0cf2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x01cc A[EDGE_INSN: B:490:0x01cc->B:76:0x01cc ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012d A[SYNTHETIC, Splitter:B:53:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f7 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f8 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x021a A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021b A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0288 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028c A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029a A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x029d A[Catch:{ all -> 0x01c7 }] */
    /* renamed from: b */
    public final boolean mo35678b(String str, long j) {
        String str2;
        String str3;
        String str4;
        long j2;
        long j3;
        agdl h;
        agnm agnm;
        boolean z;
        long j4;
        agcv b;
        boolean z2;
        bxvd bxvd;
        agmm agmm;
        int i;
        agmn agmn;
        bxvd bxvd2;
        bxvd bxvd3;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        bxvd bxvd4;
        String str5;
        bxvd bxvd5;
        String str6;
        bxvd da;
        bxvd bxvd6;
        bxvd bxvd7;
        String str7;
        agmm agmm2;
        String str8;
        long j5;
        int i4;
        int i5;
        bxvd bxvd8;
        String str9;
        String str10;
        agmm agmm3;
        int i6;
        int i7;
        bxvd bxvd9;
        int i8;
        int i9;
        bxvd bxvd10;
        bxvd bxvd11;
        char c;
        agmn agmn2 = this;
        String str11 = "_npa";
        mo35684h().mo35352b();
        try {
            agmm agmm4 = new agmm(agmn2);
            mo35684h().mo35344a(str, j, agmn2.f65962p, agmm4);
            List list = agmm4.f65943c;
            if (list != null) {
                if (!list.isEmpty()) {
                    agnm agnm2 = agmm4.f65941a;
                    bxvd bxvd12 = (bxvd) agnm2.mo74142c(5);
                    bxvd12.mo73625a((GeneratedMessageLite) agnm2);
                    if (bxvd12.f164950c) {
                        bxvd12.mo74035c();
                        bxvd12.f164950c = false;
                    }
                    agnm agnm3 = agnm.f66088P;
                    ((agnm) bxvd12.f164949b).f66108d = GeneratedMessageLite.m124030de();
                    boolean c2 = mo35680d().mo35320c(agmm4.f65941a.f66121q, aghn.f65460P);
                    bxvd bxvd13 = null;
                    int i10 = -1;
                    bxvd bxvd14 = null;
                    int i11 = 0;
                    long j6 = 0;
                    int i12 = 0;
                    int i13 = -1;
                    int i14 = 0;
                    while (true) {
                        str2 = "_et";
                        str3 = str11;
                        str4 = "_e";
                        j2 = j6;
                        if (i11 >= agmm4.f65943c.size()) {
                            break;
                        }
                        agni agni = (agni) agmm4.f65943c.get(i11);
                        bxvd bxvd15 = (bxvd) agni.mo74142c(5);
                        bxvd15.mo73625a((GeneratedMessageLite) agni);
                        int i15 = i12;
                        if (!mo35682f().mo35479b(agmm4.f65941a.f66121q, ((agni) bxvd15.f164949b).f66068c)) {
                            int i16 = i11;
                            boolean c3 = mo35682f().mo35481c(agmm4.f65941a.f66121q, ((agni) bxvd15.f164949b).f66068c);
                            if (!c3) {
                                mo35688l();
                                String str12 = ((agni) bxvd15.f164949b).f66068c;
                                sdo.m34977c(str12);
                                z2 = c2;
                                int hashCode = str12.hashCode();
                                i2 = i10;
                                if (hashCode != 94660) {
                                    if (hashCode != 95025) {
                                        if (hashCode == 95027 && str12.equals("_ui")) {
                                            c = 1;
                                            if (c != 0 || c == 1 || c == 2) {
                                                i3 = 0;
                                                z4 = false;
                                                z3 = false;
                                                while (true) {
                                                    bxvd4 = bxvd14;
                                                    str5 = str2;
                                                    if (i3 >= ((agni) bxvd15.f164949b).f66067b.size()) {
                                                        break;
                                                    }
                                                    try {
                                                        if ("_c".equals(bxvd15.mo73934B(i3).f66080b)) {
                                                            bxvd7 = bxvd12;
                                                            bxvd6 = bxvd13;
                                                            agnk B = bxvd15.mo73934B(i3);
                                                            bxvd bxvd16 = (bxvd) B.mo74142c(5);
                                                            bxvd16.mo73625a((GeneratedMessageLite) B);
                                                            if (bxvd16.f164950c) {
                                                                bxvd16.mo74035c();
                                                                bxvd16.f164950c = false;
                                                            }
                                                            agnk agnk = (agnk) bxvd16.f164949b;
                                                            agnk agnk2 = agnk.f66077g;
                                                            agnk.f66079a |= 4;
                                                            str7 = str4;
                                                            agnk.f66082d = 1;
                                                            bxvd15.mo73966a(i3, (agnk) bxvd16.mo74062i());
                                                            z4 = true;
                                                        } else if ("_r".equals(bxvd15.mo73934B(i3).f66080b)) {
                                                            agnk B2 = bxvd15.mo73934B(i3);
                                                            bxvd bxvd17 = (bxvd) B2.mo74142c(5);
                                                            bxvd17.mo73625a((GeneratedMessageLite) B2);
                                                            if (bxvd17.f164950c) {
                                                                bxvd17.mo74035c();
                                                                bxvd17.f164950c = false;
                                                            }
                                                            agnk agnk3 = (agnk) bxvd17.f164949b;
                                                            agnk agnk4 = agnk.f66077g;
                                                            agnk3.f66079a |= 4;
                                                            bxvd7 = bxvd12;
                                                            bxvd6 = bxvd13;
                                                            agnk3.f66082d = 1;
                                                            bxvd15.mo73966a(i3, (agnk) bxvd17.mo74062i());
                                                            str7 = str4;
                                                            z3 = true;
                                                        } else {
                                                            bxvd7 = bxvd12;
                                                            bxvd6 = bxvd13;
                                                            str7 = str4;
                                                        }
                                                        i3++;
                                                        agmn2 = this;
                                                        str4 = str7;
                                                        bxvd12 = bxvd7;
                                                        bxvd14 = bxvd4;
                                                        str2 = str5;
                                                        bxvd13 = bxvd6;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        Throwable th2 = th;
                                                        mo35684h().mo35358d();
                                                        throw th2;
                                                    }
                                                }
                                                bxvd = bxvd12;
                                                bxvd5 = bxvd13;
                                                str6 = str4;
                                                if (!z4 && c3) {
                                                    mo35497E().f65572k.mo35436a("Marking event as conversion", mo35689m().mo35422a(((agni) bxvd15.f164949b).f66068c));
                                                    da = agnk.f66077g.mo74144da();
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    agnk agnk5 = (agnk) da.f164949b;
                                                    "_c".getClass();
                                                    int i17 = agnk5.f66079a | 1;
                                                    agnk5.f66079a = i17;
                                                    agnk5.f66080b = "_c";
                                                    agnk5.f66079a = i17 | 4;
                                                    agnk5.f66082d = 1;
                                                    bxvd15.mo74100q(da);
                                                }
                                                if (!z3) {
                                                    mo35497E().f65572k.mo35436a("Marking event as real-time", mo35689m().mo35422a(((agni) bxvd15.f164949b).f66068c));
                                                    bxvd da2 = agnk.f66077g.mo74144da();
                                                    if (da2.f164950c) {
                                                        da2.mo74035c();
                                                        da2.f164950c = false;
                                                    }
                                                    agnk agnk6 = (agnk) da2.f164949b;
                                                    "_r".getClass();
                                                    int i18 = agnk6.f66079a | 1;
                                                    agnk6.f66079a = i18;
                                                    agnk6.f66080b = "_r";
                                                    agnk6.f66079a = i18 | 4;
                                                    agnk6.f66082d = 1;
                                                    bxvd15.mo74100q(da2);
                                                }
                                                if (mo35684h().mo35337a(mo35696t(), agmm4.f65941a.f66121q, false, true).f65300e > ((long) mo35680d().mo35316b(agmm4.f65941a.f66121q))) {
                                                    m54511a(bxvd15, "_r");
                                                } else {
                                                    i14 = 1;
                                                }
                                                if (agms.m54591a(((agni) bxvd15.f164949b).f66068c)) {
                                                    if (c3) {
                                                        if (mo35684h().mo35337a(mo35696t(), agmm4.f65941a.f66121q, true, false).f65298c > ((long) mo35680d().mo35317b(agmm4.f65941a.f66121q, aghn.f65513n))) {
                                                            mo35497E().f65567f.mo35436a("Too many conversions. Not logging as conversion. appId", agid.m54288a(agmm4.f65941a.f66121q));
                                                            bxvd bxvd18 = null;
                                                            int i19 = -1;
                                                            boolean z5 = false;
                                                            for (int i20 = 0; i20 < ((agni) bxvd15.f164949b).f66067b.size(); i20++) {
                                                                agnk B3 = bxvd15.mo73934B(i20);
                                                                if ("_c".equals(B3.f66080b)) {
                                                                    bxvd18 = (bxvd) B3.mo74142c(5);
                                                                    bxvd18.mo73625a((GeneratedMessageLite) B3);
                                                                    i19 = i20;
                                                                } else if ("_err".equals(B3.f66080b)) {
                                                                    z5 = true;
                                                                }
                                                            }
                                                            if (z5 && bxvd18 != null) {
                                                                bxvd15.mo73936C(i19);
                                                            } else if (bxvd18 != null) {
                                                                bxvd e = bxvd18.clone();
                                                                if (e.f164950c) {
                                                                    e.mo74035c();
                                                                    e.f164950c = false;
                                                                }
                                                                agnk agnk7 = (agnk) e.f164949b;
                                                                agnk agnk8 = agnk.f66077g;
                                                                "_err".getClass();
                                                                int i21 = agnk7.f66079a | 1;
                                                                agnk7.f66079a = i21;
                                                                agnk7.f66080b = "_err";
                                                                agnk7.f66079a = i21 | 4;
                                                                agnk7.f66082d = 10;
                                                                bxvd15.mo73966a(i19, (agnk) e.mo74062i());
                                                            } else {
                                                                mo35497E().f65564c.mo35436a("Did not find conversion parameter. appId", agid.m54288a(agmm4.f65941a.f66121q));
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                str5 = str2;
                                                bxvd5 = bxvd13;
                                                bxvd4 = bxvd14;
                                                bxvd = bxvd12;
                                                str6 = str4;
                                            }
                                        }
                                    } else if (str12.equals("_ug")) {
                                        c = 2;
                                        if (c != 0) {
                                        }
                                        i3 = 0;
                                        z4 = false;
                                        z3 = false;
                                        while (true) {
                                            bxvd4 = bxvd14;
                                            str5 = str2;
                                            if (i3 >= ((agni) bxvd15.f164949b).f66067b.size()) {
                                            }
                                            i3++;
                                            agmn2 = this;
                                            str4 = str7;
                                            bxvd12 = bxvd7;
                                            bxvd14 = bxvd4;
                                            str2 = str5;
                                            bxvd13 = bxvd6;
                                        }
                                        bxvd = bxvd12;
                                        bxvd5 = bxvd13;
                                        str6 = str4;
                                        mo35497E().f65572k.mo35436a("Marking event as conversion", mo35689m().mo35422a(((agni) bxvd15.f164949b).f66068c));
                                        da = agnk.f66077g.mo74144da();
                                        if (da.f164950c) {
                                        }
                                        agnk agnk52 = (agnk) da.f164949b;
                                        "_c".getClass();
                                        int i172 = agnk52.f66079a | 1;
                                        agnk52.f66079a = i172;
                                        agnk52.f66080b = "_c";
                                        agnk52.f66079a = i172 | 4;
                                        agnk52.f66082d = 1;
                                        bxvd15.mo74100q(da);
                                        if (!z3) {
                                        }
                                        if (mo35684h().mo35337a(mo35696t(), agmm4.f65941a.f66121q, false, true).f65300e > ((long) mo35680d().mo35316b(agmm4.f65941a.f66121q))) {
                                        }
                                        if (agms.m54591a(((agni) bxvd15.f164949b).f66068c)) {
                                        }
                                    }
                                } else if (str12.equals("_in")) {
                                    c = 0;
                                    if (c != 0) {
                                    }
                                    i3 = 0;
                                    z4 = false;
                                    z3 = false;
                                    while (true) {
                                        bxvd4 = bxvd14;
                                        str5 = str2;
                                        if (i3 >= ((agni) bxvd15.f164949b).f66067b.size()) {
                                        }
                                        i3++;
                                        agmn2 = this;
                                        str4 = str7;
                                        bxvd12 = bxvd7;
                                        bxvd14 = bxvd4;
                                        str2 = str5;
                                        bxvd13 = bxvd6;
                                    }
                                    bxvd = bxvd12;
                                    bxvd5 = bxvd13;
                                    str6 = str4;
                                    mo35497E().f65572k.mo35436a("Marking event as conversion", mo35689m().mo35422a(((agni) bxvd15.f164949b).f66068c));
                                    da = agnk.f66077g.mo74144da();
                                    if (da.f164950c) {
                                    }
                                    agnk agnk522 = (agnk) da.f164949b;
                                    "_c".getClass();
                                    int i1722 = agnk522.f66079a | 1;
                                    agnk522.f66079a = i1722;
                                    agnk522.f66080b = "_c";
                                    agnk522.f66079a = i1722 | 4;
                                    agnk522.f66082d = 1;
                                    bxvd15.mo74100q(da);
                                    if (!z3) {
                                    }
                                    if (mo35684h().mo35337a(mo35696t(), agmm4.f65941a.f66121q, false, true).f65300e > ((long) mo35680d().mo35316b(agmm4.f65941a.f66121q))) {
                                    }
                                    if (agms.m54591a(((agni) bxvd15.f164949b).f66068c)) {
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                }
                                i3 = 0;
                                z4 = false;
                                z3 = false;
                                while (true) {
                                    bxvd4 = bxvd14;
                                    str5 = str2;
                                    if (i3 >= ((agni) bxvd15.f164949b).f66067b.size()) {
                                    }
                                    i3++;
                                    agmn2 = this;
                                    str4 = str7;
                                    bxvd12 = bxvd7;
                                    bxvd14 = bxvd4;
                                    str2 = str5;
                                    bxvd13 = bxvd6;
                                }
                                bxvd = bxvd12;
                                bxvd5 = bxvd13;
                                str6 = str4;
                                mo35497E().f65572k.mo35436a("Marking event as conversion", mo35689m().mo35422a(((agni) bxvd15.f164949b).f66068c));
                                da = agnk.f66077g.mo74144da();
                                if (da.f164950c) {
                                }
                                agnk agnk5222 = (agnk) da.f164949b;
                                "_c".getClass();
                                int i17222 = agnk5222.f66079a | 1;
                                agnk5222.f66079a = i17222;
                                agnk5222.f66080b = "_c";
                                agnk5222.f66079a = i17222 | 4;
                                agnk5222.f66082d = 1;
                                bxvd15.mo74100q(da);
                                if (!z3) {
                                }
                                if (mo35684h().mo35337a(mo35696t(), agmm4.f65941a.f66121q, false, true).f65300e > ((long) mo35680d().mo35316b(agmm4.f65941a.f66121q))) {
                                }
                                if (agms.m54591a(((agni) bxvd15.f164949b).f66068c)) {
                                }
                            } else {
                                z2 = c2;
                                i2 = i10;
                                i3 = 0;
                                z4 = false;
                                z3 = false;
                                while (true) {
                                    bxvd4 = bxvd14;
                                    str5 = str2;
                                    if (i3 >= ((agni) bxvd15.f164949b).f66067b.size()) {
                                    }
                                    i3++;
                                    agmn2 = this;
                                    str4 = str7;
                                    bxvd12 = bxvd7;
                                    bxvd14 = bxvd4;
                                    str2 = str5;
                                    bxvd13 = bxvd6;
                                }
                                bxvd = bxvd12;
                                bxvd5 = bxvd13;
                                str6 = str4;
                                mo35497E().f65572k.mo35436a("Marking event as conversion", mo35689m().mo35422a(((agni) bxvd15.f164949b).f66068c));
                                da = agnk.f66077g.mo74144da();
                                if (da.f164950c) {
                                }
                                agnk agnk52222 = (agnk) da.f164949b;
                                "_c".getClass();
                                int i172222 = agnk52222.f66079a | 1;
                                agnk52222.f66079a = i172222;
                                agnk52222.f66080b = "_c";
                                agnk52222.f66079a = i172222 | 4;
                                agnk52222.f66082d = 1;
                                bxvd15.mo74100q(da);
                                if (!z3) {
                                }
                                if (mo35684h().mo35337a(mo35696t(), agmm4.f65941a.f66121q, false, true).f65300e > ((long) mo35680d().mo35316b(agmm4.f65941a.f66121q))) {
                                }
                                if (agms.m54591a(((agni) bxvd15.f164949b).f66068c)) {
                                }
                            }
                            if (c3) {
                                ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((agni) bxvd15.f164949b).f66067b));
                                int i22 = -1;
                                int i23 = -1;
                                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                                    if ("value".equals(((agnk) arrayList.get(i24)).f66080b)) {
                                        i22 = i24;
                                    } else if ("currency".equals(((agnk) arrayList.get(i24)).f66080b)) {
                                        i23 = i24;
                                    }
                                }
                                if (i22 != -1) {
                                    if ((((agnk) arrayList.get(i22)).f66079a & 4) == 0 && (((agnk) arrayList.get(i22)).f66079a & 16) == 0) {
                                        mo35497E().f65569h.mo35435a("Value must be specified with a numeric type.");
                                        bxvd15.mo73936C(i22);
                                        m54511a(bxvd15, "_c");
                                        m54508a(bxvd15, 18, "value");
                                    } else {
                                        if (i23 != -1) {
                                            String str13 = ((agnk) arrayList.get(i23)).f66081c;
                                            if (str13.length() == 3) {
                                                int i25 = 0;
                                                while (true) {
                                                    if (i25 >= str13.length()) {
                                                        break;
                                                    }
                                                    int codePointAt = str13.codePointAt(i25);
                                                    if (!Character.isLetter(codePointAt)) {
                                                        break;
                                                    }
                                                    i25 += Character.charCount(codePointAt);
                                                }
                                            }
                                        }
                                        mo35497E().f65569h.mo35435a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        bxvd15.mo73936C(i22);
                                        m54511a(bxvd15, "_c");
                                        m54508a(bxvd15, 19, "currency");
                                    }
                                }
                            }
                            if (!mo35680d().mo35320c(agmm4.f65941a.f66121q, aghn.f65459O)) {
                                agmn = this;
                                agmm2 = agmm4;
                                i4 = i13;
                                bxvd8 = bxvd4;
                                i5 = i2;
                                str8 = str5;
                                bxvd3 = bxvd5;
                            } else if (str6.equals(((agni) bxvd15.f164949b).f66068c)) {
                                mo35688l();
                                if (agmp.m54574b((agni) bxvd15.mo74062i(), "_fr") != null) {
                                    agmn = this;
                                    agmm2 = agmm4;
                                    i4 = i13;
                                    bxvd8 = bxvd4;
                                    i5 = i2;
                                    str8 = str5;
                                    bxvd3 = bxvd5;
                                } else {
                                    if (bxvd5 != null) {
                                        bxvd3 = bxvd5;
                                        if (Math.abs(((agni) bxvd3.f164949b).f66069d - ((agni) bxvd15.f164949b).f66069d) > 1000) {
                                            agmn = this;
                                            i8 = i13;
                                        } else {
                                            bxvd e2 = bxvd3.clone();
                                            agmn = this;
                                            try {
                                                if (!agmn.m54512a(bxvd15, e2)) {
                                                    bxvd10 = bxvd3;
                                                    bxvd11 = bxvd15;
                                                    i9 = i13;
                                                    i10 = i15;
                                                } else {
                                                    i9 = i13;
                                                    bxvd.mo74036c(i9, e2);
                                                    i10 = i2;
                                                    bxvd11 = null;
                                                    bxvd10 = null;
                                                }
                                                agmm2 = agmm4;
                                                i13 = i9;
                                                str8 = str5;
                                                bxvd2 = bxvd11;
                                                bxvd3 = bxvd10;
                                                if (!z2 || !str6.equals(((agni) bxvd15.f164949b).f66068c)) {
                                                    agmm = agmm2;
                                                } else if (((agni) bxvd15.f164949b).f66067b.size() != 0) {
                                                    Long l = (Long) mo35688l().mo35709a((agni) bxvd15.mo74062i(), str8);
                                                    if (l == null) {
                                                        agmm = agmm2;
                                                        mo35497E().f65567f.mo35436a("Engagement event does not include duration. appId", agid.m54288a(agmm.f65941a.f66121q));
                                                    } else {
                                                        agmm = agmm2;
                                                        j5 = j2 + l.longValue();
                                                        i = i16;
                                                        agmm.f65943c.set(i, (agni) bxvd15.mo74062i());
                                                        i12 = i15 + 1;
                                                        bxvd.mo74108s(bxvd15);
                                                        j6 = j5;
                                                    }
                                                } else {
                                                    agmm = agmm2;
                                                    mo35497E().f65567f.mo35436a("Engagement event does not contain any parameters. appId", agid.m54288a(agmm.f65941a.f66121q));
                                                }
                                                j5 = j2;
                                                i = i16;
                                                agmm.f65943c.set(i, (agni) bxvd15.mo74062i());
                                                i12 = i15 + 1;
                                                bxvd.mo74108s(bxvd15);
                                                j6 = j5;
                                            } catch (SQLiteException e3) {
                                                h.mo35497E().f65564c.mo35437a("Error storing bundle. appId", agid.m54288a(agnm.f66121q), e3);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                Throwable th22 = th;
                                                mo35684h().mo35358d();
                                                throw th22;
                                            }
                                        }
                                    } else {
                                        agmn = this;
                                        i8 = i13;
                                        bxvd3 = bxvd5;
                                    }
                                    agmm2 = agmm4;
                                    i13 = i8;
                                    bxvd2 = bxvd15;
                                    i10 = i15;
                                    str8 = str5;
                                    if (!z2) {
                                    }
                                    agmm = agmm2;
                                    j5 = j2;
                                    i = i16;
                                    agmm.f65943c.set(i, (agni) bxvd15.mo74062i());
                                    i12 = i15 + 1;
                                    bxvd.mo74108s(bxvd15);
                                    j6 = j5;
                                }
                            } else {
                                agmn = this;
                                int i26 = i13;
                                bxvd3 = bxvd5;
                                if ("_vs".equals(((agni) bxvd15.f164949b).f66068c)) {
                                    mo35688l();
                                    str8 = str5;
                                    if (agmp.m54574b((agni) bxvd15.mo74062i(), str8) != null) {
                                        agmm2 = agmm4;
                                        i4 = i26;
                                        bxvd8 = bxvd4;
                                        i5 = i2;
                                    } else {
                                        if (bxvd4 != null) {
                                            bxvd2 = bxvd4;
                                            agmm3 = agmm4;
                                            if (Math.abs(((agni) bxvd2.f164949b).f66069d - ((agni) bxvd15.f164949b).f66069d) > 1000) {
                                                i6 = i2;
                                            } else {
                                                bxvd e4 = bxvd2.clone();
                                                if (!agmn.m54512a(e4, bxvd15)) {
                                                    bxvd9 = bxvd15;
                                                    i13 = i15;
                                                    i7 = i2;
                                                } else {
                                                    i7 = i2;
                                                    bxvd.mo74036c(i7, e4);
                                                    i13 = i26;
                                                    bxvd9 = null;
                                                    bxvd2 = null;
                                                }
                                                agmm2 = agmm3;
                                                i10 = i7;
                                                if (!z2) {
                                                }
                                                agmm = agmm2;
                                                j5 = j2;
                                                i = i16;
                                                agmm.f65943c.set(i, (agni) bxvd15.mo74062i());
                                                i12 = i15 + 1;
                                                bxvd.mo74108s(bxvd15);
                                                j6 = j5;
                                            }
                                        } else {
                                            agmm3 = agmm4;
                                            bxvd2 = bxvd4;
                                            i6 = i2;
                                        }
                                        agmm2 = agmm3;
                                        bxvd3 = bxvd15;
                                        i13 = i15;
                                        i10 = i6;
                                        if (!z2) {
                                        }
                                        agmm = agmm2;
                                        j5 = j2;
                                        i = i16;
                                        agmm.f65943c.set(i, (agni) bxvd15.mo74062i());
                                        i12 = i15 + 1;
                                        bxvd.mo74108s(bxvd15);
                                        j6 = j5;
                                    }
                                } else {
                                    agmm agmm5 = agmm4;
                                    bxvd8 = bxvd4;
                                    i5 = i2;
                                    str8 = str5;
                                    if (!mo35680d().mo35320c(agmm5.f65941a.f66121q, aghn.f65484aj)) {
                                        agmm2 = agmm5;
                                        i4 = i26;
                                    } else {
                                        if ("_ab".equals(((agni) bxvd15.f164949b).f66068c)) {
                                            mo35688l();
                                            if (agmp.m54574b((agni) bxvd15.mo74062i(), str8) != null) {
                                                agmm2 = agmm5;
                                                i4 = i26;
                                            } else if (bxvd8 != null) {
                                                agmm2 = agmm5;
                                                i4 = i26;
                                                if (Math.abs(((agni) bxvd8.f164949b).f66069d - ((agni) bxvd15.f164949b).f66069d) <= 4000) {
                                                    bxvd e5 = bxvd8.clone();
                                                    agmn.m54514b(e5, bxvd15);
                                                    sdo.m34974b(str6.equals(((agni) e5.f164949b).f66068c));
                                                    mo35688l();
                                                    agnk b2 = agmp.m54574b((agni) e5.mo74062i(), "_sn");
                                                    mo35688l();
                                                    agnk b3 = agmp.m54574b((agni) e5.mo74062i(), "_sc");
                                                    mo35688l();
                                                    agnk b4 = agmp.m54574b((agni) e5.mo74062i(), "_si");
                                                    if (b2 != null) {
                                                        str9 = b2.f66081c;
                                                    } else {
                                                        str9 = "";
                                                    }
                                                    if (!TextUtils.isEmpty(str9)) {
                                                        mo35688l().mo35712a(bxvd15, "_sn", str9);
                                                    }
                                                    if (b3 != null) {
                                                        str10 = b3.f66081c;
                                                    } else {
                                                        str10 = "";
                                                    }
                                                    if (!TextUtils.isEmpty(str10)) {
                                                        mo35688l().mo35712a(bxvd15, "_sc", str10);
                                                    }
                                                    if (b4 != null) {
                                                        mo35688l().mo35712a(bxvd15, "_si", Long.valueOf(b4.f66082d));
                                                    }
                                                    bxvd.mo74036c(i5, e5);
                                                    i10 = i5;
                                                    i13 = i4;
                                                    bxvd2 = null;
                                                    if (!z2) {
                                                    }
                                                    agmm = agmm2;
                                                    j5 = j2;
                                                    i = i16;
                                                    agmm.f65943c.set(i, (agni) bxvd15.mo74062i());
                                                    i12 = i15 + 1;
                                                    bxvd.mo74108s(bxvd15);
                                                    j6 = j5;
                                                }
                                            }
                                        }
                                        agmm2 = agmm5;
                                        i4 = i26;
                                    }
                                }
                            }
                            i10 = i5;
                            i13 = i4;
                            if (!z2) {
                            }
                            agmm = agmm2;
                            j5 = j2;
                            i = i16;
                            agmm.f65943c.set(i, (agni) bxvd15.mo74062i());
                            i12 = i15 + 1;
                            bxvd.mo74108s(bxvd15);
                            j6 = j5;
                        } else {
                            agmn = agmn2;
                            agmm = agmm4;
                            z2 = c2;
                            bxvd3 = bxvd13;
                            int i27 = i10;
                            bxvd2 = bxvd14;
                            i = i11;
                            int i28 = i13;
                            bxvd = bxvd12;
                            mo35497E().f65567f.mo35437a("Dropping blacklisted raw event. appId", agid.m54288a(agmm.f65941a.f66121q), mo35689m().mo35422a(((agni) bxvd15.f164949b).f66068c));
                            if (!mo35682f().mo35483e(agmm.f65941a.f66121q)) {
                                if (!mo35682f().mo35484f(agmm.f65941a.f66121q)) {
                                    if (!"_err".equals(((agni) bxvd15.f164949b).f66068c)) {
                                        mo35692p().mo35732a(agmm.f65941a.f66121q, 11, "_ev", ((agni) bxvd15.f164949b).f66068c, 0);
                                    }
                                }
                            }
                            i10 = i27;
                            i13 = i28;
                            j6 = j2;
                            i12 = i15;
                        }
                        i11 = i + 1;
                        bxvd13 = bxvd3;
                        agmn2 = agmn;
                        agmm4 = agmm;
                        bxvd12 = bxvd;
                        str11 = str3;
                        bxvd14 = bxvd2;
                        c2 = z2;
                    }
                    agmm agmm6 = agmm4;
                    String str14 = str2;
                    bxvd bxvd19 = bxvd12;
                    int i29 = i12;
                    agmn agmn3 = agmn2;
                    String str15 = str4;
                    if (c2) {
                        j3 = j2;
                        int i30 = i29;
                        int i31 = 0;
                        while (i31 < i30) {
                            agni D = bxvd19.mo73938D(i31);
                            if (str15.equals(D.f66068c)) {
                                mo35688l();
                                if (agmp.m54574b(D, "_fr") != null) {
                                    if (bxvd19.f164950c) {
                                        bxvd19.mo74035c();
                                        bxvd19.f164950c = false;
                                    }
                                    agnm agnm4 = (agnm) bxvd19.f164949b;
                                    agnm4.mo35758a();
                                    agnm4.f66108d.remove(i31);
                                    i30--;
                                    i31--;
                                    i31++;
                                }
                            }
                            mo35688l();
                            agnk b5 = agmp.m54574b(D, str14);
                            if (b5 != null) {
                                Long valueOf = (b5.f66079a & 4) != 0 ? Long.valueOf(b5.f66082d) : null;
                                if (valueOf != null) {
                                    if (valueOf.longValue() > 0) {
                                        j3 += valueOf.longValue();
                                    }
                                }
                            }
                            i31++;
                        }
                    } else {
                        j3 = j2;
                    }
                    agmn3.m54509a(bxvd19, j3, false);
                    Iterator it = Collections.unmodifiableList(((agnm) bxvd19.f164949b).f66108d).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if ("_s".equals(((agni) it.next()).f66068c)) {
                                mo35684h().mo35353b(((agnm) bxvd19.f164949b).f66121q, "_se");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (agmp.m54562a(bxvd19, "_sid") < 0) {
                        int a = agmp.m54562a(bxvd19, "_se");
                        if (a >= 0) {
                            if (bxvd19.f164950c) {
                                bxvd19.mo74035c();
                                bxvd19.f164950c = false;
                            }
                            agnm agnm5 = (agnm) bxvd19.f164949b;
                            agnm5.mo35759b();
                            agnm5.f66109e.remove(a);
                            mo35497E().f65564c.mo35436a("Session engagement user property is in the bundle without session ID. appId", agid.m54288a(agmm6.f65941a.f66121q));
                        }
                    } else {
                        agmn3.m54509a(bxvd19, j3, true);
                    }
                    agmp l2 = mo35688l();
                    l2.mo35497E().f65572k.mo35435a("Checking account type status for ad personalization signals");
                    if (l2.mo35655m().mo35482d(((agnm) bxvd19.f164949b).f66121q) && (b = l2.mo35656n().mo35349b(((agnm) bxvd19.f164949b).f66121q)) != null && b.mo35290v() && l2.mo35535B().mo35376f()) {
                        l2.mo35497E().f65571j.mo35435a("Turning off ad personalization due to account type");
                        bxvd da3 = agnq.f66145g.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        agnq agnq = (agnq) da3.f164949b;
                        str3.getClass();
                        agnq.f66147a |= 2;
                        String str16 = str3;
                        agnq.f66149c = str16;
                        agdp B4 = l2.mo35535B();
                        B4.mo35241h();
                        long j7 = B4.f65320c;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        agnq agnq2 = (agnq) da3.f164949b;
                        int i32 = agnq2.f66147a | 1;
                        agnq2.f66147a = i32;
                        agnq2.f66148b = j7;
                        agnq2.f66147a = i32 | 8;
                        agnq2.f66151e = 1;
                        agnq agnq3 = (agnq) da3.mo74062i();
                        int i33 = 0;
                        while (true) {
                            if (i33 < ((agnm) bxvd19.f164949b).f66109e.size()) {
                                if (str16.equals(bxvd19.mo73940E(i33).f66149c)) {
                                    bxvd19.mo73967a(i33, agnq3);
                                    break;
                                }
                                i33++;
                            } else {
                                bxvd19.mo73986a(agnq3);
                                break;
                            }
                        }
                    }
                    if (mo35680d().mo35320c(((agnm) bxvd19.f164949b).f66121q, aghn.f65481ag)) {
                        m54507a(bxvd19);
                    }
                    if (bxvd19.f164950c) {
                        bxvd19.mo74035c();
                        bxvd19.f164950c = false;
                    }
                    ((agnm) bxvd19.f164949b).f66092C = GeneratedMessageLite.m124030de();
                    agdd k = mo35687k();
                    agnm agnm6 = (agnm) bxvd19.f164949b;
                    String str17 = agnm6.f66121q;
                    List unmodifiableList = Collections.unmodifiableList(agnm6.f66108d);
                    List unmodifiableList2 = Collections.unmodifiableList(((agnm) bxvd19.f164949b).f66109e);
                    Long valueOf2 = Long.valueOf(((agnm) bxvd19.f164949b).f66111g);
                    long j8 = ((agnm) bxvd19.f164949b).f66112h;
                    bxvd19.mo73961X(k.mo35304a(str17, unmodifiableList, unmodifiableList2, valueOf2));
                    if ("1".equals(mo35680d().f65293a.mo35308a(agmm6.f65941a.f66121q, "measurement.event_sampling_enabled"))) {
                        agmn3.m54510a(bxvd19, agmm6);
                    }
                    if (!mo35680d().mo35320c(((agnm) bxvd19.f164949b).f66121q, aghn.f65481ag)) {
                        m54507a(bxvd19);
                    }
                    String str18 = agmm6.f65941a.f66121q;
                    agcv b6 = mo35684h().mo35349b(str18);
                    if (b6 == null) {
                        mo35497E().f65564c.mo35436a("Bundling raw events w/o app info. appId", agid.m54288a(agmm6.f65941a.f66121q));
                    } else if (((agnm) bxvd19.f164949b).f66108d.size() > 0) {
                        long h2 = b6.mo35272h();
                        if (h2 != 0) {
                            if (bxvd19.f164950c) {
                                bxvd19.mo74035c();
                                bxvd19.f164950c = false;
                            }
                            agnm agnm7 = (agnm) bxvd19.f164949b;
                            agnm7.f66105a |= 32;
                            agnm7.f66114j = h2;
                            j4 = 0;
                        } else {
                            if (bxvd19.f164950c) {
                                bxvd19.mo74035c();
                                bxvd19.f164950c = false;
                            }
                            agnm agnm8 = (agnm) bxvd19.f164949b;
                            agnm8.f66105a &= -33;
                            j4 = 0;
                            agnm8.f66114j = 0;
                        }
                        long g = b6.mo35269g();
                        if (g != j4) {
                            h2 = g;
                        }
                        if (h2 != j4) {
                            if (bxvd19.f164950c) {
                                bxvd19.mo74035c();
                                bxvd19.f164950c = false;
                            }
                            agnm agnm9 = (agnm) bxvd19.f164949b;
                            agnm9.f66105a |= 16;
                            agnm9.f66113i = h2;
                        } else {
                            if (bxvd19.f164950c) {
                                bxvd19.mo74035c();
                                bxvd19.f164950c = false;
                            }
                            agnm agnm10 = (agnm) bxvd19.f164949b;
                            agnm10.f66105a &= -17;
                            agnm10.f66113i = 0;
                        }
                        b6.mo35287s();
                        int p = (int) b6.mo35284p();
                        if (bxvd19.f164950c) {
                            bxvd19.mo74035c();
                            bxvd19.f164950c = false;
                        }
                        agnm agnm11 = (agnm) bxvd19.f164949b;
                        agnm11.f66105a |= 1048576;
                        agnm11.f66129y = p;
                        b6.mo35249a(agnm11.f66111g);
                        b6.mo35253b(((agnm) bxvd19.f164949b).f66112h);
                        b6.f65240a.mo35512p();
                        String str19 = b6.f65249j;
                        b6.mo35274h((String) null);
                        if (str19 != null) {
                            if (bxvd19.f164950c) {
                                bxvd19.mo74035c();
                                bxvd19.f164950c = false;
                            }
                            agnm agnm12 = (agnm) bxvd19.f164949b;
                            str19.getClass();
                            agnm12.f66105a |= 2097152;
                            agnm12.f66130z = str19;
                        } else {
                            if (bxvd19.f164950c) {
                                bxvd19.mo74035c();
                                bxvd19.f164950c = false;
                            }
                            agnm agnm13 = (agnm) bxvd19.f164949b;
                            agnm13.f66105a &= -2097153;
                            agnm13.f66130z = agnm.f66088P.f66130z;
                        }
                        mo35684h().mo35342a(b6);
                    }
                    if (((agnm) bxvd19.f164949b).f66108d.size() > 0) {
                        if (mo35664a().f65291a) {
                            if ((((agnm) bxvd19.f164949b).f66105a & 2097152) == 0) {
                                String c4 = mo35497E().mo35443c();
                                if (c4 != null) {
                                    if (bxvd19.f164950c) {
                                        bxvd19.mo74035c();
                                        bxvd19.f164950c = false;
                                    }
                                    agnm agnm14 = (agnm) bxvd19.f164949b;
                                    c4.getClass();
                                    agnm14.f66105a = 2097152 | agnm14.f66105a;
                                    agnm14.f66130z = c4;
                                } else {
                                    if (bxvd19.f164950c) {
                                        bxvd19.mo74035c();
                                        bxvd19.f164950c = false;
                                    }
                                    agnm agnm15 = (agnm) bxvd19.f164949b;
                                    agnm15.f66105a &= -2097153;
                                    agnm15.f66130z = agnm.f66088P.f66130z;
                                }
                            }
                        }
                        agne b7 = mo35682f().mo35478b(agmm6.f65941a.f66121q);
                        if (b7 != null && (b7.f66040a & 1) != 0) {
                            long j9 = b7.f66041b;
                            if (bxvd19.f164950c) {
                                bxvd19.mo74035c();
                                bxvd19.f164950c = false;
                            }
                            agnm agnm16 = (agnm) bxvd19.f164949b;
                            agnm16.f66105a |= 536870912;
                            agnm16.f66096G = j9;
                        } else if (TextUtils.isEmpty(agmm6.f65941a.f66090A)) {
                            if (bxvd19.f164950c) {
                                bxvd19.mo74035c();
                                bxvd19.f164950c = false;
                            }
                            agnm agnm17 = (agnm) bxvd19.f164949b;
                            agnm17.f66105a |= 536870912;
                            agnm17.f66096G = -1;
                        } else {
                            mo35497E().f65567f.mo35436a("Did not find measurement config or missing version info. appId", agid.m54288a(agmm6.f65941a.f66121q));
                        }
                        h = mo35684h();
                        agnm = (agnm) bxvd19.mo74062i();
                        h.mo35241h();
                        h.mo35659q();
                        sdo.m34959a(agnm);
                        sdo.m34977c(agnm.f66121q);
                        if ((agnm.f66105a & 8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sdo.m34970a(z);
                        h.mo35364k();
                        long a2 = h.mo35534A().mo20505a();
                        long j10 = agnm.f66112h;
                        h.mo35538v();
                        if (j10 >= a2 - agdi.m54040o()) {
                            long j11 = agnm.f66112h;
                            h.mo35538v();
                        }
                        h.mo35497E().f65567f.mo35438a("Storing bundle outside of the max uploading time span. appId, now, timestamp", agid.m54288a(agnm.f66121q), Long.valueOf(a2), Long.valueOf(agnm.f66112h));
                        try {
                            byte[] b8 = h.mo35657o().mo35717b(agnm.serializeToBytes());
                            h.mo35497E().f65572k.mo35436a("Saving bundle, size", Integer.valueOf(b8.length));
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("app_id", agnm.f66121q);
                            contentValues.put("bundle_end_timestamp", Long.valueOf(agnm.f66112h));
                            contentValues.put("data", b8);
                            contentValues.put("has_realtime", Integer.valueOf(i14));
                            if ((agnm.f66106b & 2) != 0) {
                                contentValues.put("retry_count", Integer.valueOf(agnm.f66099J));
                            }
                            if (h.mo35360e().insert("queue", null, contentValues) == -1) {
                                h.mo35497E().f65564c.mo35436a("Failed to insert bundle (got -1). appId", agid.m54288a(agnm.f66121q));
                            }
                        } catch (IOException e6) {
                            h.mo35497E().f65564c.mo35437a("Data loss. Failed to serialize bundle. appId", agid.m54288a(agnm.f66121q), e6);
                        }
                    }
                    agdl h3 = mo35684h();
                    List list2 = agmm6.f65942b;
                    sdo.m34959a(list2);
                    h3.mo35241h();
                    h3.mo35659q();
                    StringBuilder sb = new StringBuilder("rowid in (");
                    for (int i34 = 0; i34 < list2.size(); i34++) {
                        if (i34 != 0) {
                            sb.append(",");
                        }
                        sb.append(((Long) list2.get(i34)).longValue());
                    }
                    sb.append(")");
                    int delete = h3.mo35360e().delete("raw_events", sb.toString(), null);
                    if (delete != list2.size()) {
                        h3.mo35497E().f65564c.mo35437a("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list2.size()));
                    }
                    agdl h4 = mo35684h();
                    try {
                        h4.mo35360e().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str18, str18});
                    } catch (SQLiteException e7) {
                        h4.mo35497E().f65564c.mo35437a("Failed to remove unused event metadata. appId", agid.m54288a(str18), e7);
                    }
                    mo35684h().mo35355c();
                    mo35684h().mo35358d();
                    return true;
                }
            }
            mo35684h().mo35355c();
            mo35684h().mo35358d();
            return false;
        } catch (Throwable th4) {
            th = th4;
            Throwable th222 = th;
            mo35684h().mo35358d();
            throw th222;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35669a(EventParcel eventParcel, AppMetadata appMetadata) {
        List<ConditionalUserPropertyParcel> list;
        List<ConditionalUserPropertyParcel> list2;
        List<ConditionalUserPropertyParcel> list3;
        List list4;
        EventParcel eventParcel2 = eventParcel;
        AppMetadata appMetadata2 = appMetadata;
        sdo.m34959a(appMetadata);
        sdo.m34977c(appMetadata2.f80098a);
        mo35694r();
        mo35695s();
        String str = appMetadata2.f80098a;
        long j = eventParcel2.f80135d;
        mo35688l();
        if (!agmp.m54571a(eventParcel, appMetadata)) {
            return;
        }
        if (!appMetadata2.f80105h) {
            mo35674b(appMetadata2);
            return;
        }
        if (mo35680d().mo35320c(str, aghn.f65468X) && (list4 = appMetadata2.f80118u) != null) {
            if (list4.contains(eventParcel2.f80132a)) {
                Bundle a = eventParcel2.f80133b.mo44007a();
                a.putLong("ga_safelisted", 1);
                eventParcel2 = new EventParcel(eventParcel2.f80132a, new EventParams(a), eventParcel2.f80134c, eventParcel2.f80135d);
            } else {
                mo35497E().f65571j.mo35438a("Dropping non-safelisted event. appId, event name, origin", str, eventParcel2.f80132a, eventParcel2.f80134c);
                return;
            }
        }
        mo35684h().mo35352b();
        try {
            agdl h = mo35684h();
            sdo.m34977c(str);
            h.mo35241h();
            h.mo35659q();
            if (j < 0) {
                h.mo35497E().f65567f.mo35437a("Invalid time querying timed out conditional properties", agid.m54288a(str), Long.valueOf(j));
                list = Collections.emptyList();
            } else {
                list = h.mo35351b("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
            }
            for (ConditionalUserPropertyParcel conditionalUserPropertyParcel : list) {
                if (conditionalUserPropertyParcel != null) {
                    mo35497E().f65572k.mo35438a("User property timed out", conditionalUserPropertyParcel.f80120a, mo35689m().mo35426c(conditionalUserPropertyParcel.f80122c.f80139b), conditionalUserPropertyParcel.f80122c.mo44016a());
                    EventParcel eventParcel3 = conditionalUserPropertyParcel.f80126g;
                    if (eventParcel3 != null) {
                        mo35676b(new EventParcel(eventParcel3, j), appMetadata2);
                    }
                    mo35684h().mo35362f(str, conditionalUserPropertyParcel.f80122c.f80139b);
                }
            }
            agdl h2 = mo35684h();
            sdo.m34977c(str);
            h2.mo35241h();
            h2.mo35659q();
            if (j < 0) {
                h2.mo35497E().f65567f.mo35437a("Invalid time querying expired conditional properties", agid.m54288a(str), Long.valueOf(j));
                list2 = Collections.emptyList();
            } else {
                list2 = h2.mo35351b("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
            }
            ArrayList<EventParcel> arrayList = new ArrayList(list2.size());
            for (ConditionalUserPropertyParcel conditionalUserPropertyParcel2 : list2) {
                if (conditionalUserPropertyParcel2 != null) {
                    mo35497E().f65572k.mo35438a("User property expired", conditionalUserPropertyParcel2.f80120a, mo35689m().mo35426c(conditionalUserPropertyParcel2.f80122c.f80139b), conditionalUserPropertyParcel2.f80122c.mo44016a());
                    mo35684h().mo35353b(str, conditionalUserPropertyParcel2.f80122c.f80139b);
                    EventParcel eventParcel4 = conditionalUserPropertyParcel2.f80130k;
                    if (eventParcel4 != null) {
                        arrayList.add(eventParcel4);
                    }
                    mo35684h().mo35362f(str, conditionalUserPropertyParcel2.f80122c.f80139b);
                }
            }
            for (EventParcel eventParcel5 : arrayList) {
                mo35676b(new EventParcel(eventParcel5, j), appMetadata2);
            }
            agdl h3 = mo35684h();
            String str2 = eventParcel2.f80132a;
            sdo.m34977c(str);
            sdo.m34977c(str2);
            h3.mo35241h();
            h3.mo35659q();
            if (j < 0) {
                h3.mo35497E().f65567f.mo35438a("Invalid time querying triggered conditional properties", agid.m54288a(str), h3.mo35541y().mo35422a(str2), Long.valueOf(j));
                list3 = Collections.emptyList();
            } else {
                list3 = h3.mo35351b("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
            }
            ArrayList<EventParcel> arrayList2 = new ArrayList(list3.size());
            for (ConditionalUserPropertyParcel conditionalUserPropertyParcel3 : list3) {
                if (conditionalUserPropertyParcel3 != null) {
                    UserAttributeParcel userAttributeParcel = conditionalUserPropertyParcel3.f80122c;
                    agmr agmr = new agmr(conditionalUserPropertyParcel3.f80120a, conditionalUserPropertyParcel3.f80121b, userAttributeParcel.f80139b, j, userAttributeParcel.mo44016a());
                    if (!mo35684h().mo35347a(agmr)) {
                        mo35497E().f65564c.mo35438a("Too many active user properties, ignoring", agid.m54288a(conditionalUserPropertyParcel3.f80120a), mo35689m().mo35426c(agmr.f65973c), agmr.f65975e);
                    } else {
                        mo35497E().f65572k.mo35438a("User property triggered", conditionalUserPropertyParcel3.f80120a, mo35689m().mo35426c(agmr.f65973c), agmr.f65975e);
                    }
                    EventParcel eventParcel6 = conditionalUserPropertyParcel3.f80128i;
                    if (eventParcel6 != null) {
                        arrayList2.add(eventParcel6);
                    }
                    conditionalUserPropertyParcel3.f80122c = new UserAttributeParcel(agmr);
                    conditionalUserPropertyParcel3.f80124e = true;
                    mo35684h().mo35348a(conditionalUserPropertyParcel3);
                }
            }
            mo35676b(eventParcel2, appMetadata2);
            for (EventParcel eventParcel7 : arrayList2) {
                mo35676b(new EventParcel(eventParcel7, j), appMetadata2);
            }
            mo35684h().mo35355c();
        } finally {
            mo35684h().mo35358d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35670a(EventParcel eventParcel, String str) {
        EventParcel eventParcel2 = eventParcel;
        String str2 = str;
        agcv b = mo35684h().mo35349b(str2);
        if (b == null || TextUtils.isEmpty(b.mo35275i())) {
            mo35497E().f65571j.mo35436a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = m54513b(b);
        if (b2 == null) {
            if (!"_ui".equals(eventParcel2.f80132a)) {
                mo35497E().f65567f.mo35436a("Could not find package. appId", agid.m54288a(str));
            }
        } else if (!b2.booleanValue()) {
            mo35497E().f65564c.mo35436a("App version does not match; dropping event. appId", agid.m54288a(str));
            return;
        }
        String c = b.mo35256c();
        String i = b.mo35275i();
        long j = b.mo35277j();
        String k = b.mo35279k();
        long l = b.mo35280l();
        long m = b.mo35281m();
        boolean o = b.mo35283o();
        String f = b.mo35266f();
        long u = b.mo35289u();
        boolean v = b.mo35290v();
        boolean w = b.mo35291w();
        String d = b.mo35260d();
        Boolean x = b.mo35292x();
        long n = b.mo35282n();
        List y = b.mo35293y();
        cfjt.m139846c();
        mo35669a(eventParcel2, new AppMetadata(str, c, i, j, k, l, m, null, o, false, f, u, 0, 0, v, w, false, d, x, n, y));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(java.lang.String, int, boolean):java.lang.String
     arg types: [java.lang.String, int, int]
     candidates:
      agms.a(android.os.Bundle, java.lang.String, java.lang.Object):void
      agms.a(java.lang.String, int, java.lang.String):boolean
      agms.a(java.lang.String, java.lang.String[], java.lang.String):boolean
      agms.a(java.lang.String, int, boolean):java.lang.String */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35671a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        long j;
        int i;
        mo35694r();
        mo35695s();
        if (!m54515d(appMetadata)) {
            return;
        }
        if (!appMetadata.f80105h) {
            mo35674b(appMetadata);
            return;
        }
        int c = mo35692p().mo35746c(userAttributeParcel.f80139b);
        if (c != 0) {
            agms p = mo35692p();
            String str = userAttributeParcel.f80139b;
            mo35680d();
            String a = p.mo35727a(str, 24, true);
            String str2 = userAttributeParcel.f80139b;
            mo35692p().mo35732a(appMetadata.f80098a, c, "_ev", a, str2 != null ? str2.length() : 0);
            return;
        }
        int b = mo35692p().mo35744b(userAttributeParcel.f80139b, userAttributeParcel.mo44016a());
        if (b != 0) {
            agms p2 = mo35692p();
            String str3 = userAttributeParcel.f80139b;
            mo35680d();
            String a2 = p2.mo35727a(str3, 24, true);
            Object a3 = userAttributeParcel.mo44016a();
            if (a3 == null || (!(a3 instanceof String) && !(a3 instanceof CharSequence))) {
                i = 0;
            } else {
                i = String.valueOf(a3).length();
            }
            mo35692p().mo35732a(appMetadata.f80098a, b, "_ev", a2, i);
            return;
        }
        Object c2 = mo35692p().mo35747c(userAttributeParcel.f80139b, userAttributeParcel.mo44016a());
        if (c2 != null) {
            if ("_sid".equals(userAttributeParcel.f80139b)) {
                long j2 = userAttributeParcel.f80140c;
                String str4 = userAttributeParcel.f80143f;
                agmr c3 = mo35684h().mo35354c(appMetadata.f80098a, "_sno");
                if (c3 != null) {
                    Object obj = c3.f65975e;
                    if (obj instanceof Long) {
                        j = ((Long) obj).longValue();
                        mo35671a(new UserAttributeParcel("_sno", j2, Long.valueOf(j + 1), str4), appMetadata);
                    }
                }
                if (c3 != null) {
                    mo35497E().f65567f.mo35436a("Retrieved last session number from database does not contain a valid (long) value", c3.f65975e);
                }
                agdr a4 = mo35684h().mo35338a(appMetadata.f80098a, "_s");
                if (a4 != null) {
                    j = a4.f65332c;
                    mo35497E().f65572k.mo35436a("Backfill the session number. Last used session number", Long.valueOf(j));
                } else {
                    j = 0;
                }
                mo35671a(new UserAttributeParcel("_sno", j2, Long.valueOf(j + 1), str4), appMetadata);
            }
            agmr agmr = new agmr(appMetadata.f80098a, userAttributeParcel.f80143f, userAttributeParcel.f80139b, userAttributeParcel.f80140c, c2);
            mo35497E().f65572k.mo35437a("Setting user property", mo35689m().mo35426c(agmr.f65973c), c2);
            mo35684h().mo35352b();
            try {
                mo35674b(appMetadata);
                boolean a5 = mo35684h().mo35347a(agmr);
                mo35684h().mo35355c();
                if (!a5) {
                    mo35497E().f65564c.mo35437a("Too many unique user properties are set. Ignoring user property", mo35689m().mo35426c(agmr.f65973c), agmr.f65975e);
                    mo35692p().mo35732a(appMetadata.f80098a, 9, (String) null, (String) null, 0);
                }
            } finally {
                mo35684h().mo35358d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r8 == 429) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0118 A[Catch:{ all -> 0x0156, all -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128 A[Catch:{ all -> 0x0156, all -> 0x015f }] */
    /* renamed from: a */
    public final void mo35672a(String str, int i, Throwable th, byte[] bArr, Map map) {
        agdl h;
        List list;
        String str2;
        mo35694r();
        mo35695s();
        sdo.m34977c(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f65966u = false;
                mo35700x();
                throw th2;
            }
        }
        agib agib = mo35497E().f65572k;
        Integer valueOf = Integer.valueOf(bArr.length);
        agib.mo35436a("onConfigFetched. Response size", valueOf);
        mo35684h().mo35352b();
        agcv b = mo35684h().mo35349b(str);
        boolean z = (i == 200 || i == 204 || i == 304) ? th == null : false;
        if (b == null) {
            mo35497E().f65567f.mo35436a("App does not exist in onConfigFetched. appId", agid.m54288a(str));
            mo35684h().mo35355c();
            h = mo35684h();
        } else if (z || i == 404) {
            if (map != null) {
                list = (List) map.get("Last-Modified");
            } else {
                list = null;
            }
            if (list == null || list.size() <= 0) {
                str2 = null;
            } else {
                str2 = (String) list.get(0);
            }
            if (i != 404) {
                if (i != 304) {
                    if (!mo35682f().mo35477a(str, bArr, str2)) {
                        h = mo35684h();
                    }
                    b.mo35273h(mo35691o().mo20505a());
                    mo35684h().mo35342a(b);
                    if (i == 404) {
                        mo35497E().f65572k.mo35437a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                    } else {
                        mo35497E().f65569h.mo35436a("Config not found. Using empty config. appId", str);
                    }
                    if (mo35683g().mo35448c() || !mo35698v()) {
                        mo35699w();
                    } else {
                        mo35697u();
                    }
                    mo35684h().mo35355c();
                    h = mo35684h();
                }
            }
            if (mo35682f().mo35478b(str) == null) {
                if (!mo35682f().mo35477a(str, null, null)) {
                    h = mo35684h();
                }
            }
            b.mo35273h(mo35691o().mo20505a());
            mo35684h().mo35342a(b);
            if (i == 404) {
            }
            if (mo35683g().mo35448c()) {
            }
            mo35699w();
            mo35684h().mo35355c();
            h = mo35684h();
        } else {
            b.mo35276i(mo35691o().mo20505a());
            mo35684h().mo35342a(b);
            mo35497E().f65572k.mo35437a("Fetching config failed. code, error", Integer.valueOf(i), th);
            mo35682f().mo35480c(str);
            mo35681e().f65620e.mo35459a(mo35691o().mo20505a());
            if (i == 503) {
            }
            mo35681e().f65621f.mo35459a(mo35691o().mo20505a());
            mo35699w();
            mo35684h().mo35355c();
            h = mo35684h();
        }
        h.mo35358d();
        this.f65966u = false;
        mo35700x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35673a(long j) {
        return mo35678b((String) null, j);
    }
}

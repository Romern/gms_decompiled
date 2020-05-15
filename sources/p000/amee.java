package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SyncResult;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.plus.service.v2whitelisted.models.PeopleList;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: amee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amee {

    /* renamed from: x */
    private static final shc f74794x;

    /* renamed from: y */
    private static final shc f74795y;

    /* renamed from: a */
    public final almm f74796a;

    /* renamed from: b */
    public final String f74797b;

    /* renamed from: c */
    public final String f74798c;

    /* renamed from: d */
    public final ames f74799d;

    /* renamed from: e */
    public final almx f74800e;

    /* renamed from: f */
    public final boolean f74801f;

    /* renamed from: g */
    public bmza f74802g;

    /* renamed from: h */
    private final Context f74803h;

    /* renamed from: i */
    private final sqv f74804i;

    /* renamed from: j */
    private final SyncResult f74805j;

    /* renamed from: k */
    private final amry f74806k;

    /* renamed from: l */
    private final boolean f74807l;

    /* renamed from: m */
    private final boolean f74808m;

    /* renamed from: n */
    private final Bundle f74809n;

    /* renamed from: o */
    private final almq f74810o;

    /* renamed from: p */
    private final amph f74811p;

    /* renamed from: q */
    private final ampo f74812q;

    /* renamed from: r */
    private final aoiq f74813r;

    /* renamed from: s */
    private final boolean f74814s;

    /* renamed from: t */
    private final anbu f74815t;

    /* renamed from: u */
    private final boolean f74816u;

    /* renamed from: v */
    private final boolean f74817v;

    /* renamed from: w */
    private final int f74818w;

    static {
        shc shc = new shc();
        shc.mo25530a("etag");
        shc.mo25530a("id");
        shc.mo25530a("names");
        shc.mo25530a("images");
        shc.mo25530a("emails");
        shc.mo25530a("phoneNumbers");
        shc.mo25530a("addresses");
        shc.mo25530a("metadata/ownerId");
        shc.mo25530a("metadata/ownerUserTypes");
        shc.mo25530a("coverPhotos");
        f74794x = shc;
        shc shc2 = new shc();
        shc2.mo25530a("items(id,metadata)");
        shc2.mo25530a("nextPageToken");
        f74795y = shc2;
    }

    /* renamed from: a */
    private static int m62765a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return 4;
        }
        altq a = altq.m61806a(context);
        return a.f74248d.mo40743a("SELECT is_active_plus_account FROM owners WHERE _id=?", new String[]{altn.m61774a(a.f74246b).mo40739b(str, null)}, 0) != 1 ? 3 : 2;
    }

    /* renamed from: b */
    private final long m62772b() {
        return this.f74801f ? this.f74802g.mo66928a(TimeUnit.MILLISECONDS) : SystemClock.elapsedRealtime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        if (p000.cfxy.m143780b() == false) goto L_0x0053;
     */
    private amee(Context context, String str, String str2, int i, SyncResult syncResult, amry amry, almm almm, Bundle bundle, boolean z, boolean z2, boolean z3, bmxv bmxv) {
        Context applicationContext = context.getApplicationContext();
        this.f74803h = applicationContext;
        this.f74804i = ancm.m64005a(applicationContext);
        this.f74805j = syncResult;
        this.f74806k = amry;
        this.f74796a = almm;
        almm.f73751a = str;
        almm.f73754b = str2;
        this.f74818w = i;
        this.f74807l = z;
        this.f74808m = z2;
        this.f74809n = bundle;
        this.f74797b = str;
        this.f74798c = str2;
        amph a = almq.m61304a(this.f74803h, str, str2, m62766a(bundle));
        this.f74811p = a;
        ClientContext clientContext = a.f75659a;
        int i2 = i - 1;
        String str3 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str3 = "m";
                } else if (i2 == 8) {
                }
            }
            str3 = "t";
        } else {
            str3 = "p";
        }
        ampo.m63145a(clientContext, str3);
        this.f74799d = new ames(this.f74803h, str, str2);
        this.f74800e = almx.m61368a(this.f74803h);
        this.f74810o = almq.m61303a(this.f74803h, 5403);
        amig.m62939a();
        if (((Boolean) amhp.f74918a.mo41191a()).booleanValue() && bmxv.mo66813a()) {
            amdk.m62656a("PeopleSync", "Logging session id: %s", bmxv);
            ampn ampn = new ampn(this.f74810o.f73783a);
            ampn.f75687n = (String) bmxv.mo66814b();
            this.f74812q = ampn;
        } else {
            this.f74812q = this.f74810o.f73783a;
        }
        this.f74813r = new aoiq(this.f74812q);
        this.f74814s = z3;
        anbu a2 = anbv.f76601a.mo41674a(this.f74803h);
        this.f74815t = a2;
        almm.f73755c = a2.f76599b;
        almm.f73756d = a2.f76600c;
        amig.m62939a();
        this.f74816u = ((Boolean) amhe.f74907a.mo41191a()).booleanValue();
        this.f74817v = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83373bx()).booleanValue();
        boolean booleanValue = ((Boolean) amhd.f74906a.mo41191a()).booleanValue();
        this.f74801f = booleanValue;
        if (booleanValue) {
            this.f74802g = bmza.m108659b(bmvy.f131119a);
        }
    }

    /* renamed from: a */
    static final String m62766a(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("gms.people.request_app_id");
        } else {
            str = null;
        }
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83339bP()).booleanValue() && bundle != null && "gmail_setup_wizard".equals(bundle.getString("trigger_source"))) {
            return "221265091";
        }
        return TextUtils.isEmpty(str) ? "80" : str;
    }

    /* renamed from: a */
    private final void m62767a(amed amed, String str, String str2) {
        amdo amdo;
        ArrayList arrayList;
        String str3;
        int i;
        amdo amdo2;
        Boolean bool;
        amux amux;
        String str4;
        String str5;
        boolean z;
        amed amed2 = amed;
        String str6 = str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!TextUtils.isEmpty(str2)) {
            aluj.m61900a(this.f74803h, "PeopleSync", this.f74797b, this.f74798c, "Resume");
        }
        amig.m62939a();
        boolean booleanValue = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83337bN()).booleanValue();
        if (booleanValue) {
            amed.mo41153a();
        }
        mo41156a();
        aoiq aoiq = this.f74813r;
        amph amph = this.f74811p;
        if (cgbe.f186279a.mo6606a().mo83386cJ()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("gplusAutocomplete");
            arrayList2.add("chatAutocomplete");
            arrayList2.add("emailAutocomplete");
            if (cgbe.f186279a.mo6606a().mo83401cY()) {
                arrayList2.add("peopleAutocompleteSocial");
                arrayList2.add("fieldAutocompleteSocial");
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (cgbe.m144187p()) {
            str3 = "menagerie";
        } else {
            str3 = null;
        }
        if (alsh.m61647b(this.f74803h)) {
            i = (int) cgbe.f186279a.mo6606a().mo83392cP();
        } else {
            i = (int) cgbe.f186279a.mo6606a().mo83393cQ();
        }
        String c = ancm.m64014c(cgbe.f186279a.mo6606a().mo83444do());
        if (cgbe.f186279a.mo6606a().mo83413ck()) {
            anbu anbu = this.f74815t;
            if (anbu.f76599b) {
                amdo2 = amdo;
                if (((long) anbu.f76600c) >= cgbe.f186279a.mo6606a().mo83412cj()) {
                    z = false;
                    bool = Boolean.valueOf(z);
                }
            } else {
                amdo2 = amdo;
            }
            z = true;
            bool = Boolean.valueOf(z);
        } else {
            amdo2 = amdo;
            bool = null;
        }
        amdo2 = new amdo(aoiq, amph, arrayList, str3, i, c, str, bool);
        if (!this.f74814s) {
            amux = new amuy(amdo2, str6);
        } else {
            amux = new amuv(amdo2, str6);
        }
        do {
            mo41156a();
            long b = m62772b();
            try {
                PeopleList peopleList = (PeopleList) amux.mo41360a();
                long b2 = m62772b() - b;
                almm almm = this.f74796a;
                almm.f73731G += b2;
                if (this.f74801f) {
                    almm.f73738N += b2;
                }
                mo41156a();
                if (booleanValue) {
                    amee amee = amed2.f74793d;
                    long a = amee.f74801f ? amee.f74802g.mo66928a(TimeUnit.MILLISECONDS) : 0;
                    amed2.f74793d.f74799d.mo41177d();
                    try {
                        List list = peopleList.f83134c;
                        int a2 = amdx.m62690a(list);
                        for (int i2 = 0; i2 < a2; i2++) {
                            amed2.mo41154a((Person) list.get(i2));
                        }
                        amee amee2 = amed2.f74793d;
                        amee2.f74800e.mo40598a(amee2.f74797b, amee2.f74798c, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        amed2.f74793d.f74799d.mo41179f();
                        amed2.f74793d.f74799d.mo41178e();
                        amee amee3 = amed2.f74793d;
                        if (amee3.f74801f) {
                            amee3.f74796a.f73728D += amee3.f74802g.mo66928a(TimeUnit.MILLISECONDS) - a;
                        }
                        amed2.f74793d.mo41156a();
                    } catch (Throwable th) {
                        amed2.f74793d.f74799d.mo41178e();
                        amee amee4 = amed2.f74793d;
                        if (amee4.f74801f) {
                            amee4.f74796a.f73728D += amee4.f74802g.mo66928a(TimeUnit.MILLISECONDS) - a;
                        }
                        throw th;
                    }
                }
                str4 = peopleList.f83136e;
                str5 = peopleList.f83135d;
                if (isEmpty) {
                    this.f74799d.mo41169a("people_page", str5);
                    continue;
                }
            } catch (InterruptedException e) {
                throw new amrx();
            } catch (Throwable th2) {
                long b3 = m62772b() - b;
                almm almm2 = this.f74796a;
                almm2.f73731G += b3;
                if (this.f74801f) {
                    almm2.f73738N += b3;
                }
                throw th2;
            }
        } while (str5 != null);
        if (booleanValue) {
            amed.mo41155b();
            amed2.f74793d.f74799d.mo41169a("autocomplete", str4);
        }
    }

    /* renamed from: a */
    private final void m62768a(Context context) {
        if (cgay.m144135h()) {
            this.f74796a.f73753ab = almn.m61290a(context);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anbt.a(java.lang.String, boolean, android.content.Context):java.lang.String
     arg types: [java.lang.String, int, android.content.Context]
     candidates:
      anbt.a(java.lang.String, java.lang.String, java.lang.String):boolean
      anbt.a(java.lang.String, boolean, android.content.Context):java.lang.String */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amee.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      amee.a(java.lang.String, boolean):void
      amee.a(boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amee.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      amee.a(java.lang.String, boolean):void
      amee.a(boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amdk.a(java.lang.String, java.lang.String, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String, boolean, java.lang.Long]
     candidates:
      amdk.a(java.lang.String, java.lang.String, int, int):void
      amdk.a(java.lang.String, java.lang.String, java.lang.Object, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009a, code lost:
        r4 = r52;
        r1 = r0;
        r9 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03a1, code lost:
        if (r9 == p000.alot.f73983c) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0942, code lost:
        r2 = r1.f74796a;
        r3 = r1.f74799d;
        r2.f73743S = (int) r3.f74836c.mo40743a("SELECT count(1) FROM people WHERE owner_id=?", new java.lang.String[]{r3.f74837d}, 0);
        r2 = r1.f74796a;
        r3 = r1.f74799d;
        r2.f73744T = (int) r3.f74836c.mo40743a("SELECT count(1) FROM people WHERE owner_id=? AND gaia_id IS NOT NULL AND in_circle=1", new java.lang.String[]{r3.f74837d}, 0);
        r2 = r1.f74796a;
        r3 = r1.f74799d;
        r2.f73745U = (int) r3.f74836c.mo40743a("SELECT count(1) FROM people WHERE owner_id=? AND in_circle=0", new java.lang.String[]{r3.f74837d}, 0);
        r1.f74799d.mo41179f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:?, code lost:
        r1.f74799d.mo41178e();
        r2 = r1.f74796a;
        r2.f73742R++;
        r2.mo40525a();
        r2 = r1.f74796a;
        r3 = r2.f73744T;
        r3 = r2.f73743S;
        r3 = r2.f73746V;
        r2 = r2.f73748X;
        p000.almk.m61263a();
        r2 = p000.bpwf.m112345a(r1.f74818w - 1);
        r3 = r1.f74796a;
        p000.sdo.m34959a(r3);
        r4 = p000.bpwi.f139493h.mo74144da();
        r5 = p000.bpwg.f139467r.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x09ca, code lost:
        if (r5.f164950c != false) goto L_0x09cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x09cd, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x09d3, code lost:
        r6 = (p000.bpwg) r5.f164949b;
        r7 = r6.f139469a | 1;
        r6.f139469a = r7;
        r6.f139470b = true;
        r8 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x09e1, code lost:
        if (r2 == 0) goto L_0x0a8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x09e3, code lost:
        r6.f139471c = r8;
        r6.f139469a = r7 | 2;
        r2 = r3.mo40525a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x09f0, code lost:
        if (r5.f164950c != false) goto L_0x09f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x09f3, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x09f9, code lost:
        r6 = (p000.bpwg) r5.f164949b;
        r7 = r6.f139469a | 4;
        r6.f139469a = r7;
        r6.f139472d = r2;
        r2 = r3.f73745U;
        r8 = r3.f73747W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a09, code lost:
        if (r2 != r8) goto L_0x0a13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a0d, code lost:
        if (r3.f73749Y == 0) goto L_0x0a11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a0f, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a11, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0a13, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a14, code lost:
        r7 = r7 | 8;
        r6.f139469a = r7;
        r6.f139473e = r10;
        r10 = r3.f73743S;
        r7 = r7 | 16;
        r6.f139469a = r7;
        r6.f139474f = r10;
        r10 = r3.f73744T;
        r7 = r7 | 32;
        r6.f139469a = r7;
        r6.f139475g = r10;
        r7 = r7 | 64;
        r6.f139469a = r7;
        r6.f139476h = r2;
        r11 = r3.f73746V;
        r7 = r7 | 128;
        r6.f139469a = r7;
        r6.f139477i = r11;
        r7 = r7 | com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        r6.f139469a = r7;
        r6.f139478j = r8;
        r7 = r7 | 512;
        r6.f139469a = r7;
        r6.f139479k = r10 - r11;
        r7 = r7 | 1024;
        r6.f139469a = r7;
        r6.f139480l = r2 - r8;
        r2 = r3.f73748X;
        r7 = r7 | 2048;
        r6.f139469a = r7;
        r6.f139481m = r2;
        r2 = r3.f73749Y;
        r7 = r7 | 4096;
        r6.f139469a = r7;
        r6.f139482n = r2;
        r2 = r3.f73759g;
        r6.f139469a = r7 | 8192;
        r6.f139483o = r2;
        r2 = (p000.bpwg) r5.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a6d, code lost:
        if (r4.f164950c != false) goto L_0x0a70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a70, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a76, code lost:
        r3 = (p000.bpwi) r4.f164949b;
        r2.getClass();
        r3.f139498d = r2;
        r3.f139495a |= 4;
        p000.alml.m61287a((p000.bpwi) r4.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0a91, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0c6c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0c6d, code lost:
        r4 = r52;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03bb A[Catch:{ all -> 0x04ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0431 A[Catch:{ all -> 0x0496, all -> 0x04fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x046f A[Catch:{ all -> 0x0496, all -> 0x04fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0475 A[Catch:{ all -> 0x0496, all -> 0x04fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04a9 A[Catch:{ amrx -> 0x0526, all -> 0x051a }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04e4 A[Catch:{ all -> 0x0496, all -> 0x04fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x04ed A[Catch:{ all -> 0x0496, all -> 0x04fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0509 A[Catch:{ amrx -> 0x0526, all -> 0x051a }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0561 A[Catch:{ amrx -> 0x0c05, all -> 0x0bfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0565 A[Catch:{ amrx -> 0x0c05, all -> 0x0bfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x05e0  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0625 A[SYNTHETIC, Splitter:B:345:0x0625] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x06ad  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x06e8 A[SYNTHETIC, Splitter:B:386:0x06e8] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0766 A[SYNTHETIC, Splitter:B:405:0x0766] */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0abc A[Catch:{ sid -> 0x0b49, all -> 0x0c6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0ac0 A[Catch:{ sid -> 0x0b49, all -> 0x0c6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0b35  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0b3e  */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x0b9a A[SYNTHETIC, Splitter:B:554:0x0b9a] */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x0c3d A[Catch:{ sid -> 0x0c6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0c6c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:19:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:620:0x0c9d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0177 A[Catch:{ all -> 0x016e, amrx -> 0x0547, all -> 0x053c }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:246:0x0490=Splitter:B:246:0x0490, B:261:0x04c4=Splitter:B:261:0x04c4} */
    /* renamed from: a */
    public static void m62769a(Context context, String str, String str2, int i, SyncResult syncResult, amry amry, almm almm, Bundle bundle, boolean z, boolean z2, boolean z3, bmxv bmxv) {
        String str3;
        almm almm2;
        long j;
        boolean z4;
        long j2;
        String str4;
        Throwable th;
        amee amee;
        amrx amrx;
        long j3;
        long j4;
        almm almm3;
        String str5;
        almm almm4;
        long j5;
        almm almm5;
        long j6;
        String str6;
        long j7;
        String str7;
        String str8;
        almm almm6;
        String str9;
        boolean z5;
        long j8;
        almm almm7;
        boolean z6;
        String str10;
        String str11;
        String str12;
        String str13;
        Throwable th2;
        boolean z7;
        almm almm8;
        String str14;
        String str15;
        String str16;
        int i2;
        Cursor a;
        almm almm9;
        String str17;
        almm almm10;
        String str18;
        int i3;
        almm almm11;
        Throwable th3;
        String str19;
        VolleyError volleyError;
        NetworkResponse networkResponse;
        String str20;
        boolean z8;
        Throwable th4;
        amee amee2;
        Person person;
        almm almm12;
        Throwable th5;
        boolean z9;
        String str21;
        String str22;
        byte[] bArr;
        NetworkResponse networkResponse2;
        String str23;
        byte[] bArr2;
        String str24;
        almm almm13;
        alto alto;
        String[] strArr;
        boolean z10;
        String str25;
        Cursor a2;
        boolean z11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        amee amee3 = r8;
        String str26 = "ac_index";
        String str27 = "PeopleSync";
        String str28 = "ac_people";
        String str29 = "ac_container";
        String str30 = "Sync finished, successful=%b, took %d ms";
        String str31 = "ac_item";
        amee amee4 = new amee(context, str, str2, i, syncResult, amry, almm, bundle, z, z2, z3, bmxv);
        try {
            if (amee3.f74807l) {
                sdo.m34975b(TextUtils.isEmpty(amee3.f74798c), "isPageExistenceCheckOnly=true is not used with pages");
            }
            amdk.m62657a(str27, "Sync start: cannotHavePeople=%b isPageExistenceCheckOnly=%b", Boolean.valueOf(amee3.f74808m), Boolean.valueOf(amee3.f74807l));
            long a3 = amee3.f74804i.mo20505a();
            amig.m62939a();
            boolean z12 = true;
            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83354be()).booleanValue()) {
                try {
                    almm almm14 = amee3.f74796a;
                    if (amee3.f74799d.mo41172b() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    almm14.f73760h = z11;
                } catch (sid e) {
                    e = e;
                    almm2 = almm;
                    sid sid = e;
                    try {
                        try {
                            aluj.m61902a(context, str3, (String) null, "Cancelled in volley", sid);
                            throw new amrx();
                        } catch (Throwable th6) {
                            th = th6;
                            Throwable th7 = th;
                            amig.m62939a();
                            if (((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                            }
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        Throwable th72 = th;
                        amig.m62939a();
                        if (((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                        }
                        throw th72;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    almm2 = almm;
                    Throwable th722 = th;
                    amig.m62939a();
                    if (((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                        almm2.f73750Z = m62765a(context, str, str2);
                    }
                    throw th722;
                }
            }
            try {
                Context context2 = amee3.f74803h;
                if (cgay.m144135h()) {
                    amee3.f74796a.f73752aa = almn.m61290a(context2);
                }
                Context context3 = amee3.f74803h;
                String str32 = amee3.f74797b;
                if (cgay.m144134g()) {
                    amee3.f74796a.f73739O = altq.m61806a(context3).mo40761a(str32);
                }
                if (cgay.m144132e()) {
                    j = a3;
                    amee3.f74796a.f73740P = altq.m61806a(context3).mo40767c(str32, "last_full_people_sync_time");
                } else {
                    j = a3;
                }
                if (cgay.m144133f()) {
                    alsj a4 = alsj.m61651a(context3);
                    almm almm15 = amee3.f74796a;
                    SharedPreferences sharedPreferences = a4.f74200a;
                    String valueOf = String.valueOf(str32);
                    almm15.f73741Q = sharedPreferences.getLong(valueOf.length() == 0 ? new String("menagerie_last_successful_periodic_sync_timestamp_") : "menagerie_last_successful_periodic_sync_timestamp_".concat(valueOf), 0);
                }
                try {
                    if (amee3.f74807l) {
                        j6 = j;
                    } else {
                        j6 = j;
                        try {
                            amee3.f74799d.mo41171a(false, j6, null);
                            amee3.f74800e.mo40598a(amee3.f74797b, amee3.f74798c, 16);
                            amee3.f74800e.mo40599b();
                        } catch (amrx e2) {
                            e = e2;
                            almm4 = almm;
                            j4 = j6;
                            amee = amee3;
                            str3 = str27;
                            str5 = str30;
                            z4 = true;
                            amrx = e;
                            try {
                                throw amrx;
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            almm5 = almm;
                            j5 = j6;
                            amee = amee3;
                            str3 = str27;
                            str4 = str30;
                            th = th;
                            z4 = false;
                            try {
                                long a5 = amee.f74804i.mo20505a();
                                if (!amee.f74807l) {
                                }
                                amdk.m62657a(str3, str4, (Object) false, (Object) Long.valueOf(a5 - j2));
                                amee.m62768a(amee.f74803h);
                                throw th;
                            } catch (sid e3) {
                                e = e3;
                                sid sid2 = e;
                                aluj.m61902a(context, str3, (String) null, "Cancelled in volley", sid2);
                                throw new amrx();
                            }
                        }
                    }
                    amee3.mo41156a();
                    amee3.mo41156a();
                    if (amee3.f74798c == null) {
                        try {
                            if (amee3.f74807l) {
                                altn a6 = altn.m61774a(amee3.f74803h);
                                String str33 = amee3.f74797b;
                                String str34 = (String) a6.f74227c.get(str33);
                                if (str34 == null) {
                                    alto b = a6.f74225a.mo40763b();
                                    if (b != null) {
                                        a2 = b.mo40744a("SELECT gaia_id FROM owners WHERE (account_name = ?1) AND (page_gaia_id IS NULL)", new String[]{str33});
                                        if (a2.moveToFirst()) {
                                            str25 = a2.getString(0);
                                            a2.close();
                                            if (str25 != null) {
                                                a6.f74227c.put(str33, str25);
                                            }
                                            str34 = str25;
                                        } else {
                                            a2.close();
                                        }
                                    }
                                    str25 = null;
                                    if (str25 != null) {
                                    }
                                    str34 = str25;
                                }
                                if (!TextUtils.isEmpty(str34)) {
                                    str6 = "menagerie_last_successful_periodic_sync_timestamp_";
                                    j7 = j6;
                                    str8 = "last_full_people_sync_time";
                                    amee = amee3;
                                    str7 = str27;
                                }
                            }
                            amig.m62939a();
                            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83340bQ()).booleanValue()) {
                                if (amee3.f74798c == null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                sdo.m34970a(z8);
                                amee3.mo41156a();
                                long b2 = amee3.m62772b();
                                try {
                                    if (amee3.f74817v) {
                                        try {
                                            almm13 = amee3.f74796a;
                                            ames ames = amee3.f74799d;
                                            ames.f74836c.mo40755f();
                                            sdo.m34977c("me");
                                            alto = ames.f74836c;
                                            strArr = new String[]{ames.f74837d, "me%"};
                                            amee2 = amee3;
                                        } catch (Throwable th12) {
                                            th4 = th12;
                                            j7 = j6;
                                            amee = amee3;
                                            str7 = str27;
                                            if (amee.f74801f) {
                                            }
                                            throw th4;
                                        }
                                        try {
                                            if (alto.mo40743a("SELECT COUNT(1) FROM sync_tokens WHERE owner_id = ? AND name LIKE ? ", strArr, 0) != 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            almm13.f73761i = !z10;
                                        } catch (Throwable th13) {
                                            th4 = th13;
                                            amee = amee2;
                                            j7 = j6;
                                            str7 = str27;
                                            if (amee.f74801f) {
                                            }
                                            throw th4;
                                        }
                                    } else {
                                        amee2 = amee3;
                                    }
                                    amee = amee2;
                                    try {
                                        aoiq aoiq = amee.f74813r;
                                        ClientContext clientContext = amee.f74811p.f75659a;
                                        List asList = Arrays.asList("disabled", "blocked");
                                        shc shc = f74794x;
                                        StringBuilder sb = new StringBuilder();
                                        j7 = j6;
                                        try {
                                            str6 = "menagerie_last_successful_periodic_sync_timestamp_";
                                            new Formatter(sb).format("people/%1$s", shd.m35267a("me"));
                                            if (shc != null) {
                                                shc.mo25531a(sb);
                                            }
                                            shd.m35269a(sb, "includeLinkedPeople", String.valueOf((Object) false));
                                            if (asList != null) {
                                                shd.m35269a(sb, "includeProfilesWithState", TextUtils.join("&includeProfilesWithState=", asList));
                                            }
                                            str7 = null;
                                            person = (Person) aoiq.f78352a.mo25536a(clientContext, 0, sb.toString(), (Object) null, Person.class);
                                            long b3 = amee.m62772b() - b2;
                                            almm12 = amee.f74796a;
                                            almm12.f73731G += b3;
                                            if (amee.f74801f) {
                                                try {
                                                    almm12.f73732H += b3;
                                                } catch (VolleyError e4) {
                                                    VolleyError volleyError2 = e4;
                                                    if (!ancc.m63972a(volleyError2)) {
                                                        Object[] objArr = new Object[3];
                                                        objArr[0] = str23;
                                                        objArr[1] = volleyError2.getMessage();
                                                        NetworkResponse networkResponse3 = volleyError2.networkResponse;
                                                        if (networkResponse3 != null) {
                                                            str24 = String.valueOf(networkResponse3.statusCode);
                                                        } else {
                                                            str24 = str21;
                                                        }
                                                        objArr[2] = str24;
                                                        amdk.m62659b("PeopleIS", "Error retrieving image at URL %s: %s [%s]", objArr);
                                                        bArr2 = alot.f73984d;
                                                    } else {
                                                        bArr2 = alot.f73983c;
                                                    }
                                                } catch (Throwable th14) {
                                                    th4 = th14;
                                                }
                                            }
                                        } catch (Throwable th15) {
                                            th = th15;
                                            Throwable th16 = th;
                                            long b4 = amee.m62772b() - b2;
                                            almm almm16 = amee.f74796a;
                                            almm16.f73731G += b4;
                                            if (amee.f74801f) {
                                                almm16.f73732H += b4;
                                            }
                                            if (amee.f74816u) {
                                                almm16.f73773u.put(1, 0);
                                                amee.f74796a.f73774v.put(1, 0);
                                            }
                                            throw th16;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                        Throwable th162 = th;
                                        long b42 = amee.m62772b() - b2;
                                        almm almm162 = amee.f74796a;
                                        almm162.f73731G += b42;
                                        if (amee.f74801f) {
                                        }
                                        if (amee.f74816u) {
                                        }
                                        throw th162;
                                    }
                                    try {
                                        if (amee.f74816u) {
                                            almm12.f73773u.put(1, 1);
                                            amee.f74796a.f73774v.put(1, 1);
                                        }
                                        amee.mo41156a();
                                        amee.f74799d.mo41177d();
                                        String a7 = amee.f74799d.mo41166a("me");
                                        if (amee.f74816u) {
                                            try {
                                                if (!TextUtils.isEmpty(a7)) {
                                                    amee.f74796a.f73772t.put(1, a7);
                                                }
                                            } catch (Throwable th18) {
                                                th5 = th18;
                                                str7 = str27;
                                                amee.f74799d.mo41178e();
                                                throw th5;
                                            }
                                        }
                                        try {
                                            if (!person.f83162k.equals(a7)) {
                                                amee.f74799d.mo41167a(person);
                                                amee.f74805j.stats.numUpdates++;
                                                if (amee.f74817v) {
                                                    amee.f74796a.f73762j++;
                                                }
                                                amee.f74800e.mo40598a(amee.f74797b, amee.f74798c, 1);
                                                amee.f74799d.mo41169a("me", person.f83162k);
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            amee.f74799d.mo41179f();
                                            amee.f74799d.mo41178e();
                                            amee.mo41156a();
                                            if (!amee.f74807l) {
                                                amdm a8 = amdm.m62661a(amee.f74803h);
                                                String str35 = amee.f74797b;
                                                sdo.m34959a(person);
                                                sdo.m34959a((Object) str35);
                                                Person.Images c = amdx.m62700c(person);
                                                if (c == null) {
                                                    str21 = "none";
                                                } else if (!c.mo46740b() || c.f83274b) {
                                                    str21 = "none";
                                                } else {
                                                    str23 = c.f83277e;
                                                    str21 = "none";
                                                    if (!a8.f74748b.mo41671a(str35, (String) null, ancc.m63969a(str23))) {
                                                        almy a9 = almy.m61373a(a8.f74747a);
                                                        bmxy.m108581a(str23);
                                                        bArr2 = a9.mo40600a(anbt.m63942a(str23, false, a9.f73813a));
                                                        if (bArr2 != null && bArr2 != alot.f73983c && bArr2 != alot.f73984d) {
                                                            try {
                                                                a8.f74748b.mo41670a(str35, (String) null, ancc.m63969a(str23), bArr2);
                                                            } catch (RuntimeException e5) {
                                                                Log.w("AvatarSyncManager", "updateAvatarImage threw an exception.", e5);
                                                            }
                                                        }
                                                    }
                                                    if (cgav.f186252a.mo6606a().mo83200d()) {
                                                        amdn a10 = amdn.m62665a(amee.f74803h);
                                                        String str36 = amee.f74797b;
                                                        sdo.m34959a((Object) str36);
                                                        a10.mo41125a();
                                                        ames ames2 = new ames(a10.f74750a, str36, null);
                                                        if (TextUtils.isEmpty(null)) {
                                                            str22 = ames2.mo41174c();
                                                        } else {
                                                            str22 = ames2.mo41175c(null);
                                                        }
                                                        if (!TextUtils.isEmpty(str22)) {
                                                            String b5 = ancc.m63973b(str22);
                                                            int a11 = alsh.m61646a(a10.f74750a);
                                                            str8 = "last_full_people_sync_time";
                                                            if (!a10.f74751b.mo41702a(str36, null, amdn.m62666a(b5), a11)) {
                                                                String a12 = ancc.m63970a(b5, a11);
                                                                almy a13 = almy.m61373a(a10.f74750a);
                                                                bmxy.m108581a(a12);
                                                                try {
                                                                    str7 = str27;
                                                                    try {
                                                                        bArr = a13.f73814b.mo25542a(a13.f73813a, (Uri) null, a12);
                                                                    } catch (VolleyError e6) {
                                                                        e = e6;
                                                                        VolleyError volleyError3 = e;
                                                                        try {
                                                                            Object[] objArr2 = new Object[3];
                                                                            objArr2[0] = a12;
                                                                            objArr2[1] = volleyError3.getMessage();
                                                                            networkResponse2 = volleyError3.networkResponse;
                                                                            if (networkResponse2 != null) {
                                                                            }
                                                                            objArr2[2] = str21;
                                                                            amdk.m62659b("PeopleIS", "Error retrieving image at URL %s: %s [%s]", objArr2);
                                                                            bArr = alot.f73984d;
                                                                            a10.f74751b.mo41700a(str36, null, amdn.m62666a(b5), bArr, a11);
                                                                            if (!z9) {
                                                                            }
                                                                            amee.mo41156a();
                                                                            if (amee.f74801f) {
                                                                            }
                                                                            z12 = amdx.m62695a(person);
                                                                            if (amee.f74807l) {
                                                                            }
                                                                            long a14 = amee.f74804i.mo20505a();
                                                                            if (!amee.f74807l) {
                                                                            }
                                                                            amdk.m62657a(str3, str30, Boolean.valueOf(z5), Long.valueOf(a14 - j8));
                                                                            amee.m62768a(amee.f74803h);
                                                                            amig.m62939a();
                                                                            if (!((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                                                                            }
                                                                            almm7.f73775w = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                                        } catch (Throwable th19) {
                                                                            th = th19;
                                                                            th4 = th;
                                                                            if (amee.f74801f) {
                                                                                amee.f74796a.f73776x += amee.f74802g.mo66928a(TimeUnit.MILLISECONDS) - b2;
                                                                            }
                                                                            throw th4;
                                                                        }
                                                                    }
                                                                } catch (VolleyError e7) {
                                                                    e = e7;
                                                                    str7 = str27;
                                                                    VolleyError volleyError32 = e;
                                                                    Object[] objArr22 = new Object[3];
                                                                    objArr22[0] = a12;
                                                                    objArr22[1] = volleyError32.getMessage();
                                                                    networkResponse2 = volleyError32.networkResponse;
                                                                    if (networkResponse2 != null) {
                                                                        str21 = String.valueOf(networkResponse2.statusCode);
                                                                    }
                                                                    objArr22[2] = str21;
                                                                    amdk.m62659b("PeopleIS", "Error retrieving image at URL %s: %s [%s]", objArr22);
                                                                    bArr = alot.f73984d;
                                                                    a10.f74751b.mo41700a(str36, null, amdn.m62666a(b5), bArr, a11);
                                                                    if (!z9) {
                                                                    }
                                                                    amee.mo41156a();
                                                                    if (amee.f74801f) {
                                                                    }
                                                                    z12 = amdx.m62695a(person);
                                                                    if (amee.f74807l) {
                                                                    }
                                                                    long a142 = amee.f74804i.mo20505a();
                                                                    if (!amee.f74807l) {
                                                                    }
                                                                    amdk.m62657a(str3, str30, Boolean.valueOf(z5), Long.valueOf(a142 - j8));
                                                                    amee.m62768a(amee.f74803h);
                                                                    amig.m62939a();
                                                                    if (!((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                                                                    }
                                                                    almm7.f73775w = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                                }
                                                                if (!(bArr == null || bArr == alot.f73983c || bArr == alot.f73984d)) {
                                                                    a10.f74751b.mo41700a(str36, null, amdn.m62666a(b5), bArr, a11);
                                                                }
                                                            } else {
                                                                str7 = str27;
                                                            }
                                                        } else {
                                                            str8 = "last_full_people_sync_time";
                                                            str7 = str27;
                                                            a10.f74751b.mo41701a(str36, null);
                                                        }
                                                    } else {
                                                        str8 = "last_full_people_sync_time";
                                                        str7 = str27;
                                                    }
                                                    if (!z9) {
                                                        amee.f74799d.mo41177d();
                                                        amee.f74799d.mo41167a(person);
                                                        amee.f74799d.mo41179f();
                                                        if (amee.f74817v) {
                                                            amee.f74796a.f73762j++;
                                                        }
                                                        amee.f74799d.mo41178e();
                                                    }
                                                }
                                                a8.f74748b.mo41669a(str35, null);
                                                if (cgav.f186252a.mo6606a().mo83200d()) {
                                                }
                                                if (!z9) {
                                                }
                                            } else {
                                                str8 = "last_full_people_sync_time";
                                                str7 = str27;
                                            }
                                            amee.mo41156a();
                                        } catch (Throwable th20) {
                                            str7 = str27;
                                            th5 = th20;
                                            amee.f74799d.mo41178e();
                                            throw th5;
                                        }
                                        try {
                                            if (amee.f74801f) {
                                                amee.f74796a.f73776x += amee.f74802g.mo66928a(TimeUnit.MILLISECONDS) - b2;
                                            }
                                            z12 = amdx.m62695a(person);
                                        } catch (amrx e8) {
                                            almm9 = almm;
                                            amrx = e8;
                                            str17 = str30;
                                            str3 = str7;
                                            j2 = j7;
                                            z4 = true;
                                            throw amrx;
                                        } catch (Throwable th21) {
                                            almm10 = almm;
                                            th = th21;
                                            str18 = str30;
                                            str3 = str7;
                                            j3 = j7;
                                            z4 = false;
                                            long a52 = amee.f74804i.mo20505a();
                                            if (!amee.f74807l) {
                                            }
                                            amdk.m62657a(str3, str4, (Object) false, (Object) Long.valueOf(a52 - j2));
                                            amee.m62768a(amee.f74803h);
                                            throw th;
                                        }
                                    } catch (Throwable th22) {
                                        th = th22;
                                        str7 = str27;
                                        th4 = th;
                                        if (amee.f74801f) {
                                        }
                                        throw th4;
                                    }
                                } catch (Throwable th23) {
                                    th = th23;
                                    j7 = j6;
                                    amee = amee3;
                                    str7 = str27;
                                    th4 = th;
                                    if (amee.f74801f) {
                                    }
                                    throw th4;
                                }
                            } else {
                                str6 = "menagerie_last_successful_periodic_sync_timestamp_";
                                j7 = j6;
                                str8 = "last_full_people_sync_time";
                                amee = amee3;
                                str7 = str27;
                                z12 = false;
                            }
                        } catch (amrx e9) {
                            almm9 = almm;
                            amrx = e9;
                            j2 = j6;
                            amee = amee3;
                            str3 = str27;
                            str17 = str30;
                            z4 = true;
                            throw amrx;
                        } catch (Throwable th24) {
                            almm2 = almm;
                            th = th24;
                            j3 = j6;
                            amee = amee3;
                            str3 = str27;
                            str4 = str30;
                            z4 = false;
                            long a522 = amee.f74804i.mo20505a();
                            if (!amee.f74807l) {
                            }
                            amdk.m62657a(str3, str4, (Object) false, (Object) Long.valueOf(a522 - j2));
                            amee.m62768a(amee.f74803h);
                            throw th;
                        }
                    } else {
                        str6 = "menagerie_last_successful_periodic_sync_timestamp_";
                        j7 = j6;
                        str8 = "last_full_people_sync_time";
                        amee = amee3;
                        str7 = str27;
                        z12 = true;
                    }
                    try {
                        if (amee.f74807l) {
                            str3 = str7;
                        } else {
                            if (amee.f74808m) {
                                z6 = false;
                            } else {
                                z6 = z12;
                            }
                            amig.m62939a();
                            try {
                                ames ames3 = amee.f74799d;
                                if (cgbe.f186279a.mo6606a().mo83305ai()) {
                                    if (ames3.f74834a.mo20505a() - ames3.f74836c.mo40743a("SELECT last_full_people_sync_time FROM owners WHERE _id=?", new String[]{ames3.f74837d}, -1) > cgbe.f186279a.mo6606a().mo83411ci() * 1000) {
                                        str3 = str7;
                                        try {
                                            aluj.m61900a(amee.f74803h, str3, amee.f74797b, amee.f74798c, "Periodic full sync");
                                            str20 = null;
                                            amee.m62770a(str20, z6);
                                            z7 = str20 != null;
                                        } catch (VolleyError e10) {
                                            e = e10;
                                            volleyError = e;
                                            try {
                                                networkResponse = volleyError.networkResponse;
                                                if (networkResponse == null) {
                                                }
                                                almm2 = almm;
                                                str12 = str26;
                                                str10 = str28;
                                                str11 = str29;
                                                str4 = str30;
                                                str13 = str31;
                                                j3 = j7;
                                                z4 = true;
                                                try {
                                                    throw volleyError;
                                                } catch (Throwable th25) {
                                                    th = th25;
                                                }
                                            } catch (Throwable th26) {
                                                th = th26;
                                                almm2 = almm;
                                                str12 = str26;
                                                str10 = str28;
                                                str11 = str29;
                                                str4 = str30;
                                                str13 = str31;
                                                j3 = j7;
                                                z4 = true;
                                                th2 = th;
                                                z7 = false;
                                                if (z7) {
                                                }
                                                throw th2;
                                            }
                                        } catch (Throwable th27) {
                                            th = th27;
                                            almm2 = almm;
                                            th2 = th;
                                            str12 = str26;
                                            str10 = str28;
                                            str11 = str29;
                                            str4 = str30;
                                            str13 = str31;
                                            j3 = j7;
                                            z4 = true;
                                            z7 = false;
                                            if (z7) {
                                            }
                                            throw th2;
                                        }
                                        if (z7) {
                                            try {
                                                long a15 = amee.f74804i.mo20505a();
                                                ames ames4 = amee.f74799d;
                                                ContentValues a16 = ames4.mo41165a();
                                                a16.put(str8, Long.valueOf(a15));
                                                ames4.f74836c.mo40740a("owners", a16, "_id = ?", new String[]{ames4.f74837d});
                                            } catch (Throwable th28) {
                                                almm11 = almm;
                                                th3 = th28;
                                                str19 = str26;
                                                str15 = str28;
                                            }
                                        }
                                        if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83288aR()).booleanValue()) {
                                            str15 = str28;
                                        } else {
                                            if (!z7) {
                                                if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83289aS()).booleanValue()) {
                                                    str15 = str28;
                                                }
                                            }
                                            str15 = str28;
                                            try {
                                                amee.f74799d.mo41170a(str15, "owners", "owner_id", "_id");
                                            } catch (Throwable th29) {
                                                th = th29;
                                                almm8 = almm;
                                                str14 = str26;
                                                str11 = str29;
                                                str4 = str30;
                                                str13 = str31;
                                                j3 = j7;
                                                z4 = true;
                                                th2 = th;
                                                if (z7) {
                                                }
                                                throw th2;
                                            }
                                        }
                                        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83286aP()).booleanValue()) {
                                            if (!z7) {
                                                try {
                                                    if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83287aQ()).booleanValue()) {
                                                        str16 = str29;
                                                    }
                                                } catch (Throwable th30) {
                                                    almm11 = almm;
                                                    th3 = th30;
                                                    str19 = str26;
                                                    str16 = str29;
                                                    str4 = str30;
                                                    str13 = str31;
                                                    j3 = j7;
                                                    z4 = true;
                                                    if (z7) {
                                                    }
                                                    throw th2;
                                                }
                                            }
                                            try {
                                                str16 = str29;
                                                try {
                                                    amee.f74799d.mo41170a(str16, str15, "people_id", "_id");
                                                } catch (Throwable th31) {
                                                    th = th31;
                                                }
                                            } catch (Throwable th32) {
                                                th = th32;
                                                str16 = str29;
                                                almm11 = almm;
                                                th3 = th;
                                                str19 = str26;
                                                str4 = str30;
                                                str13 = str31;
                                                j3 = j7;
                                                z4 = true;
                                                if (z7) {
                                                }
                                                throw th2;
                                            }
                                        } else {
                                            str16 = str29;
                                        }
                                        if (z7) {
                                            try {
                                                if (((Boolean) amha.f74903a.mo41191a()).booleanValue()) {
                                                    if (ancm.f76635f.nextDouble() < ((Double) amhc.f74905a.mo41191a()).doubleValue()) {
                                                        altq a17 = altq.m61806a(amee.f74803h);
                                                        if (((Boolean) amhb.f74904a.mo41191a()).booleanValue()) {
                                                            i3 = a17.mo40772f();
                                                        } else {
                                                            i3 = 0;
                                                        }
                                                        almk.m61263a().mo40513a(a17.mo40766c(str15), a17.mo40766c(str16), a17.mo40766c(str31), a17.mo40766c(str26), a17.mo40771e(), i3);
                                                    }
                                                }
                                            } catch (amrx e11) {
                                                almm9 = almm;
                                                amrx = e11;
                                                str17 = str30;
                                                j2 = j7;
                                                z4 = true;
                                                throw amrx;
                                            } catch (Throwable th33) {
                                                almm10 = almm;
                                                th = th33;
                                                str18 = str30;
                                                j3 = j7;
                                                z4 = false;
                                                long a5222 = amee.f74804i.mo20505a();
                                                if (!amee.f74807l) {
                                                }
                                                amdk.m62657a(str3, str4, (Object) false, (Object) Long.valueOf(a5222 - j2));
                                                amee.m62768a(amee.f74803h);
                                                throw th;
                                            }
                                        }
                                        if (amee.f74799d.mo41172b() != 0) {
                                            alsj a18 = alsj.m61651a(amee.f74803h);
                                            long j9 = a18.f74200a.getLong(alsj.m61652a(amee.f74797b, amee.f74798c), 0);
                                            long cW = cgbe.f186279a.mo6606a().mo83399cW();
                                            long a19 = amee.f74804i.mo20505a();
                                            Long.signum(cW);
                                            if (a19 >= j9 + (cW * 1000)) {
                                                String str37 = amee.f74797b;
                                                String str38 = amee.f74798c;
                                                sdo.m34973b((String) null);
                                                a18.f74200a.edit().putLong(alsj.m61652a(str37, str38), a19).commit();
                                                if (((double) ancm.f76635f.nextFloat()) < cgbe.f186279a.mo6606a().mo83400cX()) {
                                                    amee.f74799d.mo41177d();
                                                    String str39 = null;
                                                    while (true) {
                                                        amee.mo41156a();
                                                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                                        try {
                                                            aoiq aoiq2 = amee.f74813r;
                                                            ClientContext clientContext2 = amee.f74811p.f75659a;
                                                            if (alsh.m61647b(amee.f74803h)) {
                                                                i2 = (int) cgbe.f186279a.mo6606a().mo83394cR();
                                                            } else {
                                                                i2 = (int) cgbe.f186279a.mo6606a().mo83395cS();
                                                            }
                                                            PeopleList a20 = aoiq2.mo42823a(clientContext2, "me", "all", null, false, null, false, Integer.valueOf(i2), amee.f74811p.f75660b, null, str39, null, f74795y);
                                                            amee.f74796a.f73731G += SystemClock.elapsedRealtime() - elapsedRealtime2;
                                                            amee.mo41156a();
                                                            List list = a20.f83134c;
                                                            int a21 = amdx.m62690a(list);
                                                            for (int i4 = 0; i4 < a21; i4++) {
                                                                ames ames5 = amee.f74799d;
                                                                Person person2 = (Person) list.get(i4);
                                                                almm almm17 = amee.f74796a;
                                                                String m = amdx.m62711m(person2);
                                                                if (amdx.m62704f(person2)) {
                                                                    if (ames.m62811b(person2)) {
                                                                        almm17.f73746V++;
                                                                    } else {
                                                                        almm17.f73747W++;
                                                                    }
                                                                    if (ames5.f74840g == null) {
                                                                        ames5.f74840g = new HashSet();
                                                                    }
                                                                    if (ames5.f74841h == null) {
                                                                        ames5.f74841h = new HashSet();
                                                                    }
                                                                    ames5.f74840g.clear();
                                                                    ames5.f74841h.clear();
                                                                    Person.Metadata metadata = person2.f83175x;
                                                                    if (metadata != null) {
                                                                        List list2 = metadata.f83309f;
                                                                        int a22 = amdx.m62690a(list2);
                                                                        for (int i5 = 0; i5 < a22; i5++) {
                                                                            ames5.f74840g.add((String) list2.get(i5));
                                                                        }
                                                                    }
                                                                    a = ames5.f74836c.mo40744a("SELECT circle_id FROM circle_members WHERE owner_id=?  AND qualified_id=?", new String[]{ames5.f74837d, ancm.m64017f(m)});
                                                                    while (a.moveToNext()) {
                                                                        ames5.f74841h.add(a.getString(0));
                                                                    }
                                                                    a.close();
                                                                    String o = amdx.m62713o(person2);
                                                                    if (o == null) {
                                                                        String valueOf2 = String.valueOf(person2.f83167p);
                                                                        throw new amdy(valueOf2.length() == 0 ? new String("Unable to get qualifed ID.  v2id=") : "Unable to get qualifed ID.  v2id=".concat(valueOf2));
                                                                    }
                                                                    if (ames5.f74840g.equals(ames5.f74841h)) {
                                                                        altq altq = ames5.f74835b;
                                                                        String str40 = ames5.f74838e;
                                                                        sdo.m34977c(str40);
                                                                        ancm.m64006a(o, "qualifiedId");
                                                                        if (altq.mo40763b().mo40749b("SELECT count(1) FROM people WHERE owner_id=? AND qualified_id=?", new String[]{altq.f74250f.mo40739b(str40, null), o}) > 0) {
                                                                        }
                                                                    }
                                                                    if (ames.m62811b(person2)) {
                                                                        almm17.f73748X++;
                                                                    } else {
                                                                        almm17.f73749Y++;
                                                                    }
                                                                }
                                                            }
                                                            String str41 = a20.f83135d;
                                                            if (str41 == null) {
                                                                break;
                                                            }
                                                            str39 = str41;
                                                        } catch (Throwable th34) {
                                                            Throwable th35 = th34;
                                                            amee.f74799d.mo41178e();
                                                            throw th35;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        str3 = str7;
                                    }
                                } else {
                                    str3 = str7;
                                }
                                String a23 = amee.f74799d.mo41166a("autocomplete");
                                C1225nr nrVar = new C1225nr(3);
                                nrVar.add(a23);
                                str20 = (String) nrVar.iterator().next();
                                amee.m62770a(str20, z6);
                                if (str20 != null) {
                                }
                            } catch (VolleyError e12) {
                                e = e12;
                                str3 = str7;
                                volleyError = e;
                                networkResponse = volleyError.networkResponse;
                                if (networkResponse == null && networkResponse.statusCode == 410) {
                                    Log.i(str3, "Sync Token out of date, syncing full data.");
                                    amee.f74796a.f73757e = true;
                                    amee.f74799d.mo41173b("people_page");
                                    amee.m62770a((String) null, z6);
                                    z7 = true;
                                    if (z7) {
                                    }
                                    if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83288aR()).booleanValue()) {
                                    }
                                    if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83286aP()).booleanValue()) {
                                    }
                                    if (z7) {
                                    }
                                    if (amee.f74799d.mo41172b() != 0) {
                                    }
                                    long a1422 = amee.f74804i.mo20505a();
                                    if (!amee.f74807l) {
                                    }
                                    amdk.m62657a(str3, str30, Boolean.valueOf(z5), Long.valueOf(a1422 - j8));
                                    amee.m62768a(amee.f74803h);
                                    amig.m62939a();
                                    if (!((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                                    }
                                    almm7.f73775w = SystemClock.elapsedRealtime() - elapsedRealtime;
                                }
                                almm2 = almm;
                                str12 = str26;
                                str10 = str28;
                                str11 = str29;
                                str4 = str30;
                                str13 = str31;
                                j3 = j7;
                                z4 = true;
                                throw volleyError;
                            } catch (Throwable th36) {
                                th = th36;
                                str3 = str7;
                                almm2 = almm;
                                th2 = th;
                                str12 = str26;
                                str10 = str28;
                                str11 = str29;
                                str4 = str30;
                                str13 = str31;
                                j3 = j7;
                                z4 = true;
                                z7 = false;
                                if (z7) {
                                }
                                throw th2;
                            }
                            if (z7) {
                            }
                            try {
                                if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83288aR()).booleanValue()) {
                                }
                                if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83286aP()).booleanValue()) {
                                }
                                if (z7) {
                                }
                            } catch (Throwable th37) {
                                th = th37;
                                almm8 = almm;
                                str14 = str26;
                                str15 = str28;
                                str11 = str29;
                                str4 = str30;
                                str13 = str31;
                                j3 = j7;
                                z4 = true;
                                th2 = th;
                                if (z7) {
                                    try {
                                        if (((Boolean) amha.f74903a.mo41191a()).booleanValue() && ancm.f76635f.nextDouble() < ((Double) amhc.f74905a.mo41191a()).doubleValue()) {
                                            altq a24 = altq.m61806a(amee.f74803h);
                                            almk.m61263a().mo40513a(a24.mo40766c(str10), a24.mo40766c(str11), a24.mo40766c(str13), a24.mo40766c(str12), a24.mo40771e(), ((Boolean) amhb.f74904a.mo41191a()).booleanValue() ? a24.mo40772f() : 0);
                                        }
                                    } catch (amrx e13) {
                                        e = e13;
                                        amrx = e;
                                        throw amrx;
                                    } catch (Throwable th38) {
                                        th = th38;
                                        th = th;
                                        z4 = false;
                                        long a52222 = amee.f74804i.mo20505a();
                                        if (!amee.f74807l) {
                                            if (cgay.m144133f()) {
                                                amea.m62730a(amee.f74818w);
                                            }
                                            amee.f74799d.mo41171a(false, j2, Long.valueOf(a52222));
                                            amee.m62771a(false, z4);
                                        }
                                        amdk.m62657a(str3, str4, (Object) false, (Object) Long.valueOf(a52222 - j2));
                                        amee.m62768a(amee.f74803h);
                                        throw th;
                                    }
                                }
                                throw th2;
                            }
                            try {
                                if (amee.f74799d.mo41172b() != 0) {
                                }
                            } catch (amrx e14) {
                                e = e14;
                                almm3 = almm;
                                str5 = str30;
                                j4 = j7;
                                z4 = true;
                                amrx = e;
                                throw amrx;
                            } catch (Throwable th39) {
                                th = th39;
                                almm6 = almm;
                                str9 = str30;
                                j3 = j7;
                                th = th;
                                z4 = false;
                                long a522222 = amee.f74804i.mo20505a();
                                if (!amee.f74807l) {
                                }
                                amdk.m62657a(str3, str4, (Object) false, (Object) Long.valueOf(a522222 - j2));
                                amee.m62768a(amee.f74803h);
                                throw th;
                            }
                        }
                        long a14222 = amee.f74804i.mo20505a();
                        if (!amee.f74807l) {
                            j8 = j7;
                            z5 = true;
                        } else {
                            if (cgay.m144133f()) {
                                if (amea.m62730a(amee.f74818w)) {
                                    alsj a25 = alsj.m61651a(amee.f74803h);
                                    String str42 = amee.f74797b;
                                    sdo.m34973b((String) null);
                                    SharedPreferences.Editor edit = a25.f74200a.edit();
                                    String valueOf3 = String.valueOf(str42);
                                    edit.putLong(valueOf3.length() == 0 ? new String(str6) : str6.concat(valueOf3), a14222).commit();
                                }
                            }
                            j8 = j7;
                            z5 = true;
                            amee.f74799d.mo41171a(true, j8, Long.valueOf(a14222));
                            amee.m62771a(true, false);
                        }
                        amdk.m62657a(str3, str30, Boolean.valueOf(z5), Long.valueOf(a14222 - j8));
                        amee.m62768a(amee.f74803h);
                        amig.m62939a();
                        if (!((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                            almm7 = almm;
                            almm7.f73750Z = m62765a(context, str, str2);
                        } else {
                            almm7 = almm;
                        }
                        almm7.f73775w = SystemClock.elapsedRealtime() - elapsedRealtime;
                    } catch (amrx e15) {
                        e = e15;
                        almm3 = almm;
                        str5 = str30;
                        str3 = str7;
                        j4 = j7;
                        z4 = true;
                        amrx = e;
                        throw amrx;
                    } catch (Throwable th40) {
                        th = th40;
                        almm6 = almm;
                        str9 = str30;
                        str3 = str7;
                        j3 = j7;
                        th = th;
                        z4 = false;
                        long a5222222 = amee.f74804i.mo20505a();
                        if (!amee.f74807l) {
                        }
                        amdk.m62657a(str3, str4, (Object) false, (Object) Long.valueOf(a5222222 - j2));
                        amee.m62768a(amee.f74803h);
                        throw th;
                    }
                } catch (amrx e16) {
                    e = e16;
                    j4 = j;
                    almm4 = almm;
                    amee = amee3;
                    str3 = str27;
                    str5 = str30;
                    z4 = true;
                    amrx = e;
                    throw amrx;
                } catch (Throwable th41) {
                    th = th41;
                    j5 = j;
                    almm5 = almm;
                    amee = amee3;
                    str3 = str27;
                    str4 = str30;
                    th = th;
                    z4 = false;
                    long a52222222 = amee.f74804i.mo20505a();
                    if (!amee.f74807l) {
                    }
                    amdk.m62657a(str3, str4, (Object) false, (Object) Long.valueOf(a52222222 - j2));
                    amee.m62768a(amee.f74803h);
                    throw th;
                }
            } catch (sid e17) {
                e = e17;
                almm2 = almm;
                sid sid22 = e;
                try {
                    try {
                        aluj.m61902a(context, str3, (String) null, "Cancelled in volley", sid22);
                        throw new amrx();
                    } catch (Throwable th62) {
                        th = th62;
                        Throwable th7222 = th;
                        amig.m62939a();
                        if (((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                        }
                        throw th7222;
                    }
                } catch (Throwable th82) {
                    th = th82;
                    Throwable th72222 = th;
                    amig.m62939a();
                    if (((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                    }
                    throw th72222;
                }
            } catch (Throwable th42) {
            }
        } catch (sid e18) {
            e = e18;
            almm2 = almm;
            str3 = str27;
            sid sid222 = e;
            aluj.m61902a(context, str3, (String) null, "Cancelled in volley", sid222);
            throw new amrx();
        } catch (Throwable th422) {
        }
    }

    /* renamed from: a */
    private final void m62770a(String str, boolean z) {
        String str2;
        amed amed;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!cgbe.f186279a.mo6606a().mo83425cw()) {
            this.f74799d.mo41173b("people_page");
        }
        if (isEmpty) {
            str2 = this.f74799d.mo41166a("people_page");
        } else {
            str2 = null;
        }
        boolean z2 = !TextUtils.isEmpty(str2);
        if (isEmpty) {
            amed = new amec(this, z, z2);
        } else {
            amed = new ameb(this, z, z2);
        }
        almm almm = this.f74796a;
        almm.f73763k = true;
        if (isEmpty) {
            almm.f73759g = true;
            ames ames = this.f74799d;
            ames.mo41169a("people", (String) null);
            ames.mo41169a("gaiamap", (String) null);
            ames.mo41169a("autocomplete", (String) null);
            this.f74796a.f73758f = !TextUtils.isEmpty(str2);
            m62767a(amed, str, str2);
            return;
        }
        m62767a(amed, str, (String) null);
    }

    /* renamed from: a */
    private final void m62771a(boolean z, boolean z2) {
        if (z) {
            this.f74800e.mo40598a(this.f74797b, this.f74798c, 32);
        } else if (!z2) {
            this.f74800e.mo40598a(this.f74797b, this.f74798c, 64);
        } else {
            this.f74800e.mo40598a(this.f74797b, this.f74798c, 128);
        }
        this.f74800e.mo40599b();
    }

    /* renamed from: a */
    public final void mo41156a() {
        this.f74806k.mo41294b();
    }
}

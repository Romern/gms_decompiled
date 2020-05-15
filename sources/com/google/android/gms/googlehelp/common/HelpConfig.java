package com.google.android.gms.googlehelp.common;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HelpConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aase();

    /* renamed from: a */
    public static final Set f78800a;

    /* renamed from: A */
    public ThemeSettings f78801A;

    /* renamed from: B */
    public PendingIntent f78802B;

    /* renamed from: C */
    Boolean f78803C;

    /* renamed from: D */
    public int f78804D;

    /* renamed from: E */
    public boolean f78805E;

    /* renamed from: F */
    public boolean f78806F;

    /* renamed from: G */
    public boolean f78807G;

    /* renamed from: H */
    public boolean f78808H;
    @Deprecated

    /* renamed from: I */
    public String f78809I;
    @Deprecated

    /* renamed from: J */
    public String f78810J;

    /* renamed from: K */
    public String f78811K;

    /* renamed from: L */
    public String f78812L;

    /* renamed from: M */
    public Map f78813M;

    /* renamed from: N */
    public boolean f78814N;

    /* renamed from: O */
    public String f78815O;

    /* renamed from: P */
    public int f78816P;

    /* renamed from: Q */
    public String f78817Q;

    /* renamed from: R */
    public float f78818R;

    /* renamed from: S */
    public long f78819S;

    /* renamed from: T */
    public boolean f78820T;

    /* renamed from: U */
    public String f78821U;

    /* renamed from: V */
    public String f78822V;

    /* renamed from: W */
    public String f78823W;

    /* renamed from: X */
    public int f78824X;

    /* renamed from: Y */
    public int f78825Y;

    /* renamed from: Z */
    private int f78826Z;

    /* renamed from: b */
    public String f78827b;

    /* renamed from: c */
    public String f78828c;

    /* renamed from: d */
    public Account f78829d;

    /* renamed from: e */
    public String f78830e;

    /* renamed from: f */
    public Bundle f78831f;

    /* renamed from: g */
    boolean f78832g;

    /* renamed from: h */
    public boolean f78833h;

    /* renamed from: i */
    List f78834i;

    /* renamed from: j */
    public bzqp f78835j;

    /* renamed from: k */
    public bzra f78836k;

    /* renamed from: l */
    public int f78837l;
    @Deprecated

    /* renamed from: m */
    public Bundle f78838m;
    @Deprecated

    /* renamed from: n */
    public Bitmap f78839n;
    @Deprecated

    /* renamed from: o */
    public byte[] f78840o;
    @Deprecated

    /* renamed from: p */
    public int f78841p;
    @Deprecated

    /* renamed from: q */
    public int f78842q;

    /* renamed from: r */
    public String f78843r;

    /* renamed from: s */
    Uri f78844s;

    /* renamed from: t */
    public List f78845t;

    /* renamed from: u */
    List f78846u;

    /* renamed from: v */
    boolean f78847v;

    /* renamed from: w */
    public boolean f78848w;

    /* renamed from: x */
    public int f78849x;

    /* renamed from: y */
    public String f78850y;

    /* renamed from: z */
    public ErrorReport f78851z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sqw.a(int, boolean):java.util.Set
     arg types: [int, int]
     candidates:
      sqw.a(java.lang.Object[], java.lang.Object[]):java.util.Map
      sqw.a(java.lang.Object, java.lang.Object):java.util.Set
      sqw.a(int, boolean):java.util.Set */
    static {
        bzps bzps = bzps.HANGOUTS;
        bzps bzps2 = bzps.CHAT;
        bzps bzps3 = bzps.PHONE;
        bzps bzps4 = bzps.EMAIL;
        Set a = sqw.m36036a(4, false);
        a.add(bzps);
        a.add(bzps2);
        a.add(bzps3);
        a.add(bzps4);
        f78800a = Collections.unmodifiableSet(a);
    }

    public HelpConfig() {
        this(null, null, null, null, null, true, true, new ArrayList(), null, null, 0, null, null, null, 0, 0, null, null, new ArrayList(), new ArrayList(), false, false, 0, null, new ErrorReport(), new ThemeSettings(), null, true, -1, false, false, false, false, null, null, null, null);
    }

    /* renamed from: J */
    private final String m66347J() {
        return aaya.m47228a(ceit.m136953b()) ? (String) this.f78813M.get(aars.f56396t) : this.f78809I;
    }

    /* renamed from: K */
    private final boolean m66348K() {
        if (!mo43224b()) {
            return false;
        }
        bzqm bzqm = this.f78835j.f171052d;
        if (bzqm == null) {
            bzqm = bzqm.f171030d;
        }
        if (!bzqm.f171034c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.common.HelpConfig.a(boolean, long):void
     arg types: [int, long]
     candidates:
      com.google.android.gms.googlehelp.common.HelpConfig.a(com.google.android.gms.googlehelp.GoogleHelp, android.content.Context):com.google.android.gms.googlehelp.common.HelpConfig
      com.google.android.gms.googlehelp.common.HelpConfig.a(java.lang.String, android.content.Context):void
      com.google.android.gms.googlehelp.common.HelpConfig.a(boolean, long):void */
    /* renamed from: a */
    public static HelpConfig m66349a(Activity activity, Bundle bundle, Intent intent) {
        HelpConfig helpConfig;
        long j;
        if (bundle != null) {
            HelpConfig helpConfig2 = (HelpConfig) bundle.getParcelable("EXTRA_HELP_CONFIG");
            if (helpConfig2 != null) {
                helpConfig2.mo43220a(true, bundle.getLong("EXTRA_START_TICK", System.nanoTime()));
            }
            return helpConfig2;
        } else if (intent == null) {
            Log.e("gH_HelpConfig", "Can't construct HelpConfig; calling intent is null.");
            return null;
        } else {
            if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
                InProductHelp inProductHelp = (InProductHelp) sef.m35067a(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
                m66351b(inProductHelp.f78784a, activity);
                helpConfig = m66350a(inProductHelp.f78784a, activity);
                helpConfig.f78821U = inProductHelp.f78785b;
                helpConfig.f78822V = inProductHelp.f78786c;
                if (aaya.m47228a(cehs.m136872b())) {
                    if (aaya.m47229b(ceih.m136917b())) {
                        helpConfig.f78826Z = inProductHelp.f78787d;
                        helpConfig.f78824X = inProductHelp.f78789f;
                        helpConfig.f78823W = inProductHelp.f78788e;
                    } else {
                        helpConfig.f78826Z = inProductHelp.f78787d;
                        helpConfig.f78823W = inProductHelp.f78788e;
                    }
                } else if (aaya.m47228a(cehg.m136833b())) {
                    helpConfig.f78826Z = inProductHelp.f78787d;
                }
            } else if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
                GoogleHelp googleHelp = (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
                m66351b(googleHelp, activity);
                helpConfig = m66350a(googleHelp, activity);
            } else if (intent.hasExtra("EXTRA_HELP_CONFIG")) {
                helpConfig = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG");
            } else {
                String valueOf = String.valueOf(intent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                sb.append("HelpConfig could not be created from intent: ");
                sb.append(valueOf);
                Log.e("gH_HelpConfig", sb.toString());
                return null;
            }
            boolean hasExtra = intent.hasExtra("EXTRA_START_TICK");
            if (hasExtra) {
                j = intent.getLongExtra("EXTRA_START_TICK", -1);
            } else {
                j = System.nanoTime();
            }
            helpConfig.mo43220a(hasExtra, j);
            if (TextUtils.isEmpty(helpConfig.f78827b)) {
                String a = spn.m35852a(activity);
                if (TextUtils.isEmpty(a)) {
                    Log.e("gH_HelpConfig", "Received empty package name, and can't continue. Please fix help integration");
                    Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(ceeg.m136421z()));
                    if (spn.m35860a(activity, data)) {
                        activity.startActivity(data);
                    }
                    activity.finish();
                    return helpConfig;
                }
                helpConfig.f78827b = a;
            }
            try {
                PackageManager packageManager = activity.getPackageManager();
                String str = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(helpConfig.f78827b, 0));
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("gH_HelpConfig", String.format("Fetching ApplicationInfo of %s failed.", helpConfig.f78827b), e);
            }
            return helpConfig;
        }
    }

    /* renamed from: b */
    private static void m66351b(GoogleHelp googleHelp, Context context) {
        Bundle c;
        aare aare = new aare(googleHelp);
        if ((!aare.mo31641g() && !aare.mo31642h()) || (c = aare.mo31637c()) == null) {
            return;
        }
        if (c.containsKey("gms:googlehelp:sync_help_psd_collection_time_ms")) {
            aayh.m47240a(138, Long.valueOf(c.getString("gms:googlehelp:sync_help_psd_collection_time_ms")).longValue(), googleHelp, context);
        } else if (c.containsKey("gms:googlehelp:sync_help_psd_failure")) {
            aayh.m47241a(106, c.getString("gms:googlehelp:sync_help_psd_failure"), googleHelp, context);
        } else {
            if (c.containsKey("gms:googlehelp:async_help_psd_failure") && TextUtils.equals("null_api_client", c.getString("gms:googlehelp:async_help_psd_failure"))) {
                aayh.m47239a((int) ErrorInfo.TYPE_SDU_MEMORY_FULL, 143, googleHelp, context);
            }
            if (c.containsKey("gms:feedback:async_feedback_psd_failure") && TextUtils.equals("null_api_client", c.getString("gms:feedback:async_feedback_psd_failure"))) {
                aayh.m47239a((int) ErrorInfo.TYPE_SDU_FAILED, 143, googleHelp, context);
            }
            if (c.containsKey("gms:feedback:async_feedback_psbd_failure") && TextUtils.equals("null_api_client", c.getString("gms:feedback:async_feedback_psbd_failure"))) {
                aayh.m47239a((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, 143, googleHelp, context);
            }
        }
    }

    /* renamed from: A */
    public final boolean mo43206A() {
        return this.f78819S != -1;
    }

    /* renamed from: B */
    public final boolean mo43207B() {
        return !TextUtils.isEmpty(this.f78821U);
    }

    /* renamed from: C */
    public final boolean mo43208C() {
        return !TextUtils.isEmpty(this.f78822V);
    }

    /* renamed from: D */
    public final boolean mo43209D() {
        return this.f78826Z == 1;
    }

    /* renamed from: E */
    public final boolean mo43210E() {
        return Boolean.parseBoolean(mo43216a(aars.f56392p));
    }

    /* renamed from: F */
    public final String mo43211F() {
        if (TextUtils.isEmpty(mo43216a(aars.f56393q))) {
            return "";
        }
        String valueOf = String.valueOf(ceeg.m136421z());
        String valueOf2 = String.valueOf(mo43216a(aars.f56393q));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: G */
    public final String mo43212G() {
        if (TextUtils.isEmpty(mo43216a(aars.f56394r))) {
            return "";
        }
        String valueOf = String.valueOf(ceeg.m136421z());
        String valueOf2 = String.valueOf(mo43216a(aars.f56394r));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: H */
    public final boolean mo43213H() {
        return !TextUtils.isEmpty(mo43212G()) || !TextUtils.isEmpty(mo43211F());
    }

    /* renamed from: I */
    public final void mo43214I() {
        this.f78848w = true;
    }

    /* renamed from: a */
    public final void mo43220a(boolean z, long j) {
        this.f78820T = z;
        this.f78819S = j;
    }

    /* renamed from: c */
    public final String mo43226c() {
        return aaya.m47228a(ceit.m136953b()) ? (String) this.f78813M.get(aars.f56395s) : this.f78810J;
    }

    /* renamed from: d */
    public final boolean mo43228d() {
        return !TextUtils.isEmpty(this.f78828c);
    }

    /* renamed from: e */
    public final String mo43230e() {
        bzqp bzqp;
        String a = mo43216a(aars.f56379c);
        if (!(!TextUtils.isEmpty(a) || (bzqp = this.f78835j) == null || (bzqp.f171049a & 2048) == 0)) {
            bzqt bzqt = bzqp.f171056h;
            if (bzqt == null) {
                bzqt = bzqt.f171068c;
            }
            a = bzqt.f171071b;
        }
        if (!aaya.m47229b(cehp.m136859b()) || !TextUtils.isEmpty(a)) {
            return a;
        }
        return !TextUtils.isEmpty(this.f78811K) ? this.f78811K : "";
    }

    /* renamed from: f */
    public final String mo43231f() {
        bzqp bzqp = this.f78835j;
        if (!(bzqp == null || (bzqp.f171049a & 8) == 0)) {
            bzqn bzqn = bzqp.f171053e;
            if (bzqn == null) {
                bzqn = bzqn.f171035c;
            }
            if (!bzqn.f171038b.isEmpty()) {
                bzqn bzqn2 = this.f78835j.f171053e;
                if (bzqn2 == null) {
                    bzqn2 = bzqn.f171035c;
                }
                return bzqn2.f171038b;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo43232g() {
        return this.f78829d != null;
    }

    /* renamed from: h */
    public final boolean mo43233h() {
        return mo43234i() >= 0;
    }

    /* renamed from: i */
    public final int mo43234i() {
        try {
            return Integer.parseInt(mo43216a(aars.f56378b));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /* renamed from: j */
    public final boolean mo43235j() {
        return mo43225b(bzps.C2C);
    }

    /* renamed from: k */
    public final boolean mo43236k() {
        int a;
        bzra bzra = this.f78836k;
        if (bzra == null || (((a = bzrc.m126061a(bzra.f171100b)) == 0 || a != 2) && !mo43237l())) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo43237l() {
        return mo43238m() || mo43239n();
    }

    /* renamed from: m */
    public final boolean mo43238m() {
        int a;
        bzra bzra = this.f78836k;
        return (bzra == null || (a = bzrc.m126061a(bzra.f171100b)) == 0 || a != 3) ? false : true;
    }

    /* renamed from: n */
    public final boolean mo43239n() {
        int a;
        bzra bzra = this.f78836k;
        return (bzra == null || (a = bzrc.m126061a(bzra.f171100b)) == 0 || a != 4) ? false : true;
    }

    /* renamed from: o */
    public final boolean mo43240o() {
        return !aaya.m47228a(ceit.m136953b()) ? !TextUtils.isEmpty(this.f78809I) || m66348K() : (mo43210E() && !TextUtils.isEmpty(mo43211F()) && !TextUtils.isEmpty(m66347J())) || m66348K();
    }

    /* renamed from: p */
    public final String mo43241p() {
        if (!TextUtils.isEmpty(m66347J())) {
            return m66347J();
        }
        if (!mo43224b()) {
            return null;
        }
        bzqm bzqm = this.f78835j.f171052d;
        if (bzqm == null) {
            bzqm = bzqm.f171030d;
        }
        return bzqm.f171034c;
    }

    /* renamed from: q */
    public final boolean mo43242q() {
        bzqp bzqp = this.f78835j;
        if (bzqp == null || (bzqp.f171049a & 4096) == 0) {
            return false;
        }
        bzqs bzqs = bzqp.f171057i;
        if (bzqs == null) {
            bzqs = bzqs.f171063c;
        }
        if (!TextUtils.isEmpty(bzqs.f171066b)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final List mo43243r() {
        if (mo43221a(bzps.PHONE)) {
            bzqu bzqu = this.f78835j.f171051c;
            if (bzqu == null) {
                bzqu = bzqu.f171072b;
            }
            if (bzqu.f171074a.size() > 0) {
                bzqu bzqu2 = this.f78835j.f171051c;
                if (bzqu2 == null) {
                    bzqu2 = bzqu.f171072b;
                }
                return bzqu2.f171074a;
            }
        }
        return this.f78834i;
    }

    /* renamed from: s */
    public final boolean mo43244s() {
        if (!mo43221a(bzps.EMAIL)) {
            return false;
        }
        bzqo bzqo = this.f78835j.f171050b;
        if (bzqo == null) {
            bzqo = bzqo.f171040e;
        }
        if ((bzqo.f171042a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final bzqf mo43245t() {
        if (!mo43221a(bzps.EMAIL)) {
            return null;
        }
        bzqo bzqo = this.f78835j.f171050b;
        if (bzqo == null) {
            bzqo = bzqo.f171040e;
        }
        bzqf bzqf = bzqo.f171044c;
        return bzqf == null ? bzqf.f170982f : bzqf;
    }

    /* renamed from: u */
    public final Set mo43246u() {
        bzqp bzqp = this.f78835j;
        if (bzqp != null) {
            bzqr bzqr = bzqp.f171054f;
            if (bzqr == null) {
                bzqr = bzqr.f171060c;
            }
            if (bzqr.f171062a.size() > 0) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(f78800a.size());
                bzqr bzqr2 = this.f78835j.f171054f;
                if (bzqr2 == null) {
                    bzqr2 = bzqr.f171060c;
                }
                int size = bzqr2.f171062a.size();
                for (int i = 0; i < size; i++) {
                    bzqr bzqr3 = this.f78835j.f171054f;
                    if (bzqr3 == null) {
                        bzqr3 = bzqr.f171060c;
                    }
                    linkedHashSet.add((bzps) bzqr.f171059b.mo14948a(Integer.valueOf(bzqr3.f171062a.mo74151b(i))));
                }
                linkedHashSet.addAll(f78800a);
                return linkedHashSet;
            }
        }
        return f78800a;
    }

    /* renamed from: v */
    public final String mo43247v() {
        String a = mo43216a(aars.f56380d);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        Uri uri = this.f78844s;
        if (uri == null) {
            return aars.f56380d.f56398v;
        }
        return uri.toString();
    }

    /* renamed from: w */
    public final boolean mo43248w() {
        List list = this.f78846u;
        return list != null && !list.isEmpty();
    }

    /* renamed from: x */
    public final List mo43250x() {
        if (this.f78846u == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        List list = this.f78846u;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(aasm.m46878a((OfflineSuggestion) list.get(i)));
        }
        return arrayList;
    }

    /* renamed from: y */
    public final boolean mo43251y() {
        if (this.f78848w) {
            return true;
        }
        String a = mo43216a(aars.f56381e);
        return !TextUtils.isEmpty(a) ? a.equalsIgnoreCase("top") : this.f78847v;
    }

    /* renamed from: z */
    public final boolean mo43252z() {
        return !TextUtils.isEmpty(this.f78815O);
    }

    /* renamed from: d */
    public final boolean mo43229d(Context context) {
        List r = mo43243r();
        if (context == null || r.isEmpty() || !ssk.m36237a(context, (String) r.get(0))) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f78827b, false);
        see.m35046a(parcel, 3, this.f78828c, false);
        see.m35040a(parcel, 4, this.f78829d, i, false);
        see.m35046a(parcel, 5, this.f78830e, false);
        see.m35037a(parcel, 6, this.f78831f, false);
        see.m35051a(parcel, 8, this.f78832g);
        see.m35051a(parcel, 9, this.f78833h);
        see.m35065b(parcel, 11, this.f78834i, false);
        see.m35037a(parcel, 15, this.f78838m, false);
        see.m35040a(parcel, 16, this.f78839n, i, false);
        see.m35046a(parcel, 19, this.f78843r, false);
        see.m35040a(parcel, 22, this.f78844s, i, false);
        see.m35066c(parcel, 23, this.f78845t, false);
        see.m35066c(parcel, 25, this.f78846u, false);
        see.m35046a(parcel, 31, this.f78850y, false);
        see.m35052a(parcel, 32, this.f78840o, false);
        see.m35063b(parcel, 33, this.f78841p);
        see.m35063b(parcel, 34, this.f78842q);
        bzqp bzqp = this.f78835j;
        Bundle bundle2 = null;
        if (bzqp != null) {
            bundle = new Bundle();
            bundle.putByteArray("EXTRA_ESCALATION_OPTIONS", bzqp.mo73642k());
        } else {
            bundle = null;
        }
        see.m35037a(parcel, 35, bundle, false);
        see.m35063b(parcel, 36, this.f78837l);
        see.m35051a(parcel, 38, this.f78847v);
        see.m35040a(parcel, 39, this.f78851z, i, false);
        see.m35040a(parcel, 41, this.f78801A, i, false);
        see.m35051a(parcel, 42, this.f78848w);
        see.m35063b(parcel, 43, this.f78849x);
        bzra bzra = this.f78836k;
        if (bzra != null) {
            bundle2 = new Bundle();
            bundle2.putByteArray("EXTRA_REALTIME_SUPPORT_STATUS", bzra.mo73642k());
        }
        see.m35037a(parcel, 50, bundle2, false);
        see.m35040a(parcel, 52, this.f78802B, i, false);
        see.m35041a(parcel, 53, this.f78803C);
        see.m35063b(parcel, 56, this.f78804D);
        see.m35051a(parcel, 57, this.f78805E);
        see.m35051a(parcel, 58, this.f78806F);
        see.m35051a(parcel, 59, this.f78807G);
        see.m35051a(parcel, 60, this.f78808H);
        see.m35046a(parcel, 61, this.f78809I, false);
        see.m35046a(parcel, 62, this.f78810J, false);
        see.m35046a(parcel, 63, this.f78811K, false);
        see.m35046a(parcel, 64, this.f78812L, false);
        see.m35062b(parcel, a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    public HelpConfig(String str, String str2, Account account, String str3, Bundle bundle, boolean z, boolean z2, List list, Bundle bundle2, Bundle bundle3, int i, Bundle bundle4, Bitmap bitmap, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, List list3, boolean z3, boolean z4, int i4, String str5, ErrorReport errorReport, ThemeSettings themeSettings, PendingIntent pendingIntent, Boolean bool, int i5, boolean z5, boolean z6, boolean z7, boolean z8, String str6, String str7, String str8, String str9) {
        bzqp bzqp;
        Bundle bundle5 = bundle2;
        Bundle bundle6 = bundle3;
        this.f78826Z = 0;
        this.f78824X = 0;
        this.f78804D = i5;
        this.f78805E = z5;
        this.f78806F = z6;
        this.f78807G = z7;
        this.f78827b = str;
        this.f78812L = str9;
        this.f78828c = str2;
        this.f78829d = account;
        this.f78830e = str3;
        if (aaya.m47229b(ceib.m136899d())) {
            this.f78831f = aayh.m47234a(bundle);
        } else {
            this.f78831f = bundle;
        }
        this.f78832g = z;
        this.f78833h = z2;
        this.f78808H = z8;
        this.f78834i = list;
        bzra bzra = null;
        if (bundle5 != null && bundle5.containsKey("EXTRA_ESCALATION_OPTIONS")) {
            try {
                bzqp = (bzqp) bxvk.m124016a(bzqp.f171047j, bundle5.getByteArray("EXTRA_ESCALATION_OPTIONS"), bxus.m123744c());
            } catch (bxwf e) {
            }
            this.f78835j = bzqp;
            if (bundle6 != null && bundle6.containsKey("EXTRA_REALTIME_SUPPORT_STATUS")) {
                bzra = (bzra) bxvk.m124016a(bzra.f171097c, bundle6.getByteArray("EXTRA_REALTIME_SUPPORT_STATUS"), bxus.m123744c());
            }
            this.f78836k = bzra;
            this.f78837l = i;
            this.f78850y = str5;
            if (!aaya.m47228a(ceit.m136953b())) {
                this.f78809I = str6;
                this.f78810J = str7;
            }
            this.f78802B = pendingIntent;
            if (!aaya.m47229b(ceib.m136899d())) {
                this.f78838m = aayh.m47234a(bundle4);
            } else {
                this.f78838m = bundle4;
            }
            this.f78839n = bitmap;
            this.f78840o = bArr;
            this.f78841p = i2;
            this.f78842q = i3;
            this.f78851z = errorReport;
            this.f78843r = str4;
            this.f78844s = uri;
            this.f78845t = list2;
            this.f78801A = themeSettings;
            this.f78846u = list3;
            this.f78847v = z3;
            this.f78848w = z4;
            this.f78849x = i4;
            this.f78813M = new C1223np();
            this.f78814N = false;
            this.f78815O = "";
            this.f78825Y = 1;
            this.f78816P = -1;
            this.f78817Q = "";
            this.f78818R = -1.0f;
            this.f78819S = -1;
            this.f78820T = false;
            this.f78803C = bool;
            this.f78811K = str8;
        }
        bzqp = null;
        this.f78835j = bzqp;
        try {
            bzra = (bzra) bxvk.m124016a(bzra.f171097c, bundle6.getByteArray("EXTRA_REALTIME_SUPPORT_STATUS"), bxus.m123744c());
        } catch (bxwf e2) {
        }
        this.f78836k = bzra;
        this.f78837l = i;
        this.f78850y = str5;
        if (!aaya.m47228a(ceit.m136953b())) {
        }
        this.f78802B = pendingIntent;
        if (!aaya.m47229b(ceib.m136899d())) {
        }
        this.f78839n = bitmap;
        this.f78840o = bArr;
        this.f78841p = i2;
        this.f78842q = i3;
        this.f78851z = errorReport;
        this.f78843r = str4;
        this.f78844s = uri;
        this.f78845t = list2;
        this.f78801A = themeSettings;
        this.f78846u = list3;
        this.f78847v = z3;
        this.f78848w = z4;
        this.f78849x = i4;
        this.f78813M = new C1223np();
        this.f78814N = false;
        this.f78815O = "";
        this.f78825Y = 1;
        this.f78816P = -1;
        this.f78817Q = "";
        this.f78818R = -1.0f;
        this.f78819S = -1;
        this.f78820T = false;
        this.f78803C = bool;
        this.f78811K = str8;
    }

    /* renamed from: c */
    public final void mo43227c(Context context) {
        String b = aayh.m47258b(this.f78819S);
        GoogleHelp googleHelp = new GoogleHelp(this.f78828c);
        Account account = this.f78829d;
        if (account != null && !TextUtils.isEmpty(account.name)) {
            googleHelp.f78760c = new Account(this.f78829d.name, "com.google");
        }
        googleHelp.f78762e = this.f78827b;
        aare aare = new aare(googleHelp);
        aare.mo31634a(this.f78830e);
        Bundle a = aayh.m47233a(context, b, aare.f56363a);
        if (a != null) {
            this.f78807G = true;
        }
        if (a != null) {
            Bundle bundle = this.f78831f;
            if (bundle != null) {
                bundle.putAll(a);
            } else {
                this.f78831f = a;
            }
        } else if (System.nanoTime() - this.f78819S > ceeg.f182447a.mo6606a().mo78945M() * 1000000) {
            if (this.f78831f == null) {
                this.f78831f = new Bundle(1);
            }
            this.f78831f.putString("gms:googlehelp:async_help_psd_failure", "timeout");
            this.f78807G = true;
        }
    }

    /* renamed from: b */
    public final Bundle mo43222b(Context context) {
        if (this.f78805E && !this.f78807G) {
            mo43227c(context);
        }
        return this.f78831f;
    }

    /* renamed from: b */
    public final void mo43223b(String str, Context context) {
        if (aaya.m47228a(ceit.m136953b())) {
            this.f78813M.put(aars.f56396t, str);
            aasa a = new aasc(context, this).mo31695a();
            a.mo31692b(this.f78813M);
            a.mo31691a(this.f78813M);
            a.mo31685a();
            return;
        }
        this.f78809I = str;
    }

    /* renamed from: b */
    public final boolean mo43224b() {
        return mo43221a(bzps.CHAT);
    }

    /* renamed from: b */
    public final boolean mo43225b(bzps bzps) {
        if (bzps == bzps.PHONE && !mo43243r().isEmpty()) {
            return true;
        }
        if (this.f78835j == null || !mo43221a(bzps)) {
            return false;
        }
        int ordinal = bzps.ordinal();
        if (ordinal == 1) {
            bzqm bzqm = this.f78835j.f171052d;
            if (bzqm == null) {
                bzqm = bzqm.f171030d;
            }
            return bzqm.f171033b;
        } else if (ordinal == 2) {
            return true;
        } else {
            if (ordinal == 3) {
                bzqo bzqo = this.f78835j.f171050b;
                if (bzqo == null) {
                    bzqo = bzqo.f171040e;
                }
                return bzqo.f171043b;
            } else if (ordinal != 6) {
                return false;
            } else {
                bzqn bzqn = this.f78835j.f171053e;
                if (bzqn == null) {
                    bzqn = bzqn.f171035c;
                }
                return bzqn.f171037a;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.a(android.content.Context, abeh, boolean):void
     arg types: [android.content.Context, abeh, int]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.a(android.content.Context, abeh, boolean):void */
    /* renamed from: a */
    public static HelpConfig m66350a(GoogleHelp googleHelp, Context context) {
        String str;
        String str2;
        GoogleHelp googleHelp2 = googleHelp;
        aare aare = new aare(googleHelp2);
        String b = TextUtils.isEmpty(aare.mo31639e()) ? wzg.m42522b() : aare.mo31639e();
        String a = aare.mo31633a();
        String a2 = aare.mo31633a();
        String str3 = null;
        if (!aaya.m47229b(ceiq.f182728a.mo6606a().mo79176a()) || !TextUtils.isEmpty(a2)) {
            if (!TextUtils.isEmpty(aare.mo31636b())) {
                str2 = aare.mo31636b();
            } else {
                str2 = (aare.mo31637c() == null || !aare.mo31637c().containsKey("genie-eng:app_pkg_name")) ? null : aare.mo31637c().getString("genie-eng:app_pkg_name");
            }
            if (!TextUtils.isEmpty(str2)) {
                bxvd da = abeh.f57196I.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abeh abeh = (abeh) da.f164949b;
                b.getClass();
                int i = abeh.f57206a | 64;
                abeh.f57206a = i;
                abeh.f57214i = b;
                a2.getClass();
                int i2 = i | 2;
                abeh.f57206a = i2;
                abeh.f57209d = a2;
                abeh.f57215j = 169;
                abeh.f57206a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (aayh.m47254a(a2, cehm.f182680a.mo6606a().mo79138a())) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    abeh abeh2 = (abeh) da.f164949b;
                    abeh2.f57216k = 20;
                    abeh2.f57206a |= 1024;
                    str3 = str2;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    abeh abeh3 = (abeh) da.f164949b;
                    abeh3.f57216k = 21;
                    abeh3.f57206a |= 1024;
                }
                MetricsIntentOperation.m66596a(context, (abeh) da.mo74062i(), false);
                str = str3;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        Account account = aare.f56363a.f78760c;
        if (account == null && aare.mo31640f()) {
            List a3 = aasd.m46847a(context);
            if (!a3.isEmpty()) {
                account = (Account) a3.get(0);
            }
        }
        String str4 = googleHelp2.f78759b;
        Bundle c = aare.mo31637c();
        GoogleHelp googleHelp3 = aare.f56363a;
        boolean z = googleHelp3.f78765h;
        boolean z2 = googleHelp3.f78766i;
        List list = googleHelp3.f78767j;
        Bundle bundle = googleHelp2.f78768k;
        Bitmap bitmap = googleHelp2.f78769l;
        byte[] bArr = googleHelp2.f78770m;
        int i3 = googleHelp2.f78771n;
        int i4 = googleHelp2.f78772o;
        String str5 = googleHelp3.f78773p;
        Uri uri = googleHelp2.f78774q;
        List list2 = googleHelp3.f78775r;
        List list3 = googleHelp3.f78777t;
        boolean z3 = googleHelp3.f78778u;
        ErrorReport i5 = aare.mo31643i();
        GoogleHelp googleHelp4 = aare.f56363a;
        return new HelpConfig(a, str4, account, b, c, z, z2, list, null, null, 0, bundle, bitmap, bArr, i3, i4, str5, uri, list2, list3, z3, false, 0, null, i5, googleHelp4.f78776s, googleHelp4.f78782y, true, aare.f56363a.f78783z, aare.mo31641g(), aare.mo31642h(), false, aare.mo31640f(), null, null, null, str);
    }

    /* renamed from: a */
    public final HelpConfig mo43215a() {
        HelpConfig helpConfig = new HelpConfig();
        helpConfig.f78827b = this.f78827b;
        helpConfig.f78812L = this.f78812L;
        helpConfig.f78828c = this.f78828c;
        helpConfig.f78829d = this.f78829d;
        helpConfig.f78830e = this.f78830e;
        helpConfig.f78831f = this.f78831f;
        helpConfig.f78801A = this.f78801A;
        helpConfig.f78849x = this.f78849x;
        return helpConfig;
    }

    /* renamed from: a */
    public final String mo43216a(aars aars) {
        String str = (String) this.f78813M.get(aars);
        return str == null ? aars.f56398v : str;
    }

    /* renamed from: a */
    public final List mo43217a(Context context) {
        Bundle b = mo43222b(context);
        ArrayList arrayList = null;
        if (b != null) {
            Set<String> keySet = b.keySet();
            if (!keySet.isEmpty()) {
                arrayList = new ArrayList(keySet.size());
                for (String str : keySet) {
                    arrayList.add(aatb.m46961a(str, b.getString(str)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo43218a(bzqp bzqp) {
        this.f78835j = bzqp;
        int i = 0;
        if (ceep.f182554a.mo6606a().mo79038b() && mo43240o()) {
            i = 3;
        }
        this.f78837l = i;
    }

    /* renamed from: a */
    public final void mo43219a(String str, Context context) {
        if (aaya.m47228a(ceit.m136953b())) {
            this.f78813M.put(aars.f56395s, str);
            aasa a = new aasc(context, this).mo31695a();
            a.mo31692b(this.f78813M);
            a.mo31691a(this.f78813M);
            a.mo31685a();
            return;
        }
        this.f78810J = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43221a(bzps bzps) {
        if (this.f78835j == null) {
            return false;
        }
        bzps bzps2 = bzps.UNKNOWN_CONTACT_MODE;
        int ordinal = bzps.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal == 6 && (this.f78835j.f171049a & 8) != 0 : (this.f78835j.f171049a & 1) != 0 : (this.f78835j.f171049a & 2) != 0 : (this.f78835j.f171049a & 4) != 0;
    }
}

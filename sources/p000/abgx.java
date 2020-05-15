package p000;

import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Calendar;

/* renamed from: abgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgx extends aaru {

    /* renamed from: e */
    public static final /* synthetic */ int f57444e = 0;

    /* renamed from: f */
    private final HelpChimeraActivity f57445f;

    /* renamed from: g */
    private final aaxx f57446g;

    /* renamed from: h */
    private final aasm f57447h;

    /* renamed from: i */
    private final aasg f57448i;

    /* renamed from: j */
    private final boolean f57449j;

    /* renamed from: k */
    private boolean f57450k;

    /* renamed from: l */
    private final boolean f57451l;

    /* renamed from: m */
    private final Calendar f57452m;

    /* renamed from: n */
    private final boolean f57453n = true;

    public abgx(HelpChimeraActivity helpChimeraActivity, aasm aasm, aasg aasg, boolean z, Calendar calendar) {
        this(helpChimeraActivity, aasm, aasg, z, false, true, calendar);
    }

    /* renamed from: a */
    public static wzh m47703a(HelpConfig helpConfig) {
        if (!helpConfig.mo43206A()) {
            return null;
        }
        wzh wzh = new wzh(helpConfig.f78819S);
        wzh.mo29584c();
        return wzh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo31662b(Object obj) {
        this.f57445f.mo43333a(this.f57447h, (aasg) obj, this.f57451l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo32091d() {
        return ssk.m36235a(this.f57445f);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r0 != false) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e  */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        aasm aasm;
        boolean z;
        boolean z2;
        Void[] voidArr = (Void[]) objArr;
        boolean z3 = true;
        if (this.f57447h.f56509s || !mo32091d()) {
            this.f57450k = true;
        }
        if (!this.f57450k) {
            aasm = mo32090a(this.f57447h);
            if (aasm == null) {
                z2 = false;
                z = true;
                if (aasm != null && !this.f57450k) {
                    z3 = z2;
                } else {
                    boolean b = aayi.m47271b(this.f57445f, C0126R.attr.gh_isInDarkMode);
                    if (TextUtils.isEmpty(this.f57447h.f56492b)) {
                        aasm = this.f57446g.mo31879a(this.f57447h.mo31719d(), this.f57445f.f56986y.f78827b, b);
                    } else if (cefz.m136754b()) {
                        aasm = this.f57446g.mo31880a(this.f57447h.f56497g, b);
                    }
                    if (this.f57450k && aasm == null && mo32091d()) {
                        String valueOf = String.valueOf(this.f57447h.f56492b);
                        Log.w("gH_GetLeafContentTask", valueOf.length() != 0 ? new String("Failed to read the leaf content from database: ") : "Failed to read the leaf content from database: ".concat(valueOf));
                        aasm aasm2 = this.f57447h;
                        aasm2.f56504n = "";
                        aasm = mo32090a(aasm2);
                        if (aasm == null) {
                            this.f57446g.mo31887a(aasm, this.f57445f.f56986y.f78827b);
                            this.f57447h.f56504n = aasm.f56504n;
                        } else {
                            z = true;
                        }
                        this.f57450k = false;
                    } else {
                        z3 = z2;
                    }
                }
                if (aasm == null) {
                    this.f57447h.f56505o = this.f57452m.getTimeInMillis();
                    if (TextUtils.isEmpty(this.f57447h.f56496f) && !aasm.mo31726i()) {
                        this.f57447h.f56496f = aasm.f56496f;
                    }
                }
                this.f57446g.mo31887a(this.f57447h, this.f57445f.f56986y.f78827b);
                if (this.f57450k) {
                    aasg aasg = this.f57448i;
                    if (aasg.f56434i == 11) {
                        aasg.f56434i = 12;
                    }
                }
                aasg aasg2 = this.f57448i;
                aasg2.mo31703a(aasm);
                aasg2.f56431f = z;
                return aasg2;
            }
            if (!aasm.mo31726i()) {
                this.f57446g.mo31887a(aasm, this.f57445f.f56986y.f78827b);
                this.f57447h.f56504n = aasm.f56504n;
                z2 = true;
            } else {
                this.f57450k = true;
                z2 = false;
            }
            this.f57447h.f56509s = true;
        } else {
            aasm = null;
            z2 = false;
        }
        z = false;
        if (aasm != null) {
            z3 = z2;
            if (aasm == null) {
            }
            this.f57446g.mo31887a(this.f57447h, this.f57445f.f56986y.f78827b);
            if (this.f57450k) {
            }
            aasg aasg22 = this.f57448i;
            aasg22.mo31703a(aasm);
            aasg22.f56431f = z;
            return aasg22;
        }
        boolean b2 = aayi.m47271b(this.f57445f, C0126R.attr.gh_isInDarkMode);
        if (TextUtils.isEmpty(this.f57447h.f56492b)) {
        }
        if (this.f57450k) {
            String valueOf2 = String.valueOf(this.f57447h.f56492b);
            Log.w("gH_GetLeafContentTask", valueOf2.length() != 0 ? new String("Failed to read the leaf content from database: ") : "Failed to read the leaf content from database: ".concat(valueOf2));
            aasm aasm22 = this.f57447h;
            aasm22.f56504n = "";
            aasm = mo32090a(aasm22);
            if (aasm == null) {
            }
            this.f57450k = false;
            if (aasm == null) {
            }
            this.f57446g.mo31887a(this.f57447h, this.f57445f.f56986y.f78827b);
            if (this.f57450k) {
            }
            aasg aasg222 = this.f57448i;
            aasg222.mo31703a(aasm);
            aasg222.f56431f = z;
            return aasg222;
        }
        z3 = z2;
        if (aasm == null) {
        }
        this.f57446g.mo31887a(this.f57447h, this.f57445f.f56986y.f78827b);
        if (this.f57450k) {
        }
        aasg aasg2222 = this.f57448i;
        aasg2222.mo31703a(aasm);
        aasg2222.f56431f = z;
        return aasg2222;
    }

    public abgx(HelpChimeraActivity helpChimeraActivity, aasm aasm, aasg aasg, boolean z, boolean z2, boolean z3, Calendar calendar) {
        super(helpChimeraActivity);
        this.f57445f = helpChimeraActivity;
        this.f57446g = helpChimeraActivity.f78965l;
        this.f57447h = aasm;
        this.f57448i = aasg;
        this.f57449j = z;
        this.f57450k = z2;
        this.f57451l = z3;
        this.f57452m = calendar;
    }

    /* renamed from: a */
    public static void m47704a(HelpChimeraActivity helpChimeraActivity, aasm aasm, int i, int i2) {
        m47705a(helpChimeraActivity, aasm, i, i2, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasg.a(int, int, java.lang.String, float, boolean, int, wzh):aasg
     arg types: [int, int, java.lang.String, int, int, int, wzh]
     candidates:
      aasg.a(int, int, java.lang.String, float, int, wzh, int):aasg
      aasg.a(int, int, java.lang.String, float, boolean, int, wzh):aasg */
    /* renamed from: a */
    public static void m47705a(HelpChimeraActivity helpChimeraActivity, aasm aasm, int i, int i2, String str) {
        String str2;
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        wzh wzh = new wzh();
        wzh.mo29584c();
        new abgx(helpChimeraActivity, aasm, aasg.m46856a(i, i2, str2, -1.0f, false, 11, wzh), helpChimeraActivity.mo43326L(), false, true, Calendar.getInstance()).executeOnExecutor(helpChimeraActivity.f78958e, new Void[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aasm mo32090a(aasm aasm) {
        if (this.f57453n) {
            return abfi.m47615a(this.f57445f, aasm);
        }
        HelpChimeraActivity helpChimeraActivity = this.f57445f;
        return abfn.m47620a(helpChimeraActivity, aasm, false, helpChimeraActivity.f78958e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31660a() {
        HelpChimeraActivity helpChimeraActivity = this.f57445f;
        if (this.f57449j) {
            helpChimeraActivity.mo43344c(this);
        }
        helpChimeraActivity.mo43363y();
    }
}

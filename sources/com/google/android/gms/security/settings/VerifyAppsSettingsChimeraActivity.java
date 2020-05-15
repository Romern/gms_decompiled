package com.google.android.gms.security.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VerifyAppsSettingsChimeraActivity extends apwx implements suh, apxw {

    /* renamed from: s */
    public static final /* synthetic */ int f107531s = 0;

    /* renamed from: A */
    private final ExecutorService f107532A = new soc(2, 9);

    /* renamed from: b */
    public apgy f107533b;

    /* renamed from: c */
    apww f107534c;

    /* renamed from: d */
    apxg f107535d;

    /* renamed from: e */
    apxg f107536e;

    /* renamed from: f */
    apxg f107537f;

    /* renamed from: j */
    apxy f107538j;

    /* renamed from: k */
    apus f107539k;

    /* renamed from: l */
    public int f107540l = -1;

    /* renamed from: m */
    public int f107541m = -1;

    /* renamed from: n */
    public long f107542n;

    /* renamed from: o */
    public boolean f107543o;

    /* renamed from: p */
    public boolean f107544p;

    /* renamed from: q */
    public apwr f107545q = apvs.m71077b();

    /* renamed from: r */
    public PackageManager f107546r;

    /* renamed from: t */
    private apxy f107547t;

    /* renamed from: u */
    private boolean f107548u;

    /* renamed from: v */
    private boolean f107549v;

    /* renamed from: w */
    private boolean f107550w;

    /* renamed from: x */
    private long f107551x;

    /* renamed from: y */
    private List f107552y;

    /* renamed from: z */
    private boolean f107553z = false;

    /* renamed from: j */
    private final int m92402j() {
        int a;
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("gpp_home_user_entry_point") || (a = apuy.m71066a(intent.getIntExtra("gpp_home_user_entry_point", 0))) == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: b */
    public final void mo58936b(int i) {
        runOnUiThread(new apxq(this, i));
    }

    /* renamed from: e */
    public final void mo47695e() {
        this.f107533b.mo47200a(false);
        mo58937g();
    }

    /* renamed from: g */
    public final void mo58937g() {
        boolean d = this.f107533b.mo47205d();
        svf svf = ((svi) this.f41601g).f45221a;
        boolean z = true;
        if (!d) {
            apxg apxg = this.f107536e;
            if (apxg != null && !this.f107548u) {
                svf.mo26149a((sui) apxg);
                this.f107548u = true;
            }
        } else if (this.f107548u) {
            svf.mo26153d(this.f107536e);
            this.f107548u = false;
        }
        if (!d || this.f107540l != 0 || this.f107541m != 0) {
            if (this.f107549v) {
                svf.mo26153d(this.f107535d);
                this.f107549v = false;
            }
            if (this.f107550w) {
                svf.mo26153d(this.f107537f);
                this.f107550w = false;
            }
        } else if (this.f107544p) {
            apxg apxg2 = this.f107537f;
            if (apxg2 != null && !this.f107550w) {
                svf.mo26149a((sui) apxg2);
                this.f107550w = true;
                if (this.f107549v) {
                    svf.mo26153d(this.f107535d);
                    this.f107549v = false;
                }
            }
        } else {
            apxg apxg3 = this.f107535d;
            if (apxg3 != null) {
                if (!this.f107549v) {
                    svf.mo26149a((sui) apxg3);
                    this.f107549v = true;
                }
                if (this.f107550w) {
                    svf.mo26153d(this.f107537f);
                    this.f107550w = false;
                }
            }
        }
        this.f107547t.setChecked(d);
        this.f107547t.mo26104a(this.f107533b.mo47204c());
        apxy apxy = this.f107538j;
        if (apxy != null) {
            if (!d || !apgy.m70271c(this)) {
                z = false;
            }
            apxy.setChecked(z);
            this.f107538j.mo26104a(d);
            this.f107538j.mo26107d(!d ? C0126R.string.upload_apps_disabled_summary : C0126R.string.upload_apps_summary);
        }
    }

    public final void onCreate(Bundle bundle) {
        Intent a;
        ComponentName component;
        if (!cgkt.m145936h() || ((component = (a = apum.m71043a(this, 3)).getComponent()) != null && component.getClassName().equals(apuh.m71023a(VerifyAppsSettingsChimeraActivity.class)))) {
            if (this.f107539k == null) {
                this.f107539k = new apus(this);
            }
            this.f107545q.mo47663a();
            super.onCreate(bundle);
            this.f107546r = getPackageManager();
            mo8628aW().mo15853b(true);
            this.f107532A.execute(new apxh(this));
            if (cgkt.m145939k()) {
                this.f107545q.mo47664a(m92402j());
            }
            this.f107545q.mo47665a(2, 2);
            return;
        }
        startActivity(a);
        this.f107553z = true;
        super.onCreate(bundle);
        finish();
    }

    public final void onDestroy() {
        try {
            this.f107532A.shutdownNow();
        } catch (Exception e) {
        }
        this.f107545q.mo47665a(3, 2);
        super.onDestroy();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (cgkt.m145939k()) {
            setIntent(intent);
            this.f107545q.mo47664a(m92402j());
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.security_apps_help) {
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.f31623a = 1;
            themeSettings.f31624b = C1133kh.m17843b(this, C0126R.color.material_blue_grey_700);
            mo47674a(bnhe.m109408a("isVerifyAppsVisible", "true"), themeSettings);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public final void onResume() {
        super.onResume();
        this.f107533b = new apgy(this);
        this.f107542n = System.currentTimeMillis();
        mo58937g();
        mo58935a(false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            mo58937g();
        }
    }

    /* renamed from: h */
    public final Map mo58938h() {
        int i;
        String str;
        PackageInfo packageInfo;
        int i2 = Build.VERSION.SDK_INT;
        List<ResolveInfo> queryIntentActivities = this.f107546r.queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (!(resolveInfo == null || resolveInfo.activityInfo == null || resolveInfo.activityInfo.applicationInfo == null || (str = resolveInfo.activityInfo.packageName) == null || hashSet.contains(str))) {
                try {
                    packageInfo = this.f107546r.getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException e) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    Long valueOf = Long.valueOf(packageInfo.lastUpdateTime);
                    if (!hashMap.containsKey(valueOf)) {
                        hashMap.put(valueOf, new HashMap());
                        arrayList.add(valueOf);
                    }
                    ((Map) hashMap.get(valueOf)).put(str, packageInfo);
                    hashSet.add(str);
                }
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            long longValue = ((Long) arrayList.get(i3)).longValue();
            Long valueOf2 = Long.valueOf(longValue);
            linkedHashMap.put(valueOf2, new ArrayList());
            ArrayList arrayList2 = new ArrayList(((Map) hashMap.get(valueOf2)).keySet());
            Collections.sort(arrayList2);
            int size2 = arrayList2.size();
            int i4 = 0;
            while (true) {
                i = i3 + 1;
                if (i4 >= size2) {
                    break;
                }
                Long valueOf3 = Long.valueOf(longValue);
                ((List) linkedHashMap.get(valueOf3)).add((PackageInfo) ((Map) hashMap.get(valueOf3)).get((String) arrayList2.get(i4)));
                i4++;
            }
            i3 = i;
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static void m92400a(Context context) {
        new apxl(context).start();
    }

    /* renamed from: a */
    private final void m92401a(svm svm) {
        new adzt().post(new apxk(this, svm));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo58934a(long j, List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                if (j != this.f107551x || !list.equals(this.f107552y)) {
                    if (this.f107534c == null) {
                        apww apww = new apww(this, this.f107545q);
                        this.f107534c = apww;
                        apww.mo26086b(1);
                        this.f107534c.mo26085a(getText(C0126R.string.verify_apps_recently_scanned));
                        ((svi) this.f41601g).f45221a.mo26149a((sui) this.f107534c);
                    }
                    this.f107534c.mo26105b(apus.m71060a(this, j));
                    ArrayList arrayList = new ArrayList(list);
                    Collections.shuffle(arrayList, new Random(j));
                    if (this.f107552y != null) {
                        apww apww2 = this.f107534c;
                        apww2.f85035m = true;
                        apww2.f85034l = arrayList;
                        apww2.mo26164i();
                    } else {
                        apww apww3 = this.f107534c;
                        apww3.f85035m = false;
                        apww3.f85034l = arrayList;
                        apww3.mo26164i();
                    }
                    this.f107552y = list;
                    this.f107551x = j;
                    return;
                }
            }
        }
        this.f107534c = null;
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        int i;
        if (!sui.equals(this.f107547t)) {
            if (sui.equals(this.f107538j)) {
                boolean z = ((svm) this.f107538j).f45239a;
                apgy.m70267a(this, !z);
                if (!z) {
                    i = 9;
                } else {
                    i = 10;
                }
                this.f107545q.mo47665a(4, i);
                mo58937g();
                m92401a(this.f107538j);
            }
        } else if (!((svm) this.f107547t).f45239a || this.f107533b.mo47202a(this)) {
            if (!cgkt.f187180a.mo6606a().mo84025aa()) {
                this.f107533b.mo47200a(true ^ ((svm) this.f107547t).f45239a);
                this.f107545q.mo47665a(4, 7);
                mo58937g();
            } else {
                boolean z2 = ((svm) this.f107547t).f45239a;
                this.f107533b.mo47200a(!z2);
                this.f107545q.mo47665a(4, 7);
                mo58937g();
                if (!z2) {
                    this.f107544p = true;
                    mo58935a(true);
                }
            }
            m92401a(this.f107547t);
        } else {
            apxx apxx = new apxx();
            apxx.f85094a = this.f107545q;
            apxx.show(getSupportFragmentManager(), "disable_verify_apps_confirmation_dialog");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        if (!this.f107553z) {
            svf svf = ((svi) sug).f45221a;
            apxy apxy = new apxy(this);
            apum.m71047a(apxy, this, 5, C0126R.string.verify_apps_title);
            this.f107547t = apxy;
            apxy.mo26107d(C0126R.string.verify_apps_summary);
            svf.mo26149a((sui) this.f107547t);
            apxg apxg = new apxg(this);
            apxg.mo26086b(0);
            apxg.mo26106c((int) C0126R.string.play_protect_banner);
            apxg.f85051b = mo47672a((int) C0126R.C0127drawable.play_protect_ic_logo_40dp);
            apxg.mo26164i();
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://support.google.com/googleplay/answer/2812853"));
            if (mo24060b(data)) {
                apxg.mo47681c(getText(C0126R.string.common_learn_more));
                apxg.f85050a = new apxi(this, data);
            }
            svf.mo26149a((sui) apxg);
            apxg apxg2 = new apxg(this);
            apum.m71047a(apxg2, null, 2, C0126R.string.play_protect_disabled_title);
            this.f107536e = apxg2;
            apxg2.mo26107d(C0126R.string.play_protect_disabled_summary);
            this.f107536e.mo26101a(mo47673a((int) C0126R.C0127drawable.play_protect_ic_alert_black_24dp, (int) C0126R.color.material_google_red_500));
            apxg apxg3 = new apxg(this);
            apum.m71047a(apxg3, null, 2, C0126R.string.play_protect_all_clear_title);
            this.f107535d = apxg3;
            apxg3.mo26107d(C0126R.string.play_protect_all_clear_summary);
            this.f107535d.mo26101a(mo47673a((int) C0126R.C0127drawable.play_protect_ic_check_black_24dp, (int) C0126R.color.material_google_green_500));
            if (this.f107539k.f84950a >= 80832200) {
                apxg apxg4 = this.f107535d;
                Drawable a = mo47673a((int) C0126R.C0127drawable.play_protect_ic_rescan_black_24dp, (int) C0126R.color.material_google_green_500);
                apxg4.f85060s = new apxj(this);
                apxg4.f85052c = a;
                apxg4.mo26164i();
            }
            apxg apxg5 = new apxg(this);
            apum.m71047a(apxg5, null, 2, C0126R.string.play_protect_all_clear_title);
            this.f107537f = apxg5;
            apxg5.mo26107d(C0126R.string.play_protect_scan_in_progress_subtitle);
            this.f107537f.mo26101a(mo47673a((int) C0126R.C0127drawable.play_protect_ic_check_black_24dp, (int) C0126R.color.material_google_green_500));
            apxg apxg6 = this.f107537f;
            apxg6.f85059r = true;
            apxg6.mo26164i();
            apxy apxy2 = new apxy(this);
            apum.m71047a(apxy2, this, 6, C0126R.string.upload_apps_title);
            this.f107538j = apxy2;
            apxy2.f85095c = false;
            apxy2.mo26164i();
            svf.mo26149a((sui) this.f107538j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo58935a(boolean z) {
        if (!this.f107543o) {
            this.f107543o = true;
            this.f107532A.execute(new apxm(this, z));
        }
    }
}
